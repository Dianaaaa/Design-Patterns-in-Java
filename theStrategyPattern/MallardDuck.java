package simuduck.duck;

import simuduck.Duck;
import simuduck.behaviors.flybehaviors.FlyWithWings;
import simuduck.behaviors.quackbehaviors.Quack;
import simuduck.behaviors.flybehaviors.FlyWithWings;

public class MallardDuck extends Duck {
    public MallardDuck () {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}