package io.github.futurewl.chapter4.threadlocal;

/**
 * ==========================
 * 功能描述：
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public class ClientThread extends Thread {

    private Sequence sequence;

    public ClientThread(Sequence sequence) {

        this.sequence = sequence;

    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName() + "=>" + sequence.getNumber());

        }

    }

}
