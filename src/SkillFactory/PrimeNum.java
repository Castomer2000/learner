package SkillFactory;

public class PrimeNum {
    public static void allPrimeNum(int start, int finish){
        for (int number = start; number <= finish; number++) {
            if(Prime.isPrime(number)){
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        allPrimeNum(2, 100);
    }
}
