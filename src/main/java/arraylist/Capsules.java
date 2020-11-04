package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> colors = new ArrayList();

    public void addLast(String colorOfCapsule) {
        colors.add(colorOfCapsule);
    }

    public void addFirst(String colorOfCapsule) {
        colors.add(0,colorOfCapsule);
    }

    public void removeFirst(){
        colors.remove(0);
    }

    public void removeLast(){
        colors.remove(colors.size()-1);
    }

    public List<String> getColors(){
        return colors;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addFirst("red");
        System.out.println(capsules.getColors());
        System.out.println(capsules.colors);
        System.out.println(capsules.getColors().get(0));
        capsules.getColors().set(0,"blue");
        System.out.println(capsules.getColors());
        capsules.addLast("green");
        System.out.println(capsules.getColors());
        capsules.addLast("gray");
        capsules.addFirst("black");
        System.out.println(capsules.getColors());
        capsules.removeLast();
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        System.out.println(capsules.getColors());
    }
}



