//this is very simple program that identifies if a number is prime or not



import java.util.ArrayList;

class PrimeDirective {
  
//check to see if a number is prime
  public boolean isPrime (int num){

//checking for a special case of 2. because 2 is divisible by 2 but is prime
    if (num == 2){
      return true;
    }

//we iterate through every number from 1 to the number-1 to see if the number of choice is divisible by.
    for (int i = 2; i < num ; i++){
      if (num%i==0){
        return false;
      } 
    }

     return true;
  }

//returns a list of prime numbers from a group of given numbers

  public ArrayList<Integer> onlyPrimes(int []numbers){

    ArrayList<Integer> primes = new ArrayList<Integer>();
    
    for (int number : numbers){
      if (isPrime(number)){
        primes.add(number);
      }
    }
    return primes;

  }
  
 
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    System.out.println(pd.isPrime(28));

   System.out.println(pd.onlyPrimes(numbers));

  }  

}