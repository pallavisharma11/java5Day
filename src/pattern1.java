import java.util.Scanner;
public class pattern1
{
    public static void main(String[] args)
    {
        pattern();
    }
    
    static void pattern ()
    {
        Scanner sc = new Scanner(System.in);
        int numOfRows = sc.nextInt();
        int k = 1;
        for(int i = 1; i<=numOfRows;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(k++);
            }
            System.out.println("");
        }
        
    }
    
}
