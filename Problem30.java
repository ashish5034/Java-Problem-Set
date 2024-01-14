// write program which accept number from user and return diff between summation of even digit and summation of odd digits
import java.util.Scanner;
class Problem30
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int ival = 0;
        int iret = 0;
        System.out.println("Enter number: ");
        ival = sobj.nextInt();
        Test tobj = new Test();
        iret = tobj.diff(ival);
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
    int diff(int ino)
    {
        int idigit = 0;
        int sum1 = 0;
        int sum2 = 0;
        while (ino != 0) 
        {
            idigit = ino % 10;
            if(idigit%2==0)
            {
                sum1 = sum1+idigit;
            }
            else if(idigit%2!=0)
            {
                sum2 = sum2+idigit;
            }
            ino = ino/10;
        }
        return sum1-sum2;
    }
}