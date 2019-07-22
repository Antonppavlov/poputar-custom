package com.qihoo.util;

import android.content.Context;
import android.os.Build.VERSION;

public class QHDialog {
    public static void showDialog(Context context, String str) {
        Thread thread = new Thread(new C0000(context, str));
        synchronized (thread) {
            try {
                thread.start();
                if (VERSION.SDK_INT >= 19) {
                    thread.wait();
                } else {
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
