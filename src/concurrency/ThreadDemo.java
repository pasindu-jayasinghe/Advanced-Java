package concurrency;

public class ThreadDemo {
    public static void show(){
        System.out.println(Thread.currentThread().getName());

//        for(int i = 0; i < 10; i++){
//            Thread thread = new Thread(new DownloadFileTask());
//            thread.start();
//        }
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File Ready to be scanned");

    }
}
