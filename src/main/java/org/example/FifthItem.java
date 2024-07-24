package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings (empty string to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            items.add(input);
        }

        if (items.size() >= 5) {
            System.out.println("The fifth item in the list is: " + items.get(4));
        } else {
            System.out.println("There were less than five items entered.");
        }
    }
}

