package Leetcode;

//Brute Force Solution
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] arrayOne = new int [2];



        for(int j = 0; j < nums.length; j++)
        {

            
            for(int k = j + 1; k < nums.length; k++)
            {
                if((nums[j] + nums[k])== target)
                {
                    arrayOne[0] = j;
                    arrayOne[1] = k;
                    
                }
            }
        }
        return arrayOne;
    
    }
}
