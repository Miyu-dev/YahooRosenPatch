package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import kj.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016J)\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u001c\u0010\u0013\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/Modifier$Element;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public interface LayoutModifier extends Modifier.Element {

    /* JADX INFO: compiled from: LayoutModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(LayoutModifier layoutModifier, kj.l<? super Modifier.Element, Boolean> lVar) {
            kotlin.jvm.internal.m.h(lVar, "predicate");
            return androidx.compose.ui.b.a(layoutModifier, lVar);
        }

        @Deprecated
        public static boolean any(LayoutModifier layoutModifier, kj.l<? super Modifier.Element, Boolean> lVar) {
            kotlin.jvm.internal.m.h(lVar, "predicate");
            return androidx.compose.ui.b.b(layoutModifier, lVar);
        }

        @Deprecated
        public static <R> R foldIn(LayoutModifier layoutModifier, R r, p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            kotlin.jvm.internal.m.h(pVar, "operation");
            return (R) androidx.compose.ui.b.c(layoutModifier, r, pVar);
        }

        @Deprecated
        public static <R> R foldOut(LayoutModifier layoutModifier, R r, p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            kotlin.jvm.internal.m.h(pVar, "operation");
            return (R) androidx.compose.ui.b.d(layoutModifier, r, pVar);
        }

        @Deprecated
        public static int maxIntrinsicHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            kotlin.jvm.internal.m.h(intrinsicMeasureScope, "$receiver");
            kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
            return c.a(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i2);
        }

        @Deprecated
        public static int maxIntrinsicWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            kotlin.jvm.internal.m.h(intrinsicMeasureScope, "$receiver");
            kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
            return c.b(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i2);
        }

        @Deprecated
        public static int minIntrinsicHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            kotlin.jvm.internal.m.h(intrinsicMeasureScope, "$receiver");
            kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
            return c.c(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i2);
        }

        @Deprecated
        public static int minIntrinsicWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            kotlin.jvm.internal.m.h(intrinsicMeasureScope, "$receiver");
            kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
            return c.d(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i2);
        }

        @Deprecated
        public static Modifier then(LayoutModifier layoutModifier, Modifier modifier) {
            kotlin.jvm.internal.m.h(modifier, "other");
            return androidx.compose.ui.a.a(layoutModifier, modifier);
        }
    }

    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);

    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);

    /* JADX INFO: renamed from: measure-3p2s80s */
    MeasureResult mo47measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j);

    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);

    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);
}
