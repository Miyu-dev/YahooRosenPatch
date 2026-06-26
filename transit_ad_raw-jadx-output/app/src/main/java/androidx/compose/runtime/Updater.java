package androidx.compose.runtime;

import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\"\u001a\u00020!ø\u0001\u0001¢\u0006\u0004\b&\u0010'J7\u0010\n\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u001a\b\b\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ5\u0010\n\u001a\u00020\u0006\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\u0004\u001a\u00028\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\fJ7\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u001a\b\b\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ5\u0010\u000e\u001a\u00020\u0006\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\u0004\u001a\u00028\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\r\u0010\fJ!\u0010\u0012\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010 \u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\u00020!8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010%\u0088\u0001\"\u0092\u0001\u00020!ø\u0001\u0001\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/runtime/Updater;", "T", "", "", "value", "Lkotlin/Function2;", "Lkotlin/j;", "block", "set-impl", "(Landroidx/compose/runtime/Composer;ILkj/p;)V", "set", "V", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkj/p;)V", "update-impl", "update", "Lkotlin/Function1;", "init-impl", "(Landroidx/compose/runtime/Composer;Lkj/l;)V", "init", "reconcile-impl", "reconcile", "", "toString-impl", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "toString", "hashCode-impl", "(Landroidx/compose/runtime/Composer;)I", "hashCode", "other", "", "equals-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "equals", "Landroidx/compose/runtime/Composer;", "composer", "Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class Updater<T> {
    private final Composer composer;

    private /* synthetic */ Updater(Composer composer) {
        this.composer = composer;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Updater m2436boximpl(Composer composer) {
        return new Updater(composer);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m2437constructorimpl(Composer composer) {
        m.h(composer, "composer");
        return composer;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2438equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && m.c(composer, ((Updater) obj).getComposer());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2439equalsimpl0(Composer composer, Composer composer2) {
        return m.c(composer, composer2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2440hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* JADX INFO: renamed from: init-impl, reason: not valid java name */
    public static final void m2441initimpl(Composer composer, final l<? super T, j> lVar) {
        m.h(lVar, "block");
        if (composer.getInserting()) {
            composer.apply(j.a, new p<T, j, j>() { // from class: androidx.compose.runtime.Updater$init$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke(obj, (j) obj2);
                    return j.a;
                }

                public final void invoke(T t, j jVar) {
                    m.h(jVar, "it");
                    lVar.invoke(t);
                }
            });
        }
    }

    /* JADX INFO: renamed from: reconcile-impl, reason: not valid java name */
    public static final void m2442reconcileimpl(Composer composer, final l<? super T, j> lVar) {
        m.h(lVar, "block");
        composer.apply(j.a, new p<T, j, j>() { // from class: androidx.compose.runtime.Updater$reconcile$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(obj, (j) obj2);
                return j.a;
            }

            public final void invoke(T t, j jVar) {
                m.h(jVar, "it");
                lVar.invoke(t);
            }
        });
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m2443setimpl(Composer composer, int i2, p<? super T, ? super Integer, j> pVar) {
        m.h(pVar, "block");
        if (composer.getInserting() || !m.c(composer.rememberedValue(), Integer.valueOf(i2))) {
            composer.updateRememberedValue(Integer.valueOf(i2));
            composer.apply(Integer.valueOf(i2), pVar);
        }
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2445toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    /* JADX INFO: renamed from: update-impl, reason: not valid java name */
    public static final void m2446updateimpl(Composer composer, int i2, p<? super T, ? super Integer, j> pVar) {
        m.h(pVar, "block");
        boolean inserting = composer.getInserting();
        if (inserting || !m.c(composer.rememberedValue(), Integer.valueOf(i2))) {
            composer.updateRememberedValue(Integer.valueOf(i2));
            if (inserting) {
                return;
            }
            composer.apply(Integer.valueOf(i2), pVar);
        }
    }

    public boolean equals(Object obj) {
        return m2438equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m2440hashCodeimpl(this.composer);
    }

    public String toString() {
        return m2445toStringimpl(this.composer);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Composer getComposer() {
        return this.composer;
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final <V> void m2444setimpl(Composer composer, V v, p<? super T, ? super V, j> pVar) {
        m.h(pVar, "block");
        if (composer.getInserting() || !m.c(composer.rememberedValue(), v)) {
            composer.updateRememberedValue(v);
            composer.apply(v, pVar);
        }
    }

    /* JADX INFO: renamed from: update-impl, reason: not valid java name */
    public static final <V> void m2447updateimpl(Composer composer, V v, p<? super T, ? super V, j> pVar) {
        m.h(pVar, "block");
        boolean inserting = composer.getInserting();
        if (inserting || !m.c(composer.rememberedValue(), v)) {
            composer.updateRememberedValue(v);
            if (inserting) {
                return;
            }
            composer.apply(v, pVar);
        }
    }

    public static /* synthetic */ void getComposer$annotations() {
    }
}
