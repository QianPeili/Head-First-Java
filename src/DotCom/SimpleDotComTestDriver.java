package DotCom;

/**
 * Created by qianpeili on 2017/3/18.
 */
public class SimpleDotComTestDriver {

    public static void main(String [] args) {

        int numberOfGuess = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom dot = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        dot.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("enter a number");
            String result = dot.checkYourself(guess);
            numberOfGuess ++;

            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numberOfGuess + " guesses");
            }
        }
    }


}
