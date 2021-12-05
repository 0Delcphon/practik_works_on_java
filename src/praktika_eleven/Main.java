package praktika_eleven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class HorseThread implements Runnable
{
    private Object rLock;
    private String rName;

    public HorseThread(Object lock, String name)
    {
        rLock = lock;
        rName = name;
    }

    @Override
    public void run()
    {
        synchronized (rLock)
        {
            String s = "";
            for (int i = 0; i < 10001; i++)
            {
                if (i >= 10000)
                {
                    s = " has finished";
                    System.out.println(rName + s);
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
}

public class Main
{
    public static void RunThreads(int horsesCount)
    {
        Object lock = new Object();
        List<Thread> horses = new ArrayList<Thread>(horsesCount);
        String number;

        for (int i = 1; i < horsesCount + 1; ++i)
        {
            number = i < 10 ? ("0" + i) : "" + i;
            Thread horse_i = new Thread(new HorseThread(lock, "Horse " + number));
            horses.add(horse_i);
        }

        for (int i = 0; i < horsesCount; ++i)
        {
            horses.get(i).start();
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество лошадей: ");
        int n = in.nextInt();
        RunThreads(n);
    }
}