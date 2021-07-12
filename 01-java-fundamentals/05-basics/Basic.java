public class Basic {
    public static void main(String[] args) {
        
        // int i = 1;
        // while(i <= 255) {
        // System.out.println(i);
        // i++;
        // }



        // int num = 255, sum = 0;
        // for(int i = 1; i <= num; ++i)
        // {
        //     sum += i;
        // }
        // System.out.println("Sum = " + sum);



        // int num = 255;
        // for (int i = 1; i <= 255; i = i + 2) {
        //     System.out.println(i);
        // }



        // int [] x = {1,3,5,7,9,13};
        // for(int i = 0; i <= x.length; i++){
        //     System.out.println(x[i]);
        // }



        // int [] arr = {-5, 69, -11, 10, 0};
        // int max = arr[0];
        // for(int i = 0; i <= arr.length; i++){
        //     if (arr[i] > max) 
        //     max = arr[i];
        // }
        //     System.out.println(max);



        int[] arr = {5, 8, 0, -5, 11};
        int avg = 0;
        for(int i = 0; i <= arr.length; i++){
        avg = avg + arr[i];
        }
        System.out.println(avg/arr.length);






    }
}