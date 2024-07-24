package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (0 to finish):");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }


        if (!numbers.isEmpty()) {
            System.out.print(numbers.get(0));
            for (int i = 1; i < numbers.size() - 1; i++) {
                System.out.print(", " + numbers.get(i));
            }
            if (numbers.size() > 1) {
                System.out.print(", and " + numbers.get(numbers.size() - 1));
            }
            System.out.println(" were the items in the list.");
        }


        int sum = getSum(numbers);
        System.out.println("The sum of that list is:");
        System.out.println(sum);
    }

    public static int getSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

