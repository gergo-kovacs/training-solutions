package intromethods;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<Todo> listOfTodo = new ArrayList<>();

    public void addTodo(String caption){
        listOfTodo.add(new Todo(caption));
    }

    public void finishTodos(String caption){
        for (Todo i:listOfTodo) {
            if(i.getCaption().equals(caption)){
                i.finish();
            }
        }
    }

    public void finishAllTodos(List<String> todosToFinish){
        for (int i = 0; i < listOfTodo.size(); i++) {
            for (int j = 0; j < todosToFinish.size(); j++) {
                if(listOfTodo.get(i).getCaption().equals(todosToFinish.get(j))){
                    listOfTodo.get(i).finish();
                }
            }
        }
    }

    public List<String> todosToFinish(){
        List<String> finishedTodoNames= new ArrayList<>();
        for (Todo i:listOfTodo) {
            if(i.isFinished()){
                finishedTodoNames.add(i.getCaption());
            }
        }
        return finishedTodoNames;
    }

    public int numberOfFinishedTodos(){
        return todosToFinish().size();
    }

    @Override
    public String toString() {
        return "\nTodoList: \n" + listOfTodo;
    }
}
