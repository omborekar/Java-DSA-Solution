//find median of two sorted arrays problem
//https://leetcode.com/problems/median-of-two-sorted-arrays/

import java.util.Arrays;

class MedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums[] = new int[nums1.length+nums2.length];
        for(int i =0;i<nums1.length;i++){
            nums[i] =nums1[i];
        }
        for(int i =nums1.length;i<nums2.length+nums1.length;i++){
            nums[i] =nums2[i-nums1.length];
        }
        Arrays.sort(nums);





        double x;

        if(nums.length%2==0){
            x = (nums[nums.length/2]+nums[nums.length/2-1])/2.0;
        }
        else{
            x = nums[nums.length/2];
        }
        return x;
        
    }
    public static void main(String[] args) {
        MedianSortedArrays msa = new MedianSortedArrays();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(msa.findMedianSortedArrays(nums1, nums2)); // Output: 2.0

        nums1 = new int[]{1, 2};
        nums2 = new int[]{3, 4};
        System.out.println(msa.findMedianSortedArrays(nums1, nums2)); // Output: 2.5
    }
}