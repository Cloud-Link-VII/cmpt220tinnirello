/*********************
 Author: Marinel Tinnirello
 Lab 4 - Problem 6
 ********************/

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList pos = new ArrayList();

        for(int i = 0; i < 10; i++)
        {
            pos.add((int)(Math.random() * 10 + 1));
        }

        pos.add(-1);

        for(int i = 1; i <= 10; i++)
        {
            endOfInsert(pos, i);
        }

        System.out.println(pos);

        endOfInsert(3, pos, 10);
        specificInsert(7, pos, 100);

    }

    public static void endOfInsert(ArrayList arr, int insert)
    {
        arr.add(insert);
    }

    public static void specificInsert(int pos, ArrayList arr, int insert)
    {
        arr.add(pos, insert);
    }
}






