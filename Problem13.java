import java.util.Scanner;
import java.lang.*;
class Problem13
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter character: ");
        char cvalue = sobj.next().charAt(0);

        Test tobj = new Test(cvalue);
        tobj.DisplayConvert();
    }
}

class Test
{
    public char cval;
    Test(char cval1)
    {
        this.cval = cval1;
    }
    void DisplayConvert()
{
    if(cval>='a' && cval<='z')
    {
        cval = (char)(cval -32);
        System.out.println(cval);
    }
    else if(cval>='A' && cval<='Z')
    {
        cval = (char)(cval + 32);
       System.out.println(cval);
    }
}
}