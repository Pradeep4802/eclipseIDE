public class One {

    public void primeChecker(int primeNum, int start) {
        // base condition
        if(start == primeNum) {
            return ;
        }
        boolean prime = primeReturn(primeNum);
        if(prime == true) {
            
        }
        if (prime == false) {
            
        }
    }

    public boolean primeReturn(int prime) {
        if(prime % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        One o = new One();
        o.primeChecker(7, 2);
    }
}
