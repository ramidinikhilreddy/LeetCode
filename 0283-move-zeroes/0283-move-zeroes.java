class Solution {
    public void moveZeroes(int[] nums) {
      for (int i = 0, j = 1; i < nums.length - 1 && j < nums.length; i++, j++){
            if (nums[i] == 0 && nums[j] != 0) {
                int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			} else if (nums[i] == 0 && nums[j] == 0) {
				i = i - 1;
			}
        }
    }
}