// Given an integer array nums, return an integer array counts where counts[i] is the number of smaller elements to the right of nums[i].

 

// Example 1:

// Input: nums = [5,2,6,1]
// Output: [2,1,1,0]
// Explanation:
// To the right of 5 there are 2 smaller elements (2 and 1).
// To the right of 2 there is only 1 smaller element (1).
// To the right of 6 there is 1 smaller element (1).
// To the right of 1 there is 0 smaller element.
// Example 2:

// Input: nums = [-1]
// Output: [0]
// Example 3:

// Input: nums = [-1,-1]
// Output: [0,0]

// program 
class Solution {
    public List<Integer> countSmaller(int[] nums) {
       int n = nums.length;
        List<Integer>list = new ArrayList<>();
        for(int num : nums)
        {
            list.add(num);
        }
         List<Integer>list1 = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int m = list.get(i);
            int count = 0;
            for(int j = i+1;j<n;j++)
            {
                if(nums[j] < m)
                {
                    count++;
                }
            }
            
            list1.add(count);
        }
        return list1;
    }
}
