package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {

    public void insertIntoActivity(DataSource dataSource,Activity activity) {
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("insert into activities (start_time,activity_desc,activity_type) values (?,?,?)")) {
            preparedStatement.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            preparedStatement.setString(2, activity.getDesc());
            preparedStatement.setString(3, activity.getType().toString());
            preparedStatement.executeUpdate();
        } catch (SQLException sql) {
            throw new IllegalStateException("Cannot insert");
        }
    }

    public Activity queryById( DataSource dataSource, long id){
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("select * from activities where id = (?)")) {
                preparedStatement.setLong(1,id);
                return selectActivityByPreparedStatement(preparedStatement);
        } catch (SQLException sql) {
            throw new IllegalStateException("Cannot insert");
        }

    }

    private Activity selectActivityByPreparedStatement(PreparedStatement preparedStatement){
        try(ResultSet rs = preparedStatement.executeQuery()){
            if(rs.next()){
                Activity activity = new Activity(rs.getLong("id"),
                        rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("activity_desc"),
                        Type.valueOf(rs.getString("activity_type")));
                return activity;
            }
            throw new IllegalArgumentException("Not fount");
        }catch (SQLException sql){
            throw new IllegalArgumentException("Execute faild");
        }
    }

    public List<Activity> allActivites(DataSource dataSource){
        List<Activity> activityList= new ArrayList<>();
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("select * from activities")) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()){
                    activityList.add(new Activity(resultSet.getLong("id"),
                            resultSet.getTimestamp("start_time").toLocalDateTime(),
                            resultSet.getString("activity_desc"),
                            Type.valueOf(resultSet.getString("activity_type"))));
                }

        } catch (SQLException sql) {
            throw new IllegalStateException("Cannot insert");
        }

        return activityList;
    }

    public static void main(String[] args) {
        MariaDbDataSource mariaDbDataSource;

        try{
            mariaDbDataSource = new MariaDbDataSource();
            mariaDbDataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker");
            mariaDbDataSource.setUser("activitytracker");
            mariaDbDataSource.setPassword("activitytracker");
        }catch (SQLException sql){
            throw new IllegalStateException("Cannot conect");
        }

        Flyway flyway = Flyway.configure().dataSource(mariaDbDataSource).load();
        flyway.clean();
        flyway.migrate();

        Activity activity1 = new Activity(LocalDateTime.of(2020,02,10,10,1),"Biking in Vertes", Type.BIKING);
        Activity activity2 = new Activity(LocalDateTime.of(2020,03,12,12,10),"Running in the city", Type.RUNNING);
        Activity activity3 = new Activity(LocalDateTime.of(2020,03,3,4,11),"Hiking in Vertes", Type.HIKING);

        ActivityTrackerMain activityTrackerMain = new ActivityTrackerMain();
        activityTrackerMain.insertIntoActivity(mariaDbDataSource,activity1);
        activityTrackerMain.insertIntoActivity(mariaDbDataSource,activity2);
        activityTrackerMain.insertIntoActivity(mariaDbDataSource,activity3);

        System.out.println(activityTrackerMain.queryById(mariaDbDataSource,1));
        System.out.println(activityTrackerMain.allActivites(mariaDbDataSource));

    }
}
