package com.android.cglib.p008dx.p015c.p017b;

import com.android.cglib.p008dx.p020d.C0301o;

/* renamed from: com.android.cglib.dx.c.b.o */
public final class C0248o extends C0301o {

    /* renamed from: a */
    public static final C0248o f1779a = new C0248o(0);

    /* renamed from: b */
    private final C0244m[] f1780b;

    /* renamed from: c */
    private int f1781c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0248o(int i) {
        super(i != 0);
        this.f1780b = new C0244m[i];
        this.f1781c = 0;
    }

    /* renamed from: a */
    public int mo1617a() {
        return this.f1780b.length;
    }

    /* renamed from: a */
    public C0244m mo1618a(int i) {
        try {
            return this.f1780b[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    /* renamed from: a */
    public C0244m mo1619a(C0244m mVar) {
        for (C0244m mVar2 : this.f1780b) {
            if (mVar2 != null && mVar.mo1590b(mVar2)) {
                return mVar2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo1620a(C0248o oVar) {
        int a = oVar.mo1617a();
        for (int i = 0; i < a; i++) {
            C0244m a2 = oVar.mo1618a(i);
            if (a2 != null) {
                mo1624c(a2);
            }
        }
    }

    /* renamed from: b */
    public int mo1621b() {
        int i = this.f1781c;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (C0244m mVar : this.f1780b) {
            if (mVar != null) {
                i2++;
            }
        }
        this.f1781c = i2;
        return i2;
    }

    /* renamed from: b */
    public C0248o mo1622b(int i) {
        C0248o oVar = new C0248o(r0 + i);
        for (C0244m mVar : this.f1780b) {
            if (mVar != null) {
                oVar.mo1624c(mVar.mo1593c(i));
            }
        }
        oVar.f1781c = this.f1781c;
        if (mo1800f()) {
            oVar.mo1799e();
        }
        return oVar;
    }

    /* renamed from: b */
    public void mo1623b(C0244m mVar) {
        try {
            this.f1780b[mVar.mo1596e()] = null;
            this.f1781c = -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r3 = r0 - 1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1624c(com.android.cglib.p008dx.p015c.p017b.C0244m r6) {
        /*
            r5 = this;
            r5.mo1802h()
            if (r6 != 0) goto L_0x000d
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "spec == null"
            r6.<init>(r0)
            throw r6
        L_0x000d:
            r0 = -1
            r5.f1781c = r0
            int r0 = r6.mo1596e()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x003b }
            com.android.cglib.dx.c.b.m[] r1 = r5.f1780b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x003b }
            r1[r0] = r6     // Catch:{ ArrayIndexOutOfBoundsException -> 0x003b }
            r1 = 0
            r2 = 2
            if (r0 <= 0) goto L_0x002e
            int r3 = r0 + -1
            com.android.cglib.dx.c.b.m[] r4 = r5.f1780b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x003b }
            r4 = r4[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x003b }
            if (r4 == 0) goto L_0x002e
            int r4 = r4.mo1602i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x003b }
            if (r4 != r2) goto L_0x002e
            com.android.cglib.dx.c.b.m[] r4 = r5.f1780b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x003b }
            r4[r3] = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x003b }
        L_0x002e:
            int r6 = r6.mo1602i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x003b }
            if (r6 != r2) goto L_0x003a
            com.android.cglib.dx.c.b.m[] r6 = r5.f1780b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x003b }
            int r0 = r0 + 1
            r6[r0] = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x003b }
        L_0x003a:
            return
        L_0x003b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "spec.getReg() out of range"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.cglib.p008dx.p015c.p017b.C0248o.mo1624c(com.android.cglib.dx.c.b.m):void");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0248o)) {
            return false;
        }
        C0248o oVar = (C0248o) obj;
        C0244m[] mVarArr = oVar.f1780b;
        int length = this.f1780b.length;
        if (length != mVarArr.length || mo1621b() != oVar.mo1621b()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            C0244m mVar = this.f1780b[i];
            C0244m mVar2 = mVarArr[i];
            if (mVar != mVar2 && (mVar == null || !mVar.equals(mVar2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int length = this.f1780b.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            C0244m mVar = this.f1780b[i2];
            i = (i * 31) + (mVar == null ? 0 : mVar.hashCode());
        }
        return i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(r0 * 25);
        stringBuffer.append('{');
        boolean z = false;
        for (C0244m mVar : this.f1780b) {
            if (mVar != null) {
                if (z) {
                    stringBuffer.append(", ");
                } else {
                    z = true;
                }
                stringBuffer.append(mVar);
            }
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
