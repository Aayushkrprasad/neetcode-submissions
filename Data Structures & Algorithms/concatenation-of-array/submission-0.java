class Solution {
    public int[] getConcatenation(int[] nums) {
      int m = nums.length*2;
      int []ar = new int [m];
      int c =0 ;
      for(int i = 0; i<m; i++){
        if(i<m/2){
            ar[i]= nums[i];
        }
        else{
            ar[i] = nums[c];
            c++;
        }

      }
     
     return ar;
    }
}