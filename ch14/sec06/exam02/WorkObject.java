package ch14.sec06.exam02;

public class WorkObject {
	public synchronized void methodA() {
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName()+":method A작업실행");
		notify();//다른 멀티스레드를 실행직전으로만들어주는 명령어
		try {
			wait();//자신의멀티스레드를 멈추는명령어 
			
		}catch (InterruptedException e) {
		
		}
		
	}
	public synchronized void methodB() {
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName()+":method B작업실행");
		notify();
		try {
			wait();
		}catch (InterruptedException e) {
		}
	}
	

}
