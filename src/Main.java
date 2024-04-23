import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double[] elements = new double[5];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 elements: ");

        for (int i = 0; i < elements.length; i++)
        {
            elements[i] = input.nextDouble();
        }

        System.out.print("Entered 5 elements are: ");
        System.out.println();

        for(int i = 0; i < elements.length; i++)
        {
            System.out.print((i + 1) + "th element: " + elements[i]);
            System.out.println();
        }
        input.close();

    }
}
