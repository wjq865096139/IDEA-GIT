package com.itheima.demo04.TreadTest;

/**
 * @ClassName Test2
 * @Description: TODO
 * @Author true
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class Test2 {

    public static void main(String[] args) {

        Runnable r = new RunImp2();
        //System.out.println(r);
        Thread t1 = new Thread(r,"aaa");
        Thread t2 = new Thread(r,"bbb");
        Thread t3 = new Thread(r,"ccc");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(111);


    }

}
