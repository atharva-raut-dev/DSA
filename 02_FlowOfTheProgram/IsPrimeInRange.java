import java.util.*;
public class IsPrimeInRange {
    public static boolean isPrime(int n)
    {
        boolean isPrime = true;
        if(n == 2)
        {
            isPrime = true;
        }
        for(int i = 2; i <= Math.sqrt(n);i++)
        {
            if(n % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void checkPrimeInRange(int n)
    {
        for(int i = 2;i <= n;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range you want to print the prime numbers : ");
        int n = sc.nextInt();
        checkPrimeInRange(n);
    }
    
}
