import java.util.Scanner;
import java.util.Arrays;
public class Question4 {
    public static void main(String[] args) {

        double[] elements = {1, 9, 4.5, 6.6, 5.7, -4.5};

        Scanner input = new Scanner(System.in);
        System.out.println("Before sorting :");

        for (int i = 0; i < elements.length; i++)
        {
            System.out.print(elements[i] + " ");
        }
        System.out.println();

        System.out.println("After sorting");
        Arrays.sort(elements);
        for(int i = 0; i < elements.length; i++)
        {
            System.out.print(elements[i] + " ");
        }
    }
}
