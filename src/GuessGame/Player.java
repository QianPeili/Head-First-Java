package GuessGame;

/**
 * Created by qianpeili on 2017/3/13.
 */
public class Player {
    int number = 0;
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
