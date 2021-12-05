package praktika_ten;

class ThreadPingPong implements Runnable
{
    private final String rName;
    private final Object rLock;


    public ThreadPingPong(Object lock, String name)
    {
        rLock = lock;
        rName = name;
    }

    @Override
    public void run()
    {
        synchronized (rLock)
        {
            while (true)
            {
                System.out.println(rName);
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

                rLock.notify();

                try
                {
                    rLock.wait(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Object lock = new Object();
        Thread ping = new Thread(new ThreadPingPong(lock, "Ping"));
        Thread pong = new Thread(new ThreadPingPong(lock, "Pong"));
        ping.start();
        pong.start();
    }
}