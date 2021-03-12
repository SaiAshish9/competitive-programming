class Main {
  static int reverse(int x){
   long n=x;
    long ans=0;
    int sign =1;
    if(x<0) {
      n*=-1;
      sign = -1;
      };
    while(n>0){
      ans= ans*10 + n%10;
      n/=10;
    }
    if(ans > Integer.MAX_VALUE){
        return 0;
    }     
    return (int)(sign*ans);  }

  public static void main(String[] args) {
    System.out.println(reverse(123));
  }
}