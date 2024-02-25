import Method.Displaymethod;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void showPersonInfo(List<Person> personList) {
        Table table = new Table(4, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);

        table.addCell("Person Name", cellStyle);
        table.addCell("Person Age", cellStyle);
        table.addCell("Person Gender", cellStyle);
        table.addCell("Person Address", cellStyle);

        for (Person person : personList) {
            table.addCell(person.getName(), cellStyle);
            table.addCell(String.valueOf(person.getAge()), cellStyle);
            table.addCell(person.getGender(), cellStyle);
            table.addCell(person.getAddress(), cellStyle);
        }

        System.out.println(table.render());
    }
    static List<Person> readPersonListFromfile() {
        try (ObjectInputStream objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("persondata.txt")));){

            // if (objectIn.readObject() instanceof Person) {
            // System.out.println(" This object is a Person type !");
            // // Person personReadFromFile = (Person) objectIn.readObject();
            // // personReadFromFile.showPersonInfo();
            // }

            List<Person> allPersonData = new ArrayList<>();
            Object object = objectIn.readObject();
            if (object instanceof List) {
                List list = (List) object;
                for (Object obj : list) {
                    if (obj instanceof Person) {
                        allPersonData.add((Person) obj);
                    }
                }
            }
            return allPersonData;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        // show speed start
        Displaymethod.displayBanner();


        List<Person> personList = new ArrayList<>() {
            {   add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("James Bond ", "male", "London", 40));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("Ethan Hunt", "male", "Washington", 35));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));
                add(new Person("kevein hound","eamil","pp",12));

            }
        };
        long startTime = System.currentTimeMillis();
        // // write object to file
//         try {
//
//         ObjectOutputStream objectOut = new ObjectOutputStream(
//         new FileOutputStream("persondata.txt",true));
//
//         objectOut.writeObject(personList);
//         System.out.println("The Object was successfully written to a file");
//
//         objectOut.close();
//         } catch (IOException e) {
//         e.printStackTrace();
//         }

        // menu play
        Displaymethod.displayMainMenu();

        System.out.println("Enter your Option : ");
        String option = new Scanner(System.in).nextLine();
        try{
            if (option.equalsIgnoreCase("l")) {
                System.out.println("You choose display Option!!");
            } else {

                throw new IllegalStateException("Unexpected value: " + option.equalsIgnoreCase(option));
            }
        }catch (Exception e){
            System.out.println("Wrong Character "+e.getMessage());
        }

        Displaymethod.loadData();
        // read data from files
        // checking

         // read data form file
//        List<Person> personFromFile = readPersonListFromfile();
//        assert personFromFile != null;
//        for (Person person : personFromFile) {
////            System.out.println(personFromFile);
////            showPersonInfo(personFromFile);
//            System.out.println("----------------------------------");
//        }

        // read data normal
        try (BufferedReader br = new BufferedReader(new FileReader("persondata.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


//        // show speed data
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println(duration+" ms ");
        System.out.println((duration / 1000) + " s ");

    }
}