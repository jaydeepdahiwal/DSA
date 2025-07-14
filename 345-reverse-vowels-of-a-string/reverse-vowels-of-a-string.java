class Solution {
    public String reverseVowels(String s) {
        char[] sArr = s.toCharArray();
        int left = 0;
        int right = sArr.length - 1;
        while(left < right){
            if((Character.toLowerCase(sArr[left]) == 'a' || Character.toLowerCase(sArr[left]) == 'e' || Character.toLowerCase(sArr[left]) == 'i' || Character.toLowerCase(sArr[left]) == 'o' || Character.toLowerCase(sArr[left]) == 'u') && ((Character.toLowerCase(sArr[right]) == 'a') || Character.toLowerCase(sArr[right]) == 'e' || Character.toLowerCase(sArr[right]) == 'i' || Character.toLowerCase(sArr[right]) == 'o' || Character.toLowerCase(sArr[right]) == 'u'))
            {
                char temp = sArr[left];
                sArr[left] = sArr[right];
                sArr[right] = temp;
                left++;
                right--;
            }
            else{
                if(!(Character.toLowerCase(sArr[left]) == 'a' || Character.toLowerCase(sArr[left]) == 'e' || Character.toLowerCase(sArr[left]) == 'i' || Character.toLowerCase(sArr[left]) == 'o' || Character.toLowerCase(sArr[left]) == 'u')){
                    left++;
                }
                if(!(Character.toLowerCase(sArr[right]) == 'a' || Character.toLowerCase(sArr[right]) == 'e' || Character.toLowerCase(sArr[right]) == 'i' || Character.toLowerCase(sArr[right]) == 'o' || Character.toLowerCase(sArr[right]) == 'u')){
                    right--;
                }
            }
        }
        return new String(sArr);
    }
}