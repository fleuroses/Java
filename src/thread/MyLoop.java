package thread;

public class MyLoop {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.printf("My Loop : i = %d\n", i);
        }
    }
}

