package com.example.gaih.day08_yuancheng;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by gaih on 2016/7/29.
 */

public class PayService extends Service{
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }
    public boolean pay(String name,String pwd,int money){


            Log.d("11111","验证用户名密码");
            Log.d("22222","检查病毒");
            Log.d("33333","调用C语言加密");
        if ("abc".equals(name)&&"123".equals(pwd)&&money<5000) {
            return true;
        }
        return false;

    }

    private class MyBinder extends Iservice.Stub {
        @Override
        public boolean callPay(String name, String pwd, int money) {
            return pay(name,pwd,money);
        }
    }
}
