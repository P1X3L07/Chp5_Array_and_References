import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int num = input.nextInt();

        double[] elements = new double[num];
        System.out.print("Enter " + num + " elements: ");

        for (int i = 0; i < elements.length; i++)
        {
            elements[i] = input.nextDouble();
        }

        double total = 0;
        double average;
        for (int i = 0; i < elements.length; i++)
        {
            total += elements[i];
        }
        average = total/num;
        System.out.print("The average is " + average);
        System.out.println();

        System.out.print("number of elements greater than average is ");
        for(int i = 0; i < elements.length; i++)
        {
            if (elements[i] > average)
            {
                System.out.print(elements[i] + " ");
            }
        }

    }
}
