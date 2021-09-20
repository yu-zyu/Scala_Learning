package chap08.program01;

class HelloThread extends Thread {
  public HelloThread(String name) {
    super(name);
  }
  public void run() { 
    System.out.println(getName() + ": Hello Thread World!");
  }
}

public class HelloThreadWorld {
  public static void main(String[] args) {
    final int num = 10;
    Thread[] threads = new Thread[num];
    for (int i = 0; i < num; i++) {
      threads[i] = new HelloThread("Hello Thread no." + i);
      threads[i].start();
    }

    for (int i = 0; i < num; i++) {
      try {
	threads[i].join();
      } catch (InterruptedException e) {
	break;
      }
    }
    System.out.println("HelloThreadWorld: Done.");
  }
}
