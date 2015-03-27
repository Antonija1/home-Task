package homework.example;

/**
 *
 * 27.03.2015
 * Created by Tonja
 */
public class Producer implements Runnable {
    Storage s = new Storage();
//coздаем поток:
    public Producer(Storage s) {
        this.s = s;
        new Thread(this, "Produser").start();
    }

    @Override
    public void run() {//входная точка потока
        int i = 0;
        while (true){
            s.put(i++);
        }

    }
}

