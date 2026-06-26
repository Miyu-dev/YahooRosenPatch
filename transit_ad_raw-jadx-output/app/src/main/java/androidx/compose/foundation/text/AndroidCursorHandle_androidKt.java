package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.animation.b;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.HandleReferencePoint;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.widgets.Optimizer;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AndroidCursorHandle.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a:\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u0006H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\f\u0010\r\u001a\u00020\u0002*\u00020\u0002H\u0000\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u001d\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u001d\u0010\u0015\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "handlePosition", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "content", "CursorHandle-ULxng0E", "(JLandroidx/compose/ui/Modifier;Lkj/p;Landroidx/compose/runtime/Composer;I)V", "CursorHandle", "DefaultCursorHandle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "drawCursorHandle", "", "Sqrt2", "F", "Landroidx/compose/ui/unit/Dp;", "CursorHandleHeight", "getCursorHandleHeight", "()F", "CursorHandleWidth", "getCursorHandleWidth", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class AndroidCursorHandle_androidKt {
    private static final float CursorHandleHeight;
    private static final float CursorHandleWidth;
    private static final float Sqrt2 = 1.4142135f;

    static {
        float fM5267constructorimpl = Dp.m5267constructorimpl(25);
        CursorHandleHeight = fM5267constructorimpl;
        CursorHandleWidth = Dp.m5267constructorimpl(Dp.m5267constructorimpl(fM5267constructorimpl * 2.0f) / 2.4142137f);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: CursorHandle-ULxng0E, reason: not valid java name */
    public static final void m784CursorHandleULxng0E(final long j, final Modifier modifier, final p<? super Composer, ? super Integer, j> pVar, Composer composer, final int i2) {
        final int i3;
        m.h(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-5185995);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-5185995, i3, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:38)");
            }
            AndroidSelectionHandles_androidKt.m911HandlePopupULxng0E(j, HandleReferencePoint.TopMiddle, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1458480226, true, new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return j.a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1458480226, i4, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:46)");
                    }
                    if (pVar == null) {
                        composer2.startReplaceableGroup(1275643833);
                        AndroidCursorHandle_androidKt.DefaultCursorHandle(modifier, composer2, (i3 >> 3) & 14);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1275643903);
                        pVar.invoke(composer2, Integer.valueOf((i3 >> 6) & 14));
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i3 & 14) | 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i4) {
                AndroidCursorHandle_androidKt.m784CursorHandleULxng0E(j, modifier, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DefaultCursorHandle(final Modifier modifier, Composer composer, final int i2) {
        int i3;
        m.h(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(694251107);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(694251107, i2, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:57)");
            }
            SpacerKt.Spacer(drawCursorHandle(SizeKt.m506sizeVpY3zN4(modifier, CursorHandleWidth, CursorHandleHeight)), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt.DefaultCursorHandle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i4) {
                AndroidCursorHandle_androidKt.DefaultCursorHandle(modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    public static final Modifier drawCursorHandle(Modifier modifier) {
        m.h(modifier, "<this>");
        return ComposedModifierKt.composed$default(modifier, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt.drawCursorHandle.1
            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (b.n(modifier2, "$this$composed", composer, -2126899193)) {
                    ComposerKt.traceEventStart(-2126899193, i2, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:62)");
                }
                final long handleColor = ((TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getHandleColor();
                Modifier.Companion companion = Modifier.INSTANCE;
                Color colorM2808boximpl = Color.m2808boximpl(handleColor);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(colorM2808boximpl);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new l<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                            m.h(cacheDrawScope, "$this$drawWithCache");
                            final float fM2654getWidthimpl = Size.m2654getWidthimpl(cacheDrawScope.m2492getSizeNHjbRc()) / 2.0f;
                            final ImageBitmap imageBitmapCreateHandleImage = AndroidSelectionHandles_androidKt.createHandleImage(cacheDrawScope, fM2654getWidthimpl);
                            final ColorFilter colorFilterM2859tintxETnrds$default = ColorFilter.Companion.m2859tintxETnrds$default(ColorFilter.INSTANCE, handleColor, 0, 2, null);
                            return cacheDrawScope.onDrawWithContent(new l<ContentDrawScope, j>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((ContentDrawScope) obj);
                                    return j.a;
                                }

                                public final void invoke(ContentDrawScope contentDrawScope) {
                                    m.h(contentDrawScope, "$this$onDrawWithContent");
                                    contentDrawScope.drawContent();
                                    float f = fM2654getWidthimpl;
                                    ImageBitmap imageBitmap = imageBitmapCreateHandleImage;
                                    ColorFilter colorFilter = colorFilterM2859tintxETnrds$default;
                                    DrawContext drawContext = contentDrawScope.getDrawContext();
                                    long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
                                    drawContext.getCanvas().save();
                                    DrawTransform transform = drawContext.getTransform();
                                    c.g(transform, f, 0.0f, 2, null);
                                    transform.mo3266rotateUv8p0NA(45.0f, Offset.INSTANCE.m2601getZeroF1C5BW0());
                                    androidx.compose.ui.graphics.drawscope.b.A(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                                    drawContext.getCanvas().restore();
                                    drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
                                }
                            });
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierThen = modifier2.then(DrawModifierKt.drawWithCache(companion, (l) objRememberedValue));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        }, 1, null);
    }

    public static final float getCursorHandleHeight() {
        return CursorHandleHeight;
    }

    public static final float getCursorHandleWidth() {
        return CursorHandleWidth;
    }
}
