package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kj.l;
import kj.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u000b\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a/\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0002\u001a:\u0010\u001d\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001aA\u0010#\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001aW\u0010+\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010!\u001a\u00020,2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001a\u0012\u0010/\u001a\u00020 *\b\u0012\u0004\u0012\u00020 0\u001fH\u0002\u001a!\u00100\u001a\u000201*\u0002012\u0006\u00102\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00065"}, d2 = {"createInsetRoundedRect", "Landroidx/compose/ui/geometry/RoundRect;", "widthPx", "", "roundedRect", "createRoundRectPath", "Landroidx/compose/ui/graphics/Path;", "targetPath", "strokeWidth", "fillArea", "", "border", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/BorderStroke;", "shape", "Landroidx/compose/ui/graphics/Shape;", "width", "Landroidx/compose/ui/unit/Dp;", "brush", "Landroidx/compose/ui/graphics/Brush;", "border-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "border-xT4_qwU", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "drawContentWithoutBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "drawGenericBorder", "borderCacheRef", "Landroidx/compose/ui/node/Ref;", "Landroidx/compose/foundation/BorderCache;", "outline", "Landroidx/compose/ui/graphics/Outline$Generic;", "drawRectBorder", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "strokeWidthPx", "drawRectBorder-NsqcLGU", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;JJZF)Landroidx/compose/ui/draw/DrawResult;", "drawRoundRectBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "drawRoundRectBorder-SYlcjDY", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "obtain", "shrink", "Landroidx/compose/ui/geometry/CornerRadius;", "value", "shrink-Kibmq7A", "(JF)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class BorderKt {
    public static final Modifier border(Modifier modifier, BorderStroke borderStroke, Shape shape) {
        m.h(modifier, "<this>");
        m.h(borderStroke, "border");
        m.h(shape, "shape");
        return m194borderziNgDLE(modifier, borderStroke.getWidth(), borderStroke.getBrush(), shape);
    }

    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    /* JADX INFO: renamed from: border-xT4_qwU, reason: not valid java name */
    public static final Modifier m192borderxT4_qwU(Modifier modifier, float f, long j, Shape shape) {
        m.h(modifier, "$this$border");
        m.h(shape, "shape");
        return m194borderziNgDLE(modifier, f, new SolidColor(j, null), shape);
    }

    /* JADX INFO: renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m193borderxT4_qwU$default(Modifier modifier, float f, long j, Shape shape, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m192borderxT4_qwU(modifier, f, j, shape);
    }

    /* JADX INFO: renamed from: border-ziNgDLE, reason: not valid java name */
    public static final Modifier m194borderziNgDLE(Modifier modifier, final float f, final Brush brush, final Shape shape) {
        m.h(modifier, "$this$border");
        m.h(brush, "brush");
        m.h(shape, "shape");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.BorderKt$border-ziNgDLE$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "border").set("width", Dp.m5265boximpl(f));
                if (brush instanceof SolidColor) {
                    inspectorInfo.getProperties().set(TypedValues.Custom.S_COLOR, Color.m2808boximpl(((SolidColor) brush).getValue()));
                    inspectorInfo.setValue(Color.m2808boximpl(((SolidColor) brush).getValue()));
                } else {
                    inspectorInfo.getProperties().set("brush", brush);
                }
                inspectorInfo.getProperties().set("shape", shape);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.BorderKt.border.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, -1498088849)) {
                    ComposerKt.traceEventStart(-1498088849, i2, -1, "androidx.compose.foundation.border.<anonymous> (Border.kt:93)");
                }
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Ref();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final Ref ref = (Ref) objRememberedValue;
                Modifier.Companion companion = Modifier.INSTANCE;
                final float f2 = f;
                final Shape shape2 = shape;
                final Brush brush2 = brush;
                Modifier modifierThen = modifier2.then(DrawModifierKt.drawWithCache(companion, new l<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderKt.border.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    public final DrawResult invoke(CacheDrawScope cacheDrawScope) throws NoWhenBranchMatchedException {
                        m.h(cacheDrawScope, "$this$drawWithCache");
                        if (!(androidx.compose.ui.unit.a.h(cacheDrawScope, f2) >= 0.0f && Size.m2653getMinDimensionimpl(cacheDrawScope.m2492getSizeNHjbRc()) > 0.0f)) {
                            return BorderKt.drawContentWithoutBorder(cacheDrawScope);
                        }
                        float f3 = 2;
                        float fMin = Math.min(Dp.m5272equalsimpl0(f2, Dp.INSTANCE.m5285getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(androidx.compose.ui.unit.a.h(cacheDrawScope, f2)), (float) Math.ceil(Size.m2653getMinDimensionimpl(cacheDrawScope.m2492getSizeNHjbRc()) / f3));
                        float f4 = fMin / f3;
                        long jOffset = OffsetKt.Offset(f4, f4);
                        long jSize = SizeKt.Size(Size.m2654getWidthimpl(cacheDrawScope.m2492getSizeNHjbRc()) - fMin, Size.m2651getHeightimpl(cacheDrawScope.m2492getSizeNHjbRc()) - fMin);
                        boolean z = f3 * fMin > Size.m2653getMinDimensionimpl(cacheDrawScope.m2492getSizeNHjbRc());
                        Outline outlineMo229createOutlinePq9zytI = shape2.mo229createOutlinePq9zytI(cacheDrawScope.m2492getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                        if (outlineMo229createOutlinePq9zytI instanceof Outline.Generic) {
                            return BorderKt.drawGenericBorder(cacheDrawScope, ref, brush2, (Outline.Generic) outlineMo229createOutlinePq9zytI, z, fMin);
                        }
                        if (outlineMo229createOutlinePq9zytI instanceof Outline.Rounded) {
                            return BorderKt.m196drawRoundRectBorderSYlcjDY(cacheDrawScope, ref, brush2, (Outline.Rounded) outlineMo229createOutlinePq9zytI, jOffset, jSize, z, fMin);
                        }
                        if (outlineMo229createOutlinePq9zytI instanceof Outline.Rectangle) {
                            return BorderKt.m195drawRectBorderNsqcLGU(cacheDrawScope, brush2, jOffset, jSize, z, fMin);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    private static final RoundRect createInsetRoundedRect(float f, RoundRect roundRect) {
        return new RoundRect(f, f, roundRect.getWidth() - f, roundRect.getHeight() - f, m197shrinkKibmq7A(roundRect.m2635getTopLeftCornerRadiuskKHJgLs(), f), m197shrinkKibmq7A(roundRect.m2636getTopRightCornerRadiuskKHJgLs(), f), m197shrinkKibmq7A(roundRect.m2634getBottomRightCornerRadiuskKHJgLs(), f), m197shrinkKibmq7A(roundRect.m2633getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }

    private static final Path createRoundRectPath(Path path, RoundRect roundRect, float f, boolean z) {
        path.reset();
        path.addRoundRect(roundRect);
        if (!z) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect(createInsetRoundedRect(f, roundRect));
            path.mo2719opN5in7k0(path, Path, PathOperation.INSTANCE.m3080getDifferenceb3I0S0c());
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(new l<ContentDrawScope, j>() { // from class: androidx.compose.foundation.BorderKt.drawContentWithoutBorder.1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return j.a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                m.h(contentDrawScope, "$this$onDrawWithContent");
                contentDrawScope.drawContent();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.draw.DrawResult drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope r42, androidx.compose.ui.node.Ref<androidx.compose.foundation.BorderCache> r43, final androidx.compose.ui.graphics.Brush r44, final androidx.compose.ui.graphics.Outline.Generic r45, boolean r46, float r47) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderKt.drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.node.Ref, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Outline$Generic, boolean, float):androidx.compose.ui.draw.DrawResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawRectBorder-NsqcLGU, reason: not valid java name */
    public static final DrawResult m195drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, final Brush brush, long j, long j2, boolean z, float f) {
        final long jM2601getZeroF1C5BW0 = z ? Offset.INSTANCE.m2601getZeroF1C5BW0() : j;
        final long jM2492getSizeNHjbRc = z ? cacheDrawScope.m2492getSizeNHjbRc() : j2;
        final DrawStyle stroke = z ? Fill.INSTANCE : new Stroke(f, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new l<ContentDrawScope, j>() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
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
                androidx.compose.ui.graphics.drawscope.b.J(contentDrawScope, brush, jM2601getZeroF1C5BW0, jM2492getSizeNHjbRc, 0.0f, stroke, null, 0, androidx.appcompat.R.styleable.AppCompatTheme_textAppearanceListItemSecondary, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawRoundRectBorder-SYlcjDY, reason: not valid java name */
    public static final DrawResult m196drawRoundRectBorderSYlcjDY(CacheDrawScope cacheDrawScope, Ref<BorderCache> ref, final Brush brush, Outline.Rounded rounded, final long j, final long j2, final boolean z, final float f) {
        if (!RoundRectKt.isSimple(rounded.getRoundRect())) {
            final Path pathCreateRoundRectPath = createRoundRectPath(obtain(ref).obtainPath(), rounded.getRoundRect(), f, z);
            return cacheDrawScope.onDrawWithContent(new l<ContentDrawScope, j>() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$2
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
                    androidx.compose.ui.graphics.drawscope.b.F(contentDrawScope, pathCreateRoundRectPath, brush, 0.0f, null, null, 0, 60, null);
                }
            });
        }
        final long jM2635getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m2635getTopLeftCornerRadiuskKHJgLs();
        final float f2 = f / 2;
        final Stroke stroke = new Stroke(f, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new l<ContentDrawScope, j>() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$1
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
                if (z) {
                    androidx.compose.ui.graphics.drawscope.b.L(contentDrawScope, brush, 0L, 0L, jM2635getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 246, null);
                    return;
                }
                float fM2560getXimpl = CornerRadius.m2560getXimpl(jM2635getTopLeftCornerRadiuskKHJgLs);
                float f3 = f2;
                if (fM2560getXimpl >= f3) {
                    androidx.compose.ui.graphics.drawscope.b.L(contentDrawScope, brush, j, j2, BorderKt.m197shrinkKibmq7A(jM2635getTopLeftCornerRadiuskKHJgLs, f3), 0.0f, stroke, null, 0, 208, null);
                    return;
                }
                float f4 = f;
                float fM2654getWidthimpl = Size.m2654getWidthimpl(contentDrawScope.mo3254getSizeNHjbRc()) - f;
                float fM2651getHeightimpl = Size.m2651getHeightimpl(contentDrawScope.mo3254getSizeNHjbRc()) - f;
                int iM2806getDifferencertfAjoo = ClipOp.INSTANCE.m2806getDifferencertfAjoo();
                Brush brush2 = brush;
                long j3 = jM2635getTopLeftCornerRadiuskKHJgLs;
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo3263clipRectN_I0leg(f4, f4, fM2654getWidthimpl, fM2651getHeightimpl, iM2806getDifferencertfAjoo);
                androidx.compose.ui.graphics.drawscope.b.L(contentDrawScope, brush2, 0L, 0L, j3, 0.0f, null, null, 0, 246, null);
                drawContext.getCanvas().restore();
                drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
            }
        });
    }

    private static final BorderCache obtain(Ref<BorderCache> ref) {
        BorderCache value = ref.getValue();
        if (value != null) {
            return value;
        }
        BorderCache borderCache = new BorderCache(null, null, null, null, 15, null);
        ref.setValue(borderCache);
        return borderCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m197shrinkKibmq7A(long j, float f) {
        return CornerRadiusKt.CornerRadius(Math.max(0.0f, CornerRadius.m2560getXimpl(j) - f), Math.max(0.0f, CornerRadius.m2561getYimpl(j) - f));
    }
}
