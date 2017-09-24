public class FirstSolution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        long sum=0;
        for(int i = 0;i < 32;i++){
            sum += Math.pow(2,31-i)*(n&1);
            n = n >> 1;
        }
       return (int)sum;
    }
}
