package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kj.l;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.collections.n;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: PersistentVectorBuilder.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010(\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003BA\u0012\f\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0010\u0010t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$\u0012\u000e\u0010v\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$\u0012\u0006\u0010w\u001a\u00020\u0004¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016J\u001f\u0010\f\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\u0013J\u001e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016J\u0018\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0016\u0010\u0017\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016J\u001a\u0010\u001a\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0018J \u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0096\u0002J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010!\u001a\u00020\u0004H\u0002J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0002J\b\u0010#\u001a\u00020\u0004H\u0002J\u001f\u0010'\u001a\u00020\u000b2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$H\u0002¢\u0006\u0004\b'\u0010(J)\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0010\u0010&\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$H\u0002¢\u0006\u0004\b)\u0010*J/\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010+\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010-J!\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\b\u0010\n\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$H\u0002¢\u0006\u0004\b0\u00101JA\u00105\u001a\u00020\u00122\u0010\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$2\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$H\u0002¢\u0006\u0004\b5\u00106JA\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0010\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$2\u000e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u00108\u001a\u00020\u0004H\u0002¢\u0006\u0004\b9\u0010:J?\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010;\u001a\u00020\u00042\u000e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0<H\u0002¢\u0006\u0004\b>\u0010?JG\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0010\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$2\u0006\u0010!\u001a\u00020\u00042\u0014\u0010@\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0$H\u0002¢\u0006\u0004\bA\u0010BJO\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0010\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$2\u0006\u0010!\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\u0014\u0010C\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0<H\u0002¢\u0006\u0004\bD\u0010EJ1\u0010F\u001a\u00020\u00122\u0010\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\bF\u0010GJI\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u000e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u00108\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010%2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ]\u0010J\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u00042\u0016\u0010@\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$0$2\u0006\u0010M\u001a\u00020\u00042\u000e\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$H\u0002¢\u0006\u0004\bJ\u0010OJW\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u00042\u0016\u0010@\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$0$2\u0006\u0010M\u001a\u00020\u00042\u000e\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$H\u0002¢\u0006\u0004\bQ\u0010RJm\u0010U\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\u000e\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010T\u001a\u00020\u00042\u0016\u0010@\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$0$2\u0006\u0010M\u001a\u00020\u00042\u000e\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$H\u0002¢\u0006\u0004\bU\u0010VJ\u001f\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\bW\u0010XJ;\u0010Y\u001a\u0004\u0018\u00010%2\u0010\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$2\u0006\u0010!\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\bY\u0010ZJ?\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u000e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u00108\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010[\u001a\u00020HH\u0002¢\u0006\u0004\b\\\u0010]J1\u0010^\u001a\u00020\u00122\u0010\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$2\u0006\u0010!\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0004H\u0002¢\u0006\u0004\b^\u0010_JA\u0010`\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$2\u000e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u00108\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010[\u001a\u00020HH\u0002¢\u0006\u0004\b`\u0010]J\u001c\u0010\u0017\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0018H\u0002J1\u0010a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$2\u000e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\ba\u0010-J7\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u000e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0004H\u0002¢\u0006\u0004\bb\u0010cJ,\u0010e\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u00182\u0006\u0010#\u001a\u00020\u00042\u0006\u0010d\u001a\u00020HH\u0002JC\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u00182\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010f\u001a\u00020\u00042\u0006\u0010d\u001a\u00020HH\u0002¢\u0006\u0004\b\u0017\u0010gJw\u0010k\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u00182\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010f\u001a\u00020\u00042\u0006\u0010h\u001a\u00020\u00042\u0006\u0010d\u001a\u00020H2\u0014\u0010j\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0i2\u0014\u0010@\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0iH\u0002¢\u0006\u0004\bk\u0010lJG\u0010o\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u000e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u00108\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010m\u001a\u00028\u00002\u0006\u0010n\u001a\u00020HH\u0002¢\u0006\u0004\bo\u0010KJ\u001e\u0010q\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0p2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002R\u001c\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR \u0010t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u001e\u0010v\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010uR\"\u0010w\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010\u0006\"\u0004\bz\u0010{R\u0016\u0010}\u001a\u00020|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R9\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$2\u0010\u0010\u007f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$8\u0000@BX\u0080\u000e¢\u0006\r\n\u0004\b2\u0010u\u001a\u0005\b\u0080\u0001\u00101R5\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u000e\u0010\u007f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8\u0000@BX\u0080\u000e¢\u0006\r\n\u0004\b7\u0010u\u001a\u0005\b\u0081\u0001\u00101R%\u0010\"\u001a\u00020\u00042\u0006\u0010\u007f\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\r\n\u0004\b\"\u0010x\u001a\u0005\b\u0082\u0001\u0010\u0006¨\u0006\u0085\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "E", "Lkotlin/collections/f;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "", "getModCount$runtime_release", "()I", "getModCount", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "build", "element", "", "add", "(Ljava/lang/Object;)Z", "", "elements", "addAll", "index", "Lkotlin/j;", "(ILjava/lang/Object;)V", "get", "(I)Ljava/lang/Object;", "removeAt", "removeAll", "Lkotlin/Function1;", "predicate", "removeAllWithPredicate", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "", "listIterator", "rootSize", "size", "tailSize", "", "", "buffer", "isMutable", "([Ljava/lang/Object;)Z", "makeMutable", "([Ljava/lang/Object;)[Ljava/lang/Object;", "distance", "makeMutableShiftingRight", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "mutableBufferWith", "(Ljava/lang/Object;)[Ljava/lang/Object;", "mutableBuffer", "()[Ljava/lang/Object;", "root", "filledTail", "newTail", "pushFilledTail", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "tail", "shift", "pushTail", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "bufferIndex", "", "sourceIterator", "copyToBuffer", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "buffers", "pushBuffersIncreasingHeightIfNeeded", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "buffersIterator", "pushBuffers", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "insertIntoTail", "([Ljava/lang/Object;ILjava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "elementCarry", "insertIntoRoot", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "rightShift", "nullBuffers", "nextBuffer", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "startLeafIndex", "shiftLeafBuffers", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "startBuffer", "startBufferSize", "splitToBuffers", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "bufferFor", "(I)[Ljava/lang/Object;", "removeFromTailAt", "([Ljava/lang/Object;III)Ljava/lang/Object;", "tailCarry", "removeFromRootAt", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "pullLastBufferFromRoot", "([Ljava/lang/Object;II)V", "pullLastBuffer", "retainFirst", "nullifyAfter", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "bufferRef", "removeAllFromTail", "bufferSize", "(Lkj/l;[Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)I", "toBufferSize", "", "recyclableBuffers", "recyclableRemoveAll", "(Lkj/l;[Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;Ljava/util/List;Ljava/util/List;)I", "e", "oldElementCarry", "setInRoot", "", "leafBufferIterator", "vector", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "vectorRoot", "[Ljava/lang/Object;", "vectorTail", "rootShift", "I", "getRootShift$runtime_release", "setRootShift$runtime_release", "(I)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownership", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "<set-?>", "getRoot$runtime_release", "getTail$runtime_release", "getSize", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class PersistentVectorBuilder<E> extends f<E> implements PersistentList.Builder<E> {
    private MutabilityOwnership ownership;
    private Object[] root;
    private int rootShift;
    private int size;
    private Object[] tail;
    private PersistentList<? extends E> vector;
    private Object[] vectorRoot;
    private Object[] vectorTail;

    public PersistentVectorBuilder(PersistentList<? extends E> persistentList, Object[] objArr, Object[] objArr2, int i2) {
        m.h(persistentList, "vector");
        m.h(objArr2, "vectorTail");
        this.vector = persistentList;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i2;
        this.ownership = new MutabilityOwnership();
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final Object[] bufferFor(int index) {
        if (rootSize() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        m.e(objArr);
        for (int i2 = this.rootShift; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(index, i2)];
            m.f(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] copyToBuffer(Object[] buffer, int bufferIndex, Iterator<? extends Object> sourceIterator) {
        while (bufferIndex < 32 && sourceIterator.hasNext()) {
            buffer[bufferIndex] = sourceIterator.next();
            bufferIndex++;
        }
        return buffer;
    }

    private final Object[] insertIntoRoot(Object[] root, int shift, int index, Object element, ObjectRef elementCarry) {
        Object obj;
        int iIndexSegment = UtilsKt.indexSegment(index, shift);
        if (shift == 0) {
            elementCarry.setValue(root[31]);
            Object[] objArrMakeMutable = makeMutable(root);
            n.o0(root, objArrMakeMutable, iIndexSegment + 1, iIndexSegment, 31);
            objArrMakeMutable[iIndexSegment] = element;
            return objArrMakeMutable;
        }
        Object[] objArrMakeMutable2 = makeMutable(root);
        int i2 = shift - 5;
        Object obj2 = objArrMakeMutable2[iIndexSegment];
        m.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrMakeMutable2[iIndexSegment] = insertIntoRoot((Object[]) obj2, i2, index, element, elementCarry);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || (obj = objArrMakeMutable2[iIndexSegment]) == null) {
                break;
            }
            objArrMakeMutable2[iIndexSegment] = insertIntoRoot((Object[]) obj, i2, 0, elementCarry.getValue(), elementCarry);
        }
        return objArrMakeMutable2;
    }

    private final void insertIntoTail(Object[] root, int index, E element) {
        int iTailSize = tailSize();
        Object[] objArrMakeMutable = makeMutable(this.tail);
        if (iTailSize < 32) {
            n.o0(this.tail, objArrMakeMutable, index + 1, index, iTailSize);
            objArrMakeMutable[index] = element;
            this.root = root;
            this.tail = objArrMakeMutable;
            this.size = size() + 1;
            return;
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        n.o0(objArr, objArrMakeMutable, index + 1, index, 31);
        objArrMakeMutable[index] = element;
        pushFilledTail(root, objArrMakeMutable, mutableBufferWith(obj));
    }

    private final boolean isMutable(Object[] buffer) {
        return buffer.length == 33 && buffer[32] == this.ownership;
    }

    private final ListIterator<Object[]> leafBufferIterator(int index) {
        if (this.root == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int iRootSize = rootSize() >> 5;
        ListImplementation.checkPositionIndex$runtime_release(index, iRootSize);
        int i2 = this.rootShift;
        if (i2 == 0) {
            Object[] objArr = this.root;
            m.e(objArr);
            return new SingleElementListIterator(objArr, index);
        }
        Object[] objArr2 = this.root;
        m.e(objArr2);
        return new TrieIterator(objArr2, index, iRootSize, i2 / 5);
    }

    private final Object[] makeMutable(Object[] buffer) {
        if (buffer == null) {
            return mutableBuffer();
        }
        if (isMutable(buffer)) {
            return buffer;
        }
        Object[] objArrMutableBuffer = mutableBuffer();
        int length = buffer.length;
        n.r0(buffer, objArrMutableBuffer, 0, 0, length > 32 ? 32 : length, 6);
        return objArrMutableBuffer;
    }

    private final Object[] makeMutableShiftingRight(Object[] buffer, int distance) {
        if (isMutable(buffer)) {
            n.o0(buffer, buffer, distance, 0, 32 - distance);
            return buffer;
        }
        Object[] objArrMutableBuffer = mutableBuffer();
        n.o0(buffer, objArrMutableBuffer, distance, 0, 32 - distance);
        return objArrMutableBuffer;
    }

    private final Object[] mutableBuffer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] mutableBufferWith(Object element) {
        Object[] objArr = new Object[33];
        objArr[0] = element;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] nullifyAfter(Object[] root, int index, int shift) {
        if (!(shift >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (shift == 0) {
            return root;
        }
        int iIndexSegment = UtilsKt.indexSegment(index, shift);
        Object obj = root[iIndexSegment];
        m.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objNullifyAfter = nullifyAfter((Object[]) obj, index, shift - 5);
        if (iIndexSegment < 31) {
            int i2 = iIndexSegment + 1;
            if (root[i2] != null) {
                if (isMutable(root)) {
                    Arrays.fill(root, i2, 32, (Object) null);
                }
                Object[] objArrMutableBuffer = mutableBuffer();
                n.o0(root, objArrMutableBuffer, 0, 0, i2);
                root = objArrMutableBuffer;
            }
        }
        if (objNullifyAfter == root[iIndexSegment]) {
            return root;
        }
        Object[] objArrMakeMutable = makeMutable(root);
        objArrMakeMutable[iIndexSegment] = objNullifyAfter;
        return objArrMakeMutable;
    }

    private final Object[] pullLastBuffer(Object[] root, int shift, int rootSize, ObjectRef tailCarry) {
        Object[] objArrPullLastBuffer;
        int iIndexSegment = UtilsKt.indexSegment(rootSize - 1, shift);
        if (shift == 5) {
            tailCarry.setValue(root[iIndexSegment]);
            objArrPullLastBuffer = null;
        } else {
            Object obj = root[iIndexSegment];
            m.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrPullLastBuffer = pullLastBuffer((Object[]) obj, shift - 5, rootSize, tailCarry);
        }
        if (objArrPullLastBuffer == null && iIndexSegment == 0) {
            return null;
        }
        Object[] objArrMakeMutable = makeMutable(root);
        objArrMakeMutable[iIndexSegment] = objArrPullLastBuffer;
        return objArrMakeMutable;
    }

    private final void pullLastBufferFromRoot(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            this.root = null;
            if (root == null) {
                root = new Object[0];
            }
            this.tail = root;
            this.size = rootSize;
            this.rootShift = shift;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        m.e(root);
        Object[] objArrPullLastBuffer = pullLastBuffer(root, shift, rootSize, objectRef);
        m.e(objArrPullLastBuffer);
        Object value = objectRef.getValue();
        m.f(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = rootSize;
        if (objArrPullLastBuffer[1] == null) {
            this.root = (Object[]) objArrPullLastBuffer[0];
            this.rootShift = shift - 5;
        } else {
            this.root = objArrPullLastBuffer;
            this.rootShift = shift;
        }
    }

    private final Object[] pushBuffers(Object[] root, int rootSize, int shift, Iterator<Object[]> buffersIterator) {
        if (!buffersIterator.hasNext()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(shift >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (shift == 0) {
            return buffersIterator.next();
        }
        Object[] objArrMakeMutable = makeMutable(root);
        int iIndexSegment = UtilsKt.indexSegment(rootSize, shift);
        int i2 = shift - 5;
        objArrMakeMutable[iIndexSegment] = pushBuffers((Object[]) objArrMakeMutable[iIndexSegment], rootSize, i2, buffersIterator);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || !buffersIterator.hasNext()) {
                break;
            }
            objArrMakeMutable[iIndexSegment] = pushBuffers((Object[]) objArrMakeMutable[iIndexSegment], 0, i2, buffersIterator);
        }
        return objArrMakeMutable;
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] root, int rootSize, Object[][] buffers) {
        a aVarN = bk.f.n(buffers);
        int i2 = rootSize >> 5;
        int i3 = this.rootShift;
        Object[] objArrPushBuffers = i2 < (1 << i3) ? pushBuffers(root, rootSize, i3, aVarN) : makeMutable(root);
        while (aVarN.hasNext()) {
            this.rootShift += 5;
            objArrPushBuffers = mutableBufferWith(objArrPushBuffers);
            int i4 = this.rootShift;
            pushBuffers(objArrPushBuffers, 1 << i4, i4, aVarN);
        }
        return objArrPushBuffers;
    }

    private final void pushFilledTail(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i2 = this.rootShift;
        if (size > (1 << i2)) {
            this.root = pushTail(mutableBufferWith(root), filledTail, this.rootShift + 5);
            this.tail = newTail;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (root == null) {
            this.root = filledTail;
            this.tail = newTail;
            this.size = size() + 1;
        } else {
            this.root = pushTail(root, filledTail, i2);
            this.tail = newTail;
            this.size = size() + 1;
        }
    }

    private final Object[] pushTail(Object[] root, Object[] tail, int shift) {
        int iIndexSegment = UtilsKt.indexSegment(size() - 1, shift);
        Object[] objArrMakeMutable = makeMutable(root);
        if (shift == 5) {
            objArrMakeMutable[iIndexSegment] = tail;
        } else {
            objArrMakeMutable[iIndexSegment] = pushTail((Object[]) objArrMakeMutable[iIndexSegment], tail, shift - 5);
        }
        return objArrMakeMutable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int recyclableRemoveAll(l<? super E, Boolean> predicate, Object[] buffer, int bufferSize, int toBufferSize, ObjectRef bufferRef, List<Object[]> recyclableBuffers, List<Object[]> buffers) {
        if (isMutable(buffer)) {
            recyclableBuffers.add(buffer);
        }
        Object value = bufferRef.getValue();
        m.f(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        Object[] objArrRemove = objArr;
        for (int i2 = 0; i2 < bufferSize; i2++) {
            Object obj = buffer[i2];
            if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                if (toBufferSize == 32) {
                    objArrRemove = recyclableBuffers.isEmpty() ^ true ? recyclableBuffers.remove(recyclableBuffers.size() - 1) : mutableBuffer();
                    toBufferSize = 0;
                }
                objArrRemove[toBufferSize] = obj;
                toBufferSize++;
            }
        }
        bufferRef.setValue(objArrRemove);
        if (objArr != bufferRef.getValue()) {
            buffers.add(objArr);
        }
        return toBufferSize;
    }

    private final int removeAllFromTail(l<? super E, Boolean> lVar, int i2, ObjectRef objectRef) {
        int iRemoveAll = removeAll(lVar, this.tail, i2, objectRef);
        if (iRemoveAll == i2) {
            CommonFunctionsKt.m2459assert(objectRef.getValue() == this.tail);
            return i2;
        }
        Object value = objectRef.getValue();
        m.f(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        Arrays.fill(objArr, iRemoveAll, i2, (Object) null);
        this.tail = objArr;
        this.size = size() - (i2 - iRemoveAll);
        return iRemoveAll;
    }

    private final Object[] removeFromRootAt(Object[] root, int shift, int index, ObjectRef tailCarry) {
        int iIndexSegment = UtilsKt.indexSegment(index, shift);
        if (shift == 0) {
            Object obj = root[iIndexSegment];
            Object[] objArrMakeMutable = makeMutable(root);
            n.o0(root, objArrMakeMutable, iIndexSegment, iIndexSegment + 1, 32);
            objArrMakeMutable[31] = tailCarry.getValue();
            tailCarry.setValue(obj);
            return objArrMakeMutable;
        }
        int iIndexSegment2 = root[31] == null ? UtilsKt.indexSegment(rootSize() - 1, shift) : 31;
        Object[] objArrMakeMutable2 = makeMutable(root);
        int i2 = shift - 5;
        int i3 = iIndexSegment + 1;
        if (i3 <= iIndexSegment2) {
            while (true) {
                Object obj2 = objArrMakeMutable2[iIndexSegment2];
                m.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrMakeMutable2[iIndexSegment2] = removeFromRootAt((Object[]) obj2, i2, 0, tailCarry);
                if (iIndexSegment2 == i3) {
                    break;
                }
                iIndexSegment2--;
            }
        }
        Object obj3 = objArrMakeMutable2[iIndexSegment];
        m.f(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrMakeMutable2[iIndexSegment] = removeFromRootAt((Object[]) obj3, i2, index, tailCarry);
        return objArrMakeMutable2;
    }

    private final Object removeFromTailAt(Object[] root, int rootSize, int shift, int index) {
        int size = size() - rootSize;
        CommonFunctionsKt.m2459assert(index < size);
        if (size == 1) {
            Object obj = this.tail[0];
            pullLastBufferFromRoot(root, rootSize, shift);
            return obj;
        }
        Object[] objArr = this.tail;
        Object obj2 = objArr[index];
        Object[] objArrMakeMutable = makeMutable(objArr);
        n.o0(objArr, objArrMakeMutable, index, index + 1, size);
        objArrMakeMutable[size - 1] = null;
        this.root = root;
        this.tail = objArrMakeMutable;
        this.size = (rootSize + size) - 1;
        this.rootShift = shift;
        return obj2;
    }

    private final Object[] retainFirst(Object[] root, int size) {
        if (!((size & 31) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (size == 0) {
            this.rootShift = 0;
            return null;
        }
        int i2 = size - 1;
        while (true) {
            int i3 = this.rootShift;
            if ((i2 >> i3) != 0) {
                return nullifyAfter(root, i2, i3);
            }
            this.rootShift = i3 - 5;
            Object[] objArr = root[0];
            m.f(objArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            root = objArr;
        }
    }

    private final int rootSize() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.rootSize(size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object[] setInRoot(Object[] root, int shift, int index, E e, ObjectRef oldElementCarry) {
        int iIndexSegment = UtilsKt.indexSegment(index, shift);
        Object[] objArrMakeMutable = makeMutable(root);
        if (shift != 0) {
            Object obj = objArrMakeMutable[iIndexSegment];
            m.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrMakeMutable[iIndexSegment] = setInRoot((Object[]) obj, shift - 5, index, e, oldElementCarry);
            return objArrMakeMutable;
        }
        if (objArrMakeMutable != root) {
            ((AbstractList) this).modCount++;
        }
        oldElementCarry.setValue(objArrMakeMutable[iIndexSegment]);
        objArrMakeMutable[iIndexSegment] = e;
        return objArrMakeMutable;
    }

    private final Object[] shiftLeafBuffers(int startLeafIndex, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        ListIterator<Object[]> listIteratorLeafBufferIterator = leafBufferIterator(rootSize() >> 5);
        while (listIteratorLeafBufferIterator.previousIndex() != startLeafIndex) {
            Object[] objArrPrevious = listIteratorLeafBufferIterator.previous();
            n.o0(objArrPrevious, nextBuffer, 0, 32 - rightShift, 32);
            nextBuffer = makeMutableShiftingRight(objArrPrevious, rightShift);
            nullBuffers--;
            buffers[nullBuffers] = nextBuffer;
        }
        return listIteratorLeafBufferIterator.previous();
    }

    private final void splitToBuffers(Collection<? extends E> elements, int index, Object[] startBuffer, int startBufferSize, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        Object[] objArrMutableBuffer;
        if (!(nullBuffers >= 1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Object[] objArrMakeMutable = makeMutable(startBuffer);
        buffers[0] = objArrMakeMutable;
        int i2 = index & 31;
        int size = ((elements.size() + index) - 1) & 31;
        int i3 = (startBufferSize - i2) + size;
        if (i3 < 32) {
            n.o0(objArrMakeMutable, nextBuffer, size + 1, i2, startBufferSize);
        } else {
            int i4 = (i3 - 32) + 1;
            if (nullBuffers == 1) {
                objArrMutableBuffer = objArrMakeMutable;
            } else {
                objArrMutableBuffer = mutableBuffer();
                nullBuffers--;
                buffers[nullBuffers] = objArrMutableBuffer;
            }
            int i5 = startBufferSize - i4;
            n.o0(objArrMakeMutable, nextBuffer, 0, i5, startBufferSize);
            n.o0(objArrMakeMutable, objArrMutableBuffer, size + 1, i2, i5);
            nextBuffer = objArrMutableBuffer;
        }
        Iterator<? extends E> it = elements.iterator();
        copyToBuffer(objArrMakeMutable, i2, it);
        for (int i6 = 1; i6 < nullBuffers; i6++) {
            buffers[i6] = copyToBuffer(mutableBuffer(), 0, it);
        }
        copyToBuffer(nextBuffer, 0, it);
    }

    private final int tailSize(int size) {
        return size <= 32 ? size : size - UtilsKt.rootSize(size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public boolean add(E element) {
        ((AbstractList) this).modCount++;
        int iTailSize = tailSize();
        if (iTailSize < 32) {
            Object[] objArrMakeMutable = makeMutable(this.tail);
            objArrMakeMutable[iTailSize] = element;
            this.tail = objArrMakeMutable;
            this.size = size() + 1;
        } else {
            pushFilledTail(this.root, this.tail, mutableBufferWith(element));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> elements) {
        m.h(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iTailSize = tailSize();
        Iterator<? extends E> it = elements.iterator();
        if (32 - iTailSize >= elements.size()) {
            this.tail = copyToBuffer(makeMutable(this.tail), iTailSize, it);
            this.size = elements.size() + size();
        } else {
            int size = ((elements.size() + iTailSize) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = copyToBuffer(makeMutable(this.tail), iTailSize, it);
            for (int i2 = 1; i2 < size; i2++) {
                objArr[i2] = copyToBuffer(mutableBuffer(), 0, it);
            }
            this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize(), objArr);
            this.tail = copyToBuffer(mutableBuffer(), 0, it);
            this.size = elements.size() + size();
        }
        return true;
    }

    @Override // java.util.List
    public E get(int index) {
        ListImplementation.checkElementIndex$runtime_release(index, size());
        return (E) bufferFor(index)[index & 31];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getModCount$runtime_release() {
        return ((AbstractList) this).modCount;
    }

    /* JADX INFO: renamed from: getRoot$runtime_release, reason: from getter */
    public final Object[] getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: getRootShift$runtime_release, reason: from getter */
    public final int getRootShift() {
        return this.rootShift;
    }

    public int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: getTail$runtime_release, reason: from getter */
    public final Object[] getTail() {
        return this.tail;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(final Collection<? extends Object> elements) {
        m.h(elements, "elements");
        return removeAllWithPredicate(new l<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.removeAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Boolean m2451invoke(E e) {
                return Boolean.valueOf(elements.contains(e));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean removeAllWithPredicate(l<? super E, Boolean> lVar) {
        m.h(lVar, "predicate");
        boolean zRemoveAll = removeAll(lVar);
        if (zRemoveAll) {
            ((AbstractList) this).modCount++;
        }
        return zRemoveAll;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E removeAt(int index) {
        ListImplementation.checkElementIndex$runtime_release(index, size());
        ((AbstractList) this).modCount++;
        int iRootSize = rootSize();
        if (index >= iRootSize) {
            return (E) removeFromTailAt(this.root, iRootSize, this.rootShift, index - iRootSize);
        }
        ObjectRef objectRef = new ObjectRef(this.tail[0]);
        Object[] objArr = this.root;
        m.e(objArr);
        removeFromTailAt(removeFromRootAt(objArr, this.rootShift, index, objectRef), iRootSize, this.rootShift, 0);
        return (E) objectRef.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public E set(int index, E element) {
        ListImplementation.checkElementIndex$runtime_release(index, size());
        if (rootSize() > index) {
            ObjectRef objectRef = new ObjectRef(null);
            Object[] objArr = this.root;
            m.e(objArr);
            this.root = setInRoot(objArr, this.rootShift, index, element, objectRef);
            return (E) objectRef.getValue();
        }
        Object[] objArrMakeMutable = makeMutable(this.tail);
        if (objArrMakeMutable != this.tail) {
            ((AbstractList) this).modCount++;
        }
        int i2 = index & 31;
        E e = (E) objArrMakeMutable[i2];
        objArrMakeMutable[i2] = element;
        this.tail = objArrMakeMutable;
        return e;
    }

    public final void setRootShift$runtime_release(int i2) {
        this.rootShift = i2;
    }

    private final boolean removeAll(l<? super E, Boolean> lVar) {
        Object[] objArrPushBuffers;
        int iTailSize = tailSize();
        ObjectRef objectRef = new ObjectRef(null);
        if (this.root == null) {
            return removeAllFromTail(lVar, iTailSize, objectRef) != iTailSize;
        }
        ListIterator<Object[]> listIteratorLeafBufferIterator = leafBufferIterator(0);
        int iRemoveAll = 32;
        while (iRemoveAll == 32 && listIteratorLeafBufferIterator.hasNext()) {
            iRemoveAll = removeAll(lVar, listIteratorLeafBufferIterator.next(), 32, objectRef);
        }
        if (iRemoveAll == 32) {
            CommonFunctionsKt.m2459assert(!listIteratorLeafBufferIterator.hasNext());
            int iRemoveAllFromTail = removeAllFromTail(lVar, iTailSize, objectRef);
            if (iRemoveAllFromTail == 0) {
                pullLastBufferFromRoot(this.root, size(), this.rootShift);
            }
            return iRemoveAllFromTail != iTailSize;
        }
        int iPreviousIndex = listIteratorLeafBufferIterator.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iRecyclableRemoveAll = iRemoveAll;
        while (listIteratorLeafBufferIterator.hasNext()) {
            iRecyclableRemoveAll = recyclableRemoveAll(lVar, listIteratorLeafBufferIterator.next(), 32, iRecyclableRemoveAll, objectRef, arrayList2, arrayList);
            iPreviousIndex = iPreviousIndex;
        }
        int i2 = iPreviousIndex;
        int iRecyclableRemoveAll2 = recyclableRemoveAll(lVar, this.tail, iTailSize, iRecyclableRemoveAll, objectRef, arrayList2, arrayList);
        Object value = objectRef.getValue();
        m.f(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        Arrays.fill(objArr, iRecyclableRemoveAll2, 32, (Object) null);
        if (arrayList.isEmpty()) {
            objArrPushBuffers = this.root;
            m.e(objArrPushBuffers);
        } else {
            objArrPushBuffers = pushBuffers(this.root, i2, this.rootShift, arrayList.iterator());
        }
        int size = i2 + (arrayList.size() << 5);
        this.root = retainFirst(objArrPushBuffers, size);
        this.tail = objArr;
        this.size = size + iRecyclableRemoveAll2;
        return true;
    }

    private final int tailSize() {
        return tailSize(size());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    public PersistentList<E> build() {
        PersistentVector persistentVector;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            persistentVector = this.vector;
        } else {
            this.ownership = new MutabilityOwnership();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    persistentVector = UtilsKt.persistentVectorOf();
                } else {
                    Object[] objArrCopyOf = Arrays.copyOf(this.tail, size());
                    m.g(objArrCopyOf, "copyOf(this, newSize)");
                    persistentVector = new SmallPersistentVector(objArrCopyOf);
                }
            } else {
                m.e(objArr);
                persistentVector = new PersistentVector(objArr, this.tail, size(), this.rootShift);
            }
        }
        this.vector = persistentVector;
        return (PersistentList<E>) persistentVector;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int index) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        return new PersistentVectorMutableIterator(this, index);
    }

    private final void insertIntoRoot(Collection<? extends E> elements, int index, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root != null) {
            int i2 = index >> 5;
            Object[] objArrShiftLeafBuffers = shiftLeafBuffers(i2, rightShift, buffers, nullBuffers, nextBuffer);
            int iRootSize = nullBuffers - (((rootSize() >> 5) - 1) - i2);
            if (iRootSize < nullBuffers) {
                nextBuffer = buffers[iRootSize];
                m.e(nextBuffer);
            }
            splitToBuffers(elements, index, objArrShiftLeafBuffers, 32, buffers, iRootSize, nextBuffer);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public void add(int index, E element) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        if (index == size()) {
            add(element);
            return;
        }
        ((AbstractList) this).modCount++;
        int iRootSize = rootSize();
        if (index >= iRootSize) {
            insertIntoTail(this.root, index - iRootSize, element);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        m.e(objArr);
        insertIntoTail(insertIntoRoot(objArr, this.rootShift, index, element, objectRef), 0, objectRef.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        Object[] objArrMutableBuffer;
        m.h(elements, "elements");
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        if (index == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (index >> 5) << 5;
        int size = ((elements.size() + (size() - i2)) - 1) / 32;
        if (size == 0) {
            CommonFunctionsKt.m2459assert(index >= rootSize());
            int i3 = index & 31;
            int size2 = ((elements.size() + index) - 1) & 31;
            Object[] objArr = this.tail;
            Object[] objArrMakeMutable = makeMutable(objArr);
            n.o0(objArr, objArrMakeMutable, size2 + 1, i3, tailSize());
            copyToBuffer(objArrMakeMutable, i3, elements.iterator());
            this.tail = objArrMakeMutable;
            this.size = elements.size() + size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iTailSize = tailSize();
        int iTailSize2 = tailSize(elements.size() + size());
        if (index >= rootSize()) {
            objArrMutableBuffer = mutableBuffer();
            splitToBuffers(elements, index, this.tail, iTailSize, objArr2, size, objArrMutableBuffer);
        } else if (iTailSize2 > iTailSize) {
            int i4 = iTailSize2 - iTailSize;
            objArrMutableBuffer = makeMutableShiftingRight(this.tail, i4);
            insertIntoRoot(elements, index, i4, objArr2, size, objArrMutableBuffer);
        } else {
            Object[] objArr3 = this.tail;
            objArrMutableBuffer = mutableBuffer();
            int i5 = iTailSize - iTailSize2;
            n.o0(objArr3, objArrMutableBuffer, 0, i5, iTailSize);
            int i6 = 32 - i5;
            Object[] objArrMakeMutableShiftingRight = makeMutableShiftingRight(this.tail, i6);
            int i7 = size - 1;
            objArr2[i7] = objArrMakeMutableShiftingRight;
            insertIntoRoot(elements, index, i6, objArr2, i7, objArrMakeMutableShiftingRight);
        }
        this.root = pushBuffersIncreasingHeightIfNeeded(this.root, i2, objArr2);
        this.tail = objArrMutableBuffer;
        this.size = elements.size() + size();
        return true;
    }

    private final int removeAll(l<? super E, Boolean> predicate, Object[] buffer, int bufferSize, ObjectRef bufferRef) {
        Object[] objArrMakeMutable = buffer;
        int i2 = bufferSize;
        boolean z = false;
        for (int i3 = 0; i3 < bufferSize; i3++) {
            Object obj = buffer[i3];
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrMakeMutable = makeMutable(buffer);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrMakeMutable[i2] = obj;
                i2++;
            }
        }
        bufferRef.setValue(objArrMakeMutable);
        return i2;
    }
}
