class FooBar {
    private int n;
    int count = 1;

    public FooBar(int n) {
        this.n = n;

    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
        	// printFoo.run() outputs "foo". Do not change or remove this line.
            while(count%2==0){
                wait();
            }
        	printFoo.run();
            count++;
            notifyAll();
        }
    }

    public synchronized void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
            // printBar.run() outputs "bar". Do not change or remove this line.
            while(count%2!=0){
                wait();
            }
        	printBar.run();
            count++;
            notifyAll();
        }
    }
}