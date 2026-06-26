package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.animation.b;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.widgets.Optimizer;
import ej.c;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: TextFieldCursor.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a4\u0010\b\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"DefaultCursorThickness", "Landroidx/compose/ui/unit/Dp;", "getDefaultCursorThickness", "()F", "F", "cursorAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "cursor", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "enabled", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TextFieldCursorKt {
    private static final AnimationSpec<Float> cursorAnimationSpec = AnimationSpecKt.m117infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new l<KeyframesSpec.KeyframesSpecConfig<Float>, j>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursorAnimationSpec$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((KeyframesSpec.KeyframesSpecConfig<Float>) obj);
            return j.a;
        }

        public final void invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            m.h(keyframesSpecConfig, "$this$keyframes");
            keyframesSpecConfig.setDurationMillis(1000);
            Float fValueOf = Float.valueOf(1.0f);
            keyframesSpecConfig.at(fValueOf, 0);
            keyframesSpecConfig.at(fValueOf, 499);
            Float fValueOf2 = Float.valueOf(0.0f);
            keyframesSpecConfig.at(fValueOf2, 500);
            keyframesSpecConfig.at(fValueOf2, 999);
        }
    }), null, 0, 6, null);
    private static final float DefaultCursorThickness = Dp.m5267constructorimpl(2);

    public static final Modifier cursor(Modifier modifier, final TextFieldState textFieldState, final TextFieldValue textFieldValue, final OffsetMapping offsetMapping, final Brush brush, boolean z) {
        m.h(modifier, "<this>");
        m.h(textFieldState, "state");
        m.h(textFieldValue, "value");
        m.h(offsetMapping, "offsetMapping");
        m.h(brush, "cursorBrush");
        return z ? ComposedModifierKt.composed$default(modifier, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt.cursor.1

            /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: TextFieldCursor.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @c(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", l = {R.styleable.AppCompatTheme_colorButtonNormal}, m = "invokeSuspend")
            public static final class C00511 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
                int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: TextFieldCursor.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @c(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", l = {R.styleable.AppCompatTheme_colorControlHighlight, R.styleable.AppCompatTheme_colorError}, m = "invokeSuspend")
                public static final class C00521 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                    final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00521(Animatable<Float, AnimationVector1D> animatable, dj.c<? super C00521> cVar) {
                        super(2, cVar);
                        this.$cursorAlpha = animatable;
                    }

                    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                        return new C00521(this.$cursorAlpha, cVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            li.c.O(obj);
                            Animatable<Float, AnimationVector1D> animatable = this.$cursorAlpha;
                            Float f = new Float(1.0f);
                            this.label = 1;
                            if (animatable.snapTo(f, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                li.c.O(obj);
                                return j.a;
                            }
                            li.c.O(obj);
                        }
                        Animatable<Float, AnimationVector1D> animatable2 = this.$cursorAlpha;
                        Float f2 = new Float(0.0f);
                        AnimationSpec animationSpec = TextFieldCursorKt.cursorAnimationSpec;
                        this.label = 2;
                        if (Animatable.animateTo$default(animatable2, f2, animationSpec, null, null, this, 12, null) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return j.a;
                    }

                    public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                        return create(coroutineScope, cVar).invokeSuspend(j.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00511(Animatable<Float, AnimationVector1D> animatable, dj.c<? super C00511> cVar) {
                    super(2, cVar);
                    this.$cursorAlpha = animatable;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new C00511(this.$cursorAlpha, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        li.c.O(obj);
                        FixedMotionDurationScale fixedMotionDurationScale = FixedMotionDurationScale.INSTANCE;
                        C00521 c00521 = new C00521(this.$cursorAlpha, null);
                        this.label = 1;
                        if (BuildersKt.withContext(fixedMotionDurationScale, c00521, this) == coroutineSingletons) {
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

                public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                    return create(coroutineScope, cVar).invokeSuspend(j.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                Modifier modifierDrawWithContent;
                if (b.n(modifier2, "$this$composed", composer, 1634330012)) {
                    ComposerKt.traceEventStart(1634330012, i2, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
                }
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final Animatable animatable = (Animatable) objRememberedValue;
                Brush brush2 = brush;
                boolean z2 = true;
                if (brush2 instanceof SolidColor) {
                    if (((SolidColor) brush2).getValue() == Color.INSTANCE.m2854getUnspecified0d7_KjU()) {
                        z2 = false;
                    }
                }
                if (textFieldState.getHasFocus() && TextRange.m4805getCollapsedimpl(textFieldValue.getSelection()) && z2) {
                    EffectsKt.LaunchedEffect(textFieldValue.getAnnotatedString(), TextRange.m4799boximpl(textFieldValue.getSelection()), new C00511(animatable, null), composer, Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING);
                    final OffsetMapping offsetMapping2 = offsetMapping;
                    final TextFieldValue textFieldValue2 = textFieldValue;
                    final TextFieldState textFieldState2 = textFieldState;
                    final Brush brush3 = brush;
                    modifierDrawWithContent = DrawModifierKt.drawWithContent(modifier2, new l<ContentDrawScope, j>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt.cursor.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((ContentDrawScope) obj);
                            return j.a;
                        }

                        public final void invoke(ContentDrawScope contentDrawScope) {
                            Rect rect;
                            TextLayoutResult value;
                            m.h(contentDrawScope, "$this$drawWithContent");
                            contentDrawScope.drawContent();
                            float fH = a.l.h(animatable.getValue().floatValue(), 0.0f, 1.0f);
                            if (fH == 0.0f) {
                                return;
                            }
                            int iOriginalToTransformed = offsetMapping2.originalToTransformed(TextRange.m4811getStartimpl(textFieldValue2.getSelection()));
                            TextLayoutResultProxy layoutResult = textFieldState2.getLayoutResult();
                            if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(iOriginalToTransformed)) == null) {
                                rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            float fMo348toPx0680j_4 = contentDrawScope.mo348toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
                            float f = fMo348toPx0680j_4 / 2;
                            float left = rect.getLeft() + f;
                            float fM2654getWidthimpl = Size.m2654getWidthimpl(contentDrawScope.mo3254getSizeNHjbRc()) - f;
                            if (left > fM2654getWidthimpl) {
                                left = fM2654getWidthimpl;
                            }
                            androidx.compose.ui.graphics.drawscope.b.B(contentDrawScope, brush3, OffsetKt.Offset(left, rect.getTop()), OffsetKt.Offset(left, rect.getBottom()), fMo348toPx0680j_4, 0, null, fH, null, 0, 432, null);
                        }
                    });
                } else {
                    modifierDrawWithContent = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierDrawWithContent;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        }, 1, null) : modifier;
    }

    public static final float getDefaultCursorThickness() {
        return DefaultCursorThickness;
    }
}
