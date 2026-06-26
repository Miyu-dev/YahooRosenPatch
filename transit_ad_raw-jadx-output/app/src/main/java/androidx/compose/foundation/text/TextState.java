package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: CoreText.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R.\u0010&\u001a\u0004\u0018\u00010\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u0010-\u001a\u00020,8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u00100R+\u00102\u001a\u0002018\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u00100R+\u0010<\u001a\u00020\t2\u0006\u00105\u001a\u00020\t8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R+\u0010@\u001a\u00020\t2\u0006\u00105\u001a\u00020\t8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/foundation/text/TextState;", "", "", "selectableId", "J", "getSelectableId", "()J", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/j;", "onTextLayout", "Lkj/l;", "getOnTextLayout", "()Lkj/l;", "setOnTextLayout", "(Lkj/l;)V", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "Landroidx/compose/foundation/text/selection/Selectable;", "getSelectable", "()Landroidx/compose/foundation/text/selection/Selectable;", "setSelectable", "(Landroidx/compose/foundation/text/selection/Selectable;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/foundation/text/TextDelegate;", "value", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "getTextDelegate", "()Landroidx/compose/foundation/text/TextDelegate;", "setTextDelegate", "(Landroidx/compose/foundation/text/TextDelegate;)V", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "setLayoutResult", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "Landroidx/compose/ui/geometry/Offset;", "previousGlobalPosition", "getPreviousGlobalPosition-F1C5BW0", "setPreviousGlobalPosition-k-4lQ0M", "(J)V", "Landroidx/compose/ui/graphics/Color;", "selectionBackgroundColor", "getSelectionBackgroundColor-0d7_KjU", "setSelectionBackgroundColor-8_81llA", "<set-?>", "drawScopeInvalidation$delegate", "Landroidx/compose/runtime/MutableState;", "getDrawScopeInvalidation", "()Lkotlin/j;", "setDrawScopeInvalidation", "(Lkotlin/j;)V", "drawScopeInvalidation", "layoutInvalidation$delegate", "getLayoutInvalidation", "setLayoutInvalidation", "layoutInvalidation", "<init>", "(Landroidx/compose/foundation/text/TextDelegate;J)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class TextState {

    /* JADX INFO: renamed from: drawScopeInvalidation$delegate, reason: from kotlin metadata */
    private final MutableState drawScopeInvalidation;
    private LayoutCoordinates layoutCoordinates;

    /* JADX INFO: renamed from: layoutInvalidation$delegate, reason: from kotlin metadata */
    private final MutableState layoutInvalidation;
    private TextLayoutResult layoutResult;
    private l<? super TextLayoutResult, j> onTextLayout;
    private long previousGlobalPosition;
    private Selectable selectable;
    private final long selectableId;
    private long selectionBackgroundColor;
    private TextDelegate textDelegate;

    public TextState(TextDelegate textDelegate, long j) {
        m.h(textDelegate, "textDelegate");
        this.selectableId = j;
        this.onTextLayout = new l<TextLayoutResult, j>() { // from class: androidx.compose.foundation.text.TextState$onTextLayout$1
            public final void invoke(TextLayoutResult textLayoutResult) {
                m.h(textLayoutResult, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextLayoutResult) obj);
                return j.a;
            }
        };
        this.textDelegate = textDelegate;
        this.previousGlobalPosition = Offset.INSTANCE.m2601getZeroF1C5BW0();
        this.selectionBackgroundColor = Color.INSTANCE.m2854getUnspecified0d7_KjU();
        j jVar = j.a;
        this.drawScopeInvalidation = SnapshotStateKt.mutableStateOf(jVar, SnapshotStateKt.neverEqualPolicy());
        this.layoutInvalidation = SnapshotStateKt.mutableStateOf(jVar, SnapshotStateKt.neverEqualPolicy());
    }

    private final void setDrawScopeInvalidation(j jVar) {
        this.drawScopeInvalidation.setValue(jVar);
    }

    private final void setLayoutInvalidation(j jVar) {
        this.layoutInvalidation.setValue(jVar);
    }

    public final j getDrawScopeInvalidation() {
        this.drawScopeInvalidation.getValue();
        return j.a;
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public final j getLayoutInvalidation() {
        this.layoutInvalidation.getValue();
        return j.a;
    }

    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    public final l<TextLayoutResult, j> getOnTextLayout() {
        return this.onTextLayout;
    }

    /* JADX INFO: renamed from: getPreviousGlobalPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPreviousGlobalPosition() {
        return this.previousGlobalPosition;
    }

    public final Selectable getSelectable() {
        return this.selectable;
    }

    public final long getSelectableId() {
        return this.selectableId;
    }

    /* JADX INFO: renamed from: getSelectionBackgroundColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectionBackgroundColor() {
        return this.selectionBackgroundColor;
    }

    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }

    public final void setLayoutResult(TextLayoutResult textLayoutResult) {
        setDrawScopeInvalidation(j.a);
        this.layoutResult = textLayoutResult;
    }

    public final void setOnTextLayout(l<? super TextLayoutResult, j> lVar) {
        m.h(lVar, "<set-?>");
        this.onTextLayout = lVar;
    }

    /* JADX INFO: renamed from: setPreviousGlobalPosition-k-4lQ0M, reason: not valid java name */
    public final void m909setPreviousGlobalPositionk4lQ0M(long j) {
        this.previousGlobalPosition = j;
    }

    public final void setSelectable(Selectable selectable) {
        this.selectable = selectable;
    }

    /* JADX INFO: renamed from: setSelectionBackgroundColor-8_81llA, reason: not valid java name */
    public final void m910setSelectionBackgroundColor8_81llA(long j) {
        this.selectionBackgroundColor = j;
    }

    public final void setTextDelegate(TextDelegate textDelegate) {
        m.h(textDelegate, "value");
        setLayoutInvalidation(j.a);
        this.textDelegate = textDelegate;
    }
}
