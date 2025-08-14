//inorder traversal of a binary tree
//www.leetcode.com/problems/binary-tree-inorder-traversal/
import java.util.ArrayList;
import java.util.List;  


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Inorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result =new ArrayList<>();
        inorder(root,result);
        return result;
    }

    public void inorder(TreeNode root,List<Integer> result){

        if (root == null)return;

        inorder(root.left,result);
        result.add(root.val);
        inorder(root.right,result);
    }
    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Inorder sol = new Inorder();
        List<Integer> result = sol.inorderTraversal(root);
        System.out.println(result); // Output: [1, 3, 2]
    }
}