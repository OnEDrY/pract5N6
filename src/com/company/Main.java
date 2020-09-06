package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {


    static String Func (int t, int i, int count, int rec)
    {
        if ((rec == 10)  && (count == 2)) return "yes";

        if (count > 2) return "no";

        if (t % i == 0)
        {
            return Func(t, i++, ++count, rec++);
        }

        return Func(t, i++ , count , rec++);

    }


    static String Pr(int a)
    {
        return Func(a,1, 0, 0 );
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        System.out.println(Pr(k));
    }


}
