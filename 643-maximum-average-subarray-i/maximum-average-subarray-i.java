class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }

        int maxSum = sum;
        int leftPointer = 0;
        int rightPointer = k;

        while(rightPointer < nums.length){
            sum -= nums[leftPointer];
            leftPointer++;

            sum += nums[rightPointer];
            rightPointer++;

            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}