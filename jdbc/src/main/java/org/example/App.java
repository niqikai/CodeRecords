package org.example;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws InterruptedException {

        Data data = new Data();
        for (int i=0; i < 20; i++) {
            new Thread(()->{
                for (int j = 0; j < 5000; j++)
                    data.add();
            },"thread"+i).start();
        }

        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(data.count);
    }
}
class Data {
    int count = 0;
    synchronized void add() {
        count++;
    }
}