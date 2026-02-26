<<<<<<< HEAD
class BinToDecimal{
    public static void  binaryToDecimal(int n){
        int MyNum = n;
        int pow = 0;
        int decimal = 0;
        while(n>0){
            int LastDigt = n % 10;
            decimal = decimal + (int)(LastDigt * Math.pow(2,pow));
            pow ++;
            n = n / 10;
        }
        System.out.print("The conversion of"+MyNum+"to decimal is : "+decimal);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binaryToDecimal(n);
    }
}
=======
import java.util.*;
class BinToDecimal{
    public static void  binaryToDecimal(int n){
        int MyNum = n;
        int pow = 0;
        int decimal = 0;
        while(n>0){
            int LastDigt = n % 10;
            decimal = decimal + (int)(LastDigt * Math.pow(2,pow));
            pow ++;
            n = n / 10;
        }
        System.out.println("The conversion of "+MyNum+" to decimal is : "+decimal);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Binary Number: ");
        int n = sc.nextInt();
        binaryToDecimal(n);
    }
}
>>>>>>> b3aebe209cee32613a2221740deea33532f86672