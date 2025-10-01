class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st  = new Stack<>();
        int n = nums2.length;
        st.push(nums2[n-1]);
        map.put(nums2[n-1],-1);
        for(int i=n-2;i>=0;i--){
            if(!st.isEmpty()){
                while(!st.isEmpty()){
                    if(st.peek()>nums2[i]){
                        map.put(nums2[i],st.peek());
                        break;
                    } 
                    else st.pop();
                }
            }
            if(st.isEmpty()){
                map.put(nums2[i],-1);
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])) nums1[i]=map.get(nums1[i]);
        }
        return nums1;
    }
}