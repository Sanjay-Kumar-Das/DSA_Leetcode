class Solution {
    public static int levels(TreeNode root, int[]ans){
        if(root == null) return 0;
        int leftlvl = levels(root.left,ans);
        int rightlvl = levels(root.right,ans);
        int mx = leftlvl+rightlvl;
        ans[0] = Math.max(mx,ans[0]);
        return 1 + Math.max(leftlvl,rightlvl);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int[] ans = {0};
        levels(root,ans);
        return ans[0];
    }
}