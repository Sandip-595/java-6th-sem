package set_a;

class Task1 implements Runnable{
    
    @Override
    public void run(){
        for(int i = 1;i<=20;i += 2){
            System.out.println(Thread.currentThread().getName()+ " : "+i);
        }
    }
}

class Task2 implements Runnable{

    @Override
    public void run(){
        for(int i = 2;i<=20;i += 2){
            System.out.println(Thread.currentThread().getName()+ " : "+i);
        }
    }
}

public class P3 {
    public static void main(String[] args) throws InterruptedException {
        Task1 t1 = new Task1();
        Thread thread1 = new Thread(t1);

        Task2 t2 = new Task2();
        Thread thread2 = new Thread(t2);

        thread1.setName("OddThread");
        thread2.setName("EvenThread");
        thread1.start();
        thread1.join();
        thread2.start();
    }
}
