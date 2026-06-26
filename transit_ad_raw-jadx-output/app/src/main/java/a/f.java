package a;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.measurement.a8;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.g6;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzkh;
import com.google.android.gms.location.LastLocationRequest;
import com.google.common.collect.v1;
import com.google.common.collect.v2;
import com.google.common.collect.v3;
import g6.c;
import h9.k0;
import java.io.IOException;
import java.io.Serializable;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jp.co.yahoo.android.ads.data.FeedbackData;
import jp.co.yahoo.android.apps.transit.api.data.ConditionData;
import jp.co.yahoo.android.apps.transit.api.data.navi.ClientSearchCondition;
import jp.co.yahoo.android.apps.transit.api.data.navi.NaviData;
import jp.co.yahoo.android.apps.transit.ui.fragment.spot.StationInfoFragment;
import jp.co.yahoo.android.apps.transit.ui.fragment.spot.h;
import jp.co.yahoo.android.apps.transit.ui.fragment.timetable.d0;
import jp.co.yahoo.android.apps.transit.ui.fragment.timetable.p;
import jp.co.yahoo.android.apps.transit.ui.fragment.timetable.p0;
import jp.co.yahoo.android.maps.place.data.repository.common.response.ImageUrlMap;
import kotlin.collections.EmptyList;
import kotlin.collections.y;
import n8.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r8.p;
import wj.f0;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public class f implements y2.n, oi.f, nk.f, x.e {
    public static UiModeManager b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f f47a = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f48c = new f();
    public static final f d = new f();

    public /* synthetic */ f() {
    }

    public static Object A(int i2) {
        if (i2 < 2 || i2 > 1073741824 || Integer.highestOneBit(i2) != i2) {
            throw new IllegalArgumentException(c.b.b(52, "must be power of 2 between 2^1 and 2^30: ", i2));
        }
        return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean A0(byte[] bArr, int i2, int i3) {
        int iA;
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            iA = 0;
        } else {
            while (i2 < i3) {
                int i4 = i2 + 1;
                iA = bArr[i2];
                if (iA < 0) {
                    if (iA >= -32) {
                        if (iA >= -16) {
                            if (i4 < i3 - 2) {
                                int i5 = i4 + 1;
                                int i6 = bArr[i4];
                                if (i6 <= -65) {
                                    if ((((i6 + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) + (iA << 28)) >> 30) == 0) {
                                        int i7 = i5 + 1;
                                        if (bArr[i5] <= -65) {
                                            i4 = i7 + 1;
                                            if (bArr[i7] > -65) {
                                            }
                                        }
                                    }
                                }
                                iA = -1;
                                break;
                            }
                            iA = l8.a(bArr, i4, i3);
                            break;
                        }
                        if (i4 < i3 - 1) {
                            int i8 = i4 + 1;
                            char c2 = bArr[i4];
                            if (c2 <= -65 && ((iA != -32 || c2 >= -96) && (iA != -19 || c2 < -96))) {
                                i2 = i8 + 1;
                                if (bArr[i8] > -65) {
                                }
                            }
                            iA = -1;
                            break;
                        }
                        iA = l8.a(bArr, i4, i3);
                        break;
                    }
                    if (i4 < i3) {
                        if (iA >= -62) {
                            i2 = i4 + 1;
                            if (bArr[i4] > -65) {
                            }
                        }
                        iA = -1;
                        break;
                    }
                    break;
                }
                i2 = i4;
            }
            iA = 0;
        }
        return iA == 0;
    }

    public static final EmptyList B() {
        return EmptyList.INSTANCE;
    }

    public static int B0(o7 o7Var, byte[] bArr, int i2, int i3, int i4, e5 e5Var) {
        g7 g7Var = (g7) o7Var;
        Object objA = g7Var.a();
        int iX = g7Var.x(objA, bArr, i2, i3, i4, e5Var);
        g7Var.b(objA);
        e5Var.c = objA;
        return iX;
    }

    public static byte[] C(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i2 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            bArr2[i2] = (byte) (~bArr[length]);
            i2++;
        }
        byte b2 = bArr2[0];
        bArr2[0] = bArr2[2];
        bArr2[2] = b2;
        return bArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o C0(com.google.android.gms.internal.measurement.e eVar, j0.b bVar, ArrayList arrayList, boolean z) {
        o oVarA;
        li.c.g0(1, "reduce", arrayList);
        li.c.h0(2, "reduce", arrayList);
        com.google.android.gms.internal.measurement.i iVarD = bVar.d((o) arrayList.get(0));
        if (!(iVarD instanceof com.google.android.gms.internal.measurement.i)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            oVarA = bVar.d((o) arrayList.get(1));
            if (oVarA instanceof com.google.android.gms.internal.measurement.g) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (eVar.k() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            oVarA = null;
        }
        com.google.android.gms.internal.measurement.i iVar = iVarD;
        int iK = eVar.k();
        int i2 = z ? 0 : iK - 1;
        int i3 = z ? iK - 1 : 0;
        int i4 = true == z ? 1 : -1;
        if (oVarA == null) {
            oVarA = eVar.l(i2);
            i2 += i4;
        }
        while ((i3 - i2) * i4 >= 0) {
            if (eVar.s(i2)) {
                oVarA = iVar.a(bVar, Arrays.asList(oVarA, eVar.l(i2), new com.google.android.gms.internal.measurement.h(Double.valueOf(i2)), eVar));
                if (oVarA instanceof com.google.android.gms.internal.measurement.g) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i2 += i4;
            } else {
                i2 += i4;
            }
        }
        return oVarA;
    }

    public static final int D(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                return height * (config != Bitmap.Config.ALPHA_8 ? (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8 : 1);
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static void D0(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? F0(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? F0(i3, i4, "end index") : t0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static int E(String str, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            return -1;
        }
        return jSONObject.getInt(str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.measurement.zzkh */
    public static int E0(o7 o7Var, byte[] bArr, int i2, int i3, e5 e5Var) throws zzkh {
        int iM0 = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iM0 = M0(i4, bArr, iM0, e5Var);
            i4 = e5Var.a;
        }
        int i5 = iM0;
        if (i4 < 0 || i4 > i3 - i5) {
            throw zzkh.zzf();
        }
        Object objA = o7Var.a();
        int i6 = i4 + i5;
        o7Var.d(objA, bArr, i5, i6, e5Var);
        o7Var.b(objA);
        e5Var.c = objA;
        return i6;
    }

    public static JSONArray F(String str, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getJSONArray(str);
    }

    public static String F0(int i2, int i3, String str) {
        if (i2 < 0) {
            return t0("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return t0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(android.support.v4.media.a.c("negative size: ", i3));
    }

    public static JSONObject G(String str, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getJSONObject(str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.measurement.zzkh */
    public static int G0(o7 o7Var, int i2, byte[] bArr, int i3, int i4, l6 l6Var, e5 e5Var) throws zzkh {
        int iE0 = E0(o7Var, bArr, i3, i4, e5Var);
        l6Var.add(e5Var.c);
        while (iE0 < i4) {
            int iL0 = L0(bArr, iE0, e5Var);
            if (i2 != e5Var.a) {
                break;
            }
            iE0 = E0(o7Var, bArr, iL0, i4, e5Var);
            l6Var.add(e5Var.c);
        }
        return iE0;
    }

    public static Object H(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.measurement.zzkh */
    public static int H0(byte[] bArr, int i2, l6 l6Var, e5 e5Var) throws zzkh {
        g6 g6Var = (g6) l6Var;
        int iL0 = L0(bArr, i2, e5Var);
        int i3 = e5Var.a + iL0;
        while (iL0 < i3) {
            iL0 = L0(bArr, iL0, e5Var);
            g6Var.d(e5Var.a);
        }
        if (iL0 == i3) {
            return iL0;
        }
        throw zzkh.zzf();
    }

    public static final int I(List list) {
        kotlin.jvm.internal.m.h(list, "<this>");
        return list.size() - 1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.measurement.zzkh */
    public static int I0(byte[] bArr, int i2, e5 e5Var) throws zzkh {
        int iL0 = L0(bArr, i2, e5Var);
        int i3 = e5Var.a;
        if (i3 < 0) {
            throw zzkh.zzd();
        }
        if (i3 == 0) {
            e5Var.c = "";
            return iL0;
        }
        e5Var.c = new String(bArr, iL0, i3, m6.a);
        return iL0 + i3;
    }

    public static final String J(ImageUrlMap imageUrlMap) {
        kotlin.jvm.internal.m.h(imageUrlMap, "<this>");
        String str = imageUrlMap.b;
        return str == null ? imageUrlMap.a : str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.measurement.zzkh */
    public static int J0(byte[] bArr, int i2, e5 e5Var) throws zzkh {
        int iL0 = L0(bArr, i2, e5Var);
        int i3 = e5Var.a;
        if (i3 < 0) {
            throw zzkh.zzd();
        }
        if (i3 == 0) {
            e5Var.c = "";
            return iL0;
        }
        f fVar = l8.a;
        int length = bArr.length;
        if ((iL0 | i3 | ((length - iL0) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iL0), Integer.valueOf(i3)));
        }
        int i4 = iL0 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (iL0 < i4) {
            byte b2 = bArr[iL0];
            if (!(b2 >= 0)) {
                break;
            }
            iL0++;
            cArr[i5] = (char) b2;
            i5++;
        }
        while (iL0 < i4) {
            int i6 = iL0 + 1;
            byte b3 = bArr[iL0];
            if (b3 >= 0) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b3;
                iL0 = i6;
                while (true) {
                    i5 = i7;
                    if (iL0 >= i4) {
                        break;
                    }
                    byte b4 = bArr[iL0];
                    if (!(b4 >= 0)) {
                        break;
                    }
                    iL0++;
                    i7 = i5 + 1;
                    cArr[i5] = (char) b4;
                }
            } else if (b3 < -32) {
                if (i6 >= i4) {
                    throw zzkh.zzc();
                }
                int i8 = i6 + 1;
                int i9 = i5 + 1;
                byte b5 = bArr[i6];
                if (b3 < -62 || li.c.c0(b5)) {
                    throw zzkh.zzc();
                }
                cArr[i5] = (char) (((b3 & 31) << 6) | (b5 & 63));
                iL0 = i8;
                i5 = i9;
            } else {
                if (b3 < -16) {
                    if (i6 >= i4 - 1) {
                        throw zzkh.zzc();
                    }
                    int i10 = i6 + 1;
                    int i11 = i10 + 1;
                    int i12 = i5 + 1;
                    byte b6 = bArr[i6];
                    byte b7 = bArr[i10];
                    if (!li.c.c0(b6)) {
                        if (b3 == -32) {
                            if (b6 >= -96) {
                                b3 = -32;
                            }
                        }
                        if (b3 == -19) {
                            if (b6 < -96) {
                                b3 = -19;
                            }
                        }
                        if (!li.c.c0(b7)) {
                            cArr[i5] = (char) (((b3 & 15) << 12) | ((b6 & 63) << 6) | (b7 & 63));
                            iL0 = i11;
                            i5 = i12;
                        }
                    }
                    throw zzkh.zzc();
                }
                if (i6 >= i4 - 2) {
                    throw zzkh.zzc();
                }
                int i13 = i6 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                byte b8 = bArr[i6];
                byte b9 = bArr[i13];
                byte b10 = bArr[i14];
                if (li.c.c0(b8) || (((b8 + 112) + (b3 << 28)) >> 30) != 0 || li.c.c0(b9) || li.c.c0(b10)) {
                    throw zzkh.zzc();
                }
                int i16 = ((b3 & 7) << 18) | ((b8 & 63) << 12) | ((b9 & 63) << 6) | (b10 & 63);
                cArr[i5] = (char) ((i16 >>> 10) + 55232);
                cArr[i5 + 1] = (char) ((i16 & 1023) + 56320);
                i5 += 2;
                iL0 = i15;
            }
        }
        e5Var.c = new String(cArr, 0, i5);
        return i4;
    }

    public static final String K(ImageUrlMap imageUrlMap) {
        kotlin.jvm.internal.m.h(imageUrlMap, "<this>");
        String str = imageUrlMap.d;
        if (str != null) {
            return str;
        }
        String str2 = imageUrlMap.c;
        if (str2 != null) {
            return str2;
        }
        String str3 = imageUrlMap.b;
        return str3 == null ? imageUrlMap.a : str3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.measurement.zzkh */
    public static int K0(int i2, byte[] bArr, int i3, int i4, a8 a8Var, e5 e5Var) throws zzkh {
        if ((i2 >>> 3) == 0) {
            throw zzkh.zzb();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iO0 = O0(bArr, i3, e5Var);
            a8Var.c(i2, Long.valueOf(e5Var.b));
            return iO0;
        }
        if (i5 == 1) {
            a8Var.c(i2, Long.valueOf(P0(i3, bArr)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iL0 = L0(bArr, i3, e5Var);
            int i6 = e5Var.a;
            if (i6 < 0) {
                throw zzkh.zzd();
            }
            if (i6 > bArr.length - iL0) {
                throw zzkh.zzf();
            }
            if (i6 == 0) {
                a8Var.c(i2, zzix.zzb);
            } else {
                a8Var.c(i2, zzix.zzl(bArr, iL0, i6));
            }
            return iL0 + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw zzkh.zzb();
            }
            a8Var.c(i2, Integer.valueOf(w0(i3, bArr)));
            return i3 + 4;
        }
        int i7 = (i2 & (-8)) | 4;
        a8 a8VarB = a8.b();
        int i8 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int iL02 = L0(bArr, i3, e5Var);
            int i9 = e5Var.a;
            if (i9 == i7) {
                i8 = i9;
                i3 = iL02;
                break;
            }
            i8 = i9;
            i3 = K0(i9, bArr, iL02, i4, a8VarB, e5Var);
        }
        if (i3 > i4 || i8 != i7) {
            throw zzkh.zze();
        }
        a8Var.c(i2, a8VarB);
        return i3;
    }

    public static final String L(ImageUrlMap imageUrlMap) {
        kotlin.jvm.internal.m.h(imageUrlMap, "<this>");
        String str = imageUrlMap.c;
        if (str != null) {
            return str;
        }
        String str2 = imageUrlMap.b;
        return str2 == null ? imageUrlMap.a : str2;
    }

    public static int L0(byte[] bArr, int i2, e5 e5Var) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return M0(b2, bArr, i3, e5Var);
        }
        e5Var.a = b2;
        return i3;
    }

    public static final String M(ImageUrlMap imageUrlMap) {
        kotlin.jvm.internal.m.h(imageUrlMap, "<this>");
        String str = imageUrlMap.e;
        if (str != null) {
            return str;
        }
        String str2 = imageUrlMap.f;
        if (str2 != null) {
            return str2;
        }
        String str3 = imageUrlMap.g;
        return str3 == null ? imageUrlMap.a : str3;
    }

    public static int M0(int i2, byte[] bArr, int i3, e5 e5Var) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            e5Var.a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & 127) << 7);
        int i7 = i5 + 1;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            e5Var.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & 127) << 14);
        int i9 = i7 + 1;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            e5Var.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & 127) << 21);
        int i11 = i9 + 1;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            e5Var.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & 127) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                e5Var.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static Object N(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i2 = 0; i2 < 4 && it.hasNext(); i2++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static int N0(int i2, byte[] bArr, int i3, int i4, l6 l6Var, e5 e5Var) {
        g6 g6Var = (g6) l6Var;
        int iL0 = L0(bArr, i3, e5Var);
        g6Var.d(e5Var.a);
        while (iL0 < i4) {
            int iL02 = L0(bArr, iL0, e5Var);
            if (i2 != e5Var.a) {
                break;
            }
            iL0 = L0(bArr, iL02, e5Var);
            g6Var.d(e5Var.a);
        }
        return iL0;
    }

    public static final int O(int i2) {
        if (i2 < 0) {
            return -1;
        }
        return i2 > 0 ? 1 : 0;
    }

    public static int O0(byte[] bArr, int i2, e5 e5Var) {
        int i3 = i2 + 1;
        long j = bArr[i2];
        if (j >= 0) {
            e5Var.b = j;
            return i3;
        }
        int i4 = i3 + 1;
        byte b2 = bArr[i3];
        long j2 = (j & 127) | (((long) (b2 & 127)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            byte b3 = bArr[i4];
            i5 += 7;
            j2 |= ((long) (b3 & 127)) << i5;
            b2 = b3;
            i4 = i6;
        }
        e5Var.b = j2;
        return i4;
    }

    public static String P(String str, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public static long P0(int i2, byte[] bArr) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String Q(java.lang.String r4) {
        /*
            jp.co.yahoo.android.apps.transit.util.CalendarUtil$CalendarFormat r0 = jp.co.yahoo.android.apps.transit.util.CalendarUtil.CalendarFormat.HHmm
            java.lang.String r1 = "format"
            kotlin.jvm.internal.m.h(r0, r1)
            int r1 = r4.length()
            java.lang.String r2 = r0.getPattern()
            int r2 = r2.length()
            if (r1 != r2) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            r2 = 0
            if (r1 != 0) goto L1d
            goto L43
        L1d:
            boolean r1 = h9.v0.d(r4)
            if (r1 != 0) goto L24
            goto L43
        L24:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.text.ParseException -> L3f
            java.lang.String r0 = r0.getPattern()     // Catch: java.text.ParseException -> L3f
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch: java.text.ParseException -> L3f
            r1.<init>(r0, r3)     // Catch: java.text.ParseException -> L3f
            java.util.Date r4 = r1.parse(r4)     // Catch: java.text.ParseException -> L3f
            if (r4 == 0) goto L43
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch: java.text.ParseException -> L3f
            r0.setTime(r4)     // Catch: java.text.ParseException -> L3f
            goto L44
        L3f:
            r4 = move-exception
            r4.printStackTrace()
        L43:
            r0 = r2
        L44:
            if (r0 == 0) goto L59
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.lang.String r1 = "HH:mm"
            java.util.Locale r2 = java.util.Locale.getDefault()
            r4.<init>(r1, r2)
            java.util.Date r0 = r0.getTime()
            java.lang.String r2 = r4.format(r0)
        L59:
            if (r2 != 0) goto L5d
            java.lang.String r2 = ""
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.Q(java.lang.String):java.lang.String");
    }

    public static boolean R(Iterable iterable, Comparator comparator) {
        v2 v2VarComparator;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            v2VarComparator = ((SortedSet) iterable).comparator();
            if (v2VarComparator == null) {
                v2VarComparator = v2.a;
            }
        } else {
            if (!(iterable instanceof v3)) {
                return false;
            }
            v2VarComparator = ((v3) iterable).comparator();
        }
        return comparator.equals(v2VarComparator);
    }

    public static boolean S(Context context) {
        NetworkInfo activeNetworkInfo = context == null ? null : ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static final boolean T(z.e eVar) {
        return kotlin.jvm.internal.m.c(eVar, z.e.c);
    }

    public static final List U(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.m.g(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }

    public static final List V(Object... objArr) {
        kotlin.jvm.internal.m.h(objArr, "elements");
        return objArr.length > 0 ? kotlin.collections.n.k0(objArr) : EmptyList.INSTANCE;
    }

    public static final List W(Object obj) {
        return obj != null ? U(obj) : EmptyList.INSTANCE;
    }

    public static final ArrayList X(Object... objArr) {
        kotlin.jvm.internal.m.h(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList((Collection) new kotlin.collections.j(objArr, true));
    }

    public static final List Y(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : U(list.get(0)) : EmptyList.INSTANCE;
    }

    public static ArrayList Z(JSONObject jSONObject) {
        ArrayList arrayList = null;
        JSONArray jSONArray = jSONObject.isNull("list") ? null : jSONObject.getJSONArray("list");
        if (jSONArray != null) {
            arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) jSONArray.get(i2))));
            }
        }
        return arrayList;
    }

    public static Integer a0(String str, JSONObject jSONObject) {
        String string = jSONObject.isNull(str) ? null : jSONObject.getString(str);
        if (string != null) {
            return Integer.valueOf(Integer.parseInt(string));
        }
        return null;
    }

    public static final void b0(int i2, int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException(v.f("fromIndex (", i3, ") is greater than toIndex (", i4, ")."));
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(b.e("fromIndex (", i3, ") is less than zero."));
        }
        if (i4 > i2) {
            throw new IndexOutOfBoundsException(v.f("toIndex (", i4, ") is greater than size (", i2, ")."));
        }
    }

    public static long c() {
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        return ((Number) y.r1(h0(new qj.i(((long) 28800) + jCurrentTimeMillis, jCurrentTimeMillis + ((long) 43200))))).longValue();
    }

    public static int c0(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i3;
        int i4;
        int iL0 = b6.a.l0(obj);
        int i5 = iL0 & i2;
        int iJ0 = j0(i5, obj3);
        if (iJ0 == 0) {
            return -1;
        }
        int i6 = ~i2;
        int i7 = iL0 & i6;
        int i8 = -1;
        while (true) {
            i3 = iJ0 - 1;
            i4 = iArr[i3];
            if ((i4 & i6) == i7 && li.c.s(obj, objArr[i3]) && (objArr2 == null || li.c.s(obj2, objArr2[i3]))) {
                break;
            }
            int i9 = i4 & i2;
            if (i9 == 0) {
                return -1;
            }
            i8 = i3;
            iJ0 = i9;
        }
        int i10 = i4 & i2;
        if (i8 == -1) {
            k0(i5, i10, obj3);
        } else {
            iArr[i8] = (i10 & i2) | (iArr[i8] & i6);
        }
        return i3;
    }

    public static String d0(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.contains("[CONTENTPLAYHEAD]")) {
            str = str.replace("[CONTENTPLAYHEAD]", new SimpleDateFormat("HH:mm:ss.SSS", Locale.JAPAN).format(Calendar.getInstance().getTime()));
        }
        if (!str.contains("[CACHEBUSTING]")) {
            return str;
        }
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 8; i2++) {
            sb.append(secureRandom.nextInt(10));
        }
        return str.replace("[CACHEBUSTING]", sb.toString());
    }

    public static g6.a e(JSONObject jSONObject) throws JSONException {
        String str;
        String str2;
        JSONArray jSONArrayF;
        String str3;
        String str4;
        JSONArray jSONArray;
        JSONObject jSONObjectG;
        li.c.o("[ PARSE NATIVE AD DATA ]");
        g6.a aVar = new g6.a();
        aVar.c = P("title", jSONObject);
        li.c.o("Title : " + aVar.c);
        aVar.d = P("description", jSONObject);
        li.c.o("Description : " + aVar.d);
        aVar.i = P("display_url", jSONObject);
        li.c.o("Display url : " + aVar.i);
        JSONObject jSONObjectG2 = G("logo_image", jSONObject);
        if (jSONObjectG2 != null) {
            String strP = P("url", jSONObjectG2);
            g6.e eVar = aVar.e;
            eVar.a = strP;
            li.c.o("Logo img url : " + eVar.a);
        }
        JSONObject jSONObjectG3 = G("image", jSONObject);
        if (jSONObjectG3 != null && (jSONObjectG = G("standard", jSONObjectG3)) != null) {
            String strP2 = P("url", jSONObjectG);
            g6.d dVar = aVar.f;
            dVar.a = strP2;
            li.c.o("Standard img url : " + dVar.a);
            dVar.b = E("width", jSONObjectG);
            li.c.o("Standard img width : " + dVar.b);
            dVar.c = E("height", jSONObjectG);
            li.c.o("Standard img height : " + dVar.c);
        }
        JSONObject jSONObjectG4 = G("imark", jSONObject);
        String str5 = "optout_url";
        String str6 = "text";
        if (jSONObjectG4 != null) {
            aVar.g = P("text", jSONObjectG4);
            li.c.o("Imark text : " + aVar.g);
            aVar.h = P("optout_url", jSONObjectG4);
            li.c.o("Imark optout url : " + aVar.h);
        }
        aVar.k = P("principal", jSONObject);
        li.c.o("Principal : " + aVar.k);
        String strP3 = P("lp_url", jSONObject);
        aVar.j = strP3 == null ? null : strP3.replaceAll("\\{", "%7B").replaceAll("\\}", "%7D").replaceAll("\\|", "%7C");
        li.c.o("LandingPage url : " + aVar.j);
        aVar.l = P("design_code", jSONObject);
        li.c.o("Design Code : " + aVar.l);
        aVar.m = P("template_code", jSONObject);
        li.c.o("Template Code : " + aVar.m);
        aVar.y = E("transition_code", jSONObject);
        li.c.o("Transition Code : " + aVar.y);
        aVar.n = P("vast", jSONObject);
        li.c.o("VAST : " + aVar.n);
        aVar.o = P("button_text", jSONObject);
        li.c.o("Button Text : " + aVar.o);
        aVar.p = P("ad_id", jSONObject);
        li.c.o("Ydn AdId : " + aVar.p);
        aVar.r = P("price", jSONObject);
        li.c.o("Price : " + aVar.r);
        aVar.H = !jSONObject.isNull("is_log_target") && jSONObject.getBoolean("is_log_target");
        li.c.o("Is Log Target : " + aVar.H);
        aVar.I = !jSONObject.isNull("item_shown_ratio") ? jSONObject.getDouble("item_shown_ratio") : -1.0d;
        li.c.o("Item shown ratio : " + aVar.I);
        JSONObject jSONObjectG5 = G("badge", jSONObject);
        if (jSONObjectG5 != null) {
            aVar.s = P("text", jSONObjectG5);
            li.c.o("BadgeText : " + aVar.s);
            aVar.t = P("type", jSONObjectG5);
            li.c.o("BadgeType : " + aVar.t);
        }
        JSONObject jSONObjectG6 = G("rating", jSONObject);
        if (jSONObjectG6 != null) {
            aVar.u = P("stars", jSONObjectG6);
            li.c.o("Rating Stars : " + aVar.u);
            aVar.v = P("text", jSONObjectG6);
            li.c.o("Rating Text : " + aVar.v);
        }
        JSONArray jSONArrayF2 = F("ex_imps_url", jSONObject);
        if (jSONArrayF2 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayF2.length(); i2++) {
                String string = jSONArrayF2.getString(i2);
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(string);
                    li.c.o("Ex imps url " + i2 + ": " + string);
                }
            }
            aVar.G = arrayList;
        }
        if ("randf_survey_001".equals(aVar.l)) {
            g6.c cVar = new g6.c();
            JSONArray jSONArrayF3 = F("questions", jSONObject);
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayF3 != null) {
                int i3 = 0;
                while (i3 < jSONArrayF3.length()) {
                    c.b bVar = new c.b();
                    bVar.a = jSONArrayF3.getJSONObject(i3).getString(str6);
                    li.c.o("QuestionText " + bVar.a);
                    JSONArray jSONArrayF4 = F("answers", jSONArrayF3.getJSONObject(i3));
                    ArrayList arrayList3 = new ArrayList();
                    if (jSONArrayF4 != null) {
                        jSONArray = jSONArrayF3;
                        int i4 = 0;
                        while (i4 < jSONArrayF4.length()) {
                            c.a aVar2 = new c.a();
                            aVar2.a = jSONArrayF4.getJSONObject(i4).getString(str6);
                            li.c.o("AnswerText: " + aVar2.a);
                            aVar2.b = jSONArrayF4.getJSONObject(i4).getString("url");
                            li.c.o("AnswerURL: " + aVar2.b);
                            arrayList3.add(aVar2);
                            i4++;
                            str5 = str5;
                            str6 = str6;
                        }
                        str3 = str5;
                        str4 = str6;
                    } else {
                        str3 = str5;
                        str4 = str6;
                        jSONArray = jSONArrayF3;
                    }
                    bVar.b = arrayList3;
                    arrayList2.add(bVar);
                    i3++;
                    jSONArrayF3 = jSONArray;
                    str5 = str3;
                    str6 = str4;
                }
                str = str5;
                str2 = str6;
                cVar.a = arrayList2;
            } else {
                str = "optout_url";
                str2 = "text";
            }
            aVar.w = cVar;
        } else {
            str = "optout_url";
            str2 = "text";
        }
        if (("randf_carousel".equals(aVar.m) || "auction_carousel".equals(aVar.m)) && (jSONArrayF = F("items", jSONObject)) != null) {
            for (int i5 = 0; i5 < jSONArrayF.length(); i5++) {
                JSONObject jSONObject2 = jSONArrayF.getJSONObject(i5);
                l lVar = new l();
                try {
                    P("title", jSONObject2);
                    JSONObject jSONObjectG7 = G("image", jSONObject2);
                    if (jSONObjectG7 != null) {
                        P("url", jSONObjectG7);
                    }
                    P("lp_url", jSONObject2);
                } catch (JSONException unused) {
                    lVar = null;
                }
                if (lVar != null) {
                    aVar.x.add(lVar);
                }
            }
        }
        aVar.J = P("feedback_type", jSONObject);
        li.c.o(" : " + aVar.J);
        JSONObject jSONObjectG8 = G("feedback", jSONObject);
        if (jSONObjectG8 != null) {
            FeedbackData feedbackData = new FeedbackData();
            feedbackData.setType(aVar.J);
            feedbackData.setOptoutUrl(P(str, jSONObjectG8));
            li.c.o(" : " + feedbackData.getOptoutUrl());
            feedbackData.setStatusApiUrl(P("status_api_url", jSONObjectG8));
            li.c.o(" : " + feedbackData.getStatusApiUrl());
            feedbackData.setBlockApiUrl(P("block_api_url", jSONObjectG8));
            li.c.o(" : " + feedbackData.getBlockApiUrl());
            feedbackData.setEnqueteApiUrl(P("enquete_api_url", jSONObjectG8));
            li.c.o(" : " + feedbackData.getEnqueteApiUrl());
            JSONObject jSONObjectG9 = G("params", jSONObjectG8);
            if (jSONObjectG9 != null) {
                feedbackData.setParamsM(P("m", jSONObjectG9));
                li.c.o(" : " + feedbackData.getParamsM());
                feedbackData.setParamsO(P("o", jSONObjectG9));
                li.c.o(" : " + feedbackData.getParamsO());
            }
            JSONArray jSONArrayF5 = F("enquete", jSONObjectG8);
            if (jSONArrayF5 != null) {
                for (int i6 = 0; i6 < jSONArrayF5.length(); i6++) {
                    JSONObject jSONObject3 = jSONArrayF5.getJSONObject(i6);
                    feedbackData.getEnquete().add(new jp.co.yahoo.android.ads.data.e(P(str2, jSONObject3), Integer.valueOf(E("qn", jSONObject3))));
                }
            }
            aVar.K = feedbackData;
        }
        ArrayList arrayList4 = new ArrayList();
        try {
            JSONArray jSONArrayF6 = F("verification_scripts", jSONObject);
            if (jSONArrayF6 != null) {
                for (int i7 = 0; i7 < jSONArrayF6.length(); i7++) {
                    try {
                        JSONObject jSONObject4 = jSONArrayF6.getJSONObject(i7);
                        arrayList4.add(new n6.d(P("js", jSONObject4), P("vendor_key", jSONObject4), P("params", jSONObject4)));
                    } catch (JSONException e) {
                        li.c.P("Failed to parse VerificationScript");
                        li.c.P(e.toString());
                        arrayList4 = new ArrayList();
                    }
                }
            }
        } catch (JSONException e2) {
            li.c.P("Failed to Parse for AAG Response : verification_scripts");
            li.c.P(e2.toString());
        }
        aVar.D = arrayList4;
        return aVar;
    }

    public static final int e0(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static final void f(d6.a aVar) {
        android.view.a aVar2 = new android.view.a(aVar, 5);
        if (!f6.b.a.d()) {
            new Thread(aVar2).start();
            return;
        }
        try {
            f6.b.a(aVar2);
        } catch (RejectedExecutionException unused) {
            new Thread(aVar2).start();
        }
    }

    public static final int f0(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static void g(String str) {
        kotlin.jvm.internal.m.h(str, "value");
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            kotlin.jvm.internal.m.g(cookieManager, "getInstance()");
            cookieManager.setAcceptCookie(true);
            cookieManager.setCookie("https://www.yahoo.co.jp/", str);
        } catch (Exception unused) {
            Log.e("YJACookieLibrary", "Failed to set Cookie.");
        }
    }

    public static void g0(Drawable drawable, int i2) {
        DrawableCompat.setTint(DrawableCompat.wrap(drawable).mutate(), i2);
    }

    public static void h(String str, Exception exc) {
        if (z4.a.a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
        Log.e("OMIDLIB", str, exc);
    }

    public static final List h0(Iterable iterable) {
        kotlin.jvm.internal.m.h(iterable, "<this>");
        List listZ1 = y.Z1(iterable);
        Collections.shuffle(listZ1);
        return listZ1;
    }

    public static void i(String str, String str2, String str3) {
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            kotlin.jvm.internal.m.g(cookieManager, "getInstance()");
            cookieManager.setAcceptCookie(true);
            cookieManager.setCookie("https://www.yahoo.co.jp/", str + "=; Expires=Wed, 1 Jan 2020 00:00:00 GMT; Domain=" + str2 + "; Path=" + str3);
        } catch (Exception unused) {
            Log.e("YJACookieLibrary", "Failed to remove Cookie.");
        }
    }

    public static void i0(List list, h4.l lVar, int i2, int i3) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i3) {
                break;
            } else if (lVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i3--;
            if (i3 < i2) {
                return;
            } else {
                list.remove(i3);
            }
        }
    }

    public static boolean j(Iterable iterable, Collection collection) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        iterable.getClass();
        return v1.a(collection, iterable.iterator());
    }

    public static int j0(int i2, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & 255 : obj instanceof short[] ? ((short[]) obj)[i2] & 65535 : ((int[]) obj)[i2];
    }

    public static final void k(Appendable appendable, Object obj, kj.l lVar) throws IOException {
        kotlin.jvm.internal.m.h(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    public static void k0(int i2, int i3, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static final ArrayList l(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList((Collection) new kotlin.collections.j(objArr, true));
    }

    public static final void l0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final mb.a m(yb.a aVar) {
        kotlin.jvm.internal.m.h(aVar, "<this>");
        return new mb.a(aVar.a(), aVar.b(), (List) null);
    }

    public static final void m0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final int n(List list, int i2, int i3, kj.l lVar) {
        kotlin.jvm.internal.m.h(list, "<this>");
        b0(list.size(), i2, i3);
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iIntValue = ((Number) lVar.invoke(list.get(i5))).intValue();
            if (iIntValue < 0) {
                i2 = i5 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final String n0(Double d2) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0#");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        String str = decimalFormat.format(d2 != null ? d2.doubleValue() : 0.0d);
        kotlin.jvm.internal.m.g(str, "DecimalFormat(\"0.0#\").ap…    }.format(this ?: 0.0)");
        return str;
    }

    public static int o(List list, Comparable comparable) {
        int size = list.size();
        kotlin.jvm.internal.m.h(list, "<this>");
        int i2 = 0;
        b0(list.size(), 0, size);
        int i3 = size - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int iD = bk.f.d((Comparable) list.get(i4), comparable);
            if (iD < 0) {
                i2 = i4 + 1;
            } else {
                if (iD <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static String o0(int i2) {
        return i2 == 1 ? b.e("JR新幹線(", i2, ")") : i2 == 2 ? b.e("JR特急(", i2, ")") : i2 == 4 ? b.e("JR在来線(", i2, ")") : i2 == 8 ? b.e("私鉄特急(", i2, ")") : i2 == 16 ? b.e("私鉄(", i2, ")") : i2 == 32 ? b.e("高速バス(", i2, ")") : i2 == 64 ? b.e("連絡バス(", i2, ")") : i2 == 128 ? b.e("路線バス(", i2, ")") : i2 == 256 ? b.e("フェリー(", i2, ")") : i2 == 512 ? b.e("徒歩(", i2, ")") : i2 == 1024 ? b.e("空路(", i2, ")") : i2 == 2048 ? b.e("自動車（有料道路）(", i2, ")") : i2 == 4096 ? b.e("自動車（一般道）(", i2, ")") : b.e("(", i2, ")");
    }

    public static double p(double d2, double d3) {
        if (j4.a.c(d2)) {
            return d3;
        }
        if (j4.a.c(d3) || d2 == d3) {
            return d2;
        }
        return Double.NaN;
    }

    public static final String p0(int i2) {
        String str = NumberFormat.getNumberInstance(Locale.US).format(Integer.valueOf(i2));
        kotlin.jvm.internal.m.g(str, "getNumberInstance(Locale.US).format(this)");
        return str;
    }

    public static void q(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            String strValueOf = String.valueOf(obj);
            throw new NullPointerException(c.a.c(strValueOf.length() + 26, "null value in entry: ", strValueOf, "=null"));
        }
        String strValueOf2 = String.valueOf(obj2);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + 24);
        sb.append("null key in entry: null=");
        sb.append(strValueOf2);
        throw new NullPointerException(sb.toString());
    }

    public static final String q0(int i2) {
        if (i2 < 10000) {
            String str = NumberFormat.getNumberInstance(Locale.US).format(Integer.valueOf(i2));
            kotlin.jvm.internal.m.g(str, "{\n        NumberFormat.g…le.US).format(this)\n    }");
            return str;
        }
        return NumberFormat.getNumberInstance(Locale.US).format(9999L) + '+';
    }

    public static JSONObject r(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getJSONObject(str);
    }

    public static int r0(int i2) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i3 = 0; i3 < 6; i3++) {
            int i4 = iArr[i3];
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i5 == i2) {
                return i4;
            }
        }
        return 1;
    }

    public static void s(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.measurement.zzkh */
    public static int s0(byte[] bArr, int i2, e5 e5Var) throws zzkh {
        int iL0 = L0(bArr, i2, e5Var);
        int i3 = e5Var.a;
        if (i3 < 0) {
            throw zzkh.zzd();
        }
        if (i3 > bArr.length - iL0) {
            throw zzkh.zzf();
        }
        if (i3 == 0) {
            e5Var.c = zzix.zzb;
            return iL0;
        }
        e5Var.c = zzix.zzl(bArr, iL0, i3);
        return iL0 + i3;
    }

    public static void t(long j) {
        if (j >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("distance".length() + 49);
        sb.append("distance cannot be negative but was: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String t0(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            Object obj = objArr[i3];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbI = a6.h.i("<", str2, " threw ");
                    sbI.append(e.getClass().getName());
                    sbI.append(">");
                    string = sbI.toString();
                }
            }
            objArr[i3] = string;
            i3++;
        }
        StringBuilder sb = new StringBuilder((length * 16) + str.length());
        int i4 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (iIndexOf = str.indexOf("%s", i4)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i4, iIndexOf);
            sb.append(objArr[i2]);
            i4 = iIndexOf + 2;
            i2++;
        }
        sb.append((CharSequence) str, i4, str.length());
        if (i2 < length2) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void u(int i2, String str) {
        if (i2 > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 38);
        sb.append(str);
        sb.append(" must be positive but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void u0(int i2, int i3) {
        String strT0;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strT0 = t0("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    throw new IllegalArgumentException(android.support.v4.media.a.c("negative size: ", i3));
                }
                strT0 = t0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strT0);
        }
    }

    public static void v(boolean z) {
        b6.a.A(z, "no calls to next() since the last call to remove()");
    }

    public static void v0(int i2) {
        boolean z;
        if (i2 == 100 || i2 == 102 || i2 == 104) {
            z = true;
        } else if (i2 == 105) {
            i2 = 105;
            z = true;
        } else {
            z = false;
        }
        a3.h.c(z, "priority %d must be a Priority.PRIORITY_* constant", new Object[]{Integer.valueOf(i2)});
    }

    public static String w(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public static int w0(int i2, byte[] bArr) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static final String x(double d2) {
        if (1000.0d <= Math.abs(d2) && Math.abs(d2) < 10000.0d) {
            double dFloor = (d2 < 0.0d ? Math.floor(d2 / ((double) 100)) : Math.ceil(d2 / ((double) 100))) / ((double) 10);
            if (10.0d > Math.abs(dFloor)) {
                return String.valueOf(dFloor);
            }
            d2 = dFloor < 0.0d ? Math.floor(dFloor) : Math.ceil(dFloor);
        } else if (10000.0d <= Math.abs(d2)) {
            d2 = d2 < 0.0d ? Math.floor(d2 / ((double) 1000)) : Math.ceil(d2 / ((double) 1000));
        }
        return androidx.compose.animation.a.e(new Object[]{Double.valueOf(d2)}, 1, "%.0f", "format(format, *args)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.android.gms.internal.measurement.e x0(com.google.android.gms.internal.measurement.e eVar, j0.b bVar, com.google.android.gms.internal.measurement.n nVar, Boolean bool, Boolean bool2) {
        com.google.android.gms.internal.measurement.e eVar2 = new com.google.android.gms.internal.measurement.e();
        Iterator itN = eVar.n();
        while (itN.hasNext()) {
            int iIntValue = ((Integer) itN.next()).intValue();
            if (eVar.s(iIntValue)) {
                o oVarA = nVar.a(bVar, Arrays.asList(eVar.l(iIntValue), new com.google.android.gms.internal.measurement.h(Double.valueOf(iIntValue)), eVar));
                if (oVarA.e().equals(bool)) {
                    return eVar2;
                }
                if (bool2 == null || oVarA.e().equals(bool2)) {
                    eVar2.r(iIntValue, oVarA);
                }
            }
        }
        return eVar2;
    }

    public static m8.c y(Intent intent, boolean z) {
        int intExtra = intent.getIntExtra("key_fragment_id", 1);
        int intExtra2 = intent.getIntExtra("key_request_code", 0);
        if (intExtra == 1) {
            return q8.g.E(intent, 0L, z);
        }
        if (intExtra == 2) {
            jp.co.yahoo.android.apps.transit.ui.fragment.navi.h hVar = new jp.co.yahoo.android.apps.transit.ui.fragment.navi.h();
            Bundle extras = intent.getExtras();
            boolean z2 = extras.getBoolean(k0.m(2131887105), false);
            Serializable serializable = (ConditionData) extras.getSerializable(k0.m(2131887307));
            NaviData serializable2 = z2 ? extras.getSerializable(k0.m(2131887315)) : new j9.j().a(extras.getSerializable(k0.m(2131887315)), serializable);
            Serializable clientSearchCondition = new ClientSearchCondition();
            ((ClientSearchCondition) clientSearchCondition).isSpecifySearch = ((ConditionData) serializable).isSpecify;
            Bundle bundle = new Bundle();
            bundle.putSerializable("KEY_SEARCH_CONDITIONS", serializable);
            bundle.putSerializable("KEY_CLIENT_CONDITIONS", clientSearchCondition);
            bundle.putSerializable("KEY_RESULT", serializable2);
            bundle.putBoolean(k0.m(2131887105), z2);
            hVar.setArguments(bundle);
            return hVar;
        }
        if (intExtra == 3) {
            Long lValueOf = Long.valueOf(intent.getLongExtra("shortcut_db_time", 0L));
            jp.co.yahoo.android.apps.transit.ui.fragment.navi.d dVar = new jp.co.yahoo.android.apps.transit.ui.fragment.navi.d();
            Bundle extras2 = intent.getExtras();
            Bundle bundle2 = new Bundle();
            if (lValueOf.longValue() > 0) {
                bundle2.putLong("KEY_SHORTCUT_DB_TIME", lValueOf.longValue());
                g9.a.t(dVar.getActivity(), "open", "shortcut");
            }
            ConditionData serializable3 = extras2.getSerializable(k0.m(2131887307));
            if (serializable3 == null) {
                serializable3 = ConditionData.loadSavedData();
            }
            bundle2.putString("KEY_SEARCH_CONDITIONS", serializable3.toString());
            ClientSearchCondition clientSearchCondition2 = new ClientSearchCondition();
            clientSearchCondition2.isSpecifySearch = serializable3.isSpecify;
            bundle2.putString("KEY_CLIENT_CONDITIONS", clientSearchCondition2.toString());
            Set<String> categories = intent.getCategories();
            if (categories != null && categories.contains("android.intent.category.BROWSABLE")) {
                bundle2.putBoolean("KEY_FROM_BROWSER", true);
            }
            dVar.setArguments(bundle2);
            return dVar;
        }
        if (intExtra == 4) {
            long longExtra = intent.getLongExtra("myroute_db_time", 0L);
            return longExtra != 0 ? q8.g.E(intent, Long.valueOf(longExtra), false) : q8.i.O(false);
        }
        if (intExtra == 9) {
            String str = jp.co.yahoo.android.apps.transit.ui.fragment.spot.h.z;
            return h.a.a();
        }
        if (intExtra == 19) {
            d0 d0Var = new d0();
            Bundle extras3 = intent.getExtras();
            if (extras3 != null) {
                extras3.putString("INTENT_ACTION", intent.getAction());
            }
            if (extras3 != null) {
                extras3.putParcelable("INTENT_URI", intent.getData());
            }
            d0Var.setArguments(extras3);
            return d0Var;
        }
        if (intExtra == 20) {
            q qVar = new q();
            if (intent.getExtras() != null) {
                qVar.setArguments(intent.getExtras());
            }
            return qVar;
        }
        if (intExtra == 23) {
            Long lValueOf2 = Long.valueOf(intent.getLongExtra("appeal_diainfo_db_time", 0L));
            n8.e eVarP = n8.e.P(intent);
            if (lValueOf2.longValue() != 0) {
                g9.a.t(eVarP.getActivity(), "open", "trnsline");
                eVarP.getArguments().putLong("KEY_APPEAL_DIAINFO_DB_TIME", lValueOf2.longValue());
            }
            return eVarP;
        }
        if (intExtra == 24) {
            int i2 = p.t0;
            return p.a.a(intent);
        }
        switch (intExtra) {
            case 13:
                String[][] strArr = StationInfoFragment.w;
                return StationInfoFragment.a.b(intExtra2, intent);
            case 14:
                p0 p0Var = new p0();
                Bundle extras4 = intent.getExtras();
                if (extras4 != null) {
                    extras4.putParcelable("KEY_URI", intent.getData());
                    p0Var.setArguments(extras4);
                }
                return p0Var;
            case 15:
                return jp.co.yahoo.android.apps.transit.ui.fragment.timetable.d.E(intExtra2, intent);
            case 16:
                int i3 = jp.co.yahoo.android.apps.transit.ui.fragment.timetable.p.R0;
                return p.a.a(intExtra2, intent);
            case 17:
                return jp.co.yahoo.android.apps.transit.ui.fragment.timetable.e.F(intExtra2, intent);
            default:
                return new q8.g();
        }
    }

    public static String y0(int i2) {
        if (i2 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i2 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i2 == 104) {
            return "LOW_POWER";
        }
        if (i2 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }

    public static m8.c z(int i2) {
        switch (i2) {
            case 2131362411:
                return q.O();
            case R.id.home /* 2131362881 */:
                return new q8.g();
            case 2131363912:
                String str = jp.co.yahoo.android.apps.transit.ui.fragment.spot.h.z;
                return h.a.a();
            case 2131364198:
                return new p0();
            case 2131364204:
                r8.p pVar = new r8.p();
                pVar.setArguments(new Bundle());
                return pVar;
            default:
                return null;
        }
    }

    public static void z0(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(F0(i2, i3, "index"));
        }
    }

    public boolean b() {
        return true;
    }

    public Object convert(Object obj) {
        return Float.valueOf(((f0) obj).f());
    }

    public void d(a.e eVar, Object obj) {
        ((com.google.android.gms.internal.location.d0) eVar).I(new LastLocationRequest(Long.MAX_VALUE, 0, false, (String) null, (zzd) null), (g4.j) obj);
    }

    public /* synthetic */ f(Object obj) {
    }

    public void a() {
    }

    public void shutdown() {
    }
}
