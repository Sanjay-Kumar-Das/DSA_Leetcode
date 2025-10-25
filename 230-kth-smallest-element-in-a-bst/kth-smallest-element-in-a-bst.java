class Solution {
    int count;
    int res;
    public void inorder(TreeNode root,int k){
        if(root == null) return;
        inorder(root.left,k);
        count ++;
        if(count == k){
            res = root.val;
            return;
        }  
        inorder(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return res;
    }
}