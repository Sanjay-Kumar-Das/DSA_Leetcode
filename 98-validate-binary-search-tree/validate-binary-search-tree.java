class Solution {
    long prev= Long.MIN_VALUE;
    public boolean inorder(TreeNode root){
        if(root == null) return true;
        if(! inorder(root.left)) return false;
        if(prev >= root.val) return false; 
        prev = root.val;
        return inorder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
       return inorder(root);
    }
}