package com.neka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int a,b,temp;
        System.out.println("Enter two numbers to swap");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("The numbers before swapping are :" + " " + a + " " + b);

        /*logic 1 : introducing a temporary var - temp
        temp =a;
        a = b;
        b=temp;
         */

        /*Logic 2 : use + and -

        a = a+ b;  //44+66 = 110
        b = a-b;   //110-66 =44
        a = a - b;  //110-44 =66


        //logic 3 : * and / where a and b != 0
        a =a *b ; //20 = 4*5;
        a = a/b; // 5 = 20/4
        b = a/b ; // 4=20/5

    //logic 4 : using XOR ^
        a = a^b;    //a = 10 b = 20 - convert to binary and perform XOR
        b=  a^b;
        a=  a^b;
*/
        //logic 5
         b  =(a +b) - (a=b);  //a = 10, b = 20
                    // a= 20
        //  = (10+20) -20
        // b = 10

        System.out.println("The numbers after swapping are :" + " " + a + " " + b);
    }
}
