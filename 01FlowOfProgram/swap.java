public class swap {
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 20;
        ulta(a ,b);
        System.out.println(a+" "+b);
    }

    static void ulta(int num1, int num2)
    {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1+" "+num2);
    }
}
