package pasha.edu;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        while (true){
            System.out.println(random.nextInt(10000));
            Thread.sleep(1000);
        }
    }
}
