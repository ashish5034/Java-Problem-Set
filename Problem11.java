import java.util.*;
class Problem11
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int value=0;
        System.out.print("Enter number: ");
        value = sobj.nextInt();
        Test tobj = new Test(value);
        tobj.check();

    }
}
class Test
{
    public int number;
    Test(int no)
    {
        this.number=no;
    }
    void check()
    {
        if(number%2==0)
        {
            System.out.print("Even number: "+number);
        }
        else{
            System.out.print("Odd number: "+number);
        }
    }
}
