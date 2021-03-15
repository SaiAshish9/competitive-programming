class p{
    static boolean isPalindrome(int x){
        int n=x;
        if(x<0){
            return false;
        }
        int rev=0;
        while(n>0){
            rev= rev*10 + n%10;
            n/=10;
        }
        if(x==rev){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}