package DotCom;

import java.util.ArrayList;

/**
 * Created by qianpeili on 2017/3/18.
 */
public class SimpleDotComTestDriver {

    public static void main(String [] args) {

        int numberOfGuess = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom dot = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);
        ArrayList<String> locations = new ArrayList<>();
        for (int i=0; i<3; i++) {
            String cell = Integer.toString(randomNum + i);
            locations.add(cell);
        }
        dot.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("enter a number");
            String result = dot.checkYourself(guess);
            numberOfGuess ++;
            System.out.println(result);
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numberOfGuess + " guesses");
            }
        }
    }


}
