import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here

        int specialInt = 0;

        for (int i = 0; i < a.size(); i++) {
            if ((Collections.frequency(a, a.get(i))) == 1) {
                specialInt = a.get(i);
            }
        }

        return specialInt;
    }

}
