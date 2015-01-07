package practice;
import java.util.ArrayList;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by simon on 06/01/15.
 */
public class fresher {

    public static void main(String[] args) {
        String s = "Hello world";

        for (char ch : s.toCharArray()) {
            System.out.println(ch);

        }

        ArrayList<String> data = new ArrayList<String>();
        data.add("hello");
        data.add("goodbye");

        for (String e : data) {
            System.out.println(e);
        }


        Set<String> hashSet = new HashSet<String>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("One");
        hashSet.add("Three");
        for (String v : hashSet)

        {
            System.out.println(v);
        }

    String w = "Father Charles Goes Down And Ends Battle";
    Stack<String> myStack = new Stack<String>();
    StringTokenizer st = new StringTokenizer(w);

    while (st.hasMoreTokens())
    {
        myStack.push(st.nextToken());
    }

    System.out.print('"' + w + '"' + " backwards by word is:\n");
    while (!myStack.empty()) {
        System.out.print(myStack.pop());
        System.out.print(' ');
    }
    System.out.println('"');
}
}

