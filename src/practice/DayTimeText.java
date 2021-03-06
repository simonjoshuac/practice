package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by simon on 08/01/15.
 */
public class DayTimeText {

        public static final short TIME_PORT = 11;

        public static void main(String[] argv) {
            String hostName;
            if (argv.length == 0)
                hostName = "localhost";
            else
                hostName = argv[0];

            try {
                Socket sock = new Socket(hostName, TIME_PORT);
                BufferedReader is = new BufferedReader(new
                        InputStreamReader(sock.getInputStream()));
                String remoteTime = is.readLine();
                System.out.println("Time on " + hostName + " is " + remoteTime);
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }

