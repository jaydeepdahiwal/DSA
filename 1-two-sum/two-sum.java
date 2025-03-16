class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] newArr = new int[2];
        if(nums.length<=0){
            return new int[0];
        }
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    newArr[0] = i;
                    newArr[1] = j;
                }
            }
        }
        return newArr;
    }
}