public class nextGreaterElement496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2){
        int []a=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            a[i]=-1;
            int j=0;
            while(nums2[j++]!=nums1[i]);
            j++;
            while(j<nums2.length && nums2[j]<nums1[i]) {
                System.out.println(nums2[j]);
                System.out.println(nums1[i]);
                j++;
            }
            if(j<nums2.length && nums1[i]<nums2[j])
                a[i]=nums2[j];
        }
        return a;
    }
}
