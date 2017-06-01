package lol1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Hillel6 on 29.05.2017.
 */
public class Lists {
    public static void main(String[] args) {
        Random r=new Random();
        List<Integer> l=new LinkedList<>();
        for (int i=0; i<10; i++)
            l.add(r.nextInt());
        for (Integer nu : l)
            System.out.println(nu);
    }
}
