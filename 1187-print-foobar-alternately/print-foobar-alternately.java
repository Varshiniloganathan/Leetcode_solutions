class FooBar {
    private int n;
    // int count = 1;
    Semaphore s1 = new Semaphore(1);
    Semaphore s2 = new Semaphore(0);

    public FooBar(int n) {
        this.n = n;

    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
        	// printFoo.run() outputs "foo". Do not change or remove this line.
            // while(count%2==0){
            //     wait();
            // }
            s1.acquire();
        	printFoo.run();
            s2.release();

            // count++;
            // notifyAll();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
            // printBar.run() outputs "bar". Do not change or remove this line.
            // while(count%2!=0){
            //     wait();
            // }
            s2.acquire();
        	printBar.run();
            s1.release();
            // count++;
            // notifyAll();
        }
    }
}