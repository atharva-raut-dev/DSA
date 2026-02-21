import java.util.Scanner;
public class MultiplicationTable 
{
    public static void main(String[] args) 
    {
        Scanner o1 = new Scanner(System.in);
        System.out.print("Enter the number of which the table you want to make:- ");
        int num = o1.nextInt();
        int i = 1;
        while(i < 11)
        {
            System.out.println(num+ " * "+i+" = "+num*i);
            i++;
        }  
        o1.close(); 
    }
}
