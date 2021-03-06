
import java.util.ArrayList;
import java.util.List;

public class TenThreads {

    public int currentTaskValue = 1;

    public static void main(String[] args) {
        TenThreads monitor = new TenThreads();
        List<ModThread> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            ModThread modThread = new ModThread(i, monitor);
            list.add(modThread);
        }
        for (ModThread a : list) {
            a.start();
        }
    }

}

class ModThread extends Thread {
    private int modValue;
    private TenThreads monitor;

    public ModThread(int modValue, TenThreads monitor) {
        this.modValue = modValue;
        this.monitor = monitor;
    }

    @Override
    public void run() {
        synchronized (monitor) {
            try {
                while (true) {
                    while (monitor.currentTaskValue % 10 != modValue) {
                        monitor.wait();
                    }

                    if (monitor.currentTaskValue == 101) {
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + " : "
                            + monitor.currentTaskValue);
                    monitor.currentTaskValue = monitor.currentTaskValue + 1;
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}