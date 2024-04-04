class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int result1 = nums[0]*nums[1]*nums[nums.length-1];
        int result2 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        int result = Integer.max(result1,result2);
        return result;
    }
}