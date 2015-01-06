package practice;
import java.util.ArrayList;
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
        for(String e:data)
            System.out.println(e);
    }
}