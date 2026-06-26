package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import kj.l;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AndroidOverscroll.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"StretchOverscrollNonClippingLayer", "Landroidx/compose/ui/Modifier;", "rememberOverscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class AndroidOverscrollKt {
    private static final Modifier StretchOverscrollNonClippingLayer;

    static {
        StretchOverscrollNonClippingLayer = Build.VERSION.SDK_INT >= 31 ? LayoutModifierKt.layout(LayoutModifierKt.layout(Modifier.INSTANCE, new q<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m179invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).getValue());
            }

            /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m179invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                m.h(measureScope, "$this$layout");
                m.h(measurable, "measurable");
                final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(j);
                final int iMo342roundToPx0680j_4 = measureScope.mo342roundToPx0680j_4(Dp.m5267constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
                return MeasureScope.CC.p(measureScope, placeableMo4235measureBRTryo0.getMeasuredWidth() - iMo342roundToPx0680j_4, placeableMo4235measureBRTryo0.getMeasuredHeight() - iMo342roundToPx0680j_4, null, new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return j.a;
                    }

                    public final void invoke(Placeable.PlacementScope placementScope) {
                        m.h(placementScope, "$this$layout");
                        Placeable placeable = placeableMo4235measureBRTryo0;
                        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, ((-iMo342roundToPx0680j_4) / 2) - ((placeable.getWidth() - placeableMo4235measureBRTryo0.getMeasuredWidth()) / 2), ((-iMo342roundToPx0680j_4) / 2) - ((placeableMo4235measureBRTryo0.getHeight() - placeableMo4235measureBRTryo0.getMeasuredHeight()) / 2), 0.0f, null, 12, null);
                    }
                }, 4, null);
            }
        }), new q<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m180invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).getValue());
            }

            /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m180invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                m.h(measureScope, "$this$layout");
                m.h(measurable, "measurable");
                final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(j);
                final int iMo342roundToPx0680j_4 = measureScope.mo342roundToPx0680j_4(Dp.m5267constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
                return MeasureScope.CC.p(measureScope, placeableMo4235measureBRTryo0.getWidth() + iMo342roundToPx0680j_4, placeableMo4235measureBRTryo0.getHeight() + iMo342roundToPx0680j_4, null, new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return j.a;
                    }

                    public final void invoke(Placeable.PlacementScope placementScope) {
                        m.h(placementScope, "$this$layout");
                        Placeable placeable = placeableMo4235measureBRTryo0;
                        int i2 = iMo342roundToPx0680j_4;
                        Placeable.PlacementScope.place$default(placementScope, placeable, i2 / 2, i2 / 2, 0.0f, 4, null);
                    }
                }, 4, null);
            }
        }) : Modifier.INSTANCE;
    }

    @Composable
    public static final OverscrollEffect rememberOverscrollEffect(Composer composer, int i2) {
        OverscrollEffect overscrollEffect;
        composer.startReplaceableGroup(-81138291);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-81138291, i2, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.kt:62)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) composer.consume(OverscrollConfigurationKt.getLocalOverscrollConfiguration());
        if (overscrollConfiguration != null) {
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(context) | composer.changed(overscrollConfiguration);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AndroidEdgeEffectOverscrollEffect(context, overscrollConfiguration);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            overscrollEffect = (OverscrollEffect) objRememberedValue;
        } else {
            overscrollEffect = NoOpOverscrollEffect.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return overscrollEffect;
    }
}
