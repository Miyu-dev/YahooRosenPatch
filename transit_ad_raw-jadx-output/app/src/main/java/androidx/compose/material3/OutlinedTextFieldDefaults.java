package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Immutable
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bg\u0010hJS\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018JÃ\u0003\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001a2\b\b\u0002\u0010!\u001a\u00020\u001a2\b\b\u0002\u0010\"\u001a\u00020\u001a2\b\b\u0002\u0010#\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020\u001a2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u001a2\b\b\u0002\u0010(\u001a\u00020\u001a2\b\b\u0002\u0010)\u001a\u00020\u001a2\b\b\u0002\u0010*\u001a\u00020\u001a2\b\b\u0002\u0010+\u001a\u00020\u001a2\b\b\u0002\u0010,\u001a\u00020\u001a2\b\b\u0002\u0010-\u001a\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u001a2\b\b\u0002\u0010/\u001a\u00020\u001a2\b\b\u0002\u00100\u001a\u00020\u001a2\b\b\u0002\u00101\u001a\u00020\u001a2\b\b\u0002\u00102\u001a\u00020\u001a2\b\b\u0002\u00103\u001a\u00020\u001a2\b\b\u0002\u00104\u001a\u00020\u001a2\b\b\u0002\u00105\u001a\u00020\u001a2\b\b\u0002\u00106\u001a\u00020\u001a2\b\b\u0002\u00107\u001a\u00020\u001a2\b\b\u0002\u00108\u001a\u00020\u001a2\b\b\u0002\u00109\u001a\u00020\u001a2\b\b\u0002\u0010:\u001a\u00020\u001a2\b\b\u0002\u0010;\u001a\u00020\u001a2\b\b\u0002\u0010<\u001a\u00020\u001a2\b\b\u0002\u0010=\u001a\u00020\u001a2\b\b\u0002\u0010>\u001a\u00020\u001a2\b\b\u0002\u0010?\u001a\u00020\u001a2\b\b\u0002\u0010@\u001a\u00020\u001a2\b\b\u0002\u0010A\u001a\u00020\u001a2\b\b\u0002\u0010B\u001a\u00020\u001a2\b\b\u0002\u0010C\u001a\u00020\u001a2\b\b\u0002\u0010D\u001a\u00020\u001a2\b\b\u0002\u0010E\u001a\u00020\u001a2\b\b\u0002\u0010F\u001a\u00020\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJ\u009e\u0002\u0010Y\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020I2\u0011\u0010M\u001a\r\u0012\u0004\u0012\u00020\u000e0K¢\u0006\u0002\bL2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00022\u0006\u0010P\u001a\u00020O2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0015\b\u0002\u0010Q\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010K¢\u0006\u0002\bL2\u0015\b\u0002\u0010R\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010K¢\u0006\u0002\bL2\u0015\b\u0002\u0010S\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010K¢\u0006\u0002\bL2\u0015\b\u0002\u0010T\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010K¢\u0006\u0002\bL2\u0015\b\u0002\u0010U\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010K¢\u0006\u0002\bL2\u0015\b\u0002\u0010V\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010K¢\u0006\u0002\bL2\u0015\b\u0002\u0010W\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010K¢\u0006\u0002\bL2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00162\u0013\b\u0002\u0010X\u001a\r\u0012\u0004\u0012\u00020\u000e0K¢\u0006\u0002\bLH\u0007¢\u0006\u0004\bY\u0010ZR \u0010[\u001a\u00020\u000b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R \u0010_\u001a\u00020\u000b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b_\u0010\\\u001a\u0004\b`\u0010^R \u0010a\u001a\u00020\u000b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\ba\u0010\\\u001a\u0004\bb\u0010^R \u0010c\u001a\u00020\u000b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bc\u0010\\\u001a\u0004\bd\u0010^R\u0011\u0010\n\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\be\u0010f\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006i"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldDefaults;", "", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/material3/TextFieldColors;", "colors", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/Dp;", "focusedBorderThickness", "unfocusedBorderThickness", "Lkotlin/j;", "ContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "ContainerBox", "start", "top", "end", "bottom", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "container", "DecorationBox", "(Ljava/lang/String;Lkj/p;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkj/p;Landroidx/compose/runtime/Composer;III)V", "MinHeight", "F", "getMinHeight-D9Ej5fM", "()F", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class OutlinedTextFieldDefaults {
    public static final int $stable = 0;
    public static final OutlinedTextFieldDefaults INSTANCE = new OutlinedTextFieldDefaults();
    private static final float MinHeight = Dp.m5267constructorimpl(56);
    private static final float MinWidth = Dp.m5267constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m5267constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m5267constructorimpl(2);

    private OutlinedTextFieldDefaults() {
    }

    /* JADX INFO: renamed from: contentPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1417contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return outlinedTextFieldDefaults.m1420contentPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d1  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /* JADX INFO: renamed from: ContainerBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1418ContainerBoxnbWgWpA(final boolean r21, final boolean r22, final androidx.compose.foundation.interaction.InteractionSource r23, final androidx.compose.material3.TextFieldColors r24, androidx.compose.ui.graphics.Shape r25, float r26, float r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.m1418ContainerBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0142  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DecorationBox(final java.lang.String r118, final kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r119, final boolean r120, final boolean r121, final androidx.compose.ui.text.input.VisualTransformation r122, final androidx.compose.foundation.interaction.InteractionSource r123, boolean r124, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r125, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r126, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r127, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r128, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r129, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r130, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r131, androidx.compose.material3.TextFieldColors r132, androidx.compose.foundation.layout.PaddingValues r133, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r134, androidx.compose.runtime.Composer r135, final int r136, final int r137, final int r138) {
        /*
            Method dump skipped, instruction units count: 1188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(java.lang.String, kj.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kj.p, kj.p, kj.p, kj.p, kj.p, kj.p, kj.p, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kj.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    /* JADX INFO: renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m1419colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        composer.startReplaceableGroup(1767617725);
        long color = (i7 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusInputColor(), composer, 6) : j;
        long color2 = (i7 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j2;
        long jM2817copywmQWz5c$default = (i7 & 4) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long color3 = (i7 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorInputColor(), composer, 6) : j4;
        long jM2853getTransparent0d7_KjU = (i7 & 16) != 0 ? Color.INSTANCE.m2853getTransparent0d7_KjU() : j5;
        long jM2853getTransparent0d7_KjU2 = (i7 & 32) != 0 ? Color.INSTANCE.m2853getTransparent0d7_KjU() : j6;
        long jM2853getTransparent0d7_KjU3 = (i7 & 64) != 0 ? Color.INSTANCE.m2853getTransparent0d7_KjU() : j7;
        long jM2853getTransparent0d7_KjU4 = (i7 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? Color.INSTANCE.m2853getTransparent0d7_KjU() : j8;
        long color4 = (i7 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j9;
        long color5 = (i7 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j10;
        TextSelectionColors textSelectionColors2 = (i7 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color6 = (i7 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer, 6) : j11;
        long color7 = (i7 & 4096) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer, 6) : j12;
        long jM2817copywmQWz5c$default2 = (i7 & 8192) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long color8 = (i7 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer, 6) : j14;
        long color9 = (32768 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j15;
        long color10 = (65536 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j16;
        long jM2817copywmQWz5c$default3 = (131072 & i7) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long color11 = (262144 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j18;
        long color12 = (524288 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j19;
        long color13 = (1048576 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j20;
        long jM2817copywmQWz5c$default4 = (2097152 & i7) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long color14 = (4194304 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j22;
        long color15 = (8388608 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j23;
        long color16 = (16777216 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j24;
        long jM2817copywmQWz5c$default5 = (33554432 & i7) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long color17 = (67108864 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j26;
        long color18 = (134217728 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j27;
        long color19 = (268435456 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j28;
        long jM2817copywmQWz5c$default6 = (536870912 & i7) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long color20 = (i7 & BasicMeasure.EXACTLY) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j30;
        long color21 = (i8 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j31;
        long color22 = (i8 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j32;
        long jM2817copywmQWz5c$default7 = (i8 & 4) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j33;
        long color23 = (i8 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j34;
        long color24 = (i8 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j35;
        long color25 = (i8 & 32) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j36;
        long jM2817copywmQWz5c$default8 = (i8 & 64) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j37;
        long color26 = (i8 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j38;
        long color27 = (i8 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j39;
        long color28 = (i8 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j40;
        long jM2817copywmQWz5c$default9 = (i8 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j41;
        long color29 = (i8 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j42;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1767617725, i2, i3, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1478)");
        }
        TextFieldColors textFieldColors = new TextFieldColors(color, color2, jM2817copywmQWz5c$default, color3, jM2853getTransparent0d7_KjU, jM2853getTransparent0d7_KjU2, jM2853getTransparent0d7_KjU3, jM2853getTransparent0d7_KjU4, color4, color5, textSelectionColors2, color6, color7, jM2817copywmQWz5c$default2, color8, color9, color10, jM2817copywmQWz5c$default3, color11, color12, color13, jM2817copywmQWz5c$default4, color14, color15, color16, jM2817copywmQWz5c$default5, color17, color18, color19, jM2817copywmQWz5c$default6, color20, color21, color22, jM2817copywmQWz5c$default7, color23, color24, color25, jM2817copywmQWz5c$default8, color26, color27, color28, jM2817copywmQWz5c$default9, color29, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColors;
    }

    /* JADX INFO: renamed from: contentPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1420contentPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m457PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* JADX INFO: renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1421getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1422getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1423getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    public final Shape getShape(Composer composer, int i2) {
        composer.startReplaceableGroup(-1066756961);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1066756961, i2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:1347)");
        }
        Shape shape = ShapesKt.toShape(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* JADX INFO: renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1424getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }
}
