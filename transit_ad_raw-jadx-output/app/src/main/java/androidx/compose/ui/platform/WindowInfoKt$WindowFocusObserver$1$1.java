package androidx.compose.ui.platform;

import androidx.appcompat.R;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: WindowInfo.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@ej.c(c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", f = "WindowInfo.kt", l = {R.styleable.AppCompatTheme_colorPrimaryDark}, m = "invokeSuspend")
public final class WindowInfoKt$WindowFocusObserver$1$1 extends SuspendLambda implements kj.p<CoroutineScope, dj.c<? super kotlin.j>, Object> {
    final /* synthetic */ State<kj.l<Boolean, kotlin.j>> $callback;
    final /* synthetic */ WindowInfo $windowInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoKt$WindowFocusObserver$1$1(WindowInfo windowInfo, State<? extends kj.l<? super Boolean, kotlin.j>> state, dj.c<? super WindowInfoKt$WindowFocusObserver$1$1> cVar) {
        super(2, cVar);
        this.$windowInfo = windowInfo;
        this.$callback = state;
    }

    public final dj.c<kotlin.j> create(Object obj, dj.c<?> cVar) {
        return new WindowInfoKt$WindowFocusObserver$1$1(this.$windowInfo, this.$callback, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            li.c.O(obj);
            final WindowInfo windowInfo = this.$windowInfo;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new kj.a<Boolean>() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final Boolean m4620invoke() {
                    return Boolean.valueOf(windowInfo.isWindowFocused());
                }
            });
            final State<kj.l<Boolean, kotlin.j>> state = this.$callback;
            FlowCollector<Boolean> flowCollector = new FlowCollector<Boolean>() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.2
                public /* bridge */ /* synthetic */ Object emit(Object obj2, dj.c cVar) {
                    return emit(((Boolean) obj2).booleanValue(), (dj.c<? super kotlin.j>) cVar);
                }

                public final Object emit(boolean z, dj.c<? super kotlin.j> cVar) {
                    state.getValue().invoke(Boolean.valueOf(z));
                    return kotlin.j.a;
                }
            };
            this.label = 1;
            if (flowSnapshotFlow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
        }
        return kotlin.j.a;
    }

    public final Object invoke(CoroutineScope coroutineScope, dj.c<? super kotlin.j> cVar) {
        return create(coroutineScope, cVar).invokeSuspend(kotlin.j.a);
    }
}
