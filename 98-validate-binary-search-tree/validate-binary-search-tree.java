class Solution {
    public static void inorder(TreeNode root, List<Integer> list){
        if(root == null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)) return false;
        }
        return true;
    }
}