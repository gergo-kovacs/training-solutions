package meetingrooms;

import java.util.Scanner;

public class Controller {
    Office theOffice;

    public void readOffice(Scanner scanner){

     theOffice = new Office();

        System.out.println("hány darab tárgyalót szeretne rögzíteni?");
        int sizeOfRoomList = scanner.nextInt();
        scanner.nextLine();
        String name;
        int width;
        int length;
        for (int i = 0; i < sizeOfRoomList; i++) {
            System.out.println("Kérem a  tárgyaló nevét!");
            name = scanner.nextLine();
            System.out.println("Kérem a tárgyaló szélességét méterben!");
            width = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérem a tárgyaló hosszúságát méterben!");
            length = scanner.nextInt();
            scanner.nextLine();
            theOffice.addMeetingRoom(new MeetingRoom(name,length,width));
        }
    }

    public void printMenu(){
        System.out.println("1. Tárgyalók sorrendben");
        System.out.println("2. Tárgyalók visszafele sorrendben");
        System.out.println("3. Minden második tárgyaló");
        System.out.println("4. Területek");
        System.out.println("5. Keresés pontos név alapján");
        System.out.println("6. Keresés névtöredék alapján");
        System.out.println("7. Keresés terület alapján");

    }

    public void runMenu(Scanner scanner){

        System.out.println("Válasszon egy számot!");
        int chosen;
        chosen= scanner.nextInt();
        scanner.nextLine();

        if(chosen==1){
            theOffice.printNames();
        }else if(chosen==2){
            theOffice.printNamesReverse();
        }else if(chosen==3){
            theOffice.EventNames();
        }else if(chosen==4){
            theOffice.Areas();
        }else if(chosen==5){
            System.out.println("Keresett név?");
            theOffice.MeetingRoomsWithName(scanner.nextLine());
        }else if(chosen==6){
            System.out.println("iroda nevének egy részlete:");
            theOffice.MeetingRoomsContains(scanner.nextLine());
        }else{
            System.out.println("iroda minimum mérete:");
            int i = scanner.nextInt();
            scanner.nextLine();
            theOffice.printAreasLargerThan(i);
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Controller controller = new Controller();
        controller.readOffice(scanner);
        controller.printMenu();
        controller.runMenu(scanner);
        scanner.close();
    }
}
