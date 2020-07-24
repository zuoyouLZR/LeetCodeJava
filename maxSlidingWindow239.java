public class maxSlidingWindow239 {
    public static int[] maxSlidingWindow(int[] nums, int k){
        int []max=new int[nums.length+k-1];
        int maxN=nums[0],maxI=-1;
        for(int i=0;i+k-1<nums.length;i++){
            if(maxI<i){
                maxN=nums[i];
                for(int j=i;j<i+k;j++){
                    if(maxN<nums[j]){
                        maxN=nums[j];
                        maxI=j;
                    }
                }
            }
            if(nums[i+k-1]>maxN){
                maxN=nums[i+k-1];
                maxI=i+k;
            }
            max[i]=maxN;
        }
        for(int i:max){
            System.out.println(i);
        }

        return max;
    }
}
