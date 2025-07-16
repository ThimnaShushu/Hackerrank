import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String[] time = s.split(":");

        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        int seconds = Integer.parseInt(time[2].substring(0, 2));
        String meridian = time[2].substring(2, 4);
        String hoursString = "";
        String minutesString = "";
        String secondsString = "";

        if (meridian.equals("AM")) {
            if (hours == 12) {
                if (minutes < 10) {
                    minutesString = "0" + minutes;
                } else {
                    minutesString = "" + minutes;
                }

                hoursString = "00";
            } else if (hours < 10) {
                if (minutes < 10) {
                    minutesString = "0" + minutes;
                } else {
                    minutesString = "" + minutes;
                }
                hoursString = "0" + hours;
            } else if (hours == 10 || hours == 11) {
                if (minutes < 10) {
                    minutesString = "0" + minutes;
                } else {
                    minutesString = "" + minutes;
                }
                hoursString = "" + hours;

            }
        } else if (meridian.equals("PM")) {
            if (hours == 12) {
                hoursString = "12";
                if (minutes < 10) {
                    minutesString = "0" + minutes;
                } else {
                    minutesString = "" + minutes;
                }

            } else {
                if (minutes < 10) {
                    minutesString = "" + minutes;
                } else {
                    minutesString = "" + minutes;
                }
                hours += 12;
                hoursString = String.valueOf(hours);
            }
        }
        if (seconds < 10) {
            secondsString = "0" + seconds;
        } else if (seconds > 9) {
            secondsString = "" + seconds;
        }
        return (hoursString + ":" + minutesString + ":" + secondsString);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
