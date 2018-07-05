package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Admin on 05.07.2018.
 */
public class CSV_sort {

    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("res/numbers.txt"); /*Забрали файлик откуда грузить данные*/
        ArrayList<Integer> ints = new ArrayList<Integer>();
        int i = 0;

        Scanner input = new Scanner(reader);
        input.useDelimiter(","); /*Выкидываем разделители*/
        while (input.hasNext()) {
            ints.add(input.nextInt());
            i++;
        }/*Грузим всё из файла в коллекцию*/

        input.close(); /*Будем экономными закроем сканер*/

        Collections.sort(ints); /*Сортировка по возрастанию*/
        for (Integer cur : ints)
            System.out.print(cur + " "); /*Вывод отсортированной коллекции*/

        System.out.println();/*Просто переход на след. строку, пока без красивостей*/

        Collections.sort(ints, Collections.reverseOrder());/*Сортировка по убыванию*/
        for (Integer cur : ints)
            System.out.print(cur + " ");/*Вывод отсортированной коллекции*/
    }
}
