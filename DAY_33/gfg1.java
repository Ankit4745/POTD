public class gfg1 {
    class Solution {
    public int minValue(String s, int k) {
        // code here

        int[] count = new int[26];
        
        for(int i=0;i<s.length();i++){
            count[s.charAt(i) - 'a']++;
        }
        
        while (k > 0){
            
            Arrays.sort(count);
            
            if (count[25] == 0){
                break;
            }
            count[25]--;
            k--;
        }
    
        
        int ans = 0;
        for(int i=0;i<count.length;i++){
            ans += count[i]*count[i];
        }
        
        return ans;
    }
    
}
}
