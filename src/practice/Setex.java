package practice;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.*;

/**
 * Created by simon on 06/01/15.
 */
public class Setex {

    public static void main(String args) {


        Set<String> hashSet = new HashSet<String>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("One");
        hashSet.add("Three");
        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}