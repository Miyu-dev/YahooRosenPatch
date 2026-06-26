package androidx.compose.runtime.snapshots;

import a.f;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kj.l;
import kj.p;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: SnapshotStateObserver.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u00019B!\u0012\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0015\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0002J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u001d\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\fH\u0082\bJ&\u0010\u0012\u001a\u00020\r\"\b\b\u0000\u0010\u0010*\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\fH\u0002JA\u0010\u0016\u001a\u00020\u0004\"\b\b\u0000\u0010\u0010*\u00020\u00012\u0006\u0010\u0013\u001a\u00028\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015H\u0007J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0001J\u001a\u0010\u001b\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\fJ\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0004J\u001c\u0010!\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010\u0019\u001a\u00020\u0004R&\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0015\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R(\u0010&\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010$j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R,\u0010+\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010#R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010)R\u0018\u00105\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "", "drainChanges", "Lkotlin/j;", "sendNotifications", "", "set", "addChanges", "removeChanges", "", "report", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "block", "forEachScopeMap", "T", "onChanged", "ensureMap", "scope", "onValueChangedForScope", "Lkotlin/Function0;", "observeReads", "(Ljava/lang/Object;Lkj/l;Lkj/a;)V", "withNoObservations", "clear", "predicate", "clearIf", "start", "stop", "changes", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "notifyChanges", "onChangedExecutor", "Lkj/l;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "pendingChanges", "Ljava/util/concurrent/atomic/AtomicReference;", "sendingNotifications", "Z", "Lkotlin/Function2;", "applyObserver", "Lkj/p;", "readObserver", "Landroidx/compose/runtime/collection/MutableVector;", "observedScopeMaps", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "isPaused", "currentMap", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "<init>", "(Lkj/l;)V", "ObservedScopeMap", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class SnapshotStateObserver {
    public static final int $stable = 8;
    private final p<Set<? extends Object>, Snapshot, j> applyObserver;
    private ObserverHandle applyUnsubscribe;
    private ObservedScopeMap currentMap;
    private boolean isPaused;
    private final MutableVector<ObservedScopeMap> observedScopeMaps;
    private final l<kj.a<j>, j> onChangedExecutor;
    private final AtomicReference<Object> pendingChanges;
    private final l<Object, j> readObserver;
    private boolean sendingNotifications;

    /* JADX INFO: compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0004\b6\u00107J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001J\"\u0010\n\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0086\bø\u0001\u0000J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u001a\u0010\u000f\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\fJ\u0006\u0010\u0010\u001a\u00020\u0003J\u0014\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011J\u0006\u0010\u0014\u001a\u00020\u0003R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001b0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R'\u0010+\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030*\u0012\u0004\u0012\u00020\u00030\f8\u0006¢\u0006\f\n\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R'\u0010-\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030*\u0012\u0004\u0012\u00020\u00030\f8\u0006¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010\u0018R\u0016\u0010/\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010 R\u001e\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003000!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010#R<\u00104\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u000300\u0012\u0006\u0012\u0004\u0018\u00010\u000102j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u000300\u0012\u0006\u0012\u0004\u0018\u00010\u0001`38\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00068"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "scope", "Lkotlin/j;", "clearObsoleteStateReads", "value", "removeObservation", "recordRead", "Lkotlin/Function0;", "block", "observe", "clearScopeObservations", "Lkotlin/Function1;", "", "predicate", "removeScopeIf", "clear", "", "changes", "recordInvalidation", "notifyInvalidatedScopes", "onChanged", "Lkj/l;", "getOnChanged", "()Lkj/l;", "currentScope", "Ljava/lang/Object;", "Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "currentScopeReads", "Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "", "currentToken", "I", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "valueToScopes", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "scopeToValues", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "invalidated", "Landroidx/compose/runtime/collection/IdentityArraySet;", "Landroidx/compose/runtime/State;", "derivedStateEnterObserver", "getDerivedStateEnterObserver", "derivedStateExitObserver", "getDerivedStateExitObserver", "deriveStateScopeCount", "Landroidx/compose/runtime/DerivedState;", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "recordedDerivedStateValues", "Ljava/util/HashMap;", "<init>", "(Lkj/l;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class ObservedScopeMap {
        private Object currentScope;
        private IdentityArrayIntMap currentScopeReads;
        private int currentToken;
        private final IdentityScopeMap<DerivedState<?>> dependencyToDerivedStates;
        private int deriveStateScopeCount;
        private final l<State<?>, j> derivedStateEnterObserver;
        private final l<State<?>, j> derivedStateExitObserver;
        private final IdentityArraySet<Object> invalidated;
        private final l<Object, j> onChanged;
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues;
        private final IdentityArrayMap<Object, IdentityArrayIntMap> scopeToValues;
        private final IdentityScopeMap<Object> valueToScopes;

        public ObservedScopeMap(l<Object, j> lVar) {
            m.h(lVar, "onChanged");
            this.onChanged = lVar;
            this.currentToken = -1;
            this.valueToScopes = new IdentityScopeMap<>();
            this.scopeToValues = new IdentityArrayMap<>(0, 1, null);
            this.invalidated = new IdentityArraySet<>();
            this.derivedStateEnterObserver = new l<State<?>, j>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateEnterObserver$1
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((State<?>) obj);
                    return j.a;
                }

                public final void invoke(State<?> state) {
                    m.h(state, "it");
                    this.this$0.deriveStateScopeCount++;
                }
            };
            this.derivedStateExitObserver = new l<State<?>, j>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateExitObserver$1
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((State<?>) obj);
                    return j.a;
                }

                public final void invoke(State<?> state) {
                    m.h(state, "it");
                    SnapshotStateObserver.ObservedScopeMap observedScopeMap = this.this$0;
                    observedScopeMap.deriveStateScopeCount--;
                }
            };
            this.dependencyToDerivedStates = new IdentityScopeMap<>();
            this.recordedDerivedStateValues = new HashMap<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearObsoleteStateReads(Object obj) {
            IdentityArrayIntMap identityArrayIntMap = this.currentScopeReads;
            if (identityArrayIntMap != null) {
                int size = identityArrayIntMap.getSize();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj2 = identityArrayIntMap.getKeys()[i3];
                    m.f(obj2, "null cannot be cast to non-null type kotlin.Any");
                    int i4 = identityArrayIntMap.getValues()[i3];
                    boolean z = i4 != this.currentToken;
                    if (z) {
                        removeObservation(obj, obj2);
                    }
                    if (!z) {
                        if (i2 != i3) {
                            identityArrayIntMap.getKeys()[i2] = obj2;
                            identityArrayIntMap.getValues()[i2] = i4;
                        }
                        i2++;
                    }
                }
                int size2 = identityArrayIntMap.getSize();
                for (int i5 = i2; i5 < size2; i5++) {
                    identityArrayIntMap.getKeys()[i5] = null;
                }
                identityArrayIntMap.setSize(i2);
            }
        }

        private final void removeObservation(Object obj, Object obj2) {
            this.valueToScopes.remove(obj2, obj);
            if (!(obj2 instanceof DerivedState) || this.valueToScopes.contains(obj2)) {
                return;
            }
            this.dependencyToDerivedStates.removeScope(obj2);
            this.recordedDerivedStateValues.remove(obj2);
        }

        public final void clear() {
            this.valueToScopes.clear();
            this.scopeToValues.clear();
            this.dependencyToDerivedStates.clear();
            this.recordedDerivedStateValues.clear();
        }

        public final void clearScopeObservations(Object obj) {
            m.h(obj, "scope");
            IdentityArrayIntMap identityArrayIntMapRemove = this.scopeToValues.remove(obj);
            if (identityArrayIntMapRemove == null) {
                return;
            }
            int size = identityArrayIntMapRemove.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = identityArrayIntMapRemove.getKeys()[i2];
                m.f(obj2, "null cannot be cast to non-null type kotlin.Any");
                int i3 = identityArrayIntMapRemove.getValues()[i2];
                removeObservation(obj, obj2);
            }
        }

        public final l<State<?>, j> getDerivedStateEnterObserver() {
            return this.derivedStateEnterObserver;
        }

        public final l<State<?>, j> getDerivedStateExitObserver() {
            return this.derivedStateExitObserver;
        }

        public final l<Object, j> getOnChanged() {
            return this.onChanged;
        }

        public final void notifyInvalidatedScopes() {
            IdentityArraySet<Object> identityArraySet = this.invalidated;
            l<Object, j> lVar = this.onChanged;
            int size = identityArraySet.size();
            for (int i2 = 0; i2 < size; i2++) {
                lVar.invoke(identityArraySet.get(i2));
            }
            this.invalidated.clear();
        }

        public final void observe(Object obj, kj.a<j> aVar) {
            m.h(obj, "scope");
            m.h(aVar, "block");
            Object obj2 = this.currentScope;
            IdentityArrayIntMap identityArrayIntMap = this.currentScopeReads;
            int i2 = this.currentToken;
            this.currentScope = obj;
            this.currentScopeReads = (IdentityArrayIntMap) this.scopeToValues.get(obj);
            if (this.currentToken == -1) {
                this.currentToken = SnapshotKt.currentSnapshot().getId();
            }
            aVar.invoke();
            Object obj3 = this.currentScope;
            m.e(obj3);
            clearObsoleteStateReads(obj3);
            this.currentScope = obj2;
            this.currentScopeReads = identityArrayIntMap;
            this.currentToken = i2;
        }

        public final boolean recordInvalidation(Set<? extends Object> changes) {
            IdentityScopeMap<DerivedState<?>> identityScopeMap;
            int iFind;
            IdentityScopeMap<Object> identityScopeMap2;
            int iFind2;
            m.h(changes, "changes");
            boolean z = false;
            for (Object obj : changes) {
                if (this.dependencyToDerivedStates.contains(obj) && (iFind = (identityScopeMap = this.dependencyToDerivedStates).find(obj)) >= 0) {
                    IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind);
                    int size = identityArraySetScopeSetAt.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        DerivedState derivedState = (DerivedState) identityArraySetScopeSetAt.get(i2);
                        m.f(derivedState, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                        Object obj2 = this.recordedDerivedStateValues.get(derivedState);
                        SnapshotMutationPolicy policy = derivedState.getPolicy();
                        if (policy == null) {
                            policy = SnapshotStateKt.structuralEqualityPolicy();
                        }
                        if (!policy.equivalent(derivedState.getCurrentValue(), obj2) && (iFind2 = (identityScopeMap2 = this.valueToScopes).find(derivedState)) >= 0) {
                            IdentityArraySet identityArraySetScopeSetAt2 = identityScopeMap2.scopeSetAt(iFind2);
                            int size2 = identityArraySetScopeSetAt2.size();
                            int i3 = 0;
                            while (i3 < size2) {
                                this.invalidated.add(identityArraySetScopeSetAt2.get(i3));
                                i3++;
                                z = true;
                            }
                        }
                    }
                }
                IdentityScopeMap<Object> identityScopeMap3 = this.valueToScopes;
                int iFind3 = identityScopeMap3.find(obj);
                if (iFind3 >= 0) {
                    IdentityArraySet identityArraySetScopeSetAt3 = identityScopeMap3.scopeSetAt(iFind3);
                    int size3 = identityArraySetScopeSetAt3.size();
                    int i4 = 0;
                    while (i4 < size3) {
                        this.invalidated.add(identityArraySetScopeSetAt3.get(i4));
                        i4++;
                        z = true;
                    }
                }
            }
            return z;
        }

        public final void recordRead(Object obj) {
            m.h(obj, "value");
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            Object obj2 = this.currentScope;
            m.e(obj2);
            IdentityArrayIntMap identityArrayIntMap = this.currentScopeReads;
            if (identityArrayIntMap == null) {
                identityArrayIntMap = new IdentityArrayIntMap();
                this.currentScopeReads = identityArrayIntMap;
                this.scopeToValues.set(obj2, identityArrayIntMap);
            }
            int iAdd = identityArrayIntMap.add(obj, this.currentToken);
            if ((obj instanceof DerivedState) && iAdd != this.currentToken) {
                DerivedState derivedState = (DerivedState) obj;
                for (Object obj3 : derivedState.getDependencies()) {
                    if (obj3 == null) {
                        break;
                    }
                    this.dependencyToDerivedStates.add(obj3, obj);
                }
                this.recordedDerivedStateValues.put(obj, derivedState.getCurrentValue());
            }
            if (iAdd == -1) {
                this.valueToScopes.add(obj, obj2);
            }
        }

        public final void removeScopeIf(l<Object, Boolean> lVar) {
            m.h(lVar, "predicate");
            IdentityArrayMap<Object, IdentityArrayIntMap> identityArrayMap = this.scopeToValues;
            int size = identityArrayMap.getSize();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = identityArrayMap.getKeys()[i3];
                m.f(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                IdentityArrayIntMap identityArrayIntMap = (IdentityArrayIntMap) identityArrayMap.getValues()[i3];
                Boolean bool = (Boolean) lVar.invoke(obj);
                if (bool.booleanValue()) {
                    int size2 = identityArrayIntMap.getSize();
                    for (int i4 = 0; i4 < size2; i4++) {
                        Object obj2 = identityArrayIntMap.getKeys()[i4];
                        m.f(obj2, "null cannot be cast to non-null type kotlin.Any");
                        int i5 = identityArrayIntMap.getValues()[i4];
                        removeObservation(obj, obj2);
                    }
                }
                if (!bool.booleanValue()) {
                    if (i2 != i3) {
                        identityArrayMap.getKeys()[i2] = obj;
                        identityArrayMap.getValues()[i2] = identityArrayMap.getValues()[i3];
                    }
                    i2++;
                }
            }
            if (identityArrayMap.getSize() > i2) {
                int size3 = identityArrayMap.getSize();
                for (int i6 = i2; i6 < size3; i6++) {
                    identityArrayMap.getKeys()[i6] = null;
                    identityArrayMap.getValues()[i6] = null;
                }
                identityArrayMap.setSize$runtime_release(i2);
            }
        }
    }

    public SnapshotStateObserver(l<? super kj.a<j>, j> lVar) {
        m.h(lVar, "onChangedExecutor");
        this.onChangedExecutor = lVar;
        this.pendingChanges = new AtomicReference<>(null);
        this.applyObserver = new p<Set<? extends Object>, Snapshot, j>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
            {
                super(2);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
                invoke((Set<? extends Object>) obj, (Snapshot) obj2);
                return j.a;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final void invoke(Set<? extends Object> set, Snapshot snapshot) throws KotlinNothingValueException {
                m.h(set, "applied");
                m.h(snapshot, "<anonymous parameter 1>");
                this.this$0.addChanges(set);
                if (this.this$0.drainChanges()) {
                    this.this$0.sendNotifications();
                }
            }
        };
        this.readObserver = new l<Object, j>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m2473invoke(obj);
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2473invoke(Object obj) {
                m.h(obj, "state");
                if (this.this$0.isPaused) {
                    return;
                }
                MutableVector mutableVector = this.this$0.observedScopeMaps;
                SnapshotStateObserver snapshotStateObserver = this.this$0;
                synchronized (mutableVector) {
                    SnapshotStateObserver.ObservedScopeMap observedScopeMap = snapshotStateObserver.currentMap;
                    m.e(observedScopeMap);
                    observedScopeMap.recordRead(obj);
                    j jVar = j.a;
                }
            }
        };
        this.observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void addChanges(Set<? extends Object> set) throws KotlinNothingValueException {
        boolean z;
        List listF1;
        do {
            Object obj = this.pendingChanges.get();
            z = true;
            if (obj == null) {
                listF1 = set;
            } else if (obj instanceof Set) {
                listF1 = f.V((Set) obj, set);
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new KotlinNothingValueException();
                }
                listF1 = y.F1(f.U(set), (Collection) obj);
            }
            AtomicReference<Object> atomicReference = this.pendingChanges;
            while (true) {
                if (atomicReference.compareAndSet(obj, listF1)) {
                    break;
                } else if (atomicReference.get() != obj) {
                    z = false;
                    break;
                }
            }
        } while (!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final boolean drainChanges() throws KotlinNothingValueException {
        boolean z;
        synchronized (this.observedScopeMaps) {
            z = this.sendingNotifications;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<? extends Object> setRemoveChanges = removeChanges();
            if (setRemoveChanges == null) {
                return z2;
            }
            synchronized (this.observedScopeMaps) {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i2 = 0;
                    do {
                        z2 = content[i2].recordInvalidation(setRemoveChanges) || z2;
                        i2++;
                    } while (i2 < size);
                }
                j jVar = j.a;
            }
        }
    }

    private final <T> ObservedScopeMap ensureMap(l<? super T, j> lVar) {
        ObservedScopeMap observedScopeMap;
        MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            ObservedScopeMap[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                observedScopeMap = content[i2];
                if (observedScopeMap.getOnChanged() == lVar) {
                    break;
                }
                i2++;
            } while (i2 < size);
            observedScopeMap = null;
        } else {
            observedScopeMap = null;
        }
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 != null) {
            return observedScopeMap2;
        }
        m.f(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        v.e(1, lVar);
        ObservedScopeMap observedScopeMap3 = new ObservedScopeMap(lVar);
        this.observedScopeMaps.add(observedScopeMap3);
        return observedScopeMap3;
    }

    private final void forEachScopeMap(l<? super ObservedScopeMap, j> lVar) {
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ObservedScopeMap[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    lVar.invoke(content[i2]);
                    i2++;
                } while (i2 < size);
            }
            j jVar = j.a;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final Set<Object> removeChanges() throws KotlinNothingValueException {
        boolean z;
        Set<Object> set;
        do {
            Object obj = this.pendingChanges.get();
            Object objSubList = null;
            if (obj == null) {
                return null;
            }
            z = false;
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new KotlinNothingValueException();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
            AtomicReference<Object> atomicReference = this.pendingChanges;
            while (true) {
                if (atomicReference.compareAndSet(obj, objSubList)) {
                    z = true;
                    break;
                }
                if (atomicReference.get() != obj) {
                    break;
                }
            }
        } while (!z);
        return set;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final Void report() throws KotlinNothingValueException {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNotifications() {
        this.onChangedExecutor.invoke(new kj.a<j>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver.sendNotifications.1
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m2474invoke();
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2474invoke() {
                do {
                    MutableVector mutableVector = SnapshotStateObserver.this.observedScopeMaps;
                    SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
                    synchronized (mutableVector) {
                        if (!snapshotStateObserver.sendingNotifications) {
                            snapshotStateObserver.sendingNotifications = true;
                            try {
                                MutableVector mutableVector2 = snapshotStateObserver.observedScopeMaps;
                                int size = mutableVector2.getSize();
                                if (size > 0) {
                                    Object[] content = mutableVector2.getContent();
                                    int i2 = 0;
                                    do {
                                        ((ObservedScopeMap) content[i2]).notifyInvalidatedScopes();
                                        i2++;
                                    } while (i2 < size);
                                }
                                snapshotStateObserver.sendingNotifications = false;
                            } finally {
                            }
                        }
                        j jVar = j.a;
                    }
                } while (SnapshotStateObserver.this.drainChanges());
            }
        });
    }

    public final void clear(Object obj) {
        m.h(obj, "scope");
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ObservedScopeMap[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    content[i2].clearScopeObservations(obj);
                    i2++;
                } while (i2 < size);
            }
            j jVar = j.a;
        }
    }

    public final void clearIf(l<Object, Boolean> lVar) {
        m.h(lVar, "predicate");
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ObservedScopeMap[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    content[i2].removeScopeIf(lVar);
                    i2++;
                } while (i2 < size);
            }
            j jVar = j.a;
        }
    }

    public final void notifyChanges(Set<? extends Object> set, Snapshot snapshot) {
        m.h(set, "changes");
        m.h(snapshot, "snapshot");
        this.applyObserver.invoke(set, snapshot);
    }

    public final <T> void observeReads(T scope, l<? super T, j> onValueChangedForScope, final kj.a<j> block) {
        ObservedScopeMap observedScopeMapEnsureMap;
        m.h(scope, "scope");
        m.h(onValueChangedForScope, "onValueChangedForScope");
        m.h(block, "block");
        synchronized (this.observedScopeMaps) {
            observedScopeMapEnsureMap = ensureMap(onValueChangedForScope);
        }
        boolean z = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        try {
            this.isPaused = false;
            this.currentMap = observedScopeMapEnsureMap;
            Object obj = observedScopeMapEnsureMap.currentScope;
            IdentityArrayIntMap identityArrayIntMap = observedScopeMapEnsureMap.currentScopeReads;
            int i2 = observedScopeMapEnsureMap.currentToken;
            observedScopeMapEnsureMap.currentScope = scope;
            observedScopeMapEnsureMap.currentScopeReads = (IdentityArrayIntMap) observedScopeMapEnsureMap.scopeToValues.get(scope);
            if (observedScopeMapEnsureMap.currentToken == -1) {
                observedScopeMapEnsureMap.currentToken = SnapshotKt.currentSnapshot().getId();
            }
            SnapshotStateKt.observeDerivedStateRecalculations(observedScopeMapEnsureMap.getDerivedStateEnterObserver(), observedScopeMapEnsureMap.getDerivedStateExitObserver(), new kj.a<j>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$observeReads$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m2472invoke();
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m2472invoke() {
                    Snapshot.INSTANCE.observe(this.this$0.readObserver, null, block);
                }
            });
            Object obj2 = observedScopeMapEnsureMap.currentScope;
            m.e(obj2);
            observedScopeMapEnsureMap.clearObsoleteStateReads(obj2);
            observedScopeMapEnsureMap.currentScope = obj;
            observedScopeMapEnsureMap.currentScopeReads = identityArrayIntMap;
            observedScopeMapEnsureMap.currentToken = i2;
        } finally {
            this.currentMap = observedScopeMap;
            this.isPaused = z;
        }
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.INSTANCE.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    public final void withNoObservations(kj.a<j> aVar) {
        m.h(aVar, "block");
        boolean z = this.isPaused;
        this.isPaused = true;
        try {
            aVar.invoke();
        } finally {
            this.isPaused = z;
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ObservedScopeMap[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    content[i2].clear();
                    i2++;
                } while (i2 < size);
            }
            j jVar = j.a;
        }
    }
}
