package cn.qianfeng.Demo01;

public class Enter {
    public static void main(String[] args){
        TickThread myTicket = new TickThread();

        Thread thread1 = new Thread(myTicket);
        Thread thread2 = new Thread(myTicket);
        Thread thread3 = new Thread(myTicket);

        thread1.setName("老人");
        thread2.setName("学生");
        thread3.setName("程序员");

        thread1.start();
        thread2.start();
        thread3.start();
    }


}
