/* 
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length,m=nums2.length,a=0;
        double b=0;
        int arr[] = new int[n+m];
        for(int i=0;i<n;i++)
        {
            arr[i]=nums1[i];
        }
        for(int i=n;i<(n+m);i++)
        {
            arr[i]=nums2[a];
            a++;
        }
        Arrays.sort(arr);
        if((n+m)%2!=0)
        {
            b = arr[(n+m)/2];
        }
        else
        {
            b =(arr[((n+m)/2)-1]+arr[((n+m)/2)])/2.0;  
        }
        return b;
    }
}
