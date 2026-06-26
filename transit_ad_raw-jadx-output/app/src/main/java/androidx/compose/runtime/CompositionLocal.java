package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H!¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0012\u001a\u00028\u00008Ç\u0002¢\u0006\f\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/CompositionLocal;", "T", "", "value", "Landroidx/compose/runtime/State;", "provided$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "provided", "Landroidx/compose/runtime/LazyValueHolder;", "defaultValueHolder", "Landroidx/compose/runtime/LazyValueHolder;", "getDefaultValueHolder$runtime_release", "()Landroidx/compose/runtime/LazyValueHolder;", "getDefaultValueHolder$runtime_release$annotations", "()V", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "getCurrent$annotations", "current", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkj/a;)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, k = 1, mv = {1, 8, 0})
public abstract class CompositionLocal<T> {
    public static final int $stable = 0;
    private final LazyValueHolder<T> defaultValueHolder;

    public /* synthetic */ CompositionLocal(kj.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Composable
    @ReadOnlyComposable
    public final T getCurrent(Composer composer, int i2) {
        return (T) composer.consume(this);
    }

    public final LazyValueHolder<T> getDefaultValueHolder$runtime_release() {
        return this.defaultValueHolder;
    }

    @Composable
    public abstract State<T> provided$runtime_release(T t, Composer composer, int i2);

    private CompositionLocal(kj.a<? extends T> aVar) {
        this.defaultValueHolder = new LazyValueHolder<>(aVar);
    }

    public static /* synthetic */ void getCurrent$annotations() {
    }

    public static /* synthetic */ void getDefaultValueHolder$runtime_release$annotations() {
    }
}
