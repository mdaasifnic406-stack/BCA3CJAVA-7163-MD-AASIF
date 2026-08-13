// program no.8
//  Write  a  java  program  to  find  ODD  or  EVEN  number  using  command  line argument. 

public class OddEven
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(args[0]);

        if(num % 2 == 0)
        {
            System.out.println(num + " is Even number.");
        }
        else
        {
            System.out.println(num + " is Odd number.");
        }
    }
}