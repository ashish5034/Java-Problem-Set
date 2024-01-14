import java.util.*;
class Problem7
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue=0;
        System.out.print("Enter ivalue: ");
        iValue = sobj.nextInt();
        Test tobj=new Test(iValue);
        tobj.display();

    }
}
class Test{
    public int no;
    public Test(int no1)
    {
        this.no=no1;
    }
    void display()
    {
        int i=1;
        while(i<=this.no)
        {
        System.out.print("*\t");
        i++;
        }
    }
}