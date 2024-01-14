import java.util.*;
class Problem5
{

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter number");
        number = sobj.nextInt();
        Test tobj = new Test(number);
        tobj.display(number);
    }
}
class Test
{
    public int num;
    public Test(int no)
    {
        
        this.num=no;
    }
    
    void display(int no2)
{
    for(int i=1;i<=no2;i++)
    {
        System.out.print("*\t");
    }
}
}