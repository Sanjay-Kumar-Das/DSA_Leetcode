class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int idx =0;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mx){
                mx = nums[i];
                idx =i;
            }
        }
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for(int i=idx;i>=0;i--){
            
            if(!st.isEmpty()){
                while(st.size()>0){
                    if(st.peek()>nums[i]){
                        ans[i]=st.peek();
                        break;
                    } 
                    else st.pop();
                }
            }
           if(st.isEmpty()){
                ans[i]=-1;
            }
            st.push(nums[i]);
        }
        for(int i=nums.length-1;i>idx;i--){
            if(!st.isEmpty()){
                while(st.size()>0){
                    if(st.peek()>nums[i]){
                         ans[i]=st.peek();
                         break;
                    }
                    else st.pop();
                }
            }if(st.isEmpty()){
                ans[i]=-1;
            }
          st.push(nums[i]);
        }
        return ans;
    }
}