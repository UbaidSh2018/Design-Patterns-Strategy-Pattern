package Behaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Doesn't Quack or Squeak");
    }
}
