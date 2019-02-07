package com.company;

import java.util.ArrayList;

public class MessageList {

    public static ArrayList msgList = new ArrayList();

    public static void add(Message message) {
        msgList.add(message);
    }
}
