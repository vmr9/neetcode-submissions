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
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {

        if(root == null){
            return root;
        }
        
        TreeNode parent = null;
        TreeNode curr = root;

        while(curr != null && curr.val != key){
            parent = curr;
            if(key > curr.val){
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }

        if(curr == null) {
            return root;
        }

        if(curr.left == null || curr.right == null){
            TreeNode child = curr.right != null ? curr.right : curr.left;
            if(parent == null) return child;
            if(parent.right == curr){
                parent.right = child;
            } else if(parent.left == curr){
                parent.left = child;
            }
        } else {
            TreeNode delNode = curr;
            TreeNode par = null;
            curr = curr.right;
            while(curr.left != null) {
                par = curr;
                curr = curr.left;
            }

            if(par != null){
                par.left = curr.right;
                curr.right = delNode.right;
            }
            curr.left = delNode.left;
            if(parent == null) return curr;

            if(parent.left == delNode){
                parent.left = curr;
            } else if(parent.right == delNode){
                parent.right = curr;
            }
        }
        return root;
    }
}