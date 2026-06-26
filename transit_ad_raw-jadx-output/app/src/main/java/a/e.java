package a;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.s4;
import com.google.android.gms.internal.measurement.w4;
import com.google.android.gms.internal.measurement.zzhz;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final class e implements w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f46a;

    public /* synthetic */ e() {
    }

    public final Object zza() {
        zzhz zzhzVarZzc;
        zzhz zzhzVarZzc2;
        Context contextE = this.f46a;
        Object obj = s4.f;
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
            return zzhz.zzc();
        }
        if ((Build.VERSION.SDK_INT >= 24) && !androidx.core.app.d.m(contextE)) {
            contextE = androidx.core.app.e.e(contextE);
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            try {
                File file = new File(contextE.getDir("phenotype_hermetic", 0), "overrides.txt");
                zzhzVarZzc = file.exists() ? zzhz.zzd(file) : zzhz.zzc();
            } catch (RuntimeException e) {
                Log.e("HermeticFileOverrides", "no data dir", e);
                zzhzVarZzc = zzhz.zzc();
            }
            if (zzhzVarZzc.zzb()) {
                File file2 = (File) zzhzVarZzc.zza();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                    try {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] strArrSplit = line.split(" ", 3);
                            if (strArrSplit.length != 3) {
                                Log.e("HermeticFileOverrides", line.length() != 0 ? "Invalid: ".concat(line) : new String("Invalid: "));
                            } else {
                                String str3 = new String(strArrSplit[0]);
                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                String strDecode2 = (String) map2.get(strArrSplit[2]);
                                if (strDecode2 == null) {
                                    String str4 = new String(strArrSplit[2]);
                                    strDecode2 = Uri.decode(str4);
                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                        map2.put(str4, strDecode2);
                                    }
                                }
                                if (!map.containsKey(str3)) {
                                    map.put(str3, new HashMap());
                                }
                                ((Map) map.get(str3)).put(strDecode, strDecode2);
                            }
                        }
                        String string = file2.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 7);
                        sb.append("Parsed ");
                        sb.append(string);
                        Log.i("HermeticFileOverrides", sb.toString());
                        j4 j4Var = new j4(map);
                        bufferedReader.close();
                        zzhzVarZzc2 = zzhz.zzd(j4Var);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            } else {
                zzhzVarZzc2 = zzhz.zzc();
            }
            return zzhzVarZzc2;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
