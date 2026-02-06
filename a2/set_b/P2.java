package set_b;

class Task1 extends Thread{
    public void run(){

        for(int i = 1; i<=3; i++){
            try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println("\n"+i+".Name : "+Thread.currentThread()
            .getName()+"\nPriority : "+Thread.currentThread().getPriority());
        }
    }
}

public class P2 {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        t1.setName("Thread1");
        t1.setPriority(3);

        Task1 t2 = new Task1();
        t2.setName("Thread2");
        t2.setPriority(6);

        Task1 t3 = new Task1();
        t3.setName("Thread3");
        t3.setPriority(9);

        t1.start();
        t2.start();
        t3.start();
    }
}
