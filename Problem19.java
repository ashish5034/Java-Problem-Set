// accept number from user and display sum of nofactors
import java.util.Scanner;
import java.util.lang.*;
class Problem17
{
    public static void main(String[] args) 
    {
        int ival = 0;
        int ret;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number: ");
        ival =sobj.nextInt();
        Test tobj =new Test(ival);
        ret =tobj.factors();
        System.out.println(ret);
        sobj.close();
    }
}

class Test
{
    public int ino;
    Test(int no)
    {
        this.ino = no;
    }
    public int factors()
    {
        int icnt = 0;
        int sum =0;
        for(icnt=this.ino;icnt>0;icnt--)
        {
            if(this.ino%icnt!=0)
            {
                sum = sum+icnt;
            }
        }
        return sum;
    }
}