/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String noun = myApp.nounInput();
        String verb = myApp.verbInput();
        String adjective = myApp.adjectiveInput();
        String adverb = myApp.adverbInput();

        String output = myApp.buildOutput(noun, verb, adjective, adverb);
        myApp.madLibOutput(output);
    }

    public String nounInput() {
        System.out.print("Enter a noun: ");
        return input.nextLine();
    }

    public String verbInput() {
        System.out.print("Enter a verb: ");
        return input.nextLine();
    }

    public String adjectiveInput() {
        System.out.print("Enter an adjective: ");
        return input.nextLine();
    }

    public String adverbInput() {
        System.out.print("Enter an adverb: ");
        return input.nextLine();
    }

    public String buildOutput(String noun, String verb, String adjective, String adverb) {
        return "Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!";
    }

    public void madLibOutput(String output) {
        System.out.println(output);
    }
}
