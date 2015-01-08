package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by simon on 07/01/15.
 */
public class listex {

    public static void main (String[] args)
    {

        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("r");
        list.add("v");
        Object[] ol = list.toArray();
        System.out.println("Array of Object has length " + ol.length);
        String[] sl;
        sl = list.toArray(new String[0]);
        System.out.println("Array of String has length " + sl.length);
    }
}
