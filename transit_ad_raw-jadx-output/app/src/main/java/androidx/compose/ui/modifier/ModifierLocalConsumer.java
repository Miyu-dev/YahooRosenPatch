package androidx.compose.ui.modifier;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ModifierLocalConsumer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "Lkotlin/j;", "onModifierLocalsUpdated", "ui_release"}, k = 1, mv = {1, 8, 0})
public interface ModifierLocalConsumer extends Modifier.Element {

    /* JADX INFO: compiled from: ModifierLocalConsumer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(ModifierLocalConsumer modifierLocalConsumer, l<? super Modifier.Element, Boolean> lVar) {
            m.h(lVar, "predicate");
            return androidx.compose.ui.b.a(modifierLocalConsumer, lVar);
        }

        @Deprecated
        public static boolean any(ModifierLocalConsumer modifierLocalConsumer, l<? super Modifier.Element, Boolean> lVar) {
            m.h(lVar, "predicate");
            return androidx.compose.ui.b.b(modifierLocalConsumer, lVar);
        }

        @Deprecated
        public static <R> R foldIn(ModifierLocalConsumer modifierLocalConsumer, R r, p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            m.h(pVar, "operation");
            return (R) androidx.compose.ui.b.c(modifierLocalConsumer, r, pVar);
        }

        @Deprecated
        public static <R> R foldOut(ModifierLocalConsumer modifierLocalConsumer, R r, p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            m.h(pVar, "operation");
            return (R) androidx.compose.ui.b.d(modifierLocalConsumer, r, pVar);
        }

        @Deprecated
        public static Modifier then(ModifierLocalConsumer modifierLocalConsumer, Modifier modifier) {
            m.h(modifier, "other");
            return androidx.compose.ui.a.a(modifierLocalConsumer, modifier);
        }
    }

    void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope);
}
