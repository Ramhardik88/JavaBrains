package Leetcode;

public class SearchInsertposition
{
    public static void main(String[] args) {
        int array[]={1,3,5,7};
        int target=19;
        System.out.println(isSolution(array,target));
    }

    private static int isSolution(int[] array, int target) {
        int low=0;
        int mid;
        int high=array.length-1;
        while (low<=high)
        {
            mid=low+(high-low)/2;
            if(array[mid]==target)
            {
                return mid;
            }
            else if(array[mid]<target)
            {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return low;

    }
}
