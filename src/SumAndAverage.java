/**
 * Created by kim on 6/26/2015.
 * Exercise SumAndAverage (Loop): Write a program called SumAndAverage to produce the sum of 1, 2, 3, ...,
 * to an upperbound (e.g., 100). Also compute and display the average. The output shall look like:
 * The sum is 5050 The average is 50.5 TRY: 1. Modify the program to use a "while" loop instead of "for" loop.
 * 2. Modify the program to sum from 111 to 8899, and compute the average.
 * Introduce an int variable called count to count the numbers in the specified range.
 * 3. Modify the program to sum only the odd numbers from 1 to 100, and compute the average.
 * (Hint: n is an odd number if n % 2 is not 0.) 4. Modify the program to sum those numbers
 * from 1 to 100 that is divisible by 7, and compute the average. 5. Modify the program to
 * find the "sum of the squares" of all the numbers from 1 to 100, i.e. 11 + 22 + 33 + ... + 100100.
 */
//public class SumAndAverage {
//    public static void main(String[] args){
//
////A for loop giving sum and average
//        int sum = 0;
//        //incrementing through 100
//        for (int i = 0; i <= 100; i++){
//            sum += i;
//        }
//       System.out.println("The sum is " + sum + " The average is " + sum/100.0);
//
////A while loop giving sum and average
//        sum = 0;
//        int result = 0;
//        while(result <= 100){
//            sum += result;
//            result++;
//        }
//        System.out.println("The sum is " + sum + " The average is " + sum/100.0);
//
////Modify the program to sum from 111 to 8899, and compute the average.
////Introduce an int variable called count to count the numbers in the specified range.
//        int start = 111;
//        int end = 8899;
//        sum = 0;
//        int count = 0;
//        while(start <= end){
//            sum += start;
//            count++;
//            start++;
//        }
//        System.out.println("The sum is " + sum + " The average is " + sum/count);
//
////Modify the program to sum only the odd numbers from 1 to 100, and compute the average.
//// (Hint: n is an odd number if n % 2 is not 0.) result += (numbers[i] % 2 == 0 ? 1 : 0);
//        int oddCount = 0;
//        sum = 0;
//        count = 0;
//        for (int number = 1; number <= 100; number += 2){
//            sum += number;
//            oddCount++;
//        }
//        System.out.println("The sum is " + sum + " The average is " + sum/oddCount);
//
////Modify the program to sum those numbers
////from 1 to 100 that is divisible by 7, and compute the average.
//        int sevenCount = 0;
//        sum = 0;
//        for(int number = 1; number <= 100; number++){
//            if(number % 7 == 0){
//                sum += number;
//                sevenCount++;
//            }
//        }
//        System.out.println("The sum is " + sum + " The average is " + sum/sevenCount);
//
////Modify the program to find the "sum of the squares" of all the numbers from 1 to 100, i.e. 11 + 22 + 33  + 100100.
//        int numbers = 1;
//        int squareSum = 0;
//        sum = 0;
//        while (numbers <= 100){
//            squareSum = (numbers * numbers);
//            sum += squareSum;
//            numbers++;
//        }
//        System.out.println("The sum is " + sum);
//    }
//
//}
