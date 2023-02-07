import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test {
    public static void main(String[] args) {
        Card c = new Card();
        c.display();

        Card.Companion.show();
        Card.testing();

        /*
        Card class is defined in Pseudocodes5kt
        Output:
        ------
        Hello world!
        Show here!
        Testing JvmStatic here!!!
        */
    }
}