//  Accept two numbers and check whether the number is divisible by 5 or not
import java.util.*;
class Problem4
{
    public static void main(String args[])
    {
        int number;
        boolean ret;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter Number : ");
        number = sobj.nextInt();
        Test tobj = new Test();
        ret = tobj.check(number);
        if(ret==true)
        {
            System.out.println("Number is divisible by five ");
        }
        else{
            System.out.println("Number is not divisible by five ");
        }

    }
}
class Test{
    public boolean check(int num)
    {
        if(num%5 == 0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}