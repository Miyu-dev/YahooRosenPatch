package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FocusRequesterModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterModifier;", "Landroidx/compose/ui/Modifier$Element;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public interface FocusRequesterModifier extends Modifier.Element {

    /* JADX INFO: compiled from: FocusRequesterModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusRequesterModifier focusRequesterModifier, l<? super Modifier.Element, Boolean> lVar) {
            m.h(lVar, "predicate");
            return androidx.compose.ui.b.a(focusRequesterModifier, lVar);
        }

        @Deprecated
        public static boolean any(FocusRequesterModifier focusRequesterModifier, l<? super Modifier.Element, Boolean> lVar) {
            m.h(lVar, "predicate");
            return androidx.compose.ui.b.b(focusRequesterModifier, lVar);
        }

        @Deprecated
        public static <R> R foldIn(FocusRequesterModifier focusRequesterModifier, R r, p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            m.h(pVar, "operation");
            return (R) androidx.compose.ui.b.c(focusRequesterModifier, r, pVar);
        }

        @Deprecated
        public static <R> R foldOut(FocusRequesterModifier focusRequesterModifier, R r, p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            m.h(pVar, "operation");
            return (R) androidx.compose.ui.b.d(focusRequesterModifier, r, pVar);
        }

        @Deprecated
        public static Modifier then(FocusRequesterModifier focusRequesterModifier, Modifier modifier) {
            m.h(modifier, "other");
            return androidx.compose.ui.a.a(focusRequesterModifier, modifier);
        }
    }

    FocusRequester getFocusRequester();
}
