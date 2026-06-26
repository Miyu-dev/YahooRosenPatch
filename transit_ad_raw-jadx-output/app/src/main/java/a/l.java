package a;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import c4.a2;
import c4.c2;
import com.google.android.gms.internal.location.d0;
import com.google.android.gms.internal.measurement.r7;
import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.internal.measurement.z8;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringWriter;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;
import jp.co.yahoo.android.yjvoice2.internal.apicaller.yjvoice2.voicedata.VoiceActivityEventType;
import jp.co.yahoo.android.yrequiredcondition.config.AvailableAreaCheckConfiguration;
import jp.co.yahoo.yconnect.AppLoginExplicit;
import jp.co.yahoo.yconnect.YJLoginManager;
import kotlin.Pair;
import kotlin.jvm.internal.q;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.text.r;
import okio.SegmentedByteString;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.exceptions.CompositeException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;
import y2.h;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public class l implements a2, com.google.android.gms.internal.location.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ l f54a = new l();
    public static final /* synthetic */ l b = new l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r7 f55c = new r7();
    public static final s7 d = new s7();
    public static final String[] e = {"前", "中", "後"};

    /* JADX INFO: Thrown type has an unknown type hierarchy: rx.exceptions.OnErrorFailedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: rx.exceptions.OnErrorNotImplementedException */
    public static void A(Throwable th) throws OnErrorFailedException, OnErrorNotImplementedException {
        if (th instanceof OnErrorNotImplementedException) {
            throw ((OnErrorNotImplementedException) th);
        }
        if (th instanceof OnErrorFailedException) {
            OnErrorFailedException onErrorFailedException = (OnErrorFailedException) th;
            Throwable cause = onErrorFailedException.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw onErrorFailedException;
            }
            throw ((RuntimeException) cause);
        }
        if (th instanceof StackOverflowError) {
            throw ((StackOverflowError) th);
        }
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final String B(String str) {
        kotlin.jvm.internal.m.h(str, "<this>");
        int i2 = 0;
        int i3 = -1;
        if (!r.e1(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                kotlin.jvm.internal.m.g(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                kotlin.jvm.internal.m.g(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                kotlin.jvm.internal.m.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i4 = 0;
                while (i4 < length) {
                    int i5 = i4 + 1;
                    char cCharAt = lowerCase.charAt(i4);
                    if (kotlin.jvm.internal.m.j(cCharAt, 31) > 0 && kotlin.jvm.internal.m.j(cCharAt, 127) < 0 && r.m1(" #%/:?@[\\]", cCharAt, 0, false, 6) == -1) {
                        i4 = i5;
                    }
                    i2 = 1;
                    break;
                }
                if (i2 != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressL = (kotlin.text.m.d1(str, "[", false) && kotlin.text.m.V0(str, "]", false)) ? l(1, str.length() - 1, str) : l(0, str.length(), str);
        if (inetAddressL == null) {
            return null;
        }
        byte[] address = inetAddressL.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressL.getHostAddress();
            }
            throw new AssertionError(android.support.v4.media.a.d("Invalid IPv6 address: '", str, '\''));
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < address.length) {
            int i8 = i6;
            while (i8 < 16 && address[i8] == 0 && address[i8 + 1] == 0) {
                i8 += 2;
            }
            int i9 = i8 - i6;
            if (i9 > i7 && i9 >= 4) {
                i3 = i6;
                i7 = i9;
            }
            i6 = i8 + 2;
        }
        jk.e eVar = new jk.e();
        while (i2 < address.length) {
            if (i2 == i3) {
                eVar.a0(58);
                i2 += i7;
                if (i2 == 16) {
                    eVar.a0(58);
                }
            } else {
                if (i2 > 0) {
                    eVar.a0(58);
                }
                byte b2 = address[i2];
                byte[] bArr = xj.b.a;
                eVar.p0(((b2 & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return eVar.N();
    }

    public static final qj.f C(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new qj.f(i2, i3 - 1);
        }
        qj.f fVar = qj.f.d;
        return qj.f.d;
    }

    public static int D(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int E(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long F(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static final void c(zj.a aVar, zj.c cVar, String str) {
        Logger logger = zj.d.i;
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.b);
        sb.append(' ');
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        kotlin.jvm.internal.m.g(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(aVar.a);
        logger.fine(sb.toString());
    }

    public static final Object[] d(int i2) {
        if (i2 >= 0) {
            return new Object[i2];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static boolean e(Context context) {
        kotlin.jvm.internal.m.h(context, "context");
        try {
            int i2 = YJLoginManager.c;
            Object objInvoke = ai.a.q(q.a(YJLoginManager.class)).getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Object objInvoke2 = objInvoke.getClass().getMethod("isAccessTokenExpired", Context.class).invoke(objInvoke, context);
            if (objInvoke2 != null) {
                return ((Boolean) objInvoke2).booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (ReflectiveOperationException unused) {
            if (!cf.a.b) {
                return false;
            }
            Log.d("YJACookieLibrary", "Failed to get token expire");
            return false;
        }
    }

    public static final String f(Number number, Number number2) {
        kotlin.jvm.internal.m.h(number, TypedValues.TransitionType.S_FROM);
        kotlin.jvm.internal.m.h(number2, "until");
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final double g(double d2, double d3, double d4) {
        if (d3 <= d4) {
            return d2 < d3 ? d3 : d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static final float h(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static final int i(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static final long j(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException(a6.h.h(android.support.v4.media.a.i("Cannot coerce value to an empty range: maximum ", j3, " is less than minimum "), j2, '.'));
    }

    public static final Comparable k(Comparable comparable, qj.b bVar) {
        kotlin.jvm.internal.m.h(comparable, "<this>");
        kotlin.jvm.internal.m.h(bVar, "range");
        if (!bVar.isEmpty()) {
            return (!bVar.b(comparable, bVar.getStart()) || bVar.b(bVar.getStart(), comparable)) ? (!bVar.b(bVar.getEndInclusive(), comparable) || bVar.b(comparable, bVar.getEndInclusive())) ? comparable : bVar.getEndInclusive() : bVar.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + bVar + '.');
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a1, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00de, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress l(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l.l(int, int, java.lang.String):java.net.InetAddress");
    }

    public static final String m(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j <= -999500) {
            str = ((j - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500) {
            str = ((j + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500000) {
            str = ((j + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        return androidx.compose.animation.a.e(new Object[]{str}, 1, "%6s", "format(format, *args)");
    }

    public static Double n(String str, JSONObject jSONObject) {
        double dOptDouble = jSONObject.optDouble(str);
        if (Double.isNaN(dOptDouble)) {
            return null;
        }
        return Double.valueOf(dOptDouble);
    }

    public static final ArrayList o(rj.d dVar) {
        Collection allNonStaticMembers = ((KClassImpl.Data) ((KClassImpl) dVar).getData().invoke()).getAllNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) obj;
            boolean z = false;
            if ((!(kCallableImpl.getDescriptor().getExtensionReceiverParameter() != null)) && (kCallableImpl instanceof rj.n)) {
                z = true;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final int p(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 >= i3) {
                return i3;
            }
            int i5 = i3 % i4;
            if (i5 < 0) {
                i5 += i4;
            }
            int i6 = i2 % i4;
            if (i6 < 0) {
                i6 += i4;
            }
            int i7 = (i5 - i6) % i4;
            if (i7 < 0) {
                i7 += i4;
            }
            return i3 - i7;
        }
        if (i4 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i2 <= i3) {
            return i3;
        }
        int i8 = -i4;
        int i9 = i2 % i8;
        if (i9 < 0) {
            i9 += i8;
        }
        int i10 = i3 % i8;
        if (i10 < 0) {
            i10 += i8;
        }
        int i11 = (i9 - i10) % i8;
        if (i11 < 0) {
            i11 += i8;
        }
        return i3 + i11;
    }

    public static final void q(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        kotlin.jvm.internal.m.e(str);
        firebaseCrashlytics.log(str);
    }

    public static final void r(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (str == null) {
            str = "";
        }
        q(str + "_" + str2);
    }

    public static ig.b t(String str) throws JSONException {
        JSONArray jSONArray;
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        kotlin.jvm.internal.m.h(str, "value");
        JSONObject jSONObject = new JSONObject(str);
        int i3 = jSONObject.getInt("resultIndexNum");
        String str2 = "results";
        JSONArray jSONArray2 = jSONObject.getJSONArray("results");
        ArrayList arrayList6 = new ArrayList();
        int length = jSONArray2.length();
        int i4 = 0;
        while (i4 < length) {
            JSONObject jSONObject2 = jSONArray2.getJSONObject(i4);
            kotlin.jvm.internal.m.g(jSONObject2, "recognizeResultsJson.getJSONObject(i)");
            int i5 = jSONObject2.getInt("index");
            int i6 = jSONObject2.getInt("nBestSize");
            boolean z = jSONObject2.getBoolean("isFinished");
            Double dN = n("realTimeFactor", jSONObject2);
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("voiceActivityEvents");
            if (jSONArrayOptJSONArray == null) {
                jSONArray = jSONArray2;
                arrayList = arrayList6;
                i2 = length;
                arrayList2 = null;
            } else {
                ArrayList arrayList7 = new ArrayList();
                int length2 = jSONArrayOptJSONArray.length();
                int i7 = 0;
                while (i7 < length2) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i7);
                    kotlin.jvm.internal.m.g(jSONObject3, "eventJson.getJSONObject(i)");
                    ArrayList arrayList8 = arrayList6;
                    double d2 = jSONObject3.getDouble("time");
                    JSONArray jSONArray3 = jSONArrayOptJSONArray;
                    String string = jSONObject3.getString("event");
                    kotlin.jvm.internal.m.g(string, "getString(\"event\")");
                    arrayList7.add(new ig.h(d2, VoiceActivityEventType.valueOf(string)));
                    i7++;
                    jSONArray2 = jSONArray2;
                    length = length;
                    arrayList6 = arrayList8;
                    jSONArrayOptJSONArray = jSONArray3;
                }
                jSONArray = jSONArray2;
                arrayList = arrayList6;
                i2 = length;
                arrayList2 = arrayList7;
            }
            JSONObject jSONObject4 = jSONObject2.getJSONObject("transcript");
            kotlin.jvm.internal.m.g(jSONObject4, "transcriptJson");
            JSONArray jSONArray4 = jSONObject4.getJSONArray(str2);
            ArrayList arrayList9 = new ArrayList();
            int length3 = jSONArray4.length();
            int i8 = 0;
            while (i8 < length3) {
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i8);
                kotlin.jvm.internal.m.g(jSONObject5, "transcriptResultsJson.getJSONObject(i)");
                String string2 = jSONObject5.getString("text");
                kotlin.jvm.internal.m.g(string2, "getString(\"text\")");
                String string3 = jSONObject5.getString("pron");
                kotlin.jvm.internal.m.g(string3, "getString(\"pron\")");
                arrayList9.add(new ig.f(string2, string3, n("confidence", jSONObject5)));
                i8++;
                str2 = str2;
                jSONArray4 = jSONArray4;
            }
            String str3 = str2;
            JSONArray jSONArrayOptJSONArray2 = jSONObject4.optJSONArray("filteredResults");
            if (jSONArrayOptJSONArray2 == null) {
                arrayList3 = null;
            } else {
                arrayList3 = new ArrayList();
                int length4 = jSONArrayOptJSONArray2.length();
                int i9 = 0;
                while (i9 < length4) {
                    JSONObject jSONObject6 = jSONArrayOptJSONArray2.getJSONObject(i9);
                    kotlin.jvm.internal.m.g(jSONObject6, "filteredResultsJson.getJSONObject(i)");
                    String string4 = jSONObject6.getString("text");
                    kotlin.jvm.internal.m.g(string4, "getString(\"text\")");
                    arrayList3.add(new ig.a(string4));
                    i9++;
                    jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                }
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObject4.optJSONArray("detailResults");
            if (jSONArrayOptJSONArray3 == null) {
                arrayList4 = null;
            } else {
                arrayList4 = new ArrayList();
                int length5 = jSONArrayOptJSONArray3.length();
                for (int i10 = 0; i10 < length5; i10++) {
                    JSONObject jSONObject7 = jSONArrayOptJSONArray3.getJSONObject(i10);
                    kotlin.jvm.internal.m.g(jSONObject7, "detailResultsJson.getJSONObject(i)");
                    arrayList4.add(u(jSONObject7));
                }
            }
            JSONArray jSONArrayOptJSONArray4 = jSONObject4.optJSONArray("rawResults");
            if (jSONArrayOptJSONArray4 == null) {
                arrayList5 = null;
            } else {
                arrayList5 = new ArrayList();
                int length6 = jSONArrayOptJSONArray4.length();
                for (int i11 = 0; i11 < length6; i11++) {
                    JSONObject jSONObject8 = jSONArrayOptJSONArray4.getJSONObject(i11);
                    kotlin.jvm.internal.m.g(jSONObject8, "rawResultsJson.getJSONObject(i)");
                    arrayList5.add(u(jSONObject8));
                }
            }
            ArrayList arrayList10 = arrayList;
            arrayList10.add(new ig.c(i5, z, i6, dN, new ig.e(arrayList9, arrayList3, arrayList4, arrayList5), arrayList2));
            i4++;
            arrayList6 = arrayList10;
            jSONArray2 = jSONArray;
            length = i2;
            str2 = str3;
        }
        return new ig.b(i3, arrayList6);
    }

    public static ig.d u(JSONObject jSONObject) throws JSONException {
        Double dN = n("confidence", jSONObject);
        Double dN2 = n("acousticModelWeight", jSONObject);
        Double dN3 = n("languageModelWeight", jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("tokens");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            kotlin.jvm.internal.m.g(jSONObject2, "tokensJson.getJSONObject(i)");
            String string = jSONObject2.getString("word");
            kotlin.jvm.internal.m.g(string, "getString(\"word\")");
            String string2 = jSONObject2.getString("pron");
            kotlin.jvm.internal.m.g(string2, "getString(\"pron\")");
            arrayList.add(new ig.g(string, string2, n("startTime", jSONObject2), n("endTime", jSONObject2)));
        }
        return new ig.d(dN, dN2, dN3, arrayList);
    }

    public static final String v(BufferedReader bufferedReader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i2 = bufferedReader.read(cArr);
        while (i2 >= 0) {
            stringWriter.write(cArr, 0, i2);
            i2 = bufferedReader.read(cArr);
        }
        String string = stringWriter.toString();
        kotlin.jvm.internal.m.g(string, "buffer.toString()");
        return string;
    }

    public static final void w(Object[] objArr, int i2, int i3) {
        kotlin.jvm.internal.m.h(objArr, "<this>");
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static final int x(SegmentedByteString segmentedByteString, int i2) {
        int i3;
        kotlin.jvm.internal.m.h(segmentedByteString, "<this>");
        int[] directory$okio = segmentedByteString.getDirectory$okio();
        int i4 = i2 + 1;
        int length = segmentedByteString.getSegments$okio().length;
        kotlin.jvm.internal.m.h(directory$okio, "<this>");
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = directory$okio[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    public static final qj.d y(qj.f fVar, int i2) {
        kotlin.jvm.internal.m.h(fVar, "<this>");
        boolean z = i2 > 0;
        Integer numValueOf = Integer.valueOf(i2);
        kotlin.jvm.internal.m.h(numValueOf, "step");
        if (z) {
            if (((qj.d) fVar).c <= 0) {
                i2 = -i2;
            }
            return new qj.d(((qj.d) fVar).a, ((qj.d) fVar).b, i2);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rx.exceptions.CompositeException */
    public static void z(ArrayList arrayList) throws CompositeException {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != 1) {
            throw new CompositeException("Multiple exceptions", arrayList);
        }
        Throwable th = (Throwable) arrayList.get(0);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new RuntimeException(th);
        }
        throw ((Error) th);
    }

    public String a(Context context) {
        kotlin.jvm.internal.m.h(context, "context");
        try {
            Object objInvoke = ai.a.q(q.a(AppLoginExplicit.class)).getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            return (String) objInvoke.getClass().getMethod("getAccessToken", Context.class).invoke(objInvoke, context);
        } catch (ReflectiveOperationException unused) {
            if (!cf.a.b) {
                return null;
            }
            Log.d("YJACookieLibrary", "Failed to get accessToken");
            return null;
        }
    }

    public void b(d0 d0Var, h.a aVar, boolean z, g4.j jVar) {
        d0Var.G(aVar, z, jVar);
    }

    public void s(FragmentManager fragmentManager, AvailableAreaCheckConfiguration.AlertConfig alertConfig) {
        kotlin.jvm.internal.m.h(fragmentManager, "manager");
        kotlin.jvm.internal.m.h(alertConfig, "config");
        fh.b bVarFindFragmentByTag = fragmentManager.findFragmentByTag("jp.co.yahoo.android.yrequiredcondition.AvailableArea.dialog");
        if (bVarFindFragmentByTag instanceof fh.b) {
            Dialog dialog = bVarFindFragmentByTag.getDialog();
            if (dialog != null ? dialog.isShowing() : false) {
                return;
            }
        }
        fh.b.a.getClass();
        fh.b bVar = new fh.b();
        bVar.setArguments(BundleKt.bundleOf(new Pair[]{new Pair("yrequiredcondition_available_area", alertConfig)}));
        bVar.show(fragmentManager, "jp.co.yahoo.android.yrequiredcondition.AvailableArea.dialog");
    }

    public Object zza() {
        List list = c2.a;
        return Long.valueOf(z8.b.a().d());
    }
}
