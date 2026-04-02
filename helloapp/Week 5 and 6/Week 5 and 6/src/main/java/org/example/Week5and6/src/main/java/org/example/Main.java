package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] studentAges = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the ages of 10 students:");
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Age for student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();
        }
        System.out.println("\n--- Voting Eligibility Results ---");
        for (int i = 0; i < studentAges.length; i++) {
            int currentAge = studentAges[i];
            if (currentAge < 0) {
                System.out.println("Invalid age: " + currentAge);
            } else if (currentAge >= 18) {
                System.out.println("The student with the age " + currentAge + " can vote.");
            } else {
                System.out.println("The student with the age " + currentAge + " cannot vote.");
            }
        }
        input.close();
    }
}
