package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Student extends Human {

    private ArrayList<String> debt = new ArrayList<String>();

    public void getDebtList() {
        for (int i = 0; i < debt.size() - 1; i++) {
            System.out.println(debt.get(i));
        }
    }

    public int getDebtSize() {
        return debt.size();
    } // я не уверена нужно ли здесь это вообще, как написать сеттр и главное зачем тоже не понимаю

    public void drink() {
        System.out.println(getName() + " say: щас бы попить пивасика");
    }
    //Для студента вес пусть снижается на 1кг при получении хвоста, и увеличивается при удалении оного

    public void dontPass(String dolg) {
        debt.add(0, dolg);
        int n = getWeight() - 1;
        setWeight(n);
    }

    public void passExam(String dolg) {
        if (debt.contains(dolg)) {
            debt.remove(dolg);
            System.out.println("Долг " + dolg + " сдан!");
            int studentsWeight = getWeight() + 1;
        } else {
            System.out.println("У студента " + getName() + " нет долга " + dolg);
        } //внутри используй поле, а не метод ???????????????? я dolgi заменила на список debt
    }
}
