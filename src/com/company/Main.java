package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String message;
        ArrayList names = new ArrayList();
        int counter = -1;

        System.out.println("Enter in the your name.");
        names.add(sc.nextLine());
        System.out.println("Who would you like to text?");
        names.add(sc.nextLine());

        System.out.println("\nType 'EXIT' to stop texting, 'RETRIEVE' to show all messages, 'SWITCH' to text another, or 'DELETE' to delete messages.");

        while(!exit) {
            for(int i = 0; i < names.size(); i++) {
                counter++;
                System.out.print("\n" + names.get(i) + "[" + counter +"]: ");
                message = sc.nextLine();
                System.out.print("\t\t\t\t\t" + LocalDateTime.now());
                System.out.println("\n");
                if(message.equals("EXIT")) {
                    exit = true;
                } else if(message.equals("RETRIEVE")) {
                    MessageList.allMsg();
                } else if(message.equals("SWITCH")) {
                    System.out.println("Who would you like to text?");

                } else if(message.equals("DELETE")) {
                    System.out.println("Type in the message index you would like to delete.");
                    MessageList.msgList.remove(sc.nextInt());
                }
                Message m = new Message(message, names, i);
                MessageList.add(m);
            }

            if(exit)
                break;
        }
    }
}
