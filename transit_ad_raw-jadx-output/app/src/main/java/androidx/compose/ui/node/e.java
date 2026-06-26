package androidx.compose.ui.node;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.node.Owner;

/* JADX INFO: compiled from: Owner.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class e {
    static {
        Owner.Companion companion = Owner.INSTANCE;
    }

    public static /* synthetic */ void e(Owner owner, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i2 & 1) != 0) {
            z = true;
        }
        owner.measureAndLayout(z);
    }

    public static /* synthetic */ void f(Owner owner, LayoutNode layoutNode, boolean z, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        owner.onRequestMeasure(layoutNode, z, z2);
    }

    public static /* synthetic */ void g(Owner owner, LayoutNode layoutNode, boolean z, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        owner.onRequestRelayout(layoutNode, z, z2);
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void a() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ void d() {
    }
}
