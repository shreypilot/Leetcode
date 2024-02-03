class Solution {
    public String reverseOnlyLetters(String s) {
        
        char[] sArray = s.toCharArray();
        
        int start = 0; int end =sArray.length - 1;
        
        while(start<end){
            if(Character.isLetter(sArray[start]) && Character.isLetter(sArray[end])){
              char temp = sArray[start];
                sArray[start] = sArray[end];
                sArray[end] = temp;
                start++;
                end--;
            }else if(!Character.isLetter(sArray[start])){
                start++;
            }else if(!Character.isLetter(sArray[end])){
                end -- ;
                
            }
        }
        return new String(sArray);
    }
               
}