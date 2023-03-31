package org.example;

import java.util.Collection;

/*
Створити клас Box, який буде містити в собі 3 різних узагальнюючих
(параметризованих) типи.
 */
public class Box<T, U, V> {

    //Всередині цього класу створити змінні цих типів та гетери до них.
    private final T boxT;
    private final U boxU;
    private final V boxV;

    public T getT() {
        return boxT;
    }

    public U getU() {
        return boxU;
    }

    public V getV() {
        return boxV;
    }

    //Створити конструктор, який буде ініціалізовувати ці змінні.
    public Box(T boxT, U boxU, V boxV) {
        this.boxT = boxT;
        this.boxU = boxU;
        this.boxV = boxV;
    }

//Створити метод, який буде приймати, як параметр, колекцію з довільними типами
// обʼєктів та виводити на екран назву кожного типу.
    public void printTypes(Collection<?> collection) {
            for (Object item : collection) {
                System.out.println(item.getClass().getSimpleName());
            }
        }

    }


