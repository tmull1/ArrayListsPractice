package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
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

        if (!items.isEmpty()) {
            System.out.println("The last item is: " + items.get(items.size() - 1));
        } else {
            System.out.println("No items were entered.");
        }
    }
}

