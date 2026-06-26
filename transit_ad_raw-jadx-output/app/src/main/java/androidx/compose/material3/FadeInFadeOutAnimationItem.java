package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B7\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012&\u0010\r\u001a\"\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\t¢\u0006\u0002\b\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J0\u0010\n\u001a\"\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\t¢\u0006\u0002\b\bHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJJ\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\f\u001a\u00028\u00002(\b\u0002\u0010\r\u001a\"\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\t¢\u0006\u0002\b\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0004R7\u0010\r\u001a\"\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\t¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/FadeInFadeOutAnimationItem;", "T", "", "component1", "()Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/Function0;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/material3/FadeInFadeOutTransition;", "component2", "()Lkj/q;", "key", "transition", "copy", "(Ljava/lang/Object;Lkj/q;)Landroidx/compose/material3/FadeInFadeOutAnimationItem;", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "getKey", "Lkj/q;", "getTransition", "<init>", "(Ljava/lang/Object;Lkj/q;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class FadeInFadeOutAnimationItem<T> {
    private final T key;
    private final q<p<? super Composer, ? super Integer, j>, Composer, Integer, j> transition;

    public FadeInFadeOutAnimationItem(T t, q<? super p<? super Composer, ? super Integer, j>, ? super Composer, ? super Integer, j> qVar) {
        m.h(qVar, "transition");
        this.key = t;
        this.transition = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FadeInFadeOutAnimationItem copy$default(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem, Object obj, q qVar, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = fadeInFadeOutAnimationItem.key;
        }
        if ((i2 & 2) != 0) {
            qVar = fadeInFadeOutAnimationItem.transition;
        }
        return fadeInFadeOutAnimationItem.copy(obj, qVar);
    }

    public final T component1() {
        return this.key;
    }

    public final q<p<? super Composer, ? super Integer, j>, Composer, Integer, j> component2() {
        return this.transition;
    }

    public final FadeInFadeOutAnimationItem<T> copy(T key, q<? super p<? super Composer, ? super Integer, j>, ? super Composer, ? super Integer, j> transition) {
        m.h(transition, "transition");
        return new FadeInFadeOutAnimationItem<>(key, transition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) other;
        return m.c(this.key, fadeInFadeOutAnimationItem.key) && m.c(this.transition, fadeInFadeOutAnimationItem.transition);
    }

    public final T getKey() {
        return this.key;
    }

    public final q<p<? super Composer, ? super Integer, j>, Composer, Integer, j> getTransition() {
        return this.transition;
    }

    public int hashCode() {
        T t = this.key;
        return this.transition.hashCode() + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }
}
