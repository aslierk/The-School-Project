package theSchoolPackage;

import java.util.*;

public class TheTeachers {
static Scanner input = new Scanner(System.in);
static Map<String, String> theTeachersMap = new HashMap<>();


    static  public void addTheTeacher() {// bu kismi hata görmememe ragmen calistiramadim!!!


        theTeachersMap.put("2343234566", "Derya , Erkan , 1985 , Physics");
        theTeachersMap.put("1234566788", "Leyla , Ardan , 1980 , Maths");
        theTeachersMap.put("9865432278", "Sevil , Sen , 1990 , Biology");
        theTeachersMap.put("2345667854", "Meral , Kücük , 1970 , Physics");
        theTeachersMap.put("1789364466", "Doruk , Koray , 1983 , Maths");
        theTeachersMap.put("9086425799", "Hakan, Koray, 1985 , Biology");

        System.out.println(theTeachersMap);
   }
       public static void theTeachersMenu () {

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
                       "\t\t\t    Q - EXIT \n" );

               System.out.println("Please enter a choice in the menu.");
               choice = input.nextLine();


               switch (choice){

                   case "1":
                       printTheTeachersList();
                       break;

                   case "2":

                       break;
                   case "3":
                       break;

                   case "a":
                   case "A":
                       DepotM.mainMenu();
                       break;

                   case "Q":
                   case "q":
                       System.out.println("You are quitted from the System.");

                   default:

                       System.out.println("\n\n\n!!!!  Invalid entry  !!!!\n"+ "Please enter a valid option.\n\n\n");

               }


           }while (!choice.equalsIgnoreCase("Q"));

           // System.out.println("");

           DepotM.exit();








       }













    private static void printTheTeachersList() {


         System.out.println("\t\t\t\t\t\t\t The Anatolian College > The Teachers > > The Teachers List \t\t\t\n\n"+
                "Teacher ID        Name           Surname        Date Of Birth      Lesson");

      Set<Map.Entry<String, String>> entrySet = theTeachersMap.entrySet();

        System.out.println(theTeachersMap);
      for (Map.Entry<String,String> each :entrySet
       ){
            String eachKey =  each.getKey();
            String eachValue = each.getValue();

            String[] eachValueArr = eachValue.split(",");

            System.out.printf("%6s %-6 %-8  %4s %-s", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);

  }

    }



}
