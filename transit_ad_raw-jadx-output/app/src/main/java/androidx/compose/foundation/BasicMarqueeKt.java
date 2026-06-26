package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BasicMarquee.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aK\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a&\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0%2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0001H\u0002\u001aU\u0010&\u001a\u00020'*\u00020'2\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+\"\u001c\u0010\u0000\u001a\u00020\u00018GX\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u00018GX\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005\"\u001c\u0010\t\u001a\u00020\n8GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\r\"!\u0010\u000e\u001a\u00020\u000f8GX\u0087\u0004ø\u0001\u0000¢\u0006\u0010\n\u0002\u0010\u0013\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"DefaultMarqueeDelayMillis", "", "getDefaultMarqueeDelayMillis$annotations", "()V", "getDefaultMarqueeDelayMillis", "()I", "DefaultMarqueeIterations", "getDefaultMarqueeIterations$annotations", "getDefaultMarqueeIterations", "DefaultMarqueeSpacing", "Landroidx/compose/foundation/MarqueeSpacing;", "getDefaultMarqueeSpacing$annotations", "getDefaultMarqueeSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "DefaultMarqueeVelocity", "Landroidx/compose/ui/unit/Dp;", "getDefaultMarqueeVelocity$annotations", "getDefaultMarqueeVelocity", "()F", "F", "MarqueeSpacing", "spacing", "MarqueeSpacing-0680j_4", "(F)Landroidx/compose/foundation/MarqueeSpacing;", "createMarqueeAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "iterations", "targetValue", "initialDelayMillis", "delayMillis", "velocity", "density", "Landroidx/compose/ui/unit/Density;", "createMarqueeAnimationSpec-Z4HSEVQ", "(IFIIFLandroidx/compose/ui/unit/Density;)Landroidx/compose/animation/core/AnimationSpec;", "velocityBasedTween", "Landroidx/compose/animation/core/TweenSpec;", "basicMarquee", "Landroidx/compose/ui/Modifier;", "animationMode", "Landroidx/compose/foundation/MarqueeAnimationMode;", "basicMarquee-1Mj1MLw", "(Landroidx/compose/ui/Modifier;IIIILandroidx/compose/foundation/MarqueeSpacing;F)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class BasicMarqueeKt {
    private static final int DefaultMarqueeDelayMillis = 1200;
    private static final int DefaultMarqueeIterations = 3;
    private static final MarqueeSpacing DefaultMarqueeSpacing = MarqueeSpacing.INSTANCE.fractionOfContainer(0.33333334f);
    private static final float DefaultMarqueeVelocity = Dp.m5267constructorimpl(30);

    @ExperimentalFoundationApi
    /* JADX INFO: renamed from: MarqueeSpacing-0680j_4, reason: not valid java name */
    public static final MarqueeSpacing m183MarqueeSpacing0680j_4(final float f) {
        return new MarqueeSpacing() { // from class: androidx.compose.foundation.BasicMarqueeKt$MarqueeSpacing$1
            @Override // androidx.compose.foundation.MarqueeSpacing
            public final int calculateSpacing(Density density, int i2, int i3) {
                m.h(density, "$this$MarqueeSpacing");
                return density.mo342roundToPx0680j_4(f);
            }
        };
    }

    @ExperimentalFoundationApi
    /* JADX INFO: renamed from: basicMarquee-1Mj1MLw, reason: not valid java name */
    public static final Modifier m185basicMarquee1Mj1MLw(Modifier modifier, final int i2, final int i3, final int i4, final int i5, final MarqueeSpacing marqueeSpacing, final float f) {
        m.h(modifier, "$this$basicMarquee");
        m.h(marqueeSpacing, "spacing");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.BasicMarqueeKt$basicMarquee-1Mj1MLw$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "basicMarquee").set("iterations", Integer.valueOf(i2));
                inspectorInfo.getProperties().set("animationMode", MarqueeAnimationMode.m242boximpl(i3));
                inspectorInfo.getProperties().set("delayMillis", Integer.valueOf(i4));
                inspectorInfo.getProperties().set("initialDelayMillis", Integer.valueOf(i5));
                inspectorInfo.getProperties().set("spacing", marqueeSpacing);
                inspectorInfo.getProperties().set("velocity", Dp.m5265boximpl(f));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i6) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, -562302205)) {
                    ComposerKt.traceEventStart(-562302205, i6, -1, "androidx.compose.foundation.basicMarquee.<anonymous> (BasicMarquee.kt:150)");
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                Object obj = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i5), Dp.m5265boximpl(f), density, obj};
                int i7 = i2;
                int i8 = i4;
                int i9 = i5;
                float f2 = f;
                composer.startReplaceableGroup(-568225417);
                boolean zChanged = false;
                for (int i10 = 0; i10 < 6; i10++) {
                    zChanged |= composer.changed(objArr[i10]);
                }
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new MarqueeModifier(i7, i8, i9, Dp.m5267constructorimpl(f2 * (obj == LayoutDirection.Ltr ? 1.0f : -1.0f)), density, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                MarqueeModifier marqueeModifier = (MarqueeModifier) objRememberedValue;
                marqueeModifier.setSpacing(marqueeSpacing);
                marqueeModifier.m254setAnimationMode97h66l8(i3);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged2 = composer.changed(marqueeModifier);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new BasicMarqueeKt$basicMarquee$2$1$1(marqueeModifier, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                EffectsKt.LaunchedEffect(marqueeModifier, (p<? super CoroutineScope, ? super dj.c<? super j>, ? extends Object>) objRememberedValue2, composer, 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return marqueeModifier;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: basicMarquee-1Mj1MLw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m186basicMarquee1Mj1MLw$default(Modifier modifier, int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = DefaultMarqueeIterations;
        }
        if ((i6 & 2) != 0) {
            i3 = MarqueeAnimationMode.INSTANCE.m251getImmediatelyZbEOnfQ();
        }
        int i7 = i3;
        if ((i6 & 4) != 0) {
            i4 = DefaultMarqueeDelayMillis;
        }
        int i8 = i4;
        if ((i6 & 8) != 0) {
            i5 = MarqueeAnimationMode.m245equalsimpl0(i7, MarqueeAnimationMode.INSTANCE.m251getImmediatelyZbEOnfQ()) ? i8 : 0;
        }
        int i9 = i5;
        if ((i6 & 16) != 0) {
            marqueeSpacing = DefaultMarqueeSpacing;
        }
        MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
        if ((i6 & 32) != 0) {
            f = DefaultMarqueeVelocity;
        }
        return m185basicMarquee1Mj1MLw(modifier, i2, i7, i8, i9, marqueeSpacing2, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createMarqueeAnimationSpec-Z4HSEVQ, reason: not valid java name */
    public static final AnimationSpec<Float> m187createMarqueeAnimationSpecZ4HSEVQ(int i2, float f, int i3, int i4, float f2, Density density) {
        TweenSpec<Float> tweenSpecVelocityBasedTween = velocityBasedTween(Math.abs(density.mo348toPx0680j_4(f2)), f, i4);
        long jM139constructorimpl$default = StartOffset.m139constructorimpl$default((-i4) + i3, 0, 2, null);
        return i2 == Integer.MAX_VALUE ? AnimationSpecKt.m117infiniteRepeatable9IiC70o$default(tweenSpecVelocityBasedTween, null, jM139constructorimpl$default, 2, null) : AnimationSpecKt.m119repeatable91I0pcU$default(i2, tweenSpecVelocityBasedTween, null, jM139constructorimpl$default, 4, null);
    }

    @ExperimentalFoundationApi
    public static final int getDefaultMarqueeDelayMillis() {
        return DefaultMarqueeDelayMillis;
    }

    @ExperimentalFoundationApi
    public static final int getDefaultMarqueeIterations() {
        return DefaultMarqueeIterations;
    }

    @ExperimentalFoundationApi
    public static final MarqueeSpacing getDefaultMarqueeSpacing() {
        return DefaultMarqueeSpacing;
    }

    @ExperimentalFoundationApi
    public static final float getDefaultMarqueeVelocity() {
        return DefaultMarqueeVelocity;
    }

    private static final TweenSpec<Float> velocityBasedTween(float f, float f2, int i2) {
        return AnimationSpecKt.tween((int) Math.ceil(f2 / (f / 1000.0f)), i2, EasingKt.getLinearEasing());
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeDelayMillis$annotations() {
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeIterations$annotations() {
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeSpacing$annotations() {
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeVelocity$annotations() {
    }
}
