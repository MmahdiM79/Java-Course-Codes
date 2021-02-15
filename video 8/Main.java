



public class Main 
{
    public static void main(String[] args) 
    {
        // int num1 = 6;
        // int num2 = 5;


        // if (num1 == num2)
        //     System.out.println("" + num1 + " == " + num2);
        // else
        // {
        //     if (num1 > num2)
        //         System.out.println("" + num1 + " > " + num2);
        //     else
        //         System.out.println("" + num1 + " < " + num2);
        // }



        // && >>> and
        // || >>> or
        // ! >>> not

        int num3 = 4;
        int num4 = 4;


        if (!(num3 > num4) || !(num3 < num4))
            System.out.println("" + num3 + " == " + num4);
        else
            System.out.println("" + num3 + " != " + num4);
            
        
        /* 
         *
         * TT of (&& and) operand
         * 
         * a | b | a && b
         * ---------------
         * t | t |   t
         * t | f |   f
         * f | t |   f
         * f | f |   f
         * 
         */

        
        /* 
         *
         * TT of (|| or) operand
         * 
         * a | b | a || b
         * ---------------
         * t | t |   t
         * t | f |   t
         * f | t |   t
         * f | f |   f
         * 
         */
    } 
}