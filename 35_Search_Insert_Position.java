/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
*/

//Program
class Solution {
    public int searchInsert(int[] nums, int target) {
       int arr[] = new int[(nums.length)+1];
       int res = 0;
       for(int i=0;i<nums.length;i++)
       {
        arr[i] = nums[i];
       }
       arr[(nums.length)] = target;
       Arrays.sort(arr);
       for(int i=0;i<(nums.length)+1;i++)
       {
        if(arr[i]==target)
        {
            res = i;
            break;
        }
       }
       return res;
    }
}
