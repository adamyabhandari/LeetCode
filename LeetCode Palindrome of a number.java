class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long rev=0;
        //long rem=0;
        long n=x;
        while(n!=0){
            rev=(rev*10)+(int)n%10;
            n=n/10;
        }
        if(x==rev){
            return true;
        }
        else{
            return false;
        }
    }
}