package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;

/* JADX INFO: compiled from: BasicTextField.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aß\u0001\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2$\b\u0002\u0010\u001e\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 \u001aß\u0001\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020!2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2$\b\u0002\u0010\u001e\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b\u001f\u0010\"\u001aÕ\u0001\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2$\b\u0002\u0010\u001e\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b\u001f\u0010#\u001aÕ\u0001\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020!2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2$\b\u0002\u0010\u001e\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b\u001f\u0010$¨\u0006%"}, d2 = {"", "value", "Lkotlin/Function1;", "Lkotlin/j;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "decorationBox", "BasicTextField", "(Ljava/lang/String;Lkj/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkj/l;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkj/q;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkj/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkj/l;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkj/q;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkj/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkj/l;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkj/q;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkj/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkj/l;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkj/q;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class BasicTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0134  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(final java.lang.String r41, final kj.l<? super java.lang.String, kotlin.j> r42, androidx.compose.ui.Modifier r43, boolean r44, boolean r45, androidx.compose.ui.text.TextStyle r46, androidx.compose.foundation.text.KeyboardOptions r47, androidx.compose.foundation.text.KeyboardActions r48, boolean r49, int r50, int r51, androidx.compose.ui.text.input.VisualTransformation r52, kj.l<? super androidx.compose.ui.text.TextLayoutResult, kotlin.j> r53, androidx.compose.foundation.interaction.MutableInteractionSource r54, androidx.compose.ui.graphics.Brush r55, kj.q<? super kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r56, androidx.compose.runtime.Composer r57, final int r58, final int r59, final int r60) {
        /*
            Method dump skipped, instruction units count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, kj.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kj.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kj.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField$lambda$2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BasicTextField$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0134  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(final androidx.compose.ui.text.input.TextFieldValue r37, final kj.l<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.j> r38, androidx.compose.ui.Modifier r39, boolean r40, boolean r41, androidx.compose.ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, int r47, androidx.compose.ui.text.input.VisualTransformation r48, kj.l<? super androidx.compose.ui.text.TextLayoutResult, kotlin.j> r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.ui.graphics.Brush r51, kj.q<? super kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instruction units count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, kj.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kj.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kj.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0139  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void BasicTextField(final java.lang.String r38, final kj.l r39, androidx.compose.ui.Modifier r40, boolean r41, boolean r42, androidx.compose.ui.text.TextStyle r43, androidx.compose.foundation.text.KeyboardOptions r44, androidx.compose.foundation.text.KeyboardActions r45, boolean r46, int r47, androidx.compose.ui.text.input.VisualTransformation r48, kj.l r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.ui.graphics.Brush r51, kj.q r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instruction units count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, kj.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kj.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kj.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0139  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void BasicTextField(final androidx.compose.ui.text.input.TextFieldValue r38, final kj.l r39, androidx.compose.ui.Modifier r40, boolean r41, boolean r42, androidx.compose.ui.text.TextStyle r43, androidx.compose.foundation.text.KeyboardOptions r44, androidx.compose.foundation.text.KeyboardActions r45, boolean r46, int r47, androidx.compose.ui.text.input.VisualTransformation r48, kj.l r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.ui.graphics.Brush r51, kj.q r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instruction units count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, kj.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kj.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kj.q, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
