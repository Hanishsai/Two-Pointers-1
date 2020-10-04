// Time Complexity :O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Edge cases


// Your code here along with comments explaining your approach: Swapiing elements 0 with left pointer and elements 2 with right pointer

class Solution {
    public void sortColors(int[] nums) {
        int p1 = 0, p2 = 0, p3 = nums.length-1;
       while(p1<=p3){
           if(nums[p1] == 1) p1++;
        else if(nums[p1] == 0){
            swap(p1,p2, nums);
            p1++;
            p2++;
        }
        else if(nums[p1] == 2) {
            swap(p1,p3, nums);
            p3--;
          }
       }
    }
    private void swap(int x, int y, int[] nums){
     int  temp = nums[x];
             nums[x] = nums[y];
             nums[y] = temp; 
    }
}
