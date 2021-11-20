package by.it.academy.java.enterprise.seledtsova;

public class StringSize {
    StringRandomizer stringRandomizer = new StringRandomizer();

    public int size() {
        return stringRandomizer.randomString().length();
    }
}
