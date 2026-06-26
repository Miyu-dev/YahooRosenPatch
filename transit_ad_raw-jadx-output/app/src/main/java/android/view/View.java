package android.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import uj.l;
import uj.s;

/* JADX INFO: renamed from: androidx.activity.ViewTreeFullyDrawnReporterOwner, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ViewTreeFullyLoadedReporterOwner.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroid/view/View;", "Landroidx/activity/FullyDrawnReporterOwner;", "fullyDrawnReporterOwner", "Lkotlin/j;", "set", "(Landroid/view/View;Landroidx/activity/FullyDrawnReporterOwner;)V", "setViewTreeFullyDrawnReporterOwner", "get", "(Landroid/view/View;)Landroidx/activity/FullyDrawnReporterOwner;", "findViewTreeFullyDrawnReporterOwner", "activity_release"}, k = 2, mv = {1, 8, 0})
public final class View {
    public static final FullyDrawnReporterOwner get(android.view.View view) {
        m.h(view, "<this>");
        return (FullyDrawnReporterOwner) s.x(s.B(l.q(view, new kj.l<android.view.View, android.view.View>() { // from class: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1
            public final View invoke(View view2) {
                m.h(view2, "it");
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new kj.l<android.view.View, FullyDrawnReporterOwner>() { // from class: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2
            public final FullyDrawnReporterOwner invoke(View view2) {
                m.h(view2, "it");
                Object tag = view2.getTag(R.id.report_drawn);
                if (tag instanceof FullyDrawnReporterOwner) {
                    return (FullyDrawnReporterOwner) tag;
                }
                return null;
            }
        }));
    }

    public static final void set(android.view.View view, FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        m.h(view, "<this>");
        m.h(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(R.id.report_drawn, fullyDrawnReporterOwner);
    }
}
