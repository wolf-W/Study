package Class1;

class SubThread1 extends Thread{

    //重写thread方法
    public void run(){
        for (int i = 0; i <100 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
public class Temper3 {
    public static void main(String[] args) {
        SubThread1 subThread1 = new SubThread1();
        subThread1.setName("子线程1");
        subThread1.start();
        Thread.currentThread().setName("------------主线程");
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
//            if(i % 10 ==0){
////                Thread.yield();
//            }
              if(i /20 == 0){
                  try {
                      subThread1.join();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
        }
    }

}
