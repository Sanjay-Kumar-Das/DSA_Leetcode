class Solution {
    public static void findPath(TreeNode root,String s,List<String>ans){
        if(root == null) return;
        if(root.left == null && root.right == null){
            s += root.val;
            ans.add(s);
            return;
        }
        findPath(root.left,s+root.val+"->",ans);
        findPath(root.right,s+root.val+"->",ans);
    }
    public List<String> binaryTreePaths(TreeNode root) {
      List<String> ans = new ArrayList<>(); 
       findPath(root,"",ans);
       return ans;
    }
}