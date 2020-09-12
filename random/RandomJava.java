import java.util.Random;

public class RandomJava {
  public static void main(String[] args) {
    Random random = new Random();
    int num = random.nextInt(6) + 1;
    System.out.println(num);
  }
}

