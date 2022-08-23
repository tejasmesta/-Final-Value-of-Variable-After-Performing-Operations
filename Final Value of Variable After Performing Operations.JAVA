class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        
        for(String op:operations)
        {
            if(op.charAt(0)=='-')
            {
                --ans;
            }
            else if(op.charAt(2)=='-')
            {
                ans--;
            }
            else if(op.charAt(0)=='+')
            {
                ans++;
            }
            else{
                ++ans;
            }
        }
        
        return ans;
    }
}
