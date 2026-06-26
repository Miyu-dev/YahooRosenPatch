package androidx.compose.foundation.text.selection;

import a.l;
import androidx.appcompat.R;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import ej.c;
import kj.p;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlin.text.r;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a%\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"", "isStartHandle", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Lkotlin/j;", "TextFieldSelectionHandle", "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "isSelectionHandleInVisibleBound", "Landroidx/compose/ui/unit/IntSize;", "magnifierSize", "Landroidx/compose/ui/geometry/Offset;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;J)J", "calculateSelectionMagnifierCenterAndroid", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class TextFieldSelectionManagerKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1, reason: invalid class name */
    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @c(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1", f = "TextFieldSelectionManager.kt", l = {820}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
        final /* synthetic */ TextDragObserver $observer;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextDragObserver textDragObserver, dj.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$observer = textDragObserver;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$observer, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(PointerInputScope pointerInputScope, dj.c<? super j> cVar) {
            return create(pointerInputScope, cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                TextDragObserver textDragObserver = this.$observer;
                this.label = 1;
                if (LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, this) == coroutineSingletons) {
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
    }

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldSelectionHandle(final boolean z, final ResolvedTextDirection resolvedTextDirection, final TextFieldSelectionManager textFieldSelectionManager, Composer composer, final int i2) {
        m.h(resolvedTextDirection, "direction");
        m.h(textFieldSelectionManager, "manager");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1344558920);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344558920, i2, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:803)");
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(textFieldSelectionManager);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = textFieldSelectionManager.handleDragObserver$foundation_release(z);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        TextDragObserver textDragObserver = (TextDragObserver) objRememberedValue;
        int i3 = i2 << 3;
        AndroidSelectionHandles_androidKt.m912SelectionHandle8fL75g(textFieldSelectionManager.m991getHandlePositiontuRUvjQ$foundation_release(z), z, resolvedTextDirection, TextRange.m4810getReversedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()), SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, textDragObserver, new AnonymousClass1(textDragObserver, null)), null, composerStartRestartGroup, (i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 196608 | (i3 & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.TextFieldSelectionHandle.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i4) {
                TextFieldSelectionManagerKt.TextFieldSelectionHandle(z, resolvedTextDirection, textFieldSelectionManager, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m996calculateSelectionMagnifierCenterAndroidO0kMr_c(TextFieldSelectionManager textFieldSelectionManager, long j) throws NoWhenBranchMatchedException {
        int iM4811getStartimpl;
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        TextDelegate textDelegate;
        AnnotatedString text;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResultProxy layoutResult2;
        LayoutCoordinates innerTextFieldCoordinates;
        m.h(textFieldSelectionManager, "manager");
        if (textFieldSelectionManager.getValue$foundation_release().getText().length() == 0) {
            return Offset.INSTANCE.m2600getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = textFieldSelectionManager.getDraggingHandle();
        int i2 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i2 == -1) {
            return Offset.INSTANCE.m2600getUnspecifiedF1C5BW0();
        }
        if (i2 == 1 || i2 == 2) {
            iM4811getStartimpl = TextRange.m4811getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection());
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iM4811getStartimpl = TextRange.m4806getEndimpl(textFieldSelectionManager.getValue$foundation_release().getSelection());
        }
        int iOriginalToTransformed = textFieldSelectionManager.getOffsetMapping().originalToTransformed(iM4811getStartimpl);
        TextFieldState state = textFieldSelectionManager.getState();
        if (state == null || (layoutResult = state.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return Offset.INSTANCE.m2600getUnspecifiedF1C5BW0();
        }
        TextFieldState state2 = textFieldSelectionManager.getState();
        if (state2 == null || (textDelegate = state2.getTextDelegate()) == null || (text = textDelegate.getText()) == null) {
            return Offset.INSTANCE.m2600getUnspecifiedF1C5BW0();
        }
        qj.b bVarI1 = r.i1(text);
        if (bVarI1 instanceof qj.b) {
            iOriginalToTransformed = ((Number) l.k(Integer.valueOf(iOriginalToTransformed), bVarI1)).intValue();
        } else {
            if (bVarI1.isEmpty()) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: " + bVarI1 + '.');
            }
            if (iOriginalToTransformed < ((Number) bVarI1.getStart()).intValue()) {
                iOriginalToTransformed = ((Number) bVarI1.getStart()).intValue();
            } else if (iOriginalToTransformed > ((Number) bVarI1.getEndInclusive()).intValue()) {
                iOriginalToTransformed = ((Number) bVarI1.getEndInclusive()).intValue();
            }
        }
        long jM2615getCenterF1C5BW0 = value.getBoundingBox(iOriginalToTransformed).m2615getCenterF1C5BW0();
        TextFieldState state3 = textFieldSelectionManager.getState();
        if (state3 == null || (layoutCoordinates = state3.getLayoutCoordinates()) == null) {
            return Offset.INSTANCE.m2600getUnspecifiedF1C5BW0();
        }
        TextFieldState state4 = textFieldSelectionManager.getState();
        if (state4 == null || (layoutResult2 = state4.getLayoutResult()) == null || (innerTextFieldCoordinates = layoutResult2.getInnerTextFieldCoordinates()) == null) {
            return Offset.INSTANCE.m2600getUnspecifiedF1C5BW0();
        }
        Offset offsetM989getCurrentDragPosition_m7T9E = textFieldSelectionManager.m989getCurrentDragPosition_m7T9E();
        if (offsetM989getCurrentDragPosition_m7T9E == null) {
            return Offset.INSTANCE.m2600getUnspecifiedF1C5BW0();
        }
        float fM2585getXimpl = Offset.m2585getXimpl(innerTextFieldCoordinates.mo4240localPositionOfR5De75A(layoutCoordinates, offsetM989getCurrentDragPosition_m7T9E.getPackedValue()));
        int lineForOffset = value.getLineForOffset(iOriginalToTransformed);
        int lineStart = value.getLineStart(lineForOffset);
        int lineEnd = value.getLineEnd(lineForOffset, true);
        boolean z = TextRange.m4811getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()) > TextRange.m4806getEndimpl(textFieldSelectionManager.getValue$foundation_release().getSelection());
        float horizontalPosition = TextSelectionDelegateKt.getHorizontalPosition(value, lineStart, true, z);
        float horizontalPosition2 = TextSelectionDelegateKt.getHorizontalPosition(value, lineEnd, false, z);
        float fH = l.h(fM2585getXimpl, Math.min(horizontalPosition, horizontalPosition2), Math.max(horizontalPosition, horizontalPosition2));
        return Math.abs(fM2585getXimpl - fH) > ((float) (IntSize.m5427getWidthimpl(j) / 2)) ? Offset.INSTANCE.m2600getUnspecifiedF1C5BW0() : layoutCoordinates.mo4240localPositionOfR5De75A(innerTextFieldCoordinates, OffsetKt.Offset(fH, Offset.m2586getYimpl(jM2615getCenterF1C5BW0)));
    }

    public static final boolean isSelectionHandleInVisibleBound(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        LayoutCoordinates layoutCoordinates;
        Rect rectVisibleBounds;
        m.h(textFieldSelectionManager, "<this>");
        TextFieldState state = textFieldSelectionManager.getState();
        if (state == null || (layoutCoordinates = state.getLayoutCoordinates()) == null || (rectVisibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates)) == null) {
            return false;
        }
        return SelectionManagerKt.m971containsInclusiveUv8p0NA(rectVisibleBounds, textFieldSelectionManager.m991getHandlePositiontuRUvjQ$foundation_release(z));
    }
}
