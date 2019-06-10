import Behaviour.FlyRocketPowered;
import Ducks.Duck;
import Ducks.MallardDuck;
import Ducks.ModelDuck;

public class DuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.display();
        /*
          The first call to performFly() delegates to the flyBehavior object set in the ModelDuck’s constructor,
          which is a FlyNoWay instance.
         */
        modelDuck.performFly();

        /*
          To change a duck’s behavior at runtime, just call the duck’s setter method for that behavior.
          This invokes the model’s inherited behavior setter method, and...voila! The model suddenly has rocket-powered flying capability!
          The model duck dynamically changed its flying behavior! You can’t do THAT if the implementation lives inside the
          duck class.
         */
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();

    }
}
