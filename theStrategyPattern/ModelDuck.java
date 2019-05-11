package simuduck.duck;

import simuduck.Duck;
import simuduck.behaviors.flybehaviors.FlyNoWay;
import simuduck.behaviors.quackbehaviors.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}