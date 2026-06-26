package androidx.compose.material3;

import a.f;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.List;
import java.util.NoSuchElementException;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u007f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aµ\u0001\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0019\u001a\u0081\u0001\u0010\u001a\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aæ\u0001\u0010\u001a\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\u0019\b\u0002\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001a\u0010 \u001a\u009b\u0001\u0010!\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0004\b!\u0010\"\u001aÊ\u0001\u0010#\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0004\b#\u0010$\u001a(\u0010*\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0000H\u0002\u001a;\u00104\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0000\u0018\u000100*\u00020+2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0082@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b2\u00103\u001a\u0010\u00105\u001a\u00020&2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a0\u0010;\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0000H\u0002\u001a<\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00002\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0000H\u0002\u001a \u0010@\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0000H\u0002\u001a\\\u0010A\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002\u001ad\u0010J\u001a\u00020\u0005*\u00020\u00052\u0006\u0010C\u001a\u00020B2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u00072\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00000E2\u0012\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0E2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00000H2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a3\u0010M\u001a\u00020\u00032\u0006\u0010C\u001a\u00020B2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u0000H\u0082@ø\u0001\u0001¢\u0006\u0004\bM\u0010N\u001a\u0098\u0001\u0010S\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00000E2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00000E2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00020E2\u001e\u0010R\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030Q0EH\u0002\"\u001d\u0010U\u001a\u00020T8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0017\u0010Y\u001a\u00020T8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bY\u0010V\"\u0017\u0010[\u001a\u00020Z8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b[\u0010\\\"\u0017\u0010]\u001a\u00020T8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b]\u0010V\"\u0017\u0010^\u001a\u00020T8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b^\u0010V\"\u0017\u0010_\u001a\u00020T8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b_\u0010V\"\u001d\u0010`\u001a\u00020T8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b`\u0010V\u001a\u0004\ba\u0010X\"\u0017\u0010b\u001a\u00020T8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bb\u0010V\"\u0017\u0010c\u001a\u00020T8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bc\u0010V\"\u0014\u0010d\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e\"\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006i"}, d2 = {"", "value", "Lkotlin/Function1;", "Lkotlin/j;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lqj/b;", "valueRange", "", "steps", "Lkotlin/Function0;", "onValueChangeFinished", "Landroidx/compose/material3/SliderColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Slider", "(FLkj/l;Landroidx/compose/ui/Modifier;ZLqj/b;ILkj/a;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/SliderPositions;", "Landroidx/compose/runtime/Composable;", "thumb", "track", "(FLkj/l;Landroidx/compose/ui/Modifier;ZLqj/b;Lkj/a;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkj/q;Lkj/q;ILandroidx/compose/runtime/Composer;III)V", "RangeSlider", "(Lqj/b;Lkj/l;Landroidx/compose/ui/Modifier;ZLqj/b;ILkj/a;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V", "startInteractionSource", "endInteractionSource", "startThumb", "endThumb", "(Lqj/b;Lkj/l;Landroidx/compose/ui/Modifier;ZLqj/b;Lkj/a;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkj/q;Lkj/q;Lkj/q;ILandroidx/compose/runtime/Composer;III)V", "SliderImpl", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkj/l;Lkj/a;IFLqj/b;Lkj/q;Lkj/q;Landroidx/compose/runtime/Composer;I)V", "RangeSliderImpl", "(Landroidx/compose/ui/Modifier;Lqj/b;Lkj/l;ZLqj/b;ILkj/a;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkj/q;Lkj/q;Lkj/q;Landroidx/compose/runtime/Composer;III)V", "current", "", "tickFractions", "minPx", "maxPx", "snapValueToTick", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILdj/c;)Ljava/lang/Object;", "awaitSlop", "stepsToTickFractions", "a1", "b1", "x1", "a2", "b2", "scale", "x", "a", "b", "pos", "calcFraction", "sliderSemantics", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "isRtl", "Landroidx/compose/runtime/State;", "rawOffset", "gestureEndAction", "Landroidx/compose/runtime/MutableState;", "pressOffset", "sliderTapModifier", TypedValues.AttributesType.S_TARGET, "velocity", "animateToTarget", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLdj/c;)Ljava/lang/Object;", "rawOffsetStart", "rawOffsetEnd", "Lkotlin/Function2;", "onDrag", "rangeSliderPressDragModifier", "Landroidx/compose/ui/unit/Dp;", "ThumbWidth", "F", "getThumbWidth", "()F", "ThumbHeight", "Landroidx/compose/ui/unit/DpSize;", "ThumbSize", "J", "ThumbDefaultElevation", "ThumbPressedElevation", "TickSize", "TrackHeight", "getTrackHeight", "SliderHeight", "SliderMinWidth", "DefaultSliderConstraints", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/TweenSpec;", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class SliderKt {
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbDefaultElevation;
    private static final float ThumbHeight;
    private static final float ThumbPressedElevation;
    private static final long ThumbSize;
    private static final float ThumbWidth;
    private static final float TickSize;
    private static final float TrackHeight;

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$animateToTarget$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.material3.SliderKt$animateToTarget$2", f = "Slider.kt", l = {1221}, m = "invokeSuspend")
    public static final class C03702 extends SuspendLambda implements p<DragScope, dj.c<? super j>, Object> {
        final /* synthetic */ float $current;
        final /* synthetic */ float $target;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03702(float f, float f2, float f3, dj.c<? super C03702> cVar) {
            super(2, cVar);
            this.$current = f;
            this.$target = f2;
            this.$velocity = f3;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C03702 c03702 = new C03702(this.$current, this.$target, this.$velocity, cVar);
            c03702.L$0 = obj;
            return c03702;
        }

        public final Object invoke(DragScope dragScope, dj.c<? super j> cVar) {
            return create(dragScope, cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                final DragScope dragScope = (DragScope) this.L$0;
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                float f = this.$current;
                floatRef.element = f;
                Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(f, 0.0f, 2, null);
                Float f2 = new Float(this.$target);
                TweenSpec tweenSpec = SliderKt.SliderToTickAnimation;
                Float f3 = new Float(this.$velocity);
                l<Animatable<Float, AnimationVector1D>, j> lVar = new l<Animatable<Float, AnimationVector1D>, j>() { // from class: androidx.compose.material3.SliderKt.animateToTarget.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Animatable<Float, AnimationVector1D>) obj2);
                        return j.a;
                    }

                    public final void invoke(Animatable<Float, AnimationVector1D> animatable) {
                        m.h(animatable, "$this$animateTo");
                        dragScope.dragBy(animatable.getValue().floatValue() - floatRef.element);
                        floatRef.element = animatable.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (animatableAnimatable$default.animateTo(f2, tweenSpec, f3, lVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                li.c.O(obj);
            }
            return j.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1, reason: invalid class name */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", l = {1249}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ State<l<Boolean, j>> $gestureEndAction;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ int $maxPx;
        final /* synthetic */ State<p<Boolean, Float, j>> $onDrag;
        final /* synthetic */ State<Float> $rawOffsetEnd;
        final /* synthetic */ State<Float> $rawOffsetStart;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @ej.c(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", l = {1250}, m = "invokeSuspend")
        public static final class C00861 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ State<l<Boolean, j>> $gestureEndAction;
            final /* synthetic */ boolean $isRtl;
            final /* synthetic */ int $maxPx;
            final /* synthetic */ State<p<Boolean, Float, j>> $onDrag;
            final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            final /* synthetic */ State<Float> $rawOffsetEnd;
            final /* synthetic */ State<Float> $rawOffsetStart;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Slider.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", l = {1251, 1261, 1280}, m = "invokeSuspend")
            public static final class C00871 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ State<l<Boolean, j>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ int $maxPx;
                final /* synthetic */ State<p<Boolean, Float, j>> $onDrag;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                final /* synthetic */ State<Float> $rawOffsetEnd;
                final /* synthetic */ State<Float> $rawOffsetStart;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                int label;

                /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Slider.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                @ej.c(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", l = {1297}, m = "invokeSuspend")
                public static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                    final /* synthetic */ Ref.BooleanRef $draggingStart;
                    final /* synthetic */ DragInteraction $finishInteraction;
                    final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref.BooleanRef booleanRef, DragInteraction dragInteraction, dj.c<? super AnonymousClass2> cVar) {
                        super(2, cVar);
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$draggingStart = booleanRef;
                        this.$finishInteraction = dragInteraction;
                    }

                    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                        return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, cVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            li.c.O(obj);
                            MutableInteractionSource mutableInteractionSourceActiveInteraction = this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element);
                            DragInteraction dragInteraction = this.$finishInteraction;
                            this.label = 1;
                            if (mutableInteractionSourceActiveInteraction.emit(dragInteraction, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            li.c.O(obj);
                        }
                        return j.a;
                    }

                    public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                        return create(coroutineScope, cVar).invokeSuspend(j.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00871(boolean z, int i2, RangeSliderLogic rangeSliderLogic, State<Float> state, CoroutineScope coroutineScope, State<? extends l<? super Boolean, j>> state2, State<Float> state3, State<? extends p<? super Boolean, ? super Float, j>> state4, dj.c<? super C00871> cVar) {
                    super(2, cVar);
                    this.$isRtl = z;
                    this.$maxPx = i2;
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$rawOffsetStart = state;
                    this.$$this$coroutineScope = coroutineScope;
                    this.$gestureEndAction = state2;
                    this.$rawOffsetEnd = state3;
                    this.$onDrag = state4;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    C00871 c00871 = new C00871(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, cVar);
                    c00871.L$0 = obj;
                    return c00871;
                }

                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
                    return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
                }

                /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x017c A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0185 A[Catch: CancellationException -> 0x0191, TryCatch #0 {CancellationException -> 0x0191, blocks: (B:57:0x017d, B:59:0x0185, B:60:0x018b, B:54:0x015d), top: B:67:0x015d }] */
                /* JADX WARN: Removed duplicated region for block: B:60:0x018b A[Catch: CancellationException -> 0x0191, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0191, blocks: (B:57:0x017d, B:59:0x0185, B:60:0x018b, B:54:0x015d), top: B:67:0x015d }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                    /*
                        Method dump skipped, instruction units count: 445
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.AnonymousClass1.C00861.C00871.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00861(PointerInputScope pointerInputScope, boolean z, int i2, RangeSliderLogic rangeSliderLogic, State<Float> state, State<? extends l<? super Boolean, j>> state2, State<Float> state3, State<? extends p<? super Boolean, ? super Float, j>> state4, dj.c<? super C00861> cVar) {
                super(2, cVar);
                this.$$this$pointerInput = pointerInputScope;
                this.$isRtl = z;
                this.$maxPx = i2;
                this.$rangeSliderLogic = rangeSliderLogic;
                this.$rawOffsetStart = state;
                this.$gestureEndAction = state2;
                this.$rawOffsetEnd = state3;
                this.$onDrag = state4;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                C00861 c00861 = new C00861(this.$$this$pointerInput, this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, cVar);
                c00861.L$0 = obj;
                return c00861;
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    li.c.O(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    C00871 c00871 = new C00871(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                    this.label = 1;
                    if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c00871, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    li.c.O(obj);
                }
                return j.a;
            }

            public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                return create(coroutineScope, cVar).invokeSuspend(j.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, State<? extends p<? super Boolean, ? super Float, j>> state3, boolean z, int i2, State<? extends l<? super Boolean, j>> state4, dj.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$startInteractionSource = mutableInteractionSource;
            this.$endInteractionSource = mutableInteractionSource2;
            this.$rawOffsetStart = state;
            this.$rawOffsetEnd = state2;
            this.$onDrag = state3;
            this.$isRtl = z;
            this.$maxPx = i2;
            this.$gestureEndAction = state4;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(PointerInputScope pointerInputScope, dj.c<? super j> cVar) {
            return create(pointerInputScope, cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                C00861 c00861 = new C00861((PointerInputScope) this.L$0, this.$isRtl, this.$maxPx, new RangeSliderLogic(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag), this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(c00861, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                li.c.O(obj);
            }
            return j.a;
        }
    }

    static {
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        float fM2275getHandleWidthD9Ej5fM = sliderTokens.m2275getHandleWidthD9Ej5fM();
        ThumbWidth = fM2275getHandleWidthD9Ej5fM;
        float fM2274getHandleHeightD9Ej5fM = sliderTokens.m2274getHandleHeightD9Ej5fM();
        ThumbHeight = fM2274getHandleHeightD9Ej5fM;
        ThumbSize = DpKt.m5289DpSizeYgX7TsA(fM2275getHandleWidthD9Ej5fM, fM2274getHandleHeightD9Ej5fM);
        ThumbDefaultElevation = Dp.m5267constructorimpl(1);
        ThumbPressedElevation = Dp.m5267constructorimpl(6);
        TickSize = sliderTokens.m2281getTickMarksContainerSizeD9Ej5fM();
        TrackHeight = sliderTokens.m2276getInactiveTrackHeightD9Ej5fM();
        float fM5267constructorimpl = Dp.m5267constructorimpl(48);
        SliderHeight = fM5267constructorimpl;
        float fM5267constructorimpl2 = Dp.m5267constructorimpl(144);
        SliderMinWidth = fM5267constructorimpl2;
        DefaultSliderConstraints = SizeKt.m492heightInVpY3zN4$default(SizeKt.m511widthInVpY3zN4$default(Modifier.INSTANCE, fM5267constructorimpl2, 0.0f, 2, null), 0.0f, fM5267constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(final qj.b<java.lang.Float> r44, final kj.l<? super qj.b<java.lang.Float>, kotlin.j> r45, androidx.compose.ui.Modifier r46, boolean r47, qj.b<java.lang.Float> r48, int r49, kj.a<kotlin.j> r50, androidx.compose.material3.SliderColors r51, androidx.compose.runtime.Composer r52, final int r53, final int r54) {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(qj.b, kj.l, androidx.compose.ui.Modifier, boolean, qj.b, int, kj.a, androidx.compose.material3.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSliderImpl(final androidx.compose.ui.Modifier r35, final qj.b<java.lang.Float> r36, final kj.l<? super qj.b<java.lang.Float>, kotlin.j> r37, final boolean r38, final qj.b<java.lang.Float> r39, int r40, final kj.a<kotlin.j> r41, final androidx.compose.foundation.interaction.MutableInteractionSource r42, final androidx.compose.foundation.interaction.MutableInteractionSource r43, final kj.q<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r44, final kj.q<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r45, final kj.q<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r46, androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instruction units count: 2020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSliderImpl(androidx.compose.ui.Modifier, qj.b, kj.l, boolean, qj.b, int, kj.a, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource, kj.q, kj.q, kj.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RangeSliderImpl$lambda$25(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RangeSliderImpl$lambda$26(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RangeSliderImpl$lambda$28(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RangeSliderImpl$lambda$29(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RangeSliderImpl$lambda$31(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RangeSliderImpl$lambda$32(MutableState<Integer> mutableState, int i2) {
        mutableState.setValue(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RangeSliderImpl$scaleToOffset$34(qj.b<Float> bVar, float f, float f2, float f3) {
        return scale(((Number) bVar.getStart()).floatValue(), ((Number) bVar.getEndInclusive()).floatValue(), f3, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qj.b<Float> RangeSliderImpl$scaleToUserValue$33(qj.b<Float> bVar, float f, float f2, qj.b<Float> bVar2) {
        return scale(f, f2, bVar2, ((Number) bVar.getStart()).floatValue(), ((Number) bVar.getEndInclusive()).floatValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(final float r43, final kj.l<? super java.lang.Float, kotlin.j> r44, androidx.compose.ui.Modifier r45, boolean r46, qj.b<java.lang.Float> r47, int r48, kj.a<kotlin.j> r49, androidx.compose.material3.SliderColors r50, androidx.compose.foundation.interaction.MutableInteractionSource r51, androidx.compose.runtime.Composer r52, final int r53, final int r54) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, kj.l, androidx.compose.ui.Modifier, boolean, qj.b, int, kj.a, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SliderImpl(final Modifier modifier, final boolean z, final MutableInteractionSource mutableInteractionSource, final l<? super Float, j> lVar, final kj.a<j> aVar, final int i2, final float f, final qj.b<Float> bVar, final q<? super SliderPositions, ? super Composer, ? super Integer, j> qVar, final q<? super SliderPositions, ? super Composer, ? super Integer, j> qVar2, Composer composer, final int i3) {
        int i4;
        int i5;
        boolean z2;
        SnapshotMutationPolicy snapshotMutationPolicy;
        float f2;
        SliderPositions sliderPositions;
        int i6;
        MutableState mutableState;
        MutableState mutableState2;
        Composer composer2;
        float f3;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(851260148);
        if ((i3 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i3 & 7168) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(lVar) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((57344 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(aVar) ? 16384 : 8192;
        }
        if ((458752 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 131072 : 65536;
        }
        if ((3670016 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
        }
        if ((29360128 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(bVar) ? 8388608 : 4194304;
        }
        if ((234881024 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(qVar) ? 67108864 : 33554432;
        }
        if ((1879048192 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(qVar2) ? 536870912 : 268435456;
        }
        int i7 = i4;
        if ((1533916891 & i7) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(851260148, i7, -1, "androidx.compose.material3.SliderImpl (Slider.kt:481)");
            }
            Float fValueOf = Float.valueOf(f);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(fValueOf) | composerStartRestartGroup.changed(lVar);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new l<Float, j>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$onValueChangeState$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Number) obj).floatValue());
                        return j.a;
                    }

                    public final void invoke(float f4) {
                        if (f4 == f) {
                            return;
                        }
                        lVar.invoke(Float.valueOf(f4));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(objRememberedValue, composerStartRestartGroup, 0);
            Integer numValueOf = Integer.valueOf(i2);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(numValueOf);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = stepsToTickFractions(i2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final float[] fArr = (float[]) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(getThumbWidth()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableState3 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableState4 = (MutableState) objRememberedValue4;
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z2 = true;
                i5 = -492369756;
            } else {
                i5 = -492369756;
                z2 = false;
            }
            boolean z3 = z2;
            composerStartRestartGroup.startReplaceableGroup(i5);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                snapshotMutationPolicy = null;
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(SliderImpl$scaleToOffset(bVar, 0.0f, 0.0f, f)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                snapshotMutationPolicy = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableState5 = (MutableState) objRememberedValue5;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableState6 = (MutableState) objRememberedValue6;
            float fCalcFraction = calcFraction(((Number) bVar.getStart()).floatValue(), ((Number) bVar.getEndInclusive()).floatValue(), a.l.h(f, ((Number) bVar.getStart()).floatValue(), ((Number) bVar.getEndInclusive()).floatValue()));
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                f2 = 0.0f;
                objRememberedValue7 = new SliderPositions(new qj.a(0.0f, fCalcFraction), fArr);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                f2 = 0.0f;
            }
            composerStartRestartGroup.endReplaceableGroup();
            SliderPositions sliderPositions2 = (SliderPositions) objRememberedValue7;
            sliderPositions2.setActiveRange$material3_release(new qj.a(f2, fCalcFraction));
            sliderPositions2.setTickFractions$material3_release(fArr);
            int i8 = i7 >> 21;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(bVar);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue8 == companion.getEmpty()) {
                sliderPositions = sliderPositions2;
                i6 = i7;
                mutableState = mutableState3;
                mutableState2 = mutableState4;
                composer2 = composerStartRestartGroup;
                f3 = fCalcFraction;
                objRememberedValue8 = new SliderDraggableState(new l<Float, j>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$draggableState$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Number) obj).floatValue());
                        return j.a;
                    }

                    public final void invoke(float f4) {
                        float f5 = 2;
                        float fMax = Math.max(mutableState4.getValue().floatValue() - (mutableState3.getValue().floatValue() / f5), 0.0f);
                        float fMin = Math.min(mutableState3.getValue().floatValue() / f5, fMax);
                        MutableState<Float> mutableState7 = mutableState5;
                        mutableState7.setValue(Float.valueOf(mutableState6.getValue().floatValue() + mutableState7.getValue().floatValue() + f4));
                        mutableState6.setValue(Float.valueOf(0.0f));
                        stateRememberUpdatedState.getValue().invoke(Float.valueOf(SliderKt.SliderImpl$scaleToUserValue(bVar, fMin, fMax, SliderKt.snapValueToTick(mutableState5.getValue().floatValue(), fArr, fMin, fMax))));
                    }
                });
                composer2.updateRememberedValue(objRememberedValue8);
            } else {
                sliderPositions = sliderPositions2;
                i6 = i7;
                mutableState = mutableState3;
                mutableState2 = mutableState4;
                composer2 = composerStartRestartGroup;
                f3 = fCalcFraction;
            }
            composer2.endReplaceableGroup();
            final SliderDraggableState sliderDraggableState = (SliderDraggableState) objRememberedValue8;
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(new kj.a<j>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$gestureEndAction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m1496invoke();
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m1496invoke() {
                    kj.a<j> aVar2;
                    if (sliderDraggableState.isDragging() || (aVar2 = aVar) == null) {
                        return;
                    }
                    aVar2.invoke();
                }
            }, composer2, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierSliderTapModifier = sliderTapModifier(companion2, sliderDraggableState, mutableInteractionSource, ((Number) mutableState2.getValue()).intValue(), z3, mutableState5, stateRememberUpdatedState2, mutableState6, z);
            Orientation orientation = Orientation.Horizontal;
            boolean zIsDragging = sliderDraggableState.isDragging();
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged4 = composer2.changed(stateRememberUpdatedState2);
            Object objRememberedValue9 = composer2.rememberedValue();
            if (zChanged4 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new SliderKt$SliderImpl$drag$1$1(stateRememberUpdatedState2, null);
                composer2.updateRememberedValue(objRememberedValue9);
            }
            composer2.endReplaceableGroup();
            composer3 = composer2;
            Modifier modifierDraggable = DraggableKt.draggable(companion2, sliderDraggableState, orientation, (32 & 4) != 0 ? true : z, (32 & 8) != 0 ? null : mutableInteractionSource, (32 & 16) != 0 ? false : zIsDragging, (32 & 32) != 0 ? new DraggableKt.C01801(null) : null, (32 & 64) != 0 ? new DraggableKt.AnonymousClass2(null) : (q) objRememberedValue9, (32 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? false : z3);
            Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier);
            SliderTokens sliderTokens = SliderTokens.INSTANCE;
            Modifier modifierThen = FocusableKt.focusable(sliderSemantics(SizeKt.m500requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize, sliderTokens.m2275getHandleWidthD9Ej5fM(), sliderTokens.m2274getHandleHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), f, z, lVar, aVar, bVar, i2), z, mutableInteractionSource).then(modifierSliderTapModifier).then(modifierDraggable);
            final MutableState mutableState7 = mutableState2;
            final MutableState mutableState8 = mutableState;
            final float f4 = f3;
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt.SliderImpl.2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i9) {
                    return e.a(this, intrinsicMeasureScope, list, i9);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i9) {
                    return e.b(this, intrinsicMeasureScope, list, i9);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo34measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                    m.h(measureScope, "$this$Layout");
                    m.h(list, "measurables");
                    List<? extends Measurable> list2 = list;
                    for (Measurable measurable : list2) {
                        if (LayoutIdKt.getLayoutId(measurable) == SliderComponents.THUMB) {
                            final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(j);
                            for (Measurable measurable2 : list2) {
                                if (LayoutIdKt.getLayoutId(measurable2) == SliderComponents.TRACK) {
                                    final Placeable placeableMo4235measureBRTryo02 = measurable2.mo4235measureBRTryo0(Constraints.m5226copyZbe2FdA$default(ConstraintsKt.m5252offsetNN6EwU$default(j, -placeableMo4235measureBRTryo0.getWidth(), 0, 2, null), 0, 0, 0, 0, 11, null));
                                    int width = placeableMo4235measureBRTryo02.getWidth() + placeableMo4235measureBRTryo0.getWidth();
                                    int iMax = Math.max(placeableMo4235measureBRTryo02.getHeight(), placeableMo4235measureBRTryo0.getHeight());
                                    mutableState8.setValue(Float.valueOf(placeableMo4235measureBRTryo0.getWidth()));
                                    mutableState7.setValue(Integer.valueOf(width));
                                    final int width2 = placeableMo4235measureBRTryo0.getWidth() / 2;
                                    final int iF0 = f.f0(placeableMo4235measureBRTryo02.getWidth() * f4);
                                    final int iA = s.a(placeableMo4235measureBRTryo02, iMax, 2);
                                    final int iA2 = s.a(placeableMo4235measureBRTryo0, iMax, 2);
                                    return MeasureScope.CC.p(measureScope, width, iMax, null, new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2$measure$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((Placeable.PlacementScope) obj);
                                            return j.a;
                                        }

                                        public final void invoke(Placeable.PlacementScope placementScope) {
                                            m.h(placementScope, "$this$layout");
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo4235measureBRTryo02, width2, iA, 0.0f, 4, null);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo4235measureBRTryo0, iF0, iA2, 0.0f, 4, null);
                                        }
                                    }, 4, null);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i9) {
                    return e.c(this, intrinsicMeasureScope, list, i9);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i9) {
                    return e.d(this, intrinsicMeasureScope, list, i9);
                }
            };
            Density density = (Density) v.d(composer3, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierThen);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composer3);
            Updater.m2444setimpl(composerM2437constructorimpl, measurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2444setimpl(composerM2437constructorimpl, density, companion3.getSetDensity());
            Updater.m2444setimpl(composerM2437constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m2444setimpl(composerM2437constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, SkippableUpdater.m2425boximpl(SkippableUpdater.m2426constructorimpl(composer3)), composer3, 2058660585);
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion2, SliderComponents.THUMB);
            composer3.startReplaceableGroup(733328855);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyB = android.support.v4.media.a.b(companion4, false, composer3, 0, -1323940314);
            Density density2 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
            kj.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf2 = LayoutKt.materializerOf(modifierLayoutId);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            composer3.disableReusing();
            Composer composerM2437constructorimpl2 = Updater.m2437constructorimpl(composer3);
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf2, androidx.appcompat.app.m.d(companion3, composerM2437constructorimpl2, measurePolicyB, composerM2437constructorimpl2, density2, composerM2437constructorimpl2, layoutDirection2, composerM2437constructorimpl2, viewConfiguration2, composer3, composer3), composer3, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            SliderPositions sliderPositions3 = sliderPositions;
            qVar.invoke(sliderPositions3, composer3, Integer.valueOf((i8 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion2, SliderComponents.TRACK);
            composer3.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyB2 = android.support.v4.media.a.b(companion4, false, composer3, 0, -1323940314);
            Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
            kj.a<ComposeUiNode> constructor3 = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf3 = LayoutKt.materializerOf(modifierLayoutId2);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor3);
            } else {
                composer3.useNode();
            }
            composer3.disableReusing();
            Composer composerM2437constructorimpl3 = Updater.m2437constructorimpl(composer3);
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf3, androidx.appcompat.app.m.d(companion3, composerM2437constructorimpl3, measurePolicyB2, composerM2437constructorimpl3, density3, composerM2437constructorimpl3, layoutDirection3, composerM2437constructorimpl3, viewConfiguration3, composer3, composer3), composer3, 2058660585);
            qVar2.invoke(sliderPositions3, composer3, Integer.valueOf(((i6 >> 24) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.SliderKt.SliderImpl.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer4, int i9) {
                SliderKt.SliderImpl(modifier, z, mutableInteractionSource, lVar, aVar, i2, f, bVar, qVar, qVar2, composer4, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SliderImpl$scaleToOffset(qj.b<Float> bVar, float f, float f2, float f3) {
        return scale(((Number) bVar.getStart()).floatValue(), ((Number) bVar.getEndInclusive()).floatValue(), f3, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SliderImpl$scaleToUserValue(qj.b<Float> bVar, float f, float f2, float f3) {
        return scale(f, f2, f3, ((Number) bVar.getStart()).floatValue(), ((Number) bVar.getEndInclusive()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f, float f2, float f3, dj.c<? super j> cVar) {
        Object objA = androidx.compose.foundation.gestures.a.a(draggableState, null, new C03702(f, f2, f3, null), cVar, 1, null);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : j.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1495awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, dj.c<? super kotlin.Pair<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float>> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material3.SliderKt$awaitSlop$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = (androidx.compose.material3.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = new androidx.compose.material3.SliderKt$awaitSlop$1
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref.FloatRef) r8
            li.c.O(r12)
            goto L52
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            li.c.O(r12)
            kotlin.jvm.internal.Ref$FloatRef r12 = new kotlin.jvm.internal.Ref$FloatRef
            r12.<init>()
            androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>()
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material3.DragGestureDetectorCopyKt.m1262awaitHorizontalPointerSlopOrCancellationgDDlDlE(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L4f
            return r0
        L4f:
            r7 = r12
            r12 = r8
            r8 = r7
        L52:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L63
            float r8 = r8.element
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r8)
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r12, r9)
            goto L64
        L63:
            r8 = 0
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m1495awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, dj.c):java.lang.Object");
    }

    private static final float calcFraction(float f, float f2, float f3) {
        float f4 = f2 - f;
        return a.l.h((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    public static final float getThumbWidth() {
        return ThumbWidth;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    private static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, boolean z, boolean z2, int i2, qj.b<Float> bVar, State<? extends l<? super Boolean, j>> state3, State<? extends p<? super Boolean, ? super Float, j>> state4) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Integer.valueOf(i2), Boolean.valueOf(z2), bVar}, (p<? super PointerInputScope, ? super dj.c<? super j>, ? extends Object>) new AnonymousClass1(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z2, i2, state3, null)) : modifier;
    }

    private static final float scale(float f, float f2, float f3, float f4, float f5) {
        return MathHelpersKt.lerp(f4, f5, calcFraction(f, f2, f3));
    }

    private static final Modifier sliderSemantics(Modifier modifier, float f, final boolean z, final l<? super Float, j> lVar, final kj.a<j> aVar, final qj.b<Float> bVar, final int i2) {
        final float fH = a.l.h(f, ((Number) bVar.getStart()).floatValue(), ((Number) bVar.getEndInclusive()).floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.SliderKt.sliderSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return j.a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                m.h(semanticsPropertyReceiver, "$this$semantics");
                if (!z) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                final qj.b<Float> bVar2 = bVar;
                final int i3 = i2;
                final float f2 = fH;
                final l<Float, j> lVar2 = lVar;
                final kj.a<j> aVar2 = aVar;
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new l<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt.sliderSemantics.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).floatValue());
                    }

                    public final Boolean invoke(float f3) {
                        int i4;
                        float fH2 = a.l.h(f3, ((Number) bVar2.getStart()).floatValue(), ((Number) bVar2.getEndInclusive()).floatValue());
                        int i5 = i3;
                        boolean z2 = false;
                        if (i5 > 0 && (i4 = i5 + 1) >= 0) {
                            float fAbs = fH2;
                            float f4 = fAbs;
                            int i6 = 0;
                            while (true) {
                                float fLerp = MathHelpersKt.lerp(((Number) bVar2.getStart()).floatValue(), ((Number) bVar2.getEndInclusive()).floatValue(), i6 / (i3 + 1));
                                float f5 = fLerp - fH2;
                                if (Math.abs(f5) <= fAbs) {
                                    fAbs = Math.abs(f5);
                                    f4 = fLerp;
                                }
                                if (i6 == i4) {
                                    break;
                                }
                                i6++;
                            }
                            fH2 = f4;
                        }
                        if (!(fH2 == f2)) {
                            lVar2.invoke(Float.valueOf(fH2));
                            kj.a<j> aVar3 = aVar2;
                            if (aVar3 != null) {
                                aVar3.invoke();
                            }
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, 1, null);
            }
        }, 1, null), f, bVar, i2);
    }

    public static Modifier sliderSemantics$default(Modifier modifier, float f, boolean z, l lVar, kj.a aVar, qj.b bVar, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            aVar = null;
        }
        kj.a aVar2 = aVar;
        if ((i3 & 16) != 0) {
            bVar = new qj.a(0.0f, 1.0f);
        }
        qj.b bVar2 = bVar;
        if ((i3 & 32) != 0) {
            i2 = 0;
        }
        return sliderSemantics(modifier, f, z, lVar, aVar2, bVar2, i2);
    }

    private static final Modifier sliderTapModifier(Modifier modifier, final DraggableState draggableState, final MutableInteractionSource mutableInteractionSource, final int i2, final boolean z, final State<Float> state, final State<? extends kj.a<j>> state2, final MutableState<Float> mutableState, final boolean z2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.material3.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "sliderTapModifier").set("draggableState", draggableState);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("maxPx", Integer.valueOf(i2));
                androidx.compose.animation.b.c(z, inspectorInfo.getProperties(), "isRtl", inspectorInfo).set("rawOffset", state);
                inspectorInfo.getProperties().set("gestureEndAction", state2);
                inspectorInfo.getProperties().set("pressOffset", mutableState);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.SliderKt.sliderTapModifier.2

            /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: Slider.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
            @ej.c(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1", f = "Slider.kt", l = {1176}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
                final /* synthetic */ DraggableState $draggableState;
                final /* synthetic */ State<kj.a<j>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ int $maxPx;
                final /* synthetic */ MutableState<Float> $pressOffset;
                final /* synthetic */ State<Float> $rawOffset;
                final /* synthetic */ CoroutineScope $scope;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: Slider.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                @ej.c(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", l = {1181}, m = "invokeSuspend")
                public static final class C00891 extends SuspendLambda implements q<PressGestureScope, Offset, dj.c<? super j>, Object> {
                    final /* synthetic */ boolean $isRtl;
                    final /* synthetic */ int $maxPx;
                    final /* synthetic */ MutableState<Float> $pressOffset;
                    final /* synthetic */ State<Float> $rawOffset;
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00891(boolean z, int i2, MutableState<Float> mutableState, State<Float> state, dj.c<? super C00891> cVar) {
                        super(3, cVar);
                        this.$isRtl = z;
                        this.$maxPx = i2;
                        this.$pressOffset = mutableState;
                        this.$rawOffset = state;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return m1497invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).getPackedValue(), (dj.c) obj3);
                    }

                    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
                    public final Object m1497invoked4ec7I(PressGestureScope pressGestureScope, long j, dj.c<? super j> cVar) {
                        C00891 c00891 = new C00891(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, cVar);
                        c00891.L$0 = pressGestureScope;
                        c00891.J$0 = j;
                        return c00891.invokeSuspend(j.a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        try {
                            if (i2 == 0) {
                                li.c.O(obj);
                                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                                long j = this.J$0;
                                this.$pressOffset.setValue(new Float((this.$isRtl ? this.$maxPx - Offset.m2585getXimpl(j) : Offset.m2585getXimpl(j)) - this.$rawOffset.getValue().floatValue()));
                                this.label = 1;
                                if (pressGestureScope.awaitRelease(this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                li.c.O(obj);
                            }
                        } catch (GestureCancellationException unused) {
                            this.$pressOffset.setValue(new Float(0.0f));
                        }
                        return j.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(boolean z, int i2, MutableState<Float> mutableState, State<Float> state, CoroutineScope coroutineScope, DraggableState draggableState, State<? extends kj.a<j>> state2, dj.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$isRtl = z;
                    this.$maxPx = i2;
                    this.$pressOffset = mutableState;
                    this.$rawOffset = state;
                    this.$scope = coroutineScope;
                    this.$draggableState = draggableState;
                    this.$gestureEndAction = state2;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, this.$scope, this.$draggableState, this.$gestureEndAction, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                public final Object invoke(PointerInputScope pointerInputScope, dj.c<? super j> cVar) {
                    return create(pointerInputScope, cVar).invokeSuspend(j.a);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        li.c.O(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C00891 c00891 = new C00891(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, null);
                        final CoroutineScope coroutineScope = this.$scope;
                        final DraggableState draggableState = this.$draggableState;
                        final State<kj.a<j>> state = this.$gestureEndAction;
                        l<Offset, j> lVar = new l<Offset, j>() { // from class: androidx.compose.material3.SliderKt.sliderTapModifier.2.1.2

                            /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1, reason: invalid class name and collision with other inner class name */
                            /* JADX INFO: compiled from: Slider.kt */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                            @ej.c(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1", f = "Slider.kt", l = {1188}, m = "invokeSuspend")
                            public static final class C00911 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                                final /* synthetic */ DraggableState $draggableState;
                                final /* synthetic */ State<kj.a<j>> $gestureEndAction;
                                int label;

                                /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1$1, reason: invalid class name and collision with other inner class name */
                                /* JADX INFO: compiled from: Slider.kt */
                                @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                                @ej.c(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
                                public static final class C00921 extends SuspendLambda implements p<DragScope, dj.c<? super j>, Object> {
                                    private /* synthetic */ Object L$0;
                                    int label;

                                    public C00921(dj.c<? super C00921> cVar) {
                                        super(2, cVar);
                                    }

                                    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                                        C00921 c00921 = new C00921(cVar);
                                        c00921.L$0 = obj;
                                        return c00921;
                                    }

                                    public final Object invoke(DragScope dragScope, dj.c<? super j> cVar) {
                                        return create(dragScope, cVar).invokeSuspend(j.a);
                                    }

                                    public final Object invokeSuspend(Object obj) {
                                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        if (this.label != 0) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        li.c.O(obj);
                                        ((DragScope) this.L$0).dragBy(0.0f);
                                        return j.a;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C00911(DraggableState draggableState, State<? extends kj.a<j>> state, dj.c<? super C00911> cVar) {
                                    super(2, cVar);
                                    this.$draggableState = draggableState;
                                    this.$gestureEndAction = state;
                                }

                                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                                    return new C00911(this.$draggableState, this.$gestureEndAction, cVar);
                                }

                                public final Object invokeSuspend(Object obj) {
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    int i2 = this.label;
                                    if (i2 == 0) {
                                        li.c.O(obj);
                                        DraggableState draggableState = this.$draggableState;
                                        MutatePriority mutatePriority = MutatePriority.UserInput;
                                        C00921 c00921 = new C00921(null);
                                        this.label = 1;
                                        if (draggableState.drag(mutatePriority, c00921, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        li.c.O(obj);
                                    }
                                    this.$gestureEndAction.getValue().invoke();
                                    return j.a;
                                }

                                public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                                    return create(coroutineScope, cVar).invokeSuspend(j.a);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m1498invokek4lQ0M(((Offset) obj2).getPackedValue());
                                return j.a;
                            }

                            /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m1498invokek4lQ0M(long j) {
                                BuildersKt.launch$default(coroutineScope, (dj.e) null, (CoroutineStart) null, new C00911(draggableState, state, null), 3, (Object) null);
                            }
                        };
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c00891, lVar, this, 3, null) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        li.c.O(obj);
                    }
                    return j.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i3) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, 2040469710)) {
                    ComposerKt.traceEventStart(2040469710, i3, -1, "androidx.compose.material3.sliderTapModifier.<anonymous> (Slider.kt:1171)");
                }
                if (z2) {
                    Object objD = s.d(composer, 773894976, -492369756);
                    if (objD == Composer.INSTANCE.getEmpty()) {
                        objD = androidx.appcompat.view.menu.a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
                    }
                    composer.endReplaceableGroup();
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objD).getCoroutineScope();
                    composer.endReplaceableGroup();
                    modifier2 = SuspendingPointerInputFilterKt.pointerInput(modifier2, new Object[]{draggableState, mutableInteractionSource, Integer.valueOf(i2), Boolean.valueOf(z)}, (p<? super PointerInputScope, ? super dj.c<? super j>, ? extends Object>) new AnonymousClass1(z, i2, mutableState, state, coroutineScope, draggableState, state2, null));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifier2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f, float[] fArr, float f2, float f3) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f4 = fArr[0];
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f4);
            } else {
                float fAbs = Math.abs(MathHelpersKt.lerp(f2, f3, f4) - f);
                qj.e eVarD = new qj.f(1, length).d();
                while (eVarD.c) {
                    float f5 = fArr[eVarD.nextInt()];
                    float fAbs2 = Math.abs(MathHelpersKt.lerp(f2, f3, f5) - f);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f4 = f5;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f4);
            }
        }
        return fValueOf != null ? MathHelpersKt.lerp(f2, f3, fValueOf.floatValue()) : f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] stepsToTickFractions(int i2) {
        if (i2 == 0) {
            return new float[0];
        }
        int i3 = i2 + 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr[i4] = i4 / (i2 + 1);
        }
        return fArr;
    }

    private static final qj.b<Float> scale(float f, float f2, qj.b<Float> bVar, float f3, float f4) {
        return new qj.a(scale(f, f2, ((Number) bVar.getStart()).floatValue(), f3, f4), scale(f, f2, ((Number) bVar.getEndInclusive()).floatValue(), f3, f4));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(final float r46, final kj.l<? super java.lang.Float, kotlin.j> r47, androidx.compose.ui.Modifier r48, boolean r49, qj.b<java.lang.Float> r50, kj.a<kotlin.j> r51, androidx.compose.material3.SliderColors r52, androidx.compose.foundation.interaction.MutableInteractionSource r53, kj.q<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r54, kj.q<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r55, int r56, androidx.compose.runtime.Composer r57, final int r58, final int r59, final int r60) {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, kj.l, androidx.compose.ui.Modifier, boolean, qj.b, kj.a, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, kj.q, kj.q, int, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(final qj.b<java.lang.Float> r47, final kj.l<? super qj.b<java.lang.Float>, kotlin.j> r48, androidx.compose.ui.Modifier r49, boolean r50, qj.b<java.lang.Float> r51, kj.a<kotlin.j> r52, androidx.compose.material3.SliderColors r53, androidx.compose.foundation.interaction.MutableInteractionSource r54, androidx.compose.foundation.interaction.MutableInteractionSource r55, kj.q<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r56, kj.q<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r57, kj.q<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r58, int r59, androidx.compose.runtime.Composer r60, final int r61, final int r62, final int r63) {
        /*
            Method dump skipped, instruction units count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(qj.b, kj.l, androidx.compose.ui.Modifier, boolean, qj.b, kj.a, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource, kj.q, kj.q, kj.q, int, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
