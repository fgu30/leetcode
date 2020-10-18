package leetcode;
/**
 * custom power calculation
 * integer overflow
 */
public class myPowerSolution {
    public static double myPow(double x, int n){
        if (n >= 0 ) {
            return helper(x, n);
        }else{
            return 1 / helper(x, -n);
        }
    }
    public static double helper(double x, int n){
        if(n == 0){
            return 1.0;
        }
        if(n == 1){
            return x;
        }
        double half = helper(x, n / 2);
        if (n % 2 == 0) {
            return half* half;
        }else{
            return half*half*x;
        }
    }
    public static void main(String[] args) {
        double ans = myPow(2.0, -2);
        System.out.println(ans);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.MAX_VALUE);
        
        Byte testByte = (byte) (Byte.MAX_VALUE + 1);
        System.out.println(testByte);
        // System.out.println(Byte.MIN_VALUE);

        // System.out.println(Integer.MAX_VALUE);
    }
}
