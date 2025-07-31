class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int [] newArr = new int[nums.length];
        for(int pos = newArr.length - 1; pos >= 0; pos--){
            if(square(nums[left]) > square(nums[right])){
                newArr[pos] = square(nums[left]);
                left++;
            }else{
                newArr[pos] = square(nums[right]);
                right--;
            }
        }
        return newArr;
    }

    private int square(int num){
        return num*num;
    }
}