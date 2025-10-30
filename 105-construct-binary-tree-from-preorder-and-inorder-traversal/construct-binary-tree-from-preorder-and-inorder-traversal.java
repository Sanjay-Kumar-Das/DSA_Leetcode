class Solution {
     public TreeNode helper(int[] preorder, int[] inorder,int pl,int ph,int il, int ih) {
        if(il > ih || pl > ph) return null;
        TreeNode root = new TreeNode(preorder[pl]);
        int idx = 0;
        while(inorder[idx] != preorder[pl]) idx++;
        int ls = idx-il;
        root.left = helper(preorder,inorder,pl+1,pl+ls,il,idx-1);
        root.right = helper(preorder,inorder,pl+ls+1,ph,idx+1,ih);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder,inorder,0,n-1,0,n-1);
    }
}