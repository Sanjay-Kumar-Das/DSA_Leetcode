class Solution {
    public static TreeNode invert(TreeNode root){
        if(root == null) return root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
        return root;
    }
    public static boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        if(isSameTree(p.left,q.left)== false) return false;
        if(isSameTree(p.right,q.right) == false) return false;
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        TreeNode inv = invert(root.left);
        return isSameTree(inv,root.right);
    }
}