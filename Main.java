import java.sql.SQLOutput;
import java.util.*;

public class Main {
//    public List<List<Integer>> threeSum(int[] nums){
//
//    }
    public int quickSort(int []nums,int right,int left){
        int i=left,j=right;

    }
    public static int bSearch(int [] nums,int l,int r,int index){
        int mid;
        int tl=l,tr=r;
        while(tl<=tr){
            mid=(tl+tr)/2;
            if(nums[mid]==index)
                return mid;
            else if(index<nums[mid])
                tr=mid-1;
            else
                tl=mid+1;
        }
        return -1;
    }
    public static void main(String args[]){
        int []nums=new int[]{1,2,3,4,5};
        System.out.println(bSearch(nums,0,4,7));
    }
}
