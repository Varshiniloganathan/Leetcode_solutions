class Foo {
    Semaphore semaphore1 = new Semaphore(1);
    Semaphore sema2 = new Semaphore(0);
    Semaphore sema3 = new Semaphore(0);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        semaphore1.acquire();
        printFirst.run();
        sema2.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        sema2.acquire();
        printSecond.run();
        sema3.release();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        sema3.acquire();
        printThird.run();
    }
}