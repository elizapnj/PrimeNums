public class PrimeNum {
    
    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
              return false;
            }
        } 
        
        return true;
    }
    
    public int primeSum(int num) {
        int count = 0;
        int sum = 0;
        int curr = 0;
        
        while (count < num) {
            if (isPrime(curr) == true) {
                count++;
                sum += curr;
            }
            
            curr++;
        }
        
        return sum;
    }
    
    public static void main(String []args) {
        PrimeNum pr = new PrimeNum(); 
        System.out.print(pr.primeSum(101));
    }
}
