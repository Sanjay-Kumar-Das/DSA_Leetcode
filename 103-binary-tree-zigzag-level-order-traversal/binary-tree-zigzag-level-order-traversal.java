class Solution {
    public static int levels(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public static void bfs(TreeNode root,int lvl,int tar,List<Integer>list){
        if(root == null)return;
        if(lvl == tar)list.add(root.val);
        if(root.left != null) bfs(root.left,lvl+1,tar,list);
        if(root.right != null) bfs(root.right,lvl+1,tar,list);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();
       int lvl = levels(root);
       for(int i=0;i<lvl;i++){
        List<Integer> list = new ArrayList<>();
        int x =i;
        bfs(root,0,x,list);
        if(i % 2 != 0) Collections.reverse(list);
        ans.add(list);
       }
       return ans;
    }
}