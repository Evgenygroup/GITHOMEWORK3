public class Main {

    public static void main(String[] args) {
        MyPhilosopher[] myPhilosophers = new MyPhilosopher[5];
        Object sticks[] = new Object[myPhilosophers.length];

        for (int i = 0; i < sticks.length; i++) sticks[i] = new Object();

        for (int i = 0; i < myPhilosophers.length; i++) {
            Object leftStick = sticks[i];
            Object rightStick = sticks[(i + 1) % sticks.length];

            if (i == sticks.length - 1) myPhilosophers[i] = new MyPhilosopher(rightStick, leftStick);
            else myPhilosophers[i] = new MyPhilosopher(leftStick, rightStick);

            new Thread(myPhilosophers[i], "Philosopher " + (i + 1)).start();

        }
    }
}
