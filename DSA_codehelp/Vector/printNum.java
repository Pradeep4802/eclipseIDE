public class printNum extends Thread {
    // static int num = 1;

    public void run() {
        Thread th = new Thread();
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.print(i + " ");
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        printNum pn = new printNum();
        pn.start();
        
    }
}
