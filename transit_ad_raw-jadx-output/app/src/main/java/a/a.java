package a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.fido.d0;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final class a implements y2.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43a;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        r0 = r5;
        r5 = r1;
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0050, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r5) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "yssenslog.txt"
            r1 = 0
            if (r5 == 0) goto L50
            java.io.FileInputStream r5 = r5.openFileInput(r0)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31 java.lang.SecurityException -> L33 java.io.FileNotFoundException -> L45
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23 java.lang.SecurityException -> L25 java.io.FileNotFoundException -> L2a
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23 java.lang.SecurityException -> L25 java.io.FileNotFoundException -> L2a
            java.lang.String r3 = "UTF-8"
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23 java.lang.SecurityException -> L25 java.io.FileNotFoundException -> L2a
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23 java.lang.SecurityException -> L25 java.io.FileNotFoundException -> L2a
        L16:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23 java.lang.SecurityException -> L25 java.io.FileNotFoundException -> L2a
            if (r2 == 0) goto L1e
            r1 = r2
            goto L16
        L1e:
            if (r5 == 0) goto L50
            goto L4b
        L21:
            r0 = move-exception
            goto L3f
        L23:
            r0 = move-exception
            goto L26
        L25:
            r0 = move-exception
        L26:
            r4 = r1
            r1 = r5
            r5 = r4
            goto L36
        L2a:
            r4 = r1
            r1 = r5
            r5 = r4
            goto L46
        L2e:
            r5 = move-exception
            r0 = r5
            goto L3e
        L31:
            r5 = move-exception
            goto L34
        L33:
            r5 = move-exception
        L34:
            r0 = r5
            r5 = r1
        L36:
            java.lang.String r2 = "CustomLogFileManagerImpl.readAll"
            jp.co.yahoo.android.customlog.h.f(r2, r0)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L4f
            goto L48
        L3e:
            r5 = r1
        L3f:
            if (r5 == 0) goto L44
            r5.close()     // Catch: java.io.IOException -> L44
        L44:
            throw r0
        L45:
            r5 = r1
        L46:
            if (r1 == 0) goto L4f
        L48:
            r0 = r5
            r5 = r1
            r1 = r0
        L4b:
            r5.close()     // Catch: java.io.IOException -> L50
            goto L50
        L4f:
            r1 = r5
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a(android.content.Context):java.lang.String");
    }

    public static boolean c(Context context, String str) {
        boolean z = false;
        if (context == null || str == null) {
            return false;
        }
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            try {
                fileOutputStreamOpenFileOutput = context.openFileOutput("yssenslog.txt", 0);
                fileOutputStreamOpenFileOutput.write(str.getBytes());
                z = true;
            } catch (IOException e) {
                jp.co.yahoo.android.customlog.h.f("CustomLogFileManagerImpl.overWriteAll", e);
                if (fileOutputStreamOpenFileOutput != null) {
                }
                return z;
            }
            try {
                fileOutputStreamOpenFileOutput.close();
            } catch (IOException unused) {
            }
            return z;
        } catch (Throwable th) {
            if (fileOutputStreamOpenFileOutput != null) {
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public final synchronized void b(HashMap map) {
        String strA = a((Context) this.f43a);
        try {
            JSONObject jSONObject = strA != null ? new JSONObject(strA) : new JSONObject();
            jSONObject.put("firstLaunch", new JSONObject(map));
            c((Context) this.f43a, jSONObject.toString());
        } catch (NullPointerException | JSONException e) {
            jp.co.yahoo.android.customlog.h.f("CustomLogFileManagerImpl.write", e);
        }
    }

    public final void d(a.e eVar, Object obj) {
        ((d0) eVar).x().B(new p3.d((g4.j) obj));
    }

    public final Message e(int i2, Object obj) {
        return ((Handler) this.f43a).obtainMessage(i2, obj);
    }

    public final void f(int i2) {
        ((Handler) this.f43a).sendEmptyMessage(i2);
    }
}
