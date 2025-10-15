class Solution {
    public static boolean pathSum(TreeNode root,int target){
        if(root == null) return false;
        if(root.left == null && root.right == null){
            if(target-root.val == 0) return true;
            return false;
        }
        target -= root.val;
        return pathSum(root.left,target) || pathSum(root.right,target);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
       return pathSum(root,targetSum);
    }
}