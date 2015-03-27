package homework.example;

import java.util.concurrent.TimeUnit;

/**
 *  Пока было по одному Producer-у и Consumer-у работало через раз, когда добавила еще- все время выдает "Received: 0."
 * Похоже этот поток все перехватывает
 *27.03.2015
 * Created by Tonja
 */
public class Storage {
    private int storage ;
    boolean valueSet = false;//флажок

    synchronized void get() {//сериализовали доступ к методу- в одно и то же время разрешен доступ к этому методу только
        // одному потоку
        while (!valueSet) {//рекомендовано выполнять вызовы метода  wait() внутри цикла, проверяющего условие, по
            // которому поток ожидает
            try {
                TimeUnit.SECONDS.sleep(1);
                wait(); // метод  wait() вынуждает вызывающий поток отдать монитор и приостановить выполнение до тех пор,
                // пока какой-нибудь другой поток не войдет в тот же монитор и не вызовет метод notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Sent:     " + storage);
            valueSet = false;
            notify();//возобновляет работу потока, который вызвал метод  wait() в том же объекте
        }
    }

    synchronized void put(int storage) {
        while (valueSet) {
            try {
                TimeUnit.SECONDS.sleep(3);//используем не Thread.sleep, а TimeUnit.SECONDS.sleep(), чтобы приостановить
                // работу потока  на заданное колличество секунд
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Received: " + storage);
        this.storage = storage;
        valueSet = true;
        notify();

    }

    public static void main(String[] args) {
        Storage s = new Storage();
        Producer p1 = new Producer(s);
        Producer p2 = new Producer(s);
      //  Consumer c1 = new Consumer(s);
       // Consumer c2 = new Consumer(s);
       // Consumer c3 = new Consumer(s);
    }
}
