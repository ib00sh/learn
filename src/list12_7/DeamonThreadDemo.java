package list12_7;

import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;

public class DeamonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            int k = 1, s = 0;
            while (true){
                System.out.println(Thread.currentThread().getName() + ": " + s);
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException ex){
                }
                    s+=k;
                    k++;
                }
            },"Вычисление суммы");
        t.setDaemon(true);
        int res;
        t.start();
        do{
            Thread.sleep(3000);
            res = showConfirmDialog(null,
                    "Закончить вычисление суммы?",
                    "Сумма числе",
                    YES_NO_OPTION);
        }while (res!=YES_OPTION);
    }
}
