// LeetCode Problem: Reverse Integer
// www.leetcode.com/problems/reverse-integer/
class Reverse {
    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            // Check for overflow before multiplying
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE/10 && digit > 7)) {
                return 0; // overflow
            }
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE/10 && digit < -8)) {
                return 0; // underflow
            }

            reversed = reversed * 10 + digit;
        }

        return reversed;
    }
    public static void main(String[] args) {
        Reverse solution = new Reverse();
        int input = 12345;
        int result = solution.reverse(input);
        System.out.println("Reversed integer: " + result);
    }
}
