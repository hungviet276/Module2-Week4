public class main {
    public static void main(String[] args) {

        NumberGenerator numberGenerator1 = new NumberGenerator("one");
        NumberGenerator numberGenerator2 = new NumberGenerator("two");
        Thread thread1 = new Thread(numberGenerator1);
        Thread thread2 = new Thread(numberGenerator2);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();

    }
}
