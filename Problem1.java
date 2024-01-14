// program to divtion of two numbers
import java.util.*;
class Problem1 {
    public static void main(String args[]) {
        float ivalue1 = 0, ivalue2 = 0, iret = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter ivalue1: ");
        ivalue1 = sobj.nextFloat();
        System.out.println("Enter ivalue2: ");
        ivalue2 = sobj.nextFloat();

        Test tobj = new Test();
        iret = tobj.division(ivalue1, ivalue2);
        System.out.println("Division is : " + iret);
    }
}

class Test {
    public float division(float ino1, float ino2) {
        if (ino2 == 0) {
            System.out.println("Division by zero is not allowed.");
            return -1;
        } else if (ino2 < 0) {
            return -1;
        } else {
            float iAns = ino1 / ino2;
            return iAns;
        }
    }
}
