package Class1;

import java.text.SimpleDateFormat;
import  java.util.*;

class SubThread extends Thread{

    //重写thread方法
    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
public class Temper2 {
    public static void main(String[] args) {
//        SubThread subThread = new SubThread();
//        subThread.start();
//
//        for (int i = 0; i <100 ; i++) {
//            System.out.println("count:"+i);
//        }
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }
}
