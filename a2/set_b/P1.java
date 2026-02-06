package set_b;

class Task extends Thread{
    public void run(){
        for(int i = 1; i<=5 ; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
public class P1 {
    public static void main(String[] args) throws InterruptedException{
        Task t1 = new Task();
        t1.setName("CustomThread");
        t1.start();

        for(int i = 1; i<=5 ; i++){
            Thread.sleep(1000);
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
