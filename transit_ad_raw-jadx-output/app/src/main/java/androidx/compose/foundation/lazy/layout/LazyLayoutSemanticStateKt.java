package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.semantics.CollectionInfo;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyLayoutSemanticState.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"LazyLayoutSemanticState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "isVertical", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LazyLayoutSemanticStateKt {
    public static final LazyLayoutSemanticState LazyLayoutSemanticState(final LazyListState lazyListState, final boolean z) {
        m.h(lazyListState, "state");
        return new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticStateKt.LazyLayoutSemanticState.1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public Object animateScrollBy(float f, dj.c<? super j> cVar) {
                Object objAnimateScrollBy$default = ScrollExtensionsKt.animateScrollBy$default(lazyListState, f, null, cVar, 2, null);
                return objAnimateScrollBy$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateScrollBy$default : j.a;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public CollectionInfo collectionInfo() {
                return z ? new CollectionInfo(-1, 1) : new CollectionInfo(1, -1);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public boolean getCanScrollForward() {
                return lazyListState.getCanScrollForward();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getCurrentPosition() {
                return (lazyListState.getFirstVisibleItemScrollOffset() / 100000.0f) + lazyListState.getFirstVisibleItemIndex();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public Object scrollToItem(int i2, dj.c<? super j> cVar) {
                Object objScrollToItem$default = LazyListState.scrollToItem$default(lazyListState, i2, 0, cVar, 2, null);
                return objScrollToItem$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objScrollToItem$default : j.a;
            }
        };
    }
}
