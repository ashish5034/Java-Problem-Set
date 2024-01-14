//write program which accept number from user and return count of odd digit
import java.util.Scanner;
class Problem27
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int ivalue = 0;
        System.out.println("Enter number");
        ivalue = sobj.nextInt();
        int iret =0;
        Test tobj = new Test();
        iret = tobj.oddcount(ivalue);
        System.out.println("count of odd digit:"+iret);
    }
}
class Test
{
    public
    Test()
    {
    }
    int oddcount(int ino)
    {
        int idigit = 0;
        int count = 0;
        while (ino != 0) 
        {
            idigit = ino % 10;
            if(idigit%2 != 0)
            {
                count++;
            }  
            ino = ino /10;
        }
        return count;
    }
}