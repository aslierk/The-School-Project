package theSchoolPackage;

import java.util.Scanner;

public class DepotM {

    static Scanner input =new Scanner(System.in);

    public static void mainMenu() throws InterruptedException {

    String choise;

        do {


        System.out.println("============ THE ANATOLIAN COLLEGE =============\n "+
                "================ MAIN MENU ================\n"+
                "\t 1-  View the School Information\n" +
                "\t 2-  The Menu for Teachers\n"+
                "\t 3-  The Menu for Students\n"  +
                "\t Q-  EXIT\n " );


        System.out.println("Please enter a choice in the menu.");

        choise = input.nextLine();


            switch (choise) {
                case "1":
                 printTheInfosOfTheSchool();
                    break;

                case "2":
                TheTeachers.theTeachersMenu();

                    break;
                case "3":
                    break;
                case "q":
                case "Q":
                    System.out.println( "You are quitted from the System");
                    break;

                default:
        System.out.println("\n\n\n!!!!  Invalid entry  !!!!\n"+ "Please enter a valid option.\n\n\n");

}
}while( !(choise.equalsIgnoreCase("q")) );

DepotM.exit();







    }

    private static void printTheInfosOfTheSchool() throws InterruptedException {
        System.out.println("============ THE ANATOLIAN COLLEGE =============\n "+
                "\t\t Adress  : " + AboutTheAnatolianCollege.adressOfTheSchool +
                "\n\t\t Telefon  : " + AboutTheAnatolianCollege.telefonnumberOfTheSchool);
        System.out.println();

Thread.sleep(5000);

    }

    public static void exit() {

        System.out.println("See you soon!");
        System.exit(0);

    }
}


