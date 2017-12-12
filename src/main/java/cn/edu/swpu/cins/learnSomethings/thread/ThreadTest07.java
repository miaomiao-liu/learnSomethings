package cn.edu.swpu.cins.learnSomethings.thread;

/**
 *  线程同步机制：synchronized
 *
 *  异步编程模型：t1线程与t2线程互相不等待
 *
 *  同步编程模型：t1.t2执行时，必须有一个线程等另一个线程执行完以后才能执行，类似与单线程
 *  数据安全，程序使用率降低
 *
 * Created by miaomiao on 17-11-1.
 */
public class ThreadTest07 {
    public static void main(String[] args){

        Account account = new Account("actno-001",5000);

        Processor7 p = new Processor7(account);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);

        t1.start();
        t2.start();

    }
}

class Processor7 implements Runnable {

    Account account;

    Processor7(Account account){
        this.account = account;
    }
    @Override
    public void run() {
        try {
            account.withdraw(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("取款1000成功，余额："+account.getBalance());
    }
}

//账户
class Account{
    private String actno;
    private double balance;

    public Account(){}

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //两次取款都是在5000的基础上减去1000,结果矛盾，需要采取同步
    //  synchronized关键字在成员方法上，线程拿走的也是 this的对象锁
    public synchronized void withdraw(double money) throws InterruptedException {
        //把需要同步的代码块放进同步语句块中，
        //小块号中为共享对象
        /*todo
        当线程执行过程中遇到synchronized关键字，就会去找关键字后面的this对象锁，
        找到对象锁就开始执行同步代码，没有找到就会等待，直到找到
        */
//        synchronized (this) {
            double after = balance - money;
            Thread.sleep(1000);
            this.setBalance(after);
//        }
    }

}



