package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner texter = new Scanner(System.in);
        boolean exit = false;
        String message;
        ArrayList names = new ArrayList();
        int counter = 0;
        int j;

        System.out.println("Enter in the names of the people in the chat. Type 'EXIT' to finish.");
        while(!names.contains("EXIT")) {
            names.add(sc.nextLine());
            counter++;
        }
        names.remove(counter-1);

        System.out.println("Be sure to enter in your corresponding number before typing.");
        for(int i = 1; i <= names.size(); i++)
            System.out.println("\n" + i + " - " + names.get(i-1));
        System.out.println("\n");

        while(!exit) {
            counter = texter.nextInt();
            for(j = 0; j <= names.size(); j++) {
                if(counter - 1 == j) {
                    System.out.print("\n" + names.get(j) + ": ");
                }
            }
            message = sc.nextLine();
            System.out.println("\n");
            //Message m = new Message(message, names, j);
            //MessageList.add(m);
        }

    }
}
