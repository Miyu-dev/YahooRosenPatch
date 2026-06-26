package androidx.compose.ui.input.nestedscroll;

import androidx.appcompat.R;
import androidx.compose.ui.unit.Velocity;
import dj.c;
import kotlin.Metadata;

/* JADX INFO: compiled from: NestedScrollModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLdj/c;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLdj/c;)Ljava/lang/Object;", "onPostFling", "ui_release"}, k = 1, mv = {1, 8, 0})
public interface NestedScrollConnection {

    /* JADX INFO: compiled from: NestedScrollModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m4022onPostFlingRZ2iAVY(NestedScrollConnection nestedScrollConnection, long j, long j2, c<? super Velocity> cVar) {
            return a.a(nestedScrollConnection, j, j2, cVar);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m4023onPostScrollDzOQY0M(NestedScrollConnection nestedScrollConnection, long j, long j2, int i2) {
            return a.b(nestedScrollConnection, j, j2, i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m4024onPreFlingQWom1Mo(NestedScrollConnection nestedScrollConnection, long j, c<? super Velocity> cVar) {
            return a.c(nestedScrollConnection, j, cVar);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m4025onPreScrollOzD1aCk(NestedScrollConnection nestedScrollConnection, long j, int i2) {
            return a.d(nestedScrollConnection, j, i2);
        }
    }

    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    Object mo356onPostFlingRZ2iAVY(long j, long j2, c<? super Velocity> cVar);

    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    long mo357onPostScrollDzOQY0M(long consumed, long available, int source);

    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    Object mo358onPreFlingQWom1Mo(long j, c<? super Velocity> cVar);

    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    long mo359onPreScrollOzD1aCk(long available, int source);
}
