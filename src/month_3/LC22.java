package month_3;

import java.util.concurrent.Semaphore;

public class LC22 {
    class FooBar {
        private int n;
        Semaphore s1 = new Semaphore(1);
        Semaphore s2 = new Semaphore(0);

        public FooBar(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                s1.acquire();
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                s2.release();
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                s2.acquire();
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                s1.release();
            }
        }
    }
    class FooBar3 {
        private int n;
        // 标志位，控制执行顺序，true执行printFoo，false执行printBar
        private volatile boolean type = true;
        private final Object foo=  new Object(); // 锁标志

        public FooBar3(int n) {
            this.n = n;
        }
        public void foo(Runnable printFoo) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                synchronized (foo) {
                    while(!type){
                        foo.wait();
                    }
                    printFoo.run();
                    type = false;
                    foo.notifyAll();
                }
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                synchronized (foo) {
                    while(type){
                        foo.wait();
                    }
                    printBar.run();
                    type = true;
                    foo.notifyAll();
                }
            }
        }
    }
    class FooBar5 {
        private int n;

        public FooBar5(int n) {
            this.n = n;
        }

        volatile boolean permitFoo = true;

        public void foo(Runnable printFoo) throws InterruptedException {
            for (int i = 0; i < n; ) {
                if(permitFoo) {
                    printFoo.run();
                    i++;
                    permitFoo = false;
                }else{
                    Thread.yield();
                }
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {
            for (int i = 0; i < n; ) {
                if(!permitFoo) {
                    printBar.run();
                    i++;
                    permitFoo = true;
                }else{
                    Thread.yield();
                }
            }
        }
    }


}



/*

    1. private BlockingQueue<Integer> bar = new LinkedBlockingQueue<>(1);
    private BlockingQueue<Integer> foo = new LinkedBlockingQueue<>(1);
    利用LinkedBlockingQueue的take的等待机制
    2. 利用标志位的truefalse和Thread.yield()
    3. 3和5要么使用锁 要么使用阻塞。



*/
