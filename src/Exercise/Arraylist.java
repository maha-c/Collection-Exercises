package Exercise;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        //add colors to the list
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Pink");

        //print the list
        System.out.println("Colors in the list are:");
        for (String colorList : colors) {
            System.out.println(colorList);

        }

    }

}
