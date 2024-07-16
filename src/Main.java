import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("============================================================");
        System.out.println("============================================================");

        System.out.println("Welcome To Optimum Temperature Converter\t");

        System.out.println("============================================================");

        System.out.println("Choose one of the options:");

        System.out.println("1. Convert Temperature to Celsius");
        System.out.println("2. Convert Temperature to Fahrenheit");
        System.out.println("3. Exit");

        System.out.println("============================================================");
        System.out.println("============================================================");

        int choice;

        Scanner obj2 = new Scanner(System.in);

        choice = obj2.nextInt();

        if (choice == 1)
        {
            Celsius temp1 = new Celsius();

            temp1.getDegree();

            temp1.setDegree();

            System.out.println("============================================================");

            System.out.println("Thank you for using our services. Goodbye !");

            System.out.println("============================================================");
        }


        else if (choice == 2)
        {
            Fahrenheit temp2 = new Fahrenheit();

            temp2.getDegree();

            temp2.setDegree();

            System.out.println("============================================================");

            System.out.println("Thank you for using our services. Goodbye !");

            System.out.println("============================================================");
        }
        else if (choice == 3)
        {
            System.exit(0);
        }
        else
        {
            System.out.println("Input value not valid !");
        }
    }
}