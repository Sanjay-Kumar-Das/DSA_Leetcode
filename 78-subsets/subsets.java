class Solution {
    public static List<List<Integer>> printSubset(int i,int[] nums,List<Integer> arr, List<List<Integer>> ans){
        if(i==nums.length){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<arr.size();j++){
                list.add(arr.get(j));
            }
            ans.add(list);
            return ans;
        }
        printSubset(i+1,nums,arr,ans);
        arr.add(nums[i]);
        printSubset(i+1,nums,arr,ans);
        arr.remove(arr.size()-1);
        return ans;
    }
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> arr = new ArrayList<>();
        return printSubset(0,nums,arr,ans);
    }
}