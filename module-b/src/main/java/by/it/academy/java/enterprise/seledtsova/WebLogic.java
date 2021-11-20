package by.it.academy.java.enterprise.seledtsova;

public class WebLogic {

    private StringRandomizer stringRandomizer = new StringRandomizer();

    public String someLogic() {
        return stringRandomizer.randomString();
    }
}
