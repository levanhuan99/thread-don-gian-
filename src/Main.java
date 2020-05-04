public class Main {
    public static void main(String[] args) {
        NumberGenerator ng1=new NumberGenerator();
        NumberGenerator ng2=new NumberGenerator();

        Thread thread =new Thread(ng1);
        Thread thread1=new Thread(ng2);

        thread.start();
        thread1.start();
    }


}
