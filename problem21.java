import java.lang.*;
import java.util.*;
class problem21
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number: ");
        int ivalue = sobj.nextInt();
        Test tobj = new Test();
        tobj.reverse(ivalue);
    }
}
class Test
{
    public 
    Test()
    {

    }
    public void reverse(int ino)
    {
        int idigit = 0;
        while (ino!=0) 
        {
           idigit = ino % 10;
           System.out.print(idigit);
            ino = ino /10;
        }
    }
}