package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinatesImpl;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kj.l;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: NodeCoordinator.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000 ¤\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0004¤\u0002¥\u0002B\u0013\u0012\b\u0010«\u0001\u001a\u00030ª\u0001¢\u0006\u0006\b¢\u0002\u0010£\u0002J0\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0000JC\u0010\u000e\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u000f\u0018\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\n2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000f\u0018\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0006\u0010\u001c\u001a\u00020\nJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010$\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010 H\u0000¢\u0006\u0004\b\"\u0010#J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%H\u0004J\u0010\u0010(\u001a\u00020%2\u0006\u0010!\u001a\u00020 H&J\u0018\u0010+\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0014J/\u00102\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020/0.H\u0084\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b0\u00101J\u0006\u00103\u001a\u00020\u0007J;\u0010<\u001a\u00020\u00072\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0014ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b:\u0010;J\u000e\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0006J\u0010\u0010?\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0006H\u0016J\u0006\u0010@\u001a\u00020\u0007J\u0011\u0010A\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0006H\u0096\u0002J&\u0010C\u001a\u00020\u00072\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0002\u0010B\u001a\u00020\nJQ\u0010O\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020D2\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E2\u0006\u0010H\u001a\u00020G2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000I2\u0006\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bM\u0010NJS\u0010Q\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020D2\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E2\u0006\u0010H\u001a\u00020G2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000I2\u0006\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\nH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bP\u0010NJ\u0006\u0010S\u001a\u00020RJ\u001d\u0010W\u001a\u00020G2\u0006\u0010T\u001a\u00020GH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bU\u0010VJ\u001d\u0010Z\u001a\u00020G2\u0006\u0010X\u001a\u00020GH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bY\u0010VJ%\u0010_\u001a\u00020G2\u0006\u0010[\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020GH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b]\u0010^J%\u0010d\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u00032\u0006\u0010a\u001a\u00020`H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bb\u0010cJ\u0018\u0010f\u001a\u00020R2\u0006\u0010[\u001a\u00020\u00032\u0006\u0010e\u001a\u00020\nH\u0016J\u001d\u0010h\u001a\u00020G2\u0006\u0010X\u001a\u00020GH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bg\u0010VJ(\u0010i\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0084\bø\u0001\u0000J\u001d\u0010k\u001a\u00020G2\u0006\u00105\u001a\u00020GH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bj\u0010VJ\u001d\u0010m\u001a\u00020G2\u0006\u00105\u001a\u00020GH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bl\u0010VJ\u0018\u0010p\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00062\u0006\u0010o\u001a\u00020nH\u0004J\u0006\u0010q\u001a\u00020\u0007J\u0006\u0010r\u001a\u00020\u0007J)\u0010x\u001a\u00020\u00072\u0006\u0010t\u001a\u00020s2\u0006\u0010e\u001a\u00020\n2\b\b\u0002\u0010u\u001a\u00020\nH\u0000¢\u0006\u0004\bv\u0010wJ\u001d\u0010{\u001a\u00020\n2\u0006\u0010H\u001a\u00020GH\u0004ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\by\u0010zJ\u001d\u0010}\u001a\u00020\n2\u0006\u0010H\u001a\u00020GH\u0004ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b|\u0010zJ\b\u0010~\u001a\u00020\u0007H\u0016J\u001e\u0010\u0080\u0001\u001a\u00020\u00072\u0006\u0010\u007f\u001a\u00020RH\u0096@ø\u0001\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\t\u0010\u0082\u0001\u001a\u00020\u0007H\u0016J\u001b\u0010\u0086\u0001\u001a\u00020\u00002\u0007\u0010\u0083\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0007\u0010\u0087\u0001\u001a\u00020\nJ\"\u0010\u008b\u0001\u001a\u00030\u0088\u00012\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001H\u0004ø\u0001\u0001ø\u0001\u0002¢\u0006\u0005\b\u008a\u0001\u0010VJ*\u0010\u008e\u0001\u001a\u0002062\u0006\u0010H\u001a\u00020G2\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001H\u0004ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0013\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0011\u0010\u0090\u0001\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0006H\u0002J)\u0010\u0091\u0001\u001a\u00020\u00072\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0002\u0010B\u001a\u00020\nH\u0002J\t\u0010\u0092\u0001\u001a\u00020\u0007H\u0002J\\\u0010\u0095\u0001\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020D*\u0004\u0018\u00018\u00002\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E2\u0006\u0010H\u001a\u00020G2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000I2\u0006\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\nH\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001Je\u0010\u0099\u0001\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020D*\u0004\u0018\u00018\u00002\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E2\u0006\u0010H\u001a\u00020G2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000I2\u0006\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\n2\u0007\u0010\u0096\u0001\u001a\u000206H\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001Je\u0010\u009b\u0001\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020D*\u0004\u0018\u00018\u00002\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E2\u0006\u0010H\u001a\u00020G2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000I2\u0006\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\n2\u0007\u0010\u0096\u0001\u001a\u000206H\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u0098\u0001J\r\u0010\u009c\u0001\u001a\u00020\u0000*\u00020\u0003H\u0002J)\u0010 \u0001\u001a\u00020\u00072\u0007\u0010\u009d\u0001\u001a\u00020\u00002\u0006\u0010a\u001a\u00020`H\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J)\u0010¢\u0001\u001a\u00020\u00072\u0007\u0010\u009d\u0001\u001a\u00020\u00002\u0006\u0010a\u001a\u00020`H\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b¡\u0001\u0010\u009f\u0001J*\u0010¦\u0001\u001a\u00020G2\u0007\u0010\u009d\u0001\u001a\u00020\u00002\u0007\u0010£\u0001\u001a\u00020GH\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\"\u0010¦\u0001\u001a\u00020\u00072\u0007\u0010\u009d\u0001\u001a\u00020\u00002\u0006\u0010\u007f\u001a\u00020s2\u0006\u0010e\u001a\u00020\nH\u0002J\u0019\u0010§\u0001\u001a\u00020\u00072\u0006\u0010t\u001a\u00020s2\u0006\u0010e\u001a\u00020\nH\u0002J\u001f\u0010©\u0001\u001a\u00020G2\u0006\u0010H\u001a\u00020GH\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0005\b¨\u0001\u0010VR \u0010«\u0001\u001a\u00030ª\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R+\u0010¯\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R+\u0010µ\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bµ\u0001\u0010°\u0001\u001a\u0006\b¶\u0001\u0010²\u0001\"\u0006\b·\u0001\u0010´\u0001R\u0019\u0010¸\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0019\u0010º\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010¹\u0001RD\u00109\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0015\u0010»\u0001\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0004@BX\u0084\u000e¢\u0006\u000f\n\u0005\b9\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R\u001a\u0010À\u0001\u001a\u00030¿\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001a\u0010Ã\u0001\u001a\u00030Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u0019\u0010Å\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u001c\u0010È\u0001\u001a\u0005\u0018\u00010Ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R,\u0010&\u001a\u0004\u0018\u00010%2\t\u0010»\u0001\u001a\u0004\u0018\u00010%8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b&\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001R)\u0010Ï\u0001\u001a\u0012\u0012\u0005\u0012\u00030Î\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010Í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R9\u00105\u001a\u0002042\u0007\u0010»\u0001\u001a\u0002048\u0016@TX\u0096\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0003¢\u0006\u0017\n\u0005\b5\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0006\bÔ\u0001\u0010Õ\u0001R0\u00107\u001a\u0002062\u0007\u0010»\u0001\u001a\u0002068\u0006@DX\u0086\u000e¢\u0006\u0017\n\u0005\b7\u0010Æ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R\u001b\u0010Ú\u0001\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u001c\u0010Ý\u0001\u001a\u0005\u0018\u00010Ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u001d\u0010ß\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070.8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R*\u0010á\u0001\u001a\u00020\n2\u0007\u0010»\u0001\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bá\u0001\u0010¹\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001R0\u0010å\u0001\u001a\u0005\u0018\u00010ä\u00012\n\u0010»\u0001\u001a\u0005\u0018\u00010ä\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bå\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001R\u0017\u0010ë\u0001\u001a\u00020\f8&X¦\u0004¢\u0006\b\u001a\u0006\bé\u0001\u0010ê\u0001R\u0018\u0010î\u0001\u001a\u00030Â\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bì\u0001\u0010í\u0001R\u0017\u0010ð\u0001\u001a\u0002068VX\u0096\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010×\u0001R\u0017\u0010ò\u0001\u001a\u0002068VX\u0096\u0004¢\u0006\b\u001a\u0006\bñ\u0001\u0010×\u0001R\u0019\u0010õ\u0001\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bó\u0001\u0010ô\u0001R\u0017\u0010ø\u0001\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bö\u0001\u0010÷\u0001R\u001e\u0010û\u0001\u001a\u00030ù\u00018Fø\u0001\u0002ø\u0001\u0001ø\u0001\u0003¢\u0006\b\u001a\u0006\bú\u0001\u0010Ó\u0001R\u0018\u0010ÿ\u0001\u001a\u00030ü\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bý\u0001\u0010þ\u0001R\u0019\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010ô\u0001R\u0017\u0010\u0083\u0002\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0002\u0010ã\u0001R\u0017\u0010\u0084\u0002\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0084\u0002\u0010ã\u0001R,\u0010\u008a\u0002\u001a\u00030Ç\u00012\b\u0010\u0085\u0002\u001a\u00030Ç\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002\"\u0006\b\u0088\u0002\u0010\u0089\u0002R\u001f\u0010\u008e\u0002\u001a\n\u0012\u0005\u0012\u00030Î\u00010\u008b\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R\u001a\u0010\u0092\u0002\u001a\u0005\u0018\u00010\u008f\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002R\u0016\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b\u0093\u0002\u0010÷\u0001R\u0016\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010÷\u0001R\u0017\u0010\u0099\u0002\u001a\u00020s8DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002R \u0010\u009b\u0002\u001a\u00020,8@X\u0080\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0003¢\u0006\b\u001a\u0006\b\u009a\u0002\u0010Ó\u0001R\u0017\u0010\u009c\u0002\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0002\u0010ã\u0001R\u001e\u0010\u0089\u0001\u001a\u00030\u0088\u00018Fø\u0001\u0002ø\u0001\u0001ø\u0001\u0003¢\u0006\b\u001a\u0006\b\u009d\u0002\u0010Ó\u0001R\u0018\u0010¡\u0002\u001a\u00030\u009e\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009f\u0002\u0010 \u0002\u0082\u0002\u0016\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006¦\u0002"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/j;", "", "mask", "", "includeTail", "Landroidx/compose/ui/Modifier$Node;", "block", "visitNodes", "T", "Landroidx/compose/ui/node/NodeKind;", "type", "visitNodes-aLcG6gQ", "(ILkj/l;)V", "hasNode-H91voCI", "(I)Z", "hasNode", "head-H91voCI", "(I)Ljava/lang/Object;", "head", "headUnchecked-H91voCI", "headUnchecked", "isTransparent", "replace$ui_release", "()V", "replace", "Landroidx/compose/ui/layout/LookaheadScope;", "scope", "updateLookaheadScope$ui_release", "(Landroidx/compose/ui/layout/LookaheadScope;)V", "updateLookaheadScope", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "updateLookaheadDelegate", "createLookaheadDelegate", "width", "height", "onMeasureResultChanged", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/Placeable;", "performingMeasure-K40F9xA", "(JLkj/a;)Landroidx/compose/ui/layout/Placeable;", "performingMeasure", "onMeasured", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeAt-f8xVGno", "(JFLkj/l;)V", "placeAt", "canvas", "draw", "performDraw", "onPlaced", "invoke", "forceLayerInvalidated", "updateLayerBlock", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "isTouchEvent", "isInLayer", "hitTest-YqVAtuI", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTest", "hitTestChild-YqVAtuI", "hitTestChild", "Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "relativeToWindow", "windowToLocal-MK-Hz9U", "(J)J", "windowToLocal", "relativeToLocal", "localToWindow-MK-Hz9U", "localToWindow", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "clipBounds", "localBoundingBoxOf", "localToRoot-MK-Hz9U", "localToRoot", "withPositionTranslation", "toParentPosition-MK-Hz9U", "toParentPosition", "fromParentPosition-MK-Hz9U", "fromParentPosition", "Landroidx/compose/ui/graphics/Paint;", "paint", "drawBorder", "onLayoutNodeAttach", "onRelease", "Landroidx/compose/ui/geometry/MutableRect;", "bounds", "clipToMinimumTouchTargetSize", "rectInParent$ui_release", "(Landroidx/compose/ui/geometry/MutableRect;ZZ)V", "rectInParent", "withinLayerBounds-k-4lQ0M", "(J)Z", "withinLayerBounds", "isPointerInBounds-k-4lQ0M", "isPointerInBounds", "invalidateLayer", "rect", "propagateRelocationRequest", "(Landroidx/compose/ui/geometry/Rect;Ldj/c;)Ljava/lang/Object;", "onLayoutModifierNodeChanged", "other", "findCommonAncestor$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;", "findCommonAncestor", "shouldSharePointerInputWithSiblings", "Landroidx/compose/ui/geometry/Size;", "minimumTouchTargetSize", "calculateMinimumTouchTargetPadding-E7KxVPU", "calculateMinimumTouchTargetPadding", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "distanceInMinimumTouchTarget", "headNode", "drawContainedDrawModifiers", "onLayerBlockUpdated", "updateLayerParameters", "hit-1hIXUjU", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hit", "distanceFromEdge", "hitNear-JHbHoSQ", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZF)V", "hitNear", "speculativeHit-JHbHoSQ", "speculativeHit", "toCoordinator", "ancestor", "transformToAncestor-EL8BTi8", "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "transformToAncestor", "transformFromAncestor-EL8BTi8", "transformFromAncestor", TypedValues.CycleType.S_WAVE_OFFSET, "ancestorToLocal-R5De75A", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "ancestorToLocal", "fromParentRect", "offsetFromEdge-MK-Hz9U", "offsetFromEdge", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "wrapped", "Landroidx/compose/ui/node/NodeCoordinator;", "getWrapped$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "setWrapped$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrappedBy", "getWrappedBy$ui_release", "setWrappedBy$ui_release", "released", "Z", "isClipping", "<set-?>", "Lkj/l;", "getLayerBlock", "()Lkj/l;", "Landroidx/compose/ui/unit/Density;", "layerDensity", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "layerLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "lastLayerAlpha", "F", "Landroidx/compose/ui/layout/MeasureResult;", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate$ui_release", "()Landroidx/compose/ui/node/LookaheadDelegate;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "oldAlignmentLines", "Ljava/util/Map;", "J", "getPosition-nOcc-ac", "()J", "setPosition--gyyYBs", "(J)V", "getZIndex", "()F", "setZIndex", "(F)V", "_rectCache", "Landroidx/compose/ui/geometry/MutableRect;", "Landroidx/compose/ui/node/LayerPositionalProperties;", "layerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "invalidateParentLayer", "Lkj/a;", "lastLayerDrawingWasSkipped", "getLastLayerDrawingWasSkipped$ui_release", "()Z", "Landroidx/compose/ui/node/OwnedLayer;", "layer", "Landroidx/compose/ui/node/OwnedLayer;", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "tail", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "density", "getFontScale", "fontScale", "getParent", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "parent", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "getChild", "child", "getHasMeasureResult", "hasMeasureResult", "isAttached", "value", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "measureResult", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "", "getParentData", "()Ljava/lang/Object;", "parentData", "getParentLayoutCoordinates", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "rectCache", "getLastMeasurementConstraints-msEJaDk$ui_release", "lastMeasurementConstraints", "isValidOwnerScope", "getMinimumTouchTargetSize-NH-jbRc", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Companion", "HitTestSource", "ui_release"}, k = 1, mv = {1, 8, 0})
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope, l<Canvas, j> {
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    private MeasureResult _measureResult;
    private MutableRect _rectCache;
    private final kj.a<j> invalidateParentLayer;
    private boolean isClipping;
    private float lastLayerAlpha;
    private boolean lastLayerDrawingWasSkipped;
    private OwnedLayer layer;
    private l<? super GraphicsLayerScope, j> layerBlock;
    private Density layerDensity;
    private LayoutDirection layerLayoutDirection;
    private LayerPositionalProperties layerPositionalProperties;
    private final LayoutNode layoutNode;
    private LookaheadDelegate lookaheadDelegate;
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position;
    private boolean released;
    private NodeCoordinator wrapped;
    private NodeCoordinator wrappedBy;
    private float zIndex;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final l<NodeCoordinator, j> onCommitAffectingLayerParams = new l<NodeCoordinator, j>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((NodeCoordinator) obj);
            return j.a;
        }

        public final void invoke(NodeCoordinator nodeCoordinator) {
            m.h(nodeCoordinator, "coordinator");
            if (nodeCoordinator.isValidOwnerScope()) {
                LayerPositionalProperties layerPositionalProperties = nodeCoordinator.layerPositionalProperties;
                if (layerPositionalProperties == null) {
                    nodeCoordinator.updateLayerParameters();
                    return;
                }
                NodeCoordinator.tmpLayerPositionalProperties.copyFrom(layerPositionalProperties);
                nodeCoordinator.updateLayerParameters();
                if (NodeCoordinator.tmpLayerPositionalProperties.hasSameValuesAs(layerPositionalProperties)) {
                    return;
                }
                LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if (layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    layoutDelegate.getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                }
                Owner owner = layoutNode.getOwner();
                if (owner != null) {
                    owner.requestOnPositionedCallback(layoutNode);
                }
            }
        }
    };
    private static final l<NodeCoordinator, j> onCommitAffectingLayer = new l<NodeCoordinator, j>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((NodeCoordinator) obj);
            return j.a;
        }

        public final void invoke(NodeCoordinator nodeCoordinator) {
            m.h(nodeCoordinator, "coordinator");
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    };
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();
    private static final float[] tmpMatrix = Matrix.m3023constructorimpl$default(null, 1, null);
    private static final HitTestSource<PointerInputModifierNode> PointerInputSource = new HitTestSource<PointerInputModifierNode>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: childHitTest-YqVAtuI, reason: not valid java name */
        public void mo4435childHitTestYqVAtuI(LayoutNode layoutNode, long pointerPosition, HitTestResult<PointerInputModifierNode> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            m.h(layoutNode, "layoutNode");
            m.h(hitTestResult, "hitTestResult");
            layoutNode.m4359hitTestM_7yMNQ$ui_release(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo4436entityTypeOLwlOKw() {
            return NodeKind.m4446constructorimpl(16);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode parentLayoutNode) {
            m.h(parentLayoutNode, "parentLayoutNode");
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(PointerInputModifierNode node) {
            m.h(node, "node");
            return node.interceptOutOfBoundsChildEvents();
        }
    };
    private static final HitTestSource<SemanticsModifierNode> SemanticsSource = new HitTestSource<SemanticsModifierNode>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: childHitTest-YqVAtuI */
        public void mo4435childHitTestYqVAtuI(LayoutNode layoutNode, long pointerPosition, HitTestResult<SemanticsModifierNode> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            m.h(layoutNode, "layoutNode");
            m.h(hitTestResult, "hitTestResult");
            layoutNode.m4360hitTestSemanticsM_7yMNQ$ui_release(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: entityType-OLwlOKw */
        public int mo4436entityTypeOLwlOKw() {
            return NodeKind.m4446constructorimpl(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(SemanticsModifierNode node) {
            m.h(node, "node");
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode parentLayoutNode) {
            SemanticsConfiguration semanticsConfigurationCollapsedSemanticsConfiguration;
            m.h(parentLayoutNode, "parentLayoutNode");
            SemanticsModifierNode outerSemantics = SemanticsNodeKt.getOuterSemantics(parentLayoutNode);
            boolean z = false;
            if (outerSemantics != null && (semanticsConfigurationCollapsedSemanticsConfiguration = SemanticsModifierNodeKt.collapsedSemanticsConfiguration(outerSemantics)) != null && semanticsConfigurationCollapsedSemanticsConfiguration.getIsClearingSemantics()) {
                z = true;
            }
            return !z;
        }
    };

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010\tR#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$Companion;", "", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "getPointerInputSource", "()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "getPointerInputSource$annotations", "()V", "Landroidx/compose/ui/node/SemanticsModifierNode;", "SemanticsSource", "getSemanticsSource", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "Lkotlin/j;", "onCommitAffectingLayer", "Lkj/l;", "onCommitAffectingLayerParams", "Landroidx/compose/ui/node/LayerPositionalProperties;", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "Landroidx/compose/ui/graphics/Matrix;", "tmpMatrix", "[F", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HitTestSource<PointerInputModifierNode> getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        public final HitTestSource<SemanticsModifierNode> getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }

        private Companion() {
        }

        public static /* synthetic */ void getPointerInputSource$annotations() {
        }
    }

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&JC\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH&ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "Landroidx/compose/ui/node/DelegatableNode;", "N", "", "Landroidx/compose/ui/node/NodeKind;", "entityType-OLwlOKw", "()I", "entityType", "node", "", "interceptOutOfBoundsChildEvents", "(Landroidx/compose/ui/node/DelegatableNode;)Z", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "shouldHitTestChildren", "layoutNode", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "isTouchEvent", "isInLayer", "Lkotlin/j;", "childHitTest-YqVAtuI", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "childHitTest", "ui_release"}, k = 1, mv = {1, 8, 0})
    public interface HitTestSource<N extends DelegatableNode> {
        /* JADX INFO: renamed from: childHitTest-YqVAtuI */
        void mo4435childHitTestYqVAtuI(LayoutNode layoutNode, long pointerPosition, HitTestResult<N> hitTestResult, boolean isTouchEvent, boolean isInLayer);

        /* JADX INFO: renamed from: entityType-OLwlOKw */
        int mo4436entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(N node);

        boolean shouldHitTestChildren(LayoutNode parentLayoutNode);
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        m.h(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        this.layerDensity = getLayoutNode().getDensity();
        this.layerLayoutDirection = getLayoutNode().getLayoutDirection();
        this.lastLayerAlpha = 0.8f;
        this.position = IntOffset.INSTANCE.m5395getZeronOccac();
        this.invalidateParentLayer = new kj.a<j>() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m4439invoke();
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4439invoke() {
                NodeCoordinator wrappedBy = this.this$0.getWrappedBy();
                if (wrappedBy != null) {
                    wrappedBy.invalidateLayer();
                }
            }
        };
    }

    private final void ancestorToLocal(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.ancestorToLocal(nodeCoordinator, mutableRect, z);
        }
        fromParentRect(mutableRect, z);
    }

    /* JADX INFO: renamed from: ancestorToLocal-R5De75A, reason: not valid java name */
    private final long m4413ancestorToLocalR5De75A(NodeCoordinator ancestor, long offset) {
        if (ancestor == this) {
            return offset;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        return (nodeCoordinator == null || m.c(ancestor, nodeCoordinator)) ? m4422fromParentPositionMKHz9U(offset) : m4422fromParentPositionMKHz9U(nodeCoordinator.m4413ancestorToLocalR5De75A(ancestor, offset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas canvas) {
        int iM4446constructorimpl = NodeKind.m4446constructorimpl(4);
        boolean zM4454getIncludeSelfInTraversalH91voCI = NodeKindKt.m4454getIncludeSelfInTraversalH91voCI(iM4446constructorimpl);
        Modifier.Node tail = getTail();
        if (zM4454getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
            Modifier.Node nodeHeadNode = headNode(zM4454getIncludeSelfInTraversalH91voCI);
            while (true) {
                if (nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM4446constructorimpl) != 0) {
                    if ((nodeHeadNode.getKindSet() & iM4446constructorimpl) == 0) {
                        if (nodeHeadNode == tail) {
                            break;
                        } else {
                            nodeHeadNode = nodeHeadNode.getChild();
                        }
                    } else {
                        drawModifierNode = nodeHeadNode instanceof DrawModifierNode ? nodeHeadNode : null;
                    }
                } else {
                    break;
                }
            }
        }
        DrawModifierNode drawModifierNode = drawModifierNode;
        if (drawModifierNode == null) {
            performDraw(canvas);
        } else {
            getLayoutNode().getMDrawScope$ui_release().m4371drawx_KDEd0$ui_release(canvas, IntSizeKt.m5437toSizeozmzZPI(mo4239getSizeYbymL2g()), this, drawModifierNode);
        }
    }

    private final void fromParentRect(MutableRect mutableRect, boolean z) {
        float fM5385getXimpl = IntOffset.m5385getXimpl(getPosition());
        mutableRect.setLeft(mutableRect.getLeft() - fM5385getXimpl);
        mutableRect.setRight(mutableRect.getRight() - fM5385getXimpl);
        float fM5386getYimpl = IntOffset.m5386getYimpl(getPosition());
        mutableRect.setTop(mutableRect.getTop() - fM5386getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() - fM5386getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(mutableRect, true);
            if (this.isClipping && z) {
                mutableRect.intersect(0.0f, 0.0f, IntSize.m5427getWidthimpl(mo4239getSizeYbymL2g()), IntSize.m5426getHeightimpl(mo4239getSizeYbymL2g()));
                mutableRect.isEmpty();
            }
        }
    }

    private final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node headNode(boolean includeTail) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (includeTail) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null && (tail = nodeCoordinator.getTail()) != null) {
                return tail.getChild();
            }
        } else {
            NodeCoordinator nodeCoordinator2 = this.wrappedBy;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.getTail();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: hit-1hIXUjU, reason: not valid java name */
    public final <T extends DelegatableNode> void m4414hit1hIXUjU(final T t, final HitTestSource<T> hitTestSource, final long j, final HitTestResult<T> hitTestResult, final boolean z, final boolean z2) {
        if (t == null) {
            mo4354hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else {
            hitTestResult.hit(t, z2, new kj.a<j>() { // from class: androidx.compose.ui.node.NodeCoordinator$hit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/NodeCoordinator;TT;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource<TT;>;JLandroidx/compose/ui/node/HitTestResult<TT;>;ZZ)V */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m4437invoke();
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m4437invoke() {
                    this.this$0.m4414hit1hIXUjU((DelegatableNode) NodeCoordinatorKt.m4444nextUncheckedUntilhw7D004(t, hitTestSource.mo4436entityTypeOLwlOKw(), NodeKind.m4446constructorimpl(2)), hitTestSource, j, hitTestResult, z, z2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: hitNear-JHbHoSQ, reason: not valid java name */
    public final <T extends DelegatableNode> void m4415hitNearJHbHoSQ(final T t, final HitTestSource<T> hitTestSource, final long j, final HitTestResult<T> hitTestResult, final boolean z, final boolean z2, final float f) {
        if (t == null) {
            mo4354hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else {
            hitTestResult.hitInMinimumTouchTarget(t, f, z2, new kj.a<j>() { // from class: androidx.compose.ui.node.NodeCoordinator$hitNear$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/NodeCoordinator;TT;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource<TT;>;JLandroidx/compose/ui/node/HitTestResult<TT;>;ZZF)V */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m4438invoke();
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m4438invoke() {
                    this.this$0.m4415hitNearJHbHoSQ((DelegatableNode) NodeCoordinatorKt.m4444nextUncheckedUntilhw7D004(t, hitTestSource.mo4436entityTypeOLwlOKw(), NodeKind.m4446constructorimpl(2)), hitTestSource, j, hitTestResult, z, z2, f);
                }
            });
        }
    }

    /* JADX INFO: renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m4416offsetFromEdgeMKHz9U(long pointerPosition) {
        float fM2585getXimpl = Offset.m2585getXimpl(pointerPosition);
        float fMax = Math.max(0.0f, fM2585getXimpl < 0.0f ? -fM2585getXimpl : fM2585getXimpl - getMeasuredWidth());
        float fM2586getYimpl = Offset.m2586getYimpl(pointerPosition);
        return OffsetKt.Offset(fMax, Math.max(0.0f, fM2586getYimpl < 0.0f ? -fM2586getYimpl : fM2586getYimpl - getMeasuredHeight()));
    }

    private final void onLayerBlockUpdated(l<? super GraphicsLayerScope, j> lVar, boolean z) {
        Owner owner;
        boolean z2 = (this.layerBlock == lVar && m.c(this.layerDensity, getLayoutNode().getDensity()) && this.layerLayoutDirection == getLayoutNode().getLayoutDirection() && !z) ? false : true;
        this.layerBlock = lVar;
        this.layerDensity = getLayoutNode().getDensity();
        this.layerLayoutDirection = getLayoutNode().getLayoutDirection();
        if (!isAttached() || lVar == null) {
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                getLayoutNode().setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                if (isAttached() && (owner = getLayoutNode().getOwner()) != null) {
                    owner.onLayoutChange(getLayoutNode());
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        if (this.layer != null) {
            if (z2) {
                updateLayerParameters();
                return;
            }
            return;
        }
        OwnedLayer ownedLayerCreateLayer = LayoutNodeKt.requireOwner(getLayoutNode()).createLayer(this, this.invalidateParentLayer);
        ownedLayerCreateLayer.mo4491resizeozmzZPI(getMeasuredSize());
        ownedLayerCreateLayer.mo4490movegyyYBs(getPosition());
        this.layer = ownedLayerCreateLayer;
        updateLayerParameters();
        getLayoutNode().setInnerLayerCoordinatorIsDirty$ui_release(true);
        this.invalidateParentLayer.invoke();
    }

    public static /* synthetic */ void onLayerBlockUpdated$default(NodeCoordinator nodeCoordinator, l lVar, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLayerBlockUpdated");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        nodeCoordinator.onLayerBlockUpdated(lVar, z);
    }

    public static Object propagateRelocationRequest$suspendImpl(NodeCoordinator nodeCoordinator, Rect rect, dj.c<? super j> cVar) {
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.wrappedBy;
        if (nodeCoordinator2 == null) {
            return j.a;
        }
        Object objPropagateRelocationRequest = nodeCoordinator2.propagateRelocationRequest(rect.m2622translatek4lQ0M(nodeCoordinator2.localBoundingBoxOf(nodeCoordinator, false).m2620getTopLeftF1C5BW0()), cVar);
        return objPropagateRelocationRequest == CoroutineSingletons.COROUTINE_SUSPENDED ? objPropagateRelocationRequest : j.a;
    }

    public static /* synthetic */ void rectInParent$ui_release$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        nodeCoordinator.rectInParent$ui_release(mutableRect, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: speculativeHit-JHbHoSQ, reason: not valid java name */
    public final <T extends DelegatableNode> void m4417speculativeHitJHbHoSQ(final T t, final HitTestSource<T> hitTestSource, final long j, final HitTestResult<T> hitTestResult, final boolean z, final boolean z2, final float f) {
        if (t == null) {
            mo4354hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(t)) {
            hitTestResult.speculativeHit(t, f, z2, new kj.a<j>() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/NodeCoordinator;TT;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource<TT;>;JLandroidx/compose/ui/node/HitTestResult<TT;>;ZZF)V */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m4441invoke();
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m4441invoke() {
                    this.this$0.m4417speculativeHitJHbHoSQ((DelegatableNode) NodeCoordinatorKt.m4444nextUncheckedUntilhw7D004(t, hitTestSource.mo4436entityTypeOLwlOKw(), NodeKind.m4446constructorimpl(2)), hitTestSource, j, hitTestResult, z, z2, f);
                }
            });
        } else {
            m4417speculativeHitJHbHoSQ((DelegatableNode) NodeCoordinatorKt.m4444nextUncheckedUntilhw7D004(t, hitTestSource.mo4436entityTypeOLwlOKw(), NodeKind.m4446constructorimpl(2)), hitTestSource, j, hitTestResult, z, z2, f);
        }
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinatesImpl = layoutCoordinates instanceof LookaheadLayoutCoordinatesImpl ? (LookaheadLayoutCoordinatesImpl) layoutCoordinates : null;
        if (lookaheadLayoutCoordinatesImpl != null && (coordinator = lookaheadLayoutCoordinatesImpl.getCoordinator()) != null) {
            return coordinator;
        }
        m.f(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    /* JADX INFO: renamed from: transformFromAncestor-EL8BTi8, reason: not valid java name */
    private final void m4418transformFromAncestorEL8BTi8(NodeCoordinator ancestor, float[] matrix) {
        if (m.c(ancestor, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        m.e(nodeCoordinator);
        nodeCoordinator.m4418transformFromAncestorEL8BTi8(ancestor, matrix);
        if (!IntOffset.m5384equalsimpl0(getPosition(), IntOffset.INSTANCE.m5395getZeronOccac())) {
            float[] fArr = tmpMatrix;
            Matrix.m3032resetimpl(fArr);
            Matrix.m3043translateimpl$default(fArr, -IntOffset.m5385getXimpl(getPosition()), -IntOffset.m5386getYimpl(getPosition()), 0.0f, 4, null);
            Matrix.m3040timesAssign58bKbWc(matrix, fArr);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo4487inverseTransform58bKbWc(matrix);
        }
    }

    /* JADX INFO: renamed from: transformToAncestor-EL8BTi8, reason: not valid java name */
    private final void m4419transformToAncestorEL8BTi8(NodeCoordinator ancestor, float[] matrix) {
        NodeCoordinator nodeCoordinator = this;
        while (!m.c(nodeCoordinator, ancestor)) {
            OwnedLayer ownedLayer = nodeCoordinator.layer;
            if (ownedLayer != null) {
                ownedLayer.mo4492transform58bKbWc(matrix);
            }
            if (!IntOffset.m5384equalsimpl0(nodeCoordinator.getPosition(), IntOffset.INSTANCE.m5395getZeronOccac())) {
                float[] fArr = tmpMatrix;
                Matrix.m3032resetimpl(fArr);
                Matrix.m3043translateimpl$default(fArr, IntOffset.m5385getXimpl(r1), IntOffset.m5386getYimpl(r1), 0.0f, 4, null);
                Matrix.m3040timesAssign58bKbWc(matrix, fArr);
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            m.e(nodeCoordinator);
        }
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, l lVar, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        nodeCoordinator.updateLayerBlock(lVar, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLayerParameters() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            final l<? super GraphicsLayerScope, j> lVar = this.layerBlock;
            if (lVar == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
            reusableGraphicsLayerScope.reset();
            reusableGraphicsLayerScope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
            reusableGraphicsLayerScope.m3100setSizeuvyYCjk(IntSizeKt.m5437toSizeozmzZPI(mo4239getSizeYbymL2g()));
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new kj.a<j>() { // from class: androidx.compose.ui.node.NodeCoordinator.updateLayerParameters.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m4442invoke();
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m4442invoke() {
                    lVar.invoke(NodeCoordinator.graphicsLayerScope);
                }
            });
            LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
            if (layerPositionalProperties == null) {
                layerPositionalProperties = new LayerPositionalProperties();
                this.layerPositionalProperties = layerPositionalProperties;
            }
            layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
            ownedLayer.mo4493updateLayerPropertiesdDxrwY(reusableGraphicsLayerScope.getScaleX(), reusableGraphicsLayerScope.getScaleY(), reusableGraphicsLayerScope.getAlpha(), reusableGraphicsLayerScope.getTranslationX(), reusableGraphicsLayerScope.getTranslationY(), reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.getRotationX(), reusableGraphicsLayerScope.getRotationY(), reusableGraphicsLayerScope.getRotationZ(), reusableGraphicsLayerScope.getCameraDistance(), reusableGraphicsLayerScope.getTransformOrigin(), reusableGraphicsLayerScope.getShape(), reusableGraphicsLayerScope.getClip(), reusableGraphicsLayerScope.getRenderEffect(), reusableGraphicsLayerScope.getAmbientShadowColor(), reusableGraphicsLayerScope.getSpotShadowColor(), reusableGraphicsLayerScope.getCompositingStrategy(), getLayoutNode().getLayoutDirection(), getLayoutNode().getDensity());
            this.isClipping = reusableGraphicsLayerScope.getClip();
        } else {
            if (!(this.layerBlock == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        this.lastLayerAlpha = graphicsLayerScope.getAlpha();
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.onLayoutChange(getLayoutNode());
        }
    }

    /* JADX INFO: renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    public final long m4420calculateMinimumTouchTargetPaddingE7KxVPU(long minimumTouchTargetSize) {
        return SizeKt.Size(Math.max(0.0f, (Size.m2654getWidthimpl(minimumTouchTargetSize) - getMeasuredWidth()) / 2.0f), Math.max(0.0f, (Size.m2651getHeightimpl(minimumTouchTargetSize) - getMeasuredHeight()) / 2.0f));
    }

    public abstract LookaheadDelegate createLookaheadDelegate(LookaheadScope scope);

    /* JADX INFO: renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    public final float m4421distanceInMinimumTouchTargettz77jQw(long pointerPosition, long minimumTouchTargetSize) {
        if (getMeasuredWidth() >= Size.m2654getWidthimpl(minimumTouchTargetSize) && getMeasuredHeight() >= Size.m2651getHeightimpl(minimumTouchTargetSize)) {
            return Float.POSITIVE_INFINITY;
        }
        long jM4420calculateMinimumTouchTargetPaddingE7KxVPU = m4420calculateMinimumTouchTargetPaddingE7KxVPU(minimumTouchTargetSize);
        float fM2654getWidthimpl = Size.m2654getWidthimpl(jM4420calculateMinimumTouchTargetPaddingE7KxVPU);
        float fM2651getHeightimpl = Size.m2651getHeightimpl(jM4420calculateMinimumTouchTargetPaddingE7KxVPU);
        long jM4416offsetFromEdgeMKHz9U = m4416offsetFromEdgeMKHz9U(pointerPosition);
        if ((fM2654getWidthimpl > 0.0f || fM2651getHeightimpl > 0.0f) && Offset.m2585getXimpl(jM4416offsetFromEdgeMKHz9U) <= fM2654getWidthimpl && Offset.m2586getYimpl(jM4416offsetFromEdgeMKHz9U) <= fM2651getHeightimpl) {
            return Offset.m2584getDistanceSquaredimpl(jM4416offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void draw(Canvas canvas) {
        m.h(canvas, "canvas");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas);
            return;
        }
        float fM5385getXimpl = IntOffset.m5385getXimpl(getPosition());
        float fM5386getYimpl = IntOffset.m5386getYimpl(getPosition());
        canvas.translate(fM5385getXimpl, fM5386getYimpl);
        drawContainedDrawModifiers(canvas);
        canvas.translate(-fM5385getXimpl, -fM5386getYimpl);
    }

    public final void drawBorder(Canvas canvas, Paint paint) {
        m.h(canvas, "canvas");
        m.h(paint, "paint");
        canvas.drawRect(new Rect(0.5f, 0.5f, IntSize.m5427getWidthimpl(getMeasuredSize()) - 0.5f, IntSize.m5426getHeightimpl(getMeasuredSize()) - 0.5f), paint);
    }

    public final NodeCoordinator findCommonAncestor$ui_release(NodeCoordinator other) {
        m.h(other, "other");
        LayoutNode layoutNode = other.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = other.getTail();
            Modifier.Node tail2 = getTail();
            int iM4446constructorimpl = NodeKind.m4446constructorimpl(2);
            if (!tail2.getNode().getIsAttached()) {
                throw new IllegalStateException("Check failed.".toString());
            }
            for (Modifier.Node parent$ui_release = tail2.getNode().getParent(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent()) {
                if ((parent$ui_release.getKindSet() & iM4446constructorimpl) != 0 && parent$ui_release == tail) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.getParent$ui_release();
            m.e(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            m.e(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return layoutNode2 == getLayoutNode() ? this : layoutNode == other.getLayoutNode() ? other : layoutNode.getInnerCoordinator$ui_release();
    }

    /* JADX INFO: renamed from: fromParentPosition-MK-Hz9U, reason: not valid java name */
    public long m4422fromParentPositionMKHz9U(long position) {
        long jM5397minusNvtHpc = IntOffsetKt.m5397minusNvtHpc(position, getPosition());
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo4489mapOffset8S9VItk(jM5397minusNvtHpc, true) : jM5397minusNvtHpc;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate().getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    /* JADX INFO: renamed from: getLastLayerDrawingWasSkipped$ui_release, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    /* JADX INFO: renamed from: getLastMeasurementConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m4423getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return getMeasurementConstraints();
    }

    public final OwnedLayer getLayer() {
        return this.layer;
    }

    public final l<GraphicsLayerScope, j> getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* JADX INFO: renamed from: getLookaheadDelegate$ui_release, reason: from getter */
    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError.toString());
    }

    /* JADX INFO: renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m4424getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo349toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo4364getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentCoordinates() {
        if (isAttached()) {
            return this.wrappedBy;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public Object getParentData() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Modifier.Node tail = getTail();
        if (getLayoutNode().getNodes().m4403hasH91voCI$ui_release(NodeKind.m4446constructorimpl(64))) {
            Density density = getLayoutNode().getDensity();
            for (Modifier.Node tail2 = getLayoutNode().getNodes().getTail(); tail2 != null; tail2 = tail2.getParent()) {
                if (tail2 != tail) {
                    if (((NodeKind.m4446constructorimpl(64) & tail2.getKindSet()) != 0) && (tail2 instanceof ParentDataModifierNode)) {
                        objectRef.element = ((ParentDataModifierNode) tail2).modifyParentData(density, objectRef.element);
                    }
                }
            }
        }
        return objectRef.element;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (isAttached()) {
            return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: getPosition-nOcc-ac, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        LinkedHashSet linkedHashSet = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrapped) {
            MeasureResult measureResult = nodeCoordinator._measureResult;
            Map<AlignmentLine, Integer> alignmentLines = measureResult != null ? measureResult.getAlignmentLines() : null;
            boolean z = false;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                z = true;
            }
            if (z) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(alignmentLines.keySet());
            }
        }
        return linkedHashSet == null ? EmptySet.INSTANCE : linkedHashSet;
    }

    public final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public final long mo4239getSizeYbymL2g() {
        return getMeasuredSize();
    }

    public abstract Modifier.Node getTail();

    /* JADX INFO: renamed from: getWrapped$ui_release, reason: from getter */
    public final NodeCoordinator getWrapped() {
        return this.wrapped;
    }

    /* JADX INFO: renamed from: getWrappedBy$ui_release, reason: from getter */
    public final NodeCoordinator getWrappedBy() {
        return this.wrappedBy;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    /* JADX INFO: renamed from: hasNode-H91voCI, reason: not valid java name */
    public final boolean m4425hasNodeH91voCI(int type) {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m4454getIncludeSelfInTraversalH91voCI(type));
        return nodeHeadNode != null && DelegatableNodeKt.m4331has64DMado(nodeHeadNode, type);
    }

    /* JADX INFO: renamed from: head-H91voCI, reason: not valid java name */
    public final <T> T m4426headH91voCI(int type) {
        boolean zM4454getIncludeSelfInTraversalH91voCI = NodeKindKt.m4454getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (zM4454getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
            for (Modifier.Node nodeHeadNode = headNode(zM4454getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & type) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                if ((nodeHeadNode.getKindSet() & type) != 0) {
                    m.n();
                    throw null;
                }
                if (nodeHeadNode == tail) {
                    break;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: headUnchecked-H91voCI, reason: not valid java name */
    public final <T> T m4427headUncheckedH91voCI(int type) {
        boolean zM4454getIncludeSelfInTraversalH91voCI = NodeKindKt.m4454getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (!zM4454getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return null;
        }
        for (Object obj = (T) headNode(zM4454getIncludeSelfInTraversalH91voCI); obj != null && (((Modifier.Node) obj).getAggregateChildKindSet() & type) != 0; obj = (T) ((Modifier.Node) obj).getChild()) {
            if ((((Modifier.Node) obj).getKindSet() & type) != 0) {
                return (T) obj;
            }
            if (obj == tail) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: hitTest-YqVAtuI, reason: not valid java name */
    public final <T extends DelegatableNode> void m4428hitTestYqVAtuI(HitTestSource<T> hitTestSource, long pointerPosition, HitTestResult<T> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        m.h(hitTestSource, "hitTestSource");
        m.h(hitTestResult, "hitTestResult");
        DelegatableNode delegatableNode = (DelegatableNode) m4427headUncheckedH91voCI(hitTestSource.mo4436entityTypeOLwlOKw());
        if (!m4434withinLayerBoundsk4lQ0M(pointerPosition)) {
            if (isTouchEvent) {
                float fM4421distanceInMinimumTouchTargettz77jQw = m4421distanceInMinimumTouchTargettz77jQw(pointerPosition, m4424getMinimumTouchTargetSizeNHjbRc());
                if (((Float.isInfinite(fM4421distanceInMinimumTouchTargettz77jQw) || Float.isNaN(fM4421distanceInMinimumTouchTargettz77jQw)) ? false : true) && hitTestResult.isHitInMinimumTouchTargetBetter(fM4421distanceInMinimumTouchTargettz77jQw, false)) {
                    m4415hitNearJHbHoSQ(delegatableNode, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, false, fM4421distanceInMinimumTouchTargettz77jQw);
                    return;
                }
                return;
            }
            return;
        }
        if (delegatableNode == null) {
            mo4354hitTestChildYqVAtuI(hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        if (m4429isPointerInBoundsk4lQ0M(pointerPosition)) {
            m4414hit1hIXUjU(delegatableNode, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        float fM4421distanceInMinimumTouchTargettz77jQw2 = !isTouchEvent ? Float.POSITIVE_INFINITY : m4421distanceInMinimumTouchTargettz77jQw(pointerPosition, m4424getMinimumTouchTargetSizeNHjbRc());
        if (((Float.isInfinite(fM4421distanceInMinimumTouchTargettz77jQw2) || Float.isNaN(fM4421distanceInMinimumTouchTargettz77jQw2)) ? false : true) && hitTestResult.isHitInMinimumTouchTargetBetter(fM4421distanceInMinimumTouchTargettz77jQw2, isInLayer)) {
            m4415hitNearJHbHoSQ(delegatableNode, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fM4421distanceInMinimumTouchTargettz77jQw2);
        } else {
            m4417speculativeHitJHbHoSQ(delegatableNode, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fM4421distanceInMinimumTouchTargettz77jQw2);
        }
    }

    /* JADX INFO: renamed from: hitTestChild-YqVAtuI */
    public <T extends DelegatableNode> void mo4354hitTestChildYqVAtuI(HitTestSource<T> hitTestSource, long pointerPosition, HitTestResult<T> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        m.h(hitTestSource, "hitTestSource");
        m.h(hitTestResult, "hitTestResult");
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m4428hitTestYqVAtuI(hitTestSource, nodeCoordinator.m4422fromParentPositionMKHz9U(pointerPosition), hitTestResult, isTouchEvent, isInLayer);
        }
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Canvas) obj);
        return j.a;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return !this.released && getLayoutNode().isAttached();
    }

    /* JADX INFO: renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m4429isPointerInBoundsk4lQ0M(long pointerPosition) {
        float fM2585getXimpl = Offset.m2585getXimpl(pointerPosition);
        float fM2586getYimpl = Offset.m2586getYimpl(pointerPosition);
        return fM2585getXimpl >= 0.0f && fM2586getYimpl >= 0.0f && fM2585getXimpl < ((float) getMeasuredWidth()) && fM2586getYimpl < ((float) getMeasuredHeight());
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.layer != null && isAttached();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        m.h(sourceCoordinates, "sourceCoordinates");
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        if (!sourceCoordinates.isAttached()) {
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight(IntSize.m5427getWidthimpl(sourceCoordinates.mo4239getSizeYbymL2g()));
        rectCache.setBottom(IntSize.m5426getHeightimpl(sourceCoordinates.mo4239getSizeYbymL2g()));
        while (coordinator != nodeCoordinatorFindCommonAncestor$ui_release) {
            rectInParent$ui_release$default(coordinator, rectCache, clipBounds, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            coordinator = coordinator.wrappedBy;
            m.e(coordinator);
        }
        ancestorToLocal(nodeCoordinatorFindCommonAncestor$ui_release, rectCache, clipBounds);
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    public long mo4240localPositionOfR5De75A(LayoutCoordinates sourceCoordinates, long relativeToSource) {
        m.h(sourceCoordinates, "sourceCoordinates");
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        while (coordinator != nodeCoordinatorFindCommonAncestor$ui_release) {
            relativeToSource = coordinator.m4432toParentPositionMKHz9U(relativeToSource);
            coordinator = coordinator.wrappedBy;
            m.e(coordinator);
        }
        return m4413ancestorToLocalR5De75A(nodeCoordinatorFindCommonAncestor$ui_release, relativeToSource);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    public long mo4241localToRootMKHz9U(long relativeToLocal) {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            relativeToLocal = nodeCoordinator.m4432toParentPositionMKHz9U(relativeToLocal);
        }
        return relativeToLocal;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    public long mo4242localToWindowMKHz9U(long relativeToLocal) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo4495calculatePositionInWindowMKHz9U(mo4241localToRootMKHz9U(relativeToLocal));
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onLayoutNodeAttach() {
        onLayerBlockUpdated$default(this, this.layerBlock, false, 2, null);
    }

    public void onMeasureResultChanged(int i2, int i3) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo4491resizeozmzZPI(IntSizeKt.IntSize(i2, i3));
        } else {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                nodeCoordinator.invalidateLayer();
            }
        }
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.onLayoutChange(getLayoutNode());
        }
        m4270setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i2, i3));
        graphicsLayerScope.m3100setSizeuvyYCjk(IntSizeKt.m5437toSizeozmzZPI(getMeasuredSize()));
        int iM4446constructorimpl = NodeKind.m4446constructorimpl(4);
        boolean zM4454getIncludeSelfInTraversalH91voCI = NodeKindKt.m4454getIncludeSelfInTraversalH91voCI(iM4446constructorimpl);
        Modifier.Node tail = getTail();
        if (!zM4454getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM4454getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM4446constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & iM4446constructorimpl) != 0 && (nodeHeadNode instanceof DrawModifierNode)) {
                ((DrawModifierNode) nodeHeadNode).onMeasureResultChanged();
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    public final void onMeasured() {
        Modifier.Node parent$ui_release;
        if (m4425hasNodeH91voCI(NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GRAPH_WRAP))) {
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    int iM4446constructorimpl = NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GRAPH_WRAP);
                    boolean zM4454getIncludeSelfInTraversalH91voCI = NodeKindKt.m4454getIncludeSelfInTraversalH91voCI(iM4446constructorimpl);
                    if (!zM4454getIncludeSelfInTraversalH91voCI) {
                        parent$ui_release = getTail().getParent();
                        if (parent$ui_release == null) {
                        }
                        j jVar = j.a;
                    }
                    parent$ui_release = getTail();
                    for (Modifier.Node nodeHeadNode = headNode(zM4454getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM4446constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                        if ((nodeHeadNode.getKindSet() & iM4446constructorimpl) != 0 && (nodeHeadNode instanceof LayoutAwareModifierNode)) {
                            ((LayoutAwareModifierNode) nodeHeadNode).mo4263onRemeasuredozmzZPI(getMeasuredSize());
                        }
                        if (nodeHeadNode == parent$ui_release) {
                            break;
                        }
                    }
                    j jVar2 = j.a;
                } finally {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            } finally {
                snapshotCreateNonObservableSnapshot.dispose();
            }
        }
    }

    public final void onPlaced() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        if (lookaheadDelegate != null) {
            int iM4446constructorimpl = NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GRAPH_WRAP);
            boolean zM4454getIncludeSelfInTraversalH91voCI = NodeKindKt.m4454getIncludeSelfInTraversalH91voCI(iM4446constructorimpl);
            Modifier.Node tail = getTail();
            if (zM4454getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
                for (Modifier.Node nodeHeadNode = headNode(zM4454getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM4446constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                    if ((nodeHeadNode.getKindSet() & iM4446constructorimpl) != 0 && (nodeHeadNode instanceof LayoutAwareModifierNode)) {
                        ((LayoutAwareModifierNode) nodeHeadNode).onLookaheadPlaced(lookaheadDelegate.getLookaheadLayoutCoordinates());
                    }
                    if (nodeHeadNode == tail) {
                        break;
                    }
                }
            }
        }
        int iM4446constructorimpl2 = NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GRAPH_WRAP);
        boolean zM4454getIncludeSelfInTraversalH91voCI2 = NodeKindKt.m4454getIncludeSelfInTraversalH91voCI(iM4446constructorimpl2);
        Modifier.Node tail2 = getTail();
        if (!zM4454getIncludeSelfInTraversalH91voCI2 && (tail2 = tail2.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode2 = headNode(zM4454getIncludeSelfInTraversalH91voCI2); nodeHeadNode2 != null && (nodeHeadNode2.getAggregateChildKindSet() & iM4446constructorimpl2) != 0; nodeHeadNode2 = nodeHeadNode2.getChild()) {
            if ((nodeHeadNode2.getKindSet() & iM4446constructorimpl2) != 0 && (nodeHeadNode2 instanceof LayoutAwareModifierNode)) {
                ((LayoutAwareModifierNode) nodeHeadNode2).onPlaced(this);
            }
            if (nodeHeadNode2 == tail2) {
                return;
            }
        }
    }

    public final void onRelease() {
        this.released = true;
        if (this.layer != null) {
            onLayerBlockUpdated$default(this, null, false, 2, null);
        }
    }

    public void performDraw(Canvas canvas) {
        m.h(canvas, "canvas");
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m4430performingMeasureK40F9xA(long constraints, kj.a<? extends Placeable> block) {
        m.h(block, "block");
        m4271setMeasurementConstraintsBRTryo0(constraints);
        Placeable placeable = (Placeable) block.invoke();
        OwnedLayer layer = getLayer();
        if (layer != null) {
            layer.mo4491resizeozmzZPI(getMeasuredSize());
        }
        return placeable;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo4236placeAtf8xVGno(long position, float zIndex, l<? super GraphicsLayerScope, j> layerBlock) {
        onLayerBlockUpdated$default(this, layerBlock, false, 2, null);
        if (!IntOffset.m5384equalsimpl0(getPosition(), position)) {
            m4431setPositiongyyYBs(position);
            getLayoutNode().getLayoutDelegate().getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo4490movegyyYBs(position);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner = getLayoutNode().getOwner();
            if (owner != null) {
                owner.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = zIndex;
    }

    public Object propagateRelocationRequest(Rect rect, dj.c<? super j> cVar) {
        return propagateRelocationRequest$suspendImpl(this, rect, cVar);
    }

    public final void rectInParent$ui_release(MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        m.h(bounds, "bounds");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long jM4424getMinimumTouchTargetSizeNHjbRc = m4424getMinimumTouchTargetSizeNHjbRc();
                    float fM2654getWidthimpl = Size.m2654getWidthimpl(jM4424getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    float fM2651getHeightimpl = Size.m2651getHeightimpl(jM4424getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    bounds.intersect(-fM2654getWidthimpl, -fM2651getHeightimpl, IntSize.m5427getWidthimpl(mo4239getSizeYbymL2g()) + fM2654getWidthimpl, IntSize.m5426getHeightimpl(mo4239getSizeYbymL2g()) + fM2651getHeightimpl);
                } else if (clipBounds) {
                    bounds.intersect(0.0f, 0.0f, IntSize.m5427getWidthimpl(mo4239getSizeYbymL2g()), IntSize.m5426getHeightimpl(mo4239getSizeYbymL2g()));
                }
                if (bounds.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(bounds, false);
        }
        float fM5385getXimpl = IntOffset.m5385getXimpl(getPosition());
        bounds.setLeft(bounds.getLeft() + fM5385getXimpl);
        bounds.setRight(bounds.getRight() + fM5385getXimpl);
        float fM5386getYimpl = IntOffset.m5386getYimpl(getPosition());
        bounds.setTop(bounds.getTop() + fM5386getYimpl);
        bounds.setBottom(bounds.getBottom() + fM5386getYimpl);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo4236placeAtf8xVGno(getPosition(), this.zIndex, this.layerBlock);
    }

    public void setMeasureResult$ui_release(MeasureResult measureResult) {
        m.h(measureResult, "value");
        MeasureResult measureResult2 = this._measureResult;
        if (measureResult != measureResult2) {
            this._measureResult = measureResult;
            if (measureResult2 == null || measureResult.getWidth() != measureResult2.getWidth() || measureResult.getHeight() != measureResult2.getHeight()) {
                onMeasureResultChanged(measureResult.getWidth(), measureResult.getHeight());
            }
            Map<AlignmentLine, Integer> map = this.oldAlignmentLines;
            if ((!(map == null || map.isEmpty()) || (!measureResult.getAlignmentLines().isEmpty())) && !m.c(measureResult.getAlignmentLines(), this.oldAlignmentLines)) {
                getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
                Map linkedHashMap = this.oldAlignmentLines;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.oldAlignmentLines = linkedHashMap;
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(measureResult.getAlignmentLines());
            }
        }
    }

    /* JADX INFO: renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m4431setPositiongyyYBs(long j) {
        this.position = j;
    }

    public final void setWrapped$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void setWrappedBy$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    public final void setZIndex(float f) {
        this.zIndex = f;
    }

    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m4454getIncludeSelfInTraversalH91voCI(NodeKind.m4446constructorimpl(16)));
        if (nodeHeadNode == null) {
            return false;
        }
        int iM4446constructorimpl = NodeKind.m4446constructorimpl(16);
        if (!nodeHeadNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node node = nodeHeadNode.getNode();
        if ((node.getAggregateChildKindSet() & iM4446constructorimpl) != 0) {
            for (Modifier.Node child$ui_release = node.getChild(); child$ui_release != null; child$ui_release = child$ui_release.getChild()) {
                if ((child$ui_release.getKindSet() & iM4446constructorimpl) != 0 && (child$ui_release instanceof PointerInputModifierNode) && ((PointerInputModifierNode) child$ui_release).sharePointerInputWithSiblings()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: toParentPosition-MK-Hz9U, reason: not valid java name */
    public long m4432toParentPositionMKHz9U(long position) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            position = ownedLayer.mo4489mapOffset8S9VItk(position, false);
        }
        return IntOffsetKt.m5399plusNvtHpc(position, getPosition());
    }

    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.INSTANCE.getZero();
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long jM4420calculateMinimumTouchTargetPaddingE7KxVPU = m4420calculateMinimumTouchTargetPaddingE7KxVPU(m4424getMinimumTouchTargetSizeNHjbRc());
        rectCache.setLeft(-Size.m2654getWidthimpl(jM4420calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setTop(-Size.m2651getHeightimpl(jM4420calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setRight(Size.m2654getWidthimpl(jM4420calculateMinimumTouchTargetPaddingE7KxVPU) + getMeasuredWidth());
        rectCache.setBottom(Size.m2651getHeightimpl(jM4420calculateMinimumTouchTargetPaddingE7KxVPU) + getMeasuredHeight());
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != layoutCoordinatesFindRootCoordinates) {
            nodeCoordinator.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            m.e(nodeCoordinator);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
    public void mo4243transformFromEL8BTi8(LayoutCoordinates sourceCoordinates, float[] matrix) {
        m.h(sourceCoordinates, "sourceCoordinates");
        m.h(matrix, "matrix");
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        Matrix.m3032resetimpl(matrix);
        coordinator.m4419transformToAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui_release, matrix);
        m4418transformFromAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui_release, matrix);
    }

    public final void updateLayerBlock(l<? super GraphicsLayerScope, j> lVar, boolean z) {
        boolean z2 = this.layerBlock != lVar || z;
        this.layerBlock = lVar;
        onLayerBlockUpdated(lVar, z2);
    }

    public final void updateLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        m.h(lookaheadDelegate, "lookaheadDelegate");
        this.lookaheadDelegate = lookaheadDelegate;
    }

    public final void updateLookaheadScope$ui_release(LookaheadScope scope) {
        LookaheadDelegate lookaheadDelegateCreateLookaheadDelegate = null;
        if (scope != null) {
            LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
            lookaheadDelegateCreateLookaheadDelegate = !m.c(scope, lookaheadDelegate != null ? lookaheadDelegate.getLookaheadScope() : null) ? createLookaheadDelegate(scope) : this.lookaheadDelegate;
        }
        this.lookaheadDelegate = lookaheadDelegateCreateLookaheadDelegate;
    }

    public final void visitNodes(int i2, boolean z, l<? super Modifier.Node, j> lVar) {
        m.h(lVar, "block");
        Modifier.Node tail = getTail();
        if (!z && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(z); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & i2) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & i2) != 0) {
                lVar.invoke(nodeHeadNode);
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: visitNodes-aLcG6gQ, reason: not valid java name */
    public final <T> void m4433visitNodesaLcG6gQ(int type, l<? super T, j> block) {
        m.h(block, "block");
        boolean zM4454getIncludeSelfInTraversalH91voCI = NodeKindKt.m4454getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (!zM4454getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM4454getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & type) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & type) != 0) {
                m.n();
                throw null;
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    public long mo4244windowToLocalMKHz9U(long relativeToWindow) {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo4240localPositionOfR5De75A(layoutCoordinatesFindRootCoordinates, Offset.m2589minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo4494calculateLocalPositionMKHz9U(relativeToWindow), LayoutCoordinatesKt.positionInRoot(layoutCoordinatesFindRootCoordinates)));
    }

    public final void withPositionTranslation(Canvas canvas, l<? super Canvas, j> lVar) {
        m.h(canvas, "canvas");
        m.h(lVar, "block");
        float fM5385getXimpl = IntOffset.m5385getXimpl(getPosition());
        float fM5386getYimpl = IntOffset.m5386getYimpl(getPosition());
        canvas.translate(fM5385getXimpl, fM5386getYimpl);
        lVar.invoke(canvas);
        canvas.translate(-fM5385getXimpl, -fM5386getYimpl);
    }

    /* JADX INFO: renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m4434withinLayerBoundsk4lQ0M(long pointerPosition) {
        if (!OffsetKt.m2602isFinitek4lQ0M(pointerPosition)) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.isClipping || ownedLayer.mo4488isInLayerk4lQ0M(pointerPosition);
    }

    public void invoke(final Canvas canvas) {
        m.h(canvas, "canvas");
        if (!getLayoutNode().getIsPlaced()) {
            this.lastLayerDrawingWasSkipped = true;
        } else {
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayer, new kj.a<j>() { // from class: androidx.compose.ui.node.NodeCoordinator.invoke.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m4440invoke();
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m4440invoke() {
                    NodeCoordinator.this.drawContainedDrawModifiers(canvas);
                }
            });
            this.lastLayerDrawingWasSkipped = false;
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this;
    }
}
