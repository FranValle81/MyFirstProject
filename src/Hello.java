import java.util.Scanner;

public class Hello {

    private  static Scanner input= new Scanner(System.in);

    public static void  main(String[]args){

        String id;
        String name;
        System.out.println();

        id = requireString("Enter ID:");
        name = requireString("Enter name: ");

        System.out.println("Your ID is: " + id +
                " and your name is: " + name);
        System.out.println();

    }

    //Method to request data of type String
    private static String requireString(String message) {

        String data;

        do {

            System.out.print(message);
            data = input.nextLine();
            if (data.isEmpty())
                System.out.println("Invalid input."
                        + "The field cannot be empty");

        } while (data.isEmpty());

        return data;
    }
}
