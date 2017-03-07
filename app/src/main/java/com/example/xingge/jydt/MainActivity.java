package com.example.xingge.jydt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GongZhongHao gongZhongHao = new GongZhongHao();
        WeiXinUser weiXinUser = new WeiXinUser("张三");
        WeiXinUser weiXinUser1 = new WeiXinUser("李四");
        WeiXinUser weiXinUser2 = new WeiXinUser("王五");

        gongZhongHao.attach(weiXinUser);
        gongZhongHao.attach(weiXinUser1);
        gongZhongHao.attach(weiXinUser2);

        gongZhongHao.notify("习近平出访俄国");
    }
}
