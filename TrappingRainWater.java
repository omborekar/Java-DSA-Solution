// //Trapping rainwater problem
// //https://leetcode.com/problems/trapping-rain-water/

// class Solution {
//     public int trap(int[] height) {
        
//         int curr = 0;
//         int water = 0;

//         for (int i = 0; i < height.length-1; i++) {
//             int left = 0;
//         int right = 0;
//             curr = height[i];
//             int max = 0;
//             while (left >= 1 || right < height.length-1) {
//                 int sum = Math.min(height[left], height[right]) - curr;
//                 if (sum > max) {
//                     max = sum;
//                 }

//                 while (left >= 1 && height[left] < height[left - 1]) {
//                     left--;
//                 }
//                 while (right < height.length - 1 && height[right] < height[right + 1]) {
//                     right++;
//                 }
//             }
//             System.out.println(left+" "+i+" "+right);

//             water += max;
//             max = 0;
//             left = i;
//             right = i+1;

//         }
//         return water;

//     }
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
//         System.out.println(sol.trap(height)); // Output: 6
//     }
// }




// //find median of two sorted arrays problem
// //https://leetcode.com/problems/median-of-two-sorted-arrays/

// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int nums[] = new int[nums1.length+nums2.length];
//         for(int i =0;i<nums1.length;i++){
//             nums[i] =nums1[i];
//         }
//         for(int i =nums1.length;i<nums2.length+nums1.length;i++){
//             nums[i] =nums2[i-nums1.length];
//         }
//         Arrays.sort(nums);





//         double x;

//         if(nums.length%2==0){
//             x = (nums[nums.length/2]+nums[nums.length/2-1])/2.0;
//         }
//         else{
//             x = nums[nums.length/2];
//         }
//         return x;
        
//     }
// }

//N-Queens problem I
//https://leetcode.com/problems/n-queens/

// import java.util.*;

// class Solution {
//     public void saveboard(char board[][], List<List<String>> allBoard) {
//         List<String> list = new ArrayList<>();
//         for (int i = 0; i < board.length; i++) {
//             String row = new String(board[i]);
//             list.add(row);
//         }
//         allBoard.add(list);
//     }

//     public boolean issafe(char board[][], int row, int col) {
//         for (int i = col - 1; i >= 0; i--) {
//             if (board[row][i] == 'Q') {
//                 return false;
//             }
//         }

//         for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public void nqueen(List<List<String>> allBoard, char board[][], int col) {
//         if (col == board.length) {
//             saveboard(board, allBoard);
//             return;
//         }

//         for (int i = 0; i < board.length; i++) {
//             if (issafe(board, i, col)) {
//                 board[i][col] = 'Q';
//                 nqueen(allBoard, board, col + 1);
//                 board[i][col] = '.';
//             }
//         }
//     }

//     public List<List<String>> solveNQueens(int n) {
//         List<List<String>> allBoard = new ArrayList<>();
//         char board[][] = new char[n][n];

//         for (int i = 0; i < n; i++) {
//             Arrays.fill(board[i], '.');
//         }

//         nqueen(allBoard, board, 0);
//         return allBoard;
//     }


// }

// //N-Queens problem II
// //https://leetcode.com/problems/n-queens-ii/

// import java.util.*;

// class Solution {
//     public void saveboard(char board[][], List<List<String>> allBoard) {
//         List<String> list = new ArrayList<>();
//         for (int i = 0; i < board.length; i++) {
//             String row = new String(board[i]);
//             list.add(row);
//         }
//         allBoard.add(list);
//     }

//     public boolean issafe(char board[][], int row, int col) {
//         for (int i = col - 1; i >= 0; i--) {
//             if (board[row][i] == 'Q') {
//                 return false;
//             }
//         }

//         for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public void nqueen(List<List<String>> allBoard, char board[][], int col) {
//         if (col == board.length) {
//             saveboard(board, allBoard);
//             return;
//         }

//         for (int i = 0; i < board.length; i++) {
//             if (issafe(board, i, col)) {
//                 board[i][col] = 'Q';
//                 nqueen(allBoard, board, col + 1);
//                 board[i][col] = '.';
//             }
//         }
//     }

//     public int totalNQueens(int n) {
//         List<List<String>> allBoard = new ArrayList<>();
//         char board[][] = new char[n][n];

//         for (int i = 0; i < n; i++) {
//             Arrays.fill(board[i], '.');
//         }

//         nqueen(allBoard, board, 0);
//         return allBoard.size();
//     }


// }

//zigzag conversion problem
//https://leetcode.com/problems/zigzag-conversion/

// class Solution {
//     public String convert(String s, int numRows) {

//         if(s.length()<3 || numRows<2){
//             return s;
//         }
//         int currRow = 0;
//         boolean dir = false; // true:up,false:down
//         String[] arr =new String[numRows];
//         Arrays.fill(arr,"");



//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);

//             if(dir == false && currRow == numRows ){
//                 currRow-=2;
//                 dir=true;
                
//             }
//             else if(dir == true && currRow == -1 ){
//                 currRow+=2;
//                 dir=false;
                
//             }
            
//             if(dir==false){
//                 arr[currRow]+=ch;
//                 currRow++;
//             }else if(dir==true){
//                 arr[currRow]+=ch;
//                 currRow--;
//             }

            
//         }

//         StringBuilder sb = new StringBuilder();
//         for(String ss: arr){
//             sb.append(ss);
//         }
//         System.out.print(sb.toString());
//         return sb.toString();
//     }
// }

//4Sum problem
//https://leetcode.com/problems/4sum/

// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         List<List<Integer>> result = new ArrayList<>();
//         Arrays.sort(nums);
//         int n = nums.length;

//         for (int i = 0; i < n - 3; i++) {
//             if (i > 0 && nums[i] == nums[i - 1]) continue; 

//             for (int j = i + 1; j < n - 2; j++) {
//                 if (j > i + 1 && nums[j] == nums[j - 1]) continue; 

//                 int left = j + 1;
//                 int right = n - 1;

//                 while (left < right) {
//                     long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];

//                     if (sum == target) {
//                         result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
//                         left++;
//                         right--;

//                         while (left < right && nums[left] == nums[left - 1]) left++;
//                         while (left < right && nums[right] == nums[right + 1]) right--;

//                     } else if (sum < target) {
//                         left++;
//                     } else {
//                         right--;
//                     }
//                 }
//             }
//         }

//         return result;
//     }
// }


