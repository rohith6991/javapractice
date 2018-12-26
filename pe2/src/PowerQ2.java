import java.util.*;
import java.lang.*;
public class PowerQ2 {

    public static void main(String args[]) {

        boolean x=isPowerOfFour(63);
        System.out.println(x);

    }


    static boolean isPowerOfFour ( int num){
        if (num == 0) return false;

        int pow = (int) (Math.log(num) / Math.log(4));
        if (num == Math.pow(4, pow)) {
            return true;
        } else {
            return false;
        }
    }

}
