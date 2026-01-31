package set_a;

class PrintMessage implements Runnable{

    @Override
    public void run() {
       for(int i=1;i<=5;i++){
        System.out.println("Hello : "+i);
       }
    }

}
public class P2 {
    public static void main(String[] args) {
        PrintMessage msg = new PrintMessage();
        Thread t = new Thread(msg);
        t.start();
    }
}
