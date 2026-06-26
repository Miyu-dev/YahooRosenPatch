package androidx.compose.foundation.lazy.grid;

import androidx.appcompat.R;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyGridItemProvider.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LazyGridItemProviderKt$rememberLazyGridItemProvider$1$1 implements LazyGridItemProvider, LazyLayoutItemProvider {
    private final /* synthetic */ LazyLayoutItemProvider $$delegate_0;
    final /* synthetic */ State<LazyGridItemProvider> $itemProviderState;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridItemProviderKt$rememberLazyGridItemProvider$1$1(State<? extends LazyGridItemProvider> state) {
        this.$itemProviderState = state;
        this.$$delegate_0 = LazyLayoutItemProviderKt.DelegatingLazyLayoutItemProvider(state);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(int i2, Composer composer, int i3) {
        composer.startReplaceableGroup(125380152);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(125380152, i3, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProvider.<anonymous>.<no name provided>.Item (LazyGridItemProvider.kt:-1)");
        }
        this.$$delegate_0.Item(i2, composer, i3 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getContentType(int i2) {
        return this.$$delegate_0.getContentType(i2);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public boolean getHasCustomSpans() {
        return this.$itemProviderState.getValue().getHasCustomSpans();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.$$delegate_0.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int i2) {
        return this.$$delegate_0.getKey(i2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Map<Object, Integer> getKeyToIndexMap() {
        return this.$$delegate_0.getKeyToIndexMap();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    /* JADX INFO: renamed from: getSpan-_-orMbw */
    public long mo629getSpan_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
        m.h(lazyGridItemSpanScope, "$this$getSpan");
        return this.$itemProviderState.getValue().mo629getSpan_orMbw(lazyGridItemSpanScope, i2);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.$itemProviderState.getValue().getSpanLayoutProvider();
    }
}
