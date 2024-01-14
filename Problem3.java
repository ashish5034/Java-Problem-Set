// program to print n to 1 numbers on screen 
import java.util.*;
class Problem3
{
    public static void main(String args[])
    {
        int number;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number of iteration of loop : ");
        number =sobj.nextInt();
        Test tobj = new Test();
        tobj.display(number);
        sobj.close();
    }
}
class Test{
    public void display(int no)
    {
        int i;
        for(i=no;i>0;i--)
        {
            System.out.println(i);
        }
    }
}