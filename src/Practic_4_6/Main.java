package Practic_4_6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(()->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("По идее первое");
        });
        service.submit(() -> {
            System.out.println("По идее второе");
        });
        service.shutdown();
    }
}
