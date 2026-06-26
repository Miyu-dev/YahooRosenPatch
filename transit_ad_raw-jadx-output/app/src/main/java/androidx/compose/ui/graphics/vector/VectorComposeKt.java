package androidx.compose.ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.List;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: VectorCompose.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0087\u0001\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a©\u0001\u0010'\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"", HintConstants.AUTOFILL_HINT_NAME, "", "rotation", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "Lkotlin/Function0;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "content", "Group", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lkj/p;Landroidx/compose/runtime/Composer;II)V", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Landroidx/compose/ui/graphics/Brush;", "fill", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "Path-9cdaXJ4", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", "Path", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class VectorComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0115  */
    @androidx.compose.ui.graphics.vector.VectorComposable
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Group(java.lang.String r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> r28, final kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorComposeKt.Group(java.lang.String, float, float, float, float, float, float, float, java.util.List, kj.p, androidx.compose.runtime.Composer, int, int):void");
    }

    @VectorComposable
    @Composable
    /* JADX INFO: renamed from: Path-9cdaXJ4, reason: not valid java name */
    public static final void m3372Path9cdaXJ4(final List<? extends PathNode> list, int i2, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i3, int i4, float f4, float f5, float f6, float f7, Composer composer, final int i5, final int i6, final int i7) {
        m.h(list, "pathData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1478270750);
        int defaultFillType = (i7 & 2) != 0 ? VectorKt.getDefaultFillType() : i2;
        String str2 = (i7 & 4) != 0 ? "" : str;
        Brush brush3 = (i7 & 8) != 0 ? null : brush;
        float f8 = (i7 & 16) != 0 ? 1.0f : f;
        final Brush brush4 = (i7 & 32) == 0 ? brush2 : null;
        float f9 = (i7 & 64) != 0 ? 1.0f : f2;
        float f10 = (i7 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? 0.0f : f3;
        int defaultStrokeLineCap = (i7 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? VectorKt.getDefaultStrokeLineCap() : i3;
        int defaultStrokeLineJoin = (i7 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i4;
        float f11 = (i7 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? 4.0f : f4;
        float f12 = (i7 & 2048) != 0 ? 0.0f : f5;
        float f13 = (i7 & 4096) != 0 ? 1.0f : f6;
        float f14 = (i7 & 8192) != 0 ? 0.0f : f7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1478270750, i5, i6, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:99)");
        }
        final VectorComposeKt$Path$1 vectorComposeKt$Path$1 = new kj.a<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final PathComponent m3374invoke() {
                return new PathComponent();
            }
        };
        composerStartRestartGroup.startReplaceableGroup(1886828752);
        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(new kj.a<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path-9cdaXJ4$$inlined$ComposeNode$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.graphics.vector.PathComponent, java.lang.Object] */
                public final PathComponent invoke() {
                    return vectorComposeKt$Path$1.invoke();
                }
            });
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composerStartRestartGroup);
        Updater.m2444setimpl(composerM2437constructorimpl, str2, new p<PathComponent, String, j>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, (String) obj2);
                return j.a;
            }

            public final void invoke(PathComponent pathComponent, String str3) {
                m.h(pathComponent, "$this$set");
                m.h(str3, "it");
                pathComponent.setName(str3);
            }
        });
        Updater.m2444setimpl(composerM2437constructorimpl, list, new p<PathComponent, List<? extends PathNode>, j>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, (List<? extends PathNode>) obj2);
                return j.a;
            }

            public final void invoke(PathComponent pathComponent, List<? extends PathNode> list2) {
                m.h(pathComponent, "$this$set");
                m.h(list2, "it");
                pathComponent.setPathData(list2);
            }
        });
        Updater.m2444setimpl(composerM2437constructorimpl, PathFillType.m3064boximpl(defaultFillType), new p<PathComponent, PathFillType, j>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m3376invokepweu1eQ((PathComponent) obj, ((PathFillType) obj2).getValue());
                return j.a;
            }

            /* JADX INFO: renamed from: invoke-pweu1eQ, reason: not valid java name */
            public final void m3376invokepweu1eQ(PathComponent pathComponent, int i8) {
                m.h(pathComponent, "$this$set");
                pathComponent.m3366setPathFillTypeoQ8Xj4U(i8);
            }
        });
        Updater.m2444setimpl(composerM2437constructorimpl, brush3, new p<PathComponent, Brush, j>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, (Brush) obj2);
                return j.a;
            }

            public final void invoke(PathComponent pathComponent, Brush brush5) {
                m.h(pathComponent, "$this$set");
                pathComponent.setFill(brush5);
            }
        });
        Updater.m2444setimpl(composerM2437constructorimpl, Float.valueOf(f8), new p<PathComponent, Float, j>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, ((Number) obj2).floatValue());
                return j.a;
            }

            public final void invoke(PathComponent pathComponent, float f15) {
                m.h(pathComponent, "$this$set");
                pathComponent.setFillAlpha(f15);
            }
        });
        Updater.m2444setimpl(composerM2437constructorimpl, brush4, new p<PathComponent, Brush, j>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, (Brush) obj2);
                return j.a;
            }

            public final void invoke(PathComponent pathComponent, Brush brush5) {
                m.h(pathComponent, "$this$set");
                pathComponent.setStroke(brush5);
            }
        });
        Updater.m2444setimpl(composerM2437constructorimpl, Float.valueOf(f9), new p<PathComponent, Float, j>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, ((Number) obj2).floatValue());
                return j.a;
            }

            public final void invoke(PathComponent pathComponent, float f15) {
                m.h(pathComponent, "$this$set");
                pathComponent.setStrokeAlpha(f15);
            }
        });
        Updater.m2444setimpl(composerM2437constructorimpl, Float.valueOf(f10), new p<PathComponent, Float, j>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, ((Number) obj2).floatValue());
                return j.a;
            }

            public final void invoke(PathComponent pathComponent, float f15) {
                m.h(pathComponent, "$this$set");
                pathComponent.setStrokeLineWidth(f15);
            }
        });
        Updater.m2444setimpl(composerM2437constructorimpl, StrokeJoin.m3144boximpl(defaultStrokeLineJoin), new p<PathComponent, StrokeJoin, j>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m3377invokekLtJ_vA((PathComponent) obj, ((StrokeJoin) obj2).getValue());
                return j.a;
            }

            /* JADX INFO: renamed from: invoke-kLtJ_vA, reason: not valid java name */
            public final void m3377invokekLtJ_vA(PathComponent pathComponent, int i8) {
                m.h(pathComponent, "$this$set");
                pathComponent.m3368setStrokeLineJoinWw9F2mQ(i8);
            }
        });
        Updater.m2444setimpl(composerM2437constructorimpl, StrokeCap.m3134boximpl(defaultStrokeLineCap), new p<PathComponent, StrokeCap, j>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m3375invokeCSYIeUk((PathComponent) obj, ((StrokeCap) obj2).getValue());
                return j.a;
            }

            /* JADX INFO: renamed from: invoke-CSYIeUk, reason: not valid java name */
            public final void m3375invokeCSYIeUk(PathComponent pathComponent, int i8) {
                m.h(pathComponent, "$this$set");
                pathComponent.m3367setStrokeLineCapBeK7IIE(i8);
            }
        });
        Updater.m2444setimpl(composerM2437constructorimpl, Float.valueOf(f11), new p<PathComponent, Float, j>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, ((Number) obj2).floatValue());
                return j.a;
            }

            public final void invoke(PathComponent pathComponent, float f15) {
                m.h(pathComponent, "$this$set");
                pathComponent.setStrokeLineMiter(f15);
            }
        });
        Updater.m2444setimpl(composerM2437constructorimpl, Float.valueOf(f12), new p<PathComponent, Float, j>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, ((Number) obj2).floatValue());
                return j.a;
            }

            public final void invoke(PathComponent pathComponent, float f15) {
                m.h(pathComponent, "$this$set");
                pathComponent.setTrimPathStart(f15);
            }
        });
        Updater.m2444setimpl(composerM2437constructorimpl, Float.valueOf(f13), new p<PathComponent, Float, j>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, ((Number) obj2).floatValue());
                return j.a;
            }

            public final void invoke(PathComponent pathComponent, float f15) {
                m.h(pathComponent, "$this$set");
                pathComponent.setTrimPathEnd(f15);
            }
        });
        Updater.m2444setimpl(composerM2437constructorimpl, Float.valueOf(f14), new p<PathComponent, Float, j>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, ((Number) obj2).floatValue());
                return j.a;
            }

            public final void invoke(PathComponent pathComponent, float f15) {
                m.h(pathComponent, "$this$set");
                pathComponent.setTrimPathOffset(f15);
            }
        });
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final int i8 = defaultFillType;
        final String str3 = str2;
        final Brush brush5 = brush3;
        final float f15 = f8;
        final float f16 = f9;
        final float f17 = f10;
        final int i9 = defaultStrokeLineCap;
        final int i10 = defaultStrokeLineJoin;
        final float f18 = f11;
        final float f19 = f12;
        final float f20 = f13;
        final float f21 = f14;
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i11) {
                VectorComposeKt.m3372Path9cdaXJ4(list, i8, str3, brush5, f15, brush4, f16, f17, i9, i10, f18, f19, f20, f21, composer2, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), RecomposeScopeImplKt.updateChangedFlags(i6), i7);
            }
        });
    }
}
