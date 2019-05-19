package com.example.humanoop;

import android.util.Log;

public class Anna extends Human {

    private int height;
    public Anna(String name, int age, int weight) {
        super(name, age, weight);

    }

    public Anna(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }

    @Override
    public void eat() {
        super.eat();
        weight = weight + 2;
        Log.d("Anna","you are now " + weight +"kgs");
    }

    @Override
    public int birthday() {
        age = age + 4;
        Log.d("Anna","I am " + age + "years");
        return age;
    }
}
