import java.util.Scanner;

class Problem15 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        String cValue;
        System.out.println("Enter a character: ");
        cValue = sobj.nextLine(); // Changed to nextLine() to read the whole line as a string

        Test tobj = new Test();
        boolean cRet = tobj.checkVowel(cValue); // Passing the input as a string
        System.out.println("Is it a vowel? " + cRet);
    }
}

class Test {
    boolean checkVowel(String cVal) {
        // Converting the input string to uppercase for easy comparison
        String upperCaseCVal = cVal.toUpperCase();

        if (upperCaseCVal.equals("A") || upperCaseCVal.equals("E") || upperCaseCVal.equals("I")
                || upperCaseCVal.equals("O") || upperCaseCVal.equals("U")) {
            return true;
        } else {
            return false;
        }
    }
}
