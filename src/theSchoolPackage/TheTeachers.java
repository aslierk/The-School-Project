package theSchoolPackage;

import java.io.PrintStream;
import java.util.*;

import static java.lang.Thread.*;

public class TheTeachers {
    static Scanner input = new Scanner(System.in);
    static Map<String, String> theTeachersMap = new HashMap<String, String>();


    static public void addTheTeacher() {// bu kismi hata görmememe ragmen calistiramadim!!!


        theTeachersMap.put("2343234566", "Derya,Erkan,1985,Physics");
        theTeachersMap.put("1234566788", "Leyla,Ardan,1980,Maths");
        theTeachersMap.put("9865432278", "Sevil,Sen,1989,Biology");
        theTeachersMap.put("2345667854", "Meral,Kücük,1970,Physics");
        theTeachersMap.put("1789364466", "Doruk,Koray,1983,Maths");
        theTeachersMap.put("9086425799", "Hakan,Koray,1985,Biology");


    }


    public static void theTeachersMenu() throws InterruptedException {
        String choice;


        do {

            System.out.println("\t\t\t\t\t\t\t The Anatolian College >  The Teachers \t\t\t\n" +
                    "\n" +
                    "\t    1 - Print the list of the teachers \t\t\t" +
                    "\t    2 - Find a teacher by last name\n" +
                    "\t    3 - Find a teacher by the lesson\t\t\t  " +
                    "\t    4 - Enter a new teacher information into the system\n" +
                    "\t    5 - De-register with ID number\n\n" +
                    "\t    A - MAINMENU\t\t\t\t\t" +
                    "\t\t\t    Q - EXIT \n");

            System.out.println("Please enter a choice in the menu.");
            choice = input.nextLine();


            switch (choice) {

                case "1":
                    printTheTeachersList();
                    break;

                case "2":
                    findFromTheLastname();
//                    findingTeacherUsingSurname();
                    break;
                case "3":
                    findFromTheLessonName();
                    break;

                case "a":
                case "A":
                    DepotM.mainMenu();
                    break;

                case "Q":
                case "q":
                    System.out.println("You are quitted from the System.");

                default:

                    System.out.println("\n\n\n!!!!  Invalid entry  !!!!\n" + "Please enter a valid option.\n\n\n");

            }


        } while (!choice.equalsIgnoreCase("Q"));

        DepotM.exit();

        System.out.println("System exited");
    }

    private static void findFromTheLessonName() { //Bu metodlar input aliyor ama istenilen bilgileri vermiyor!

        System.out.println("Please enter the Lesson name. ");
        String wantedLesson = input.nextLine();

        Set<Map.Entry<String, String>> entrySet = theTeachersMap.entrySet();

        System.out.println("\t\t\t\t\t\t\t THE ANATOLIAN COLLEGE  > The Teachers > >  \t\t\t\n\n" +
                "Teacher ID   Name   Surname  Birth-year  Lesson");

        System.out.println();

        entrySet.forEach(each -> {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(",");
            if (eachValueArr[3].equalsIgnoreCase(wantedLesson)) {

                System.out.printf("%-12s %-6s  %-6s  %-10s  %-4s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);

            }
        });
    }

    public static void findFromTheLastname() throws InterruptedException {

        System.out.println("Please enter the last name of the teacher you are looking for. ");
        String wantedSurname = input.nextLine();

        Set<Map.Entry<String, String>> entrySet = theTeachersMap.entrySet();

        System.out.println("\t\t\t\t\t\t\t THE ANATOLIAN COLLEGE  > The Teachers > > The Teachers List \t\t\t\n\n" +
                "Teacher ID   Name   Surname  Birth-year  Lesson");

        System.out.println();

        for (Map.Entry<String, String> each : entrySet   //Burada nerede yanlis yaptigimi anlamadim!!!
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(",");

            if (eachValueArr[1].equalsIgnoreCase(wantedSurname)) {

                System.out.printf("%-12s %-6s  %-6s  %-10s  %-4s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);

            }
        }

    }

    public static void printTheTeachersList() throws InterruptedException {

        Set<Map.Entry<String, String>> entrySet1 = theTeachersMap.entrySet();


        System.out.println("\t\t\t\t\t\t\t THE ANATOLIAN COLLEGE  > The Teachers > > The Teachers List \t\t\t\n\n" +
                "Teacher ID   Name   Surname  Birth-year  Lesson");
        for (Map.Entry<String, String> each : entrySet1   //Burada nerede yanlis yaptigimi anlamadim!!!
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(", ");


            System.out.printf("%-12s %-6s  %-6s  %-10s  %-4s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);


        }
    }


}



