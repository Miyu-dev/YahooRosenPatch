package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import kj.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: RelocationModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/RelocationModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/geometry/Rect;", "source", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "computeDestination", "destination", "Lkotlin/j;", "performRelocation", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Ldj/c;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0})
public interface RelocationModifier extends Modifier.Element {

    /* JADX INFO: compiled from: RelocationModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(RelocationModifier relocationModifier, kj.l<? super Modifier.Element, Boolean> lVar) {
            kotlin.jvm.internal.m.h(lVar, "predicate");
            return androidx.compose.ui.b.a(relocationModifier, lVar);
        }

        @Deprecated
        public static boolean any(RelocationModifier relocationModifier, kj.l<? super Modifier.Element, Boolean> lVar) {
            kotlin.jvm.internal.m.h(lVar, "predicate");
            return androidx.compose.ui.b.b(relocationModifier, lVar);
        }

        @Deprecated
        public static <R> R foldIn(RelocationModifier relocationModifier, R r, p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            kotlin.jvm.internal.m.h(pVar, "operation");
            return (R) androidx.compose.ui.b.c(relocationModifier, r, pVar);
        }

        @Deprecated
        public static <R> R foldOut(RelocationModifier relocationModifier, R r, p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            kotlin.jvm.internal.m.h(pVar, "operation");
            return (R) androidx.compose.ui.b.d(relocationModifier, r, pVar);
        }

        @Deprecated
        public static Modifier then(RelocationModifier relocationModifier, Modifier modifier) {
            kotlin.jvm.internal.m.h(modifier, "other");
            return androidx.compose.ui.a.a(relocationModifier, modifier);
        }
    }

    Rect computeDestination(Rect source, LayoutCoordinates layoutCoordinates);

    Object performRelocation(Rect rect, Rect rect2, dj.c<? super kotlin.j> cVar);
}
