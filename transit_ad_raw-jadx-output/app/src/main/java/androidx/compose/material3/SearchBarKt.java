package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;

/* JADX INFO: compiled from: SearchBar.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0085\u0002\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001aû\u0001\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u001aÈ\u0001\u0010$\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0014\u001a\u00020#2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b$\u0010%\"\u001d\u0010&\u001a\u00020\u00158\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010'\u0012\u0004\b(\u0010)\"\u001d\u0010*\u001a\u00020\u00158\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010,\"\u0014\u0010.\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010'\"\u001d\u0010/\u001a\u00020\u00158\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010,\"\u0017\u00101\u001a\u00020\u00158\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u0010'\"\u001d\u00102\u001a\u00020\u00158\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010,\"\u0017\u00104\u001a\u00020\u00158\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u0010'\"\u0014\u00106\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107\"\u0014\u00108\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00107\"\u0014\u00109\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u00107\"\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<\"\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<\"\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020-0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@\"\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020-0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@\"\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020B0>8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bC\u0010@\"\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020B0>8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bD\u0010@\"\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G\"\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006K"}, d2 = {"", "query", "Lkotlin/Function1;", "Lkotlin/j;", "onQueryChange", "onSearch", "", "active", "onActiveChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/SearchBarColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/ColumnScope;", "content", "SearchBar-Id_Pb_0", "(Ljava/lang/String;Lkj/l;Lkj/l;ZLkj/l;Landroidx/compose/ui/Modifier;ZLkj/p;Lkj/p;Lkj/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkj/q;Landroidx/compose/runtime/Composer;III)V", "SearchBar", "DockedSearchBar-rpjkMjA", "(Ljava/lang/String;Lkj/l;Lkj/l;ZLkj/l;Landroidx/compose/ui/Modifier;ZLkj/p;Lkj/p;Lkj/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkj/q;Landroidx/compose/runtime/Composer;III)V", "DockedSearchBar", "Landroidx/compose/material3/TextFieldColors;", "SearchBarInputField", "(Ljava/lang/String;Lkj/l;Lkj/l;ZLkj/l;Landroidx/compose/ui/Modifier;ZLkj/p;Lkj/p;Lkj/p;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "SearchBarCornerRadius", "F", "getSearchBarCornerRadius$annotations", "()V", "DockedActiveTableMinHeight", "getDockedActiveTableMinHeight", "()F", "", "DockedActiveTableMaxHeightScreenRatio", "SearchBarMinWidth", "getSearchBarMinWidth", "SearchBarMaxWidth", "SearchBarVerticalPadding", "getSearchBarVerticalPadding", "SearchBarIconOffsetX", "", "AnimationEnterDurationMillis", "I", "AnimationExitDurationMillis", "AnimationDelayMillis", "Landroidx/compose/animation/core/CubicBezierEasing;", "AnimationEnterEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "AnimationExitEasing", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "AnimationEnterFloatSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "AnimationExitFloatSpec", "Landroidx/compose/ui/unit/IntSize;", "AnimationEnterSizeSpec", "AnimationExitSizeSpec", "Landroidx/compose/animation/EnterTransition;", "DockedEnterTransition", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "DockedExitTransition", "Landroidx/compose/animation/ExitTransition;", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class SearchBarKt {
    private static final int AnimationDelayMillis = 100;
    private static final int AnimationEnterDurationMillis = 600;
    private static final CubicBezierEasing AnimationEnterEasing;
    private static final FiniteAnimationSpec<Float> AnimationEnterFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationEnterSizeSpec;
    private static final int AnimationExitDurationMillis = 350;
    private static final CubicBezierEasing AnimationExitEasing;
    private static final FiniteAnimationSpec<Float> AnimationExitFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationExitSizeSpec;
    private static final float DockedActiveTableMaxHeightScreenRatio = 0.6666667f;
    private static final EnterTransition DockedEnterTransition;
    private static final ExitTransition DockedExitTransition;
    private static final float SearchBarCornerRadius = Dp.m5267constructorimpl(SearchBarDefaults.INSTANCE.m1468getInputFieldHeightD9Ej5fM() / 2);
    private static final float DockedActiveTableMinHeight = Dp.m5267constructorimpl(240);
    private static final float SearchBarMinWidth = Dp.m5267constructorimpl(360);
    private static final float SearchBarMaxWidth = Dp.m5267constructorimpl(720);
    private static final float SearchBarVerticalPadding = Dp.m5267constructorimpl(8);
    private static final float SearchBarIconOffsetX = Dp.m5267constructorimpl(4);

    static {
        CubicBezierEasing easingEmphasizedDecelerateCubicBezier = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        AnimationEnterEasing = easingEmphasizedDecelerateCubicBezier;
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        AnimationExitEasing = cubicBezierEasing;
        TweenSpec tweenSpecTween = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterFloatSpec = tweenSpecTween;
        TweenSpec tweenSpecTween2 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitFloatSpec = tweenSpecTween2;
        TweenSpec tweenSpecTween3 = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterSizeSpec = tweenSpecTween3;
        TweenSpec tweenSpecTween4 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitSizeSpec = tweenSpecTween4;
        DockedEnterTransition = EnterExitTransitionKt.fadeIn$default(tweenSpecTween, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(tweenSpecTween3, null, false, null, 14, null));
        DockedExitTransition = EnterExitTransitionKt.fadeOut$default(tweenSpecTween2, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(tweenSpecTween4, null, false, null, 14, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: DockedSearchBar-rpjkMjA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1471DockedSearchBarrpjkMjA(final java.lang.String r40, final kj.l<? super java.lang.String, kotlin.j> r41, final kj.l<? super java.lang.String, kotlin.j> r42, final boolean r43, final kj.l<? super java.lang.Boolean, kotlin.j> r44, androidx.compose.ui.Modifier r45, boolean r46, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r47, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r48, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r49, androidx.compose.ui.graphics.Shape r50, androidx.compose.material3.SearchBarColors r51, float r52, androidx.compose.foundation.interaction.MutableInteractionSource r53, final kj.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r54, androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instruction units count: 1019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m1471DockedSearchBarrpjkMjA(java.lang.String, kj.l, kj.l, boolean, kj.l, androidx.compose.ui.Modifier, boolean, kj.p, kj.p, kj.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, androidx.compose.foundation.interaction.MutableInteractionSource, kj.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: SearchBar-Id_Pb_0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1472SearchBarId_Pb_0(final java.lang.String r46, final kj.l<? super java.lang.String, kotlin.j> r47, final kj.l<? super java.lang.String, kotlin.j> r48, final boolean r49, final kj.l<? super java.lang.Boolean, kotlin.j> r50, androidx.compose.ui.Modifier r51, boolean r52, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r53, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r54, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r55, androidx.compose.ui.graphics.Shape r56, androidx.compose.material3.SearchBarColors r57, float r58, androidx.compose.foundation.layout.WindowInsets r59, androidx.compose.foundation.interaction.MutableInteractionSource r60, final kj.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r61, androidx.compose.runtime.Composer r62, final int r63, final int r64, final int r65) {
        /*
            Method dump skipped, instruction units count: 1443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m1472SearchBarId_Pb_0(java.lang.String, kj.l, kj.l, boolean, kj.l, androidx.compose.ui.Modifier, boolean, kj.p, kj.p, kj.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.foundation.interaction.MutableInteractionSource, kj.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x033b A[LOOP:0: B:187:0x0339->B:188:0x033b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SearchBarInputField(final java.lang.String r81, final kj.l<? super java.lang.String, kotlin.j> r82, final kj.l<? super java.lang.String, kotlin.j> r83, final boolean r84, final kj.l<? super java.lang.Boolean, kotlin.j> r85, androidx.compose.ui.Modifier r86, boolean r87, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r88, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r89, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r90, androidx.compose.material3.TextFieldColors r91, androidx.compose.foundation.interaction.MutableInteractionSource r92, androidx.compose.runtime.Composer r93, final int r94, final int r95, final int r96) {
        /*
            Method dump skipped, instruction units count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.SearchBarInputField(java.lang.String, kj.l, kj.l, boolean, kj.l, androidx.compose.ui.Modifier, boolean, kj.p, kj.p, kj.p, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SearchBar_Id_Pb_0$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final float getDockedActiveTableMinHeight() {
        return DockedActiveTableMinHeight;
    }

    public static final float getSearchBarMinWidth() {
        return SearchBarMinWidth;
    }

    public static final float getSearchBarVerticalPadding() {
        return SearchBarVerticalPadding;
    }

    private static /* synthetic */ void getSearchBarCornerRadius$annotations() {
    }
}
