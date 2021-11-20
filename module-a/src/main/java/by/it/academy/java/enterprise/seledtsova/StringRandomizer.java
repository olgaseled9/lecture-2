package by.it.academy.java.enterprise.seledtsova;

import java.util.UUID;

public class StringRandomizer {

    public String randomString() {
        return UUID.randomUUID().toString();
    }
}
