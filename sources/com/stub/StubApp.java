package com.stub;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Build.VERSION;
import com.qihoo.util.Configuration;
import dalvik.system.DexFile;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class StubApp extends Application {
    private static boolean loadDexToC = false;
    private static boolean loadFromLib = false;
    private static boolean needX86Bridge = true;
    public static String strEntryApplication = "com.qihoo360.crypt.entryRunApplication";

    /* renamed from: ᵢˋ */
    private static Application f14 = null;

    /* renamed from: ᵢˎ */
    private static Application f15 = null;

    /* renamed from: ᵢˏ */
    private static String f16 = "libjiagu";

    /* renamed from: ᵢˑ */
    private static Context f17;

    /* renamed from: ᵢי */
    private static String f18 = null;

    /* renamed from: ᵢـ */
    private static String f19 = null;

    /* renamed from: ᵢٴ */
    private static String f20 = null;

    /* renamed from: ᵢᐧ */
    private static String f21 = null;

    /* renamed from: ᵢᴵ */
    private static String f22 = null;

    /* renamed from: ᵢᵎ */
    private static Map<Integer, String> f23 = new ConcurrentHashMap();

    public static native void interface11(int i);

    public static native Enumeration<String> interface12(DexFile dexFile);

    public static native long interface13(int i, long j, long j2, long j3, int i2, int i3, long j4);

    public static native String interface14(int i);

    public static native AssetFileDescriptor interface17(AssetManager assetManager, String str);

    public static native InputStream interface18(Class cls, String str);

    public static native InputStream interface19(ClassLoader classLoader, String str);

    public static native void interface20();

    public static native void interface5(Application application);

    public static native String interface6(String str);

    public static native boolean interface7(Application application, Context context);

    public static native boolean interface8(Application application, Context context);

    public static native Location mark(LocationManager locationManager, String str);

    public static native void mark();

    public static native void mark(Location location);

    public static native synchronized boolean n0101();

    public static native synchronized Object n0103();

    public static native synchronized void n01030(Object obj);

    public static native synchronized Object n010313(Object obj, int i);

    public static native synchronized void n010320(Object obj, long j);

    public static native synchronized Object n01033(Object obj);

    public static native synchronized void n010330(Object obj, Object obj2);

    public static native synchronized Object n010333(Object obj, Object obj2);

    public static native void n0110();

    public static native boolean n0111();

    public static native void n01110(boolean z);

    public static native boolean n01111(boolean z);

    public static native void n011110(boolean z, boolean z2);

    public static native boolean n011111(byte b, int i);

    public static native byte n0111111(byte b, int i, boolean z);

    public static native void n011111110(int i, int i2, int i3, int i4, int i5);

    public static native void n011111210(int i, float f, float f2, double d, int i2);

    public static native Object n01113(int i);

    public static native void n011130(int i, Object obj);

    public static native boolean n011131(int i, Object obj);

    public static native void n0111310(int i, Object obj, int i2);

    public static native boolean n0111311(int i, Object obj, int i2);

    public static native Object n011133(boolean z, Object obj);

    public static native Object n0111333(int i, Object obj, Object obj2);

    public static native long n0112();

    public static native void n01120(long j);

    public static native int n01121(long j);

    public static native void n011210(long j, int i);

    public static native boolean n011211(long j, int i);

    public static native long n0112112(long j, int i, boolean z);

    public static native long n011212(long j, int i);

    public static native void n0112130(long j, int i, Object obj);

    public static native long n01122(long j);

    public static native int n011221(double d, double d2);

    public static native Object n01123(long j);

    public static native int n011231(long j, Object obj);

    public static native boolean n0112311(long j, Object obj, int i);

    public static native void n0112330(long j, Object obj, Object obj2);

    public static native Object n01123333(long j, Object obj, Object obj2, Object obj3);

    public static native Object n0113();

    public static native void n01130(Object obj);

    public static native boolean n01131(Object obj);

    public static native void n011310(Object obj, int i);

    public static native int n011311(Object obj, float f);

    public static native void n0113110(Object obj, int i, int i2);

    public static native boolean n0113111(Object obj, int i, int i2);

    public static native void n0113111310(Object obj, int i, int i2, int i3, Object obj2, int i4);

    public static native Object n011313(Object obj, int i);

    public static native void n0113130(Object obj, boolean z, Object obj2);

    public static native void n011313330(Object obj, int i, Object obj2, Object obj3, Object obj4);

    public static native long n01132(Object obj);

    public static native void n011320(Object obj, long j);

    public static native Object n01133(Object obj);

    public static native void n011330(Object obj, Object obj2);

    public static native int n011331(Object obj, Object obj2);

    public static native void n0113310(Object obj, Object obj2, int i);

    public static native int n0113311(Object obj, Object obj2, int i);

    public static native void n01133110(Object obj, Object obj2, boolean z, int i);

    public static native boolean n01133111(Object obj, Object obj2, int i, int i2);

    public static native void n011331110(Object obj, Object obj2, int i, int i2, int i3);

    public static native Object n011331113(Object obj, Object obj2, int i, int i2, int i3);

    public static native Object n0113313(Object obj, Object obj2, int i);

    public static native Object n0113313113(Object obj, Object obj2, int i, Object obj3, int i2, int i3);

    public static native long n011332(Object obj, Object obj2);

    public static native void n0113320(Object obj, Object obj2, long j);

    public static native void n01133220(Object obj, Object obj2, long j, long j2);

    public static native Object n011333(Object obj, Object obj2);

    public static native void n0113330(Object obj, Object obj2, Object obj3);

    public static native boolean n0113331(Object obj, Object obj2, Object obj3);

    public static native void n01133310(Object obj, Object obj2, Object obj3, boolean z);

    public static native void n0113331110(Object obj, Object obj2, Object obj3, float f, float f2, int i);

    public static native Object n0113331133(Object obj, Object obj2, Object obj3, int i, boolean z, Object obj4);

    public static native Object n011333133111313(Object obj, Object obj2, Object obj3, int i, Object obj4, Object obj5, int i2, int i3, int i4, Object obj6, int i5);

    public static native void n01133320(Object obj, Object obj2, Object obj3, long j);

    public static native Object n0113333(Object obj, Object obj2, Object obj3);

    public static native void n01133330(Object obj, Object obj2, Object obj3, Object obj4);

    public static native boolean n01133331(Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object n01133333(Object obj, Object obj2, Object obj3, Object obj4);

    public native synchronized void n1100();

    public native synchronized Object n1103();

    public native synchronized void n11030(Object obj);

    public native synchronized Object n11033(Object obj);

    public native synchronized void n110330(Object obj, Object obj2);

    public native synchronized Object n110333(Object obj, Object obj2);

    public native void n1110();

    public native int n1111();

    public native void n11110(boolean z);

    public native int n11111(boolean z);

    public native void n111110(int i, int i2);

    public native void n1111110(int i, int i2, int i3);

    public native void n111111110(float f, float f2, float f3, float f4, boolean z);

    public native long n1111112(int i, int i2, int i3);

    public native void n111111310(int i, int i2, int i3, Object obj, int i4);

    public native Object n111113(int i, int i2);

    public native void n111113320(int i, int i2, Object obj, Object obj2, long j);

    public native void n111113330(int i, int i2, Object obj, Object obj2, Object obj3);

    public native Object n11113(int i);

    public native void n111130(int i, Object obj);

    public native boolean n111131(int i, Object obj);

    public native void n1111330(byte b, Object obj, Object obj2);

    public native void n11113330(int i, Object obj, Object obj2, Object obj3);

    public native Object n11113333(byte b, Object obj, Object obj2, Object obj3);

    public native long n1112();

    public native void n11120(long j);

    public native int n11121(long j);

    public native int n111211(long j, int i);

    public native int n1112111(long j, int i, int i2);

    public native int n1112111131(long j, int i, int i2, int i3, int i4, Object obj);

    public native int n11121311(long j, int i, Object obj, boolean z);

    public native int n1112131111(long j, int i, Object obj, int i2, int i3, boolean z);

    public native long n11122(long j);

    public native void n1112230(long j, long j2, Object obj);

    public native Object n11123(long j);

    public native void n111230(long j, Object obj);

    public native void n1112310(long j, Object obj, int i);

    public native long n1112312(long j, Object obj, char c);

    public native int n111231331111(long j, Object obj, byte b, Object obj2, Object obj3, boolean z, int i, int i2);

    public native long n11123313133312(long j, Object obj, Object obj2, char c, Object obj3, char c2, Object obj4, Object obj5, Object obj6, int i);

    public native long n11123313133313313111112(long j, Object obj, Object obj2, char c, Object obj3, char c2, Object obj4, Object obj5, Object obj6, byte b, Object obj7, Object obj8, boolean z, Object obj9, int i, int i2, int i3, int i4, int i5);

    public native Object n1113();

    public native void n11130(Object obj);

    public native boolean n11131(Object obj);

    public native void n111310(Object obj, int i);

    public native int n111311(Object obj, int i);

    public native void n1113110(Object obj, int i, int i2);

    public native int n1113111(Object obj, int i, int i2);

    public native int n11131111(Object obj, int i, int i2, int i3);

    public native void n11131130(Object obj, int i, short s, Object obj2);

    public native int n11131131(Object obj, int i, int i2, Object obj2);

    public native Object n111313(Object obj, int i);

    public native void n1113130(Object obj, int i, Object obj2);

    public native boolean n1113131(Object obj, int i, Object obj2);

    public native void n11131310(Object obj, int i, Object obj2, boolean z);

    public native Object n1113133(Object obj, int i, Object obj2);

    public native void n11131330(Object obj, int i, Object obj2, Object obj3);

    public native long n11132(Object obj);

    public native void n111320(Object obj, long j);

    public native void n1113210(Object obj, long j, int i);

    public native void n1113220(Object obj, long j, long j2);

    public native void n1113222330(Object obj, long j, long j2, long j3, Object obj2, Object obj3);

    public native void n11132230(Object obj, long j, long j2, Object obj2);

    public native void n1113230(Object obj, double d, Object obj2);

    public native void n11132320(Object obj, long j, Object obj2, long j2);

    public native Object n11133(Object obj);

    public native void n111330(Object obj, Object obj2);

    public native boolean n111331(Object obj, Object obj2);

    public native void n1113310(Object obj, Object obj2, int i);

    public native boolean n1113311(Object obj, Object obj2, int i);

    public native void n11133110(Object obj, Object obj2, boolean z, int i);

    public native boolean n11133111(Object obj, Object obj2, float f, float f2);

    public native void n1113320(Object obj, Object obj2, long j);

    public native boolean n1113321(Object obj, Object obj2, long j);

    public native void n11133210(Object obj, Object obj2, long j, int i);

    public native void n11133220(Object obj, Object obj2, long j, long j2);

    public native Object n1113323(Object obj, Object obj2, long j);

    public native Object n111333(Object obj, Object obj2);

    public native void n1113330(Object obj, Object obj2, Object obj3);

    public native int n1113331(Object obj, Object obj2, Object obj3);

    public native void n11133310(Object obj, Object obj2, Object obj3, boolean z);

    public native void n1113331113330(Object obj, Object obj2, Object obj3, int i, int i2, int i3, Object obj4, Object obj5, Object obj6);

    public native Object n111333113(Object obj, Object obj2, Object obj3, int i, int i2);

    public native void n111333130(Object obj, Object obj2, Object obj3, int i, Object obj4);

    public native long n1113332(Object obj, Object obj2, Object obj3);

    public native Object n1113333(Object obj, Object obj2, Object obj3);

    public native void n11133330(Object obj, Object obj2, Object obj3, Object obj4);

    public native int n11133331(Object obj, Object obj2, Object obj3, Object obj4);

    public native void n111333310(Object obj, Object obj2, Object obj3, Object obj4, int i);

    public native void n1113333111110(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3, boolean z, boolean z2);

    public native void n1113333130(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5);

    public native void n111333320(Object obj, Object obj2, Object obj3, Object obj4, long j);

    public native Object n11133333(Object obj, Object obj2, Object obj3, Object obj4);

    public native void n111333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public native Object n111333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public native Object n1113333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static String getSoPath1() {
        return f19;
    }

    public static String getSoPath2() {
        return f20;
    }

    public static String getDir() {
        return f21;
    }

    public static Context getAppContext() {
        return f17;
    }

    public static Context getOrigApplicationContext(Context context) {
        if (context == f14) {
            return f15;
        }
        return context;
    }

    /* renamed from: ᵢˋ */
    private static Application m3(Context context) {
        try {
            if (f15 == null) {
                ClassLoader classLoader = context.getClassLoader();
                if (classLoader != null) {
                    Class loadClass = classLoader.loadClass(strEntryApplication);
                    if (loadClass != null) {
                        f15 = (Application) loadClass.newInstance();
                    }
                }
            }
        } catch (Exception e) {
        }
        return f15;
    }

    public final void onCreate() {
        super.onCreate();
        if (Configuration.ENABLE_CRASH_REPORT) {
            try {
                Class.forName("com.qihoo.bugreport.CrashReport").getDeclaredMethod("prepareInit", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable th) {
            }
        }
        try {
            interface7(f15, f14.getBaseContext());
        } catch (Exception e) {
        }
        if (f15 != null) {
            f15.onCreate();
        }
        if (Configuration.ENABLE_CRASH_REPORT) {
            try {
                Class.forName("com.qihoo.bugreport.CrashReport").getDeclaredMethod("init", new Class[]{Context.class}).invoke(null, new Object[]{getApplicationContext()});
            } catch (Throwable th2) {
            }
            Application application = f15;
            try {
                Class.forName("com.qihoo.jiagutracker.TrackerMain").getDeclaredMethod("init", new Class[]{Application.class}).invoke(null, new Object[]{application});
            } catch (Throwable th3) {
            }
        }
        if (VERSION.SDK_INT >= 14) {
            try {
                Class.forName("com.stub.adsdk.rpa.util.RpaActivityTracker").getDeclaredMethod("register", new Class[]{Application.class}).invoke(null, new Object[]{f15});
            } catch (Throwable th4) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068 A[SYNTHETIC, Splitter:B:37:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0073 A[SYNTHETIC, Splitter:B:43:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00cb A[SYNTHETIC, Splitter:B:77:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00d5 A[SYNTHETIC, Splitter:B:83:0x00d5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isX86Arch() {
        /*
            r3 = 0
            r1 = 0
            r0 = 1
            java.lang.String[] r4 = android.os.Build.SUPPORTED_32_BIT_ABIS     // Catch:{ NoSuchFieldError -> 0x0077 }
            int r5 = r4.length     // Catch:{ NoSuchFieldError -> 0x0077 }
            r2 = r1
        L_0x0007:
            if (r2 >= r5) goto L_0x0017
            r6 = r4[r2]     // Catch:{ NoSuchFieldError -> 0x0077 }
            java.lang.String r7 = "x86"
            boolean r6 = r6.contains(r7)     // Catch:{ NoSuchFieldError -> 0x0077 }
            if (r6 == 0) goto L_0x0014
        L_0x0013:
            return r0
        L_0x0014:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0017:
            java.lang.String r2 = android.os.Build.CPU_ABI     // Catch:{ NoSuchFieldError -> 0x0077 }
            java.lang.String r4 = "x86"
            boolean r2 = r2.contains(r4)     // Catch:{ NoSuchFieldError -> 0x0077 }
            if (r2 != 0) goto L_0x0013
            java.lang.String r2 = android.os.Build.CPU_ABI2     // Catch:{ NoSuchFieldError -> 0x0077 }
            java.lang.String r4 = "x86"
            boolean r2 = r2.contains(r4)     // Catch:{ NoSuchFieldError -> 0x0077 }
            if (r2 != 0) goto L_0x0013
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x005a, IOException -> 0x0064, all -> 0x006e }
            java.lang.String r4 = "/system/build.prop"
            java.lang.String r5 = "r"
            r2.<init>(r4, r5)     // Catch:{ FileNotFoundException -> 0x005a, IOException -> 0x0064, all -> 0x006e }
            java.lang.String r4 = r2.readLine()     // Catch:{ FileNotFoundException -> 0x00ed, IOException -> 0x00ea, all -> 0x00e7 }
        L_0x0038:
            if (r4 == 0) goto L_0x0055
            java.lang.String r5 = "ro.product.cpu.abi"
            boolean r5 = r4.contains(r5)     // Catch:{ FileNotFoundException -> 0x00ed, IOException -> 0x00ea, all -> 0x00e7 }
            if (r5 == 0) goto L_0x0050
            java.lang.String r5 = "x86"
            boolean r4 = r4.contains(r5)     // Catch:{ FileNotFoundException -> 0x00ed, IOException -> 0x00ea, all -> 0x00e7 }
            if (r4 == 0) goto L_0x0050
            r2.close()     // Catch:{ Exception -> 0x004e }
            goto L_0x0013
        L_0x004e:
            r1 = move-exception
            goto L_0x0013
        L_0x0050:
            java.lang.String r4 = r2.readLine()     // Catch:{ FileNotFoundException -> 0x00ed, IOException -> 0x00ea, all -> 0x00e7 }
            goto L_0x0038
        L_0x0055:
            r2.close()     // Catch:{ Exception -> 0x00d9 }
        L_0x0058:
            r0 = r1
            goto L_0x0013
        L_0x005a:
            r2 = move-exception
            r2 = r3
        L_0x005c:
            if (r2 == 0) goto L_0x0058
            r2.close()     // Catch:{ Exception -> 0x0062 }
            goto L_0x0058
        L_0x0062:
            r0 = move-exception
            goto L_0x0058
        L_0x0064:
            r2 = move-exception
            r2 = r3
        L_0x0066:
            if (r2 == 0) goto L_0x0058
            r2.close()     // Catch:{ Exception -> 0x006c }
            goto L_0x0058
        L_0x006c:
            r0 = move-exception
            goto L_0x0058
        L_0x006e:
            r2 = move-exception
            r4 = r2
            r5 = r3
        L_0x0071:
            if (r5 == 0) goto L_0x0076
            r5.close()     // Catch:{ Exception -> 0x00dc }
        L_0x0076:
            throw r4     // Catch:{ NoSuchFieldError -> 0x0077 }
        L_0x0077:
            r2 = move-exception
            java.lang.String r2 = android.os.Build.CPU_ABI
            java.lang.String r4 = "x86"
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L_0x0013
            java.lang.String r2 = android.os.Build.CPU_ABI2
            java.lang.String r4 = "x86"
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L_0x0013
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x00be, IOException -> 0x00c7, all -> 0x00d1 }
            java.lang.String r4 = "/system/build.prop"
            java.lang.String r5 = "r"
            r2.<init>(r4, r5)     // Catch:{ FileNotFoundException -> 0x00be, IOException -> 0x00c7, all -> 0x00d1 }
            java.lang.String r3 = r2.readLine()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e2, all -> 0x00e0 }
        L_0x0099:
            if (r3 == 0) goto L_0x00b8
            java.lang.String r4 = "ro.product.cpu.abi"
            boolean r4 = r3.contains(r4)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e2, all -> 0x00e0 }
            if (r4 == 0) goto L_0x00b3
            java.lang.String r4 = "x86"
            boolean r3 = r3.contains(r4)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e2, all -> 0x00e0 }
            if (r3 == 0) goto L_0x00b3
            r2.close()     // Catch:{ Exception -> 0x00b0 }
            goto L_0x0013
        L_0x00b0:
            r1 = move-exception
            goto L_0x0013
        L_0x00b3:
            java.lang.String r3 = r2.readLine()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00e2, all -> 0x00e0 }
            goto L_0x0099
        L_0x00b8:
            r2.close()     // Catch:{ Exception -> 0x00bc }
            goto L_0x0058
        L_0x00bc:
            r0 = move-exception
            goto L_0x0058
        L_0x00be:
            r0 = move-exception
        L_0x00bf:
            if (r3 == 0) goto L_0x0058
            r3.close()     // Catch:{ Exception -> 0x00c5 }
            goto L_0x0058
        L_0x00c5:
            r0 = move-exception
            goto L_0x0058
        L_0x00c7:
            r0 = move-exception
            r2 = r3
        L_0x00c9:
            if (r2 == 0) goto L_0x0058
            r2.close()     // Catch:{ Exception -> 0x00cf }
            goto L_0x0058
        L_0x00cf:
            r0 = move-exception
            goto L_0x0058
        L_0x00d1:
            r0 = move-exception
            r2 = r3
        L_0x00d3:
            if (r2 == 0) goto L_0x00d8
            r2.close()     // Catch:{ Exception -> 0x00de }
        L_0x00d8:
            throw r0
        L_0x00d9:
            r0 = move-exception
            goto L_0x0058
        L_0x00dc:
            r2 = move-exception
            goto L_0x0076
        L_0x00de:
            r1 = move-exception
            goto L_0x00d8
        L_0x00e0:
            r0 = move-exception
            goto L_0x00d3
        L_0x00e2:
            r0 = move-exception
            goto L_0x00c9
        L_0x00e4:
            r0 = move-exception
            r3 = r2
            goto L_0x00bf
        L_0x00e7:
            r4 = move-exception
            r5 = r2
            goto L_0x0071
        L_0x00ea:
            r4 = move-exception
            goto L_0x0066
        L_0x00ed:
            r4 = move-exception
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stub.StubApp.isX86Arch():boolean");
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        boolean r2;
        String str;
        super.attachBaseContext(context);
        f17 = context;
        if (f14 == null) {
            f14 = this;
        }
        if (f15 == null) {
            Boolean valueOf = Boolean.valueOf(isX86Arch());
            Boolean valueOf2 = Boolean.valueOf(false);
            Boolean valueOf3 = Boolean.valueOf(false);
            if (Build.CPU_ABI.contains("64") || Build.CPU_ABI2.contains("64")) {
                valueOf2 = Boolean.valueOf(true);
            }
            if (Build.CPU_ABI.contains("mips") || Build.CPU_ABI2.contains("mips")) {
                valueOf3 = Boolean.valueOf(true);
            }
            if (valueOf.booleanValue() && needX86Bridge) {
                System.loadLibrary("X86Bridge");
            }
            if (!loadFromLib) {
                String absolutePath = context.getFilesDir().getParentFile().getAbsolutePath();
                try {
                    absolutePath = context.getFilesDir().getParentFile().getCanonicalPath();
                } catch (Exception e) {
                }
                String str2 = absolutePath + "/.jiagu";
                f22 = m4(str2, valueOf2.booleanValue(), valueOf3.booleanValue());
                f18 = m4(str2, false, false);
                f19 = str2 + File.separator + f18;
                f20 = str2 + File.separator + f22;
                f21 = str2;
                if (valueOf3.booleanValue()) {
                    m5(context, f16 + "_mips.so", str2, f18);
                } else if (!valueOf.booleanValue() || needX86Bridge) {
                    m5(context, f16 + ".so", str2, f18);
                } else {
                    m5(context, f16 + "_x86.so", str2, f18);
                }
                if (!valueOf2.booleanValue() || valueOf3.booleanValue()) {
                    System.load(str2 + "/" + f18);
                } else {
                    if (!valueOf.booleanValue() || needX86Bridge) {
                        r2 = m5(context, f16 + "_a64.so", str2, f22);
                    } else {
                        r2 = m5(context, f16 + "_x64.so", str2, f22);
                    }
                    if (r2) {
                        System.load(str2 + "/" + f22);
                    } else {
                        System.load(str2 + "/" + f18);
                    }
                }
            } else if (!valueOf.booleanValue() || needX86Bridge) {
                System.loadLibrary("jiagu");
            } else {
                System.loadLibrary("jiagu_x86");
            }
            boolean booleanValue = valueOf.booleanValue();
            boolean booleanValue2 = valueOf2.booleanValue();
            boolean booleanValue3 = valueOf3.booleanValue();
            if (loadDexToC) {
                if (loadFromLib) {
                    try {
                        System.loadLibrary("jgdtc");
                    } catch (Error e2) {
                    }
                } else {
                    String absolutePath2 = f17.getFilesDir().getParentFile().getAbsolutePath();
                    try {
                        absolutePath2 = f17.getFilesDir().getParentFile().getCanonicalPath();
                    } catch (Exception e3) {
                    }
                    String str3 = absolutePath2 + File.separator + ".jiagu";
                    String str4 = "libjgdtc";
                    if (VERSION.SDK_INT < 23) {
                        str4 = str4 + str3.hashCode();
                    }
                    if (!booleanValue2 || booleanValue3) {
                        str = str4 + ".so";
                    } else {
                        str = str4 + "_64.so";
                    }
                    if (booleanValue3) {
                        m5(f17, "libjgdtc_mips.so", str3, str);
                    } else if (booleanValue && !booleanValue2) {
                        m5(f17, "libjgdtc_x86.so", str3, str);
                    } else if (booleanValue && booleanValue2) {
                        m5(f17, "libjgdtc_x64.so", str3, str);
                    } else if (booleanValue || booleanValue3 || !booleanValue2) {
                        m5(f17, "libjgdtc.so", str3, str);
                    } else {
                        m5(f17, "libjgdtc_a64.so", str3, str);
                    }
                    try {
                        System.load(str3 + File.separator + str);
                    } catch (Error e4) {
                    }
                }
            }
        }
        interface5(f14);
        if (f15 == null) {
            f15 = m3(context);
            if (f15 != null) {
                try {
                    Method declaredMethod = Application.class.getDeclaredMethod("attach", new Class[]{Context.class});
                    if (declaredMethod != null) {
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(f15, new Object[]{context});
                    }
                    interface8(f15, context);
                } catch (Exception e5) {
                    throw new RuntimeException("Failed to call attachBaseContext.", e5);
                }
            } else {
                System.exit(1);
            }
        }
    }

    /* renamed from: ᵢˋ */
    private static String m4(String str, boolean z, boolean z2) {
        String str2 = f16;
        if (VERSION.SDK_INT < 23) {
            str2 = str2 + str.hashCode();
        }
        if (!z || z2) {
            return str2 + ".so";
        }
        return str2 + "_64.so";
    }

    /* renamed from: ᵢˋ */
    private static boolean m5(Context context, String str, String str2, String str3) {
        boolean z;
        String str4 = str2 + "/" + str3;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            File file2 = new File(str4);
            if (file2.exists()) {
                InputStream open = context.getResources().getAssets().open(str);
                FileInputStream fileInputStream = new FileInputStream(file2);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(open);
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(fileInputStream);
                if (m6(bufferedInputStream, bufferedInputStream2)) {
                    z = true;
                } else {
                    z = false;
                }
                open.close();
                fileInputStream.close();
                bufferedInputStream.close();
                bufferedInputStream2.close();
                if (z) {
                    return true;
                }
            }
            InputStream open2 = context.getResources().getAssets().open(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str4);
            byte[] bArr = new byte[7168];
            while (true) {
                int read = open2.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    open2.close();
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: ᵢˋ */
    private static boolean m6(BufferedInputStream bufferedInputStream, BufferedInputStream bufferedInputStream2) {
        try {
            int available = bufferedInputStream.available();
            int available2 = bufferedInputStream2.available();
            if (available != available2) {
                return false;
            }
            byte[] bArr = new byte[available];
            byte[] bArr2 = new byte[available2];
            bufferedInputStream.read(bArr);
            bufferedInputStream2.read(bArr2);
            for (int i = 0; i < available; i++) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
            }
            return true;
        } catch (FileNotFoundException | IOException e) {
            return false;
        }
    }

    public static String getString2(int i) {
        String str = (String) f23.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        String interface14 = interface14(i);
        f23.put(Integer.valueOf(i), interface14);
        return interface14;
    }

    public static String getString2(String str) {
        try {
            return getString2(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }
}
