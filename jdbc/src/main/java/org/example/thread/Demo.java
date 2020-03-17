package org.example.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.*;

/**
 * 创建线程的方式
 */
public class Demo {
    public static void main(String[] args) {
        ExecutorService exPool = Executors.newCachedThreadPool();
        ExecutorService fixedPool = Executors.newFixedThreadPool(5);
        fixedPool.execute(new RunnableThread());
    }
}
// 继承Thread类
class ExtendsThread extends Thread {
    @Override
    public void run() {
        System.out.println("继承Thread类 ... ...");
    }
}

// 实现 Runnable 接口
class RunnableThread implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("runnable ... ...");
        }
        Map<String, String> map = new HashMap<>();
    }
    public boolean isValid(String s) {
        // 请在此编辑你的代码
        Map<String,String> map = new HashMap<>();
        map.put("(",")");
        map.put("[","]");
        map.put("{","}");
        String[] strArray = s.split("");
        if (strArray.length%2 != 0) return false;

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < strArray.length; i++) {
            if (map.containsKey(strArray[i])) {
                stack.push(strArray[i]);
                continue;
            }

            if (strArray[i].equals(stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }

        return true;
    }

}

// 实现 Callable 接口
class CallableThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 123;
    }
}