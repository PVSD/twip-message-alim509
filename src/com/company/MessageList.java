package com.company;

import java.util.ArrayList;

public class MessageList {

    public static ArrayList<Message> msgList = new ArrayList();

    public static void add(Message message) {
        msgList.add(message);
    }

    public static void allMsg() {
        for(int j = 0; j < msgList.size(); j++) {
            Message m = msgList.get(j);
            System.out.print(m.name + ": ");
            System.out.print(m.message);
            System.out.println("\t\t\t\t\t" + m.time);
        }
    }
}
