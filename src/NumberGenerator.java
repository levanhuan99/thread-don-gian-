public class NumberGenerator implements Runnable {

    @Override
    public void run() {

        for (int i=0;i<11;i++){
            System.out.println(i+" "+this.hashCode());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
