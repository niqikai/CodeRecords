package org.example.thread;
class Product {
    int count = 0;

    public  synchronized void add() {
        while (count >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        System.out.println("add count: " +count);
        notifyAll();
    }
    public synchronized void dec() {
        while (count <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        System.out.println("dec count: " +count);
        notifyAll();
    }
}
public class Consume {

    public static void main(String[] args) {
        Product product = new Product();

        new Thread(() -> {
            while (true) {
                product.add();
            }
        }).start();

        new Thread(() -> {
            while (true) {
                product.dec();
            }
        }).start();



    }

}














