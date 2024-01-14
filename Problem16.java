// accept number from user and display its multiplication of factors
import java.util.*;

class Problem16
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int ival = 0;
        System.out.println("Enter number: ");
        ival = sobj.nextInt();
        int ret = 0;
        ret = multFactors(ival);
        System.out.println("Multiplication of factors is :");
        System.out.println(ret);
    }

    static int multFactors(int ino)
    {
        int mult=1;
        int icnt = 0;
        for(icnt=1;icnt<=ino;icnt++)
        {
            if(ino%icnt==0)
            {
                mult = mult *icnt;
            }
        }
        return mult;
    }
}
