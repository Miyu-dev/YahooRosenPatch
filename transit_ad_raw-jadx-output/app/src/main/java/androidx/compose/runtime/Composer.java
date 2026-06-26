package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import dj.e;
import java.util.List;
import kj.p;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\f\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 ~2\u00020\u0001:\u0001~J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0006\u001a\u00020\u0004H'J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H'J\b\u0010\t\u001a\u00020\u0004H'J\b\u0010\n\u001a\u00020\u0004H'J\b\u0010\u000b\u001a\u00020\u0004H'J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH'J\u001e\u0010\u0012\u001a\u00020\u00042\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H'J$\u0010\u0017\u001a\u00020\u00042\u001a\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u0013H'J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H&J\b\u0010\u001b\u001a\u00020\u0004H&J\b\u0010\u001c\u001a\u00020\u0004H'J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH'J\b\u0010 \u001a\u00020\u0004H'J\b\u0010!\u001a\u00020\u0004H'J\b\u0010\"\u001a\u00020\u0004H'J\u001c\u0010&\u001a\u00020\u0004\"\u0004\b\u0000\u0010#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H'J\b\u0010'\u001a\u00020\u0004H'J\b\u0010(\u001a\u00020\u0004H'J\u001a\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H'J\b\u0010*\u001a\u00020\u0004H'J\b\u0010+\u001a\u00020\u0004H'J\b\u0010,\u001a\u00020\u0004H'J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H'J=\u00102\u001a\u00020\u0004\"\u0004\b\u0000\u0010/\"\u0004\b\u0001\u0010#2\u0006\u0010\u0010\u001a\u00028\u00002\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000400H'¢\u0006\u0004\b2\u00103J\u001c\u00106\u001a\u00020\u00012\b\u00104\u001a\u0004\u0018\u00010\u00012\b\u00105\u001a\u0004\u0018\u00010\u0001H'J\n\u00107\u001a\u0004\u0018\u00010\u0001H'J\u0012\u00108\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H'J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H'J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u001dH\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u000209H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020:H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020;H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u0002H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020<H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020=H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020>H\u0017J\u0012\u0010?\u001a\u00020\u001d2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0017J\u0010\u0010B\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@H'J\u0016\u0010D\u001a\u00020\u00042\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00040$H'J#\u0010F\u001a\u00028\u0000\"\u0004\b\u0000\u0010#2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000EH'¢\u0006\u0004\bF\u0010GJ#\u0010K\u001a\u00020\u00042\u0012\u0010J\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030I0HH'¢\u0006\u0004\bK\u0010LJ\b\u0010M\u001a\u00020\u0004H'J\b\u0010N\u001a\u00020\u0004H&J\b\u0010P\u001a\u00020OH'J\b\u0010Q\u001a\u00020\u0004H&R\u001e\u0010W\u001a\u0006\u0012\u0002\b\u00030R8&X§\u0004¢\u0006\f\u0012\u0004\bU\u0010V\u001a\u0004\bS\u0010TR\u001a\u0010[\u001a\u00020\u001d8&X§\u0004¢\u0006\f\u0012\u0004\bZ\u0010V\u001a\u0004\bX\u0010YR\u001a\u0010^\u001a\u00020\u001d8&X§\u0004¢\u0006\f\u0012\u0004\b]\u0010V\u001a\u0004\b\\\u0010YR\u001a\u0010a\u001a\u00020\u001d8&X§\u0004¢\u0006\f\u0012\u0004\b`\u0010V\u001a\u0004\b_\u0010YR\u001c\u0010e\u001a\u0004\u0018\u00010@8&X§\u0004¢\u0006\f\u0012\u0004\bd\u0010V\u001a\u0004\bb\u0010cR\u001c\u0010i\u001a\u0004\u0018\u00010\u00018&X§\u0004¢\u0006\f\u0012\u0004\bh\u0010V\u001a\u0004\bf\u0010gR\u001a\u0010m\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\bl\u0010V\u001a\u0004\bj\u0010kR\u001a\u0010p\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\bo\u0010V\u001a\u0004\bn\u0010kR\u0014\u0010t\u001a\u00020q8&X¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u001a\u0010y\u001a\u00020u8fX§\u0004¢\u0006\f\u0012\u0004\bx\u0010V\u001a\u0004\bv\u0010wR\u0014\u0010}\u001a\u00020z8fX¦\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|\u0082\u0001\u0001\u007fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0080\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/Composer;", "", "", "key", "Lkotlin/j;", "startReplaceableGroup", "endReplaceableGroup", "dataKey", "startMovableGroup", "endMovableGroup", "startDefaults", "endDefaults", "startRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "Landroidx/compose/runtime/MovableContent;", "value", "parameter", "insertMovableContent", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContentReferences", "", "sourceInformation", "sourceInformationMarkerStart", "sourceInformationMarkerEnd", "skipToGroupEnd", "", "changed", "deactivateToEndGroup", "skipCurrentGroup", "startNode", "startReusableNode", "T", "Lkotlin/Function0;", "factory", "createNode", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "marker", "endToMarker", "V", "Lkotlin/Function2;", "block", "apply", "(Ljava/lang/Object;Lkj/p;)V", "left", "right", "joinKey", "rememberedValue", "updateRememberedValue", "", "", "", "", "", "", "changedInstance", "Landroidx/compose/runtime/RecomposeScope;", "scope", "recordUsed", "effect", "recordSideEffect", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "collectParameterInformation", "Landroidx/compose/runtime/CompositionContext;", "buildContext", "disableSourceInformation", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "getApplier$annotations", "()V", "applier", "getInserting", "()Z", "getInserting$annotations", "inserting", "getSkipping", "getSkipping$annotations", "skipping", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope$annotations", "recomposeScope", "getRecomposeScopeIdentity", "()Ljava/lang/Object;", "getRecomposeScopeIdentity$annotations", "recomposeScopeIdentity", "getCompoundKeyHash", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "getCurrentMarker", "getCurrentMarker$annotations", "currentMarker", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Ldj/e;", "getApplyCoroutineContext", "()Ldj/e;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "composition", "Companion", "Landroidx/compose/runtime/ComposerImpl;", "runtime_release"}, k = 1, mv = {1, 8, 0})
public interface Composer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "Landroidx/compose/runtime/CompositionTracer;", "tracer", "Lkotlin/j;", "setTracer", "Empty", "Ljava/lang/Object;", "getEmpty", "()Ljava/lang/Object;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            public String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        public final Object getEmpty() {
            return Empty;
        }

        @InternalComposeTracingApi
        public final void setTracer(CompositionTracer compositionTracer) {
            m.h(compositionTracer, "tracer");
            ComposerKt.compositionTracer = compositionTracer;
        }
    }

    @ComposeCompilerApi
    <V, T> void apply(V value, p<? super T, ? super V, j> block);

    @InternalComposeApi
    CompositionContext buildContext();

    @ComposeCompilerApi
    boolean changed(byte value);

    @ComposeCompilerApi
    boolean changed(char value);

    @ComposeCompilerApi
    boolean changed(double value);

    @ComposeCompilerApi
    boolean changed(float value);

    @ComposeCompilerApi
    boolean changed(int value);

    @ComposeCompilerApi
    boolean changed(long value);

    @ComposeCompilerApi
    boolean changed(Object value);

    @ComposeCompilerApi
    boolean changed(short value);

    @ComposeCompilerApi
    boolean changed(boolean value);

    @ComposeCompilerApi
    boolean changedInstance(Object value);

    void collectParameterInformation();

    @InternalComposeApi
    <T> T consume(CompositionLocal<T> key);

    @ComposeCompilerApi
    <T> void createNode(kj.a<? extends T> aVar);

    @ComposeCompilerApi
    void deactivateToEndGroup(boolean z);

    @ComposeCompilerApi
    void disableReusing();

    void disableSourceInformation();

    @ComposeCompilerApi
    void enableReusing();

    @ComposeCompilerApi
    void endDefaults();

    @ComposeCompilerApi
    void endMovableGroup();

    @ComposeCompilerApi
    void endNode();

    @InternalComposeApi
    void endProviders();

    @ComposeCompilerApi
    void endReplaceableGroup();

    @ComposeCompilerApi
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    @ComposeCompilerApi
    void endToMarker(int i2);

    Applier<?> getApplier();

    e getApplyCoroutineContext();

    ControlledComposition getComposition();

    CompositionData getCompositionData();

    int getCompoundKeyHash();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    RecomposeScope getRecomposeScope();

    Object getRecomposeScopeIdentity();

    boolean getSkipping();

    @InternalComposeApi
    void insertMovableContent(MovableContent<?> movableContent, Object obj);

    @InternalComposeApi
    void insertMovableContentReferences(List<Pair<MovableContentStateReference, MovableContentStateReference>> list);

    @ComposeCompilerApi
    Object joinKey(Object left, Object right);

    @InternalComposeApi
    void recordSideEffect(kj.a<j> aVar);

    @InternalComposeApi
    void recordUsed(RecomposeScope recomposeScope);

    @ComposeCompilerApi
    Object rememberedValue();

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(String str);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int i2, String str);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int i2, Object obj);

    @ComposeCompilerApi
    void startNode();

    @InternalComposeApi
    void startProviders(ProvidedValue<?>[] values);

    @ComposeCompilerApi
    void startReplaceableGroup(int i2);

    @ComposeCompilerApi
    Composer startRestartGroup(int key);

    @ComposeCompilerApi
    void startReusableGroup(int i2, Object obj);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(Object obj);

    @ComposeCompilerApi
    void useNode();
}
