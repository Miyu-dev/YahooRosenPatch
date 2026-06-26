package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import dj.e;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: LazyLayoutSemantics.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"lazyLayoutSemantics", "Landroidx/compose/ui/Modifier;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "userScrollEnabled", "", "reverseScrolling", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LazyLayoutSemanticsKt {
    @Composable
    public static final Modifier lazyLayoutSemantics(Modifier modifier, final LazyLayoutItemProvider lazyLayoutItemProvider, final LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z, boolean z2, Composer composer, int i2) {
        m.h(modifier, "<this>");
        m.h(lazyLayoutItemProvider, "itemProvider");
        m.h(lazyLayoutSemanticState, "state");
        m.h(orientation, "orientation");
        composer.startReplaceableGroup(290103779);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(290103779, i2, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:39)");
        }
        Object objD = s.d(composer, 773894976, -492369756);
        if (objD == Composer.INSTANCE.getEmpty()) {
            objD = androidx.appcompat.view.menu.a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
        }
        composer.endReplaceableGroup();
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objD).getCoroutineScope();
        composer.endReplaceableGroup();
        Object[] objArr = {lazyLayoutItemProvider, lazyLayoutSemanticState, orientation, Boolean.valueOf(z)};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i3 = 0; i3 < 4; i3++) {
            zChanged |= composer.changed(objArr[i3]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            final boolean z3 = orientation == Orientation.Vertical;
            final l<Object, Integer> lVar = new l<Object, Integer>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final Integer m684invoke(Object obj) {
                    m.h(obj, "needle");
                    int itemCount = lazyLayoutItemProvider.getItemCount();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= itemCount) {
                            i4 = -1;
                            break;
                        }
                        if (m.c(lazyLayoutItemProvider.getKey(i4), obj)) {
                            break;
                        }
                        i4++;
                    }
                    return Integer.valueOf(i4);
                }
            };
            final ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new kj.a<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final Float m682invoke() {
                    return Float.valueOf(lazyLayoutSemanticState.getCurrentPosition());
                }
            }, new kj.a<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final Float m683invoke() {
                    return Float.valueOf(lazyLayoutSemanticState.getCanScrollForward() ? lazyLayoutItemProvider.getItemCount() + 1.0f : lazyLayoutSemanticState.getCurrentPosition());
                }
            }, z2);
            final p<Float, Float, Boolean> pVar = z ? new p<Float, Float, Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1

                /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: LazyLayoutSemantics.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @ej.c(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1", f = "LazyLayoutSemantics.kt", l = {R.styleable.AppCompatTheme_seekBarStyle}, m = "invokeSuspend")
                public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                    final /* synthetic */ float $delta;
                    final /* synthetic */ LazyLayoutSemanticState $state;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(LazyLayoutSemanticState lazyLayoutSemanticState, float f, dj.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$state = lazyLayoutSemanticState;
                        this.$delta = f;
                    }

                    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                        return new AnonymousClass1(this.$state, this.$delta, cVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            li.c.O(obj);
                            LazyLayoutSemanticState lazyLayoutSemanticState = this.$state;
                            float f = this.$delta;
                            this.label = 1;
                            if (lazyLayoutSemanticState.animateScrollBy(f, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            li.c.O(obj);
                        }
                        return j.a;
                    }

                    public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                        return create(coroutineScope, cVar).invokeSuspend(j.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                }

                public final Boolean invoke(float f, float f2) {
                    if (z3) {
                        f = f2;
                    }
                    BuildersKt.launch$default(coroutineScope, (e) null, (CoroutineStart) null, new AnonymousClass1(lazyLayoutSemanticState, f, null), 3, (Object) null);
                    return Boolean.TRUE;
                }
            } : null;
            final l<Integer, Boolean> lVar2 = z ? new l<Integer, Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1

                /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: LazyLayoutSemantics.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @ej.c(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2", f = "LazyLayoutSemantics.kt", l = {R.styleable.AppCompatTheme_toolbarNavigationButtonStyle}, m = "invokeSuspend")
                public static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                    final /* synthetic */ int $index;
                    final /* synthetic */ LazyLayoutSemanticState $state;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(LazyLayoutSemanticState lazyLayoutSemanticState, int i2, dj.c<? super AnonymousClass2> cVar) {
                        super(2, cVar);
                        this.$state = lazyLayoutSemanticState;
                        this.$index = i2;
                    }

                    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                        return new AnonymousClass2(this.$state, this.$index, cVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            li.c.O(obj);
                            LazyLayoutSemanticState lazyLayoutSemanticState = this.$state;
                            int i3 = this.$index;
                            this.label = 1;
                            if (lazyLayoutSemanticState.scrollToItem(i3, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            li.c.O(obj);
                        }
                        return j.a;
                    }

                    public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                        return create(coroutineScope, cVar).invokeSuspend(j.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Boolean invoke(int i4) {
                    boolean z4 = i4 >= 0 && i4 < lazyLayoutItemProvider.getItemCount();
                    LazyLayoutItemProvider lazyLayoutItemProvider2 = lazyLayoutItemProvider;
                    if (z4) {
                        BuildersKt.launch$default(coroutineScope, (e) null, (CoroutineStart) null, new AnonymousClass2(lazyLayoutSemanticState, i4, null), 3, (Object) null);
                        return Boolean.TRUE;
                    }
                    StringBuilder sbG = androidx.appcompat.view.menu.a.g("Can't scroll to index ", i4, ", it is out of bounds [0, ");
                    sbG.append(lazyLayoutItemProvider2.getItemCount());
                    sbG.append(')');
                    throw new IllegalArgumentException(sbG.toString().toString());
                }
            } : null;
            final CollectionInfo collectionInfo = lazyLayoutSemanticState.collectionInfo();
            objRememberedValue = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return j.a;
                }

                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    m.h(semanticsPropertyReceiver, "$this$semantics");
                    SemanticsPropertiesKt.indexForKey(semanticsPropertyReceiver, lVar);
                    if (z3) {
                        SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
                    } else {
                        SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
                    }
                    p<Float, Float, Boolean> pVar2 = pVar;
                    if (pVar2 != null) {
                        SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, pVar2, 1, null);
                    }
                    l<Integer, Boolean> lVar3 = lVar2;
                    if (lVar3 != null) {
                        SemanticsPropertiesKt.scrollToIndex$default(semanticsPropertyReceiver, null, lVar3, 1, null);
                    }
                    SemanticsPropertiesKt.setCollectionInfo(semanticsPropertyReceiver, collectionInfo);
                }
            }, 1, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier modifierThen = modifier.then((Modifier) objRememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierThen;
    }
}
