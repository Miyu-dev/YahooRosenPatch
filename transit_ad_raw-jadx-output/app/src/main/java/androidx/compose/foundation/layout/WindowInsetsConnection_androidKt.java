package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kj.q;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0015H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"DecelMinusOne", "", "DecelerationRate", "EndTension", "", "GravityEarth", "InchesPerMeter", "Inflection", "P1", "P2", "PlatformFlingScrollFriction", "StartTension", "rememberWindowInsetsConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "windowInsets", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "side", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "rememberWindowInsetsConnection-VRgvIgI", "(Landroidx/compose/foundation/layout/AndroidWindowInsets;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "imeNestedScroll", "Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class WindowInsetsConnection_androidKt {
    private static final double DecelMinusOne;
    private static final double DecelerationRate;
    private static final float EndTension = 1.0f;
    private static final float GravityEarth = 9.80665f;
    private static final float InchesPerMeter = 39.37f;
    private static final float Inflection = 0.35f;
    private static final float P1 = 0.175f;
    private static final float P2 = 0.35000002f;
    private static final float PlatformFlingScrollFriction = ViewConfiguration.getScrollFriction();
    private static final float StartTension = 0.5f;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        DecelerationRate = dLog;
        DecelMinusOne = dLog - 1.0d;
    }

    @ExperimentalLayoutApi
    public static final Modifier imeNestedScroll(Modifier modifier) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        if (Build.VERSION.SDK_INT < 30) {
            return modifier;
        }
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$imeNestedScroll$$inlined$debugInspectorInfo$1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                kotlin.jvm.internal.m.h(inspectorInfo, "$this$null");
                inspectorInfo.setName("imeNestedScroll");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.imeNestedScroll.2
            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, -369978792)) {
                    ComposerKt.traceEventStart(-369978792, i2, -1, "androidx.compose.foundation.layout.imeNestedScroll.<anonymous> (WindowInsetsConnection.android.kt:78)");
                }
                Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifier2, WindowInsetsConnection_androidKt.m518rememberWindowInsetsConnectionVRgvIgI(WindowInsetsHolder.INSTANCE.current(composer, 8).getIme(), WindowInsetsSides.INSTANCE.m540getBottomJoeWqyM(), composer, 48), null, 2, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierNestedScroll$default;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    @Composable
    @ExperimentalLayoutApi
    /* JADX INFO: renamed from: rememberWindowInsetsConnection-VRgvIgI, reason: not valid java name */
    public static final NestedScrollConnection m518rememberWindowInsetsConnectionVRgvIgI(AndroidWindowInsets androidWindowInsets, int i2, Composer composer, int i3) {
        kotlin.jvm.internal.m.h(androidWindowInsets, "windowInsets");
        composer.startReplaceableGroup(-1011341039);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1011341039, i3, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:104)");
        }
        if (Build.VERSION.SDK_INT < 30) {
            DoNothingNestedScrollConnection doNothingNestedScrollConnection = DoNothingNestedScrollConnection.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return doNothingNestedScrollConnection;
        }
        SideCalculator sideCalculatorM487chooseCalculatorni1skBw = SideCalculator.INSTANCE.m487chooseCalculatorni1skBw(i2, (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()));
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {androidWindowInsets, view, sideCalculatorM487chooseCalculatorni1skBw, density};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i4 = 0; i4 < 4; i4++) {
            zChanged |= composer.changed(objArr[i4]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new WindowInsetsNestedScrollConnection(androidWindowInsets, view, sideCalculatorM487chooseCalculatorni1skBw, density);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) objRememberedValue;
        EffectsKt.DisposableEffect(windowInsetsNestedScrollConnection, new kj.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1
            {
                super(1);
            }

            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                kotlin.jvm.internal.m.h(disposableEffectScope, "$this$DisposableEffect");
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        windowInsetsNestedScrollConnection2.dispose();
                    }
                };
            }
        }, composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return windowInsetsNestedScrollConnection;
    }
}
