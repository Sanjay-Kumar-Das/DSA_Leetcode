class Solution {
    public static int levels(TreeNode root,boolean[] ans){
        if(root == null) return 0;
        int leftLevel = levels(root.left,ans);
        int rightLevel = levels(root.right,ans);
        if(Math.abs(leftLevel - rightLevel) > 1) ans[0] = false;
        return 1+Math.max(leftLevel,rightLevel);
    }
    public boolean isBalanced(TreeNode root) {
      boolean[] ans = {true};
      levels(root,ans);
      return ans[0];
    }
}