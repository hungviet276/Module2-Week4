public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int n =0;n<=10;n++){
            boolean check = true;
            if (n < 2) {
                check =false;
            }
            // check so nguyen to khi n >= 2
            int squareRoot = n-1;
            for (int i = 2; i <= squareRoot; i++) {
                if (n % i == 0) {
                    check = false;
                }
            }
            if (check){
                System.out.println(n);
            }
        }
    }
}
