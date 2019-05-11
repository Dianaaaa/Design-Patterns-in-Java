package simuduck.behaviors.quackbehaviors;

import simuduck.behaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silent>>");
    }
}