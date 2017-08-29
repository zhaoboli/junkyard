/**
 * Prob: 4sum No: 58
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target
 * Find all unique quadruplets in the array which gives the sum of target.
 * Notice
 * 
 * Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a = b = c = d)
 * The solution set must not contain duplicate quadruplets.
 * Example: 
 * Given array S = {1 0 -1 0 -2 2}, and target = 0. A solution set is:
 * (-1, 0, 0, 1)
 * (-2, -1, 1, 2)
 * (-2, 0, 0, 2)
 * 
 * 思路：
 *  跟3sum 一样，固定一个，然后再求3sum
 *  去重的技巧跟3sum类似
 */
public class Solution {
    /**
     * @param numbers : Give an array numbersbers of n integer
     * @param target : you need to find four elements that's sum of target
     * @return : Find all unique quadruplets in the array which gives the sum of
     *           zero.
     */
    public ArrayList<ArrayList<Integer>> fourSum(int[] numbers, int target) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (numbers == null || numbers.length < 4) {
			return result;
		}
		Arrays.sort(numbers);
		
		for (int i = 0; i < numbers.length - 3; i++) {
			if (i >= 1 && numbers[i] == numbers[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < numbers.length - 2; j++) {
				if (j >= i + 2 && numbers[j] == numbers[j - 1]) {
					continue;
				}
				int left = j + 1;
				int right = numbers.length - 1;
				while (left < right) {
					int sum = numbers[i] + numbers[j] + numbers[left] + numbers[right];
					if (sum == 0) {
						ArrayList<Integer> ans = new ArrayList<Integer>();
						ans.add(numbers[i]);
						ans.add(numbers[j]);
						ans.add(numbers[left]);
						ans.add(numbers[right]);
						result.add(ans);
						left++;
						right--;
						while (left < right && numbers[left] == numbers[left - 1]) {
							left++;
						}
						while (left < right && numbers[right] == numbers[right + 1]) {
							right--;
						}
					} else if (sum < 0) {
						left++;
					} else {
						right--;
					}
				}
			}
		}
		return result;
    }
}