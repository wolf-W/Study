package Class1;

import java.util.concurrent.Semaphore;

public class Temper6 {
    public static void main(String[] args) {
        int N = 4;
        String[] person = new String[]{"蔡徐坤","东子","文艺","力量"};
        Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i < N; i++) {
            new Worker(person[i],i,semaphore).start();
        }
    }
    static class Worker extends Thread{
        private int num;
        private String person;
        private Semaphore semaphore;
        public Worker(String person,int num,Semaphore semaphore){
            this.person = person;
            this.num = num;
            this.semaphore = semaphore;
        }
        @Override
        public void run(){
            try {
                semaphore.acquire();
                System.out.println(this.person+"占用一台老虎机");
                Thread.sleep(2000);
                System.out.println(this.person+"不玩了");
                semaphore.release();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
