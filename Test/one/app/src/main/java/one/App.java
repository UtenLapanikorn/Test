/*
 * This source file was generated by the Gradle 'init' task
 */
package one;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number x : ");
        int x = scanner.nextInt();
        System.out.println("Enter Operation (+ - * / % ^) : ");
        char op = scanner.next().charAt(0);
        System.out.println("Enter Number y : ");
        int y = scanner.nextInt();
        scanner.close();
        int ans = 0;

        if (op == '+') {
            ans = x + y;
        } else if (op == '-') {
            ans = x - y;
        } else if (op == '*') {
            ans = x * y;
        } else if (op == '%') {
            ans = x % y;
        } else if (op == '/') {
            ans = x / y;
        }

        System.out.println("Your answer is : " + ans);
    }
}