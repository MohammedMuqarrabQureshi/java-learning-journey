// Input:

// hello

// Output:

// h = 1
// e = 1
// l = 2
// o = 1

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int[] count = new int[256]; // Assuming ASCII characters
        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i)]++;

        }
        System.out.println("Character counts:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + " = " + count[i]);
            }
        }
        sc.close();
    }
}
