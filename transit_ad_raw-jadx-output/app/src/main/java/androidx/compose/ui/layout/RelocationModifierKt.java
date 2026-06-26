package androidx.compose.ui.layout;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import kj.p;
import kj.q;
import kotlin.Metadata;

/* JADX INFO: compiled from: RelocationModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aZ\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u00012(\u0010\t\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "onProvideDestination", "Lkotlin/Function3;", "Ldj/c;", "Lkotlin/j;", "", "onPerformRelocation", "onRelocationRequest", "(Landroidx/compose/ui/Modifier;Lkj/p;Lkj/q;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class RelocationModifierKt {
    @ExperimentalComposeUiApi
    public static final Modifier onRelocationRequest(Modifier modifier, p<? super Rect, ? super LayoutCoordinates, Rect> pVar, q<? super Rect, ? super Rect, ? super dj.c<? super kotlin.j>, ? extends Object> qVar) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(pVar, "onProvideDestination");
        kotlin.jvm.internal.m.h(qVar, "onPerformRelocation");
        return modifier;
    }
}
