class Solution {
    public boolean isPalindrome(int x) {
        String str=String.valueOf(x);
    
       String reverse="";
       for(int i=str.length()-1;i>=0;i--){
        reverse+=str.charAt(i);
       }
       if(str.compareTo(reverse)==0){
        return true;

       }
       else{
       
        return false;
       }
    
  
      
   
    }
}