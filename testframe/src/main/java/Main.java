public class Main {
    public static void main(String[] args) {
        Frame f = new Frame("Test Frame");
        Writer writer = new Writer(f);
        Thread thread = new Thread(writer);
        thread.start();
    }
}
