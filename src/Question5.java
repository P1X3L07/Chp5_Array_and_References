import java.util.Random;
public class Question5 {
    public static void main(String[] args) {

        System.out.println("The lowercase letters are : ");

        char[] letters = generateRandomLowercaseLetters(101);
        for (int i = 1; i < letters.length; i++)
        {
            if(i%20 == 0)
            {
                System.out.println(letters[i] + " ");
            }
            else
            {
                System.out.print(letters[i] + " ");
            }
        }
        System.out.println();
        int[] counts = new int[26];

        System.out.println("The occurrences of each letter are : ");
        for (char letter : letters)
        {
            if (letter >= 'a' && letter <= 'z')
            {
                counts[letter - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++)
        {
            char letter = (char) ('a' + i);
            System.out.println(letter + ": " + counts[i]);
        }
    }

    private static char[] generateRandomLowercaseLetters(int length) {
        char[] letters = new char[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            letters[i] = (char) (random.nextInt(26) + 'a'); // Generate random letter ('a' to 'z')
        }
        return letters;
    }
}
