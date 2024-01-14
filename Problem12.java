import java.util.*;
class Problem12
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int value=0;
        System.out.print("Enter value: ");
        value = sobj.nextInt();
        Test tobj = new Test(value);
        tobj.checkFactors();
    }
}
class Test
{
    public int num;
    Test(int no)
    {
        this.num = no;
    }
    void checkFactors()
    {
        int i=0;
        if(num<0)
        {
            num=-num;
        }
        for(i=1;i<=(num/2);i++)
        {
            if(num%i==0)
            {
                System.out.print(i+"\t");
            }
        }
    }
}