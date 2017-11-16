package example.thread;

public class MyThread1 implements Runnable {

    private int ticketNum = 5;

    public void run() {
          for (int i = 0; i < 10; ++i) {
              if (ticketNum > 0) {
                  try {
                      Thread.sleep(100);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  System.out.println("ticketNum = " + ticketNum--);
              }
          }
    }
}
