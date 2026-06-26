package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kj.l;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SystemGestureExclusion.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\u001e\u0010\u0001\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u001a(\u0010\u0006\u001a\u00020\u00002\u0016\b\b\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0083\b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Modifier;", "systemGestureExclusion", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "exclusion", "excludeFromSystemGestureQ", "(Lkj/l;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class SystemGestureExclusionKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.SystemGestureExclusionKt$excludeFromSystemGestureQ$1, reason: invalid class name */
    /* JADX INFO: compiled from: SystemGestureExclusion.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass1 extends Lambda implements l<DisposableEffectScope, DisposableEffectResult> {
        final /* synthetic */ ExcludeFromSystemGestureModifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ExcludeFromSystemGestureModifier excludeFromSystemGestureModifier) {
            super(1);
            this.$modifier = excludeFromSystemGestureModifier;
        }

        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            m.h(disposableEffectScope, "$this$DisposableEffect");
            final ExcludeFromSystemGestureModifier excludeFromSystemGestureModifier = this.$modifier;
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.SystemGestureExclusionKt$excludeFromSystemGestureQ$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    excludeFromSystemGestureModifier.removeRect();
                }
            };
        }
    }

    @Composable
    @RequiresApi(androidx.appcompat.R.styleable.AppCompatTheme_actionModeStyle)
    private static final Modifier excludeFromSystemGestureQ(l<? super LayoutCoordinates, Rect> lVar, Composer composer, int i2) {
        composer.startReplaceableGroup(1687674107);
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(view) | composer.changed(lVar);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new ExcludeFromSystemGestureModifier(view, lVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        ExcludeFromSystemGestureModifier excludeFromSystemGestureModifier = (ExcludeFromSystemGestureModifier) objRememberedValue;
        EffectsKt.DisposableEffect(excludeFromSystemGestureModifier, new AnonymousClass1(excludeFromSystemGestureModifier), composer, 0);
        composer.endReplaceableGroup();
        return excludeFromSystemGestureModifier;
    }

    public static final Modifier systemGestureExclusion(Modifier modifier) {
        m.h(modifier, "<this>");
        if (Build.VERSION.SDK_INT < 29) {
            return modifier;
        }
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.SystemGestureExclusionKt$systemGestureExclusion$$inlined$debugInspectorInfo$1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                m.h(inspectorInfo, "$this$null");
                inspectorInfo.setName("systemGestureExclusion");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.SystemGestureExclusionKt.systemGestureExclusion.2
            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, 1120057036)) {
                    ComposerKt.traceEventStart(1120057036, i2, -1, "androidx.compose.foundation.systemGestureExclusion.<anonymous> (SystemGestureExclusion.kt:46)");
                }
                composer.startReplaceableGroup(1687674107);
                View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
                composer.startReplaceableGroup(511388516);
                boolean zChanged = composer.changed(view) | composer.changed((Object) null);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ExcludeFromSystemGestureModifier(view, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                ExcludeFromSystemGestureModifier excludeFromSystemGestureModifier = (ExcludeFromSystemGestureModifier) objRememberedValue;
                EffectsKt.DisposableEffect(excludeFromSystemGestureModifier, new AnonymousClass1(excludeFromSystemGestureModifier), composer, 0);
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return excludeFromSystemGestureModifier;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    public static final Modifier systemGestureExclusion(Modifier modifier, final l<? super LayoutCoordinates, Rect> lVar) {
        m.h(modifier, "<this>");
        m.h(lVar, "exclusion");
        if (Build.VERSION.SDK_INT < 29) {
            return modifier;
        }
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.SystemGestureExclusionKt$systemGestureExclusion$$inlined$debugInspectorInfo$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "systemGestureExclusion").set("exclusion", lVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.SystemGestureExclusionKt.systemGestureExclusion.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, 108999)) {
                    ComposerKt.traceEventStart(108999, i2, -1, "androidx.compose.foundation.systemGestureExclusion.<anonymous> (SystemGestureExclusion.kt:68)");
                }
                l<LayoutCoordinates, Rect> lVar2 = lVar;
                composer.startReplaceableGroup(1687674107);
                View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
                composer.startReplaceableGroup(511388516);
                boolean zChanged = composer.changed(view) | composer.changed(lVar2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ExcludeFromSystemGestureModifier(view, lVar2);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                ExcludeFromSystemGestureModifier excludeFromSystemGestureModifier = (ExcludeFromSystemGestureModifier) objRememberedValue;
                EffectsKt.DisposableEffect(excludeFromSystemGestureModifier, new AnonymousClass1(excludeFromSystemGestureModifier), composer, 0);
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return excludeFromSystemGestureModifier;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }
}
