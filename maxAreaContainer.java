// LeetCode Problem: Container With Most Water
// www.leetcode.com/problems/container-with-most-water/
class maxAreaContainer {
    public int maxArea(int[] height) {
        int maxWater = Integer.MIN_VALUE;
        int lp = 0;
        int rp = height.length - 1;
        while (lp < rp) {
            int temp = Math.min(height[lp], height[rp]) * (rp - lp);
            if (maxWater < temp) {
                maxWater = temp;
            }
            if (height[lp] < height[rp]) {
                lp += 1;
            } else  {
                rp -= 1;
            }
        }
        return maxWater;

    }
    public static void main(String[] args) {
        maxAreaContainer solution = new maxAreaContainer();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = solution.maxArea(height);
        System.out.println("Maximum area: " + result);
    }
}