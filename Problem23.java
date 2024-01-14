// write a program which accept number from user and count frequency of 2 in it
import java.util.Scanner;
import java.lang.*;
class Problem23
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number: ");
        int ivalue = sobj.nextInt();
        int iret = 0;
        Test tobj = new Test();
        iret = tobj.counttwo(ivalue);
        System.out.println(iret);
        sobj.close();
    }
}
class Test
{
    public
    Test()
    {

    }
    public int counttwo(int ino)
    {
        int idigit = 0;
        int count = 0;
        while (ino!=0) 
        {
            idigit = ino % 10;
            if(idigit == 2)
            {
                count++;
            }    
            ino = ino / 10;
        }
        return count;
    }
}