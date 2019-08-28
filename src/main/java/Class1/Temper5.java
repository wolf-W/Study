package Class1;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Temper5 {
    public static void main(String[] args) {
        int N = 4;
        CyclicBarrier barrier = new CyclicBarrier(N);
        for(int i=0;i<N;i++){
            new Writer(barrier).start();
        }
    }
    static class Writer extends  Thread{
        private CyclicBarrier cyclicBarrier;
        public Writer(CyclicBarrier cyclicBarrier){
            this.cyclicBarrier=cyclicBarrier;
        }
        @Override
        public void run(){
            try {
                Thread.sleep(3000);
                System.out.println("线程"+Thread.currentThread().getName()+"写入数据完成，等待其它线程写入");
                cyclicBarrier.await();
            }catch (InterruptedException e){
                e.printStackTrace();
            }catch (BrokenBarrierException e){
                e.printStackTrace();
            }
            System.out.println("所有线程写入完毕，继续处理其它任务");
        }
    }
}
