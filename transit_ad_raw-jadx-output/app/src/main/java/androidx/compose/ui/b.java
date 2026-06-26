package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import kj.l;
import kj.p;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class b {
    public static boolean a(Modifier.Element element, l lVar) {
        m.h(lVar, "predicate");
        return ((Boolean) lVar.invoke(element)).booleanValue();
    }

    public static boolean b(Modifier.Element element, l lVar) {
        m.h(lVar, "predicate");
        return ((Boolean) lVar.invoke(element)).booleanValue();
    }

    public static Object c(Modifier.Element element, Object obj, p pVar) {
        m.h(pVar, "operation");
        return pVar.invoke(obj, element);
    }

    public static Object d(Modifier.Element element, Object obj, p pVar) {
        m.h(pVar, "operation");
        return pVar.invoke(element, obj);
    }
}
