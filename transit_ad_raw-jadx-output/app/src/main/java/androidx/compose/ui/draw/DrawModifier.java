package androidx.compose.ui.draw;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/j;", "draw", "ui_release"}, k = 1, mv = {1, 8, 0})
public interface DrawModifier extends Modifier.Element {

    /* JADX INFO: compiled from: DrawModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(DrawModifier drawModifier, l<? super Modifier.Element, Boolean> lVar) {
            m.h(lVar, "predicate");
            return androidx.compose.ui.b.a(drawModifier, lVar);
        }

        @Deprecated
        public static boolean any(DrawModifier drawModifier, l<? super Modifier.Element, Boolean> lVar) {
            m.h(lVar, "predicate");
            return androidx.compose.ui.b.b(drawModifier, lVar);
        }

        @Deprecated
        public static <R> R foldIn(DrawModifier drawModifier, R r, p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            m.h(pVar, "operation");
            return (R) androidx.compose.ui.b.c(drawModifier, r, pVar);
        }

        @Deprecated
        public static <R> R foldOut(DrawModifier drawModifier, R r, p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            m.h(pVar, "operation");
            return (R) androidx.compose.ui.b.d(drawModifier, r, pVar);
        }

        @Deprecated
        public static Modifier then(DrawModifier drawModifier, Modifier modifier) {
            m.h(modifier, "other");
            return androidx.compose.ui.a.a(drawModifier, modifier);
        }
    }

    void draw(ContentDrawScope contentDrawScope);
}
