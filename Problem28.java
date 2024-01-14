import java.util.InputMismatchException;
import java.util.Scanner;

class Problem28 {
    public static void main(String[] args) {
        try {
            Scanner sobj = new Scanner(System.in);
            int ivalue = 0;
            System.out.println("Enter number");
            ivalue = sobj.nextInt();

            int iret = 0;
            Test tobj = new Test();
            iret = tobj.countInRange(ivalue);
            System.out.println("Count between 3 and 7: " + iret);
        } catch (InputMismatchException obj) {
            System.out.println(obj);
        }
    }
}

class Test {
    public Test() {
    }

    int countInRange(int number) {
        int digit = 0;
        int count = 0;
        while (number != 0) {
            digit = number % 10;
            if (digit > 3 && digit < 7) {
                count++;
            }
            number = number / 10;
        }
        return count;
    }
}
