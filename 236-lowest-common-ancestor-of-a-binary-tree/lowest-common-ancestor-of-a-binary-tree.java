class Solution {
    public static boolean isExist(TreeNode root, TreeNode target){
        if(root == null) return false;
        if(root == target) return true;
       return  isExist(root.left,target) || isExist(root.right,target);
        
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p == root || q == root) return root;
        boolean pInLST = isExist(root.left,p);
        boolean qInLST = isExist(root.left,q);
        if(pInLST == true && qInLST == false) return root;
        if(pInLST == false && qInLST == true) return root;
        if(pInLST == true && qInLST == true ) return lowestCommonAncestor(root.left,p,q);
        else return lowestCommonAncestor(root.right,p,q);
        
    }
}