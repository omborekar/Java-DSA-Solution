class Robber {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int prev2 = nums[0];
        int prev1 = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            int current = Math.max(prev2 + nums[i], prev1);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
    public static void main(String[] args) {
        Robber robber = new Robber();
        int[] nums = {2, 7, 9, 3, 1};
        int maxLoot = robber.rob(nums);
        System.out.println("Maximum loot possible: " + maxLoot);
    }
}
