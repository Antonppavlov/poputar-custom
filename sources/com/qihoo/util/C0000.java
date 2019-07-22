package com.qihoo.util;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Looper;

/* renamed from: com.qihoo.util.ᵢˋ */
final class C0000 implements Runnable {

    /* renamed from: ᵢˋ */
    private /* synthetic */ Context f11;

    /* renamed from: ᵢˎ */
    private /* synthetic */ String f12;

    C0000(Context context, String str) {
        this.f11 = context;
        this.f12 = str;
    }

    public final void run() {
        Looper.prepare();
        AlertDialog create = new Builder(this.f11).setMessage(this.f12).setCancelable(false).setPositiveButton("确定", new C0001(this)).create();
        create.getWindow().setType(2005);
        create.show();
        Looper.loop();
    }
}
