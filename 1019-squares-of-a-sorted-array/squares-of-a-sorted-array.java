class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j= nums.length - 1;
        int[] newArr = new int[nums.length];
        for(int pos = nums.length-1; pos >= 0; pos--){
            if(square(nums[i]) > square(nums[j])){
                newArr[pos] = square(nums[i]);
                i++;
            }else{
                newArr[pos] = square(nums[j]);
                j--;
            }
        }
        return newArr;
    }

    private int square(int num){
        return num*num;
    }
}