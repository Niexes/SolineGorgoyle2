package com.company;

public class AdultMan extends Human {
    private int salary;

    public AdultMan(int w, int h) {
        setWeight(w);
        setHeight(h);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void walkToJob() {
        System.out.println(getName() + " say: опять на ебанную работу идти");
    }

}
