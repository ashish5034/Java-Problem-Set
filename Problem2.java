import java.util.*;
class Problem2
{
    public static void main(String args[])
    {
        int no=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("How mant times to print string: ");
        no = sobj.nextInt();
        Test tobj = new Test();
        tobj.loop(no);
    }
}
class Test
{
    public void loop(int num)
    {
        int i=0;
        int count=0;
        for(i=1;i<=num;i++)
        {
            System.out.println("Jay Ganesh...");
            count++;
        }
        System.out.println("Number of iteration of loop are :"+count);
    }
}
