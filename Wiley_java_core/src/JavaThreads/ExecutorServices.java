package JavaThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



class Card extends Thread{
	public void run() {
		System.out.println("Thread Name:- " + Thread.currentThread().getName());
	}
}
public class ExecutorServices {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(4);
		for(int i=0;i<=10;i++) {
			executor.execute(new Card());
		}
	}

}
