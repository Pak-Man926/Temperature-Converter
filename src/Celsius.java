import java.util.Scanner;

public class Celsius
{
    double degree;

    void getDegree()
    {
        System.out.println("Enter the value to be converted to Celsius: ");

        Scanner obj = new Scanner(System.in);

        degree = obj.nextDouble();
    }

    void setDegree()
    {
        double new_degree = (degree - 32) /9 * 5;

        System.out.println("New value :" + new_degree + " Celsius");

    }

}
