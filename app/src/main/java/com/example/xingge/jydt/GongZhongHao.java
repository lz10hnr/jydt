package com.example.xingge.jydt;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xingge on 2017/3/7.
 */

public class GongZhongHao implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {

        observers.remove(observer);
    }

    @Override
    public void notify(String msg) {

        for (Observer o: observers) {
            o.update(msg);
        }

    }
}
