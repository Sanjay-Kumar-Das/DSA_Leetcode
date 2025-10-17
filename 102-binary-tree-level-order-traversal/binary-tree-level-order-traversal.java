class Solution {
    public static int findLevel(TreeNode root){
        if(root == null) return 0;
        return 1+ Math.max(findLevel(root.left),findLevel(root.right));
    }
    public static void print(TreeNode root,int level,int n,List<Integer>list){
        if(root == null) return;
        if(level == n) list.add(root.val);
        print(root.left,level+1,n,list);
        print(root.right,level+1,n,list);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
       int n = findLevel(root);
        for(int i=0;i<n;i++){
            List<Integer> list = new ArrayList<>();
            int x = i;
            print(root,0,x,list);
            ans.add(list);
        }
        return ans;
    }
}