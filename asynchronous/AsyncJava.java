import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class AsyncJava {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadA t1 = new ThreadA("スレッドA-1");
        ThreadA t2 = new ThreadA("スレッドA-2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("-----------------------------------");

        ThreadB r1 = new ThreadB("スレッドB-1");
        ThreadB r2 = new ThreadB("スレッドB-2");
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r2);
        t3.start();
        t4.start();
        t3.join();
        t4.join();

        System.out.println("-----------------------------------");

        ExecutorService es1 = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            es1.submit(new ThreadB(String.format("スレッドC-%d", i)));
        }
        es1.shutdown();
        es1.awaitTermination(10000, TimeUnit.SECONDS);
        
        System.out.println("-----------------------------------");

        List<Future<String>> futures = new ArrayList<Future<String>>();
        ExecutorService es2 = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            Future<String> f = es2.submit(new ThreadD(String.format("スレッドD-%d", i)));
            futures.add(f);
        }
        for (Future<String> f : futures) {
            System.out.println(f.get());
        }
        es2.shutdown();
        es2.awaitTermination(10000, TimeUnit.SECONDS);
        t1.run();
    }

}

class ThreadA extends Thread {

    private String name;
    public ThreadA(String name) {
        super();
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(String.format("%s start.", this.name));
        try {
            Thread.sleep(new Random().nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%s end.", this.name));
    }
}

class ThreadB implements Runnable {

    private String name;
    public ThreadB(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(String.format("%s start.", this.name));
        try {
            Thread.sleep(new Random().nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%s end.", this.name));
    }
}

class ThreadD implements Callable<String> {

    private String name;
    public ThreadD(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.println(String.format("%s start.", this.name));
        int sleepTime = new Random().nextInt(3000);
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%s end.", this.name));
        return String.format("%s return %d", this.name, sleepTime);
    }
}
