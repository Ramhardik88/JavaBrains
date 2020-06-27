package MassProblem;



import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber2 {
    public static void main(String[] args) {
        int nums[]={2,4,2,3,2,3,3};
      //  int nums[]={4,2,2,2,3,3,3};
        System.out.println(isSolutionUsingSort(nums));
        System.out.println(isSolutionUsingBits(nums));
    }

    private static int isSolutionUsingBits(int[] nums) {
        int ones=0;
        int twos=0;
        for(int ele:nums)
        {
            ones=(ones^ele) & ~(twos);
            twos=(twos^ele) & ~(ones);

        }
        return ones;
    }


    private static int isSolutionUsingSort(int[] nums) {
        Arrays.sort(nums);

        if(nums[0]!=nums[1])
            return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2])
            return nums[nums.length-1];
      int i=1;
      while (i<nums.length)
      {
          if (nums[i]!=nums[i-1])
              return nums[i-1];
          i+=3;

      }
        return nums[i-1];

    }

}
