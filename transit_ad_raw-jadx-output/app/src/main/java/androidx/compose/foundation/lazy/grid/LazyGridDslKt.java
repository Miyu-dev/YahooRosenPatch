package androidx.compose.foundation.lazy.grid;

import androidx.appcompat.R;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kj.l;
import kj.p;
import kj.q;
import kj.r;
import kj.s;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a{\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a{\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aB\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001a2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001aB\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001a2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a&\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u001eH\u0002\u001a\u009d\u0001\u0010(\u001a\u00020\u0013\"\u0004\b\u0000\u0010'*\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0016\b\n\u0010*\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020)\u0018\u00010\u00112\u001c\b\n\u0010-\u001a\u0016\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020,\u0018\u00010\u001a2\u0016\b\n\u0010.\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010)0\u00112\u001f\b\u0004\u00101\u001a\u0019\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u001a¢\u0006\u0002\b0H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u00102\u001aµ\u0001\u00104\u001a\u00020\u0013\"\u0004\b\u0000\u0010'*\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u001c\b\n\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020)\u0018\u00010\u001a2\"\b\n\u0010-\u001a\u001c\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020,\u0018\u0001032\u001c\b\u0006\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010)0\u001a2%\b\u0004\u00101\u001a\u001f\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001303¢\u0006\u0002\b0H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u009d\u0001\u0010(\u001a\u00020\u0013\"\u0004\b\u0000\u0010'*\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u0000062\u0016\b\n\u0010*\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020)\u0018\u00010\u00112\u001c\b\n\u0010-\u001a\u0016\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020,\u0018\u00010\u001a2\u0016\b\n\u0010.\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010)0\u00112\u001f\b\u0004\u00101\u001a\u0019\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u001a¢\u0006\u0002\b0H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u00107\u001aµ\u0001\u00104\u001a\u00020\u0013\"\u0004\b\u0000\u0010'*\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u0000062\u001c\b\n\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020)\u0018\u00010\u001a2\"\b\n\u0010-\u001a\u001c\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020,\u0018\u0001032\u001c\b\u0006\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010)0\u001a2%\b\u0004\u00101\u001a\u001f\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001303¢\u0006\u0002\b0H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00108\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u00069"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells;", "columns", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/j;", "content", "LazyVerticalGrid", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkj/l;Landroidx/compose/runtime/Composer;II)V", "rows", "LazyHorizontalGrid", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkj/l;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "", "", "rememberColumnWidthSums", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkj/p;", "rememberRowHeightSums", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkj/p;", "gridSize", "slotCount", "spacing", "calculateCellsCrossAxisSizeImpl", "T", "items", "", "key", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "itemContent", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkj/l;Lkj/p;Lkj/l;Lkj/r;)V", "Lkotlin/Function3;", "itemsIndexed", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkj/p;Lkj/q;Lkj/p;Lkj/s;)V", "", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkj/l;Lkj/p;Lkj/l;Lkj/r;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkj/p;Lkj/q;Lkj/p;Lkj/s;)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyGridDslKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$10, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "it", "Lkotlin/j;", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass10 extends Lambda implements r<LazyGridItemScope, Integer, Composer, Integer, j> {
        final /* synthetic */ r<LazyGridItemScope, T, Composer, Integer, j> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(r<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, j> rVar, T[] tArr) {
            super(4);
            this.$itemContent = rVar;
            this.$items = tArr;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return j.a;
        }

        @Composable
        public final void invoke(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            m.h(lazyGridItemScope, "$this$items");
            if ((i3 & 14) == 0) {
                i4 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i4 |= composer.changed(i2) ? 32 : 16;
            }
            if ((i4 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407562193, i4, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:456)");
            }
            this.$itemContent.invoke(lazyGridItemScope, this.$items[i2], composer, Integer.valueOf(i4 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$2, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass2 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ l<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(l<? super T, ? extends Object> lVar, List<? extends T> list) {
            super(1);
            this.$key = lVar;
            this.$items = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i2) {
            return this.$key.invoke(this.$items.get(i2));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$3, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass3 extends Lambda implements p<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ p<LazyGridItemSpanScope, T, GridItemSpan> $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(p<? super LazyGridItemSpanScope, ? super T, GridItemSpan> pVar, List<? extends T> list) {
            super(2);
            this.$span = pVar;
            this.$items = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return GridItemSpan.m593boximpl(m617invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
        }

        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m617invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
            m.h(lazyGridItemSpanScope, "$this$null");
            return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, this.$items.get(i2))).getPackedValue();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$4, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass4 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ l<T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(l<? super T, ? extends Object> lVar, List<? extends T> list) {
            super(1);
            this.$contentType = lVar;
            this.$items = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i2) {
            return this.$contentType.invoke(this.$items.get(i2));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$5, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "it", "Lkotlin/j;", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass5 extends Lambda implements r<LazyGridItemScope, Integer, Composer, Integer, j> {
        final /* synthetic */ r<LazyGridItemScope, T, Composer, Integer, j> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(r<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, j> rVar, List<? extends T> list) {
            super(4);
            this.$itemContent = rVar;
            this.$items = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return j.a;
        }

        @Composable
        public final void invoke(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            m.h(lazyGridItemScope, "$this$items");
            if ((i3 & 14) == 0) {
                i4 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i4 |= composer.changed(i2) ? 32 : 16;
            }
            if ((i4 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(699646206, i4, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:390)");
            }
            this.$itemContent.invoke(lazyGridItemScope, this.$items.get(i2), composer, Integer.valueOf(i4 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$7, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass7 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ l<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(l<? super T, ? extends Object> lVar, T[] tArr) {
            super(1);
            this.$key = lVar;
            this.$items = tArr;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i2) {
            return this.$key.invoke(this.$items[i2]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$8, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass8 extends Lambda implements p<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ p<LazyGridItemSpanScope, T, GridItemSpan> $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(p<? super LazyGridItemSpanScope, ? super T, GridItemSpan> pVar, T[] tArr) {
            super(2);
            this.$span = pVar;
            this.$items = tArr;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return GridItemSpan.m593boximpl(m619invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
        }

        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m619invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
            m.h(lazyGridItemSpanScope, "$this$null");
            return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, this.$items[i2])).getPackedValue();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$9, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass9 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ l<T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(l<? super T, ? extends Object> lVar, T[] tArr) {
            super(1);
            this.$contentType = lVar;
            this.$items = tArr;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i2) {
            return this.$contentType.invoke(this.$items[i2]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$10, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "it", "Lkotlin/j;", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C023510 extends Lambda implements r<LazyGridItemScope, Integer, Composer, Integer, j> {
        final /* synthetic */ s<LazyGridItemScope, Integer, T, Composer, Integer, j> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C023510(s<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, j> sVar, T[] tArr) {
            super(4);
            this.$itemContent = sVar;
            this.$items = tArr;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return j.a;
        }

        @Composable
        public final void invoke(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            m.h(lazyGridItemScope, "$this$items");
            if ((i3 & 14) == 0) {
                i4 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i4 |= composer.changed(i2) ? 32 : 16;
            }
            if ((i4 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-911455938, i4, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:489)");
            }
            this.$itemContent.invoke(lazyGridItemScope, Integer.valueOf(i2), this.$items[i2], composer, Integer.valueOf((i4 & 14) | (i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C02362 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ p<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02362(p<? super Integer, ? super T, ? extends Object> pVar, List<? extends T> list) {
            super(1);
            this.$key = pVar;
            this.$items = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i2) {
            return this.$key.invoke(Integer.valueOf(i2), this.$items.get(i2));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C02373 extends Lambda implements p<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ q<LazyGridItemSpanScope, Integer, T, GridItemSpan> $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02373(q<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> qVar, List<? extends T> list) {
            super(2);
            this.$span = qVar;
            this.$items = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return GridItemSpan.m593boximpl(m620invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
        }

        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m620invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
            m.h(lazyGridItemSpanScope, "$this$null");
            return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i2), this.$items.get(i2))).getPackedValue();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$4, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C02384 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ p<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02384(p<? super Integer, ? super T, ? extends Object> pVar, List<? extends T> list) {
            super(1);
            this.$contentType = pVar;
            this.$items = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i2) {
            return this.$contentType.invoke(Integer.valueOf(i2), this.$items.get(i2));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$5, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "it", "Lkotlin/j;", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C02395 extends Lambda implements r<LazyGridItemScope, Integer, Composer, Integer, j> {
        final /* synthetic */ s<LazyGridItemScope, Integer, T, Composer, Integer, j> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02395(s<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, j> sVar, List<? extends T> list) {
            super(4);
            this.$itemContent = sVar;
            this.$items = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return j.a;
        }

        @Composable
        public final void invoke(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            m.h(lazyGridItemScope, "$this$items");
            if ((i3 & 14) == 0) {
                i4 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i4 |= composer.changed(i2) ? 32 : 16;
            }
            if ((i4 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1229287273, i4, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:423)");
            }
            this.$itemContent.invoke(lazyGridItemScope, Integer.valueOf(i2), this.$items.get(i2), composer, Integer.valueOf((i4 & 14) | (i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$7, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C02417 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ p<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02417(p<? super Integer, ? super T, ? extends Object> pVar, T[] tArr) {
            super(1);
            this.$key = pVar;
            this.$items = tArr;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i2) {
            return this.$key.invoke(Integer.valueOf(i2), this.$items[i2]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C02428 extends Lambda implements p<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ q<LazyGridItemSpanScope, Integer, T, GridItemSpan> $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02428(q<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> qVar, T[] tArr) {
            super(2);
            this.$span = qVar;
            this.$items = tArr;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return GridItemSpan.m593boximpl(m621invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
        }

        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m621invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
            m.h(lazyGridItemSpanScope, "$this$null");
            return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i2), this.$items[i2])).getPackedValue();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$9, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C02439 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ p<Integer, T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02439(p<? super Integer, ? super T, ? extends Object> pVar, T[] tArr) {
            super(1);
            this.$contentType = pVar;
            this.$items = tArr;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i2) {
            return this.$contentType.invoke(Integer.valueOf(i2), this.$items[i2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyHorizontalGrid(final androidx.compose.foundation.lazy.grid.GridCells r27, androidx.compose.ui.Modifier r28, androidx.compose.foundation.lazy.grid.LazyGridState r29, androidx.compose.foundation.layout.PaddingValues r30, boolean r31, androidx.compose.foundation.layout.Arrangement.Horizontal r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, androidx.compose.foundation.gestures.FlingBehavior r34, boolean r35, final kj.l<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.j> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, kj.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyVerticalGrid(final androidx.compose.foundation.lazy.grid.GridCells r27, androidx.compose.ui.Modifier r28, androidx.compose.foundation.lazy.grid.LazyGridState r29, androidx.compose.foundation.layout.PaddingValues r30, boolean r31, androidx.compose.foundation.layout.Arrangement.Vertical r32, androidx.compose.foundation.layout.Arrangement.Horizontal r33, androidx.compose.foundation.gestures.FlingBehavior r34, boolean r35, final kj.l<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.j> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, kj.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> calculateCellsCrossAxisSizeImpl(int i2, int i3, int i4) {
        int i5 = i2 - ((i3 - 1) * i4);
        int i6 = i5 / i3;
        int i7 = i5 % i3;
        ArrayList arrayList = new ArrayList(i3);
        int i8 = 0;
        while (i8 < i3) {
            arrayList.add(Integer.valueOf((i8 < i7 ? 1 : 0) + i6));
            i8++;
        }
        return arrayList;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyGridScope lazyGridScope, List<? extends T> list, l<? super T, ? extends Object> lVar, p<? super LazyGridItemSpanScope, ? super T, GridItemSpan> pVar, l<? super T, ? extends Object> lVar2, r<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, j> rVar) {
        m.h(lazyGridScope, "<this>");
        m.h(list, "items");
        m.h(lVar2, "contentType");
        m.h(rVar, "itemContent");
        lazyGridScope.items(list.size(), lVar != null ? new AnonymousClass2(lVar, list) : null, pVar != null ? new AnonymousClass3(pVar, list) : null, new AnonymousClass4(lVar2, list), ComposableLambdaKt.composableLambdaInstance(699646206, true, new AnonymousClass5(rVar, list)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, List list, l lVar, p pVar, l lVar2, r rVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        if ((i2 & 4) != 0) {
            pVar = null;
        }
        if ((i2 & 8) != 0) {
            lVar2 = new l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        m.h(lazyGridScope, "<this>");
        m.h(list, "items");
        m.h(lVar2, "contentType");
        m.h(rVar, "itemContent");
        lazyGridScope.items(list.size(), lVar != null ? new AnonymousClass2(lVar, list) : null, pVar != null ? new AnonymousClass3(pVar, list) : null, new AnonymousClass4(lVar2, list), ComposableLambdaKt.composableLambdaInstance(699646206, true, new AnonymousClass5(rVar, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyGridScope lazyGridScope, List<? extends T> list, p<? super Integer, ? super T, ? extends Object> pVar, q<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> qVar, p<? super Integer, ? super T, ? extends Object> pVar2, s<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, j> sVar) {
        m.h(lazyGridScope, "<this>");
        m.h(list, "items");
        m.h(pVar2, "contentType");
        m.h(sVar, "itemContent");
        lazyGridScope.items(list.size(), pVar != null ? new C02362(pVar, list) : null, qVar != null ? new C02373(qVar, list) : null, new C02384(pVar2, list), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new C02395(sVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, List list, p pVar, q qVar, p pVar2, s sVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pVar = null;
        }
        if ((i2 & 4) != 0) {
            qVar = null;
        }
        if ((i2 & 8) != 0) {
            pVar2 = new p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1
                public final Void invoke(int i3, Object obj2) {
                    return null;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        m.h(lazyGridScope, "<this>");
        m.h(list, "items");
        m.h(pVar2, "contentType");
        m.h(sVar, "itemContent");
        lazyGridScope.items(list.size(), pVar != null ? new C02362(pVar, list) : null, qVar != null ? new C02373(qVar, list) : null, new C02384(pVar2, list), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new C02395(sVar, list)));
    }

    @Composable
    private static final p<Density, Constraints, List<Integer>> rememberColumnWidthSums(final GridCells gridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i2) {
        composer.startReplaceableGroup(-1355301804);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1355301804, i2, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:148)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(gridCells) | composer.changed(horizontal) | composer.changed(paddingValues);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new p<Density, Constraints, List<Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberColumnWidthSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m622invoke0kLqBqw((Density) obj, ((Constraints) obj2).getValue());
                }

                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final List<Integer> m622invoke0kLqBqw(Density density, long j) {
                    m.h(density, "$this$null");
                    if (!(Constraints.m5235getMaxWidthimpl(j) != Integer.MAX_VALUE)) {
                        throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
                    }
                    PaddingValues paddingValues2 = paddingValues;
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    ArrayList arrayListY1 = y.Y1(gridCells.calculateCrossAxisCellSizes(density, Constraints.m5235getMaxWidthimpl(j) - density.mo342roundToPx0680j_4(Dp.m5267constructorimpl(PaddingKt.calculateEndPadding(paddingValues, layoutDirection) + PaddingKt.calculateStartPadding(paddingValues2, layoutDirection))), density.mo342roundToPx0680j_4(horizontal.getSpacing())));
                    int size = arrayListY1.size();
                    for (int i3 = 1; i3 < size; i3++) {
                        arrayListY1.set(i3, Integer.valueOf(((Number) arrayListY1.get(i3 - 1)).intValue() + ((Number) arrayListY1.get(i3)).intValue()));
                    }
                    return arrayListY1;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        p<Density, Constraints, List<Integer>> pVar = (p) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pVar;
    }

    @Composable
    private static final p<Density, Constraints, List<Integer>> rememberRowHeightSums(final GridCells gridCells, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i2) {
        composer.startReplaceableGroup(239683573);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(239683573, i2, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:180)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(gridCells) | composer.changed(vertical) | composer.changed(paddingValues);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new p<Density, Constraints, List<Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberRowHeightSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m623invoke0kLqBqw((Density) obj, ((Constraints) obj2).getValue());
                }

                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final List<Integer> m623invoke0kLqBqw(Density density, long j) {
                    m.h(density, "$this$null");
                    if (!(Constraints.m5234getMaxHeightimpl(j) != Integer.MAX_VALUE)) {
                        throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.".toString());
                    }
                    ArrayList arrayListY1 = y.Y1(gridCells.calculateCrossAxisCellSizes(density, Constraints.m5234getMaxHeightimpl(j) - density.mo342roundToPx0680j_4(Dp.m5267constructorimpl(paddingValues.getBottom() + paddingValues.getTop())), density.mo342roundToPx0680j_4(vertical.getSpacing())));
                    int size = arrayListY1.size();
                    for (int i3 = 1; i3 < size; i3++) {
                        arrayListY1.set(i3, Integer.valueOf(((Number) arrayListY1.get(i3 - 1)).intValue() + ((Number) arrayListY1.get(i3)).intValue()));
                    }
                    return arrayListY1;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        p<Density, Constraints, List<Integer>> pVar = (p) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pVar;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyGridScope lazyGridScope, T[] tArr, l<? super T, ? extends Object> lVar, p<? super LazyGridItemSpanScope, ? super T, GridItemSpan> pVar, l<? super T, ? extends Object> lVar2, r<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, j> rVar) {
        m.h(lazyGridScope, "<this>");
        m.h(tArr, "items");
        m.h(lVar2, "contentType");
        m.h(rVar, "itemContent");
        lazyGridScope.items(tArr.length, lVar != null ? new AnonymousClass7(lVar, tArr) : null, pVar != null ? new AnonymousClass8(pVar, tArr) : null, new AnonymousClass9(lVar2, tArr), ComposableLambdaKt.composableLambdaInstance(407562193, true, new AnonymousClass10(rVar, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyGridScope lazyGridScope, T[] tArr, p<? super Integer, ? super T, ? extends Object> pVar, q<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> qVar, p<? super Integer, ? super T, ? extends Object> pVar2, s<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, j> sVar) {
        m.h(lazyGridScope, "<this>");
        m.h(tArr, "items");
        m.h(pVar2, "contentType");
        m.h(sVar, "itemContent");
        lazyGridScope.items(tArr.length, pVar != null ? new C02417(pVar, tArr) : null, qVar != null ? new C02428(qVar, tArr) : null, new C02439(pVar2, tArr), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new C023510(sVar, tArr)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, Object[] objArr, l lVar, p pVar, l lVar2, r rVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        if ((i2 & 4) != 0) {
            pVar = null;
        }
        if ((i2 & 8) != 0) {
            lVar2 = new l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        m.h(lazyGridScope, "<this>");
        m.h(objArr, "items");
        m.h(lVar2, "contentType");
        m.h(rVar, "itemContent");
        lazyGridScope.items(objArr.length, lVar != null ? new AnonymousClass7(lVar, objArr) : null, pVar != null ? new AnonymousClass8(pVar, objArr) : null, new AnonymousClass9(lVar2, objArr), ComposableLambdaKt.composableLambdaInstance(407562193, true, new AnonymousClass10(rVar, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, Object[] objArr, p pVar, q qVar, p pVar2, s sVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pVar = null;
        }
        if ((i2 & 4) != 0) {
            qVar = null;
        }
        if ((i2 & 8) != 0) {
            pVar2 = new p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6
                public final Void invoke(int i3, Object obj2) {
                    return null;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        m.h(lazyGridScope, "<this>");
        m.h(objArr, "items");
        m.h(pVar2, "contentType");
        m.h(sVar, "itemContent");
        lazyGridScope.items(objArr.length, pVar != null ? new C02417(pVar, objArr) : null, qVar != null ? new C02428(qVar, objArr) : null, new C02439(pVar2, objArr), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new C023510(sVar, objArr)));
    }
}
