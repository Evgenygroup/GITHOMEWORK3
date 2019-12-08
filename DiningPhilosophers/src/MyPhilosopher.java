import java.util.Random;

public class MyPhilosopher implements Runnable {
    private Object leftStick;
    private Object rightStick;

    private Random random = new Random();

    public MyPhilosopher(Object leftStick, Object rightStick) {
        this.leftStick = leftStick;
        this.rightStick = rightStick;
    }


    @Override
    public void run() {
        try {
            //  while (true) {
            action("thinking");
            synchronized (leftStick) {
                action(("got left stick"));
                synchronized (rightStick) {
                    action("got right stick");
                    action("eating");
                    action("put down right stick");
                }
                action("put down left stick");
            }
            //  }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void action(String str) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + str);
        Thread.sleep(random.nextInt(1000));
    }
}
