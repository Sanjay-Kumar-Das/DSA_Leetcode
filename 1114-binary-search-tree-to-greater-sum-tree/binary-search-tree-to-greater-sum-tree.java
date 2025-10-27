class Solution {
    public static void inorder(TreeNode root,List<Integer>arr){
        if(root == null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public static void greaterSum(TreeNode root,Map<Integer,Integer> map){
        if(root == null) return;
        greaterSum(root.left,map);
        int n = map.get(root.val);
        root.val = n;
        greaterSum(root.right,map);
    }
    public TreeNode bstToGst(TreeNode root) {
       Map<Integer,Integer> map = new HashMap<>();
       List<Integer> arr = new ArrayList<>();
       inorder(root,arr);
       int sum=0;
       for(int i=arr.size()-1;i>=0;i--){
            int val = arr.get(i);
            sum += val;
            map.put(val,sum);
       }
       greaterSum(root,map);
       return root;
    }
}