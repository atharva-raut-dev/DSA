import java.util.*;
public class BinomonialCoeff {//
    public static int printFactorial(int n){
        int factorial = 1;
        for(int i = 1;i <= n;i++)
        {
            factorial = factorial * i;
        }
        return factorial;
    }
    public static int  binCoeff(int n,int r) {
        int nFactorial = printFactorial(n);
        int rFactorial = printFactorial(r);
        int nmrFactorial = printFactorial(n-r);

        int binCoeff = nFactorial / (rFactorial * nmrFactorial);
        
        return binCoeff;
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(binCoeff(n,r));
    }
}
