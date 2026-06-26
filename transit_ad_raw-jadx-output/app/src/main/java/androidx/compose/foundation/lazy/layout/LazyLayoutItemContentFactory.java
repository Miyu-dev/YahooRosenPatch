package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001J(\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0014R\u00020\u00000\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "", "key", "getContentType", "", "index", "Lkotlin/Function0;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "getContent", "(ILjava/lang/Object;)Lkj/p;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "Lkj/a;", "getItemProvider", "()Lkj/a;", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "lambdasCache", "Ljava/util/Map;", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkj/a;)V", "CachedItemContent", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyLayoutItemContentFactory {
    private final kj.a<LazyLayoutItemProvider> itemProvider;
    private final Map<Object, CachedItemContent> lambdasCache;
    private final SaveableStateHolder saveableStateHolder;

    /* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR+\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R#\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00048F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "", "Lkotlin/Function0;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "createContentLambda", "()Lkj/p;", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "type", "getType", "", "<set-?>", "lastKnownIndex$delegate", "Landroidx/compose/runtime/MutableState;", "getLastKnownIndex", "()I", "setLastKnownIndex", "(I)V", "lastKnownIndex", "_content", "Lkj/p;", "getContent", "content", "initialIndex", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;ILjava/lang/Object;Ljava/lang/Object;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public final class CachedItemContent {
        private p<? super Composer, ? super Integer, j> _content;
        private final Object key;

        /* JADX INFO: renamed from: lastKnownIndex$delegate, reason: from kotlin metadata */
        private final MutableState lastKnownIndex;
        final /* synthetic */ LazyLayoutItemContentFactory this$0;
        private final Object type;

        public CachedItemContent(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, int i2, Object obj, Object obj2) {
            m.h(obj, "key");
            this.this$0 = lazyLayoutItemContentFactory;
            this.key = obj;
            this.type = obj2;
            this.lastKnownIndex = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i2), null, 2, null);
        }

        private final p<Composer, Integer, j> createContentLambda() {
            final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = this.this$0;
            return ComposableLambdaKt.composableLambdaInstance(1403994769, true, new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return j.a;
                }

                @Composable
                public final void invoke(Composer composer, int i2) {
                    final int lastKnownIndex;
                    if ((i2 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1403994769, i2, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:89)");
                    }
                    final LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) lazyLayoutItemContentFactory.getItemProvider().invoke();
                    Integer num = lazyLayoutItemProvider.getKeyToIndexMap().get(this.getKey());
                    if (num != null) {
                        this.setLastKnownIndex(num.intValue());
                        lastKnownIndex = num.intValue();
                    } else {
                        lastKnownIndex = this.getLastKnownIndex();
                    }
                    composer.startReplaceableGroup(-715770513);
                    if (lastKnownIndex < lazyLayoutItemProvider.getItemCount()) {
                        Object key = lazyLayoutItemProvider.getKey(lastKnownIndex);
                        if (m.c(key, this.getKey())) {
                            lazyLayoutItemContentFactory.saveableStateHolder.SaveableStateProvider(key, ComposableLambdaKt.composableLambda(composer, -1238863364, true, new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return j.a;
                                }

                                @Composable
                                public final void invoke(Composer composer2, int i3) {
                                    if ((i3 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1238863364, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous>.<anonymous> (LazyLayoutItemContentFactory.kt:97)");
                                    }
                                    lazyLayoutItemProvider.Item(lastKnownIndex, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer, 568);
                        }
                    }
                    composer.endReplaceableGroup();
                    Object key2 = this.getKey();
                    final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this;
                    EffectsKt.DisposableEffect(key2, new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1.2
                        {
                            super(1);
                        }

                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            m.h(disposableEffectScope, "$this$DisposableEffect");
                            final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent2 = cachedItemContent;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    cachedItemContent2._content = null;
                                }
                            };
                        }
                    }, composer, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setLastKnownIndex(int i2) {
            this.lastKnownIndex.setValue(Integer.valueOf(i2));
        }

        public final p<Composer, Integer, j> getContent() {
            p pVar = this._content;
            if (pVar != null) {
                return pVar;
            }
            p<Composer, Integer, j> pVarCreateContentLambda = createContentLambda();
            this._content = pVarCreateContentLambda;
            return pVarCreateContentLambda;
        }

        public final Object getKey() {
            return this.key;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int getLastKnownIndex() {
            return ((Number) this.lastKnownIndex.getValue()).intValue();
        }

        public final Object getType() {
            return this.type;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutItemContentFactory(SaveableStateHolder saveableStateHolder, kj.a<? extends LazyLayoutItemProvider> aVar) {
        m.h(saveableStateHolder, "saveableStateHolder");
        m.h(aVar, "itemProvider");
        this.saveableStateHolder = saveableStateHolder;
        this.itemProvider = aVar;
        this.lambdasCache = new LinkedHashMap();
    }

    public final p<Composer, Integer, j> getContent(int index, Object key) {
        m.h(key, "key");
        CachedItemContent cachedItemContent = this.lambdasCache.get(key);
        Object contentType = ((LazyLayoutItemProvider) this.itemProvider.invoke()).getContentType(index);
        if (cachedItemContent != null && cachedItemContent.getLastKnownIndex() == index && m.c(cachedItemContent.getType(), contentType)) {
            return cachedItemContent.getContent();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(this, index, key, contentType);
        this.lambdasCache.put(key, cachedItemContent2);
        return cachedItemContent2.getContent();
    }

    public final Object getContentType(Object key) {
        CachedItemContent cachedItemContent = this.lambdasCache.get(key);
        if (cachedItemContent != null) {
            return cachedItemContent.getType();
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.itemProvider.invoke();
        Integer num = lazyLayoutItemProvider.getKeyToIndexMap().get(key);
        if (num != null) {
            return lazyLayoutItemProvider.getContentType(num.intValue());
        }
        return null;
    }

    public final kj.a<LazyLayoutItemProvider> getItemProvider() {
        return this.itemProvider;
    }
}
