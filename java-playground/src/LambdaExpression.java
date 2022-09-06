@FunctionalInterface
interface Sayable{
    public void say(String msg);
}

public class LambdaExpression {
    public static void main(String args[])
    {
        Sayable obj=(msg) -> { System.out.println(msg);};
          obj.say("Hello");

        }
    }

