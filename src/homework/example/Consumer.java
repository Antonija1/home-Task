package homework.example;

/**
 *
 * 27.03.2015
 * Created by Tonja
 */
public class Consumer implements Runnable {
    Storage s = new Storage();

    public Consumer(Storage s) {
        this.s = s;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while (true){
            s.get();
        }
    }
}
