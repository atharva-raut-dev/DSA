import java.util.*;
class Product
{
    public static int multiply(int a,int b){
        int mul = a * b;
        return mul;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x; ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        System.out.println(multiply(x,y));
        
    }
}