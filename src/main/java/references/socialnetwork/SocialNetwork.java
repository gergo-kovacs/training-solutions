package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
    List<Member> members = new ArrayList<>();

    public void addMember(String name){
            members.add(new Member(name));
    }

    public void connect(String name, String otherName){

       findByName(name).connectMember(findByName(otherName));

    }

    private Member findByName(String theName){

        for (Member i:members) {
            if(i.getName().equals(theName)){
                return i;
            }
        }
        return null;
    }

    public List<String> bidirectionalConnections(){
    List<String> bdConnectList = new ArrayList<>();

        for (int i = 0; i < members.size(); i++) {
            for (int j = 0; j <= members.get(i).getConnections().size(); j++) {
                if(members.get(i).getConnections().contains(members.get(j))){
                    bdConnectList.add(members.get(i).getName()+" - "+members.get(j).getName());
                }
            }
        }

        return bdConnectList;
    }


}
