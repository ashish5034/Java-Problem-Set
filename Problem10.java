import java.util.*;
class Problem10
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int value = 0;
        System.out.print("Enter number: ");
        value = sobj.nextInt();
        boolean ret=false;
        Test tobj =new Test(value);
        ret = tobj.check();
        if (ret == true)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd Number ");
        }
    }
}

class Test
{
    public int no;
    Test(int n)
    {
        this.no=n;
    }
    boolean check()
    {
        if(no%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}