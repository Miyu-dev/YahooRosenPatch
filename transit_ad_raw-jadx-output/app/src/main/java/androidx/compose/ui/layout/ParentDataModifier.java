package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import kj.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: ParentDataModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/Modifier$Element;", "modifyParentData", "", "Landroidx/compose/ui/unit/Density;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public interface ParentDataModifier extends Modifier.Element {

    /* JADX INFO: compiled from: ParentDataModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(ParentDataModifier parentDataModifier, kj.l<? super Modifier.Element, Boolean> lVar) {
            kotlin.jvm.internal.m.h(lVar, "predicate");
            return androidx.compose.ui.b.a(parentDataModifier, lVar);
        }

        @Deprecated
        public static boolean any(ParentDataModifier parentDataModifier, kj.l<? super Modifier.Element, Boolean> lVar) {
            kotlin.jvm.internal.m.h(lVar, "predicate");
            return androidx.compose.ui.b.b(parentDataModifier, lVar);
        }

        @Deprecated
        public static <R> R foldIn(ParentDataModifier parentDataModifier, R r, p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            kotlin.jvm.internal.m.h(pVar, "operation");
            return (R) androidx.compose.ui.b.c(parentDataModifier, r, pVar);
        }

        @Deprecated
        public static <R> R foldOut(ParentDataModifier parentDataModifier, R r, p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            kotlin.jvm.internal.m.h(pVar, "operation");
            return (R) androidx.compose.ui.b.d(parentDataModifier, r, pVar);
        }

        @Deprecated
        public static Modifier then(ParentDataModifier parentDataModifier, Modifier modifier) {
            kotlin.jvm.internal.m.h(modifier, "other");
            return androidx.compose.ui.a.a(parentDataModifier, modifier);
        }
    }

    Object modifyParentData(Density density, Object obj);
}
