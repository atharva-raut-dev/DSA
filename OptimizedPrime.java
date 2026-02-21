import java.util.*;
class Solutioun{
    public static boolean Prime(int n){       
     boolean isPrime = true;
        if(n == 2){
            isPrime = true;
        }
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Prime(x));

    }
}