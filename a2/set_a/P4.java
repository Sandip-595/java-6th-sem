package set_a;

class Child implements Runnable{

    @Override
    public void run() {
        try{
        for(int i = 1; i<= 5;i++){
                Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " : "+ i);
        }
        } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
    
}
public class P4 {
    public static void main(String[] args) {
        Thread t = new Thread(new Child());
        t.start();
        t.setName("ChildThread");
        

        for(int i =1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + " : "+ i);
        }
    }
}
