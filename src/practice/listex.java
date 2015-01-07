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

        List<String> list = new ArrayList<String>();
        list.add("Blobbo");
        list.add("Cracked");
        list.add("Dumbo");
        Object[] ol = list.toArray();
        System.out.println("Array of Object has length " + ol.length);
        String[] sl;
        sl = list.toArray(new String[0]);
        System.out.println("Array of String has length " + sl.length);
    }
}
