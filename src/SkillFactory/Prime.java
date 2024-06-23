package SkillFactory;

public class Prime {
    public static boolean isPrime(int a) {
        boolean b = a > 1;
        for (int i = 2; i < a; i++) {
            if (a % i == 0){
                b = false;
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
}
