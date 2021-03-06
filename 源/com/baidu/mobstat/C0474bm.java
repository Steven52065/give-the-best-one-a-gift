package com.baidu.mobstat;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.androlua.BuildConfig;
import java.util.HashMap;

/* renamed from: com.baidu.mobstat.bm */
class C0474bm {

    /* renamed from: b */
    private static HandlerThread f3157b = new HandlerThread("EventHandleThread");

    /* renamed from: c */
    private static Handler f3158c;

    /* renamed from: d */
    private static C0474bm f3159d = new C0474bm();

    /* renamed from: a */
    HashMap<String, C0480bs> f3160a = new HashMap<>();

    private C0474bm() {
        f3157b.start();
        f3157b.setPriority(10);
        f3158c = new Handler(f3157b.getLooper());
    }

    /* renamed from: a */
    public static C0474bm m2965a() {
        return f3159d;
    }

    /* renamed from: a */
    public String mo3298a(String str, String str2) {
        return "__sdk_" + str + "$|$" + str2;
    }

    /* renamed from: a */
    public void mo3299a(Context context, String str, String str2, int i, long j, long j2, ExtraInfo extraInfo) {
        Context context2 = context;
        DataCore.instance().putEvent(context2, str, str2, i, j, j2, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, false, extraInfo);
        DataCore.instance().flush(context2);
    }

    /* renamed from: a */
    public void mo3300a(Context context, String str, String str2, int i, long j, long j2, String str3, String str4, int i2, boolean z) {
        Context context2 = context;
        DataCore.instance().putEvent(context2, str, str2, i, j, j2, str3, str4, i2, z, (ExtraInfo) null);
        DataCore.instance().flush(context2);
    }

    /* renamed from: a */
    public void mo3301a(Context context, String str, String str2, int i, long j, ExtraInfo extraInfo) {
        f3158c.post(new C0476bo(this, context, str, str2, i, j, extraInfo));
    }

    /* renamed from: a */
    public void mo3302a(Context context, String str, String str2, int i, long j, String str3, String str4, int i2, boolean z) {
        f3158c.post(new C0475bn(this, context, str, str2, i, j, str3, str4, i2, z));
    }

    /* renamed from: a */
    public void mo3303a(Context context, String str, String str2, long j) {
        f3158c.post(new C0477bp(this, j, str, str2));
    }

    /* renamed from: a */
    public void mo3304a(Context context, String str, String str2, long j, ExtraInfo extraInfo) {
        f3158c.post(new C0478bq(this, str, str2, j, context, extraInfo));
    }

    /* renamed from: b */
    public void mo3305b(Context context, String str, String str2, long j, ExtraInfo extraInfo) {
        f3158c.post(new C0479br(this, j, context, str, str2, extraInfo));
    }
}
