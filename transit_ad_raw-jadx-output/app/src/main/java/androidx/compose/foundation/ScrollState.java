package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001AB\u000f\u0012\u0006\u0010?\u001a\u00020\u000f¢\u0006\u0004\b@\u0010\u001dJ?\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J+\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010!\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010#\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u0016\u0010)\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00105\u001a\u00020-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00101R$\u00109\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u000f8F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dR\u0011\u0010=\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006B"}, d2 = {"Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Ldj/c;", "Lkotlin/j;", "", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkj/p;Ldj/c;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "", "value", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateScrollTo", "(ILandroidx/compose/animation/core/AnimationSpec;Ldj/c;)Ljava/lang/Object;", "scrollTo", "(ILdj/c;)Ljava/lang/Object;", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "()I", "setValue", "(I)V", "viewportSize$delegate", "getViewportSize$foundation_release", "setViewportSize$foundation_release", "viewportSize", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/runtime/MutableState;", "_maxValueState", "accumulator", "F", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "canScrollForward$delegate", "Landroidx/compose/runtime/State;", "getCanScrollForward", "()Z", "canScrollForward", "canScrollBackward$delegate", "getCanScrollBackward", "canScrollBackward", "newMax", "getMaxValue", "setMaxValue$foundation_release", "maxValue", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "isScrollInProgress", "initial", "<init>", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class ScrollState implements ScrollableState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<ScrollState, ?> Saver = SaverKt.Saver(new p<SaverScope, ScrollState, Integer>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$1
        public final Integer invoke(SaverScope saverScope, ScrollState scrollState) {
            m.h(saverScope, "$this$Saver");
            m.h(scrollState, "it");
            return Integer.valueOf(scrollState.getValue());
        }
    }, new l<Integer, ScrollState>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final ScrollState invoke(int i2) {
            return new ScrollState(i2);
        }
    });
    private float accumulator;

    /* JADX INFO: renamed from: value$delegate, reason: from kotlin metadata */
    private final MutableState value;

    /* JADX INFO: renamed from: viewportSize$delegate, reason: from kotlin metadata */
    private final MutableState viewportSize = SnapshotStateKt.mutableStateOf(0, SnapshotStateKt.structuralEqualityPolicy());
    private final MutableInteractionSource internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
    private MutableState<Integer> _maxValueState = SnapshotStateKt.mutableStateOf(Integer.MAX_VALUE, SnapshotStateKt.structuralEqualityPolicy());
    private final ScrollableState scrollableState = ScrollableStateKt.ScrollableState(new l<Float, Float>() { // from class: androidx.compose.foundation.ScrollState$scrollableState$1
        {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }

        public final Float invoke(float f) {
            float value = this.this$0.accumulator + this.this$0.getValue() + f;
            float fH = a.l.h(value, 0.0f, this.this$0.getMaxValue());
            boolean z = !(value == fH);
            float value2 = fH - this.this$0.getValue();
            int iF0 = a.f.f0(value2);
            ScrollState scrollState = this.this$0;
            scrollState.setValue(scrollState.getValue() + iF0);
            this.this$0.accumulator = value2 - iF0;
            if (z) {
                f = value2;
            }
            return Float.valueOf(f);
        }
    });

    /* JADX INFO: renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    private final State canScrollForward = SnapshotStateKt.derivedStateOf(new kj.a<Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollForward$2
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m265invoke() {
            return Boolean.valueOf(this.this$0.getValue() < this.this$0.getMaxValue());
        }
    });

    /* JADX INFO: renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    private final State canScrollBackward = SnapshotStateKt.derivedStateOf(new kj.a<Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollBackward$2
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m264invoke() {
            return Boolean.valueOf(this.this$0.getValue() > 0);
        }
    });

    /* JADX INFO: compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/ScrollState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/ScrollState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<ScrollState, ?> getSaver() {
            return ScrollState.Saver;
        }

        private Companion() {
        }
    }

    public ScrollState(int i2) {
        this.value = SnapshotStateKt.mutableStateOf(Integer.valueOf(i2), SnapshotStateKt.structuralEqualityPolicy());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollTo$default(ScrollState scrollState, int i2, AnimationSpec animationSpec, dj.c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 0.0f, null, 7, null);
        }
        return scrollState.animateScrollTo(i2, animationSpec, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setValue(int i2) {
        this.value.setValue(Integer.valueOf(i2));
    }

    public final Object animateScrollTo(int i2, AnimationSpec<Float> animationSpec, dj.c<? super j> cVar) {
        Object objAnimateScrollBy = ScrollExtensionsKt.animateScrollBy(this, i2 - getValue(), animationSpec, cVar);
        return objAnimateScrollBy == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateScrollBy : j.a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    /* JADX INFO: renamed from: getInternalInteractionSource$foundation_release, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final int getMaxValue() {
        return this._maxValueState.getValue().intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getValue() {
        return ((Number) this.value.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getViewportSize$foundation_release() {
        return ((Number) this.viewportSize.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, p<? super ScrollScope, ? super dj.c<? super j>, ? extends Object> pVar, dj.c<? super j> cVar) {
        Object objScroll = this.scrollableState.scroll(mutatePriority, pVar, cVar);
        return objScroll == CoroutineSingletons.COROUTINE_SUSPENDED ? objScroll : j.a;
    }

    public final Object scrollTo(int i2, dj.c<? super Float> cVar) {
        return ScrollExtensionsKt.scrollBy(this, i2 - getValue(), cVar);
    }

    public final void setMaxValue$foundation_release(int i2) {
        this._maxValueState.setValue(Integer.valueOf(i2));
        if (getValue() > i2) {
            setValue(i2);
        }
    }

    public final void setViewportSize$foundation_release(int i2) {
        this.viewportSize.setValue(Integer.valueOf(i2));
    }
}
