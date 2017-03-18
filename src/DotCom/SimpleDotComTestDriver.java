package DotCom;

/**
 * Created by qianpeili on 2017/3/18.
 */
public class SimpleDotComTestDriver {

    public static void main(String [] args) {

        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2, 3, 4};

        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult  = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);

    }

}
