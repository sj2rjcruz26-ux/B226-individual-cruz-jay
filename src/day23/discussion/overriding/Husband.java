package day23.discussion.overriding;

public class Husband extends Person {

    @Override
    public void role() {
        System.out.println("I am a Husband. I give my "
                + "wife all of my attention.");
    }
}
