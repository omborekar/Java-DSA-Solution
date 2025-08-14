// //Trapping rainwater problem
// //https://leetcode.com/problems/trapping-rain-water/

class TrappingRainWater {
    public int trap(int[] height) {
        
        int curr = 0;
        int water = 0;

        for (int i = 0; i < height.length-1; i++) {
            int left = 0;
        int right = 0;
            curr = height[i];
            int max = 0;
            while (left >= 1 || right < height.length-1) {
                int sum = Math.min(height[left], height[right]) - curr;
                if (sum > max) {
                    max = sum;
                }

                while (left >= 1 && height[left] < height[left - 1]) {
                    left--;
                }
                while (right < height.length - 1 && height[right] < height[right + 1]) {
                    right++;
                }
            }
            System.out.println(left+" "+i+" "+right);

            water += max;
            max = 0;
            left = i;
            right = i+1;

        }
        return water;

    }
    public static void main(String[] args) {
        TrappingRainWater sol = new TrappingRainWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(sol.trap(height)); // Output: 6
    }
}

