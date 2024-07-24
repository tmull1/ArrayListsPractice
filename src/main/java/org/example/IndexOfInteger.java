package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (0 to finish):");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                System.out.println("Done entering integers into the list.");
                break;
            }
            numbers.add(input);
        }

        System.out.println("What number are you looking for in the list?");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target) {
                System.out.println(target + " is at index " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("The number " + target + " is not in the list.");
        }
    }
}

