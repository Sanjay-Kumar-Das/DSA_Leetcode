class Solution {
    HashMap<Integer,Integer> map;
    public TreeNode helper(int[] postorder,int il, int ih,int pl,int ph){
        if(il > ih || pl > ph) return null;
        TreeNode root = new TreeNode(postorder[ph]);
        int idx = map.get(postorder[ph]);  // root idx
        int rs = ih-idx;  // right subtree size
        root.left = helper(postorder,il,idx-1,pl,ph-rs-1);
        root.right= helper(postorder,idx+1,ih,ph-rs,ph-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();
        int n = inorder.length;
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        return helper(postorder,0,n-1,0,n-1);
    }
}