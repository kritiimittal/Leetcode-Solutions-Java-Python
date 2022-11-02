class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=x;
        int pnum=0;
        while(x>0){
            int rem=x%10;
            pnum=rem+pnum*10;
            x=x/10;
        }
        System.out.println(pnum);
        return num==pnum?true:false;
    }
}
