class Solution {
    Map<Integer,Integer> map;
     public TreeNode helper(int[] preorder, int[] inorder,int pl,int ph,int il, int ih) {
        if(il > ih || pl > ph) return null;
        TreeNode root = new TreeNode(preorder[pl]);
        int idx = map.get(preorder[pl]);
        int ls = idx-il;
        root.left = helper(preorder,inorder,pl+1,pl+ls,il,idx-1);
        root.right = helper(preorder,inorder,pl+ls+1,ph,idx+1,ih);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,inorder,0,n-1,0,n-1);
    }
}