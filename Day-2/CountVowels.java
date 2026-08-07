// Input:

// Programming

// Output:

// Vowels = 3

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
    }
}
