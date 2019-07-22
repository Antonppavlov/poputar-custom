package com.qihoo360.replugin;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class Entry {

    /* renamed from: cl */
    static ClassLoader f13cl = null;
    static Context context = null;
    static Stub fakeBinder = null;
    static IBinder manager = null;
    static IBinder realEntryBinder = null;

    public class Stub extends Binder implements IInterface {
        private static final String DESCRIPTOR = "com.qihoo360.loader2.IPlugin";
        private IBinder mRemote = null;

        public void setRemote(IBinder iBinder) {
            this.mRemote = iBinder;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public IBinder asBinder() {
            return this.mRemote;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (this.mRemote != null) {
                return this.mRemote.transact(i, parcel, parcel2, i2);
            }
            return false;
        }
    }

    public static void init() {
        try {
            IBinder iBinder = (IBinder) Class.forName("com.qihoo360.replugin.Entry_Jiagu").getDeclaredMethod("create", new Class[]{Context.class, ClassLoader.class, IBinder.class}).invoke(null, new Object[]{context, f13cl, manager});
            realEntryBinder = iBinder;
            if (iBinder != null && fakeBinder != null) {
                fakeBinder.setRemote(realEntryBinder);
            }
        } catch (Throwable th) {
        }
    }

    public static final IBinder create(Context context2, ClassLoader classLoader, IBinder iBinder) {
        context = context2;
        f13cl = classLoader;
        manager = iBinder;
        Stub stub = new Stub();
        fakeBinder = stub;
        return stub;
    }
}
