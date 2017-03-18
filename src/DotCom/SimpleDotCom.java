package DotCom;

import java.util.ArrayList;

/**
 * Created by qianpeili on 2017/3/18.
 */
public class SimpleDotCom {

    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locations){
        locationCells = locations;
    }

    public String checkYourself(String stringGuess){
        String result = "miss";

        int index = locationCells.indexOf(stringGuess);
        if (index >=0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            }else result = "hit";
        }
        return result;
    }



}
