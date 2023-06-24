package Revision;

public class Power {
    public double myPow(double x, int n) {
        boolean flag = false;
        if(n % 2 != 0){
            n--;
            flag = true;
        }
        double ans = myPowPos(x,n/2);
        if(flag){
            ans *= ans;
            return ans*x;
        }
        ans *= ans;
        return ans;

    }
    public double myPowPos(double x, int n){
        if(n == 0){
            return 1.0;
        }
        if(n < 0){
            n = Math.abs(n);
            x = 1/x;
        }
        double ans = myPowPos(x, n-1);
        return ans * x;
    }

}
