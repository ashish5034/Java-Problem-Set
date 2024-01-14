import java.util.*;
class Problem9
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int val1,val2;
        val1 = sobj.nextInt();
        val2= sobj.nextInt();
        Test tobj = new Test(val1, val2);
        tobj.display();

    }
}
class Test
{
    public int no1; 
    public int no2;
    public Test(int n1,int n2)
    {
        this.no1=n1;
        this.no2=n2;
    }
    void display()
    {
        int i;
        for(i=1;i<=no2;i++)
        {
            System.out.print(no1+"\t");
        }
    }
}