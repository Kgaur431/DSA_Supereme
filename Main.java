public class Main {
    public static void main(String[] args) {
        SlidingWindowFunction swf = new  SlidingWindowFunction();
        int[] arr = {1,3,-1,-3,5,3,6,7};
         int[] result = swf.maxSlidingWindow(arr,3);
         for (int i=0; i<arr.length; i++)
         {
            // System.out.println(result);
         }
    }
}
