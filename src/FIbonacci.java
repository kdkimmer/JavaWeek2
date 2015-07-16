/**
 * Created by kim on 6/26/2015.
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2,
 * the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of
 * the even-valued terms.
 */
//public class FIbonacci {
//    public static void main(String[] args){
//
//        long sum = 0;
//        long a = 2, b = 8, c = 0;
//
//        sum = sum + a + b;
//        while(true)
//        {
//            c = b * 4 + a;
//            if(c  > 4000000)
//                break;
//            sum = sum + c;
//            a = b;
//            b = c;
//            System.out.println(c + "   ");
//        }
//        System.out.println("The sum is " + sum);
//    }
//}