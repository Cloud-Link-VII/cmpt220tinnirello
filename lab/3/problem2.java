/*********************
 Author: Marinel Tinnirello
 Lab 3 - Problem 2
 ********************/

public class Main
{
    public static void main (String[] args)
    {
        int count = 0;

        for(int i = 100; i <= 500; i++)
        {
            if((i % 5 == 0) || (i % 7 == 0))
            {
                count++;

                if(i % 10 == 0)
                {
                    System.out.print("\n");
                }else
                {
                    System.out.println(i + " ");
                }
            }
        }
    }
}
