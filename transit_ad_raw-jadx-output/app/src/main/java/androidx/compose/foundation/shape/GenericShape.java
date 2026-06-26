package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: GenericShape.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B*\u0012\u001e\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0012ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016R/\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/shape/GenericShape;", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "", "other", "", "equals", "", "hashCode", "Lkotlin/Function3;", "Landroidx/compose/ui/graphics/Path;", "Lkotlin/j;", "builder", "Lkj/q;", "<init>", "(Lkj/q;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class GenericShape implements Shape {
    public static final int $stable = 0;
    private final q<Path, Size, LayoutDirection, j> builder;

    /* JADX WARN: Multi-variable type inference failed */
    public GenericShape(q<? super Path, ? super Size, ? super LayoutDirection, j> qVar) {
        m.h(qVar, "builder");
        this.builder = qVar;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public Outline mo229createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        m.h(layoutDirection, "layoutDirection");
        m.h(density, "density");
        Path Path = AndroidPath_androidKt.Path();
        this.builder.invoke(Path, Size.m2642boximpl(size), layoutDirection);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        GenericShape genericShape = other instanceof GenericShape ? (GenericShape) other : null;
        return m.c(genericShape != null ? genericShape.builder : null, this.builder);
    }

    public int hashCode() {
        return this.builder.hashCode();
    }
}
