/*public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(2+5);
        System.out.println(27*153);
    }
}
*/
import java.util.*;
public class HelloWorld
{
    public static void main(String[] args) {
        int n,i;
        int fact_n,lastdig;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number : " );
        n = sc.nextInt();
      //  System.out.println(n);
        int total = 0;
        int temp_n = n;
        while(n != 0)
        {
            i = 1;
            fact_n = 1;
            lastdig = n % 10;
            while(i <= lastdig)
            {
                fact_n = fact_n * i;
                i++;
            }
            total = total + fact_n;
            n = n / 10;
        }
        if(total == temp_n)
            System.out.println(temp_n + " is a strong number\n");
        else
            System.out.println(temp_n + " is not a strong number\n");
        System.out.println();
    }
}
