
// thread class runable interface 

class NewThread extends Thread

{
    public void run() {
        try {

            System.out.println("Thread  " + Thread.currentThread().getName() + " with id "
                    + Thread.currentThread().getId() + " is runnning ");

        }

        catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}

class thread_12{

    public static void main(String[] args) {
        NewThread  t1 = new NewThread();
        
        t1.start();

        NewThread t2 = new NewThread();

        t2.start();
    }
}
