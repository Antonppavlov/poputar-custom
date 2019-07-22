package com.qihoo.util;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.location.Location;
import android.location.LocationManager;
import dalvik.system.DexFile;
import java.io.File;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LiteApplication extends Application {
    private static boolean loadDexToC = false;
    private static boolean selfLoad = true;

    /* renamed from: ᵢˋ */
    private static Application f4;

    /* renamed from: ᵢˎ */
    private static Context f5;

    /* renamed from: ᵢˏ */
    private static String f6 = null;

    /* renamed from: ᵢˑ */
    private static Map<Integer, String> f7 = new ConcurrentHashMap();

    public static native void interface10(Context context);

    public static native void interface11(int i);

    public static native Enumeration<String> interface12(DexFile dexFile);

    public static native String interface14(int i);

    public static native AssetFileDescriptor interface17(AssetManager assetManager, String str);

    public static native InputStream interface18(Class cls, String str);

    public static native InputStream interface19(ClassLoader classLoader, String str);

    public static native boolean interface20();

    public static native void interface5(Application application);

    public static native String interface6(String str);

    public static native boolean interface7(Application application, Context context);

    public static native boolean interface8(Application application, Context context);

    public static native Location mark(LocationManager locationManager, String str);

    public static native void mark();

    public static native void mark(Location location);

    public static Context getAppContext() {
        return f5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x007e A[SYNTHETIC, Splitter:B:43:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0088 A[SYNTHETIC, Splitter:B:49:0x0088] */
    /* renamed from: ᵢˋ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m1() {
        /*
            r1 = 0
            r0 = 1
            java.lang.String[] r3 = android.os.Build.SUPPORTED_32_BIT_ABIS     // Catch:{ NoSuchFieldError -> 0x0050 }
            int r4 = r3.length     // Catch:{ NoSuchFieldError -> 0x0050 }
            r2 = r1
        L_0x0006:
            if (r2 >= r4) goto L_0x0016
            r5 = r3[r2]     // Catch:{ NoSuchFieldError -> 0x0050 }
            java.lang.String r6 = "x86"
            boolean r5 = r5.contains(r6)     // Catch:{ NoSuchFieldError -> 0x0050 }
            if (r5 == 0) goto L_0x0013
        L_0x0012:
            return r0
        L_0x0013:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0016:
            java.lang.String r2 = android.os.Build.CPU_ABI     // Catch:{ NoSuchFieldError -> 0x0050 }
            java.lang.String r3 = "x86"
            boolean r2 = r2.contains(r3)     // Catch:{ NoSuchFieldError -> 0x0050 }
            if (r2 != 0) goto L_0x0012
            java.lang.String r2 = android.os.Build.CPU_ABI2     // Catch:{ NoSuchFieldError -> 0x0050 }
            java.lang.String r3 = "x86"
            boolean r2 = r2.contains(r3)     // Catch:{ NoSuchFieldError -> 0x0050 }
            if (r2 != 0) goto L_0x0012
        L_0x002a:
            r3 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x007a, all -> 0x0084 }
            java.lang.String r4 = "/system/build.prop"
            java.lang.String r5 = "r"
            r2.<init>(r4, r5)     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x007a, all -> 0x0084 }
            java.lang.String r3 = r2.readLine()     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x0092, all -> 0x0090 }
        L_0x0038:
            if (r3 == 0) goto L_0x006b
            java.lang.String r4 = "ro.product.cpu.abi"
            boolean r4 = r3.contains(r4)     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x0092, all -> 0x0090 }
            if (r4 == 0) goto L_0x0066
            java.lang.String r4 = "x86"
            boolean r3 = r3.contains(r4)     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x0092, all -> 0x0090 }
            if (r3 == 0) goto L_0x0066
            r2.close()     // Catch:{ Exception -> 0x004e }
            goto L_0x0012
        L_0x004e:
            r1 = move-exception
            goto L_0x0012
        L_0x0050:
            r2 = move-exception
            java.lang.String r2 = android.os.Build.CPU_ABI
            java.lang.String r3 = "x86"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0012
            java.lang.String r2 = android.os.Build.CPU_ABI2
            java.lang.String r3 = "x86"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x002a
            goto L_0x0012
        L_0x0066:
            java.lang.String r3 = r2.readLine()     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x0092, all -> 0x0090 }
            goto L_0x0038
        L_0x006b:
            r2.close()     // Catch:{ Exception -> 0x008c }
        L_0x006e:
            r0 = r1
            goto L_0x0012
        L_0x0070:
            r0 = move-exception
            r0 = r3
        L_0x0072:
            if (r0 == 0) goto L_0x006e
            r0.close()     // Catch:{ Exception -> 0x0078 }
            goto L_0x006e
        L_0x0078:
            r0 = move-exception
            goto L_0x006e
        L_0x007a:
            r0 = move-exception
            r2 = r3
        L_0x007c:
            if (r2 == 0) goto L_0x006e
            r2.close()     // Catch:{ Exception -> 0x0082 }
            goto L_0x006e
        L_0x0082:
            r0 = move-exception
            goto L_0x006e
        L_0x0084:
            r0 = move-exception
            r2 = r3
        L_0x0086:
            if (r2 == 0) goto L_0x008b
            r2.close()     // Catch:{ Exception -> 0x008e }
        L_0x008b:
            throw r0
        L_0x008c:
            r0 = move-exception
            goto L_0x006e
        L_0x008e:
            r1 = move-exception
            goto L_0x008b
        L_0x0090:
            r0 = move-exception
            goto L_0x0086
        L_0x0092:
            r0 = move-exception
            goto L_0x007c
        L_0x0094:
            r0 = move-exception
            r0 = r2
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qihoo.util.LiteApplication.m1():boolean");
    }

    public static void load(Application application, Context context) {
        f4 = application;
        f5 = context;
        if (context != null) {
            File filesDir = f5.getFilesDir();
            if (filesDir != null) {
                f6 = filesDir.getParentFile().getAbsolutePath() + "/.jiagu";
            }
        }
        if (!interface20()) {
            System.exit(1);
        }
        if (loadDexToC) {
            try {
                System.loadLibrary("jgdtc");
            } catch (Error e) {
            }
        }
        interface5(f4);
        try {
            Class cls = Class.forName("com.qihoo.bugreport.CrashReport");
            cls.getDeclaredMethod("prepareInit", new Class[0]).invoke(null, new Object[0]);
            cls.getDeclaredMethod("init", new Class[]{Context.class}).invoke(null, new Object[]{f4});
        } catch (Throwable th) {
        }
    }

    public static void load() {
        if (m1()) {
            try {
                System.loadLibrary("jiagu_x86");
                return;
            } catch (Throwable th) {
            }
        }
        System.loadLibrary("jiagu");
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (selfLoad) {
            load();
        }
        load(this, context);
    }

    public static String getDir() {
        return f6;
    }

    public static String getString2(int i) {
        String str = (String) f7.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        String interface14 = interface14(i);
        f7.put(Integer.valueOf(i), interface14);
        return interface14;
    }

    public static String getString2(String str) {
        try {
            return getString2(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
