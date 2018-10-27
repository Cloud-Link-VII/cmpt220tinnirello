
/*********************
 Author: Marinel Tinnirello
 Lab 7 - Problem 2
 ********************/

import java.util.Collections;
import java.util.Scanner;

public class TestStackOfInts
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive #:     ");
        int num = input.nextInt();

        System.out.print("The smallest factors of " + num + " are: ");
        StackOfIntegers stack = new StackOfIntegers();

        smallestFactors(num, stack);

        while (!stack.empty())
        {
            System.out.print(stack.pop() + " ");
        }

        //Collections.reverse(stack);
        /*for(int i = stack.length -1; i < 0; i--)
        {

        }*/

        System.out.println();
    }

    public static void smallestFactors(int num, StackOfIntegers stack)
    {
        int i = 2;

        while ((num / i) != 1) {
            if ((num % i) == 0) {
                stack.push(i);
                num /= i;
            } else
            {
                i++;
            }
        }
        stack.push(num);
    }

    /*public static void reverse(StackOfIntegers stack)
    {

    }*/
}
