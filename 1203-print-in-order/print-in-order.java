class Foo {
    boolean one;
    boolean two;

    public Foo() {
        one = false;
        two = false;

    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        one = true;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        while(!one){
            wait();
        }
        printSecond.run();
        two = true;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        while(!two) wait();
        printThird.run();
    }
}