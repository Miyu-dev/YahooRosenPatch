package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.HashMap;
import java.util.Map;
import kj.l;
import kj.p;
import kj.r;
import kotlin.Metadata;
import kotlin.collections.a0;
import kotlin.j;
import kotlin.jvm.internal.m;
import qj.d;
import qj.f;

/* JADX INFO: compiled from: LazyLayoutItemProvider.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003BB\u0012#\u0010\u0019\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u0018\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010(\u001a\u00020\u000b¢\u0006\u0004\b)\u0010*J8\u0010\t\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0082\b¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0003J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R4\u0010\u0019\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyLayoutItemsProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "IntervalContent", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "T", "", "index", "Lkotlin/Function2;", "block", "withLocalIntervalIndex", "(ILkj/p;)Ljava/lang/Object;", "Lqj/f;", "range", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "list", "", "", "generateKeyToIndexMap", "Lkotlin/j;", "Item", "(ILandroidx/compose/runtime/Composer;I)V", "getKey", "getContentType", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "Landroidx/compose/runtime/Composable;", "itemContentProvider", "Lkj/r;", "getItemContentProvider", "()Lkj/r;", "intervals", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;", "keyToIndexMap", "Ljava/util/Map;", "getKeyToIndexMap", "()Ljava/util/Map;", "getItemCount", "()I", "itemCount", "nearestItemsRange", "<init>", "(Lkj/r;Landroidx/compose/foundation/lazy/layout/IntervalList;Lqj/f;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class DefaultLazyLayoutItemsProvider<IntervalContent extends LazyLayoutIntervalContent> implements LazyLayoutItemProvider {
    private final IntervalList<IntervalContent> intervals;
    private final r<IntervalList.Interval<? extends IntervalContent>, Integer, Composer, Integer, j> itemContentProvider;
    private final Map<Object, Integer> keyToIndexMap;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultLazyLayoutItemsProvider(r<? super IntervalList.Interval<? extends IntervalContent>, ? super Integer, ? super Composer, ? super Integer, j> rVar, IntervalList<? extends IntervalContent> intervalList, f fVar) {
        m.h(rVar, "itemContentProvider");
        m.h(intervalList, "intervals");
        m.h(fVar, "nearestItemsRange");
        this.itemContentProvider = rVar;
        this.intervals = intervalList;
        this.keyToIndexMap = generateKeyToIndexMap(fVar, intervalList);
    }

    @ExperimentalFoundationApi
    private final Map<Object, Integer> generateKeyToIndexMap(f range, IntervalList<? extends LazyLayoutIntervalContent> list) {
        final int i2 = ((d) range).a;
        if (!(i2 >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        final int iMin = Math.min(((d) range).b, list.getSize() - 1);
        if (iMin < i2) {
            return a0.a;
        }
        final HashMap map = new HashMap();
        list.forEach(i2, iMin, new l<IntervalList.Interval<? extends LazyLayoutIntervalContent>, j>() { // from class: androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider$generateKeyToIndexMap$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((IntervalList.Interval<? extends LazyLayoutIntervalContent>) obj);
                return j.a;
            }

            public final void invoke(IntervalList.Interval<? extends LazyLayoutIntervalContent> interval) {
                m.h(interval, "it");
                if (interval.getValue().getKey() == null) {
                    return;
                }
                l<Integer, Object> key = interval.getValue().getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                int iMax = Math.max(i2, interval.getStartIndex());
                int iMin2 = Math.min(iMin, (interval.getSize() + interval.getStartIndex()) - 1);
                if (iMax > iMin2) {
                    return;
                }
                while (true) {
                    map.put(key.invoke(Integer.valueOf(iMax - interval.getStartIndex())), Integer.valueOf(iMax));
                    if (iMax == iMin2) {
                        return;
                    } else {
                        iMax++;
                    }
                }
            }
        });
        return map;
    }

    private final <T> T withLocalIntervalIndex(int index, p<? super Integer, ? super IntervalContent, ? extends T> block) {
        IntervalList.Interval<IntervalContent> interval = this.intervals.get(index);
        return (T) block.invoke(Integer.valueOf(index - interval.getStartIndex()), interval.getValue());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(final int i2, Composer composer, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1877726744);
        if ((i3 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i4 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1877726744, i4, -1, "androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider.Item (LazyLayoutItemProvider.kt:116)");
            }
            this.itemContentProvider.invoke(this.intervals.get(i2), Integer.valueOf(i2), composerStartRestartGroup, Integer.valueOf((i4 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>(this) { // from class: androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider.Item.1
            final /* synthetic */ DefaultLazyLayoutItemsProvider<IntervalContent> $tmp0_rcvr;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.$tmp0_rcvr = this;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i5) {
                this.$tmp0_rcvr.Item(i2, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
            }
        });
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getContentType(int index) {
        IntervalList.Interval<IntervalContent> interval = this.intervals.get(index);
        return interval.getValue().getType().invoke(Integer.valueOf(index - interval.getStartIndex()));
    }

    public final IntervalList<IntervalContent> getIntervals() {
        return this.intervals;
    }

    public final r<IntervalList.Interval<? extends IntervalContent>, Integer, Composer, Integer, j> getItemContentProvider() {
        return this.itemContentProvider;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervals.getSize();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int index) {
        Object objInvoke;
        IntervalList.Interval<IntervalContent> interval = this.intervals.get(index);
        int startIndex = index - interval.getStartIndex();
        l<Integer, Object> key = interval.getValue().getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(startIndex))) == null) ? Lazy_androidKt.getDefaultLazyLayoutKey(index) : objInvoke;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Map<Object, Integer> getKeyToIndexMap() {
        return this.keyToIndexMap;
    }
}
