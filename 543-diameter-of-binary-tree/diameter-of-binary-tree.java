class Solution {
    public static int levels(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int length = levels(root.left)+levels(root.right);
        int leftLength = diameterOfBinaryTree(root.left);
        int rightLength = diameterOfBinaryTree(root.right);
        return Math.max(length,Math.max(leftLength,rightLength));

    }
}