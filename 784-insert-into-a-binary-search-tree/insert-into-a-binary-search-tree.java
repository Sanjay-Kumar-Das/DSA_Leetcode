class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
       TreeNode node = new TreeNode(val);
       if(root == null) return node;
       if(root.val > val && root.left == null) root.left = node;
       else if(root.val < val && root.right == null) root.right = node;
       else if(root.val > val)  insertIntoBST(root.left,val);
       else if(root.val < val)  insertIntoBST(root.right,val);
       return root;
    }
}