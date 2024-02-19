package week1;

public class primeNumber {
    public static void main(String[] args) {

        for (int num=2; num<100; num++){
            boolean result= true;
            for (int i=2; i<num; i++){
                if (num % i == 0) {
                    result = false;
                    break;
                }
            }
            if (result){
                System.out.println(num+ " is a prime number");
            }
        }
    }
}
