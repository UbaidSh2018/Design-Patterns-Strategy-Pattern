package Ducks;

import Behaviour.FlyNoWay;
import Behaviour.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Model Duck");
    }
}
