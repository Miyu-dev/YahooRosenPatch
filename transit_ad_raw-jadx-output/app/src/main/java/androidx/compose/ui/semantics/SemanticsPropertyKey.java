package androidx.compose.ui.semantics;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;
import rj.l;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u001e\b\u0002\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R0\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "T", "", "parentValue", "childValue", "merge", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "thisRef", "Lrj/l;", "property", "getValue", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lrj/l;)Ljava/lang/Object;", "value", "Lkotlin/j;", "setValue", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lrj/l;Ljava/lang/Object;)V", "", "toString", HintConstants.AUTOFILL_HINT_NAME, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lkotlin/Function2;", "mergePolicy", "Lkj/p;", "getMergePolicy$ui_release", "()Lkj/p;", "<init>", "(Ljava/lang/String;Lkj/p;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 0;
    private final p<T, T, T> mergePolicy;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, p<? super T, ? super T, ? extends T> pVar) {
        m.h(str, HintConstants.AUTOFILL_HINT_NAME);
        m.h(pVar, "mergePolicy");
        this.name = str;
        this.mergePolicy = pVar;
    }

    public final p<T, T, T> getMergePolicy$ui_release() {
        return this.mergePolicy;
    }

    public final String getName() {
        return this.name;
    }

    public final T getValue(SemanticsPropertyReceiver thisRef, l<?> property) {
        m.h(thisRef, "thisRef");
        m.h(property, "property");
        return (T) SemanticsPropertiesKt.throwSemanticsGetNotSupported();
    }

    public final T merge(T parentValue, T childValue) {
        return (T) this.mergePolicy.invoke(parentValue, childValue);
    }

    public final void setValue(SemanticsPropertyReceiver thisRef, l<?> property, T value) {
        m.h(thisRef, "thisRef");
        m.h(property, "property");
        thisRef.set(this, value);
    }

    public String toString() {
        return "SemanticsPropertyKey: " + this.name;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, p pVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? new p<T, T, T>() { // from class: androidx.compose.ui.semantics.SemanticsPropertyKey.1
            public final T invoke(T t, T t2) {
                return t == null ? t2 : t;
            }
        } : pVar);
    }
}
