package week08d01;

public class Robot {


    public int[] move(String move){
        if(!check(move)){
            throw new IllegalArgumentException("wrong character!");
        }

        int x=0;
        int y=0;

        for (int i = 0; i < move.length(); i++) {
            if(move.charAt(i)=='F'){
                y++;
            }
            if(move.charAt(i)=='L'){
                y--;
            }
            if(move.charAt(i)=='B'){
                x--;
            }
            if(move.charAt(i)=='J'){
                x++;
            }
        }
        int[] result = {x,y};
        return result;
    }

    private boolean check(String text){
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)!='F' && text.charAt(i)!='L' && text.charAt(i)!='B' && text.charAt(i)!='J'){
                return false;
            }
        }
        return true;
    }

}
