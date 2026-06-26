package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AndroidOverscroll.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010c\u001a\u00020b\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\bd\u0010eJ9\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJE\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\rH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0016\u001a\u00020\u0011*\u00020\u0015J\b\u0010\u0018\u001a\u00020\u0017H\u0002J \u0010\u001e\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0002J \u0010 \u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00192\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0002J \u0010\"\u001a\u00020\u0017*\u00020\u00152\u0006\u0010!\u001a\u00020\u00192\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0002J \u0010$\u001a\u00020\u0017*\u00020\u00152\u0006\u0010#\u001a\u00020\u00192\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0002J\b\u0010%\u001a\u00020\u0011H\u0002J\b\u0010&\u001a\u00020\u0011H\u0002J\u001d\u0010)\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J%\u0010/\u001a\u00020,2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J%\u00101\u001a\u00020,2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u0010.J%\u00103\u001a\u00020,2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u0010.J%\u00105\u001a\u00020,2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u0010.R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R!\u00109\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010>\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010?\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010<R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00190@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010<R\u0014\u0010D\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010<R\u0014\u0010E\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010<R\u0014\u0010F\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010<R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00110G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR(\u0010J\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bJ\u0010K\u0012\u0004\bP\u0010Q\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010KR\u001f\u0010T\u001a\u00020S8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bT\u0010UR#\u0010W\u001a\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bW\u0010XR!\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010]\u001a\u00020\\8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010M\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006f"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "Landroidx/compose/ui/geometry/Offset;", "delta", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "Lkotlin/Function1;", "performScroll", "applyToScroll-Rhakbz0", "(JILkj/l;)J", "applyToScroll", "Landroidx/compose/ui/unit/Velocity;", "velocity", "Lkotlin/Function2;", "Ldj/c;", "", "performFling", "Lkotlin/j;", "applyToFling-BMRW4eQ", "(JLkj/p;Ldj/c;)Ljava/lang/Object;", "applyToFling", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawOverscroll", "", "stopOverscrollAnimation", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "drawLeft", "top", "drawTop", "right", "drawRight", "bottom", "drawBottom", "invalidateOverscroll", "animateToRelease", "releaseOppositeOverscroll-k-4lQ0M", "(J)Z", "releaseOppositeOverscroll", "scroll", "displacement", "", "pullTop-0a9Yr6o", "(JJ)F", "pullTop", "pullBottom-0a9Yr6o", "pullBottom", "pullLeft-0a9Yr6o", "pullLeft", "pullRight-0a9Yr6o", "pullRight", "Landroidx/compose/foundation/OverscrollConfiguration;", "overscrollConfig", "Landroidx/compose/foundation/OverscrollConfiguration;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "topEffect", "Landroid/widget/EdgeEffect;", "bottomEffect", "leftEffect", "rightEffect", "", "allEffects", "Ljava/util/List;", "topEffectNegation", "bottomEffectNegation", "leftEffectNegation", "rightEffectNegation", "Landroidx/compose/runtime/MutableState;", "redrawSignal", "Landroidx/compose/runtime/MutableState;", "invalidationEnabled", "Z", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "getInvalidationEnabled$foundation_release$annotations", "()V", "scrollCycleInProgress", "Landroidx/compose/ui/geometry/Size;", "containerSize", "J", "Landroidx/compose/ui/unit/IntSize;", "onNewSize", "Lkj/l;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "Landroidx/compose/ui/Modifier;", "effectModifier", "Landroidx/compose/ui/Modifier;", "getEffectModifier", "()Landroidx/compose/ui/Modifier;", "isInProgress", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Landroidx/compose/foundation/OverscrollConfiguration;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    private final List<EdgeEffect> allEffects;
    private final EdgeEffect bottomEffect;
    private final EdgeEffect bottomEffectNegation;
    private long containerSize;
    private final Modifier effectModifier;
    private boolean invalidationEnabled;
    private final EdgeEffect leftEffect;
    private final EdgeEffect leftEffectNegation;
    private final l<IntSize, j> onNewSize;
    private final OverscrollConfiguration overscrollConfig;
    private PointerId pointerId;
    private Offset pointerPosition;
    private final MutableState<j> redrawSignal;
    private final EdgeEffect rightEffect;
    private final EdgeEffect rightEffectNegation;
    private boolean scrollCycleInProgress;
    private final EdgeEffect topEffect;
    private final EdgeEffect topEffectNegation;

    public AndroidEdgeEffectOverscrollEffect(Context context, OverscrollConfiguration overscrollConfiguration) {
        m.h(context, "context");
        m.h(overscrollConfiguration, "overscrollConfig");
        this.overscrollConfig = overscrollConfiguration;
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        EdgeEffect edgeEffectCreate = edgeEffectCompat.create(context, null);
        this.topEffect = edgeEffectCreate;
        EdgeEffect edgeEffectCreate2 = edgeEffectCompat.create(context, null);
        this.bottomEffect = edgeEffectCreate2;
        EdgeEffect edgeEffectCreate3 = edgeEffectCompat.create(context, null);
        this.leftEffect = edgeEffectCreate3;
        EdgeEffect edgeEffectCreate4 = edgeEffectCompat.create(context, null);
        this.rightEffect = edgeEffectCreate4;
        List<EdgeEffect> listV = a.f.V(edgeEffectCreate3, edgeEffectCreate, edgeEffectCreate4, edgeEffectCreate2);
        this.allEffects = listV;
        this.topEffectNegation = edgeEffectCompat.create(context, null);
        this.bottomEffectNegation = edgeEffectCompat.create(context, null);
        this.leftEffectNegation = edgeEffectCompat.create(context, null);
        this.rightEffectNegation = edgeEffectCompat.create(context, null);
        int size = listV.size();
        for (int i2 = 0; i2 < size; i2++) {
            listV.get(i2).setColor(ColorKt.m2872toArgb8_81llA(this.overscrollConfig.getGlowColor()));
        }
        j jVar = j.a;
        this.redrawSignal = SnapshotStateKt.mutableStateOf(jVar, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.INSTANCE.m2663getZeroNHjbRc();
        l<IntSize, j> lVar = new l<IntSize, j>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$onNewSize$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m178invokeozmzZPI(((IntSize) obj).getPackedValue());
                return j.a;
            }

            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
            public final void m178invokeozmzZPI(long j) {
                boolean z = !Size.m2650equalsimpl0(IntSizeKt.m5437toSizeozmzZPI(j), this.this$0.containerSize);
                this.this$0.containerSize = IntSizeKt.m5437toSizeozmzZPI(j);
                if (z) {
                    this.this$0.topEffect.setSize(IntSize.m5427getWidthimpl(j), IntSize.m5426getHeightimpl(j));
                    this.this$0.bottomEffect.setSize(IntSize.m5427getWidthimpl(j), IntSize.m5426getHeightimpl(j));
                    this.this$0.leftEffect.setSize(IntSize.m5426getHeightimpl(j), IntSize.m5427getWidthimpl(j));
                    this.this$0.rightEffect.setSize(IntSize.m5426getHeightimpl(j), IntSize.m5427getWidthimpl(j));
                    this.this$0.topEffectNegation.setSize(IntSize.m5427getWidthimpl(j), IntSize.m5426getHeightimpl(j));
                    this.this$0.bottomEffectNegation.setSize(IntSize.m5427getWidthimpl(j), IntSize.m5426getHeightimpl(j));
                    this.this$0.leftEffectNegation.setSize(IntSize.m5426getHeightimpl(j), IntSize.m5427getWidthimpl(j));
                    this.this$0.rightEffectNegation.setSize(IntSize.m5426getHeightimpl(j), IntSize.m5427getWidthimpl(j));
                }
                if (z) {
                    this.this$0.invalidateOverscroll();
                    this.this$0.animateToRelease();
                }
            }
        };
        this.onNewSize = lVar;
        this.effectModifier = OnRemeasuredModifierKt.onSizeChanged(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE.then(AndroidOverscrollKt.StretchOverscrollNonClippingLayer), jVar, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null)), lVar).then(new DrawOverscrollModifier(this, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                m.h(inspectorInfo, "$this$null");
                inspectorInfo.setName("overscroll");
                inspectorInfo.setValue(this.this$0);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateToRelease() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            EdgeEffect edgeEffect = list.get(i2);
            edgeEffect.onRelease();
            z = edgeEffect.isFinished() || z;
        }
        if (z) {
            invalidateOverscroll();
        }
    }

    private final boolean drawBottom(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Size.m2654getWidthimpl(this.containerSize), (-Size.m2651getHeightimpl(this.containerSize)) + drawScope.mo348toPx0680j_4(this.overscrollConfig.getDrawPadding().getBottom()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean drawLeft(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Size.m2651getHeightimpl(this.containerSize), drawScope.mo348toPx0680j_4(this.overscrollConfig.getDrawPadding().mo442calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection())));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean drawRight(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        int iF0 = a.f.f0(Size.m2654getWidthimpl(this.containerSize));
        float fMo443calculateRightPaddingu2uoSUM = this.overscrollConfig.getDrawPadding().mo443calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, drawScope.mo348toPx0680j_4(fMo443calculateRightPaddingu2uoSUM) + (-iF0));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean drawTop(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.translate(0.0f, drawScope.mo348toPx0680j_4(this.overscrollConfig.getDrawPadding().getTop()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOverscroll() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(j.a);
        }
    }

    /* JADX INFO: renamed from: pullBottom-0a9Yr6o, reason: not valid java name */
    private final float m171pullBottom0a9Yr6o(long scroll, long displacement) {
        float fM2585getXimpl = Offset.m2585getXimpl(displacement) / Size.m2654getWidthimpl(this.containerSize);
        float fM2586getYimpl = Offset.m2586getYimpl(scroll) / Size.m2651getHeightimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return !(edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) ? Offset.m2586getYimpl(scroll) : Size.m2651getHeightimpl(this.containerSize) * (-edgeEffectCompat.onPullDistanceCompat(this.bottomEffect, -fM2586getYimpl, 1 - fM2585getXimpl));
    }

    /* JADX INFO: renamed from: pullLeft-0a9Yr6o, reason: not valid java name */
    private final float m172pullLeft0a9Yr6o(long scroll, long displacement) {
        float fM2586getYimpl = Offset.m2586getYimpl(displacement) / Size.m2651getHeightimpl(this.containerSize);
        float fM2585getXimpl = Offset.m2585getXimpl(scroll) / Size.m2654getWidthimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return !(edgeEffectCompat.getDistanceCompat(this.leftEffect) == 0.0f) ? Offset.m2585getXimpl(scroll) : Size.m2654getWidthimpl(this.containerSize) * edgeEffectCompat.onPullDistanceCompat(this.leftEffect, fM2585getXimpl, 1 - fM2586getYimpl);
    }

    /* JADX INFO: renamed from: pullRight-0a9Yr6o, reason: not valid java name */
    private final float m173pullRight0a9Yr6o(long scroll, long displacement) {
        float fM2586getYimpl = Offset.m2586getYimpl(displacement) / Size.m2651getHeightimpl(this.containerSize);
        float fM2585getXimpl = Offset.m2585getXimpl(scroll) / Size.m2654getWidthimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return !((edgeEffectCompat.getDistanceCompat(this.rightEffect) > 0.0f ? 1 : (edgeEffectCompat.getDistanceCompat(this.rightEffect) == 0.0f ? 0 : -1)) == 0) ? Offset.m2585getXimpl(scroll) : Size.m2654getWidthimpl(this.containerSize) * (-edgeEffectCompat.onPullDistanceCompat(this.rightEffect, -fM2585getXimpl, fM2586getYimpl));
    }

    /* JADX INFO: renamed from: pullTop-0a9Yr6o, reason: not valid java name */
    private final float m174pullTop0a9Yr6o(long scroll, long displacement) {
        float fM2585getXimpl = Offset.m2585getXimpl(displacement) / Size.m2654getWidthimpl(this.containerSize);
        float fM2586getYimpl = Offset.m2586getYimpl(scroll) / Size.m2651getHeightimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return !((edgeEffectCompat.getDistanceCompat(this.topEffect) > 0.0f ? 1 : (edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f ? 0 : -1)) == 0) ? Offset.m2586getYimpl(scroll) : Size.m2651getHeightimpl(this.containerSize) * edgeEffectCompat.onPullDistanceCompat(this.topEffect, fM2586getYimpl, fM2585getXimpl);
    }

    /* JADX INFO: renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    private final boolean m175releaseOppositeOverscrollk4lQ0M(long delta) {
        boolean zIsFinished;
        if (this.leftEffect.isFinished() || Offset.m2585getXimpl(delta) >= 0.0f) {
            zIsFinished = false;
        } else {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.leftEffect, Offset.m2585getXimpl(delta));
            zIsFinished = this.leftEffect.isFinished();
        }
        if (!this.rightEffect.isFinished() && Offset.m2585getXimpl(delta) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.rightEffect, Offset.m2585getXimpl(delta));
            zIsFinished = zIsFinished || this.rightEffect.isFinished();
        }
        if (!this.topEffect.isFinished() && Offset.m2586getYimpl(delta) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.topEffect, Offset.m2586getYimpl(delta));
            zIsFinished = zIsFinished || this.topEffect.isFinished();
        }
        if (this.bottomEffect.isFinished() || Offset.m2586getYimpl(delta) <= 0.0f) {
            return zIsFinished;
        }
        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.bottomEffect, Offset.m2586getYimpl(delta));
        return zIsFinished || this.bottomEffect.isFinished();
    }

    private final boolean stopOverscrollAnimation() {
        boolean z;
        long jM2664getCenteruvyYCjk = SizeKt.m2664getCenteruvyYCjk(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffect) == 0.0f) {
            z = false;
        } else {
            m172pullLeft0a9Yr6o(Offset.INSTANCE.m2601getZeroF1C5BW0(), jM2664getCenteruvyYCjk);
            z = true;
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.rightEffect) == 0.0f)) {
            m173pullRight0a9Yr6o(Offset.INSTANCE.m2601getZeroF1C5BW0(), jM2664getCenteruvyYCjk);
            z = true;
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f)) {
            m174pullTop0a9Yr6o(Offset.INSTANCE.m2601getZeroF1C5BW0(), jM2664getCenteruvyYCjk);
            z = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) {
            return z;
        }
        m171pullBottom0a9Yr6o(Offset.INSTANCE.m2601getZeroF1C5BW0(), jM2664getCenteruvyYCjk);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo176applyToFlingBMRW4eQ(long r12, kj.p<? super androidx.compose.ui.unit.Velocity, ? super dj.c<? super androidx.compose.ui.unit.Velocity>, ? extends java.lang.Object> r14, dj.c<? super kotlin.j> r15) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo176applyToFlingBMRW4eQ(long, kj.p, dj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0170 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0174  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo177applyToScrollRhakbz0(long r18, int r20, kj.l<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> r21) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo177applyToScrollRhakbz0(long, int, kj.l):long");
    }

    public final void drawOverscroll(DrawScope drawScope) {
        boolean zDrawLeft;
        m.h(drawScope, "<this>");
        if (Size.m2656isEmptyimpl(this.containerSize)) {
            return;
        }
        androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        this.redrawSignal.getValue();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        boolean z = true;
        if (!(edgeEffectCompat.getDistanceCompat(this.leftEffectNegation) == 0.0f)) {
            drawRight(drawScope, this.leftEffectNegation, nativeCanvas);
            this.leftEffectNegation.finish();
        }
        if (this.leftEffect.isFinished()) {
            zDrawLeft = false;
        } else {
            zDrawLeft = drawLeft(drawScope, this.leftEffect, nativeCanvas);
            edgeEffectCompat.onPullDistanceCompat(this.leftEffectNegation, edgeEffectCompat.getDistanceCompat(this.leftEffect), 0.0f);
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.topEffectNegation) == 0.0f)) {
            drawBottom(drawScope, this.topEffectNegation, nativeCanvas);
            this.topEffectNegation.finish();
        }
        if (!this.topEffect.isFinished()) {
            zDrawLeft = drawTop(drawScope, this.topEffect, nativeCanvas) || zDrawLeft;
            edgeEffectCompat.onPullDistanceCompat(this.topEffectNegation, edgeEffectCompat.getDistanceCompat(this.topEffect), 0.0f);
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.rightEffectNegation) == 0.0f)) {
            drawLeft(drawScope, this.rightEffectNegation, nativeCanvas);
            this.rightEffectNegation.finish();
        }
        if (!this.rightEffect.isFinished()) {
            zDrawLeft = drawRight(drawScope, this.rightEffect, nativeCanvas) || zDrawLeft;
            edgeEffectCompat.onPullDistanceCompat(this.rightEffectNegation, edgeEffectCompat.getDistanceCompat(this.rightEffect), 0.0f);
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.bottomEffectNegation) == 0.0f)) {
            drawTop(drawScope, this.bottomEffectNegation, nativeCanvas);
            this.bottomEffectNegation.finish();
        }
        if (!this.bottomEffect.isFinished()) {
            if (!drawBottom(drawScope, this.bottomEffect, nativeCanvas) && !zDrawLeft) {
                z = false;
            }
            edgeEffectCompat.onPullDistanceCompat(this.bottomEffectNegation, edgeEffectCompat.getDistanceCompat(this.bottomEffect), 0.0f);
            zDrawLeft = z;
        }
        if (zDrawLeft) {
            invalidateOverscroll();
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public Modifier getEffectModifier() {
        return this.effectModifier;
    }

    /* JADX INFO: renamed from: getInvalidationEnabled$foundation_release, reason: from getter */
    public final boolean getInvalidationEnabled() {
        return this.invalidationEnabled;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(list.get(i2)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z) {
        this.invalidationEnabled = z;
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }
}
