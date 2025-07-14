class Solution {
    public String reverseVowels(String s) {
        char[] sArr = s.toCharArray();
        int left = 0;
        int right = sArr.length -1;
        while(left < right){
            if(isVowel(Character.toLowerCase(sArr[left])) && isVowel(Character.toLowerCase(sArr[right]))){
                char temp = sArr[left];
                sArr[left] = sArr[right];
                sArr[right] = temp;
                left++;
                right--;
            }else{
                if(!isVowel(Character.toLowerCase(sArr[left]))) left++;
                if(!isVowel(Character.toLowerCase(sArr[right]))) right--;
            }
        }
        return new String(sArr);
    }

    public boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
}