package com.qihoo.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;

/* renamed from: com.qihoo.util.ᵢˎ */
final class C0001 implements OnClickListener {
    C0001(C0000 r1) {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Thread currentThread = Thread.currentThread();
        synchronized (currentThread) {
            if (VERSION.SDK_INT >= 19) {
                currentThread.notify();
            }
        }
    }
}
