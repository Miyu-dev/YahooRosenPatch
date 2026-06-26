package androidx.compose.foundation.text;

import a.f;
import androidx.appcompat.R;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextFieldScroll.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b$\b\u0001\u0018\u0000 42\u00020\u0001:\u00014B\u0019\u0012\u0006\u0010/\u001a\u00020\u0002\u0012\b\b\u0002\u00100\u001a\u00020\u000b¢\u0006\u0004\b1\u00102B\t\b\u0016¢\u0006\u0004\b1\u00103J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J'\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R+\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010!\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R+\u0010$\u001a\u00020\u00118\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/geometry/Rect;", "cursorRect", "", "containerSize", "textFieldSize", "Lkotlin/j;", "update", "", "cursorStart", "cursorEnd", "coerceOffset$foundation_release", "(FFI)V", "coerceOffset", "Landroidx/compose/ui/text/TextRange;", "selection", "getOffsetToFollow-5zc-tL8", "(J)I", "getOffsetToFollow", "<set-?>", "offset$delegate", "Landroidx/compose/runtime/MutableState;", "getOffset", "()F", "setOffset", "(F)V", TypedValues.CycleType.S_WAVE_OFFSET, "maximum$delegate", "getMaximum", "setMaximum", "maximum", "previousCursorRect", "Landroidx/compose/ui/geometry/Rect;", "previousSelection", "J", "getPreviousSelection-d9O1mEE", "()J", "setPreviousSelection-5zc-tL8", "(J)V", "orientation$delegate", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "setOrientation", "(Landroidx/compose/foundation/gestures/Orientation;)V", "initialOrientation", "initial", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;F)V", "()V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class TextFieldScrollerPosition {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<TextFieldScrollerPosition, Object> Saver = ListSaverKt.listSaver(new p<SaverScope, TextFieldScrollerPosition, List<? extends Object>>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$1
        public final List<Object> invoke(SaverScope saverScope, TextFieldScrollerPosition textFieldScrollerPosition) {
            m.h(saverScope, "$this$listSaver");
            m.h(textFieldScrollerPosition, "it");
            Object[] objArr = new Object[2];
            objArr[0] = Float.valueOf(textFieldScrollerPosition.getOffset());
            objArr[1] = Boolean.valueOf(textFieldScrollerPosition.getOrientation() == Orientation.Vertical);
            return f.V(objArr);
        }
    }, new l<List<? extends Object>, TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$2
        public final TextFieldScrollerPosition invoke(List<? extends Object> list) {
            m.h(list, "restored");
            Object obj = list.get(1);
            m.f(obj, "null cannot be cast to non-null type kotlin.Boolean");
            Orientation orientation = ((Boolean) obj).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
            Object obj2 = list.get(0);
            m.f(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new TextFieldScrollerPosition(orientation, ((Float) obj2).floatValue());
        }
    });

    /* JADX INFO: renamed from: maximum$delegate, reason: from kotlin metadata */
    private final MutableState maximum;

    /* JADX INFO: renamed from: offset$delegate, reason: from kotlin metadata */
    private final MutableState offset;

    /* JADX INFO: renamed from: orientation$delegate, reason: from kotlin metadata */
    private final MutableState orientation;
    private Rect previousCursorRect;
    private long previousSelection;

    /* JADX INFO: compiled from: TextFieldScroll.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<TextFieldScrollerPosition, Object> getSaver() {
            return TextFieldScrollerPosition.Saver;
        }

        private Companion() {
        }
    }

    public TextFieldScrollerPosition(Orientation orientation, float f) {
        m.h(orientation, "initialOrientation");
        this.offset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), null, 2, null);
        this.maximum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
        this.previousCursorRect = Rect.INSTANCE.getZero();
        this.previousSelection = TextRange.INSTANCE.m4816getZerod9O1mEE();
        this.orientation = SnapshotStateKt.mutableStateOf(orientation, SnapshotStateKt.structuralEqualityPolicy());
    }

    private final void setMaximum(float f) {
        this.maximum.setValue(Float.valueOf(f));
    }

    public final void coerceOffset$foundation_release(float cursorStart, float cursorEnd, int containerSize) {
        float offset = getOffset();
        float f = containerSize;
        float f2 = offset + f;
        setOffset(getOffset() + ((cursorEnd <= f2 && (cursorStart >= offset || cursorEnd - cursorStart <= f)) ? (cursorStart >= offset || cursorEnd - cursorStart > f) ? 0.0f : cursorStart - offset : cursorEnd - f2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getMaximum() {
        return ((Number) this.maximum.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getOffset() {
        return ((Number) this.offset.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: getOffsetToFollow-5zc-tL8, reason: not valid java name */
    public final int m889getOffsetToFollow5zctL8(long selection) {
        return TextRange.m4811getStartimpl(selection) != TextRange.m4811getStartimpl(this.previousSelection) ? TextRange.m4811getStartimpl(selection) : TextRange.m4806getEndimpl(selection) != TextRange.m4806getEndimpl(this.previousSelection) ? TextRange.m4806getEndimpl(selection) : TextRange.m4809getMinimpl(selection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Orientation getOrientation() {
        return (Orientation) this.orientation.getValue();
    }

    /* JADX INFO: renamed from: getPreviousSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getPreviousSelection() {
        return this.previousSelection;
    }

    public final void setOffset(float f) {
        this.offset.setValue(Float.valueOf(f));
    }

    public final void setOrientation(Orientation orientation) {
        m.h(orientation, "<set-?>");
        this.orientation.setValue(orientation);
    }

    /* JADX INFO: renamed from: setPreviousSelection-5zc-tL8, reason: not valid java name */
    public final void m891setPreviousSelection5zctL8(long j) {
        this.previousSelection = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update(androidx.compose.foundation.gestures.Orientation r5, androidx.compose.ui.geometry.Rect r6, int r7, int r8) {
        /*
            r4 = this;
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.m.h(r5, r0)
            java.lang.String r0 = "cursorRect"
            kotlin.jvm.internal.m.h(r6, r0)
            int r8 = r8 - r7
            float r8 = (float) r8
            r4.setMaximum(r8)
            float r0 = r6.getLeft()
            androidx.compose.ui.geometry.Rect r1 = r4.previousCursorRect
            float r1 = r1.getLeft()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L22
            r0 = r1
            goto L23
        L22:
            r0 = r2
        L23:
            if (r0 == 0) goto L38
            float r0 = r6.getTop()
            androidx.compose.ui.geometry.Rect r3 = r4.previousCursorRect
            float r3 = r3.getTop()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L35
            r0 = r1
            goto L36
        L35:
            r0 = r2
        L36:
            if (r0 != 0) goto L59
        L38:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r5 != r0) goto L3d
            goto L3e
        L3d:
            r1 = r2
        L3e:
            if (r1 == 0) goto L45
            float r5 = r6.getTop()
            goto L49
        L45:
            float r5 = r6.getLeft()
        L49:
            if (r1 == 0) goto L50
            float r0 = r6.getBottom()
            goto L54
        L50:
            float r0 = r6.getRight()
        L54:
            r4.coerceOffset$foundation_release(r5, r0, r7)
            r4.previousCursorRect = r6
        L59:
            float r5 = r4.getOffset()
            r6 = 0
            float r5 = a.l.h(r5, r6, r8)
            r4.setOffset(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldScrollerPosition.update(androidx.compose.foundation.gestures.Orientation, androidx.compose.ui.geometry.Rect, int, int):void");
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, (i2 & 2) != 0 ? 0.0f : f);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }
}
