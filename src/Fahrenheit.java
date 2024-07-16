import java.util.Scanner;

public class Fahrenheit
{
    double degree;

    void getDegree()
    {
        System.out.println("Enter the value to be converted to Fahrenheit:");

        Scanner obj1 = new Scanner(System.in);

        degree = obj1.nextDouble();
    }

    void setDegree()
    {
        double new_degree = (degree * 9 / 5) + 32;

        System.out.println("New value:" + new_degree + " Fahrenheit");
    }
}
