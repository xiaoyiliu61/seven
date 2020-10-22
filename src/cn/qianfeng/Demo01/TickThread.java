package cn.qianfeng.Demo01;

import java.util.concurrent.locks.ReentrantLock;

/*
* synchronized 同步代码块，（关键的代码，只能一个线程或一个请求执行
* synchronized 修饰方法，同步整个方法，注意要加static。
  可重入锁 reentrantLock  当前线程如果未解锁，另一个线程可以进行解锁
  * 不可重入锁  当前线程的锁，其他线程不能操作。
  * 课外拓展：1.悲观锁 2.乐观锁
  * 实现线程类的两种方式 extends Thread / implement Runnable
* */
public class TickThread implements Runnable {
    //票数
    private static  int ticketNumber = 100;
   // private String ticketName;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        //买票逻辑
         while (ticketNumber>0){
             /*synchronized (ticketThread.class){*/
               //  lock.lock();
                 saleOne();
              //   lock.unlock();
             //}
         }
    }
    //数据操作方法
    public synchronized static void saleOne(){
        if (ticketNumber>0){
            System.out.println( Thread.currentThread().getName()+"窗口当前票数为："+ticketNumber);
            ticketNumber--;
        }
    }
   /* //线程名字设计
    public void setTicketName(String ticketName){
        this.ticketName =ticketName;
    }*/
}
