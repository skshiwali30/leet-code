class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for(String str : operations) {
            if (str.contains("+"))
                res++;
            else
                res--;
        }
        return res;
    }
}