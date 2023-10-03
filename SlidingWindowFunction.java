public class SlidingWindowFunction {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-1];
        int sum = 0;
//        for (int i=0; i<=k-1; i++)
//        {
//            sum += nums[i];
//        }
        //ans[0] = sum;
        for (int i=0; i<=nums.length-k; i++)
        {
            sum = sum + nums[i+k-1] - nums[i-1];
            ans[i] = sum;
            System.out.println("ans  "+ans[i]);
        }

        return ans;


    }
}
