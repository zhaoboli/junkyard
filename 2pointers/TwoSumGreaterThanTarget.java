/**
 * Prob: two-sum-greater-than-target No: 443
 * Given an array of integers, find how many pairs in the array such that 
 * their sum is bigger than a specific target number. Please return the number of pairs.
 * Given numbers = [2, 7, 11, 15], target = 24. Return 1. (11 + 15 is the only pair)
 */
public class Solution {
    /**
     * @param nums: an array of integer
     * @param target: an integer
     * @return: an integer
     */
    public int twoSum2(int[] nums, int target) {
	//first version
		if (nums == null || nums.length < 2) {
			return 0;
		}
		Arrays.sort(nums);
		int count = 0;
		int left = 0;
		for (int i = nums.length - 1; i > left; i--) {
			while (left < i) {
				if (nums[left] + nums[i]) <= target) {
					left++;
				} else {
					count += i - left;
					break;
				}
			}
		}
		return count;
    }
	
	public int twoSum2(int[] nums, int target) {
		if (nums == null || nums.length < 2) {
			return 0;
		}
		Arrays.sort(nums);
		int count = 0;
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			if ((nums[left] + nums[right]) <= target) {
				left++;
			} else {
				count += right - left;
				right--;
			}
		}		
		return count;
    }
}