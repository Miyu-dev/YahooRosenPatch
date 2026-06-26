package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: RecomposeScopeImpl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bP\u0010QJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\u0005H\u0016J\"\u0010\u0013\u001a\u00020\u00052\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0007J\u0016\u0010\u001c\u001a\u00020\u001b2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0019J\u0006\u0010\u001d\u001a\u00020\u0005J\u001c\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e2\u0006\u0010\u0014\u001a\u00020\u0011R\u0016\u0010!\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010#\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&R$\u0010(\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010.R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\"R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R*\u00105\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u000304\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0011\u00109\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010;\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b:\u00108R$\u0010?\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u00108\"\u0004\b=\u0010>R$\u0010B\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u00108\"\u0004\bA\u0010>R$\u0010E\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u00108\"\u0004\bD\u0010>R$\u0010H\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u00108\"\u0004\bG\u0010>R$\u0010K\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8@@BX\u0080\u000e¢\u0006\f\u001a\u0004\bI\u00108\"\u0004\bJ\u0010>R\u0011\u0010L\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bL\u00108R$\u0010O\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bM\u00108\"\u0004\bN\u0010>¨\u0006R"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/runtime/Composer;", "composer", "Lkotlin/j;", "compose", "", "value", "Landroidx/compose/runtime/InvalidationResult;", "invalidateForResult", "release", "Landroidx/compose/runtime/CompositionImpl;", "composition", "adoptedBy", "invalidate", "Lkotlin/Function2;", "", "block", "updateScope", "token", "start", "scopeSkipped", "instance", "recordRead", "Landroidx/compose/runtime/collection/IdentityArraySet;", "instances", "", "isInvalidFor", "rereadTrackedInstances", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "end", "flags", "I", "<set-?>", "Landroidx/compose/runtime/CompositionImpl;", "getComposition", "()Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/Anchor;", "anchor", "Landroidx/compose/runtime/Anchor;", "getAnchor", "()Landroidx/compose/runtime/Anchor;", "setAnchor", "(Landroidx/compose/runtime/Anchor;)V", "Lkj/p;", "currentToken", "Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "trackedInstances", "Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/DerivedState;", "trackedDependencies", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "getValid", "()Z", "valid", "getCanRecompose", "canRecompose", "getUsed", "setUsed", "(Z)V", "used", "getDefaultsInScope", "setDefaultsInScope", "defaultsInScope", "getDefaultsInvalid", "setDefaultsInvalid", "defaultsInvalid", "getRequiresRecompose", "setRequiresRecompose", "requiresRecompose", "getSkipped$runtime_release", "setSkipped", "skipped", "isConditional", "getRereading", "setRereading", "rereading", "<init>", "(Landroidx/compose/runtime/CompositionImpl;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {
    private Anchor anchor;
    private p<? super Composer, ? super Integer, j> block;
    private CompositionImpl composition;
    private int currentToken;
    private int flags;
    private IdentityArrayMap<DerivedState<?>, Object> trackedDependencies;
    private IdentityArrayIntMap trackedInstances;

    public RecomposeScopeImpl(CompositionImpl compositionImpl) {
        this.composition = compositionImpl;
    }

    private final boolean getRereading() {
        return (this.flags & 32) != 0;
    }

    private final void setRereading(boolean z) {
        if (z) {
            this.flags |= 32;
        } else {
            this.flags &= -33;
        }
    }

    private final void setSkipped(boolean z) {
        if (z) {
            this.flags |= 16;
        } else {
            this.flags &= -17;
        }
    }

    public final void adoptedBy(CompositionImpl compositionImpl) {
        m.h(compositionImpl, "composition");
        this.composition = compositionImpl;
    }

    public final void compose(Composer composer) {
        j jVar;
        m.h(composer, "composer");
        p<? super Composer, ? super Integer, j> pVar = this.block;
        if (pVar != null) {
            pVar.invoke(composer, 1);
            jVar = j.a;
        } else {
            jVar = null;
        }
        if (jVar == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    public final l<Composition, j> end(final int i2) {
        final IdentityArrayIntMap identityArrayIntMap = this.trackedInstances;
        if (identityArrayIntMap == null || getSkipped$runtime_release()) {
            return null;
        }
        int size = identityArrayIntMap.getSize();
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            m.f(identityArrayIntMap.getKeys()[i3], "null cannot be cast to non-null type kotlin.Any");
            if (identityArrayIntMap.getValues()[i3] != i2) {
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            return new l<Composition, j>() { // from class: androidx.compose.runtime.RecomposeScopeImpl$end$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Composition) obj);
                    return j.a;
                }

                public final void invoke(Composition composition) {
                    m.h(composition, "composition");
                    if (this.this$0.currentToken == i2 && m.c(identityArrayIntMap, this.this$0.trackedInstances) && (composition instanceof CompositionImpl)) {
                        IdentityArrayIntMap identityArrayIntMap2 = identityArrayIntMap;
                        int i4 = i2;
                        RecomposeScopeImpl recomposeScopeImpl = this.this$0;
                        int size2 = identityArrayIntMap2.getSize();
                        int i5 = 0;
                        for (int i6 = 0; i6 < size2; i6++) {
                            Object obj = identityArrayIntMap2.getKeys()[i6];
                            m.f(obj, "null cannot be cast to non-null type kotlin.Any");
                            int i7 = identityArrayIntMap2.getValues()[i6];
                            boolean z2 = i7 != i4;
                            if (z2) {
                                CompositionImpl compositionImpl = (CompositionImpl) composition;
                                compositionImpl.removeObservation$runtime_release(obj, recomposeScopeImpl);
                                DerivedState<?> derivedState = obj instanceof DerivedState ? (DerivedState) obj : null;
                                if (derivedState != null) {
                                    compositionImpl.removeDerivedStateObservation$runtime_release(derivedState);
                                    IdentityArrayMap identityArrayMap = recomposeScopeImpl.trackedDependencies;
                                    if (identityArrayMap != null) {
                                        identityArrayMap.remove(derivedState);
                                        if (identityArrayMap.getSize() == 0) {
                                            recomposeScopeImpl.trackedDependencies = null;
                                        }
                                    }
                                }
                            }
                            if (!z2) {
                                if (i5 != i6) {
                                    identityArrayIntMap2.getKeys()[i5] = obj;
                                    identityArrayIntMap2.getValues()[i5] = i7;
                                }
                                i5++;
                            }
                        }
                        int size3 = identityArrayIntMap2.getSize();
                        for (int i8 = i5; i8 < size3; i8++) {
                            identityArrayIntMap2.getKeys()[i8] = null;
                        }
                        identityArrayIntMap2.setSize(i5);
                        if (identityArrayIntMap.getSize() == 0) {
                            this.this$0.trackedInstances = null;
                        }
                    }
                }
            };
        }
        return null;
    }

    public final Anchor getAnchor() {
        return this.anchor;
    }

    public final boolean getCanRecompose() {
        return this.block != null;
    }

    public final CompositionImpl getComposition() {
        return this.composition;
    }

    public final boolean getDefaultsInScope() {
        return (this.flags & 2) != 0;
    }

    public final boolean getDefaultsInvalid() {
        return (this.flags & 4) != 0;
    }

    public final boolean getRequiresRecompose() {
        return (this.flags & 8) != 0;
    }

    public final boolean getSkipped$runtime_release() {
        return (this.flags & 16) != 0;
    }

    public final boolean getUsed() {
        return (this.flags & 1) != 0;
    }

    public final boolean getValid() {
        if (this.composition == null) {
            return false;
        }
        Anchor anchor = this.anchor;
        return anchor != null ? anchor.getValid() : false;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        CompositionImpl compositionImpl = this.composition;
        if (compositionImpl != null) {
            compositionImpl.invalidate(this, null);
        }
    }

    public final InvalidationResult invalidateForResult(Object value) {
        InvalidationResult invalidationResultInvalidate;
        CompositionImpl compositionImpl = this.composition;
        return (compositionImpl == null || (invalidationResultInvalidate = compositionImpl.invalidate(this, value)) == null) ? InvalidationResult.IGNORED : invalidationResultInvalidate;
    }

    public final boolean isConditional() {
        return this.trackedDependencies != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[LOOP:0: B:14:0x001c->B:34:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInvalidFor(androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != 0) goto L4
            return r0
        L4:
            androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> r1 = r6.trackedDependencies
            if (r1 != 0) goto L9
            return r0
        L9:
            boolean r2 = r7.isNotEmpty()
            if (r2 == 0) goto L4d
            boolean r2 = r7.isEmpty()
            r3 = 0
            if (r2 == 0) goto L18
        L16:
            r7 = r0
            goto L4a
        L18:
            java.util.Iterator r7 = r7.iterator()
        L1c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L16
            java.lang.Object r2 = r7.next()
            boolean r4 = r2 instanceof androidx.compose.runtime.DerivedState
            if (r4 == 0) goto L46
            androidx.compose.runtime.DerivedState r2 = (androidx.compose.runtime.DerivedState) r2
            androidx.compose.runtime.SnapshotMutationPolicy r4 = r2.getPolicy()
            if (r4 != 0) goto L36
            androidx.compose.runtime.SnapshotMutationPolicy r4 = androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy()
        L36:
            java.lang.Object r5 = r2.getCurrentValue()
            java.lang.Object r2 = r1.get(r2)
            boolean r2 = r4.equivalent(r5, r2)
            if (r2 == 0) goto L46
            r2 = r0
            goto L47
        L46:
            r2 = r3
        L47:
            if (r2 != 0) goto L1c
            r7 = r3
        L4a:
            if (r7 == 0) goto L4d
            return r3
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.isInvalidFor(androidx.compose.runtime.collection.IdentityArraySet):boolean");
    }

    public final void recordRead(Object obj) {
        m.h(obj, "instance");
        if (getRereading()) {
            return;
        }
        IdentityArrayIntMap identityArrayIntMap = this.trackedInstances;
        if (identityArrayIntMap == null) {
            identityArrayIntMap = new IdentityArrayIntMap();
            this.trackedInstances = identityArrayIntMap;
        }
        identityArrayIntMap.add(obj, this.currentToken);
        if (obj instanceof DerivedState) {
            IdentityArrayMap<DerivedState<?>, Object> identityArrayMap = this.trackedDependencies;
            if (identityArrayMap == null) {
                identityArrayMap = new IdentityArrayMap<>(0, 1, null);
                this.trackedDependencies = identityArrayMap;
            }
            identityArrayMap.set(obj, ((DerivedState) obj).getCurrentValue());
        }
    }

    public final void release() {
        this.composition = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
    }

    public final void rereadTrackedInstances() {
        IdentityArrayIntMap identityArrayIntMap;
        CompositionImpl compositionImpl = this.composition;
        if (compositionImpl == null || (identityArrayIntMap = this.trackedInstances) == null) {
            return;
        }
        setRereading(true);
        try {
            int size = identityArrayIntMap.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = identityArrayIntMap.getKeys()[i2];
                m.f(obj, "null cannot be cast to non-null type kotlin.Any");
                int i3 = identityArrayIntMap.getValues()[i2];
                compositionImpl.recordReadOf(obj);
            }
        } finally {
            setRereading(false);
        }
    }

    public final void scopeSkipped() {
        setSkipped(true);
    }

    public final void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public final void setDefaultsInScope(boolean z) {
        if (z) {
            this.flags |= 2;
        } else {
            this.flags &= -3;
        }
    }

    public final void setDefaultsInvalid(boolean z) {
        if (z) {
            this.flags |= 4;
        } else {
            this.flags &= -5;
        }
    }

    public final void setRequiresRecompose(boolean z) {
        if (z) {
            this.flags |= 8;
        } else {
            this.flags &= -9;
        }
    }

    public final void setUsed(boolean z) {
        if (z) {
            this.flags |= 1;
        } else {
            this.flags &= -2;
        }
    }

    public final void start(int i2) {
        this.currentToken = i2;
        setSkipped(false);
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(p<? super Composer, ? super Integer, j> pVar) {
        m.h(pVar, "block");
        this.block = pVar;
    }
}
