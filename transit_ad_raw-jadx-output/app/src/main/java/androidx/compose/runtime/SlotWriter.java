package androidx.compose.runtime;

import a.l;
import a6.h;
import androidx.appcompat.widget.s;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.n;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0011\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000 ¦\u00012\u00020\u0001:\u0002¦\u0001B\u0011\u0012\u0006\u0010<\u001a\u00020;¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0018\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0019\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u001a\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u001b\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u001c\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001J\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0002J\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0013J\u0006\u0010$\u001a\u00020\u0013J\u0006\u0010%\u001a\u00020\u0013J\u0006\u0010&\u001a\u00020\u0013J\u000e\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0002J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0001J\u0018\u0010*\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0001J\"\u0010*\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\"\u0010,\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u00012\b\u0010+\u001a\u0004\u0018\u00010\u0001J\u0018\u0010,\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0001J\u0006\u0010-\u001a\u00020\u0002J\u000f\u00100\u001a\u00020\u0013H\u0000¢\u0006\u0004\b.\u0010/J\u000e\u00101\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u00101\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\u0002J\u0006\u00103\u001a\u00020\u0004J\u000e\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000104J\u000e\u00107\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u0002J$\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0010092\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u0000J\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0010092\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010>\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0002J\u0016\u0010@\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002J$\u0010A\u001a\b\u0012\u0004\u0012\u00020\u0010092\u0006\u00106\u001a\u00020\u00022\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010B\u001a\u00020\u00132\b\b\u0002\u0010\r\u001a\u00020\u0002J\u000e\u0010C\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010E\u001a\u00020DH\u0016J\u0006\u0010F\u001a\u00020DJ\u000f\u0010H\u001a\u00020\u0013H\u0000¢\u0006\u0004\bG\u0010/J\u000f\u0010J\u001a\u00020\u0013H\u0000¢\u0006\u0004\bI\u0010/J,\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010K\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010L\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010M\u001a\u00020\u0013H\u0002J\u0010\u0010N\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0018\u0010P\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020OH\u0002J\u0010\u0010Q\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010R\u001a\u00020\u0013H\u0002J\b\u0010S\u001a\u00020\u0002H\u0002J \u0010U\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00022\u0006\u0010T\u001a\u00020\u0002H\u0002J\u0010\u0010V\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010W\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010Y\u001a\u00020\u00132\u0006\u0010X\u001a\u00020\u0002H\u0002J\u0018\u0010Z\u001a\u00020\u00132\u0006\u0010X\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0018\u0010]\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u00022\u0006\u0010\\\u001a\u00020\u0002H\u0002J \u0010^\u001a\u00020\u00132\u0006\u0010[\u001a\u00020\u00022\u0006\u0010\\\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u001a\u0010_\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0002J\u0018\u0010b\u001a\u00020\u00132\u0006\u0010`\u001a\u00020\u00022\u0006\u0010a\u001a\u00020\u0002H\u0002J\u0018\u0010d\u001a\u00020\u00042\u0006\u0010c\u001a\u00020\u00022\u0006\u0010X\u001a\u00020\u0002H\u0002J \u0010g\u001a\u00020\u00132\u0006\u0010e\u001a\u00020\u00022\u0006\u0010f\u001a\u00020\u00022\u0006\u0010X\u001a\u00020\u0002H\u0002J\u0018\u0010j\u001a\u00020\u0013*\u00060hj\u0002`i2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010k\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010m\u001a\u00020\u00022\u0006\u0010l\u001a\u00020\u0002H\u0002J\u0014\u0010\u0012\u001a\u00020\u0002*\u00020n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010l\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010l\u001a\u00020\u0002*\u00020n2\u0006\u0010?\u001a\u00020\u0002H\u0002J\u0014\u0010o\u001a\u00020\u0002*\u00020n2\u0006\u0010?\u001a\u00020\u0002H\u0002J\u001c\u0010p\u001a\u00020\u0013*\u00020n2\u0006\u0010?\u001a\u00020\u00022\u0006\u0010l\u001a\u00020\u0002H\u0002J\u0014\u0010q\u001a\u00020\u0002*\u00020n2\u0006\u0010?\u001a\u00020\u0002H\u0002J\u0014\u0010r\u001a\u00020\u0002*\u00020n2\u0006\u0010?\u001a\u00020\u0002H\u0002J\u0012\u0010s\u001a\b\u0012\u0004\u0012\u00020\u000209*\u00020nH\u0002J\u000e\u0010t\u001a\b\u0012\u0004\u0012\u00020\u000209H\u0002J(\u0010w\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u00022\u0006\u0010u\u001a\u00020\u00022\u0006\u0010v\u001a\u00020\u0002H\u0002J \u0010x\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010u\u001a\u00020\u00022\u0006\u0010v\u001a\u00020\u0002H\u0002J\u0018\u0010y\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u0002H\u0002J\u0010\u0010z\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001a\u0010<\u001a\u00020;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010{\u001a\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\"\u0010\u0081\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R+\u0010\u0085\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00100\u0083\u0001j\t\u0012\u0004\u0012\u00020\u0010`\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0088\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0088\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0088\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0088\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0088\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u0088\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0088\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0088\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0006\u0010\u0088\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0093\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0093\u0001R*\u0010\u0097\u0001\u001a\u00020\u00022\u0007\u0010\u0096\u0001\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0088\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R(\u0010\u0012\u001a\u00020\u00022\u0007\u0010\u0096\u0001\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0012\u0010\u0088\u0001\u001a\u0006\b\u009a\u0001\u0010\u0099\u0001R*\u0010\u009b\u0001\u001a\u00020\u00042\u0007\u0010\u0096\u0001\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001b\u0010\u009f\u0001\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0014\u0010¡\u0001\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u009e\u0001R\u0012\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u0005\u0010\u009e\u0001R\u0016\u0010X\u001a\u00020\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010\u0099\u0001R\u0016\u0010v\u001a\u00020\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010\u0099\u0001¨\u0006§\u0001"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "", "index", "", "isNode", "nodeCount", "groupKey", "groupObjectKey", "groupSize", "groupAux", "indexInParent", "indexInCurrentGroup", "group", "indexInGroup", "node", "Landroidx/compose/runtime/Anchor;", "anchor", "parent", "Lkotlin/j;", "close", "reset", "value", "update", "updateAux", "insertAux", "updateNode", "updateParentNode", "set", "skip", "slot", "groupIndex", "amount", "advanceBy", "seek", "skipToGroupEnd", "beginInsert", "endInsert", "startGroup", "key", "dataKey", "objectKey", "startNode", "aux", "startData", "endGroup", "bashGroup$runtime_release", "()V", "bashGroup", "ensureStarted", "skipGroup", "removeGroup", "", "groupSlots", TypedValues.CycleType.S_WAVE_OFFSET, "moveGroup", "writer", "", "moveTo", "Landroidx/compose/runtime/SlotTable;", "table", "moveFrom", "insertParentGroup", "address", "addToGroupSizeAlongSpine", "moveIntoGroupFrom", "markGroup", "anchorIndex", "", "toString", "groupsAsString", "verifyDataAnchors$runtime_release", "verifyDataAnchors", "verifyParentAnchors$runtime_release", "verifyParentAnchors", "containsGroupMark", "containsAnyGroupMarks", "recalculateMarks", "updateContainsMark", "Landroidx/compose/runtime/PrioritySet;", "updateContainsMarkNow", "childContainsAnyMarks", "saveCurrentGroupEnd", "restoreCurrentGroupEnd", "firstChild", "fixParentAnchorsFor", "moveGroupGapTo", "moveSlotGapTo", "size", "insertGroups", "insertSlots", "start", "len", "removeGroups", "removeSlots", "updateNodeOfGroup", "previousGapStart", "newGapStart", "updateAnchors", "gapStart", "removeAnchors", "originalLocation", "newLocation", "moveAnchors", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "groupAsString", "groupIndexToAddress", "dataIndex", "dataIndexToDataAddress", "", "slotIndex", "updateDataIndex", "nodeIndex", "auxIndex", "dataIndexes", "keys", "gapLen", "capacity", "dataIndexToDataAnchor", "dataAnchorToDataIndex", "parentIndexToAnchor", "parentAnchorToIndex", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "groups", "[I", "", "slots", "[Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "Ljava/util/ArrayList;", "groupGapStart", "I", "groupGapLen", "currentGroupEnd", "currentSlot", "currentSlotEnd", "slotsGapStart", "slotsGapLen", "slotsGapOwner", "insertCount", "Landroidx/compose/runtime/IntStack;", "startStack", "Landroidx/compose/runtime/IntStack;", "endStack", "nodeCountStack", "<set-?>", "currentGroup", "getCurrentGroup", "()I", "getParent", "closed", "Z", "getClosed", "()Z", "pendingRecalculateMarks", "Landroidx/compose/runtime/PrioritySet;", "isGroupEnd", "getSize$runtime_release", "getCapacity", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class SlotWriter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private ArrayList<Anchor> anchors;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private final IntStack endStack;
    private int groupGapLen;
    private int groupGapStart;
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    private final IntStack nodeCountStack;
    private int parent;
    private PrioritySet pendingRecalculateMarks;
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    private final IntStack startStack;
    private final SlotTable table;

    /* JADX INFO: compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "()V", "moveGroup", "", "Landroidx/compose/runtime/Anchor;", "fromWriter", "Landroidx/compose/runtime/SlotWriter;", "fromIndex", "", "toWriter", "updateFromCursor", "", "updateToCursor", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final List<Anchor> moveGroup(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor) throws KotlinNothingValueException {
            ArrayList arrayList;
            boolean zRemoveGroup;
            int i2;
            int iGroupSize = fromWriter.groupSize(fromIndex);
            int i3 = fromIndex + iGroupSize;
            int iDataIndex = fromWriter.dataIndex(fromIndex);
            int iDataIndex2 = fromWriter.dataIndex(i3);
            int i4 = iDataIndex2 - iDataIndex;
            boolean zContainsAnyGroupMarks = fromWriter.containsAnyGroupMarks(fromIndex);
            toWriter.insertGroups(iGroupSize);
            toWriter.insertSlots(i4, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i3) {
                fromWriter.moveGroupGapTo(i3);
            }
            if (fromWriter.slotsGapStart < iDataIndex2) {
                fromWriter.moveSlotGapTo(iDataIndex2, i3);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            n.l0(currentGroup * 5, fromIndex * 5, i3 * 5, fromWriter.groups, iArr);
            Object[] objArr = toWriter.slots;
            int i5 = toWriter.currentSlot;
            n.o0(fromWriter.slots, objArr, i5, iDataIndex, iDataIndex2);
            int parent = toWriter.getParent();
            SlotTableKt.updateParentAnchor(iArr, currentGroup, parent);
            int i6 = currentGroup - fromIndex;
            int i7 = currentGroup + iGroupSize;
            int iDataIndex3 = i5 - toWriter.dataIndex(iArr, currentGroup);
            int i8 = toWriter.slotsGapOwner;
            int i9 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i10 = i8;
            int i11 = currentGroup;
            while (true) {
                if (i11 >= i7) {
                    break;
                }
                if (i11 != currentGroup) {
                    i2 = i7;
                    SlotTableKt.updateParentAnchor(iArr, i11, SlotTableKt.parentAnchor(iArr, i11) + i6);
                } else {
                    i2 = i7;
                }
                int i12 = iDataIndex3;
                SlotTableKt.updateDataAnchor(iArr, i11, toWriter.dataIndexToDataAnchor(toWriter.dataIndex(iArr, i11) + iDataIndex3, i10 >= i11 ? toWriter.slotsGapStart : 0, i9, length));
                if (i11 == i10) {
                    i10++;
                }
                i11++;
                iDataIndex3 = i12;
                i7 = i2;
            }
            int i13 = i7;
            toWriter.slotsGapOwner = i10;
            int iLocationOf = SlotTableKt.locationOf(fromWriter.anchors, fromIndex, fromWriter.getSize$runtime_release());
            int iLocationOf2 = SlotTableKt.locationOf(fromWriter.anchors, i3, fromWriter.getSize$runtime_release());
            if (iLocationOf < iLocationOf2) {
                ArrayList arrayList2 = fromWriter.anchors;
                arrayList = new ArrayList(iLocationOf2 - iLocationOf);
                for (int i14 = iLocationOf; i14 < iLocationOf2; i14++) {
                    Object obj = arrayList2.get(i14);
                    m.g(obj, "sourceAnchors[anchorIndex]");
                    Anchor anchor = (Anchor) obj;
                    anchor.setLocation$runtime_release(anchor.getLocation() + i6);
                    arrayList.add(anchor);
                }
                toWriter.anchors.addAll(SlotTableKt.locationOf(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.getSize$runtime_release()), arrayList);
                arrayList2.subList(iLocationOf, iLocationOf2).clear();
            } else {
                arrayList = EmptyList.INSTANCE;
            }
            int iParent = fromWriter.parent(fromIndex);
            if (updateFromCursor) {
                int i15 = iParent >= 0 ? 1 : 0;
                if (i15 != 0) {
                    fromWriter.startGroup();
                    fromWriter.advanceBy(iParent - fromWriter.getCurrentGroup());
                    fromWriter.startGroup();
                }
                fromWriter.advanceBy(fromIndex - fromWriter.getCurrentGroup());
                zRemoveGroup = fromWriter.removeGroup();
                if (i15 != 0) {
                    fromWriter.skipToGroupEnd();
                    fromWriter.endGroup();
                    fromWriter.skipToGroupEnd();
                    fromWriter.endGroup();
                }
            } else {
                boolean zRemoveGroups = fromWriter.removeGroups(fromIndex, iGroupSize);
                fromWriter.removeSlots(iDataIndex, i4, fromIndex - 1);
                zRemoveGroup = zRemoveGroups;
            }
            if (!(!zRemoveGroup)) {
                throw s.k("Unexpectedly removed anchors");
            }
            toWriter.nodeCount += SlotTableKt.isNode(iArr, currentGroup) ? 1 : SlotTableKt.nodeCount(iArr, currentGroup);
            if (updateToCursor) {
                toWriter.currentGroup = i13;
                toWriter.currentSlot = i5 + i4;
            }
            if (zContainsAnyGroupMarks) {
                toWriter.updateContainsMark(parent);
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.SlotWriter$groupSlots$1, reason: invalid class name */
    /* JADX INFO: compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"androidx/compose/runtime/SlotWriter$groupSlots$1", "", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "hasNext", "", "next", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass1 implements Iterator<Object>, lj.a {
        final /* synthetic */ int $end;
        private int current;
        final /* synthetic */ SlotWriter this$0;

        public AnonymousClass1(int i2, int i3, SlotWriter slotWriter) {
            this.$end = i3;
            this.this$0 = slotWriter;
            this.current = i2;
        }

        public final int getCurrent() {
            return this.current;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current < this.$end;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] objArr = this.this$0.slots;
            SlotWriter slotWriter = this.this$0;
            int i2 = this.current;
            this.current = i2 + 1;
            return objArr[slotWriter.dataIndexToDataAddress(i2)];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCurrent(int i2) {
            this.current = i2;
        }
    }

    public SlotWriter(SlotTable slotTable) {
        m.h(slotTable, "table");
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors$runtime_release();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.startStack = new IntStack();
        this.endStack = new IntStack();
        this.nodeCountStack = new IntStack();
        this.parent = -1;
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i2);
    }

    private final int auxIndex(int[] iArr, int i2) {
        return SlotTableKt.countOneBits(SlotTableKt.groupInfo(iArr, i2) >> 29) + dataIndex(iArr, i2);
    }

    private final boolean childContainsAnyMarks(int group) {
        int iGroupSize = group + 1;
        int iGroupSize2 = groupSize(group) + group;
        while (iGroupSize < iGroupSize2) {
            if (SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(iGroupSize))) {
                return true;
            }
            iGroupSize += groupSize(iGroupSize);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int group) {
        return group >= 0 && SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(group));
    }

    private final boolean containsGroupMark(int group) {
        return group >= 0 && SlotTableKt.containsMark(this.groups, groupIndexToAddress(group));
    }

    private final int dataAnchorToDataIndex(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int index) {
        return dataIndex(this.groups, groupIndexToAddress(index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int dataIndex) {
        return dataIndex < this.slotsGapStart ? dataIndex : dataIndex + this.slotsGapLen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        List listDataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        ArrayList arrayListF1 = y.F1(y.N1(l.C(this.groupGapStart + this.groupGapLen, iArr.length / 5), listDataAnchors$default), y.N1(l.C(0, this.groupGapStart), listDataAnchors$default));
        ArrayList arrayList = new ArrayList(arrayListF1.size());
        int size = arrayListF1.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) arrayListF1.get(i2)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final void fixParentAnchorsFor(int i2, int i3, int i4) {
        int iParentIndexToAnchor = parentIndexToAnchor(i2, this.groupGapStart);
        while (i4 < i3) {
            SlotTableKt.updateParentAnchor(this.groups, groupIndexToAddress(i4), iParentIndexToAnchor);
            int iGroupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i4)) + i4;
            fixParentAnchorsFor(i4, iGroupSize, i4 + 1);
            i4 = iGroupSize;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final void groupAsString(StringBuilder sb, int i2) {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        sb.append("Group(");
        if (i2 < 10) {
            sb.append(' ');
        }
        if (i2 < 100) {
            sb.append(' ');
        }
        if (i2 < 1000) {
            sb.append(' ');
        }
        sb.append(i2);
        if (iGroupIndexToAddress != i2) {
            sb.append("(");
            sb.append(iGroupIndexToAddress);
            sb.append(")");
        }
        sb.append('#');
        sb.append(SlotTableKt.groupSize(this.groups, iGroupIndexToAddress));
        boolean zGroupAsString$isStarted = groupAsString$isStarted(this, i2);
        if (zGroupAsString$isStarted) {
            sb.append('?');
        }
        sb.append('^');
        sb.append(parentAnchorToIndex(SlotTableKt.parentAnchor(this.groups, iGroupIndexToAddress)));
        sb.append(": key=");
        sb.append(SlotTableKt.key(this.groups, iGroupIndexToAddress));
        sb.append(", nodes=");
        sb.append(SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress));
        if (zGroupAsString$isStarted) {
            sb.append('?');
        }
        sb.append(", dataAnchor=");
        sb.append(SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress));
        sb.append(", parentAnchor=");
        sb.append(SlotTableKt.parentAnchor(this.groups, iGroupIndexToAddress));
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            sb.append(", node=" + this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))]);
        }
        int iSlotIndex = slotIndex(this.groups, iGroupIndexToAddress);
        int iDataIndex = dataIndex(this.groups, iGroupIndexToAddress + 1);
        if (iDataIndex > iSlotIndex) {
            sb.append(", [");
            for (int i3 = iSlotIndex; i3 < iDataIndex; i3++) {
                if (i3 != iSlotIndex) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(this.slots[dataIndexToDataAddress(i3)]));
            }
            sb.append(']');
        }
        sb.append(")");
    }

    private static final boolean groupAsString$isStarted(SlotWriter slotWriter, int i2) {
        return i2 < slotWriter.currentGroup && (i2 == slotWriter.parent || slotWriter.startStack.indexOf(i2) >= 0 || groupAsString$isStarted(slotWriter, slotWriter.parent(i2)));
    }

    private final int groupIndexToAddress(int index) {
        return index < this.groupGapStart ? index : index + this.groupGapLen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGroups(int i2) {
        if (i2 > 0) {
            int i3 = this.currentGroup;
            moveGroupGapTo(i3);
            int i4 = this.groupGapStart;
            int i5 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i6 = length - i5;
            if (i5 < i2) {
                int iMax = Math.max(Math.max(length * 2, i6 + i2), 32);
                int[] iArr2 = new int[iMax * 5];
                int i7 = iMax - i6;
                n.l0(0, 0, i4 * 5, iArr, iArr2);
                n.l0((i4 + i7) * 5, (i5 + i4) * 5, length * 5, iArr, iArr2);
                this.groups = iArr2;
                i5 = i7;
            }
            int i8 = this.currentGroupEnd;
            if (i8 >= i4) {
                this.currentGroupEnd = i8 + i2;
            }
            int i9 = i4 + i2;
            this.groupGapStart = i9;
            this.groupGapLen = i5 - i2;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(i6 > 0 ? dataIndex(i3 + i2) : 0, this.slotsGapOwner >= i4 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i10 = i4; i10 < i9; i10++) {
                SlotTableKt.updateDataAnchor(this.groups, i10, iDataIndexToDataAnchor);
            }
            int i11 = this.slotsGapOwner;
            if (i11 >= i4) {
                this.slotsGapOwner = i11 + i2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void insertSlots(int i2, int i3) throws KotlinNothingValueException {
        if (i2 > 0) {
            moveSlotGapTo(this.currentSlot, i3);
            int i4 = this.slotsGapStart;
            int i5 = this.slotsGapLen;
            if (i5 < i2) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i6 = length - i5;
                int iMax = Math.max(Math.max(length * 2, i6 + i2), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i7 = 0; i7 < iMax; i7++) {
                    objArr2[i7] = null;
                }
                int i8 = iMax - i6;
                n.o0(objArr, objArr2, 0, 0, i4);
                n.o0(objArr, objArr2, i4 + i8, i5 + i4, length);
                this.slots = objArr2;
                i5 = i8;
            }
            int i9 = this.currentSlotEnd;
            if (i9 >= i4) {
                this.currentSlotEnd = i9 + i2;
            }
            this.slotsGapStart = i4 + i2;
            this.slotsGapLen = i5 - i2;
        }
    }

    private final List<Integer> keys() {
        List listKeys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(listKeys$default.size());
        int size = listKeys$default.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = listKeys$default.get(i2);
            ((Number) obj).intValue();
            int i3 = this.groupGapStart;
            if (i2 < i3 || i2 >= i3 + this.groupGapLen) {
                arrayList.add(obj);
            }
            i2++;
        }
        return arrayList;
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = slotWriter.parent;
        }
        slotWriter.markGroup(i2);
    }

    private final void moveAnchors(int i2, int i3, int i4) {
        int i5 = i4 + i2;
        int size$runtime_release = getSize$runtime_release();
        int iLocationOf = SlotTableKt.locationOf(this.anchors, i2, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (iLocationOf >= 0) {
            while (iLocationOf < this.anchors.size()) {
                Anchor anchor = this.anchors.get(iLocationOf);
                m.g(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int iAnchorIndex = anchorIndex(anchor2);
                if (iAnchorIndex < i2 || iAnchorIndex >= i5) {
                    break;
                }
                arrayList.add(anchor2);
                this.anchors.remove(iLocationOf);
            }
        }
        int i6 = i3 - i2;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Anchor anchor3 = (Anchor) arrayList.get(i7);
            int iAnchorIndex2 = anchorIndex(anchor3) + i6;
            if (iAnchorIndex2 >= this.groupGapStart) {
                anchor3.setLocation$runtime_release(-(size$runtime_release - iAnchorIndex2));
            } else {
                anchor3.setLocation$runtime_release(iAnchorIndex2);
            }
            this.anchors.add(SlotTableKt.locationOf(this.anchors, iAnchorIndex2, size$runtime_release), anchor3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveGroupGapTo(int i2) {
        int i3 = this.groupGapLen;
        int i4 = this.groupGapStart;
        if (i4 != i2) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i4, i2);
            }
            if (i3 > 0) {
                int[] iArr = this.groups;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                int i7 = i4 * 5;
                if (i2 < i4) {
                    n.l0(i6 + i5, i5, i7, iArr, iArr);
                } else {
                    n.l0(i7, i7 + i6, i5 + i6, iArr, iArr);
                }
            }
            if (i2 < i4) {
                i4 = i2 + i3;
            }
            int capacity = getCapacity();
            ComposerKt.runtimeCheck(i4 < capacity);
            while (i4 < capacity) {
                int iParentAnchor = SlotTableKt.parentAnchor(this.groups, i4);
                int iParentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(iParentAnchor), i2);
                if (iParentIndexToAnchor != iParentAnchor) {
                    SlotTableKt.updateParentAnchor(this.groups, i4, iParentIndexToAnchor);
                }
                i4++;
                if (i4 == i2) {
                    i4 += i3;
                }
            }
        }
        this.groupGapStart = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void moveSlotGapTo(int i2, int i3) throws KotlinNothingValueException {
        int i4 = this.slotsGapLen;
        int i5 = this.slotsGapStart;
        int i6 = this.slotsGapOwner;
        if (i5 != i2) {
            Object[] objArr = this.slots;
            if (i2 < i5) {
                n.o0(objArr, objArr, i2 + i4, i2, i5);
            } else {
                n.o0(objArr, objArr, i5, i5 + i4, i2 + i4);
            }
            n.v0(objArr, i2, i2 + i4);
        }
        int iMin = Math.min(i3 + 1, getSize$runtime_release());
        if (i6 != iMin) {
            int length = this.slots.length - i4;
            if (iMin < i6) {
                int iGroupIndexToAddress = groupIndexToAddress(iMin);
                int iGroupIndexToAddress2 = groupIndexToAddress(i6);
                int i7 = this.groupGapStart;
                while (iGroupIndexToAddress < iGroupIndexToAddress2) {
                    int iDataAnchor = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress);
                    if (!(iDataAnchor >= 0)) {
                        throw s.k("Unexpected anchor value, expected a positive anchor");
                    }
                    SlotTableKt.updateDataAnchor(this.groups, iGroupIndexToAddress, -((length - iDataAnchor) + 1));
                    iGroupIndexToAddress++;
                    if (iGroupIndexToAddress == i7) {
                        iGroupIndexToAddress += this.groupGapLen;
                    }
                }
            } else {
                int iGroupIndexToAddress3 = groupIndexToAddress(i6);
                int iGroupIndexToAddress4 = groupIndexToAddress(iMin);
                while (iGroupIndexToAddress3 < iGroupIndexToAddress4) {
                    int iDataAnchor2 = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress3);
                    if (!(iDataAnchor2 < 0)) {
                        throw s.k("Unexpected anchor value, expected a negative anchor");
                    }
                    SlotTableKt.updateDataAnchor(this.groups, iGroupIndexToAddress3, iDataAnchor2 + length + 1);
                    iGroupIndexToAddress3++;
                    if (iGroupIndexToAddress3 == this.groupGapStart) {
                        iGroupIndexToAddress3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = i2;
    }

    private final int nodeIndex(int[] iArr, int i2) {
        return dataIndex(iArr, i2);
    }

    private final int parentAnchorToIndex(int index) {
        return index > -2 ? index : getSize$runtime_release() + index + 2;
    }

    private final int parentIndexToAnchor(int index, int gapStart) {
        return index < gapStart ? index : -((getSize$runtime_release() - index) + 2);
    }

    private final void recalculateMarks() {
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty()) {
                updateContainsMarkNow(prioritySet.takeMax(), prioritySet);
            }
        }
    }

    private final boolean removeAnchors(int gapStart, int size) {
        int i2 = size + gapStart;
        int iLocationOf = SlotTableKt.locationOf(this.anchors, i2, getCapacity() - this.groupGapLen);
        if (iLocationOf >= this.anchors.size()) {
            iLocationOf--;
        }
        int i3 = iLocationOf + 1;
        int i4 = 0;
        while (iLocationOf >= 0) {
            Anchor anchor = this.anchors.get(iLocationOf);
            m.g(anchor, "anchors[index]");
            Anchor anchor2 = anchor;
            int iAnchorIndex = anchorIndex(anchor2);
            if (iAnchorIndex < gapStart) {
                break;
            }
            if (iAnchorIndex < i2) {
                anchor2.setLocation$runtime_release(Integer.MIN_VALUE);
                if (i4 == 0) {
                    i4 = iLocationOf + 1;
                }
                i3 = iLocationOf;
            }
            iLocationOf--;
        }
        boolean z = i3 < i4;
        if (z) {
            this.anchors.subList(i3, i4).clear();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeGroups(int start, int len) {
        if (len > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(start);
            zRemoveAnchors = arrayList.isEmpty() ^ true ? removeAnchors(start, len) : false;
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i2 = this.slotsGapOwner;
            if (i2 > start) {
                this.slotsGapOwner = Math.max(start, i2 - len);
            }
            int i3 = this.currentGroupEnd;
            if (i3 >= this.groupGapStart) {
                this.currentGroupEnd = i3 - len;
            }
            if (containsGroupMark(this.parent)) {
                updateContainsMark(this.parent);
            }
        }
        return zRemoveAnchors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void removeSlots(int i2, int i3, int i4) throws KotlinNothingValueException {
        if (i3 > 0) {
            int i5 = this.slotsGapLen;
            int i6 = i2 + i3;
            moveSlotGapTo(i6, i4);
            this.slotsGapStart = i2;
            this.slotsGapLen = i5 + i3;
            n.v0(this.slots, i2, i6);
            int i7 = this.currentSlotEnd;
            if (i7 >= i2) {
                this.currentSlotEnd = i7 - i3;
            }
        }
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int slotIndex(int[] iArr, int i2) {
        return i2 >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.slotAnchor(iArr, i2), this.slotsGapLen, this.slots.length);
    }

    private final void updateAnchors(int i2, int i3) {
        int i4;
        int capacity = getCapacity() - this.groupGapLen;
        if (i2 >= i3) {
            for (int iLocationOf = SlotTableKt.locationOf(this.anchors, i3, capacity); iLocationOf < this.anchors.size(); iLocationOf++) {
                Anchor anchor = this.anchors.get(iLocationOf);
                m.g(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int location$runtime_release = anchor2.getLocation();
                if (location$runtime_release < 0) {
                    return;
                }
                anchor2.setLocation$runtime_release(-(capacity - location$runtime_release));
            }
            return;
        }
        for (int iLocationOf2 = SlotTableKt.locationOf(this.anchors, i2, capacity); iLocationOf2 < this.anchors.size(); iLocationOf2++) {
            Anchor anchor3 = this.anchors.get(iLocationOf2);
            m.g(anchor3, "anchors[index]");
            Anchor anchor4 = anchor3;
            int location$runtime_release2 = anchor4.getLocation();
            if (location$runtime_release2 >= 0 || (i4 = location$runtime_release2 + capacity) >= i3) {
                return;
            }
            anchor4.setLocation$runtime_release(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateContainsMark(int i2) {
        if (i2 >= 0) {
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet == null) {
                prioritySet = new PrioritySet(null, 1, null);
                this.pendingRecalculateMarks = prioritySet;
            }
            prioritySet.add(i2);
        }
    }

    private final void updateContainsMarkNow(int i2, PrioritySet prioritySet) {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        boolean zChildContainsAnyMarks = childContainsAnyMarks(i2);
        if (SlotTableKt.containsMark(this.groups, iGroupIndexToAddress) != zChildContainsAnyMarks) {
            SlotTableKt.updateContainsMark(this.groups, iGroupIndexToAddress, zChildContainsAnyMarks);
            int iParent = parent(i2);
            if (iParent >= 0) {
                prioritySet.add(iParent);
            }
        }
    }

    private final void updateDataIndex(int[] iArr, int i2, int i3) {
        SlotTableKt.updateDataAnchor(iArr, i2, dataIndexToDataAnchor(i3, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void updateNodeOfGroup(int i2, Object obj) throws KotlinNothingValueException {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        int[] iArr = this.groups;
        if (iGroupIndexToAddress < iArr.length && SlotTableKt.isNode(iArr, iGroupIndexToAddress)) {
            this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))] = obj;
            return;
        }
        ComposerKt.composeRuntimeError(("Updating the node of a group at " + i2 + " that was not created with as a node group").toString());
        throw new KotlinNothingValueException();
    }

    public final void addToGroupSizeAlongSpine(int i2, int i3) {
        while (i2 > 0) {
            int[] iArr = this.groups;
            SlotTableKt.updateGroupSize(iArr, i2, SlotTableKt.groupSize(iArr, i2) + i3);
            i2 = groupIndexToAddress(parentAnchorToIndex(SlotTableKt.parentAnchor(this.groups, i2)));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void advanceBy(int i2) throws KotlinNothingValueException {
        if (!(i2 >= 0)) {
            throw s.k("Cannot seek backwards");
        }
        if (!(this.insertCount <= 0)) {
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        if (i2 == 0) {
            return;
        }
        int i3 = this.currentGroup + i2;
        if (i3 >= this.parent && i3 <= this.currentGroupEnd) {
            this.currentGroup = i3;
            int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i3));
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
            return;
        }
        ComposerKt.composeRuntimeError(("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')').toString());
        throw new KotlinNothingValueException();
    }

    public final Anchor anchor(int index) {
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, index, getSize$runtime_release());
        if (iSearch >= 0) {
            Anchor anchor = arrayList.get(iSearch);
            m.g(anchor, "get(location)");
            return anchor;
        }
        if (index > this.groupGapStart) {
            index = -(getSize$runtime_release() - index);
        }
        Anchor anchor2 = new Anchor(index);
        arrayList.add(-(iSearch + 1), anchor2);
        return anchor2;
    }

    public final int anchorIndex(Anchor anchor) {
        m.h(anchor, "anchor");
        int location$runtime_release = anchor.getLocation();
        return location$runtime_release < 0 ? location$runtime_release + getSize$runtime_release() : location$runtime_release;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void bashGroup$runtime_release() throws KotlinNothingValueException {
        startGroup();
        while (!isGroupEnd()) {
            insertParentGroup(-3);
            skipGroup();
        }
        endGroup();
    }

    public final void beginInsert() {
        int i2 = this.insertCount;
        this.insertCount = i2 + 1;
        if (i2 == 0) {
            saveCurrentGroupEnd();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void close() throws KotlinNothingValueException {
        this.closed = true;
        if (this.startStack.isEmpty()) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final int endGroup() throws KotlinNothingValueException {
        boolean z = this.insertCount > 0;
        int i2 = this.currentGroup;
        int i3 = this.currentGroupEnd;
        int i4 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i4);
        int i5 = this.nodeCount;
        int i6 = i2 - i4;
        boolean zIsNode = SlotTableKt.isNode(this.groups, iGroupIndexToAddress);
        if (z) {
            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i6);
            SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i5);
            this.nodeCount = this.nodeCountStack.pop() + (zIsNode ? 1 : i5);
            this.parent = parent(this.groups, i4);
        } else {
            if ((i2 != i3 ? 0 : 1) == 0) {
                throw s.k("Expected to be at the end of a group");
            }
            int iGroupSize = SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
            int iNodeCount = SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress);
            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i6);
            SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i5);
            int iPop = this.startStack.pop();
            restoreCurrentGroupEnd();
            this.parent = iPop;
            int iParent = parent(this.groups, i4);
            int iPop2 = this.nodeCountStack.pop();
            this.nodeCount = iPop2;
            if (iParent == iPop) {
                this.nodeCount = iPop2 + (zIsNode ? 0 : i5 - iNodeCount);
            } else {
                int i7 = i6 - iGroupSize;
                int i8 = zIsNode ? 0 : i5 - iNodeCount;
                if (i7 != 0 || i8 != 0) {
                    while (iParent != 0 && iParent != iPop && (i8 != 0 || i7 != 0)) {
                        int iGroupIndexToAddress2 = groupIndexToAddress(iParent);
                        if (i7 != 0) {
                            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress2, SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2) + i7);
                        }
                        if (i8 != 0) {
                            int[] iArr = this.groups;
                            SlotTableKt.updateNodeCount(iArr, iGroupIndexToAddress2, SlotTableKt.nodeCount(iArr, iGroupIndexToAddress2) + i8);
                        }
                        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress2)) {
                            i8 = 0;
                        }
                        iParent = parent(this.groups, iParent);
                    }
                }
                this.nodeCount += i8;
            }
        }
        return i5;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void endInsert() throws KotlinNothingValueException {
        int i2 = this.insertCount;
        if (!(i2 > 0)) {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
        int i3 = i2 - 1;
        this.insertCount = i3;
        if (i3 == 0) {
            if (!(this.nodeCountStack.getTos() == this.startStack.getTos())) {
                throw s.k("startGroup/endGroup mismatch while inserting");
            }
            restoreCurrentGroupEnd();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void ensureStarted(int i2) throws KotlinNothingValueException {
        if (!(this.insertCount <= 0)) {
            throw s.k("Cannot call ensureStarted() while inserting");
        }
        int i3 = this.parent;
        if (i3 != i2) {
            if (!(i2 >= i3 && i2 < this.currentGroupEnd)) {
                ComposerKt.composeRuntimeError(("Started group at " + i2 + " must be a subgroup of the group at " + i3).toString());
                throw new KotlinNothingValueException();
            }
            int i4 = this.currentGroup;
            int i5 = this.currentSlot;
            int i6 = this.currentSlotEnd;
            this.currentGroup = i2;
            startGroup();
            this.currentGroup = i4;
            this.currentSlot = i5;
            this.currentSlotEnd = i6;
        }
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    /* JADX INFO: renamed from: getTable$runtime_release, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    public final Object groupAux(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        return SlotTableKt.hasAux(this.groups, iGroupIndexToAddress) ? this.slots[auxIndex(this.groups, iGroupIndexToAddress)] : Composer.INSTANCE.getEmpty();
    }

    public final int groupKey(int index) {
        return SlotTableKt.key(this.groups, groupIndexToAddress(index));
    }

    public final Object groupObjectKey(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        if (SlotTableKt.hasObjectKey(this.groups, iGroupIndexToAddress)) {
            return this.slots[SlotTableKt.objectKeyIndex(this.groups, iGroupIndexToAddress)];
        }
        return null;
    }

    public final int groupSize(int index) {
        return SlotTableKt.groupSize(this.groups, groupIndexToAddress(index));
    }

    public final Iterator<Object> groupSlots() {
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i2 = this.currentGroup;
        return new AnonymousClass1(iDataIndex, dataIndex(iArr, groupIndexToAddress(groupSize(i2) + i2)), this);
    }

    public final String groupsAsString() {
        StringBuilder sb = new StringBuilder();
        int size$runtime_release = getSize$runtime_release();
        for (int i2 = 0; i2 < size$runtime_release; i2++) {
            groupAsString(sb, i2);
            sb.append('\n');
        }
        String string = sb.toString();
        m.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final boolean indexInCurrentGroup(int index) {
        return indexInGroup(index, this.currentGroup);
    }

    public final boolean indexInGroup(int index, int group) {
        int iIndexOf;
        int capacity;
        if (group == this.parent) {
            capacity = this.currentGroupEnd;
        } else if (group <= this.startStack.peekOr(0) && (iIndexOf = this.startStack.indexOf(group)) >= 0) {
            capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(iIndexOf);
        } else {
            int iGroupSize = groupSize(group);
            capacity = iGroupSize + group;
        }
        return index > group && index < capacity;
    }

    public final boolean indexInParent(int index) {
        int i2 = this.parent;
        return (index > i2 && index < this.currentGroupEnd) || (i2 == 0 && index == 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void insertAux(Object obj) throws KotlinNothingValueException {
        if (!(this.insertCount >= 0)) {
            throw s.k("Cannot insert auxiliary data when not inserting");
        }
        int i2 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        if (!(!SlotTableKt.hasAux(this.groups, iGroupIndexToAddress))) {
            throw s.k("Group already has auxiliary data");
        }
        insertSlots(1, i2);
        int iAuxIndex = auxIndex(this.groups, iGroupIndexToAddress);
        int iDataIndexToDataAddress = dataIndexToDataAddress(iAuxIndex);
        int i3 = this.currentSlot;
        if (i3 > iAuxIndex) {
            int i4 = i3 - iAuxIndex;
            if (!(i4 < 3)) {
                throw new IllegalStateException("Moving more than two slot not supported".toString());
            }
            if (i4 > 1) {
                Object[] objArr = this.slots;
                objArr[iDataIndexToDataAddress + 2] = objArr[iDataIndexToDataAddress + 1];
            }
            Object[] objArr2 = this.slots;
            objArr2[iDataIndexToDataAddress + 1] = objArr2[iDataIndexToDataAddress];
        }
        SlotTableKt.addAux(this.groups, iGroupIndexToAddress);
        this.slots[iDataIndexToDataAddress] = obj;
        this.currentSlot++;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void insertParentGroup(int i2) throws KotlinNothingValueException {
        int iNodeCount = 0;
        if (!(this.insertCount == 0)) {
            throw s.k("Writer cannot be inserting");
        }
        if (isGroupEnd()) {
            beginInsert();
            startGroup(i2);
            endGroup();
            endInsert();
            return;
        }
        int i3 = this.currentGroup;
        int iParent = parent(this.groups, i3);
        int iGroupSize = groupSize(iParent) + iParent;
        int i4 = iGroupSize - i3;
        int iGroupSize2 = i3;
        while (iGroupSize2 < iGroupSize) {
            int iGroupIndexToAddress = groupIndexToAddress(iGroupSize2);
            iNodeCount += SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress);
            iGroupSize2 += SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        }
        int iDataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress(i3));
        beginInsert();
        insertGroups(1);
        endInsert();
        int iGroupIndexToAddress2 = groupIndexToAddress(i3);
        SlotTableKt.initGroup(this.groups, iGroupIndexToAddress2, i2, false, false, false, iParent, iDataAnchor);
        SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress2, i4 + 1);
        SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress2, iNodeCount);
        addToGroupSizeAlongSpine(groupIndexToAddress(iParent), 1);
        fixParentAnchorsFor(iParent, iGroupSize, i3);
        this.currentGroup = iGroupSize;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        int i2 = this.currentGroup;
        return i2 < this.currentGroupEnd && SlotTableKt.isNode(this.groups, groupIndexToAddress(i2));
    }

    public final void markGroup(int i2) {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        if (SlotTableKt.hasMark(this.groups, iGroupIndexToAddress)) {
            return;
        }
        SlotTableKt.updateMark(this.groups, iGroupIndexToAddress, true);
        if (SlotTableKt.containsMark(this.groups, iGroupIndexToAddress)) {
            return;
        }
        updateContainsMark(parent(i2));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final List<Anchor> moveFrom(SlotTable table, int index) throws KotlinNothingValueException {
        m.h(table, "table");
        ComposerKt.runtimeCheck(this.insertCount > 0);
        if (index != 0 || this.currentGroup != 0 || this.table.getGroupsSize() != 0) {
            SlotWriter slotWriterOpenWriter = table.openWriter();
            try {
                return INSTANCE.moveGroup(slotWriterOpenWriter, index, this, true, true);
            } finally {
                slotWriterOpenWriter.close();
            }
        }
        int[] iArr = this.groups;
        Object[] objArr = this.slots;
        ArrayList<Anchor> arrayList = this.anchors;
        int[] groups = table.getGroups();
        int groupsSize = table.getGroupsSize();
        Object[] slots = table.getSlots();
        int slotsSize = table.getSlotsSize();
        this.groups = groups;
        this.slots = slots;
        this.anchors = table.getAnchors$runtime_release();
        this.groupGapStart = groupsSize;
        this.groupGapLen = (groups.length / 5) - groupsSize;
        this.slotsGapStart = slotsSize;
        this.slotsGapLen = slots.length - slotsSize;
        this.slotsGapOwner = groupsSize;
        table.setTo$runtime_release(iArr, 0, objArr, 0, arrayList);
        return this.anchors;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void moveGroup(int i2) throws KotlinNothingValueException {
        int i3;
        int i4;
        if (!(this.insertCount == 0)) {
            throw s.k("Cannot move a group while inserting");
        }
        if (!(i2 >= 0)) {
            throw s.k("Parameter offset is out of bounds");
        }
        if (i2 == 0) {
            return;
        }
        int i5 = this.currentGroup;
        int i6 = this.parent;
        int i7 = this.currentGroupEnd;
        int iGroupSize = i5;
        for (int i8 = i2; i8 > 0; i8--) {
            iGroupSize += SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
            if (!(iGroupSize <= i7)) {
                throw s.k("Parameter offset is out of bounds");
            }
        }
        int iGroupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
        int i9 = this.currentSlot;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        int i10 = iGroupSize + iGroupSize2;
        int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(i10));
        int i11 = iDataIndex2 - iDataIndex;
        insertSlots(i11, Math.max(this.currentGroup - 1, 0));
        insertGroups(iGroupSize2);
        int[] iArr = this.groups;
        int iGroupIndexToAddress = groupIndexToAddress(i10) * 5;
        n.l0(groupIndexToAddress(i5) * 5, iGroupIndexToAddress, (iGroupSize2 * 5) + iGroupIndexToAddress, iArr, iArr);
        if (i11 > 0) {
            Object[] objArr = this.slots;
            n.o0(objArr, objArr, i9, dataIndexToDataAddress(iDataIndex + i11), dataIndexToDataAddress(iDataIndex2 + i11));
        }
        int i12 = iDataIndex + i11;
        int i13 = i12 - i9;
        int i14 = this.slotsGapStart;
        int i15 = this.slotsGapLen;
        int length = this.slots.length;
        int i16 = this.slotsGapOwner;
        int i17 = i5 + iGroupSize2;
        int i18 = i5;
        while (i18 < i17) {
            int iGroupIndexToAddress2 = groupIndexToAddress(i18);
            int i19 = i14;
            int iDataIndex3 = dataIndex(iArr, iGroupIndexToAddress2) - i13;
            if (i16 < iGroupIndexToAddress2) {
                i3 = i13;
                i4 = 0;
            } else {
                i3 = i13;
                i4 = i19;
            }
            updateDataIndex(iArr, iGroupIndexToAddress2, dataIndexToDataAnchor(iDataIndex3, i4, i15, length));
            i18++;
            i14 = i19;
            i13 = i3;
        }
        moveAnchors(i10, i5, iGroupSize2);
        if (!(!removeGroups(i10, iGroupSize2))) {
            throw s.k("Unexpectedly removed anchors");
        }
        fixParentAnchorsFor(i6, this.currentGroupEnd, i5);
        if (i11 > 0) {
            removeSlots(i12, i11, i10 - 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.runtime.Anchor> moveIntoGroupFrom(int r10, androidx.compose.runtime.SlotTable r11, int r12) throws kotlin.KotlinNothingValueException {
        /*
            r9 = this;
            java.lang.String r0 = "table"
            kotlin.jvm.internal.m.h(r11, r0)
            int r0 = r9.insertCount
            if (r0 > 0) goto L15
            int r0 = r9.currentGroup
            int r0 = r0 + r10
            int r0 = r9.groupSize(r0)
            r1 = 1
            if (r0 != r1) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            androidx.compose.runtime.ComposerKt.runtimeCheck(r1)
            int r0 = r9.currentGroup
            int r1 = r9.currentSlot
            int r2 = r9.currentSlotEnd
            r9.advanceBy(r10)
            r9.startGroup()
            r9.beginInsert()
            androidx.compose.runtime.SlotWriter r10 = r11.openWriter()
            androidx.compose.runtime.SlotWriter$Companion r3 = androidx.compose.runtime.SlotWriter.INSTANCE     // Catch: java.lang.Throwable -> L47
            r7 = 0
            r8 = 1
            r4 = r10
            r5 = r12
            r6 = r9
            java.util.List r11 = androidx.compose.runtime.SlotWriter.Companion.access$moveGroup(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L47
            r10.close()
            r9.endInsert()
            r9.endGroup()
            r9.currentGroup = r0
            r9.currentSlot = r1
            r9.currentSlotEnd = r2
            return r11
        L47:
            r11 = move-exception
            r10.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.moveIntoGroupFrom(int, androidx.compose.runtime.SlotTable, int):java.util.List");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final List<Anchor> moveTo(Anchor anchor, int offset, SlotWriter writer) throws KotlinNothingValueException {
        m.h(anchor, "anchor");
        m.h(writer, "writer");
        ComposerKt.runtimeCheck(writer.insertCount > 0);
        ComposerKt.runtimeCheck(this.insertCount == 0);
        ComposerKt.runtimeCheck(anchor.getValid());
        int iAnchorIndex = anchorIndex(anchor) + offset;
        int i2 = this.currentGroup;
        ComposerKt.runtimeCheck(i2 <= iAnchorIndex && iAnchorIndex < this.currentGroupEnd);
        int iParent = parent(iAnchorIndex);
        int iGroupSize = groupSize(iAnchorIndex);
        int iNodeCount = isNode(iAnchorIndex) ? 1 : nodeCount(iAnchorIndex);
        List<Anchor> listMoveGroup = INSTANCE.moveGroup(this, iAnchorIndex, writer, false, false);
        updateContainsMark(iParent);
        boolean z = iNodeCount > 0;
        while (iParent >= i2) {
            int iGroupIndexToAddress = groupIndexToAddress(iParent);
            int[] iArr = this.groups;
            SlotTableKt.updateGroupSize(iArr, iGroupIndexToAddress, SlotTableKt.groupSize(iArr, iGroupIndexToAddress) - iGroupSize);
            if (z) {
                if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
                    z = false;
                } else {
                    int[] iArr2 = this.groups;
                    SlotTableKt.updateNodeCount(iArr2, iGroupIndexToAddress, SlotTableKt.nodeCount(iArr2, iGroupIndexToAddress) - iNodeCount);
                }
            }
            iParent = parent(iParent);
        }
        if (z) {
            ComposerKt.runtimeCheck(this.nodeCount >= iNodeCount);
            this.nodeCount -= iNodeCount;
        }
        return listMoveGroup;
    }

    public final Object node(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            return this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))];
        }
        return null;
    }

    public final int nodeCount(int index) {
        return SlotTableKt.nodeCount(this.groups, groupIndexToAddress(index));
    }

    public final int parent(int index) {
        return parent(this.groups, index);
    }

    public final boolean removeGroup() {
        if (!(this.insertCount == 0)) {
            throw s.k("Cannot remove group while inserting");
        }
        int i2 = this.currentGroup;
        int i3 = this.currentSlot;
        int iSkipGroup = skipGroup();
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty() && prioritySet.peek() >= i2) {
                prioritySet.takeMax();
            }
        }
        boolean zRemoveGroups = removeGroups(i2, this.currentGroup - i2);
        removeSlots(i3, this.currentSlot - i3, i2 - 1);
        this.currentGroup = i2;
        this.currentSlot = i3;
        this.nodeCount -= iSkipGroup;
        return zRemoveGroups;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void reset() throws KotlinNothingValueException {
        if (!(this.insertCount == 0)) {
            throw s.k("Cannot reset when inserting");
        }
        recalculateMarks();
        this.currentGroup = 0;
        this.currentGroupEnd = getCapacity() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void seek(Anchor anchor) throws KotlinNothingValueException {
        m.h(anchor, "anchor");
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void set(Object obj) throws KotlinNothingValueException {
        int i2 = this.currentSlot;
        if (!(i2 <= this.currentSlotEnd)) {
            throw s.k("Writing to an invalid slot");
        }
        this.slots[dataIndexToDataAddress(i2 - 1)] = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object skip() throws KotlinNothingValueException {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i2 = this.currentSlot;
        this.currentSlot = i2 + 1;
        return objArr[dataIndexToDataAddress(i2)];
    }

    public final int skipGroup() {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int iGroupSize = SlotTableKt.groupSize(this.groups, iGroupIndexToAddress) + this.currentGroup;
        this.currentGroup = iGroupSize;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            return 1;
        }
        return SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress);
    }

    public final void skipToGroupEnd() {
        int i2 = this.currentGroupEnd;
        this.currentGroup = i2;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i2));
    }

    public final Object slot(Anchor anchor, int index) {
        m.h(anchor, "anchor");
        return slot(anchorIndex(anchor), index);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void startData(int i2, Object obj, Object obj2) throws KotlinNothingValueException {
        startGroup(i2, obj, false, obj2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void startGroup() throws KotlinNothingValueException {
        if (!(this.insertCount == 0)) {
            throw s.k("Key must be supplied when inserting");
        }
        Composer.Companion companion = Composer.INSTANCE;
        startGroup(0, companion.getEmpty(), false, companion.getEmpty());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void startNode(int i2, Object obj) throws KotlinNothingValueException {
        startGroup(i2, obj, true, Composer.INSTANCE.getEmpty());
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object update(Object value) throws KotlinNothingValueException {
        Object objSkip = skip();
        set(value);
        return objSkip;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void updateAux(Object obj) throws KotlinNothingValueException {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        if (!SlotTableKt.hasAux(this.groups, iGroupIndexToAddress)) {
            throw s.k("Updating the data of a group that was not created with a data slot");
        }
        this.slots[dataIndexToDataAddress(auxIndex(this.groups, iGroupIndexToAddress))] = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void updateNode(Object obj) throws KotlinNothingValueException {
        updateNodeOfGroup(this.currentGroup, obj);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void updateParentNode(Object obj) throws KotlinNothingValueException {
        updateNodeOfGroup(this.parent, obj);
    }

    public final void verifyDataAnchors$runtime_release() {
        int i2 = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i3 < size$runtime_release) {
            int iGroupIndexToAddress = groupIndexToAddress(i3);
            int iDataAnchor = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress);
            int iDataIndex = dataIndex(this.groups, iGroupIndexToAddress);
            if (!(iDataIndex >= i4)) {
                StringBuilder sbF = androidx.compose.animation.a.f("Data index out of order at ", i3, ", previous = ", i4, ", current = ");
                sbF.append(iDataIndex);
                throw new IllegalStateException(sbF.toString().toString());
            }
            if (!(iDataIndex <= length)) {
                throw new IllegalStateException(h.d("Data index, ", iDataIndex, ", out of bound at ", i3).toString());
            }
            if (iDataAnchor < 0 && !z) {
                if (!(i2 == i3)) {
                    throw new IllegalStateException(h.d("Expected the slot gap owner to be ", i2, " found gap at ", i3).toString());
                }
                z = true;
            }
            i3++;
            i4 = iDataIndex;
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int i2 = this.groupGapStart;
        int i3 = this.groupGapLen;
        int capacity = getCapacity();
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                for (int i5 = i3 + i2; i5 < capacity; i5++) {
                    int iParentAnchor = SlotTableKt.parentAnchor(this.groups, i5);
                    if (parentAnchorToIndex(iParentAnchor) < i2) {
                        if (!(iParentAnchor > -2)) {
                            throw new IllegalStateException(android.support.v4.media.a.c("Expected a start relative anchor at ", i5).toString());
                        }
                    } else {
                        if (!(iParentAnchor <= -2)) {
                            throw new IllegalStateException(android.support.v4.media.a.c("Expected an end relative anchor at ", i5).toString());
                        }
                    }
                }
                return;
            }
            if (!(SlotTableKt.parentAnchor(this.groups, i4) > -2)) {
                throw new IllegalStateException(android.support.v4.media.a.c("Expected a start relative anchor at ", i4).toString());
            }
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i2) {
        return i2 >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.dataAnchor(iArr, i2), this.slotsGapLen, this.slots.length);
    }

    public final boolean isNode(int index) {
        return SlotTableKt.isNode(this.groups, groupIndexToAddress(index));
    }

    public final int parent(Anchor anchor) {
        m.h(anchor, "anchor");
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    public final Object slot(int groupIndex, int index) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(groupIndex));
        int i2 = index + iSlotIndex;
        if (iSlotIndex <= i2 && i2 < dataIndex(this.groups, groupIndexToAddress(groupIndex + 1))) {
            return this.slots[dataIndexToDataAddress(i2)];
        }
        return Composer.INSTANCE.getEmpty();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void startData(int i2, Object obj) throws KotlinNothingValueException {
        startGroup(i2, Composer.INSTANCE.getEmpty(), false, obj);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void startNode(int i2, Object obj, Object obj2) throws KotlinNothingValueException {
        startGroup(i2, obj, true, obj2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void updateNode(Anchor anchor, Object obj) throws KotlinNothingValueException {
        m.h(anchor, "anchor");
        updateNodeOfGroup(anchor.toIndexFor(this), obj);
    }

    private final int parent(int[] iArr, int i2) {
        return parentAnchorToIndex(SlotTableKt.parentAnchor(iArr, groupIndexToAddress(i2)));
    }

    public final Object node(Anchor anchor) {
        m.h(anchor, "anchor");
        return node(anchor.toIndexFor(this));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object set(int index, Object value) throws KotlinNothingValueException {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int i2 = iSlotIndex + index;
        if (i2 >= iSlotIndex && i2 < dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1))) {
            int iDataIndexToDataAddress = dataIndexToDataAddress(i2);
            Object[] objArr = this.slots;
            Object obj = objArr[iDataIndexToDataAddress];
            objArr[iDataIndexToDataAddress] = value;
            return obj;
        }
        StringBuilder sbG = androidx.appcompat.view.menu.a.g("Write to an invalid slot index ", index, " for group ");
        sbG.append(this.currentGroup);
        ComposerKt.composeRuntimeError(sbG.toString().toString());
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void startGroup(int i2) throws KotlinNothingValueException {
        Composer.Companion companion = Composer.INSTANCE;
        startGroup(i2, companion.getEmpty(), false, companion.getEmpty());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void startGroup(int i2, Object obj) throws KotlinNothingValueException {
        startGroup(i2, obj, false, Composer.INSTANCE.getEmpty());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    private final void startGroup(int i2, Object obj, boolean z, Object obj2) throws KotlinNothingValueException {
        int iGroupSize;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (objArr != false) {
            insertGroups(1);
            int i3 = this.currentGroup;
            int iGroupIndexToAddress = groupIndexToAddress(i3);
            Composer.Companion companion = Composer.INSTANCE;
            int i4 = obj != companion.getEmpty() ? 1 : 0;
            int i5 = (z || obj2 == companion.getEmpty()) ? 0 : 1;
            SlotTableKt.initGroup(this.groups, iGroupIndexToAddress, i2, z, i4, i5, this.parent, this.currentSlot);
            this.currentSlotEnd = this.currentSlot;
            int i6 = (z ? 1 : 0) + i4 + i5;
            if (i6 > 0) {
                insertSlots(i6, i3);
                Object[] objArr2 = this.slots;
                int i7 = this.currentSlot;
                if (z) {
                    objArr2[i7] = obj2;
                    i7++;
                }
                if (i4 != 0) {
                    objArr2[i7] = obj;
                    i7++;
                }
                if (i5 != 0) {
                    objArr2[i7] = obj2;
                    i7++;
                }
                this.currentSlot = i7;
            }
            this.nodeCount = 0;
            iGroupSize = i3 + 1;
            this.parent = i3;
            this.currentGroup = iGroupSize;
        } else {
            this.startStack.push(this.parent);
            saveCurrentGroupEnd();
            int i8 = this.currentGroup;
            int iGroupIndexToAddress2 = groupIndexToAddress(i8);
            if (!m.c(obj2, Composer.INSTANCE.getEmpty())) {
                if (z) {
                    updateNode(obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.currentSlot = slotIndex(this.groups, iGroupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            this.nodeCount = SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress2);
            this.parent = i8;
            this.currentGroup = i8 + 1;
            iGroupSize = i8 + SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2);
        }
        this.currentGroupEnd = iGroupSize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void ensureStarted(Anchor anchor) throws KotlinNothingValueException {
        m.h(anchor, "anchor");
        ensureStarted(anchor.toIndexFor(this));
    }
}
