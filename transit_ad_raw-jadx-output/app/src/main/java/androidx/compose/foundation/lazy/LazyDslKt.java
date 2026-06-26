package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kj.l;
import kj.p;
import kj.r;
import kj.s;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a|\u0010\u0003\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\b\n\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\n\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u001f\b\u0004\u0010\f\u001a\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\r\u001ad\u0010\u0003\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\b\n\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u001f\b\u0004\u0010\f\u001a\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u000e\u001a\u008e\u0001\u0010\u0011\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\b\n\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u001c\b\u0006\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\b2%\b\u0004\u0010\f\u001a\u001f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001ap\u0010\u0011\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\b\n\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2%\b\u0004\u0010\f\u001a\u001f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013\u001a|\u0010\u0003\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0016\b\n\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\n\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u001f\b\u0004\u0010\f\u001a\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0015\u001ad\u0010\u0003\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0016\b\n\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u001f\b\u0004\u0010\f\u001a\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0016\u001a\u008e\u0001\u0010\u0011\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u001c\b\n\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u001c\b\u0006\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\b2%\b\u0004\u0010\f\u001a\u001f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0017\u001ap\u0010\u0011\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u001c\b\n\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2%\b\u0004\u0010\f\u001a\u001f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0018\u001as\u0010)\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u001f2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\u0004H\u0007¢\u0006\u0004\b)\u0010*\u001as\u0010/\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u001f2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\u0004H\u0007¢\u0006\u0004\b/\u00100\u001ai\u0010/\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010&\u001a\u00020%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\u0004H\u0007¢\u0006\u0004\b/\u00101\u001ai\u0010)\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\u0004H\u0007¢\u0006\u0004\b)\u00102\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00063"}, d2 = {"T", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "items", "Lkotlin/Function1;", "", "key", "contentType", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "itemContent", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkj/l;Lkj/l;Lkj/r;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkj/l;Lkj/r;)V", "", "Lkotlin/Function3;", "itemsIndexed", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkj/p;Lkj/p;Lkj/s;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkj/p;Lkj/s;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkj/l;Lkj/l;Lkj/r;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkj/l;Lkj/r;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkj/p;Lkj/p;Lkj/s;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkj/p;Lkj/s;)V", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "content", "LazyRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkj/l;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "LazyColumn", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkj/l;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkj/l;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkj/l;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyDslKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C02201 extends Lambda implements l {
        public static final C02201 INSTANCE = new C02201();

        public C02201() {
            super(1);
        }

        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C02212 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ l<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02212(l<? super T, ? extends Object> lVar, List<? extends T> list) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$3, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$4, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "it", "Lkotlin/j;", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass4 extends Lambda implements r<LazyItemScope, Integer, Composer, Integer, j> {
        final /* synthetic */ r<LazyItemScope, T, Composer, Integer, j> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(r<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, j> rVar, List<? extends T> list) {
            super(4);
            this.$itemContent = rVar;
            this.$items = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return j.a;
        }

        @Composable
        public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i4;
            m.h(lazyItemScope, "$this$items");
            if ((i3 & 14) == 0) {
                i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
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
                ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
            }
            this.$itemContent.invoke(lazyItemScope, this.$items.get(i2), composer, Integer.valueOf(i4 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$5, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass5 extends Lambda implements l {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$6, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass6 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ l<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(l<? super T, ? extends Object> lVar, T[] tArr) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$7, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass7 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ l<T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(l<? super T, ? extends Object> lVar, T[] tArr) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$8, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "it", "Lkotlin/j;", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass8 extends Lambda implements r<LazyItemScope, Integer, Composer, Integer, j> {
        final /* synthetic */ r<LazyItemScope, T, Composer, Integer, j> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(r<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, j> rVar, T[] tArr) {
            super(4);
            this.$itemContent = rVar;
            this.$items = tArr;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return j.a;
        }

        @Composable
        public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i4;
            m.h(lazyItemScope, "$this$items");
            if ((i3 & 14) == 0) {
                i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
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
                ComposerKt.traceEventStart(-1043393750, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:214)");
            }
            this.$itemContent.invoke(lazyItemScope, this.$items[i2], composer, Integer.valueOf(i4 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C02232 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ p<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02232(p<? super Integer, ? super T, ? extends Object> pVar, List<? extends T> list) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C02243 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ p<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02243(p<? super Integer, ? super T, ? extends Object> pVar, List<? extends T> list) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$4, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "it", "Lkotlin/j;", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C02254 extends Lambda implements r<LazyItemScope, Integer, Composer, Integer, j> {
        final /* synthetic */ s<LazyItemScope, Integer, T, Composer, Integer, j> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02254(s<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, j> sVar, List<? extends T> list) {
            super(4);
            this.$itemContent = sVar;
            this.$items = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return j.a;
        }

        @Composable
        public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i4;
            m.h(lazyItemScope, "$this$items");
            if ((i3 & 14) == 0) {
                i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
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
                ComposerKt.traceEventStart(-1091073711, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
            }
            this.$itemContent.invoke(lazyItemScope, Integer.valueOf(i2), this.$items.get(i2), composer, Integer.valueOf((i4 & 14) | (i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$6, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C02276 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ p<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02276(p<? super Integer, ? super T, ? extends Object> pVar, T[] tArr) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$7, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C02287 extends Lambda implements l<Integer, Object> {
        final /* synthetic */ p<Integer, T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02287(p<? super Integer, ? super T, ? extends Object> pVar, T[] tArr) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "it", "Lkotlin/j;", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C02298 extends Lambda implements r<LazyItemScope, Integer, Composer, Integer, j> {
        final /* synthetic */ s<LazyItemScope, Integer, T, Composer, Integer, j> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02298(s<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, j> sVar, T[] tArr) {
            super(4);
            this.$itemContent = sVar;
            this.$items = tArr;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return j.a;
        }

        @Composable
        public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i4;
            m.h(lazyItemScope, "$this$items");
            if ((i3 & 14) == 0) {
                i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
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
                ComposerKt.traceEventStart(1600639390, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:249)");
            }
            this.$itemContent.invoke(lazyItemScope, Integer.valueOf(i2), this.$items[i2], composer, Integer.valueOf((i4 & 14) | (i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0121  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyColumn(androidx.compose.ui.Modifier r27, androidx.compose.foundation.lazy.LazyListState r28, androidx.compose.foundation.layout.PaddingValues r29, boolean r30, androidx.compose.foundation.layout.Arrangement.Vertical r31, androidx.compose.ui.Alignment.Horizontal r32, androidx.compose.foundation.gestures.FlingBehavior r33, boolean r34, final kj.l<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.j> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, kj.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyRow(androidx.compose.ui.Modifier r26, androidx.compose.foundation.lazy.LazyListState r27, androidx.compose.foundation.layout.PaddingValues r28, boolean r29, androidx.compose.foundation.layout.Arrangement.Horizontal r30, androidx.compose.ui.Alignment.Vertical r31, androidx.compose.foundation.gestures.FlingBehavior r32, boolean r33, final kj.l<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.j> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, kj.l, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyListScope lazyListScope, List<? extends T> list, l<? super T, ? extends Object> lVar, l<? super T, ? extends Object> lVar2, r<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, j> rVar) {
        m.h(lazyListScope, "<this>");
        m.h(list, "items");
        m.h(lVar2, "contentType");
        m.h(rVar, "itemContent");
        lazyListScope.items(list.size(), lVar != null ? new C02212(lVar, list) : null, new AnonymousClass3(lVar2, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(rVar, list)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, l lVar, l lVar2, r rVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        if ((i2 & 4) != 0) {
            lVar2 = C02201.INSTANCE;
        }
        m.h(lazyListScope, "<this>");
        m.h(list, "items");
        m.h(lVar2, "contentType");
        m.h(rVar, "itemContent");
        lazyListScope.items(list.size(), lVar != null ? new C02212(lVar, list) : null, new AnonymousClass3(lVar2, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(rVar, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> list, p<? super Integer, ? super T, ? extends Object> pVar, p<? super Integer, ? super T, ? extends Object> pVar2, s<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, j> sVar) {
        m.h(lazyListScope, "<this>");
        m.h(list, "items");
        m.h(pVar2, "contentType");
        m.h(sVar, "itemContent");
        lazyListScope.items(list.size(), pVar != null ? new C02232(pVar, list) : null, new C02243(pVar2, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C02254(sVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, p pVar, p pVar2, s sVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pVar = null;
        }
        if ((i2 & 4) != 0) {
            pVar2 = new p() { // from class: androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1
                public final Void invoke(int i3, Object obj2) {
                    return null;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        m.h(lazyListScope, "<this>");
        m.h(list, "items");
        m.h(pVar2, "contentType");
        m.h(sVar, "itemContent");
        lazyListScope.items(list.size(), pVar != null ? new C02232(pVar, list) : null, new C02243(pVar2, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C02254(sVar, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyListScope lazyListScope, T[] tArr, l<? super T, ? extends Object> lVar, l<? super T, ? extends Object> lVar2, r<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, j> rVar) {
        m.h(lazyListScope, "<this>");
        m.h(tArr, "items");
        m.h(lVar2, "contentType");
        m.h(rVar, "itemContent");
        lazyListScope.items(tArr.length, lVar != null ? new AnonymousClass6(lVar, tArr) : null, new AnonymousClass7(lVar2, tArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(rVar, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyListScope lazyListScope, T[] tArr, p<? super Integer, ? super T, ? extends Object> pVar, p<? super Integer, ? super T, ? extends Object> pVar2, s<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, j> sVar) {
        m.h(lazyListScope, "<this>");
        m.h(tArr, "items");
        m.h(pVar2, "contentType");
        m.h(sVar, "itemContent");
        lazyListScope.items(tArr.length, pVar != null ? new C02276(pVar, tArr) : null, new C02287(pVar2, tArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C02298(sVar, tArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, l lVar, r rVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        m.h(lazyListScope, "<this>");
        m.h(list, "items");
        m.h(rVar, "itemContent");
        lazyListScope.items(list.size(), lVar != null ? new C02212(lVar, list) : null, new AnonymousClass3(C02201.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(rVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, p pVar, s sVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pVar = null;
        }
        m.h(lazyListScope, "<this>");
        m.h(list, "items");
        m.h(sVar, "itemContent");
        lazyListScope.items(list.size(), pVar != null ? new C02232(pVar, list) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C02254(sVar, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void items(LazyListScope lazyListScope, List<? extends T> list, l<? super T, ? extends Object> lVar, r<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, j> rVar) {
        m.h(lazyListScope, "<this>");
        m.h(list, "items");
        m.h(rVar, "itemContent");
        lazyListScope.items(list.size(), lVar != null ? new C02212(lVar, list) : null, new AnonymousClass3(C02201.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(rVar, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> list, p<? super Integer, ? super T, ? extends Object> pVar, s<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, j> sVar) {
        m.h(lazyListScope, "<this>");
        m.h(list, "items");
        m.h(sVar, "itemContent");
        lazyListScope.items(list.size(), pVar != null ? new C02232(pVar, list) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C02254(sVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, p pVar, p pVar2, s sVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pVar = null;
        }
        if ((i2 & 4) != 0) {
            pVar2 = new p() { // from class: androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5
                public final Void invoke(int i3, Object obj2) {
                    return null;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        m.h(lazyListScope, "<this>");
        m.h(objArr, "items");
        m.h(pVar2, "contentType");
        m.h(sVar, "itemContent");
        lazyListScope.items(objArr.length, pVar != null ? new C02276(pVar, objArr) : null, new C02287(pVar2, objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C02298(sVar, objArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, l lVar, l lVar2, r rVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        if ((i2 & 4) != 0) {
            lVar2 = AnonymousClass5.INSTANCE;
        }
        m.h(lazyListScope, "<this>");
        m.h(objArr, "items");
        m.h(lVar2, "contentType");
        m.h(rVar, "itemContent");
        lazyListScope.items(objArr.length, lVar != null ? new AnonymousClass6(lVar, objArr) : null, new AnonymousClass7(lVar2, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(rVar, objArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope lazyListScope, T[] tArr, p<? super Integer, ? super T, ? extends Object> pVar, s<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, j> sVar) {
        m.h(lazyListScope, "<this>");
        m.h(tArr, "items");
        m.h(sVar, "itemContent");
        lazyListScope.items(tArr.length, pVar != null ? new C02276(pVar, tArr) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(tArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C02298(sVar, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void items(LazyListScope lazyListScope, T[] tArr, l<? super T, ? extends Object> lVar, r<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, j> rVar) {
        m.h(lazyListScope, "<this>");
        m.h(tArr, "items");
        m.h(rVar, "itemContent");
        lazyListScope.items(tArr.length, lVar != null ? new AnonymousClass6(lVar, tArr) : null, new AnonymousClass7(AnonymousClass5.INSTANCE, tArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(rVar, tArr)));
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0117  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyColumn(androidx.compose.ui.Modifier r27, androidx.compose.foundation.lazy.LazyListState r28, androidx.compose.foundation.layout.PaddingValues r29, boolean r30, androidx.compose.foundation.layout.Arrangement.Vertical r31, androidx.compose.ui.Alignment.Horizontal r32, androidx.compose.foundation.gestures.FlingBehavior r33, final kj.l r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, kj.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0117  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyRow(androidx.compose.ui.Modifier r27, androidx.compose.foundation.lazy.LazyListState r28, androidx.compose.foundation.layout.PaddingValues r29, boolean r30, androidx.compose.foundation.layout.Arrangement.Horizontal r31, androidx.compose.ui.Alignment.Vertical r32, androidx.compose.foundation.gestures.FlingBehavior r33, final kj.l r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, kj.l, androidx.compose.runtime.Composer, int, int):void");
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, p pVar, s sVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pVar = null;
        }
        m.h(lazyListScope, "<this>");
        m.h(objArr, "items");
        m.h(sVar, "itemContent");
        lazyListScope.items(objArr.length, pVar != null ? new C02276(pVar, objArr) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C02298(sVar, objArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, l lVar, r rVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        m.h(lazyListScope, "<this>");
        m.h(objArr, "items");
        m.h(rVar, "itemContent");
        lazyListScope.items(objArr.length, lVar != null ? new AnonymousClass6(lVar, objArr) : null, new AnonymousClass7(AnonymousClass5.INSTANCE, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(rVar, objArr)));
    }
}
