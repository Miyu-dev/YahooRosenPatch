package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
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
import java.util.List;
import kj.l;
import kj.p;
import kj.r;
import kj.s;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0081\u0001\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a<\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00182\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0081\u0001\u0010$\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a<\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00182\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a\u0094\u0001\u0010)\u001a\u00020\u0013\"\u0004\b\u0000\u0010'*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0016\b\n\u0010+\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*\u0018\u00010\u00112\u0016\b\u0006\u0010,\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010*0\u00112\u0016\b\n\u0010.\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020-\u0018\u00010\u00112\u001f\b\u0004\u00101\u001a\u0019\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0018¢\u0006\u0002\b0H\u0087\bø\u0001\u0002¢\u0006\u0004\b)\u00102\u001a¬\u0001\u00105\u001a\u00020\u0013\"\u0004\b\u0000\u0010'*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u001c\b\n\u0010+\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*\u0018\u00010\u00182\u001c\b\u0006\u0010,\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010*0\u00182\u001c\b\n\u0010.\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020-\u0018\u00010\u00182%\b\u0004\u00101\u001a\u001f\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001304¢\u0006\u0002\b0H\u0087\bø\u0001\u0002¢\u0006\u0004\b5\u00106\u001a\u0094\u0001\u0010)\u001a\u00020\u0013\"\u0004\b\u0000\u0010'*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u0000072\u0016\b\n\u0010+\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*\u0018\u00010\u00112\u0016\b\u0006\u0010,\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010*0\u00112\u0016\b\n\u0010.\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020-\u0018\u00010\u00112\u001f\b\u0004\u00101\u001a\u0019\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0018¢\u0006\u0002\b0H\u0087\bø\u0001\u0002¢\u0006\u0004\b)\u00108\u001a¬\u0001\u00105\u001a\u00020\u0013\"\u0004\b\u0000\u0010'*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u0000072\u001c\b\n\u0010+\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*\u0018\u00010\u00182\u001c\b\u0006\u0010,\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010*0\u00182\u001c\b\n\u0010.\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020-\u0018\u00010\u00182%\b\u0004\u00101\u001a\u001f\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001304¢\u0006\u0002\b0H\u0087\bø\u0001\u0002¢\u0006\u0004\b5\u00109\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006:"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "columns", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/ui/unit/Dp;", "verticalItemSpacing", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/j;", "content", "LazyVerticalStaggeredGrid-zadm560", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkj/l;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalStaggeredGrid", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "", "rememberColumnWidthSums", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkj/p;", "rows", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "horizontalItemSpacing", "LazyHorizontalStaggeredGrid-cJHQLPU", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLkj/l;Landroidx/compose/runtime/Composer;II)V", "LazyHorizontalStaggeredGrid", "rememberRowHeightSums", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkj/p;", "T", "", "items", "", "key", "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "span", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "itemContent", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkj/l;Lkj/l;Lkj/l;Lkj/r;)V", "", "Lkotlin/Function3;", "itemsIndexed", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkj/p;Lkj/p;Lkj/p;Lkj/s;)V", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkj/l;Lkj/l;Lkj/l;Lkj/r;)V", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkj/p;Lkj/p;Lkj/p;Lkj/s;)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyStaggeredGridDslKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$10, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "", "index", "Lkotlin/j;", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass10 extends Lambda implements r<LazyStaggeredGridItemScope, Integer, Composer, Integer, j> {
        final /* synthetic */ r<LazyStaggeredGridItemScope, T, Composer, Integer, j> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(r<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, j> rVar, T[] tArr) {
            super(4);
            this.$itemContent = rVar;
            this.$items = tArr;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return j.a;
        }

        @Composable
        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            m.h(lazyStaggeredGridItemScope, "$this$items");
            if ((i3 & 14) == 0) {
                i4 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i3;
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
                ComposerKt.traceEventStart(2101296000, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:391)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, this.$items[i2], composer, Integer.valueOf(i4 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$3, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass3 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ l<T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(l<? super T, ? extends Object> lVar, List<? extends T> list) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$5, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "", "index", "Lkotlin/j;", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass5 extends Lambda implements r<LazyStaggeredGridItemScope, Integer, Composer, Integer, j> {
        final /* synthetic */ r<LazyStaggeredGridItemScope, T, Composer, Integer, j> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(r<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, j> rVar, List<? extends T> list) {
            super(4);
            this.$itemContent = rVar;
            this.$items = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return j.a;
        }

        @Composable
        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            m.h(lazyStaggeredGridItemScope, "$this$items");
            if ((i3 & 14) == 0) {
                i4 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i3;
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
                ComposerKt.traceEventStart(-886456479, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:311)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, this.$items.get(i2), composer, Integer.valueOf(i4 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$8, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass8 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ l<T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(l<? super T, ? extends Object> lVar, T[] tArr) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$10, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "", "index", "Lkotlin/j;", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C024810 extends Lambda implements r<LazyStaggeredGridItemScope, Integer, Composer, Integer, j> {
        final /* synthetic */ s<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, j> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C024810(s<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, j> sVar, T[] tArr) {
            super(4);
            this.$itemContent = sVar;
            this.$items = tArr;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return j.a;
        }

        @Composable
        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            m.h(lazyStaggeredGridItemScope, "$this$items");
            if ((i3 & 14) == 0) {
                i4 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i3;
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
                ComposerKt.traceEventStart(-804487775, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:431)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, Integer.valueOf(i2), this.$items[i2], composer, Integer.valueOf((i4 & 14) | (i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C02493 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ p<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02493(p<? super Integer, ? super T, ? extends Object> pVar, List<? extends T> list) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$5, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "", "index", "Lkotlin/j;", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C02505 extends Lambda implements r<LazyStaggeredGridItemScope, Integer, Composer, Integer, j> {
        final /* synthetic */ s<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, j> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02505(s<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, j> sVar, List<? extends T> list) {
            super(4);
            this.$itemContent = sVar;
            this.$items = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return j.a;
        }

        @Composable
        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            m.h(lazyStaggeredGridItemScope, "$this$items");
            if ((i3 & 14) == 0) {
                i4 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i3;
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
                ComposerKt.traceEventStart(284833944, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:351)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, Integer.valueOf(i2), this.$items.get(i2), composer, Integer.valueOf((i4 & 14) | (i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C02528 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ p<Integer, T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02528(p<? super Integer, ? super T, ? extends Object> pVar, T[] tArr) {
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0117  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    /* JADX INFO: renamed from: LazyHorizontalStaggeredGrid-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m689LazyHorizontalStaggeredGridcJHQLPU(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, float r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final kj.l<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.j> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m689LazyHorizontalStaggeredGridcJHQLPU(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, float, androidx.compose.foundation.gestures.FlingBehavior, boolean, kj.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0116  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    /* JADX INFO: renamed from: LazyVerticalStaggeredGrid-zadm560, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m690LazyVerticalStaggeredGridzadm560(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, float r33, androidx.compose.foundation.layout.Arrangement.Horizontal r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final kj.l<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.j> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m690LazyVerticalStaggeredGridzadm560(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, kj.l, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, l<? super T, ? extends Object> lVar, l<? super T, ? extends Object> lVar2, l<? super T, StaggeredGridItemSpan> lVar3, r<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, j> rVar) {
        m.h(lazyStaggeredGridScope, "<this>");
        m.h(list, "items");
        m.h(lVar2, "contentType");
        m.h(rVar, "itemContent");
        lazyStaggeredGridScope.items(list.size(), lVar != null ? new LazyStaggeredGridDslKt$items$2$1(lVar, list) : null, new AnonymousClass3(lVar2, list), lVar3 != null ? new LazyStaggeredGridDslKt$items$4$1(lVar3, list) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new AnonymousClass5(rVar, list)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, l lVar, l lVar2, l lVar3, r rVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        if ((i2 & 4) != 0) {
            lVar2 = new l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i2 & 8) != 0) {
            lVar3 = null;
        }
        m.h(lazyStaggeredGridScope, "<this>");
        m.h(list, "items");
        m.h(lVar2, "contentType");
        m.h(rVar, "itemContent");
        lazyStaggeredGridScope.items(list.size(), lVar != null ? new LazyStaggeredGridDslKt$items$2$1(lVar, list) : null, new AnonymousClass3(lVar2, list), lVar3 != null ? new LazyStaggeredGridDslKt$items$4$1(lVar3, list) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new AnonymousClass5(rVar, list)));
    }

    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, p<? super Integer, ? super T, ? extends Object> pVar, p<? super Integer, ? super T, ? extends Object> pVar2, p<? super Integer, ? super T, StaggeredGridItemSpan> pVar3, s<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, j> sVar) {
        m.h(lazyStaggeredGridScope, "<this>");
        m.h(list, "items");
        m.h(pVar2, "contentType");
        m.h(sVar, "itemContent");
        lazyStaggeredGridScope.items(list.size(), pVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(pVar, list) : null, new C02493(pVar2, list), pVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(pVar3, list) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C02505(sVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, p pVar, p pVar2, p pVar3, s sVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pVar = null;
        }
        if ((i2 & 4) != 0) {
            pVar2 = new p() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1
                public final Void invoke(int i3, Object obj2) {
                    return null;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        if ((i2 & 8) != 0) {
            pVar3 = null;
        }
        m.h(lazyStaggeredGridScope, "<this>");
        m.h(list, "items");
        m.h(pVar2, "contentType");
        m.h(sVar, "itemContent");
        lazyStaggeredGridScope.items(list.size(), pVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(pVar, list) : null, new C02493(pVar2, list), pVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(pVar3, list) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C02505(sVar, list)));
    }

    @Composable
    private static final p<Density, Constraints, int[]> rememberColumnWidthSums(final StaggeredGridCells staggeredGridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i2) {
        composer.startReplaceableGroup(1426908594);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1426908594, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnWidthSums (LazyStaggeredGridDsl.kt:88)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(staggeredGridCells) | composer.changed(horizontal) | composer.changed(paddingValues);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new p<Density, Constraints, int[]>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberColumnWidthSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m693invoke0kLqBqw((Density) obj, ((Constraints) obj2).getValue());
                }

                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final int[] m693invoke0kLqBqw(Density density, long j) {
                    m.h(density, "$this$null");
                    if (!(Constraints.m5235getMaxWidthimpl(j) != Integer.MAX_VALUE)) {
                        throw new IllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.".toString());
                    }
                    PaddingValues paddingValues2 = paddingValues;
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    List<Integer> listCalculateCrossAxisCellSizes = staggeredGridCells.calculateCrossAxisCellSizes(density, Constraints.m5235getMaxWidthimpl(j) - density.mo342roundToPx0680j_4(Dp.m5267constructorimpl(PaddingKt.calculateEndPadding(paddingValues, layoutDirection) + PaddingKt.calculateStartPadding(paddingValues2, layoutDirection))), density.mo342roundToPx0680j_4(horizontal.getSpacing()));
                    int size = listCalculateCrossAxisCellSizes.size();
                    int[] iArr = new int[size];
                    for (int i3 = 0; i3 < size; i3++) {
                        iArr[i3] = listCalculateCrossAxisCellSizes.get(i3).intValue();
                    }
                    int size2 = listCalculateCrossAxisCellSizes.size();
                    for (int i4 = 1; i4 < size2; i4++) {
                        iArr[i4] = iArr[i4] + iArr[i4 - 1];
                    }
                    return iArr;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        p<Density, Constraints, int[]> pVar = (p) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pVar;
    }

    @Composable
    private static final p<Density, Constraints, int[]> rememberRowHeightSums(final StaggeredGridCells staggeredGridCells, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i2) {
        composer.startReplaceableGroup(-1665208491);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1665208491, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowHeightSums (LazyStaggeredGridDsl.kt:173)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(staggeredGridCells) | composer.changed(vertical) | composer.changed(paddingValues);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new p<Density, Constraints, int[]>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberRowHeightSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m694invoke0kLqBqw((Density) obj, ((Constraints) obj2).getValue());
                }

                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final int[] m694invoke0kLqBqw(Density density, long j) {
                    m.h(density, "$this$null");
                    if (!(Constraints.m5234getMaxHeightimpl(j) != Integer.MAX_VALUE)) {
                        throw new IllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.".toString());
                    }
                    List<Integer> listCalculateCrossAxisCellSizes = staggeredGridCells.calculateCrossAxisCellSizes(density, Constraints.m5234getMaxHeightimpl(j) - density.mo342roundToPx0680j_4(Dp.m5267constructorimpl(paddingValues.getBottom() + paddingValues.getTop())), density.mo342roundToPx0680j_4(vertical.getSpacing()));
                    int size = listCalculateCrossAxisCellSizes.size();
                    int[] iArr = new int[size];
                    for (int i3 = 0; i3 < size; i3++) {
                        iArr[i3] = listCalculateCrossAxisCellSizes.get(i3).intValue();
                    }
                    int size2 = listCalculateCrossAxisCellSizes.size();
                    for (int i4 = 1; i4 < size2; i4++) {
                        iArr[i4] = iArr[i4] + iArr[i4 - 1];
                    }
                    return iArr;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        p<Density, Constraints, int[]> pVar = (p) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pVar;
    }

    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, l<? super T, ? extends Object> lVar, l<? super T, ? extends Object> lVar2, l<? super T, StaggeredGridItemSpan> lVar3, r<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, j> rVar) {
        m.h(lazyStaggeredGridScope, "<this>");
        m.h(tArr, "items");
        m.h(lVar2, "contentType");
        m.h(rVar, "itemContent");
        lazyStaggeredGridScope.items(tArr.length, lVar != null ? new LazyStaggeredGridDslKt$items$7$1(lVar, tArr) : null, new AnonymousClass8(lVar2, tArr), lVar3 != null ? new LazyStaggeredGridDslKt$items$9$1(lVar3, tArr) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new AnonymousClass10(rVar, tArr)));
    }

    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, p<? super Integer, ? super T, ? extends Object> pVar, p<? super Integer, ? super T, ? extends Object> pVar2, p<? super Integer, ? super T, StaggeredGridItemSpan> pVar3, s<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, j> sVar) {
        m.h(lazyStaggeredGridScope, "<this>");
        m.h(tArr, "items");
        m.h(pVar2, "contentType");
        m.h(sVar, "itemContent");
        lazyStaggeredGridScope.items(tArr.length, pVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(pVar, tArr) : null, new C02528(pVar2, tArr), pVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(pVar3, tArr) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C024810(sVar, tArr)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, l lVar, l lVar2, l lVar3, r rVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        if ((i2 & 4) != 0) {
            lVar2 = new l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i2 & 8) != 0) {
            lVar3 = null;
        }
        m.h(lazyStaggeredGridScope, "<this>");
        m.h(objArr, "items");
        m.h(lVar2, "contentType");
        m.h(rVar, "itemContent");
        lazyStaggeredGridScope.items(objArr.length, lVar != null ? new LazyStaggeredGridDslKt$items$7$1(lVar, objArr) : null, new AnonymousClass8(lVar2, objArr), lVar3 != null ? new LazyStaggeredGridDslKt$items$9$1(lVar3, objArr) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new AnonymousClass10(rVar, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, p pVar, p pVar2, p pVar3, s sVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pVar = null;
        }
        if ((i2 & 4) != 0) {
            pVar2 = new p() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6
                public final Void invoke(int i3, Object obj2) {
                    return null;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        if ((i2 & 8) != 0) {
            pVar3 = null;
        }
        m.h(lazyStaggeredGridScope, "<this>");
        m.h(objArr, "items");
        m.h(pVar2, "contentType");
        m.h(sVar, "itemContent");
        lazyStaggeredGridScope.items(objArr.length, pVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(pVar, objArr) : null, new C02528(pVar2, objArr), pVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(pVar3, objArr) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C024810(sVar, objArr)));
    }
}
