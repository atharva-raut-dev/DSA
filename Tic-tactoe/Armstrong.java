import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) 
    {   
        for(int i = 100; i <=999; i++)
        {
            if(isArmstrong(i))
            {
                System.out.println(i);
            }
        }

    }
    public static boolean isArmstrong(int num)
    {
        int original = num;
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
        }
        return sum == original;   
    }  
}
