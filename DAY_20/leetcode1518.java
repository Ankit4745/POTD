public class leetcode1518 {
    class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int n= numBottles;
        int count=0;
        while(numBottles>= numExchange){
            numBottles -=numExchange;
            numBottles++;
            count++;
        }
        return count+n;
    }
}

}
