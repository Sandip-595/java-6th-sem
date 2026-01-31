package set_a;

class Task extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}

public class P1 {
    public static void main(String[] args) {
        Task t1 = new Task();
        t1.start();
    }
}
