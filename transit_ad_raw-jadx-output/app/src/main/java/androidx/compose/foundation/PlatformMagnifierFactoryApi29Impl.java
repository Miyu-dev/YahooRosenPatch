package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: PlatformMagnifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@RequiresApi(androidx.appcompat.R.styleable.AppCompatTheme_actionModeStyle)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "()V", "canUpdateZoom", "", "getCanUpdateZoom", "()Z", "create", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "style", "Landroidx/compose/foundation/MagnifierStyle;", "view", "Landroid/view/View;", "density", "Landroidx/compose/ui/unit/Density;", "initialZoom", "", "PlatformMagnifierImpl", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {
    public static final PlatformMagnifierFactoryApi29Impl INSTANCE = new PlatformMagnifierFactoryApi29Impl();
    private static final boolean canUpdateZoom = true;

    /* JADX INFO: compiled from: PlatformMagnifier.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "Landroidx/compose/ui/geometry/Offset;", "sourceCenter", "magnifierCenter", "", "zoom", "Lkotlin/j;", "update-Wko1d7g", "(JJF)V", "update", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    @RequiresApi(androidx.appcompat.R.styleable.AppCompatTheme_actionModeStyle)
    public static final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlatformMagnifierImpl(Magnifier magnifier) {
            super(magnifier);
            m.h(magnifier, "magnifier");
        }

        @Override // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl, androidx.compose.foundation.PlatformMagnifier
        /* JADX INFO: renamed from: update-Wko1d7g */
        public void mo260updateWko1d7g(long sourceCenter, long magnifierCenter, float zoom) {
            if (!Float.isNaN(zoom)) {
                getMagnifier().setZoom(zoom);
            }
            if (OffsetKt.m2604isSpecifiedk4lQ0M(magnifierCenter)) {
                getMagnifier().show(Offset.m2585getXimpl(sourceCenter), Offset.m2586getYimpl(sourceCenter), Offset.m2585getXimpl(magnifierCenter), Offset.m2586getYimpl(magnifierCenter));
            } else {
                getMagnifier().show(Offset.m2585getXimpl(sourceCenter), Offset.m2586getYimpl(sourceCenter));
            }
        }
    }

    private PlatformMagnifierFactoryApi29Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public PlatformMagnifierImpl create(MagnifierStyle style, View view, Density density, float initialZoom) {
        m.h(style, "style");
        m.h(view, "view");
        m.h(density, "density");
        if (m.c(style, MagnifierStyle.INSTANCE.getTextDefault())) {
            return new PlatformMagnifierImpl(new Magnifier(view));
        }
        long jMo349toSizeXkaWNTQ = density.mo349toSizeXkaWNTQ(style.getSize());
        float fMo348toPx0680j_4 = density.mo348toPx0680j_4(style.getCornerRadius());
        float fMo348toPx0680j_42 = density.mo348toPx0680j_4(style.getElevation());
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jMo349toSizeXkaWNTQ != Size.INSTANCE.m2662getUnspecifiedNHjbRc()) {
            builder.setSize(a.f.f0(Size.m2654getWidthimpl(jMo349toSizeXkaWNTQ)), a.f.f0(Size.m2651getHeightimpl(jMo349toSizeXkaWNTQ)));
        }
        if (!Float.isNaN(fMo348toPx0680j_4)) {
            builder.setCornerRadius(fMo348toPx0680j_4);
        }
        if (!Float.isNaN(fMo348toPx0680j_42)) {
            builder.setElevation(fMo348toPx0680j_42);
        }
        if (!Float.isNaN(initialZoom)) {
            builder.setInitialZoom(initialZoom);
        }
        builder.setClippingEnabled(style.getClippingEnabled());
        Magnifier magnifierBuild = builder.build();
        m.g(magnifierBuild, "Builder(view).run {\n    …    build()\n            }");
        return new PlatformMagnifierImpl(magnifierBuild);
    }
}
