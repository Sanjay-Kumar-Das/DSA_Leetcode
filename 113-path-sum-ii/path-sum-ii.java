class Solution {
    public static void findPath(TreeNode root,List<Integer> list, List<List<Integer>>ans,int sum){
        if(root == null) return;
        if(root.left == null && root.right == null){
            if(sum-root.val == 0){
                list.add(root.val);
                ans.add(list);
            }
            return;
        }
        sum -= root.val;
        list.add(root.val);
        if(root.left != null)findPath(root.left,new ArrayList<>(list),ans,sum);
        if(root.right != null) findPath(root.right,new ArrayList<>(list),ans,sum);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findPath(root,list,ans,targetSum);
        return ans;
    }
}