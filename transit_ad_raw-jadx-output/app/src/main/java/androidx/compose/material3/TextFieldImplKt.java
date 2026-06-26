package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.widgets.Optimizer;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a¢\u0002\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a<\u0010%\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a\u0012\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&H\u0000\u001a\u0012\u0010*\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&H\u0000\"\u0014\u0010+\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010,\"\u0014\u0010.\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010,\"\u0014\u0010/\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010,\"\u0014\u00100\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010,\"\u0014\u00101\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010,\"\u0014\u00102\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u0010,\"\u0014\u00103\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u0010,\"\u0014\u00104\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u0010,\"\u001d\u00106\u001a\u0002058\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0014\u0010:\u001a\u00020(8\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u0010;\"\u0014\u0010<\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010;\"\u0014\u0010=\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010;\"\u001d\u0010?\u001a\u00020>8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u001d\u0010C\u001a\u00020>8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010B\"\u001d\u0010E\u001a\u00020>8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bF\u0010B\"\u001d\u0010G\u001a\u00020>8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010@\u001a\u0004\bH\u0010B\"\u001d\u0010I\u001a\u00020>8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bI\u0010@\u001a\u0004\bJ\u0010B\"\u001d\u0010K\u001a\u00020>8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bK\u0010@\u001a\u0004\bL\u0010B\"\u001d\u0010M\u001a\u00020>8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bM\u0010@\u001a\u0004\bN\u0010B\"\u001a\u0010P\u001a\u00020O8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u001a\u0010X\u001a\u0004\u0018\u00010U*\u00020T8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Y"}, d2 = {"Landroidx/compose/material3/TextFieldType;", "type", "", "value", "Lkotlin/Function0;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "innerTextField", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "", "singleLine", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/material3/TextFieldColors;", "colors", "container", "CommonDecorationBox", "(Landroidx/compose/material3/TextFieldType;Ljava/lang/String;Lkj/p;Landroidx/compose/ui/text/input/VisualTransformation;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkj/p;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "Landroidx/compose/ui/text/TextStyle;", "typography", "content", "Decoration-KTwxG1Y", "(JLandroidx/compose/ui/text/TextStyle;Lkj/p;Landroidx/compose/runtime/Composer;II)V", "Decoration", "Landroidx/compose/ui/layout/Placeable;", "placeable", "", "widthOrZero", "heightOrZero", "TextFieldId", "Ljava/lang/String;", "PlaceholderId", "LabelId", "LeadingId", "TrailingId", "PrefixId", "SuffixId", "SupportingId", "ContainerId", "Landroidx/compose/ui/unit/Constraints;", "ZeroConstraints", "J", "getZeroConstraints", "()J", "AnimationDuration", "I", "PlaceholderAnimationDuration", "PlaceholderAnimationDelayOrDuration", "Landroidx/compose/ui/unit/Dp;", "TextFieldPadding", "F", "getTextFieldPadding", "()F", "HorizontalIconPadding", "getHorizontalIconPadding", "SupportingTopPadding", "getSupportingTopPadding", "PrefixSuffixTextPadding", "getPrefixSuffixTextPadding", "MinTextLineHeight", "getMinTextLineHeight", "MinFocusedLabelLineHeight", "getMinFocusedLabelLineHeight", "MinSupportingTextLineHeight", "getMinSupportingTextLineHeight", "Landroidx/compose/ui/Modifier;", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "layoutId", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    public static final String ContainerId = "Container";
    private static final Modifier IconDefaultSizeModifier;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final float MinFocusedLabelLineHeight;
    private static final float MinSupportingTextLineHeight;
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String PrefixId = "Prefix";
    public static final String SuffixId = "Suffix";
    public static final String SupportingId = "Supporting";
    public static final String TextFieldId = "TextField";
    private static final float TextFieldPadding;
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float HorizontalIconPadding = Dp.m5267constructorimpl(12);
    private static final float SupportingTopPadding = Dp.m5267constructorimpl(4);
    private static final float PrefixSuffixTextPadding = Dp.m5267constructorimpl(2);
    private static final float MinTextLineHeight = Dp.m5267constructorimpl(24);

    static {
        float f = 16;
        TextFieldPadding = Dp.m5267constructorimpl(f);
        MinFocusedLabelLineHeight = Dp.m5267constructorimpl(f);
        MinSupportingTextLineHeight = Dp.m5267constructorimpl(f);
        float f2 = 48;
        IconDefaultSizeModifier = SizeKt.m488defaultMinSizeVpY3zN4(Modifier.INSTANCE, Dp.m5267constructorimpl(f2), Dp.m5267constructorimpl(f2));
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CommonDecorationBox(final androidx.compose.material3.TextFieldType r44, final java.lang.String r45, final kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r46, final androidx.compose.ui.text.input.VisualTransformation r47, final kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r48, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r49, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r50, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r51, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r52, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r53, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r54, boolean r55, boolean r56, boolean r57, final androidx.compose.foundation.interaction.InteractionSource r58, final androidx.compose.foundation.layout.PaddingValues r59, final androidx.compose.material3.TextFieldColors r60, final kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r61, androidx.compose.runtime.Composer r62, final int r63, final int r64, final int r65) {
        /*
            Method dump skipped, instruction units count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldImplKt.CommonDecorationBox(androidx.compose.material3.TextFieldType, java.lang.String, kj.p, androidx.compose.ui.text.input.VisualTransformation, kj.p, kj.p, kj.p, kj.p, kj.p, kj.p, kj.p, boolean, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material3.TextFieldColors, kj.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    /* JADX INFO: renamed from: Decoration-KTwxG1Y, reason: not valid java name */
    public static final void m1675DecorationKTwxG1Y(final long j, TextStyle textStyle, final p<? super Composer, ? super Integer, j> pVar, Composer composer, final int i2, final int i3) {
        final int i4;
        m.h(pVar, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1520066345);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(pVar) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i4 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                textStyle = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520066345, i4, -1, "androidx.compose.material3.Decoration (TextFieldImpl.kt:274)");
            }
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1449369305, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TextFieldImplKt$Decoration$contentWithColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return j.a;
                }

                @Composable
                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1449369305, i6, -1, "androidx.compose.material3.Decoration.<anonymous> (TextFieldImpl.kt:279)");
                    }
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2808boximpl(j))}, pVar, composer2, ((i4 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            if (textStyle != null) {
                composerStartRestartGroup.startReplaceableGroup(1830468032);
                TextKt.ProvideTextStyle(textStyle, composableLambda, composerStartRestartGroup, ((i4 >> 3) & 14) | 48);
            } else {
                composerStartRestartGroup.startReplaceableGroup(1830468084);
                composableLambda.invoke(composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final TextStyle textStyle2 = textStyle;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TextFieldImplKt$Decoration$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i6) {
                TextFieldImplKt.m1675DecorationKTwxG1Y(j, textStyle2, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        m.h(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    public static final float getMinFocusedLabelLineHeight() {
        return MinFocusedLabelLineHeight;
    }

    public static final float getMinSupportingTextLineHeight() {
        return MinSupportingTextLineHeight;
    }

    public static final float getMinTextLineHeight() {
        return MinTextLineHeight;
    }

    public static final float getPrefixSuffixTextPadding() {
        return PrefixSuffixTextPadding;
    }

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }
}
