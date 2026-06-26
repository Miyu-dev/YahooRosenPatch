package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;

/* JADX INFO: compiled from: RelocationRequester.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/ui/layout/RelocationRequester;", "", "Landroidx/compose/ui/geometry/Rect;", "rect", "Lkotlin/j;", "bringIntoView", "(Landroidx/compose/ui/geometry/Rect;Ldj/c;)Ljava/lang/Object;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class RelocationRequester {
    public static final int $stable = 0;

    public static /* synthetic */ Object bringIntoView$default(RelocationRequester relocationRequester, Rect rect, dj.c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            rect = null;
        }
        return relocationRequester.bringIntoView(rect, cVar);
    }

    public final Object bringIntoView(Rect rect, dj.c<? super kotlin.j> cVar) {
        return kotlin.j.a;
    }
}
