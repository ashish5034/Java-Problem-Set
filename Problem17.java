// accept number from user and display its factors in decreasing ore=der
import java.util.Scanner;

class Problem17
{
    public static void main(String[] args) 
    {
        int ival = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number: ");
        ival =sobj.nextInt();
        Test tobj =new Test(ival);
        tobj.factors();
    }
}

class Test
{
    public int ino;
    Test(int no)
    {
        this.ino = no;
    }
    public void factors()
    {
        int icnt = 0;
        for(icnt=this.ino;icnt>0;icnt--)
        {
            if(ino%icnt==0)
            {
                System.out.println(icnt+"\t");
            }
        }

    }
}