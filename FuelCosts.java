import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double mpg = 0;
        double capasity = 0;
        double costPerGallon = 0;
        double cost100 = 0;
        double totalMiles = 0;
        boolean done = false;
        String trash = "";

        do
        {
            IO.print("Enter the miles per gallon : ");

            if(in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine(); // Clear the newline from the buffer

                done = true;
            } else {
                trash = in.nextLine();
                IO.println("You must enter a valid miles per gallon not: " + trash);
            }
        }while (!done);

        done = false;

        do
        {
            IO.print("Enter the capasity: ");

            if(in.hasNextDouble()) {
                capasity = in.nextDouble();
                in.nextLine(); // Clear the newline from the buffer

                done = true;
            } else {
                trash = in.nextLine();
                IO.println("You must enter a valid tank capasity not: " + trash);
            }
        }while (!done);

        done = false;

        do
        {
            IO.print("Enter the cost per gallon: ");

            if(in.hasNextDouble()) {
                costPerGallon = in.nextDouble();
                in.nextLine(); // Clear the newline from the buffer


                done = true;
            } else {
                trash = in.nextLine();
                IO.println("You must enter a valid cost per gallon not: " + trash);
            }
        }while (!done);

        IO.println("the price per gallon is " + costPerGallon);

        cost100 = 100 / mpg + costPerGallon;
        totalMiles = capasity * mpg;

        IO.println("The cost to go 100 miles is " + cost100);
        IO.println("The total miles on a full tank is " + totalMiles);

    }



}
