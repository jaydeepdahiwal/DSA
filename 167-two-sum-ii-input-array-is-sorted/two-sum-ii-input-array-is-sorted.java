class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        if(numbers.length <= 0){
            return new int[0];
        }
        for(int i = 0; i< numbers.length; i++){
            int complement = target - numbers[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement)+1, i+1};
            }else{
                map.put(numbers[i], i);
            }
        }
        return new int[0];
    }
}