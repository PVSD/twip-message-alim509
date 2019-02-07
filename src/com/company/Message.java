package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Message {

    public String message;
    public String name;
    public LocalDateTime time;

    public Message(String m, ArrayList names, int j) {
        message = m;
        name = (String)names.get(j);
        time = LocalDateTime.now();
    }

}
