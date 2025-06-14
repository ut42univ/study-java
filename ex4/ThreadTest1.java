class ExThread1 extends Thread {
    double x, y;

    ExThread1(double xx, double yy) {
        x = xx;
        y = yy;
    }

    public void run() { // (2)スレッド実行コードをrunメソッドに記載
        for (int i = 1; i <= 10; i++) { // (3)
            System.out.println(getName() + ":" + "x = " + (x + i) + "," + "y = " + (y + i));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class ThreadTest1 {
    public static void main(String[] args) {
        // (4)クラスExThread1のオブジェクトを生成
        ExThread1 thread1 = new ExThread1(0.0, 0.0);
        ExThread1 thread2 = new ExThread1(100.0, 100.0);

        // (5)スレッドの実行
        thread1.start();
        thread2.start();
    }
}