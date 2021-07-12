import java.util.arrays;
import java.util.Scanner;
public class Basic {


    
    public static void main(String[] args) {

        // // Print 1-255
        // int i = 1;
        // while(i <= 255) {
        // System.out.println(i);
        // i++;
        // }


        // // Print odd numbers between 1-255
        // int num = 255;
        // for (int i = 1; i <= 255; i = i + 2) {
        //     System.out.println(i);
        // }


        // // Print Sum
        // int num = 255, sum = 0;
        // for(int i = 0; i <= num; ++i){
        //     sum += i;
        //     System.out.println(i);
        // }
        // System.out.println(sum);


        // // Iterating through an array
        // int [] x = {1,3,5,7,9,13};
        // for(int i = 0; i <= x.length; i++){
        //     System.out.println(x[i]);
        // }


        // Find Max   
        // int [] x = {-5, 69, -11, 10, 0};
        // int max = x[0];
        // for(int i = 0; i <= x.length; i++){
        //     if (x[i] > max){
        //         max = x[i];
        //         System.out.println(max);
        // }
        // }



        // // Get Average
        // int[] array = {5, 8, 0, -5, 11};
        // double total = 0;
        // for(int i = 0; i < array.length; i++){
        // total += array[i];
        // }
        // System.out.println(total/array.length);


        // Array with Odd Numbers
        // int y = 255;
        // for (int i = 1; i <= y; i++) {
        // if (i % 1 == 0) {
        //     System.out.print(i + " ");
        // }
        // } 



        // Greater Than Y




        // Square the values
        // int[] x = {1, 5, 10, -2}; 
        // for(int i = 0; i<x.length ; ++i){
        //     x[i]=x[i] * x[i]; }
        // for (int i = 0; i < x.length ; ++i) {
        //     System.out.println(x[i]);}


        // Eliminate Negative Numbers
        // int[] x = {1, 5, 10, -2};
        // for(int i = 0; i < x.length ; ++i) {
        // if(x[i] < 0)
        // x[i] = 0;
        // System.out.println(x[i]);
        // }
        



        // Max, Min, and Average
        // int[] x = {1, 5, 10, -2};
        // int maxNum = x[0];
        // int minNum = x[0];
        // double avg = 0;
        // for (int i = 0; i < x.length; i++){
        //     avg += x[i];
        //     if (x[i] > maxNum){
        //         maxNum = x[i];
        //     }
        //     else if (x[i] < minNum) {
        //         minNum = x[i]; 
        //     }
        // }
        // System.out.println(maxNum);
        // System.out.println(minNum);
        // System.out.println(avg/x.length);



        Shifting the Values in the Array     PROBLEM
        int[] x = {1, 5, 10, 7, -2};
        for (int i = 0; i < x.length; i++){
            x[i] = x[i] + 1;
            System.out.println(x[i]);
        }
        
    }
}