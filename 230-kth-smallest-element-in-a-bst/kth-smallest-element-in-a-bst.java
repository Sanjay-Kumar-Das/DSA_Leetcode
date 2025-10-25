class Solution {
    public static void traverse(TreeNode root,List<Integer>arr){
        if(root == null) return;
        arr.add(root.val);
        traverse(root.left,arr);
        traverse(root.right,arr);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> arr = new ArrayList<>();
        traverse(root,arr);
        Collections.sort(arr);
        return arr.get(k-1);
    }
}