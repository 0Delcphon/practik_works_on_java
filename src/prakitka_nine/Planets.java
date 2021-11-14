package prakitka_nine;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Planets {
    public static void main(String[] args) {

        // Обьявление переменных планет
        String venus = new String("Venus");
        String mars = new String("Mars");
        String neptun = new String("Neptun");
        String pluto = new String("Pluto");
        String mercury = new String("Mercury");
        String earth = new String("Earth");






        // Первый список
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(mercury, venus, pluto, neptun));



        // Неизменяемый второй список
        List<String> list2 = Collections.unmodifiableList(
                new ArrayList<String>(
                        Arrays.asList(mars, mercury, earth)
                )
        );

        list1.add(earth);                 // Добавление
        System.out.println(list1);


        list1.remove(0);            // Удаление
        System.out.println(list1);

        list1.set(0, mars);              // Изменение

        System.out.println(list1);

        Collections.shuffle(list1);      // Перемешивание

        System.out.println(list1.indexOf(neptun)); // Индекс

        System.out.println(list1.contains(venus));


        System.out.println(list1.contains(pluto));




        System.out.println(list1.subList(0, list1.size() / 2)); // Подмассив
    }
}

