package androidx.compose.ui.text.input;

import androidx.appcompat.widget.s;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.text.InternalTextApi;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.NonCancellable;

/* JADX INFO: compiled from: PlatformTextInputAdapter.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001f !B%\u0012\u001c\u0010\u0010\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J*\u0010\t\u001a\f\u0012\u0004\u0012\u00028\u00000\bR\u00020\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002J'\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0007R*\u0010\u0010\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R,\u0010\u0013\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\f\u0012\n\u0012\u0002\b\u00030\bR\u00020\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistry;", "Lkotlin/j;", "disposeTombstonedAdapters", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "T", "Landroidx/compose/ui/text/input/PlatformTextInputPlugin;", "plugin", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount;", "instantiateAdapter", "rememberAdapter", "(Landroidx/compose/ui/text/input/PlatformTextInputPlugin;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle;", "getOrCreateAdapter", "Lkotlin/Function2;", "Landroidx/compose/ui/text/input/PlatformTextInput;", "factory", "Lkj/p;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "adaptersByPlugin", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "adaptersMayNeedDisposal", "Z", "focusedPlugin", "Landroidx/compose/ui/text/input/PlatformTextInputPlugin;", "getFocusedAdapter", "()Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "focusedAdapter", "<init>", "(Lkj/p;)V", "AdapterHandle", "AdapterInput", "AdapterWithRefCount", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@InternalTextApi
public final class PlatformTextInputPluginRegistryImpl implements PlatformTextInputPluginRegistry {
    public static final int $stable = 0;
    private final SnapshotStateMap<PlatformTextInputPlugin<?>, AdapterWithRefCount<?>> adaptersByPlugin;
    private boolean adaptersMayNeedDisposal;
    private final p<PlatformTextInputPlugin<?>, PlatformTextInput, PlatformTextInputAdapter> factory;
    private PlatformTextInputPlugin<?> focusedPlugin;

    /* JADX INFO: compiled from: PlatformTextInputAdapter.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\u0006\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle;", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "T", "", "", "dispose", "adapter", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "getAdapter", "()Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "Lkotlin/Function0;", "onDispose", "Lkj/a;", "disposed", "Z", "<init>", "(Landroidx/compose/ui/text/input/PlatformTextInputAdapter;Lkj/a;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    @InternalTextApi
    public static final class AdapterHandle<T extends PlatformTextInputAdapter> {
        public static final int $stable = 8;
        private final T adapter;
        private boolean disposed;
        private final kj.a<Boolean> onDispose;

        public AdapterHandle(T t, kj.a<Boolean> aVar) {
            m.h(t, "adapter");
            m.h(aVar, "onDispose");
            this.adapter = t;
            this.onDispose = aVar;
        }

        public final boolean dispose() {
            if (!(!this.disposed)) {
                throw new IllegalStateException("AdapterHandle already disposed".toString());
            }
            this.disposed = true;
            return ((Boolean) this.onDispose.invoke()).booleanValue();
        }

        public final T getAdapter() {
            return this.adapter;
        }
    }

    /* JADX INFO: compiled from: PlatformTextInputAdapter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0018\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterInput;", "Landroidx/compose/ui/text/input/PlatformTextInput;", "Lkotlin/j;", "requestInputFocus", "releaseInputFocus", "Landroidx/compose/ui/text/input/PlatformTextInputPlugin;", "plugin", "Landroidx/compose/ui/text/input/PlatformTextInputPlugin;", "<init>", "(Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;Landroidx/compose/ui/text/input/PlatformTextInputPlugin;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    public final class AdapterInput implements PlatformTextInput {
        private final PlatformTextInputPlugin<?> plugin;
        final /* synthetic */ PlatformTextInputPluginRegistryImpl this$0;

        public AdapterInput(PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl, PlatformTextInputPlugin<?> platformTextInputPlugin) {
            m.h(platformTextInputPlugin, "plugin");
            this.this$0 = platformTextInputPluginRegistryImpl;
            this.plugin = platformTextInputPlugin;
        }

        @Override // androidx.compose.ui.text.input.PlatformTextInput
        public void releaseInputFocus() {
            if (m.c(this.this$0.focusedPlugin, this.plugin)) {
                this.this$0.focusedPlugin = null;
            }
        }

        @Override // androidx.compose.ui.text.input.PlatformTextInput
        public void requestInputFocus() {
            this.this$0.focusedPlugin = this.plugin;
        }
    }

    /* JADX INFO: compiled from: PlatformTextInputAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0082\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006R\u0017\u0010\b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR+\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount;", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "T", "", "Lkotlin/j;", "incrementRefCount", "", "decrementRefCount", "adapter", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "getAdapter", "()Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "", "<set-?>", "refCount$delegate", "Landroidx/compose/runtime/MutableState;", "getRefCount", "()I", "setRefCount", "(I)V", "refCount", "isRefCountZero", "()Z", "<init>", "(Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;Landroidx/compose/ui/text/input/PlatformTextInputAdapter;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    public final class AdapterWithRefCount<T extends PlatformTextInputAdapter> {
        private final T adapter;

        /* JADX INFO: renamed from: refCount$delegate, reason: from kotlin metadata */
        private final MutableState refCount;
        final /* synthetic */ PlatformTextInputPluginRegistryImpl this$0;

        public AdapterWithRefCount(PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl, T t) {
            m.h(t, "adapter");
            this.this$0 = platformTextInputPluginRegistryImpl;
            this.adapter = t;
            this.refCount = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final int getRefCount() {
            return ((Number) this.refCount.getValue()).intValue();
        }

        private final void setRefCount(int i2) {
            this.refCount.setValue(Integer.valueOf(i2));
        }

        public final boolean decrementRefCount() {
            setRefCount(getRefCount() - 1);
            if (!(getRefCount() >= 0)) {
                throw new IllegalStateException(android.support.v4.media.a.f(new StringBuilder("AdapterWithRefCount.decrementRefCount called too many times (refCount="), getRefCount(), ')').toString());
            }
            if (getRefCount() != 0) {
                return false;
            }
            this.this$0.adaptersMayNeedDisposal = true;
            return true;
        }

        public final T getAdapter() {
            return this.adapter;
        }

        public final void incrementRefCount() {
            setRefCount(getRefCount() + 1);
        }

        public final boolean isRefCountZero() {
            return getRefCount() == 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformTextInputPluginRegistryImpl(p<? super PlatformTextInputPlugin<?>, ? super PlatformTextInput, ? extends PlatformTextInputAdapter> pVar) {
        m.h(pVar, "factory");
        this.factory = pVar;
        this.adaptersByPlugin = SnapshotStateKt.mutableStateMapOf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeTombstonedAdapters() {
        if (this.adaptersMayNeedDisposal) {
            this.adaptersMayNeedDisposal = false;
            Set<Map.Entry<PlatformTextInputPlugin<?>, AdapterWithRefCount<?>>> setEntrySet = this.adaptersByPlugin.entrySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                if (((AdapterWithRefCount) ((Map.Entry) obj).getValue()).isRefCountZero()) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i2);
                PlatformTextInputPlugin platformTextInputPlugin = (PlatformTextInputPlugin) entry.getKey();
                AdapterWithRefCount adapterWithRefCount = (AdapterWithRefCount) entry.getValue();
                if (m.c(this.focusedPlugin, platformTextInputPlugin)) {
                    this.focusedPlugin = null;
                }
                this.adaptersByPlugin.remove(platformTextInputPlugin);
                PlatformTextInputAdapter_androidKt.dispose(adapterWithRefCount.getAdapter());
            }
        }
    }

    private final <T extends PlatformTextInputAdapter> AdapterWithRefCount<T> instantiateAdapter(PlatformTextInputPlugin<T> plugin) {
        Object objInvoke = this.factory.invoke(plugin, new AdapterInput(this, plugin));
        m.f(objInvoke, "null cannot be cast to non-null type T of androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.instantiateAdapter");
        AdapterWithRefCount<T> adapterWithRefCount = new AdapterWithRefCount<>(this, (PlatformTextInputAdapter) objInvoke);
        this.adaptersByPlugin.put(plugin, adapterWithRefCount);
        return adapterWithRefCount;
    }

    public final PlatformTextInputAdapter getFocusedAdapter() {
        AdapterWithRefCount<?> adapterWithRefCount = this.adaptersByPlugin.get(this.focusedPlugin);
        if (adapterWithRefCount != null) {
            return adapterWithRefCount.getAdapter();
        }
        return null;
    }

    @InternalTextApi
    public final <T extends PlatformTextInputAdapter> AdapterHandle<T> getOrCreateAdapter(PlatformTextInputPlugin<T> plugin) {
        m.h(plugin, "plugin");
        final AdapterWithRefCount<T> adapterWithRefCountInstantiateAdapter = (AdapterWithRefCount) this.adaptersByPlugin.get(plugin);
        if (adapterWithRefCountInstantiateAdapter == null) {
            adapterWithRefCountInstantiateAdapter = instantiateAdapter(plugin);
        }
        adapterWithRefCountInstantiateAdapter.incrementRefCount();
        return new AdapterHandle<>(adapterWithRefCountInstantiateAdapter.getAdapter(), new kj.a<Boolean>() { // from class: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.getOrCreateAdapter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Boolean m5014invoke() {
                return Boolean.valueOf(adapterWithRefCountInstantiateAdapter.decrementRefCount());
            }
        });
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputPluginRegistry
    @Composable
    public <T extends PlatformTextInputAdapter> T rememberAdapter(PlatformTextInputPlugin<T> platformTextInputPlugin, Composer composer, int i2) {
        m.h(platformTextInputPlugin, "plugin");
        composer.startReplaceableGroup(-845039128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-845039128, i2, -1, "androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter (PlatformTextInputAdapter.kt:161)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(platformTextInputPlugin);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = getOrCreateAdapter(platformTextInputPlugin);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final AdapterHandle adapterHandle = (AdapterHandle) objRememberedValue;
        Object objD = s.d(composer, 773894976, -492369756);
        if (objD == Composer.INSTANCE.getEmpty()) {
            objD = androidx.appcompat.view.menu.a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
        }
        composer.endReplaceableGroup();
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objD).getCoroutineScope();
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(adapterHandle, new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                m.h(disposableEffectScope, "$this$DisposableEffect");
                final AdapterHandle<T> adapterHandle2 = adapterHandle;
                final CoroutineScope coroutineScope2 = coroutineScope;
                final PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl = this;
                return new DisposableEffectResult() { // from class: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        if (adapterHandle2.dispose()) {
                            BuildersKt.launch$default(coroutineScope2, NonCancellable.INSTANCE, (CoroutineStart) null, new PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1(platformTextInputPluginRegistryImpl, null), 2, (Object) null);
                        }
                    }
                };
            }
        }, composer, 8);
        T t = (T) adapterHandle.getAdapter();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return t;
    }
}
