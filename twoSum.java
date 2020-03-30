package leetCode;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

public class twoSum {
	
	public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++ ){
                if(target == nums[i] + nums[j]){
                	return new int[] {i , j}; 
                }
            }
        }
    throw new IllegalArgumentException("No 2 sum solution");   
    }   

	public static void main(String[] args) {
		int nums[] = {1, 4, 5, 6, 4, 8};
		
		twoSum(nums, 6);

	}

}
