package DAY_18;

public class gfg2 {
    class Solution {
    public boolean areRotations(String s1, String s2) {
    
        // code here
       s2= s2+s2;
       if (s2.contains(s1)) return true;
       else return false;
        
        

    }
    
}
}
