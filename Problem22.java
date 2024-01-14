// write a program which accept number from user and check whether it contain 0 in it or not
import java.util.Scanner;
class Problem22
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int ivalue = sobj.nextInt();    
        Test tobj = new Test();
        tobj.checkzero(ivalue);
        sobj.close();
    }
}
class Test
{
    public
    Test()
    {
    }
    public void checkzero(int ino)
    {
        int idigit = 0;
        while (ino!=0) 
        {
            idigit = ino % 10;
            if(idigit == 0)
            {
                System.out.println("It contain zero");
                break;
            }
            ino = ino/10;  
        }
    }
}