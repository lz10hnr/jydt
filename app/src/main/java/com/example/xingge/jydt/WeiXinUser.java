package com.example.xingge.jydt;

import android.util.Log;

/**
 * Created by xingge on 2017/3/7.
 */

public class WeiXinUser implements Observer {
    public WeiXinUser(String name) {
        this.name = name;
    }

    private String name;


    @Override
    public void update(String msg) {
        Log.i("abc",name+"收到了"+msg);
    }
}
