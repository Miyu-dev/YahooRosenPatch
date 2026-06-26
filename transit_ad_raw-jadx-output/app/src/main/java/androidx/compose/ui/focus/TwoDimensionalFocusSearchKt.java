package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeKind;
import androidx.constraintlayout.core.widgets.Optimizer;
import kj.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TwoDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a7\u0010\b\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a=\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u001a\u0010\u0016\u001a\u00020\u0015*\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u0013H\u0003\u001a1\u0010\u001b\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0001H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a5\u0010!\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a5\u0010&\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010 \u001a\f\u0010'\u001a\u00020\u0017*\u00020\u0017H\u0002\u001a\f\u0010(\u001a\u00020\u0017*\u00020\u0017H\u0002\u001a\f\u0010)\u001a\u00020\u0000*\u00020\u0000H\u0003\"\u0014\u0010+\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "", "onFound", "twoDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkj/l;)Ljava/lang/Boolean;", "twoDimensionalFocusSearch", "findChildCorrespondingToFocusEnter--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkj/l;)Z", "findChildCorrespondingToFocusEnter", "focusedItem", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkj/l;)Z", "generateAndSearchChildren", "searchChildren-4C6V_qg", "searchChildren", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/runtime/collection/MutableVector;", "accessibleChildren", "Lkotlin/j;", "collectAccessibleChildren", "Landroidx/compose/ui/geometry/Rect;", "focusRect", "findBestCandidate-4WY_MpI", "(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/focus/FocusTargetModifierNode;", "findBestCandidate", "proposedCandidate", "currentCandidate", "focusedRect", "isBetterCandidate-I7lrPNg", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "isBetterCandidate", "source", "rect1", "rect2", "beamBeats-I7lrPNg", "beamBeats", "topLeft", "bottomRight", "activeNode", "", "InvalidFocusDirection", "Ljava/lang/String;", "NoActiveChild", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class TwoDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 2-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    /* JADX INFO: compiled from: TwoDimensionalFocusSearch.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @ExperimentalComposeUiApi
    private static final FocusTargetModifierNode activeNode(FocusTargetModifierNode focusTargetModifierNode) throws NoWhenBranchMatchedException {
        if (!(focusTargetModifierNode.getFocusState() == FocusStateImpl.ActiveParent)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetModifierNode);
        if (focusTargetModifierNodeFindActiveFocusNode != null) {
            return focusTargetModifierNodeFindActiveFocusNode;
        }
        throw new IllegalStateException(NoActiveChild.toString());
    }

    /* JADX INFO: renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    private static final boolean m2544beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i2) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i2, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i2, rect)) {
            return false;
        }
        if (beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i2, rect)) {
            FocusDirection.Companion companion = FocusDirection.INSTANCE;
            if (!FocusDirection.m2506equalsimpl0(i2, companion.m2518getLeftdhqQ8s()) && !FocusDirection.m2506equalsimpl0(i2, companion.m2522getRightdhqQ8s()) && beamBeats_I7lrPNg$majorAxisDistance$15(rect2, i2, rect) >= beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i2, rect)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i2, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!(FocusDirection.m2506equalsimpl0(i2, companion.m2518getLeftdhqQ8s()) ? true : FocusDirection.m2506equalsimpl0(i2, companion.m2522getRightdhqQ8s()))) {
            if (!(FocusDirection.m2506equalsimpl0(i2, companion.m2523getUpdhqQ8s()) ? true : FocusDirection.m2506equalsimpl0(i2, companion.m2514getDowndhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            if (rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight()) {
                return true;
            }
        } else if (rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom()) {
            return true;
        }
        return false;
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i2, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2506equalsimpl0(i2, companion.m2518getLeftdhqQ8s())) {
            if (rect2.getLeft() >= rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m2506equalsimpl0(i2, companion.m2522getRightdhqQ8s())) {
            if (rect2.getRight() <= rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m2506equalsimpl0(i2, companion.m2523getUpdhqQ8s())) {
            if (rect2.getTop() >= rect.getBottom()) {
                return true;
            }
        } else {
            if (!FocusDirection.m2506equalsimpl0(i2, companion.m2514getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            if (rect2.getBottom() <= rect.getTop()) {
                return true;
            }
        }
        return false;
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistance$15(Rect rect, int i2, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m2506equalsimpl0(i2, companion.m2518getLeftdhqQ8s())) {
            if (FocusDirection.m2506equalsimpl0(i2, companion.m2522getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m2506equalsimpl0(i2, companion.m2523getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m2506equalsimpl0(i2, companion.m2514getDowndhqQ8s())) {
                    throw new IllegalStateException(InvalidFocusDirection.toString());
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f = top - bottom;
            return Math.max(0.0f, f);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f = top2 - bottom2;
        return Math.max(0.0f, f);
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect, int i2, Rect rect2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m2506equalsimpl0(i2, companion.m2518getLeftdhqQ8s())) {
            if (FocusDirection.m2506equalsimpl0(i2, companion.m2522getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m2506equalsimpl0(i2, companion.m2523getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else {
                if (!FocusDirection.m2506equalsimpl0(i2, companion.m2514getDowndhqQ8s())) {
                    throw new IllegalStateException(InvalidFocusDirection.toString());
                }
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            }
            f = bottom - bottom2;
            return Math.max(1.0f, f);
        }
        top = rect2.getLeft();
        top2 = rect.getLeft();
        f = top - top2;
        return Math.max(1.0f, f);
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1 A[SYNTHETIC] */
    @androidx.compose.ui.ExperimentalComposeUiApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void collectAccessibleChildren(androidx.compose.ui.node.DelegatableNode r9, androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusTargetModifierNode> r10) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.collectAccessibleChildren(androidx.compose.ui.node.DelegatableNode, androidx.compose.runtime.collection.MutableVector):void");
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    private static final FocusTargetModifierNode m2545findBestCandidate4WY_MpI(MutableVector<FocusTargetModifierNode> mutableVector, Rect rect, int i2) {
        Rect rectTranslate;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2506equalsimpl0(i2, companion.m2518getLeftdhqQ8s())) {
            rectTranslate = rect.translate(rect.getWidth() + 1, 0.0f);
        } else if (FocusDirection.m2506equalsimpl0(i2, companion.m2522getRightdhqQ8s())) {
            rectTranslate = rect.translate(-(rect.getWidth() + 1), 0.0f);
        } else if (FocusDirection.m2506equalsimpl0(i2, companion.m2523getUpdhqQ8s())) {
            rectTranslate = rect.translate(0.0f, rect.getHeight() + 1);
        } else {
            if (!FocusDirection.m2506equalsimpl0(i2, companion.m2514getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            rectTranslate = rect.translate(0.0f, -(rect.getHeight() + 1));
        }
        int size = mutableVector.getSize();
        FocusTargetModifierNode focusTargetModifierNode = null;
        if (size > 0) {
            FocusTargetModifierNode[] content = mutableVector.getContent();
            int i3 = 0;
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = content[i3];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2)) {
                    Rect rectFocusRect = FocusTraversalKt.focusRect(focusTargetModifierNode2);
                    if (m2548isBetterCandidateI7lrPNg(rectFocusRect, rectTranslate, rect, i2)) {
                        focusTargetModifierNode = focusTargetModifierNode2;
                        rectTranslate = rectFocusRect;
                    }
                }
                i3++;
            } while (i3 < size);
        }
        return focusTargetModifierNode;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: findChildCorrespondingToFocusEnter--OM-vw8, reason: not valid java name */
    public static final boolean m2546findChildCorrespondingToFocusEnterOMvw8(FocusTargetModifierNode focusTargetModifierNode, int i2, l<? super FocusTargetModifierNode, Boolean> lVar) {
        Rect rectBottomRight;
        m.h(focusTargetModifierNode, "$this$findChildCorrespondingToFocusEnter");
        m.h(lVar, "onFound");
        Object objInvoke = focusTargetModifierNode.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m2503boximpl(i2));
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        if (m.c((FocusRequester) objInvoke, companion.getDefault())) {
            objInvoke = null;
        }
        FocusRequester focusRequester = (FocusRequester) objInvoke;
        if (focusRequester != null) {
            if (m.c(focusRequester, companion.getCancel())) {
                return false;
            }
            return focusRequester.findFocusTarget$ui_release(lVar);
        }
        MutableVector mutableVector = new MutableVector(new FocusTargetModifierNode[16], 0);
        collectAccessibleChildren(focusTargetModifierNode, mutableVector);
        if (mutableVector.getSize() <= 1) {
            FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) (mutableVector.isEmpty() ? null : mutableVector.getContent()[0]);
            if (focusTargetModifierNode2 != null) {
                return ((Boolean) lVar.invoke(focusTargetModifierNode2)).booleanValue();
            }
            return false;
        }
        FocusDirection.Companion companion2 = FocusDirection.INSTANCE;
        if (FocusDirection.m2506equalsimpl0(i2, companion2.m2515getEnterdhqQ8s())) {
            i2 = companion2.m2522getRightdhqQ8s();
        }
        if (FocusDirection.m2506equalsimpl0(i2, companion2.m2522getRightdhqQ8s()) ? true : FocusDirection.m2506equalsimpl0(i2, companion2.m2514getDowndhqQ8s())) {
            rectBottomRight = topLeft(FocusTraversalKt.focusRect(focusTargetModifierNode));
        } else {
            if (!(FocusDirection.m2506equalsimpl0(i2, companion2.m2518getLeftdhqQ8s()) ? true : FocusDirection.m2506equalsimpl0(i2, companion2.m2523getUpdhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            rectBottomRight = bottomRight(FocusTraversalKt.focusRect(focusTargetModifierNode));
        }
        FocusTargetModifierNode focusTargetModifierNodeM2545findBestCandidate4WY_MpI = m2545findBestCandidate4WY_MpI(mutableVector, rectBottomRight, i2);
        if (focusTargetModifierNodeM2545findBestCandidate4WY_MpI != null) {
            return ((Boolean) lVar.invoke(focusTargetModifierNodeM2545findBestCandidate4WY_MpI)).booleanValue();
        }
        return false;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m2547generateAndSearchChildren4C6V_qg(final FocusTargetModifierNode focusTargetModifierNode, final FocusTargetModifierNode focusTargetModifierNode2, final int i2, final l<? super FocusTargetModifierNode, Boolean> lVar) {
        if (m2549searchChildren4C6V_qg(focusTargetModifierNode, focusTargetModifierNode2, i2, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m2502searchBeyondBoundsOMvw8(focusTargetModifierNode, i2, new l<BeyondBoundsLayout.BeyondBoundsScope, Boolean>() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                m.h(beyondBoundsScope, "$this$searchBeyondBounds");
                Boolean boolValueOf = Boolean.valueOf(TwoDimensionalFocusSearchKt.m2549searchChildren4C6V_qg(focusTargetModifierNode, focusTargetModifierNode2, i2, lVar));
                if (boolValueOf.booleanValue() || !beyondBoundsScope.getHasMoreContent()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    private static final boolean m2548isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i2) {
        if (isBetterCandidate_I7lrPNg$isCandidate(rect, i2, rect3)) {
            return !isBetterCandidate_I7lrPNg$isCandidate(rect2, i2, rect3) || m2544beamBeatsI7lrPNg(rect3, rect, rect2, i2) || (!m2544beamBeatsI7lrPNg(rect3, rect2, rect, i2) && isBetterCandidate_I7lrPNg$weightedDistance(i2, rect3, rect) < isBetterCandidate_I7lrPNg$weightedDistance(i2, rect3, rect2));
        }
        return false;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i2, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2506equalsimpl0(i2, companion.m2518getLeftdhqQ8s())) {
            if ((rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m2506equalsimpl0(i2, companion.m2522getRightdhqQ8s())) {
            if ((rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m2506equalsimpl0(i2, companion.m2523getUpdhqQ8s())) {
            if ((rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop()) {
                return true;
            }
        } else {
            if (!FocusDirection.m2506equalsimpl0(i2, companion.m2514getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            if ((rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom()) {
                return true;
            }
        }
        return false;
    }

    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect, int i2, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m2506equalsimpl0(i2, companion.m2518getLeftdhqQ8s())) {
            if (FocusDirection.m2506equalsimpl0(i2, companion.m2522getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m2506equalsimpl0(i2, companion.m2523getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m2506equalsimpl0(i2, companion.m2514getDowndhqQ8s())) {
                    throw new IllegalStateException(InvalidFocusDirection.toString());
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f = top - bottom;
            return Math.max(0.0f, f);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f = top2 - bottom2;
        return Math.max(0.0f, f);
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i2, Rect rect2) {
        float f;
        float width;
        float left;
        float width2;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2506equalsimpl0(i2, companion.m2518getLeftdhqQ8s()) ? true : FocusDirection.m2506equalsimpl0(i2, companion.m2522getRightdhqQ8s())) {
            f = 2;
            width = (rect2.getHeight() / f) + rect2.getTop();
            left = rect.getTop();
            width2 = rect.getHeight();
        } else {
            if (!(FocusDirection.m2506equalsimpl0(i2, companion.m2523getUpdhqQ8s()) ? true : FocusDirection.m2506equalsimpl0(i2, companion.m2514getDowndhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f = 2;
            width = (rect2.getWidth() / f) + rect2.getLeft();
            left = rect.getLeft();
            width2 = rect.getWidth();
        }
        return width - ((width2 / f) + left);
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i2, Rect rect, Rect rect2) {
        long jAbs = (long) Math.abs(isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i2, rect));
        long jAbs2 = (long) Math.abs(isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i2, rect));
        return (jAbs2 * jAbs2) + (((long) 13) * jAbs * jAbs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m2549searchChildren4C6V_qg(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i2, l<? super FocusTargetModifierNode, Boolean> lVar) {
        FocusTargetModifierNode focusTargetModifierNodeM2545findBestCandidate4WY_MpI;
        MutableVector mutableVector = new MutableVector(new FocusTargetModifierNode[16], 0);
        int iM4446constructorimpl = NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GROUPING);
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetModifierNode.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & iM4446constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, child2);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & iM4446constructorimpl) == 0) {
                        child2 = child2.getChild();
                    } else if (child2 instanceof FocusTargetModifierNode) {
                        mutableVector.add((FocusTargetModifierNode) child2);
                    }
                }
            }
        }
        while (mutableVector.isNotEmpty() && (focusTargetModifierNodeM2545findBestCandidate4WY_MpI = m2545findBestCandidate4WY_MpI(mutableVector, FocusTraversalKt.focusRect(focusTargetModifierNode2), i2)) != null) {
            if (focusTargetModifierNodeM2545findBestCandidate4WY_MpI.fetchFocusProperties$ui_release().getCanFocus()) {
                return ((Boolean) lVar.invoke(focusTargetModifierNodeM2545findBestCandidate4WY_MpI)).booleanValue();
            }
            Object objInvoke = focusTargetModifierNodeM2545findBestCandidate4WY_MpI.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m2503boximpl(i2));
            FocusRequester.Companion companion = FocusRequester.INSTANCE;
            if (m.c((FocusRequester) objInvoke, companion.getDefault())) {
                objInvoke = null;
            }
            FocusRequester focusRequester = (FocusRequester) objInvoke;
            if (focusRequester != null) {
                if (m.c(focusRequester, companion.getCancel())) {
                    return false;
                }
                return focusRequester.findFocusTarget$ui_release(lVar);
            }
            if (m2547generateAndSearchChildren4C6V_qg(focusTargetModifierNodeM2545findBestCandidate4WY_MpI, focusTargetModifierNode2, i2, lVar)) {
                return true;
            }
            mutableVector.remove(focusTargetModifierNodeM2545findBestCandidate4WY_MpI);
        }
        return false;
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: twoDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final Boolean m2550twoDimensionalFocusSearchOMvw8(FocusTargetModifierNode focusTargetModifierNode, int i2, l<? super FocusTargetModifierNode, Boolean> lVar) {
        m.h(focusTargetModifierNode, "$this$twoDimensionalFocusSearch");
        m.h(lVar, "onFound");
        FocusStateImpl focusStateImpl = focusTargetModifierNode.getFocusStateImpl();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i3 = iArr[focusStateImpl.ordinal()];
        if (i3 != 1) {
            if (i3 == 2 || i3 == 3) {
                return Boolean.valueOf(m2546findChildCorrespondingToFocusEnterOMvw8(focusTargetModifierNode, i2, lVar));
            }
            if (i3 == 4) {
                return focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus() ? (Boolean) lVar.invoke(focusTargetModifierNode) : Boolean.FALSE;
            }
            throw new NoWhenBranchMatchedException();
        }
        FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(focusTargetModifierNode);
        if (activeChild == null) {
            throw new IllegalStateException(NoActiveChild.toString());
        }
        int i4 = iArr[activeChild.getFocusStateImpl().ordinal()];
        if (i4 != 1) {
            if (i4 == 2 || i4 == 3) {
                return Boolean.valueOf(m2547generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, i2, lVar));
            }
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException(NoActiveChild.toString());
        }
        Boolean boolM2550twoDimensionalFocusSearchOMvw8 = m2550twoDimensionalFocusSearchOMvw8(activeChild, i2, lVar);
        if (!m.c(boolM2550twoDimensionalFocusSearchOMvw8, Boolean.FALSE)) {
            return boolM2550twoDimensionalFocusSearchOMvw8;
        }
        Object objInvoke = activeChild.fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m2503boximpl(i2));
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        if (m.c((FocusRequester) objInvoke, companion.getDefault())) {
            objInvoke = null;
        }
        FocusRequester focusRequester = (FocusRequester) objInvoke;
        if (focusRequester == null) {
            return Boolean.valueOf(m2547generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeNode(activeChild), i2, lVar));
        }
        if (m.c(focusRequester, companion.getCancel())) {
            return null;
        }
        return Boolean.valueOf(focusRequester.findFocusTarget$ui_release(lVar));
    }
}
