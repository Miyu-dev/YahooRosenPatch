package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import dj.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kj.l;
import kj.p;
import kj.q;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u00002\u00020\u0001:\u0002\u009e\u0001B+\u0012\u0006\u0010W\u001a\u00020V\u0012\n\u0010Y\u001a\u0006\u0012\u0002\b\u00030?\u0012\f\b\u0002\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0080\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\"\u0010\u0006\u001a\u00020\u00032\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ\"\u0010\u000b\u001a\u00020\u00032\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\b\u0010\f\u001a\u00020\u0003H\u0016J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0016\u0010\u0012\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0016\u0010\u0014\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016J$\u0010\u001d\u001a\u00020\u00032\u001a\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a0\u0019H\u0016J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u0003H\u0016J\b\u0010\"\u001a\u00020\u0003H\u0016J\b\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\b\u0010%\u001a\u00020\u0003H\u0016J5\u0010)\u001a\u00028\u0000\"\u0004\b\u0000\u0010&2\b\u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010(\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b)\u0010*J\u0018\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u000eJ\u001f\u00102\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b0\u00101J\u001b\u00106\u001a\u00020\u00032\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u000303H\u0000¢\u0006\u0004\b4\u00105J\b\u00107\u001a\u00020\u0003H\u0002J\b\u00108\u001a\u00020\u0003H\u0002J\u001e\u0010:\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u00109\u001a\u00020\u0011H\u0002J\b\u0010;\u001a\u00020\u0003H\u0002J\u0010\u0010<\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000eH\u0002J6\u0010D\u001a\u00020\u00032,\u0010C\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030?\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00030>j\u0002`B0=H\u0002J>\u0010I\u001a\u00028\u0000\"\u0004\b\u0000\u0010E2&\u0010\u0013\u001a\"\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020+\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010H0G\u0012\u0004\u0012\u00028\u00000FH\u0082\b¢\u0006\u0004\bI\u0010JJ$\u0010K\u001a\u00028\u0000\"\u0004\b\u0000\u0010E2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0082\b¢\u0006\u0004\bK\u0010LJ\b\u0010M\u001a\u00020\u0003H\u0002J\"\u0010P\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010O\u001a\u00020N2\b\u0010-\u001a\u0004\u0018\u00010\u000eH\u0002J\u001c\u0010Q\u001a\u0016\u0012\u0004\u0012\u00020+\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010H0GH\u0002J\u0010\u0010T\u001a\u00020\u00032\u0006\u0010S\u001a\u00020RH\u0002J$\u0010U\u001a\u00028\u0000\"\u0004\b\u0000\u0010E2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0082\b¢\u0006\u0004\bU\u0010LR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0006\u0012\u0002\b\u00030?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR(\u0010]\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e0[j\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e`\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R$\u0010d\u001a\u0012\u0012\u0004\u0012\u00020b0aj\b\u0012\u0004\u0012\u00020b`c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001a\u0010S\u001a\u00020R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020+0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR$\u0010l\u001a\u0012\u0012\u0004\u0012\u00020+0aj\b\u0012\u0004\u0012\u00020+`c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010eR\u001e\u0010m\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003030i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010kR:\u0010C\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030?\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00030>j\u0002`B0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010nR:\u0010o\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030?\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00030>j\u0002`B0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010nR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020+0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010kR*\u0010q\u001a\u0016\u0012\u0004\u0012\u00020+\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010H0G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\"\u0010s\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0018\u0010y\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010{\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001a\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u0083\u0001\u001a\u00020\u00118\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010t\u001a\u0005\b\u0083\u0001\u0010vR\u0018\u0010\u0084\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010tR3\u0010\u0085\u0001\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0005\b\u0089\u0001\u0010\u0007R\u001d\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001d\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008b\u0001R\u001d\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020+0\u00198@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u008b\u0001R\u0015\u0010\u0093\u0001\u001a\u00030\u0080\u00018F¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0094\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010vR\u0016\u0010\u0095\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010vR\u0016\u0010\u0097\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010vR\u0016\u0010\u0099\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010vR\u0016\u0010\u009b\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010v¨\u0006\u009f\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Lkotlin/Function0;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Lkj/p;)V", "", "key", "invalidateGroupsWithKey", "composeContent", "dispose", "", "", "values", "recordModificationsOf", "", "observesAnyOf", "block", "prepareCompose", "value", "recordReadOf", "recordWriteOf", "recompose", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContent", "Landroidx/compose/runtime/MovableContentState;", "state", "disposeUnusedMovableContent", "applyChanges", "applyLateChanges", "changesApplied", "invalidateAll", "verifyConsistent", "R", TypedValues.TransitionType.S_TO, "groupIndex", "delegateInvalidations", "(Landroidx/compose/runtime/ControlledComposition;ILkj/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "Landroidx/compose/runtime/InvalidationResult;", "invalidate", "removeObservation$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V", "removeObservation", "Landroidx/compose/runtime/DerivedState;", "removeDerivedStateObservation$runtime_release", "(Landroidx/compose/runtime/DerivedState;)V", "removeDerivedStateObservation", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "forgetConditionalScopes", "addPendingInvalidationsLocked", "cleanUpDerivedStateObservations", "invalidateScopeOfLocked", "", "Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "Landroidx/compose/runtime/Change;", "changes", "applyChangesInLocked", "T", "Lkotlin/Function1;", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "guardInvalidationsLocked", "(Lkj/l;)Ljava/lang/Object;", "guardChanges", "(Lkj/a;)Ljava/lang/Object;", "abandonChanges", "Landroidx/compose/runtime/Anchor;", "anchor", "invalidateChecked", "takeInvalidations", "Landroidx/compose/runtime/SlotTable;", "slotTable", "validateRecomposeScopeAnchors", "trackAbandonedValues", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/CompositionContext;", "applier", "Landroidx/compose/runtime/Applier;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "lock", "Ljava/lang/Object;", "Ljava/util/HashSet;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/collections/HashSet;", "abandonSet", "Ljava/util/HashSet;", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "observations", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "conditionallyInvalidatedScopes", "derivedStates", "Ljava/util/List;", "lateChanges", "observationsProcessed", "invalidations", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "pendingInvalidScopes", "Z", "getPendingInvalidScopes$runtime_release", "()Z", "setPendingInvalidScopes$runtime_release", "(Z)V", "invalidationDelegate", "Landroidx/compose/runtime/CompositionImpl;", "invalidationDelegateGroup", "I", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "Ldj/e;", "_recomposeContext", "Ldj/e;", "isRoot", "disposed", "composable", "Lkj/p;", "getComposable", "()Lkj/p;", "setComposable", "getObservedObjects$runtime_release", "()Ljava/util/List;", "observedObjects", "getDerivedStateDependencies$runtime_release", "derivedStateDependencies", "getConditionalScopes$runtime_release", "conditionalScopes", "getRecomposeContext", "()Ldj/e;", "recomposeContext", "isComposing", "isDisposed", "getHasPendingChanges", "hasPendingChanges", "getHasInvalidations", "hasInvalidations", "getAreChildrenComposing", "areChildrenComposing", "<init>", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Ldj/e;)V", "RememberEventDispatcher", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class CompositionImpl implements ControlledComposition {
    private final e _recomposeContext;
    private final HashSet<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final List<q<Applier<?>, SlotWriter, RememberManager, j>> changes;
    private p<? super Composer, ? super Integer, j> composable;
    private final ComposerImpl composer;
    private final HashSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;
    private final IdentityScopeMap<DerivedState<?>> derivedStates;
    private boolean disposed;
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;
    private IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidations;
    private final boolean isRoot;
    private final List<q<Applier<?>, SlotWriter, RememberManager, j>> lateChanges;
    private final Object lock;
    private final IdentityScopeMap<RecomposeScopeImpl> observations;
    private final IdentityScopeMap<RecomposeScopeImpl> observationsProcessed;
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    private final AtomicReference<Object> pendingModifications;
    private final SlotTable slotTable;

    /* JADX INFO: compiled from: Composition.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/CompositionImpl$RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "Landroidx/compose/runtime/RememberObserver;", "instance", "Lkotlin/j;", "remembering", "forgetting", "Lkotlin/Function0;", "effect", "sideEffect", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "deactivating", "releasing", "dispatchRememberObservers", "dispatchSideEffects", "dispatchAbandons", "dispatchNodeCallbacks", "", "abandoning", "Ljava/util/Set;", "", "Ljava/util/List;", "sideEffects", "<init>", "(Ljava/util/Set;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class RememberEventDispatcher implements RememberManager {
        private final Set<RememberObserver> abandoning;
        private List<ComposeNodeLifecycleCallback> deactivating;
        private final List<RememberObserver> forgetting;
        private List<ComposeNodeLifecycleCallback> releasing;
        private final List<RememberObserver> remembering;
        private final List<kj.a<j>> sideEffects;

        public RememberEventDispatcher(Set<RememberObserver> set) {
            m.h(set, "abandoning");
            this.abandoning = set;
            this.remembering = new ArrayList();
            this.forgetting = new ArrayList();
            this.sideEffects = new ArrayList();
        }

        @Override // androidx.compose.runtime.RememberManager
        public void deactivating(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
            m.h(composeNodeLifecycleCallback, "instance");
            List arrayList = this.deactivating;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.deactivating = arrayList;
            }
            arrayList.add(composeNodeLifecycleCallback);
        }

        public final void dispatchAbandons() {
            if (!this.abandoning.isEmpty()) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                try {
                    Iterator<RememberObserver> it = this.abandoning.iterator();
                    while (it.hasNext()) {
                        RememberObserver next = it.next();
                        it.remove();
                        next.onAbandoned();
                    }
                    j jVar = j.a;
                } finally {
                    Trace.INSTANCE.endSection(objBeginSection);
                }
            }
        }

        public final void dispatchNodeCallbacks() {
            Object objBeginSection;
            List<ComposeNodeLifecycleCallback> list = this.deactivating;
            List<ComposeNodeLifecycleCallback> list2 = list;
            if (!(list2 == null || list2.isEmpty())) {
                objBeginSection = Trace.INSTANCE.beginSection("Compose:deactivations");
                try {
                    for (int size = list.size() - 1; -1 < size; size--) {
                        list.get(size).onDeactivate();
                    }
                    j jVar = j.a;
                    Trace.INSTANCE.endSection(objBeginSection);
                    list.clear();
                } finally {
                }
            }
            List<ComposeNodeLifecycleCallback> list3 = this.releasing;
            List<ComposeNodeLifecycleCallback> list4 = list3;
            if (list4 == null || list4.isEmpty()) {
                return;
            }
            objBeginSection = Trace.INSTANCE.beginSection("Compose:releases");
            try {
                for (int size2 = list3.size() - 1; -1 < size2; size2--) {
                    list3.get(size2).onRelease();
                }
                j jVar2 = j.a;
                Trace.INSTANCE.endSection(objBeginSection);
                list3.clear();
            } finally {
            }
        }

        public final void dispatchRememberObservers() {
            Object objBeginSection;
            if (!this.forgetting.isEmpty()) {
                objBeginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
                try {
                    for (int size = this.forgetting.size() - 1; -1 < size; size--) {
                        RememberObserver rememberObserver = this.forgetting.get(size);
                        if (!this.abandoning.contains(rememberObserver)) {
                            rememberObserver.onForgotten();
                        }
                    }
                    j jVar = j.a;
                } finally {
                }
            }
            if (!this.remembering.isEmpty()) {
                objBeginSection = Trace.INSTANCE.beginSection("Compose:onRemembered");
                try {
                    List<RememberObserver> list = this.remembering;
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        RememberObserver rememberObserver2 = list.get(i2);
                        this.abandoning.remove(rememberObserver2);
                        rememberObserver2.onRemembered();
                    }
                    j jVar2 = j.a;
                } finally {
                }
            }
        }

        public final void dispatchSideEffects() {
            if (!this.sideEffects.isEmpty()) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
                try {
                    List<kj.a<j>> list = this.sideEffects;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        list.get(i2).invoke();
                    }
                    this.sideEffects.clear();
                    j jVar = j.a;
                } finally {
                    Trace.INSTANCE.endSection(objBeginSection);
                }
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void forgetting(RememberObserver rememberObserver) {
            m.h(rememberObserver, "instance");
            int iLastIndexOf = this.remembering.lastIndexOf(rememberObserver);
            if (iLastIndexOf < 0) {
                this.forgetting.add(rememberObserver);
            } else {
                this.remembering.remove(iLastIndexOf);
                this.abandoning.remove(rememberObserver);
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void releasing(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
            m.h(composeNodeLifecycleCallback, "instance");
            List arrayList = this.releasing;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.releasing = arrayList;
            }
            arrayList.add(composeNodeLifecycleCallback);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void remembering(RememberObserver rememberObserver) {
            m.h(rememberObserver, "instance");
            int iLastIndexOf = this.forgetting.lastIndexOf(rememberObserver);
            if (iLastIndexOf < 0) {
                this.remembering.add(rememberObserver);
            } else {
                this.forgetting.remove(iLastIndexOf);
                this.abandoning.remove(rememberObserver);
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void sideEffect(kj.a<j> aVar) {
            m.h(aVar, "effect");
            this.sideEffects.add(aVar);
        }
    }

    public CompositionImpl(CompositionContext compositionContext, Applier<?> applier, e eVar) {
        m.h(compositionContext, "parent");
        m.h(applier, "applier");
        this.parent = compositionContext;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        HashSet<RememberObserver> hashSet = new HashSet<>();
        this.abandonSet = hashSet;
        SlotTable slotTable = new SlotTable();
        this.slotTable = slotTable;
        this.observations = new IdentityScopeMap<>();
        this.conditionallyInvalidatedScopes = new HashSet<>();
        this.derivedStates = new IdentityScopeMap<>();
        ArrayList arrayList = new ArrayList();
        this.changes = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.lateChanges = arrayList2;
        this.observationsProcessed = new IdentityScopeMap<>();
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, hashSet, arrayList, arrayList2, this);
        compositionContext.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = eVar;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m2399getLambda1$runtime_release();
    }

    private final void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        this.abandonSet.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addPendingInvalidationsLocked(java.util.Set<? extends java.lang.Object> r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.addPendingInvalidationsLocked(java.util.Set, boolean):void");
    }

    private static final void addPendingInvalidationsLocked$invalidate(CompositionImpl compositionImpl, boolean z, Ref.ObjectRef<HashSet<RecomposeScopeImpl>> objectRef, Object obj) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = compositionImpl.observations;
        int iFind = identityScopeMap.find(obj);
        if (iFind >= 0) {
            IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind);
            int size = identityArraySetScopeSetAt.size();
            for (int i2 = 0; i2 < size; i2++) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) identityArraySetScopeSetAt.get(i2);
                if (!compositionImpl.observationsProcessed.remove(obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                    if (!recomposeScopeImpl.isConditional() || z) {
                        HashSet hashSet = (HashSet) objectRef.element;
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            objectRef.element = hashSet;
                        }
                        hashSet.add(recomposeScopeImpl);
                    } else {
                        compositionImpl.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                    }
                }
            }
        }
    }

    private final void applyChangesInLocked(List<q<Applier<?>, SlotWriter, RememberManager, j>> list) {
        boolean zIsEmpty;
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        try {
            if (list.isEmpty()) {
                if (zIsEmpty) {
                    return;
                } else {
                    return;
                }
            }
            Object objBeginSection = Trace.INSTANCE.beginSection("Compose:applyChanges");
            try {
                this.applier.onBeginChanges();
                SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                try {
                    Applier<?> applier = this.applier;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        list.get(i2).invoke(applier, slotWriterOpenWriter, rememberEventDispatcher);
                    }
                    list.clear();
                    j jVar = j.a;
                    slotWriterOpenWriter.close();
                    this.applier.onEndChanges();
                    Trace trace = Trace.INSTANCE;
                    trace.endSection(objBeginSection);
                    rememberEventDispatcher.dispatchRememberObservers();
                    rememberEventDispatcher.dispatchNodeCallbacks();
                    rememberEventDispatcher.dispatchSideEffects();
                    if (this.pendingInvalidScopes) {
                        objBeginSection = trace.beginSection("Compose:unobserve");
                        try {
                            this.pendingInvalidScopes = false;
                            IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
                            int size2 = identityScopeMap.getSize();
                            int i3 = 0;
                            for (int i4 = 0; i4 < size2; i4++) {
                                int i5 = identityScopeMap.getValueOrder()[i4];
                                IdentityArraySet<RecomposeScopeImpl> identityArraySet = identityScopeMap.getScopeSets()[i5];
                                m.e(identityArraySet);
                                int size3 = identityArraySet.size();
                                int i6 = 0;
                                for (int i7 = 0; i7 < size3; i7++) {
                                    Object obj = identityArraySet.getValues()[i7];
                                    m.f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    if (!(!((RecomposeScopeImpl) obj).getValid())) {
                                        if (i6 != i7) {
                                            identityArraySet.getValues()[i6] = obj;
                                        }
                                        i6++;
                                    }
                                }
                                int size4 = identityArraySet.size();
                                for (int i8 = i6; i8 < size4; i8++) {
                                    identityArraySet.getValues()[i8] = null;
                                }
                                identityArraySet.setSize(i6);
                                if (identityArraySet.size() > 0) {
                                    if (i3 != i4) {
                                        int i9 = identityScopeMap.getValueOrder()[i3];
                                        identityScopeMap.getValueOrder()[i3] = i5;
                                        identityScopeMap.getValueOrder()[i4] = i9;
                                    }
                                    i3++;
                                }
                            }
                            int size5 = identityScopeMap.getSize();
                            for (int i10 = i3; i10 < size5; i10++) {
                                identityScopeMap.getValues()[identityScopeMap.getValueOrder()[i10]] = null;
                            }
                            identityScopeMap.setSize(i3);
                            cleanUpDerivedStateObservations();
                            j jVar2 = j.a;
                            Trace.INSTANCE.endSection(objBeginSection);
                        } finally {
                        }
                    }
                    if (this.lateChanges.isEmpty()) {
                        rememberEventDispatcher.dispatchAbandons();
                    }
                } catch (Throwable th) {
                    slotWriterOpenWriter.close();
                    throw th;
                }
            } finally {
            }
        } finally {
            if (this.lateChanges.isEmpty()) {
                rememberEventDispatcher.dispatchAbandons();
            }
        }
    }

    private final void cleanUpDerivedStateObservations() {
        IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
        int size = identityScopeMap.getSize();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = identityScopeMap.getValueOrder()[i3];
            IdentityArraySet<DerivedState<?>> identityArraySet = identityScopeMap.getScopeSets()[i4];
            m.e(identityArraySet);
            int size2 = identityArraySet.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size2; i6++) {
                Object obj = identityArraySet.getValues()[i6];
                m.f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!(!this.observations.contains((DerivedState) obj))) {
                    if (i5 != i6) {
                        identityArraySet.getValues()[i5] = obj;
                    }
                    i5++;
                }
            }
            int size3 = identityArraySet.size();
            for (int i7 = i5; i7 < size3; i7++) {
                identityArraySet.getValues()[i7] = null;
            }
            identityArraySet.setSize(i5);
            if (identityArraySet.size() > 0) {
                if (i2 != i3) {
                    int i8 = identityScopeMap.getValueOrder()[i2];
                    identityScopeMap.getValueOrder()[i2] = i4;
                    identityScopeMap.getValueOrder()[i3] = i8;
                }
                i2++;
            }
        }
        int size4 = identityScopeMap.getSize();
        for (int i9 = i2; i9 < size4; i9++) {
            identityScopeMap.getValues()[identityScopeMap.getValueOrder()[i9]] = null;
        }
        identityScopeMap.setSize(i2);
        Iterator<RecomposeScopeImpl> it = this.conditionallyInvalidatedScopes.iterator();
        m.g(it, "iterator()");
        while (it.hasNext()) {
            if (!it.next().isConditional()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void drainPendingModificationsForCompositionLocked() throws KotlinNothingValueException {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.PendingApplyNoModifications);
        if (andSet != null) {
            if (m.c(andSet, CompositionKt.PendingApplyNoModifications)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, true);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void drainPendingModificationsLocked() throws KotlinNothingValueException {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (m.c(andSet, CompositionKt.PendingApplyNoModifications)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    private final <T> T guardChanges(kj.a<? extends T> block) throws Exception {
        try {
            return (T) block.invoke();
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                throw th;
            } catch (Exception e) {
                abandonChanges();
                throw e;
            }
        }
    }

    private final <T> T guardInvalidationsLocked(l<? super IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>>, ? extends T> block) throws Exception {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMapTakeInvalidations = takeInvalidations();
        try {
            return (T) block.invoke(identityArrayMapTakeInvalidations);
        } catch (Exception e) {
            this.invalidations = identityArrayMapTakeInvalidations;
            throw e;
        }
    }

    private final InvalidationResult invalidateChecked(RecomposeScopeImpl scope, Anchor anchor, Object instance) {
        synchronized (this.lock) {
            CompositionImpl compositionImpl = this.invalidationDelegate;
            if (compositionImpl == null || !this.slotTable.groupContainsAnchor(this.invalidationDelegateGroup, anchor)) {
                compositionImpl = null;
            }
            if (compositionImpl == null) {
                if (isComposing() && this.composer.tryImminentInvalidation$runtime_release(scope, instance)) {
                    return InvalidationResult.IMMINENT;
                }
                if (instance == null) {
                    this.invalidations.set(scope, null);
                } else {
                    CompositionKt.addValue(this.invalidations, scope, instance);
                }
            }
            if (compositionImpl != null) {
                return compositionImpl.invalidateChecked(scope, anchor, instance);
            }
            this.parent.invalidate$runtime_release(this);
            return isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
        }
    }

    private final void invalidateScopeOfLocked(Object obj) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
        int iFind = identityScopeMap.find(obj);
        if (iFind >= 0) {
            IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind);
            int size = identityArraySetScopeSetAt.size();
            for (int i2 = 0; i2 < size; i2++) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) identityArraySetScopeSetAt.get(i2);
                if (recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                    this.observationsProcessed.add(obj, recomposeScopeImpl);
                }
            }
        }
    }

    private final IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations() {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap = this.invalidations;
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        return identityArrayMap;
    }

    private final <T> T trackAbandonedValues(kj.a<? extends T> block) {
        try {
            return (T) block.invoke();
        } catch (Throwable th) {
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            throw th;
        }
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i2);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                throw new IllegalStateException(("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + kotlin.collections.p.J0(slotTable.getSlots(), recomposeScopeImpl2)).toString());
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                j jVar = j.a;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e) {
                    abandonChanges();
                    throw e;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (!this.lateChanges.isEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                j jVar = j.a;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e) {
                    abandonChanges();
                    throw e;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime_release();
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                j jVar = j.a;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e) {
                    abandonChanges();
                    throw e;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(p<? super Composer, ? super Integer, j> content) {
        m.h(content, "content");
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMapTakeInvalidations = takeInvalidations();
                try {
                    this.composer.composeContent$runtime_release(identityArrayMapTakeInvalidations, content);
                    j jVar = j.a;
                } catch (Exception e) {
                    this.invalidations = identityArrayMapTakeInvalidations;
                    throw e;
                }
            }
        } finally {
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(ControlledComposition to, int groupIndex, kj.a<? extends R> block) {
        m.h(block, "block");
        if (to == null || m.c(to, this) || groupIndex < 0) {
            return (R) block.invoke();
        }
        this.invalidationDelegate = (CompositionImpl) to;
        this.invalidationDelegateGroup = groupIndex;
        try {
            return (R) block.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            if (!this.disposed) {
                this.disposed = true;
                this.composable = ComposableSingletons$CompositionKt.INSTANCE.m2400getLambda2$runtime_release();
                List<q<Applier<?>, SlotWriter, RememberManager, j>> deferredChanges$runtime_release = this.composer.getDeferredChanges$runtime_release();
                if (deferredChanges$runtime_release != null) {
                    applyChangesInLocked(deferredChanges$runtime_release);
                }
                boolean z = this.slotTable.getGroupsSize() > 0;
                if (z || (true ^ this.abandonSet.isEmpty())) {
                    RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                    if (z) {
                        SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                        try {
                            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
                            j jVar = j.a;
                            slotWriterOpenWriter.close();
                            this.applier.clear();
                            rememberEventDispatcher.dispatchRememberObservers();
                            rememberEventDispatcher.dispatchNodeCallbacks();
                        } catch (Throwable th) {
                            slotWriterOpenWriter.close();
                            throw th;
                        }
                    }
                    rememberEventDispatcher.dispatchAbandons();
                }
                this.composer.dispose$runtime_release();
            }
            j jVar2 = j.a;
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(MovableContentState movableContentState) throws KotlinNothingValueException {
        m.h(movableContentState, "state");
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter slotWriterOpenWriter = movableContentState.getSlotTable().openWriter();
        try {
            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
            j jVar = j.a;
            slotWriterOpenWriter.close();
            rememberEventDispatcher.dispatchRememberObservers();
            rememberEventDispatcher.dispatchNodeCallbacks();
        } catch (Throwable th) {
            slotWriterOpenWriter.close();
            throw th;
        }
    }

    public final p<Composer, Integer, j> getComposable() {
        return this.composable;
    }

    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return y.X1(this.conditionallyInvalidatedScopes);
    }

    public final List<Object> getDerivedStateDependencies$runtime_release() {
        return kotlin.collections.p.D0(this.derivedStates.getValues());
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            z = this.invalidations.getSize() > 0;
        }
        return z;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    public final List<Object> getObservedObjects$runtime_release() {
        return kotlin.collections.p.D0(this.observations.getValues());
    }

    /* JADX INFO: renamed from: getPendingInvalidScopes$runtime_release, reason: from getter */
    public final boolean getPendingInvalidScopes() {
        return this.pendingInvalidScopes;
    }

    public final e getRecomposeContext() {
        e eVar = this._recomposeContext;
        return eVar == null ? this.parent.getRecomposeCoroutineContext$runtime_release() : eVar;
    }

    /* JADX INFO: renamed from: getSlotTable$runtime_release, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(List<Pair<MovableContentStateReference, MovableContentStateReference>> list) {
        m.h(list, "references");
        int size = list.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = true;
                break;
            } else if (!m.c(((MovableContentStateReference) list.get(i2).getFirst()).getComposition(), this)) {
                break;
            } else {
                i2++;
            }
        }
        ComposerKt.runtimeCheck(z);
        try {
            this.composer.insertMovableContentReferences(list);
            j jVar = j.a;
        } finally {
        }
    }

    public final InvalidationResult invalidate(RecomposeScopeImpl scope, Object instance) {
        m.h(scope, "scope");
        if (scope.getDefaultsInScope()) {
            scope.setDefaultsInvalid(true);
        }
        Anchor anchor = scope.getAnchor();
        return (anchor != null && this.slotTable.ownsAnchor(anchor) && anchor.getValid()) ? !anchor.getValid() ? InvalidationResult.IGNORED : !scope.getCanRecompose() ? InvalidationResult.IGNORED : invalidateChecked(scope, anchor, instance) : InvalidationResult.IGNORED;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            for (Object obj : this.slotTable.getSlots()) {
                RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            j jVar = j.a;
        }
    }

    public final void invalidateGroupsWithKey(int i2) {
        List<RecomposeScopeImpl> listInvalidateGroupsWithKey$runtime_release;
        boolean z;
        synchronized (this.lock) {
            listInvalidateGroupsWithKey$runtime_release = this.slotTable.invalidateGroupsWithKey$runtime_release(i2);
        }
        boolean z2 = true;
        if (listInvalidateGroupsWithKey$runtime_release != null) {
            int size = listInvalidateGroupsWithKey$runtime_release.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                if (listInvalidateGroupsWithKey$runtime_release.get(i3).invalidateForResult(null) == InvalidationResult.IGNORED) {
                    z = true;
                    break;
                }
                i3++;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (z2 && this.composer.forceRecomposeScopes$runtime_release()) {
            this.parent.invalidate$runtime_release(this);
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    /* JADX INFO: renamed from: isDisposed, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    /* JADX INFO: renamed from: isRoot, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean observesAnyOf(Set<? extends Object> values) {
        m.h(values, "values");
        for (Object obj : values) {
            if (this.observations.contains(obj) || this.derivedStates.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(kj.a<j> aVar) {
        m.h(aVar, "block");
        this.composer.prepareCompose$runtime_release(aVar);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean zRecompose$runtime_release;
        synchronized (this.lock) {
            drainPendingModificationsForCompositionLocked();
            try {
                IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMapTakeInvalidations = takeInvalidations();
                try {
                    zRecompose$runtime_release = this.composer.recompose$runtime_release(identityArrayMapTakeInvalidations);
                    if (!zRecompose$runtime_release) {
                        drainPendingModificationsLocked();
                    }
                } catch (Exception e) {
                    this.invalidations = identityArrayMapTakeInvalidations;
                    throw e;
                }
            } finally {
            }
        }
        return zRecompose$runtime_release;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(Set<? extends Object> set) {
        Object obj;
        boolean z;
        Object obj2;
        m.h(set, "values");
        do {
            obj = this.pendingModifications.get();
            z = true;
            if (obj == null ? true : m.c(obj, CompositionKt.PendingApplyNoModifications)) {
                obj2 = set;
            } else if (obj instanceof Set) {
                obj2 = new Set[]{(Set) obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                m.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = set;
                obj2 = objArrCopyOf;
            }
            AtomicReference<Object> atomicReference = this.pendingModifications;
            while (true) {
                if (atomicReference.compareAndSet(obj, obj2)) {
                    break;
                } else if (atomicReference.get() != obj) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                j jVar = j.a;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordReadOf(Object obj) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        m.h(obj, "value");
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        currentRecomposeScope$runtime_release.setUsed(true);
        this.observations.add(obj, currentRecomposeScope$runtime_release);
        if (obj instanceof DerivedState) {
            this.derivedStates.removeScope(obj);
            for (Object obj2 : ((DerivedState) obj).getDependencies()) {
                if (obj2 == null) {
                    break;
                }
                this.derivedStates.add(obj2, obj);
            }
        }
        currentRecomposeScope$runtime_release.recordRead(obj);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(Object obj) {
        m.h(obj, "value");
        synchronized (this.lock) {
            invalidateScopeOfLocked(obj);
            IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
            int iFind = identityScopeMap.find(obj);
            if (iFind >= 0) {
                IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind);
                int size = identityArraySetScopeSetAt.size();
                for (int i2 = 0; i2 < size; i2++) {
                    invalidateScopeOfLocked((DerivedState) identityArraySetScopeSetAt.get(i2));
                }
            }
            j jVar = j.a;
        }
    }

    public final void removeDerivedStateObservation$runtime_release(DerivedState<?> state) {
        m.h(state, "state");
        if (this.observations.contains(state)) {
            return;
        }
        this.derivedStates.removeScope(state);
    }

    public final void removeObservation$runtime_release(Object instance, RecomposeScopeImpl scope) {
        m.h(instance, "instance");
        m.h(scope, "scope");
        this.observations.remove(instance, scope);
    }

    public final void setComposable(p<? super Composer, ? super Integer, j> pVar) {
        m.h(pVar, "<set-?>");
        this.composable = pVar;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(p<? super Composer, ? super Integer, j> content) {
        m.h(content, "content");
        if (!(!this.disposed)) {
            throw new IllegalStateException("The composition is disposed".toString());
        }
        this.composable = content;
        this.parent.composeInitial$runtime_release(this, content);
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z) {
        this.pendingInvalidScopes = z;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            if (!isComposing()) {
                this.composer.verifyConsistent$runtime_release();
                this.slotTable.verifyWellFormed();
                validateRecomposeScopeAnchors(this.slotTable);
            }
            j jVar = j.a;
        }
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, e eVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i2 & 4) != 0 ? null : eVar);
    }
}
