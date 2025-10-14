class Solution {
    public static int levels(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public boolean isBalanced(TreeNode root) {
      if(root == null) return true;
      int lh = levels(root.left);
      int rh = levels(root.right); 
      if(Math.abs(lh-rh) > 1) return false;
      return isBalanced(root.left) && isBalanced(root.right);
    }
}