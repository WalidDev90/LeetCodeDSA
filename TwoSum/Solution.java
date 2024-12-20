class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>=0;j--){
                if(nums[i] + nums[j] == target && i != j){
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
                if(j == i){
                    break;
                }
            }
        }
        return array;
    }
}