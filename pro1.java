public class pro1 { // subtract the product and sum of digits of an integer
    public int subtractProductAndSum(int n) {
        int product=1,sum=0,digit,ans=0;
        while(n>0){
            digit=n%10;
            product*=digit;
            sum+=digit;
            n/=10;
            ans=product-sum;
        }
        return ans;
    }
}