import java .util.*;
class CheckPrime{
public static boolean isPrime(int n) 
{
    boolean isPrime = true;
    for (int i = 2;i <= n-1;i++){

        if(n == 2) {
            isPrime = true;
        }

        if(n % i == 0){
            isPrime = false;
        }
    }
    return isPrime;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.println(isPrime(x)); 
}
}
