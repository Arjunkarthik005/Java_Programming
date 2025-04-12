/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

*/

//Program

class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        for(int a : set)
        {
            int temp = a;
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==temp)
                {
                    count++;
                }
            }
            if(count>((nums.length)/2)){
                 System.out.print(temp);
                res = temp;}

        }
        return res;
    }
}
