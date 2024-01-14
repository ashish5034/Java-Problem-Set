//write program which accept number from user and return count of even digit
import java.util.Scanner;
class Problem26
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int ivalue = 0;
        System.out.println("Enter number");
        ivalue = sobj.nextInt();
        int iret =0;
        Test tobj = new Test();
        iret = tobj.evencount(ivalue);
        System.out.println("count of even digit:"+iret);
    }
}
class Test
{
    public
    Test()
    {
    }
    int evencount(int ino)
    {
        int idigit = 0;
        int count = 0;
        while (ino != 0) 
        {
            idigit = ino % 10;
            if(idigit%2 == 0)
            {
                count++;
            }  
            ino = ino /10;
        }
        return count;
    }
}