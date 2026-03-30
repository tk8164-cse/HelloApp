package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * @author Developer Name
 * @version 5.0
 * @since UC1
 */

public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;
        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }
        String finalGreeting = "Hello, " + nameBuilder.toString() + "!";
        System.out.println(finalGreeting);
    }
}