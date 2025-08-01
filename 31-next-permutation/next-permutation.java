class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;

        // Step 1: Find the first decreasing element from the end
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                idx = i - 1;
                break;
            }
        }

        // Step 2: If such element exists, find just larger element and swap
        if (idx != -1) {
            for (int i = n - 1; i > idx; i--) {
                if (nums[i] > nums[idx]) {
                    // Swap
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                    break;
                }
            }
        }

        // Step 3: Reverse the part from idx+1 to end
        int left = idx + 1, right = n - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
