import Lamda.Lamda;
import Lamda.LamdaReturn;

public class Main {
    public static void main(String args[]) {

        //Die 2 varianten die als schreibweise erlaubt sind!
        Lamda x = () -> { System.out.println("test"); };
        Lamda y = () -> System.out.println("hallo");
        String hello = "hello";


        LamdaReturn xa = (he) -> he;
        LamdaReturn xar = (he) -> { System.out.println(he);
            return hello;
        };
        System.out.println(xar);




    }
}
