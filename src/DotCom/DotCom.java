package DotCom;

import java.util.*;

/**
 * Created by qianpeili on 2017/3/18.
 */
public class DotCom {
    private String name;
    private ArrayList<String> locationCells;

    public void setName(String value) {
        name = value;
    }
    public void setLocationCells(ArrayList<String> location) {
        locationCells = location;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk "+name + " : (");
            } else {
                result = "hit";
            }
        }
        return result;

    }
}
