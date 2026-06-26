package androidx.compose.foundation.text;

import a.b;
import androidx.appcompat.R;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import kj.a;
import kj.l;
import kj.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextFieldScroll.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\u001a4\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0000\u001a*\u0010\u0017\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\nH\u0000¨\u0006\u001b"}, d2 = {"getCursorRectInScroller", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/Density;", "cursorOffset", "", "transformedText", "Landroidx/compose/ui/text/input/TransformedText;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "rtl", "", "textFieldWidth", "textFieldScroll", "Landroidx/compose/ui/Modifier;", "scrollerPosition", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "textLayoutResultProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "textFieldScrollable", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TextFieldScrollKt {

    /* JADX INFO: compiled from: TextFieldScroll.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getCursorRectInScroller(Density density, int i2, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z, int i3) {
        Rect zero;
        if (textLayoutResult == null || (zero = textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(i2))) == null) {
            zero = Rect.INSTANCE.getZero();
        }
        Rect rect = zero;
        int iMo342roundToPx0680j_4 = density.mo342roundToPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
        return Rect.copy$default(rect, z ? (i3 - rect.getLeft()) - iMo342roundToPx0680j_4 : rect.getLeft(), 0.0f, z ? i3 - rect.getLeft() : rect.getLeft() + iMo342roundToPx0680j_4, 0.0f, 10, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Modifier textFieldScroll(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, a<TextLayoutResultProxy> aVar) throws NoWhenBranchMatchedException {
        Modifier verticalScrollLayoutModifier;
        m.h(modifier, "<this>");
        m.h(textFieldScrollerPosition, "scrollerPosition");
        m.h(textFieldValue, "textFieldValue");
        m.h(visualTransformation, "visualTransformation");
        m.h(aVar, "textLayoutResultProvider");
        Orientation orientation = textFieldScrollerPosition.getOrientation();
        int iM889getOffsetToFollow5zctL8 = textFieldScrollerPosition.m889getOffsetToFollow5zctL8(textFieldValue.getSelection());
        textFieldScrollerPosition.m891setPreviousSelection5zctL8(textFieldValue.getSelection());
        TransformedText transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation, textFieldValue.getAnnotatedString());
        int i2 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i2 == 1) {
            verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(textFieldScrollerPosition, iM889getOffsetToFollow5zctL8, transformedTextFilterWithValidation, aVar);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(textFieldScrollerPosition, iM889getOffsetToFollow5zctL8, transformedTextFilterWithValidation, aVar);
        }
        return ClipKt.clipToBounds(modifier).then(verticalScrollLayoutModifier);
    }

    public static final Modifier textFieldScrollable(Modifier modifier, final TextFieldScrollerPosition textFieldScrollerPosition, final MutableInteractionSource mutableInteractionSource, final boolean z) {
        m.h(modifier, "<this>");
        m.h(textFieldScrollerPosition, "scrollerPosition");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                b.d(inspectorInfo, "$this$null", "textFieldScrollable").set("scrollerPosition", textFieldScrollerPosition);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
            @androidx.compose.runtime.Composable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier r13, androidx.compose.runtime.Composer r14, int r15) {
                /*
                    r12 = this;
                    java.lang.String r0 = "$this$composed"
                    r1 = 805428266(0x3001dc2a, float:4.72428E-10)
                    boolean r13 = androidx.compose.animation.b.n(r13, r0, r14, r1)
                    if (r13 == 0) goto L11
                    r13 = -1
                    java.lang.String r0 = "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:65)"
                    androidx.compose.runtime.ComposerKt.traceEventStart(r1, r15, r13, r0)
                L11:
                    androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
                    java.lang.Object r13 = r14.consume(r13)
                    androidx.compose.ui.unit.LayoutDirection r15 = androidx.compose.ui.unit.LayoutDirection.Rtl
                    r0 = 1
                    r1 = 0
                    if (r13 != r15) goto L21
                    r13 = r0
                    goto L22
                L21:
                    r13 = r1
                L22:
                    androidx.compose.foundation.text.TextFieldScrollerPosition r15 = r1
                    androidx.compose.foundation.gestures.Orientation r15 = r15.getOrientation()
                    androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
                    if (r15 == r2) goto L31
                    if (r13 != 0) goto L2f
                    goto L31
                L2f:
                    r7 = r1
                    goto L32
                L31:
                    r7 = r0
                L32:
                    androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r1
                    r15 = 1157296644(0x44faf204, float:2007.563)
                    r14.startReplaceableGroup(r15)
                    boolean r15 = r14.changed(r13)
                    java.lang.Object r2 = r14.rememberedValue()
                    if (r15 != 0) goto L4c
                    androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.INSTANCE
                    java.lang.Object r15 = r15.getEmpty()
                    if (r2 != r15) goto L54
                L4c:
                    androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1 r2 = new androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1
                    r2.<init>()
                    r14.updateRememberedValue(r2)
                L54:
                    r14.endReplaceableGroup()
                    kj.l r2 = (kj.l) r2
                    androidx.compose.foundation.gestures.ScrollableState r13 = androidx.compose.foundation.gestures.ScrollableStateKt.rememberScrollableState(r2, r14, r1)
                    androidx.compose.foundation.text.TextFieldScrollerPosition r15 = r1
                    r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
                    r14.startReplaceableGroup(r2)
                    boolean r2 = r14.changed(r13)
                    boolean r3 = r14.changed(r15)
                    r2 = r2 | r3
                    java.lang.Object r3 = r14.rememberedValue()
                    if (r2 != 0) goto L7c
                    androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.INSTANCE
                    java.lang.Object r2 = r2.getEmpty()
                    if (r3 != r2) goto L84
                L7c:
                    androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 r3 = new androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1
                    r3.<init>(r15)
                    r14.updateRememberedValue(r3)
                L84:
                    r14.endReplaceableGroup()
                    r4 = r3
                    androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 r4 = (androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) r4
                    androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.INSTANCE
                    androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r1
                    androidx.compose.foundation.gestures.Orientation r5 = r13.getOrientation()
                    boolean r13 = r2
                    if (r13 == 0) goto La8
                    androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r1
                    float r13 = r13.getMaximum()
                    r15 = 0
                    int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                    if (r13 != 0) goto La3
                    r13 = r0
                    goto La4
                La3:
                    r13 = r1
                La4:
                    if (r13 != 0) goto La8
                    r6 = r0
                    goto La9
                La8:
                    r6 = r1
                La9:
                    r8 = 0
                    androidx.compose.foundation.interaction.MutableInteractionSource r9 = r3
                    r10 = 16
                    r11 = 0
                    androidx.compose.ui.Modifier r13 = androidx.compose.foundation.gestures.ScrollableKt.scrollable$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    boolean r15 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r15 == 0) goto Lbc
                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                Lbc:
                    r14.endReplaceableGroup()
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldScrollKt.AnonymousClass2.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    public static /* synthetic */ Modifier textFieldScrollable$default(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            mutableInteractionSource = null;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return textFieldScrollable(modifier, textFieldScrollerPosition, mutableInteractionSource, z);
    }
}
