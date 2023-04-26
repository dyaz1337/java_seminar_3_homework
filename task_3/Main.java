//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package task_3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int min = Collections.min(list);
        int max = Collections.max(list);

        double sum = 0;
        for (int i : list) {
            sum += i;
        }
        double avg = sum / list.size();

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + avg);
    }
}
