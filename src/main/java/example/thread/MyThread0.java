package example.thread;

public class MyThread0 extends Thread {

    private int ticketNum = 5;

    public void run() {
        for (int i = 0; i < 10; ++i) {
            if (ticketNum > 0){
                System.out.println(this.getName() + ": ticketNum = " + ticketNum--);
            }
        }
    }
}
