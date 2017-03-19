package DotCom;

import java.util.ArrayList;

/**
 * Created by qianpeili on 2017/3/18.
 */
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuess = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sin three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses.");

        for (DotCom dotCom: dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotCom.setLocationCells(newLocation);
        }
    }

    private void checkUserGuess(String userGuess) {
        numOfGuess++;
        String result = "miss";

        for (DotCom dotComToSet: dotComsList) {
            result = dotComToSet.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotComToSet);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuess <= 18) {
            System.out.println("It only took you " + numOfGuess + " guesses.");
            System.out.println("You got out before your options sank.");
        }else {
            System.out.println("Took you long enough. "+ numOfGuess + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    private void startPlaying(){
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess: ");
            checkUserGuess(userGuess);

        }
        finishGame();
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

}
