import java.util.Random;

public class RandomNaturalNumber {
    public static void main(String[] args){
        Random random = new Random();
        int number = random.nextInt(100000) + 11;
        int sum = 0;
        System.out.println("Число:" + number);
        while(number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
         System.out.println("Сума розрядів: " + sum);
    }
}
