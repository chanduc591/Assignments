package basics.assignments;

import java.util.Scanner;

public class Assignment13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int input = sc.nextInt();

        boolean isPrime = true;

        if (input <= 1) {
            isPrime = false;
            
        } else {
            for (int i = 2; i <= input / 2; i++) {
                if (input % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(input + " is a prime number.");
        } else {
            System.out.println(input + " is not a prime number.");
        }

        sc.close();
    }
}
