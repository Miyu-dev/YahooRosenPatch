package androidx.compose.ui.platform;

import androidx.autofill.HintConstants;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: JvmActuals.jvm.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a/\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b*\f\b\u0000\u0010\r\"\u00020\f2\u00020\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"", "obj", "", HintConstants.AUTOFILL_HINT_NAME, "simpleIdentityToString", "nativeClass", "R", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Ljava/lang/Object;Lkj/a;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicInteger;", "AtomicInt", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class JvmActuals_jvmKt {
    public static final Object nativeClass(Object obj) {
        kotlin.jvm.internal.m.h(obj, "<this>");
        return obj.getClass();
    }

    public static final String simpleIdentityToString(Object obj, String str) {
        kotlin.jvm.internal.m.h(obj, "obj");
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        kotlin.jvm.internal.m.g(str2, "format(format, *args)");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <R> R m4583synchronized(Object obj, kj.a<? extends R> aVar) {
        R r;
        kotlin.jvm.internal.m.h(obj, "lock");
        kotlin.jvm.internal.m.h(aVar, "block");
        synchronized (obj) {
            r = (R) aVar.invoke();
        }
        return r;
    }
}
