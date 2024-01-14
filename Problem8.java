// Accept number from user and if number is less than 10 then print hello otherwise print Demo
import java.util.*;
class Problem8
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int number;
        System.out.print("Enter number: ");
        number = sobj.nextInt();
        Test tobj = new Test(number);
        tobj.check();
    }
}
class Test
{
    public int no;
    public Test(int n)
    {
        this.no=n;
    }
    void check()
    {
        if(no<10)
        {
            System.out.print("Hello");
        }
        else{
            System.out.print("Demo");
        }
    }
}