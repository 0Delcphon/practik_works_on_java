package praktika_seven;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        ArrayDeque<Integer> list1 = new ArrayDeque<>();
        ArrayDeque<Integer> list2 = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
            list1.addLast(sc.nextInt());

        for (int i = 0; i < 5; i++)
            list2.addLast(sc.nextInt());

        int count = 0;

        while(!list1.isEmpty() && !list2.isEmpty() && count <= 106)
        {
            int card1 = list1.pop();
            int card2 = list2.pop();

            if ((card1 == 0 && card2 == 9) || (card1 > card2 && (card1 != 9 || card2 != 0)))
            {
                list1.addLast(card1);
                list1.addLast(card2);
            }
            else
            {
                list2.addLast(card1);
                list2.addLast(card2);
            }

            count++;
        }

        if(count < 106)
            if(!list1.isEmpty())
                System.out.println("first " + count);
            else
                System.out.println("second " + count);
        else
            System.out.println("botva");
    }
}