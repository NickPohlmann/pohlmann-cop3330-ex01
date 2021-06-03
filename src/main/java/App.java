/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Pohlmann
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String name = myApp.readName();
        String outputString = myApp.generateOutputString(name);
        myApp.printOutput(outputString);
    }

    private void printOutput(String outputString) {
        System.out.println(outputString);
    }

    private String readName() {
        System.out.print("What is your name? ");
        String name = in.nextLine();
        return name;
    }

    private String generateOutputString(String name) {
        return "Hello, " + name + ", nice to meet you!";
    }
}
