package com.example.xingge.jydt;

/**
 * Created by xingge on 2017/3/7.
 */

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notify(String msg);
}
