package androidx.compose.foundation.text;

import a.f;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import ej.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kj.a;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: CoreText.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b3\u00104J%\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\n\u001a\u00020\t*\u00020\tH\u0003J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010+R\u0011\u00102\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00065"}, d2 = {"Landroidx/compose/foundation/text/TextController;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "", "outOfBoundary-0a9Yr6o", "(JJ)Z", "outOfBoundary", "Landroidx/compose/ui/Modifier;", "drawTextAndSelectionBehind", "Landroidx/compose/ui/text/AnnotatedString;", "text", "createSemanticsModifierFor", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectionRegistrar", "Lkotlin/j;", "update", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "setTextDelegate", "onRemembered", "onForgotten", "onAbandoned", "Landroidx/compose/foundation/text/TextState;", "state", "Landroidx/compose/foundation/text/TextState;", "getState", "()Landroidx/compose/foundation/text/TextState;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "Landroidx/compose/foundation/text/TextDragObserver;", "longPressDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getLongPressDragObserver", "()Landroidx/compose/foundation/text/TextDragObserver;", "setLongPressDragObserver", "(Landroidx/compose/foundation/text/TextDragObserver;)V", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "coreModifiers", "Landroidx/compose/ui/Modifier;", "<set-?>", "semanticsModifier", "getSemanticsModifier$foundation_release", "()Landroidx/compose/ui/Modifier;", "selectionModifiers", "getModifiers", "modifiers", "<init>", "(Landroidx/compose/foundation/text/TextState;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class TextController implements RememberObserver {
    private final Modifier coreModifiers;
    public TextDragObserver longPressDragObserver;
    private final MeasurePolicy measurePolicy;
    private Modifier selectionModifiers;
    private SelectionRegistrar selectionRegistrar;
    private Modifier semanticsModifier;
    private final TextState state;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextController$update$2, reason: invalid class name */
    /* JADX INFO: compiled from: CoreText.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @c(c = "androidx.compose.foundation.text.TextController$update$2", f = "CoreText.kt", l = {192}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = TextController.this.new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
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
                TextDragObserver longPressDragObserver = TextController.this.getLongPressDragObserver();
                this.label = 1;
                if (LongPressTextDragObserverKt.detectDragGesturesAfterLongPressWithObserver(pointerInputScope, longPressDragObserver, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextController$update$3, reason: invalid class name */
    /* JADX INFO: compiled from: CoreText.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @c(c = "androidx.compose.foundation.text.TextController$update$3", f = "CoreText.kt", l = {283}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
        final /* synthetic */ TextController$update$mouseSelectionObserver$1 $mouseSelectionObserver;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TextController$update$mouseSelectionObserver$1 textController$update$mouseSelectionObserver$1, dj.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$mouseSelectionObserver = textController$update$mouseSelectionObserver$1;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$mouseSelectionObserver, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
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
                TextController$update$mouseSelectionObserver$1 textController$update$mouseSelectionObserver$1 = this.$mouseSelectionObserver;
                this.label = 1;
                if (TextSelectionMouseDetectorKt.mouseSelectionDetector(pointerInputScope, textController$update$mouseSelectionObserver$1, this) == coroutineSingletons) {
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

    public TextController(TextState textState) {
        m.h(textState, "state");
        this.state = textState;
        this.measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.TextController$measurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                m.h(intrinsicMeasureScope, "<this>");
                m.h(list, "measurables");
                return IntSize.m5426getHeightimpl(TextDelegate.m870layoutNN6EwU$default(this.this$0.getState().getTextDelegate(), ConstraintsKt.Constraints(0, i2, 0, Integer.MAX_VALUE), intrinsicMeasureScope.getLayoutDirection(), null, 4, null).getSize());
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                m.h(intrinsicMeasureScope, "<this>");
                m.h(list, "measurables");
                this.this$0.getState().getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                return this.this$0.getState().getTextDelegate().getMaxIntrinsicWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo34measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                int i2;
                Pair pair;
                SelectionRegistrar selectionRegistrar;
                m.h(measureScope, "$this$measure");
                m.h(list, "measurables");
                this.this$0.getState().getLayoutInvalidation();
                TextLayoutResult layoutResult = this.this$0.getState().getLayoutResult();
                TextLayoutResult textLayoutResultM873layoutNN6EwU = this.this$0.getState().getTextDelegate().m873layoutNN6EwU(j, measureScope.getLayoutDirection(), layoutResult);
                if (!m.c(layoutResult, textLayoutResultM873layoutNN6EwU)) {
                    this.this$0.getState().getOnTextLayout().invoke(textLayoutResultM873layoutNN6EwU);
                    if (layoutResult != null) {
                        TextController textController = this.this$0;
                        if (!m.c(layoutResult.getLayoutInput().getText(), textLayoutResultM873layoutNN6EwU.getLayoutInput().getText()) && (selectionRegistrar = textController.selectionRegistrar) != null) {
                            selectionRegistrar.notifySelectableChange(textController.getState().getSelectableId());
                        }
                    }
                }
                this.this$0.getState().setLayoutResult(textLayoutResultM873layoutNN6EwU);
                if (!(list.size() >= textLayoutResultM873layoutNN6EwU.getPlaceholderRects().size())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                List<Rect> placeholderRects = textLayoutResultM873layoutNN6EwU.getPlaceholderRects();
                final ArrayList arrayList = new ArrayList(placeholderRects.size());
                int size = placeholderRects.size();
                int i3 = 0;
                while (i3 < size) {
                    Rect rect = placeholderRects.get(i3);
                    if (rect != null) {
                        i2 = size;
                        pair = new Pair(list.get(i3).mo4235measureBRTryo0(ConstraintsKt.Constraints$default(0, (int) Math.floor(rect.getWidth()), 0, (int) Math.floor(rect.getHeight()), 5, null)), IntOffset.m5376boximpl(IntOffsetKt.IntOffset(f.f0(rect.getLeft()), f.f0(rect.getTop()))));
                    } else {
                        i2 = size;
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    i3++;
                    size = i2;
                }
                return measureScope.layout(IntSize.m5427getWidthimpl(textLayoutResultM873layoutNN6EwU.getSize()), IntSize.m5426getHeightimpl(textLayoutResultM873layoutNN6EwU.getSize()), i0.N(new Pair[]{new Pair(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(f.f0(textLayoutResultM873layoutNN6EwU.getFirstBaseline()))), new Pair(AlignmentLineKt.getLastBaseline(), Integer.valueOf(f.f0(textLayoutResultM873layoutNN6EwU.getLastBaseline())))}), new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.foundation.text.TextController$measurePolicy$1$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return j.a;
                    }

                    public final void invoke(Placeable.PlacementScope placementScope) {
                        m.h(placementScope, "$this$layout");
                        List<Pair<Placeable, IntOffset>> list2 = arrayList;
                        int size2 = list2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            Pair<Placeable, IntOffset> pair2 = list2.get(i4);
                            Placeable.PlacementScope.m4272place70tqf50$default(placementScope, (Placeable) pair2.component1(), ((IntOffset) pair2.component2()).getPackedValue(), 0.0f, 2, null);
                        }
                    }
                });
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                m.h(intrinsicMeasureScope, "<this>");
                m.h(list, "measurables");
                return IntSize.m5426getHeightimpl(TextDelegate.m870layoutNN6EwU$default(this.this$0.getState().getTextDelegate(), ConstraintsKt.Constraints(0, i2, 0, Integer.MAX_VALUE), intrinsicMeasureScope.getLayoutDirection(), null, 4, null).getSize());
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                m.h(intrinsicMeasureScope, "<this>");
                m.h(list, "measurables");
                this.this$0.getState().getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                return this.this$0.getState().getTextDelegate().getMinIntrinsicWidth();
            }
        };
        Modifier.Companion companion = Modifier.INSTANCE;
        this.coreModifiers = OnGloballyPositionedModifierKt.onGloballyPositioned(drawTextAndSelectionBehind(companion), new l<LayoutCoordinates, j>() { // from class: androidx.compose.foundation.text.TextController$coreModifiers$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutCoordinates) obj);
                return j.a;
            }

            public final void invoke(LayoutCoordinates layoutCoordinates) {
                SelectionRegistrar selectionRegistrar;
                m.h(layoutCoordinates, "it");
                this.this$0.getState().setLayoutCoordinates(layoutCoordinates);
                if (SelectionRegistrarKt.hasSelection(this.this$0.selectionRegistrar, this.this$0.getState().getSelectableId())) {
                    long jPositionInWindow = LayoutCoordinatesKt.positionInWindow(layoutCoordinates);
                    if (!Offset.m2582equalsimpl0(jPositionInWindow, this.this$0.getState().getPreviousGlobalPosition()) && (selectionRegistrar = this.this$0.selectionRegistrar) != null) {
                        selectionRegistrar.notifyPositionChange(this.this$0.getState().getSelectableId());
                    }
                    this.this$0.getState().m909setPreviousGlobalPositionk4lQ0M(jPositionInWindow);
                }
            }
        });
        this.semanticsModifier = createSemanticsModifierFor(textState.getTextDelegate().getText());
        this.selectionModifiers = companion;
    }

    private final Modifier createSemanticsModifierFor(final AnnotatedString text) {
        return SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.foundation.text.TextController.createSemanticsModifierFor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return j.a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                m.h(semanticsPropertyReceiver, "$this$semantics");
                SemanticsPropertiesKt.setText(semanticsPropertyReceiver, text);
                final TextController textController = this;
                SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new l<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.TextController.createSemanticsModifierFor.1.1
                    {
                        super(1);
                    }

                    public final Boolean invoke(List<TextLayoutResult> list) {
                        boolean z;
                        m.h(list, "it");
                        if (textController.getState().getLayoutResult() != null) {
                            TextLayoutResult layoutResult = textController.getState().getLayoutResult();
                            m.e(layoutResult);
                            list.add(layoutResult);
                            z = true;
                        } else {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                }, 1, null);
            }
        }, 1, null);
    }

    @Stable
    private final Modifier drawTextAndSelectionBehind(Modifier modifier) {
        return DrawModifierKt.drawBehind(GraphicsLayerModifierKt.m2964graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null), new l<DrawScope, j>() { // from class: androidx.compose.foundation.text.TextController.drawTextAndSelectionBehind.1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return j.a;
            }

            public final void invoke(DrawScope drawScope) {
                Map<Long, Selection> subselections;
                m.h(drawScope, "$this$drawBehind");
                TextLayoutResult layoutResult = TextController.this.getState().getLayoutResult();
                if (layoutResult != null) {
                    TextController textController = TextController.this;
                    textController.getState().getDrawScopeInvalidation();
                    SelectionRegistrar selectionRegistrar = textController.selectionRegistrar;
                    Selection selection = (selectionRegistrar == null || (subselections = selectionRegistrar.getSubselections()) == null) ? null : subselections.get(Long.valueOf(textController.getState().getSelectableId()));
                    Selectable selectable = textController.getState().getSelectable();
                    int lastVisibleOffset = selectable != null ? selectable.getLastVisibleOffset() : 0;
                    if (selection != null) {
                        int i2 = a.l.i(!selection.getHandlesCrossed() ? selection.getStart().getOffset() : selection.getEnd().getOffset(), 0, lastVisibleOffset);
                        int i3 = a.l.i(!selection.getHandlesCrossed() ? selection.getEnd().getOffset() : selection.getStart().getOffset(), 0, lastVisibleOffset);
                        if (i2 != i3) {
                            Path pathForRange = layoutResult.getMultiParagraph().getPathForRange(i2, i3);
                            if (TextOverflow.m5212equalsimpl0(layoutResult.getLayoutInput().getOverflow(), TextOverflow.INSTANCE.m5221getVisiblegIe3tQ8())) {
                                b.G(drawScope, pathForRange, textController.getState().getSelectionBackgroundColor(), 0.0f, null, null, 0, 60, null);
                            } else {
                                float fM2654getWidthimpl = Size.m2654getWidthimpl(drawScope.mo3254getSizeNHjbRc());
                                float fM2651getHeightimpl = Size.m2651getHeightimpl(drawScope.mo3254getSizeNHjbRc());
                                int iM2807getIntersectrtfAjoo = ClipOp.INSTANCE.m2807getIntersectrtfAjoo();
                                DrawContext drawContext = drawScope.getDrawContext();
                                long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
                                drawContext.getCanvas().save();
                                drawContext.getTransform().mo3263clipRectN_I0leg(0.0f, 0.0f, fM2654getWidthimpl, fM2651getHeightimpl, iM2807getIntersectrtfAjoo);
                                b.G(drawScope, pathForRange, textController.getState().getSelectionBackgroundColor(), 0.0f, null, null, 0, 60, null);
                                drawContext.getCanvas().restore();
                                drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
                            }
                        }
                    }
                    TextDelegate.INSTANCE.paint(drawScope.getDrawContext().getCanvas(), layoutResult);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: outOfBoundary-0a9Yr6o, reason: not valid java name */
    public final boolean m860outOfBoundary0a9Yr6o(long start, long end) {
        TextLayoutResult layoutResult = this.state.getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        int length = layoutResult.getLayoutInput().getText().getText().length();
        int iM4783getOffsetForPositionk4lQ0M = layoutResult.m4783getOffsetForPositionk4lQ0M(start);
        int iM4783getOffsetForPositionk4lQ0M2 = layoutResult.m4783getOffsetForPositionk4lQ0M(end);
        int i2 = length - 1;
        return (iM4783getOffsetForPositionk4lQ0M >= i2 && iM4783getOffsetForPositionk4lQ0M2 >= i2) || (iM4783getOffsetForPositionk4lQ0M < 0 && iM4783getOffsetForPositionk4lQ0M2 < 0);
    }

    public final TextDragObserver getLongPressDragObserver() {
        TextDragObserver textDragObserver = this.longPressDragObserver;
        if (textDragObserver != null) {
            return textDragObserver;
        }
        m.o("longPressDragObserver");
        throw null;
    }

    public final MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    public final Modifier getModifiers() {
        return HeightInLinesModifierKt.heightInLines$default(this.coreModifiers, this.state.getTextDelegate().getStyle(), this.state.getTextDelegate().getMinLines(), 0, 4, null).then(this.semanticsModifier).then(this.selectionModifiers);
    }

    /* JADX INFO: renamed from: getSemanticsModifier$foundation_release, reason: from getter */
    public final Modifier getSemanticsModifier() {
        return this.semanticsModifier;
    }

    public final TextState getState() {
        return this.state;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        SelectionRegistrar selectionRegistrar;
        Selectable selectable = this.state.getSelectable();
        if (selectable == null || (selectionRegistrar = this.selectionRegistrar) == null) {
            return;
        }
        selectionRegistrar.unsubscribe(selectable);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        SelectionRegistrar selectionRegistrar;
        Selectable selectable = this.state.getSelectable();
        if (selectable == null || (selectionRegistrar = this.selectionRegistrar) == null) {
            return;
        }
        selectionRegistrar.unsubscribe(selectable);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        SelectionRegistrar selectionRegistrar = this.selectionRegistrar;
        if (selectionRegistrar != null) {
            TextState textState = this.state;
            textState.setSelectable(selectionRegistrar.subscribe(new MultiWidgetSelectionDelegate(textState.getSelectableId(), new a<LayoutCoordinates>() { // from class: androidx.compose.foundation.text.TextController$onRemembered$1$1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final LayoutCoordinates m861invoke() {
                    return this.this$0.getState().getLayoutCoordinates();
                }
            }, new a<TextLayoutResult>() { // from class: androidx.compose.foundation.text.TextController$onRemembered$1$2
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final TextLayoutResult m862invoke() {
                    return this.this$0.getState().getLayoutResult();
                }
            })));
        }
    }

    public final void setLongPressDragObserver(TextDragObserver textDragObserver) {
        m.h(textDragObserver, "<set-?>");
        this.longPressDragObserver = textDragObserver;
    }

    public final void setTextDelegate(TextDelegate textDelegate) {
        m.h(textDelegate, "textDelegate");
        if (this.state.getTextDelegate() == textDelegate) {
            return;
        }
        this.state.setTextDelegate(textDelegate);
        this.semanticsModifier = createSemanticsModifierFor(this.state.getTextDelegate().getText());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.text.TextController$update$mouseSelectionObserver$1, java.lang.Object] */
    public final void update(final SelectionRegistrar selectionRegistrar) {
        Modifier modifierPointerHoverIcon$default;
        this.selectionRegistrar = selectionRegistrar;
        if (selectionRegistrar == null) {
            modifierPointerHoverIcon$default = Modifier.INSTANCE;
        } else if (TouchMode_androidKt.isInTouchMode()) {
            setLongPressDragObserver(new TextDragObserver() { // from class: androidx.compose.foundation.text.TextController.update.1
                private long dragTotalDistance;
                private long lastPosition;

                {
                    Offset.Companion companion = Offset.INSTANCE;
                    this.lastPosition = companion.m2601getZeroF1C5BW0();
                    this.dragTotalDistance = companion.m2601getZeroF1C5BW0();
                }

                public final long getDragTotalDistance() {
                    return this.dragTotalDistance;
                }

                public final long getLastPosition() {
                    return this.lastPosition;
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onCancel() {
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, TextController.this.getState().getSelectableId())) {
                        selectionRegistrar.notifySelectionUpdateEnd();
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* JADX INFO: renamed from: onDrag-k-4lQ0M, reason: not valid java name */
                public void mo864onDragk4lQ0M(long delta) {
                    LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                    if (layoutCoordinates != null) {
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        TextController textController = TextController.this;
                        if (layoutCoordinates.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId())) {
                            long jM2590plusMKHz9U = Offset.m2590plusMKHz9U(this.dragTotalDistance, delta);
                            this.dragTotalDistance = jM2590plusMKHz9U;
                            long jM2590plusMKHz9U2 = Offset.m2590plusMKHz9U(this.lastPosition, jM2590plusMKHz9U);
                            if (textController.m860outOfBoundary0a9Yr6o(this.lastPosition, jM2590plusMKHz9U2) || !selectionRegistrar2.mo978notifySelectionUpdate5iVPX68(layoutCoordinates, jM2590plusMKHz9U2, this.lastPosition, false, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate())) {
                                return;
                            }
                            this.lastPosition = jM2590plusMKHz9U2;
                            this.dragTotalDistance = Offset.INSTANCE.m2601getZeroF1C5BW0();
                        }
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* JADX INFO: renamed from: onStart-k-4lQ0M, reason: not valid java name */
                public void mo865onStartk4lQ0M(long startPoint) {
                    LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                    if (layoutCoordinates != null) {
                        TextController textController = TextController.this;
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        if (!layoutCoordinates.isAttached()) {
                            return;
                        }
                        if (textController.m860outOfBoundary0a9Yr6o(startPoint, startPoint)) {
                            selectionRegistrar2.notifySelectionUpdateSelectAll(textController.getState().getSelectableId());
                        } else {
                            selectionRegistrar2.mo979notifySelectionUpdateStartd4ec7I(layoutCoordinates, startPoint, SelectionAdjustment.INSTANCE.getWord());
                        }
                        this.lastPosition = startPoint;
                    }
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, TextController.this.getState().getSelectableId())) {
                        this.dragTotalDistance = Offset.INSTANCE.m2601getZeroF1C5BW0();
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onStop() {
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, TextController.this.getState().getSelectableId())) {
                        selectionRegistrar.notifySelectionUpdateEnd();
                    }
                }

                public final void setDragTotalDistance(long j) {
                    this.dragTotalDistance = j;
                }

                public final void setLastPosition(long j) {
                    this.lastPosition = j;
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onUp() {
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* JADX INFO: renamed from: onDown-k-4lQ0M, reason: not valid java name */
                public void mo863onDownk4lQ0M(long point) {
                }
            });
            modifierPointerHoverIcon$default = SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, getLongPressDragObserver(), new AnonymousClass2(null));
        } else {
            ?? r0 = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.TextController$update$mouseSelectionObserver$1
                private long lastPosition = Offset.INSTANCE.m2601getZeroF1C5BW0();

                public final long getLastPosition() {
                    return this.lastPosition;
                }

                @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                /* JADX INFO: renamed from: onDrag-3MmeM6k, reason: not valid java name */
                public boolean mo866onDrag3MmeM6k(long dragPosition, SelectionAdjustment adjustment) {
                    m.h(adjustment, "adjustment");
                    LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
                    if (layoutCoordinates != null) {
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        TextController textController = this.this$0;
                        if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId())) {
                            return false;
                        }
                        if (selectionRegistrar2.mo978notifySelectionUpdate5iVPX68(layoutCoordinates, dragPosition, this.lastPosition, false, adjustment)) {
                            this.lastPosition = dragPosition;
                        }
                    }
                    return true;
                }

                @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                /* JADX INFO: renamed from: onExtend-k-4lQ0M, reason: not valid java name */
                public boolean mo867onExtendk4lQ0M(long downPosition) {
                    LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return false;
                    }
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    TextController textController = this.this$0;
                    if (!layoutCoordinates.isAttached()) {
                        return false;
                    }
                    if (selectionRegistrar2.mo978notifySelectionUpdate5iVPX68(layoutCoordinates, downPosition, this.lastPosition, false, SelectionAdjustment.INSTANCE.getNone())) {
                        this.lastPosition = downPosition;
                    }
                    return SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId());
                }

                @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                /* JADX INFO: renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
                public boolean mo868onExtendDragk4lQ0M(long dragPosition) {
                    LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return true;
                    }
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    TextController textController = this.this$0;
                    if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId())) {
                        return false;
                    }
                    if (!selectionRegistrar2.mo978notifySelectionUpdate5iVPX68(layoutCoordinates, dragPosition, this.lastPosition, false, SelectionAdjustment.INSTANCE.getNone())) {
                        return true;
                    }
                    this.lastPosition = dragPosition;
                    return true;
                }

                @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                /* JADX INFO: renamed from: onStart-3MmeM6k, reason: not valid java name */
                public boolean mo869onStart3MmeM6k(long downPosition, SelectionAdjustment adjustment) {
                    m.h(adjustment, "adjustment");
                    LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return false;
                    }
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    TextController textController = this.this$0;
                    if (!layoutCoordinates.isAttached()) {
                        return false;
                    }
                    selectionRegistrar2.mo979notifySelectionUpdateStartd4ec7I(layoutCoordinates, downPosition, adjustment);
                    this.lastPosition = downPosition;
                    return SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId());
                }

                public final void setLastPosition(long j) {
                    this.lastPosition = j;
                }
            };
            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, (Object) r0, new AnonymousClass3(r0, null)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
        }
        this.selectionModifiers = modifierPointerHoverIcon$default;
    }
}
