package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Message {

    public String message;
    public String name;
    public LocalDateTime time;

    public Message(String m, ArrayList names, int i) {
        message = m;
        name = (String)names.get(i);
        time = LocalDateTime.now();
    }
}
