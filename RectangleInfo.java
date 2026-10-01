import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double area = 0;
        double width = 0;
        double height = 0;
        boolean done = false;
        double perimiter = 2 * width * 2 * height;
        double hypotenuse = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
        String trash = "";

        do
        {
            IO.print("Enter the width of the regtangle: ");

            if(in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine(); // Clear the newline from the buffer

                done = true;
            } else {
                trash = in.nextLine();
                IO.println("You must enter a valid number: " + trash);
            }
        }while (!done);

        done = false;

        do
        {
            IO.print("Enter the height of the regtangle: ");

            if(in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine(); // Clear the newline from the buffer

                done = true;
            } else {
                trash = in.nextLine();
                IO.println("You must enter a valid number: " + trash);
            }
        }while (!done);

        area = width * height;
        perimiter = 2 * width * 2 * height;
        hypotenuse = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));

        IO.println("The area is " + area);
        IO.println("The perimiter is " + perimiter);
        IO.println("The hypothenuse is " + perimiter);

    }

}
