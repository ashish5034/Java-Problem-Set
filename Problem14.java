import java.util.Scanner;
class Problem14{
    public static void main(String[] args) {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number: ");
        iValue = sobj.nextInt();

        Test tobj = new Test();
        tobj.DisplayEvenFactor(iValue);
    }
}
class Test
{
    void DisplayEvenFactor(int iNo)
    {
        int iCnt = 0;
        System.out.println("EvenFactors of  "+iNo+" are as follows:");
        for(iCnt = 1; iCnt<=(iNo/2);iCnt++)
        {
            if(iNo%iCnt==0)
            {
                if(iCnt%2==0)
                {
                    System.out.println(iCnt);
                }
            }
        }
    }
}