package androidx.compose.material3;

import a.f;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.Selection;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0006\u001a;\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0018\u0010\u0017\u001a'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001d\u0010\u001c\u001a\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001e\u0010\u001c\u001a'\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010!\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b!\u0010 \u001a?\u0010'\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0003¢\u0006\u0004\b'\u0010(\u001aN\u00101\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0+2\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0-¢\u0006\u0002\b/H\u0003¢\u0006\u0004\b1\u00102\u001a\u0017\u00103\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b3\u00104\u001a=\u0010:\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109\u001a'\u0010;\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0001¢\u0006\u0004\b;\u0010<\u001a\u001c\u0010=\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u001c\u0010>\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0002\u001a'\u0010?\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0003¢\u0006\u0004\b?\u0010@\u001aQ\u0010G\u001a\u00020\b2\u0006\u00107\u001a\u0002062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00105\u001a\u00020A2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u000e2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0-H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010F\u001ae\u0010O\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00105\u001a\u00020A2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0-2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\b\b\u0002\u0010J\u001a\u00020I2\b\b\u0002\u0010L\u001a\u00020K2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010N\u001a:\u0010T\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020P2\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\b0+¢\u0006\u0002\b/H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bR\u0010S\u001a-\u0010Y\u001a\u00020V2\u0006\u00107\u001a\u0002062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\u000eH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bW\u0010X\u001a$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020Z0]2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020ZH\u0002\u001a(\u0010c\u001a\u00020Z2\u0006\u0010_\u001a\u00020Z2\u0006\u0010`\u001a\u00020Z2\u0006\u0010a\u001a\u00020\u000e2\u0006\u0010b\u001a\u00020\u000eH\u0002\u001a\u0018\u0010f\u001a\u00020Z2\u0006\u0010d\u001a\u00020Z2\u0006\u0010e\u001a\u00020ZH\u0002\u001a\u0014\u0010g\u001a\u00020\u0002*\u00020\u00022\u0006\u0010g\u001a\u00020\u0011H\u0003\u001a\u0014\u0010i\u001a\u00020V*\u00020\u000e2\u0006\u0010h\u001a\u00020\u000eH\u0002\"\u0014\u0010j\u001a\u00020Z8\u0002X\u0082T¢\u0006\u0006\n\u0004\bj\u0010k\"\u0014\u0010m\u001a\u00020l8\u0002X\u0082T¢\u0006\u0006\n\u0004\bm\u0010n\"\u0014\u0010o\u001a\u00020Z8\u0002X\u0082T¢\u0006\u0006\n\u0004\bo\u0010k\"\u0014\u0010p\u001a\u00020Z8\u0002X\u0082T¢\u0006\u0006\n\u0004\bp\u0010k\"\u0014\u0010q\u001a\u00020Z8\u0002X\u0082T¢\u0006\u0006\n\u0004\bq\u0010k\"\u0017\u0010r\u001a\u00020P8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\br\u0010k\"\u0017\u0010s\u001a\u00020P8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bs\u0010k\"\u0017\u0010t\u001a\u00020P8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bt\u0010k\"\u0017\u0010u\u001a\u00020P8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bu\u0010k\"\u0017\u0010v\u001a\u00020P8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bv\u0010k\"\u0017\u0010w\u001a\u00020P8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bw\u0010k\"\u0017\u0010x\u001a\u00020P8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bx\u0010k\"\u0017\u0010y\u001a\u00020P8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\by\u0010k\"\u0017\u0010z\u001a\u00020P8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bz\u0010k\"\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020\u000e0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}\"\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020\u000e0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010}\"\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u000e0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010}\"\u0019\u0010\u0080\u0001\u001a\u00020P8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010k\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0081\u0001"}, d2 = {"Landroidx/compose/material3/TimePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/TimePickerColors;", "colors", "Landroidx/compose/material3/TimePickerLayoutType;", "layoutType", "Lkotlin/j;", "TimePicker-mT9BvqQ", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ILandroidx/compose/runtime/Composer;II)V", "TimePicker", "TimeInput", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "", "initialHour", "initialMinute", "", "is24Hour", "rememberTimePickerState", "(IIZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TimePickerState;", "autoSwitchToMinute", "VerticalTimePicker", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V", "HorizontalTimePicker", "TimeInputImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V", "HorizontalClockDisplay", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "VerticalClockDisplay", "ClockDisplayNumbers", "HorizontalPeriodToggle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "VerticalPeriodToggle", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/graphics/Shape;", "startShape", "endShape", "PeriodToggleImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V", "checked", "shape", "Lkotlin/Function0;", "onClick", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "content", "ToggleItem", "(ZLandroidx/compose/ui/graphics/Shape;Lkj/a;Landroidx/compose/material3/TimePickerColors;Lkj/q;Landroidx/compose/runtime/Composer;I)V", "DisplaySeparator", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "value", "Landroidx/compose/material3/Selection;", "selection", "TimeSelector-uXwN82Y", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "TimeSelector", "ClockFace", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V", "drawSelector", "clockDial", "ClockText", "(Landroidx/compose/material3/TimePickerState;IZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "prevValue", "max", "onNewValue", "timeInputOnChange-gIWD5Rc", "(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;ILkj/l;)V", "timeInputOnChange", "onValueChange", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "TimePickerTextField-lxUZ_iY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkj/l;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "TimePickerTextField", "Landroidx/compose/ui/unit/Dp;", "radius", "CircularLayout-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLkj/p;Landroidx/compose/runtime/Composer;II)V", "CircularLayout", "number", "", "numberContentDescription-YKJpE6Y", "(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "numberContentDescription", "", "current", "new", "Lkotlin/Pair;", "valuesForAnimation", "x1", "y1", "x2", "y2", "dist", "y", "x", "atan", "visible", "minDigits", "toLocalString", "FullCircle", "F", "", "QuarterCircle", "D", "RadiansPerMinute", "RadiansPerHour", "SeparatorZIndex", "OuterCircleSizeRadius", "InnerCircleRadius", "ClockDisplayBottomMargin", "ClockFaceBottomMargin", "DisplaySeparatorWidth", "SupportLabelTop", "TimeInputBottomPadding", "MaxDistance", "MinimumInteractiveSize", "", "Minutes", "Ljava/util/List;", "Hours", "ExtraHours", "PeriodToggleMargin", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class TimePickerKt {
    private static final float ClockFaceBottomMargin;
    private static final float DisplaySeparatorWidth;
    private static final List<Integer> ExtraHours;
    private static final float FullCircle = 6.2831855f;
    private static final List<Integer> Hours;
    private static final float PeriodToggleMargin;
    private static final double QuarterCircle = 1.5707963267948966d;
    private static final float RadiansPerHour = 0.5235988f;
    private static final float RadiansPerMinute = 0.10471976f;
    private static final float SeparatorZIndex = 2.0f;
    private static final float TimeInputBottomPadding;
    private static final float OuterCircleSizeRadius = Dp.m5267constructorimpl(101);
    private static final float InnerCircleRadius = Dp.m5267constructorimpl(69);
    private static final float ClockDisplayBottomMargin = Dp.m5267constructorimpl(36);
    private static final float SupportLabelTop = Dp.m5267constructorimpl(7);
    private static final float MaxDistance = Dp.m5267constructorimpl(74);
    private static final float MinimumInteractiveSize = Dp.m5267constructorimpl(48);
    private static final List<Integer> Minutes = f.V(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);

    static {
        float f = 24;
        ClockFaceBottomMargin = Dp.m5267constructorimpl(f);
        DisplaySeparatorWidth = Dp.m5267constructorimpl(f);
        TimeInputBottomPadding = Dp.m5267constructorimpl(f);
        List<Integer> listV = f.V(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        Hours = listV;
        List<Integer> list = listV;
        ArrayList arrayList = new ArrayList(jj.a.Q0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((((Number) it.next()).intValue() % 12) + 12));
        }
        ExtraHours = arrayList;
        PeriodToggleMargin = Dp.m5267constructorimpl(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: CircularLayout-uFdPcIQ, reason: not valid java name */
    public static final void m1700CircularLayoutuFdPcIQ(Modifier modifier, final float f, final p<? super Composer, ? super Integer, j> pVar, Composer composer, final int i2, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1548175696);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(pVar) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i4 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548175696, i4, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1497)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                    return e.a(this, intrinsicMeasureScope, list, i6);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                    return e.b(this, intrinsicMeasureScope, list, i6);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo34measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, final long j) {
                    Object next;
                    Object next2;
                    m.h(measureScope, "$this$Layout");
                    m.h(list, "measurables");
                    final float fMo348toPx0680j_4 = measureScope.mo348toPx0680j_4(f);
                    long jM5226copyZbe2FdA$default = Constraints.m5226copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                    List<? extends Measurable> list2 = list;
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next3 = it.next();
                        Measurable measurable = (Measurable) next3;
                        if ((LayoutIdKt.getLayoutId(measurable) == LayoutId.Selector || LayoutIdKt.getLayoutId(measurable) == LayoutId.InnerCircle) ? false : true) {
                            arrayList.add(next3);
                        }
                    }
                    final ArrayList arrayList2 = new ArrayList(jj.a.Q0(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Measurable) it2.next()).mo4235measureBRTryo0(jM5226copyZbe2FdA$default));
                    }
                    Iterator<T> it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        if (LayoutIdKt.getLayoutId((Measurable) next) == LayoutId.Selector) {
                            break;
                        }
                    }
                    Measurable measurable2 = (Measurable) next;
                    Iterator<T> it4 = list2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it4.next();
                        if (LayoutIdKt.getLayoutId((Measurable) next2) == LayoutId.InnerCircle) {
                            break;
                        }
                    }
                    Measurable measurable3 = (Measurable) next2;
                    final float size = 6.2831855f / arrayList2.size();
                    final Placeable placeableMo4235measureBRTryo0 = measurable2 != null ? measurable2.mo4235measureBRTryo0(jM5226copyZbe2FdA$default) : null;
                    final Placeable placeableMo4235measureBRTryo02 = measurable3 != null ? measurable3.mo4235measureBRTryo0(jM5226copyZbe2FdA$default) : null;
                    return MeasureScope.CC.p(measureScope, Constraints.m5237getMinWidthimpl(j), Constraints.m5236getMinHeightimpl(j), null, new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return j.a;
                        }

                        public final void invoke(Placeable.PlacementScope placementScope) {
                            m.h(placementScope, "$this$layout");
                            Placeable placeable = placeableMo4235measureBRTryo0;
                            if (placeable != null) {
                                Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
                            }
                            List<Placeable> list3 = arrayList2;
                            long j2 = j;
                            float f2 = fMo348toPx0680j_4;
                            float f3 = size;
                            Iterator it5 = list3.iterator();
                            int i6 = 0;
                            while (it5.hasNext()) {
                                Object next4 = it5.next();
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    f.m0();
                                    throw null;
                                }
                                Placeable placeable2 = (Placeable) next4;
                                double d = f2;
                                Iterator it6 = it5;
                                double d2 = ((double) (i6 * f3)) - 1.5707963267948966d;
                                Placeable.PlacementScope.place$default(placementScope, placeable2, f.e0((Math.cos(d2) * d) + ((double) ((Constraints.m5235getMaxWidthimpl(j2) / 2) - (placeable2.getWidth() / 2)))), f.e0((Math.sin(d2) * d) + ((double) ((Constraints.m5234getMaxHeightimpl(j2) / 2) - (placeable2.getHeight() / 2)))), 0.0f, 4, null);
                                i6 = i7;
                                it5 = it6;
                            }
                            Placeable placeable3 = placeableMo4235measureBRTryo02;
                            if (placeable3 != null) {
                                Placeable.PlacementScope.place$default(placementScope, placeable3, (Constraints.m5237getMinWidthimpl(j) - placeableMo4235measureBRTryo02.getWidth()) / 2, s.a(placeableMo4235measureBRTryo02, Constraints.m5236getMinHeightimpl(j), 2), 0.0f, 4, null);
                            }
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                    return e.c(this, intrinsicMeasureScope, list, i6);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                    return e.d(this, intrinsicMeasureScope, list, i6);
                }
            };
            int i6 = ((i4 >> 6) & 14) | ((i4 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            Density density = (Density) v.d(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifier);
            int i7 = ((i6 << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composerStartRestartGroup);
            Updater.m2444setimpl(composerM2437constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m2444setimpl(composerM2437constructorimpl, density, companion.getSetDensity());
            Updater.m2444setimpl(composerM2437constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m2444setimpl(composerM2437constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            androidx.appcompat.graphics.drawable.a.g((i7 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, qVarMaterializerOf, SkippableUpdater.m2425boximpl(SkippableUpdater.m2426constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            pVar.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 9) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i8) {
                TimePickerKt.m1700CircularLayoutuFdPcIQ(modifier2, f, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClockDisplayNumbers(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i2) {
        final int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-934561141);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(timePickerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934561141, i3, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:839)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -477913269, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt.ClockDisplayNumbers.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return j.a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-477913269, i4, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:845)");
                    }
                    TimePickerState timePickerState2 = timePickerState;
                    TimePickerColors timePickerColors2 = timePickerColors;
                    int i5 = i3;
                    composer2.startReplaceableGroup(693286680);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    kj.a<ComposeUiNode> constructor = companion2.getConstructor();
                    q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(companion);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composer2);
                    androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion2, composerM2437constructorimpl, measurePolicyRowMeasurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                    Modifier modifierM506sizeVpY3zN4 = SizeKt.m506sizeVpY3zN4(companion, timePickerTokens.m2332getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m2331getTimeSelectorContainerHeightD9Ej5fM());
                    int hourForDisplay$material3_release = timePickerState2.getHourForDisplay$material3_release();
                    Selection.Companion companion3 = Selection.INSTANCE;
                    int i6 = ((i5 << 9) & 57344) | ((i5 << 6) & 896) | 3078;
                    TimePickerKt.m1703TimeSelectoruXwN82Y(modifierM506sizeVpY3zN4, hourForDisplay$material3_release, timePickerState2, companion3.m1488getHourJiIwxys(), timePickerColors2, composer2, i6);
                    TimePickerKt.DisplaySeparator(SizeKt.m506sizeVpY3zN4(companion, TimePickerKt.DisplaySeparatorWidth, timePickerTokens.m2328getPeriodSelectorVerticalContainerHeightD9Ej5fM()), composer2, 6);
                    TimePickerKt.m1703TimeSelectoruXwN82Y(SizeKt.m506sizeVpY3zN4(companion, timePickerTokens.m2332getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m2331getTimeSelectorContainerHeightD9Ej5fM()), timePickerState2.getMinute(), timePickerState2, companion3.m1489getMinuteJiIwxys(), timePickerColors2, composer2, i6);
                    if (android.support.v4.media.a.p(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt.ClockDisplayNumbers.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i4) {
                TimePickerKt.ClockDisplayNumbers(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClockFace(final TimePickerState timePickerState, final TimePickerColors timePickerColors, final boolean z, Composer composer, final int i2) {
        final int i3;
        m.h(timePickerState, "state");
        m.h(timePickerColors, "colors");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1525091100);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(timePickerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1525091100, i3, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1125)");
            }
            CrossfadeKt.Crossfade(timePickerState.getValues$material3_release(), SemanticsModifierKt.semantics$default(SizeKt.m504size3ABfNKs(BackgroundKt.m181backgroundbw27NRU(Modifier.INSTANCE, timePickerColors.getClockDialColor(), RoundedCornerShapeKt.getCircleShape()), TimePickerTokens.INSTANCE.m2320getClockDialContainerSizeD9Ej5fM()), false, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return j.a;
                }

                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    m.h(semanticsPropertyReceiver, "$this$semantics");
                    SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, false);
                    SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
                }
            }, 1, null), AnimationSpecKt.tween$default(350, 0, null, 6, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1628166511, true, new q<List<? extends Integer>, Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((List<Integer>) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return j.a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(final List<Integer> list, Composer composer2, int i4) {
                    m.h(list, "screen");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1628166511, i4, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1140)");
                    }
                    Modifier modifierDrawSelector = TimePickerKt.drawSelector(SizeKt.m504size3ABfNKs(TimePickerKt.clockDial(Modifier.INSTANCE, timePickerState, z), TimePickerTokens.INSTANCE.m2320getClockDialContainerSizeD9Ej5fM()), timePickerState, timePickerColors);
                    float f = TimePickerKt.OuterCircleSizeRadius;
                    final TimePickerColors timePickerColors2 = timePickerColors;
                    final TimePickerState timePickerState2 = timePickerState;
                    final boolean z2 = z;
                    final int i5 = i3;
                    TimePickerKt.m1700CircularLayoutuFdPcIQ(modifierDrawSelector, f, ComposableLambdaKt.composableLambda(composer2, -1385633737, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return j.a;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1385633737, i6, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1147)");
                            }
                            ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m2808boximpl(timePickerColors2.m1689clockDialContentColorvNxB06k$material3_release(false)))};
                            final List<Integer> list2 = list;
                            final TimePickerState timePickerState3 = timePickerState2;
                            final boolean z3 = z2;
                            final int i7 = i5;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, -2018362505, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return j.a;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(Composer composer4, int i8) {
                                    if ((i8 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2018362505, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1150)");
                                    }
                                    composer4.startReplaceableGroup(-504302349);
                                    int size = list2.size();
                                    TimePickerState timePickerState4 = timePickerState3;
                                    List<Integer> list3 = list2;
                                    boolean z4 = z3;
                                    int i9 = i7;
                                    for (int i10 = 0; i10 < size; i10++) {
                                        TimePickerKt.ClockText(timePickerState4, (!timePickerState4.getIs24hour() || Selection.m1484equalsimpl0(timePickerState4.m1734getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1489getMinuteJiIwxys())) ? list3.get(i10).intValue() : list3.get(i10).intValue() % 12, z4, composer4, (i9 & 14) | (i9 & 896));
                                    }
                                    composer4.endReplaceableGroup();
                                    if (Selection.m1484equalsimpl0(timePickerState3.m1734getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1488getHourJiIwxys()) && timePickerState3.getIs24hour()) {
                                        Modifier modifierM181backgroundbw27NRU = BackgroundKt.m181backgroundbw27NRU(SizeKt.m504size3ABfNKs(LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m2320getClockDialContainerSizeD9Ej5fM()), Color.INSTANCE.m2853getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape());
                                        float f2 = TimePickerKt.InnerCircleRadius;
                                        final TimePickerState timePickerState5 = timePickerState3;
                                        final boolean z5 = z3;
                                        final int i11 = i7;
                                        TimePickerKt.m1700CircularLayoutuFdPcIQ(modifierM181backgroundbw27NRU, f2, ComposableLambdaKt.composableLambda(composer4, -448649404, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1.1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                return j.a;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(Composer composer5, int i12) {
                                                if ((i12 & 11) == 2 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-448649404, i12, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1167)");
                                                }
                                                int size2 = TimePickerKt.ExtraHours.size();
                                                TimePickerState timePickerState6 = timePickerState5;
                                                boolean z6 = z5;
                                                int i13 = i11;
                                                for (int i14 = 0; i14 < size2; i14++) {
                                                    TimePickerKt.ClockText(timePickerState6, ((Number) TimePickerKt.ExtraHours.get(i14)).intValue(), z6, composer5, (i13 & 14) | (i13 & 896));
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), composer4, 432, 0);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer3, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 432, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 24584, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i4) {
                TimePickerKt.ClockFace(timePickerState, timePickerColors, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClockText(final TimePickerState timePickerState, final int i2, final boolean z, Composer composer, final int i3) {
        int i4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1317232110);
        if ((i3 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(timePickerState) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i4 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1317232110, i4, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1286)");
            }
            TextStyle textStyleCopyAndSetFontPadding = IncludeFontPaddingHelper_androidKt.copyAndSetFontPadding(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), TimePickerTokens.INSTANCE.getClockDialLabelTextFont()), false);
            final float fMo348toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo348toPx0680j_4(MaxDistance);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2574boximpl(Offset.INSTANCE.m2601getZeroF1C5BW0()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            Object objD = s.d(composerStartRestartGroup, 773894976, -492369756);
            if (objD == companion.getEmpty()) {
                objD = androidx.appcompat.view.menu.a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objD).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            final String strM1708numberContentDescriptionYKJpE6Y = m1708numberContentDescriptionYKJpE6Y(timePickerState.m1734getSelectionJiIwxys$material3_release(), timePickerState.getIs24hour(), i2, composerStartRestartGroup, (i4 << 3) & 896);
            String localString = toLocalString(i2, 1);
            final boolean zC = Selection.m1484equalsimpl0(timePickerState.m1734getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1489getMinuteJiIwxys()) ? m.c(toLocalString(timePickerState.getMinute(), 1), localString) : m.c(toLocalString(timePickerState.getHour(), 1), localString);
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM504size3ABfNKs = SizeKt.m504size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(companion2), MinimumInteractiveSize);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new l<LayoutCoordinates, j>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((LayoutCoordinates) obj);
                        return j.a;
                    }

                    public final void invoke(LayoutCoordinates layoutCoordinates) {
                        m.h(layoutCoordinates, "it");
                        TimePickerKt.ClockText$lambda$30(mutableState, LayoutCoordinatesKt.boundsInParent(layoutCoordinates).m2615getCenterF1C5BW0());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics = SemanticsModifierKt.semantics(FocusableKt.focusable$default(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM504size3ABfNKs, (l) objRememberedValue2), false, null, 3, null), true, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.TimePickerKt.ClockText.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return j.a;
                }

                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    m.h(semanticsPropertyReceiver, "$this$semantics");
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    final TimePickerState timePickerState2 = timePickerState;
                    final float f = fMo348toPx0680j_4;
                    final boolean z2 = z;
                    final MutableState<Offset> mutableState2 = mutableState;
                    SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new kj.a<Boolean>() { // from class: androidx.compose.material3.TimePickerKt.ClockText.2.1

                        /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1, reason: invalid class name and collision with other inner class name */
                        /* JADX INFO: compiled from: TimePicker.kt */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                        @ej.c(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1", f = "TimePicker.kt", l = {1318}, m = "invokeSuspend")
                        public static final class C00971 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                            final /* synthetic */ boolean $autoSwitchToMinute;
                            final /* synthetic */ MutableState<Offset> $center$delegate;
                            final /* synthetic */ float $maxDist;
                            final /* synthetic */ TimePickerState $state;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C00971(TimePickerState timePickerState, float f, boolean z, MutableState<Offset> mutableState, dj.c<? super C00971> cVar) {
                                super(2, cVar);
                                this.$state = timePickerState;
                                this.$maxDist = f;
                                this.$autoSwitchToMinute = z;
                                this.$center$delegate = mutableState;
                            }

                            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                                return new C00971(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, cVar);
                            }

                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    li.c.O(obj);
                                    TimePickerState timePickerState = this.$state;
                                    float fM2585getXimpl = Offset.m2585getXimpl(TimePickerKt.ClockText$lambda$29(this.$center$delegate));
                                    float fM2586getYimpl = Offset.m2586getYimpl(TimePickerKt.ClockText$lambda$29(this.$center$delegate));
                                    float f = this.$maxDist;
                                    boolean z = this.$autoSwitchToMinute;
                                    this.label = 1;
                                    if (timePickerState.onTap$material3_release(fM2585getXimpl, fM2586getYimpl, f, z, this) == coroutineSingletons) {
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
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                        public final Boolean m1710invoke() {
                            BuildersKt.launch$default(coroutineScope2, (dj.e) null, (CoroutineStart) null, new C00971(timePickerState2, f, z2, mutableState2, null), 3, (Object) null);
                            return Boolean.TRUE;
                        }
                    }, 1, null);
                    SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, zC);
                }
            });
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            Density density = (Density) v.d(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierSemantics);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composerStartRestartGroup);
            composer2 = composerStartRestartGroup;
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion3, composerM2437constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged2 = composer2.changed(strM1708numberContentDescriptionYKJpE6Y);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return j.a;
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        m.h(semanticsPropertyReceiver, "$this$clearAndSetSemantics");
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM1708numberContentDescriptionYKJpE6Y);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            TextKt.m1685Text4IGK_g(localString, SemanticsModifierKt.clearAndSetSemantics(companion2, (l) objRememberedValue3), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, j>) null, textStyleCopyAndSetFontPadding, composer2, 0, 0, 65532);
            if (android.support.v4.media.a.p(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt.ClockText.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer3, int i5) {
                TimePickerKt.ClockText(timePickerState, i2, z, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ClockText$lambda$29(MutableState<Offset> mutableState) {
        return mutableState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockText$lambda$30(MutableState<Offset> mutableState, long j) {
        mutableState.setValue(Offset.m2574boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DisplaySeparator(final Modifier modifier, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2100674302);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100674302, i2, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1046)");
            }
            TextStyle textStyle = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
            TextStyle textStyleCopyAndSetFontPadding = IncludeFontPaddingHelper_androidKt.copyAndSetFontPadding(textStyle.m4824copyCXVQc50((3653631 & 1) != 0 ? textStyle.spanStyle.m4770getColor0d7_KjU() : 0L, (3653631 & 2) != 0 ? textStyle.spanStyle.getFontSize() : 0L, (3653631 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (3653631 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : null, (3653631 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : null, (3653631 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : null, (3653631 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (3653631 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? textStyle.spanStyle.getLetterSpacing() : 0L, (3653631 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? textStyle.spanStyle.getBaselineShift() : null, (3653631 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (3653631 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? textStyle.spanStyle.getLocaleList() : null, (3653631 & 2048) != 0 ? textStyle.spanStyle.getBackground() : 0L, (3653631 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (3653631 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (3653631 & 16384) != 0 ? textStyle.paragraphStyle.getTextAlign() : TextAlign.m5163boximpl(TextAlign.INSTANCE.m5170getCentere0LSkKk()), (3653631 & 32768) != 0 ? textStyle.paragraphStyle.getTextDirection() : null, (3653631 & 65536) != 0 ? textStyle.paragraphStyle.getLineHeight() : 0L, (3653631 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (3653631 & 262144) != 0 ? textStyle.platformStyle : null, (3653631 & 524288) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m5147getCenterPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m5159getBothEVpEnUU(), null), (3653631 & 1048576) != 0 ? textStyle.paragraphStyle.getLineBreak() : null, (3653631 & 2097152) != 0 ? textStyle.paragraphStyle.getHyphens() : null), false);
            Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.TimePickerKt.DisplaySeparator.1
                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    m.h(semanticsPropertyReceiver, "$this$clearAndSetSemantics");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return j.a;
                }
            });
            Alignment center = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            Density density = (Density) v.d(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierClearAndSetSemantics);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composerStartRestartGroup);
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m1685Text4IGK_g(":", (Modifier) null, ColorSchemeKt.toColor(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, j>) null, textStyleCopyAndSetFontPadding, composer2, 6, 0, 65530);
            if (android.support.v4.media.a.p(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt.DisplaySeparator.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer3, int i4) {
                TimePickerKt.DisplaySeparator(modifier, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HorizontalClockDisplay(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(755539561);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(timePickerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        int i4 = i3;
        if ((i4 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755539561, i4, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:801)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion2.getStart(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composerStartRestartGroup);
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion3, composerM2437constructorimpl, measurePolicyColumnMeasurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ClockDisplayNumbers(timePickerState, timePickerColors, composerStartRestartGroup, (i4 & 14) | (i4 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            composerStartRestartGroup.startReplaceableGroup(-552398963);
            if (!timePickerState.getIs24hour()) {
                Modifier modifierM465paddingqDBjuR0$default = PaddingKt.m465paddingqDBjuR0$default(companion, 0.0f, PeriodToggleMargin, 0.0f, 0.0f, 13, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyB = android.support.v4.media.a.b(companion2, false, composerStartRestartGroup, 0, -1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                kj.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf2 = LayoutKt.materializerOf(modifierM465paddingqDBjuR0$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2437constructorimpl2 = Updater.m2437constructorimpl(composerStartRestartGroup);
                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf2, androidx.appcompat.app.m.d(companion3, composerM2437constructorimpl2, measurePolicyB, composerM2437constructorimpl2, density2, composerM2437constructorimpl2, layoutDirection2, composerM2437constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i5 = i4 << 3;
                HorizontalPeriodToggle(SizeKt.m506sizeVpY3zN4(companion, timePickerTokens.m2326getPeriodSelectorHorizontalContainerWidthD9Ej5fM(), timePickerTokens.m2325getPeriodSelectorHorizontalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composerStartRestartGroup, (i5 & 896) | (i5 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt.HorizontalClockDisplay.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i6) {
                TimePickerKt.HorizontalClockDisplay(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HorizontalPeriodToggle(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1261215927);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerState) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261215927, i3, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:878)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return e.a(this, intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return e.b(this, intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo34measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        m.h(measureScope, "$this$MeasurePolicy");
                        m.h(list, "measurables");
                        List<? extends Measurable> list2 = list;
                        for (Measurable measurable : list2) {
                            if (m.c(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(Constraints.m5226copyZbe2FdA$default(j, 0, f.f0(measureScope.mo348toPx0680j_4(TimePickerTokens.INSTANCE.m2327getPeriodSelectorOutlineWidthD9Ej5fM())), 0, 0, 12, null));
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : list2) {
                                    if (!m.c(LayoutIdKt.getLayoutId((Measurable) obj), "Spacer")) {
                                        arrayList.add(obj);
                                    }
                                }
                                final ArrayList arrayList2 = new ArrayList(jj.a.Q0(arrayList, 10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(((Measurable) it.next()).mo4235measureBRTryo0(Constraints.m5226copyZbe2FdA$default(j, 0, Constraints.m5235getMaxWidthimpl(j) / 2, 0, 0, 12, null)));
                                }
                                return MeasureScope.CC.p(measureScope, Constraints.m5235getMaxWidthimpl(j), Constraints.m5234getMaxHeightimpl(j), null, new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1$measure$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        invoke((Placeable.PlacementScope) obj2);
                                        return j.a;
                                    }

                                    public final void invoke(Placeable.PlacementScope placementScope) {
                                        m.h(placementScope, "$this$layout");
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(1), arrayList2.get(0).getWidth(), 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, placeableMo4235measureBRTryo0, arrayList2.get(0).getWidth() - (placeableMo4235measureBRTryo0.getWidth() / 2), 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return e.c(this, intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return e.d(this, intrinsicMeasureScope, list, i4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            Shape shape = ShapesKt.toShape(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            m.f(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shape;
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, ShapesKt.start(cornerBasedShape), ShapesKt.end(cornerBasedShape), composerStartRestartGroup, (i3 & 14) | 3072 | (i3 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i3 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt.HorizontalPeriodToggle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i4) {
                TimePickerKt.HorizontalPeriodToggle(modifier, timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HorizontalTimePicker(final androidx.compose.material3.TimePickerState r40, androidx.compose.ui.Modifier r41, androidx.compose.material3.TimePickerColors r42, final boolean r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.HorizontalTimePicker(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PeriodToggleImpl(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, final MeasurePolicy measurePolicy, final Shape shape, final Shape shape2, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1374241901);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerState) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(measurePolicy) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
        }
        if ((374491 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374241901, i3, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:964)");
            }
            TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
            BorderStroke borderStrokeM201BorderStrokecXLIe8U = BorderStrokeKt.m201BorderStrokecXLIe8U(timePickerTokens.m2327getPeriodSelectorOutlineWidthD9Ej5fM(), timePickerColors.getPeriodSelectorBorderColor());
            Shape shape3 = ShapesKt.toShape(timePickerTokens.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            m.f(shape3, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shape3;
            final String strM1581getStringNWtq28 = Strings_androidKt.m1581getStringNWtq28(Strings.INSTANCE.m1578getTimePickerPeriodToggleadMyvUU(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(strM1581getStringNWtq28);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return j.a;
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        m.h(semanticsPropertyReceiver, "$this$semantics");
                        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM1581getStringNWtq28);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierBorder = BorderKt.border(SelectableGroupKt.selectableGroup(SemanticsModifierKt.semantics$default(modifier, false, (l) objRememberedValue, 1, null)).then(modifier), borderStrokeM201BorderStrokecXLIe8U, cornerBasedShape);
            Density density = (Density) v.d(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierBorder);
            int i4 = ((((i3 >> 3) & 896) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composerStartRestartGroup);
            Updater.m2444setimpl(composerM2437constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m2444setimpl(composerM2437constructorimpl, density, companion.getSetDensity());
            Updater.m2444setimpl(composerM2437constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m2444setimpl(composerM2437constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            qVarMaterializerOf.invoke(SkippableUpdater.m2425boximpl(SkippableUpdater.m2426constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i4 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            boolean z = !timePickerState.isAfternoonToggle$material3_release();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(timePickerState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new kj.a<j>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$1$1
                    {
                        super(0);
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        m1711invoke();
                        return j.a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m1711invoke() {
                        timePickerState.setAfternoonToggle$material3_release(false);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ComposableSingletons$TimePickerKt composableSingletons$TimePickerKt = ComposableSingletons$TimePickerKt.INSTANCE;
            int i5 = (i3 << 3) & 7168;
            ToggleItem(z, shape, (kj.a) objRememberedValue2, timePickerColors, composableSingletons$TimePickerKt.m1186getLambda1$material3_release(), composerStartRestartGroup, ((i3 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 24576 | i5);
            SpacerKt.Spacer(BackgroundKt.m182backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(LayoutIdKt.layoutId(Modifier.INSTANCE, "Spacer"), SeparatorZIndex), 0.0f, 1, null), ColorSchemeKt.toColor(timePickerTokens.getPeriodSelectorOutlineColor(), composerStartRestartGroup, 6), null, 2, null), composerStartRestartGroup, 0);
            boolean zIsAfternoonToggle$material3_release = timePickerState.isAfternoonToggle$material3_release();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(timePickerState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new kj.a<j>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$2$1
                    {
                        super(0);
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        m1712invoke();
                        return j.a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m1712invoke() {
                        timePickerState.setAfternoonToggle$material3_release(true);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ToggleItem(zIsAfternoonToggle$material3_release, shape2, (kj.a) objRememberedValue3, timePickerColors, composableSingletons$TimePickerKt.m1187getLambda2$material3_release(), composerStartRestartGroup, ((i3 >> 12) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 24576 | i5);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt.PeriodToggleImpl.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i6) {
                TimePickerKt.PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TimeInput(final androidx.compose.material3.TimePickerState r39, androidx.compose.ui.Modifier r40, androidx.compose.material3.TimePickerColors r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.TimeInput(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TimeInputImpl(final Modifier modifier, final TimePickerColors timePickerColors, final TimePickerState timePickerState, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-475657989);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerState) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        final int i4 = i3;
        if ((i4 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475657989, i4, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:693)");
            }
            Object[] objArr = new Object[0];
            TextFieldValue.Companion companion = TextFieldValue.INSTANCE;
            Saver<TextFieldValue, Object> saver = companion.getSaver();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(timePickerState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new kj.a<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$hourValue$2$1
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final MutableState<TextFieldValue> m1715invoke() {
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(TimePickerKt.toLocalString(timePickerState.getHourForDisplay$material3_release(), 2), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (String) null, (kj.a) objRememberedValue, composerStartRestartGroup, 72, 4);
            Object[] objArr2 = new Object[0];
            Saver<TextFieldValue, Object> saver2 = companion.getSaver();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(timePickerState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new kj.a<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$minuteValue$2$1
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final MutableState<TextFieldValue> m1716invoke() {
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(TimePickerKt.toLocalString(timePickerState.getMinute(), 2), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableStateRememberSaveable2 = RememberSaveableKt.rememberSaveable(objArr2, (Saver) saver2, (String) null, (kj.a) objRememberedValue2, composerStartRestartGroup, 72, 4);
            Modifier modifierM465paddingqDBjuR0$default = PaddingKt.m465paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, TimeInputBottomPadding, 7, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical top = companion2.getTop();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierM465paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composerStartRestartGroup);
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion3, composerM2437constructorimpl, measurePolicyRowMeasurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Typography typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
            TimeInputTokens timeInputTokens = TimeInputTokens.INSTANCE;
            TextStyle textStyleFromToken = TypographyKt.fromToken(typography, timeInputTokens.getTimeFieldLabelTextFont());
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(textStyleFromToken.m4824copyCXVQc50((3653631 & 1) != 0 ? textStyleFromToken.spanStyle.m4770getColor0d7_KjU() : timePickerColors.m1697timeSelectorContentColorvNxB06k$material3_release(true), (3653631 & 2) != 0 ? textStyleFromToken.spanStyle.getFontSize() : 0L, (3653631 & 4) != 0 ? textStyleFromToken.spanStyle.getFontWeight() : null, (3653631 & 8) != 0 ? textStyleFromToken.spanStyle.getFontStyle() : null, (3653631 & 16) != 0 ? textStyleFromToken.spanStyle.getFontSynthesis() : null, (3653631 & 32) != 0 ? textStyleFromToken.spanStyle.getFontFamily() : null, (3653631 & 64) != 0 ? textStyleFromToken.spanStyle.getFontFeatureSettings() : null, (3653631 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? textStyleFromToken.spanStyle.getLetterSpacing() : 0L, (3653631 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? textStyleFromToken.spanStyle.getBaselineShift() : null, (3653631 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? textStyleFromToken.spanStyle.getTextGeometricTransform() : null, (3653631 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? textStyleFromToken.spanStyle.getLocaleList() : null, (3653631 & 2048) != 0 ? textStyleFromToken.spanStyle.getBackground() : 0L, (3653631 & 4096) != 0 ? textStyleFromToken.spanStyle.getTextDecoration() : null, (3653631 & 8192) != 0 ? textStyleFromToken.spanStyle.getShadow() : null, (3653631 & 16384) != 0 ? textStyleFromToken.paragraphStyle.getTextAlign() : TextAlign.m5163boximpl(TextAlign.INSTANCE.m5170getCentere0LSkKk()), (3653631 & 32768) != 0 ? textStyleFromToken.paragraphStyle.getTextDirection() : null, (3653631 & 65536) != 0 ? textStyleFromToken.paragraphStyle.getLineHeight() : 0L, (3653631 & 131072) != 0 ? textStyleFromToken.paragraphStyle.getTextIndent() : null, (3653631 & 262144) != 0 ? textStyleFromToken.platformStyle : null, (3653631 & 524288) != 0 ? textStyleFromToken.paragraphStyle.getLineHeightStyle() : null, (3653631 & 1048576) != 0 ? textStyleFromToken.paragraphStyle.getLineBreak() : null, (3653631 & 2097152) != 0 ? textStyleFromToken.paragraphStyle.getHyphens() : null))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1306700887, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return j.a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1306700887, i5, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:715)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    final MutableState<TextFieldValue> mutableState = mutableStateRememberSaveable;
                    final TimePickerState timePickerState2 = timePickerState;
                    composer3.startReplaceableGroup(511388516);
                    boolean zChanged3 = composer3.changed(mutableState) | composer3.changed(timePickerState2);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new l<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return m1713invokeZmokQxo(((KeyEvent) obj).m4001unboximpl());
                            }

                            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m1713invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                m.h(keyEvent, "event");
                                int iM4014getUtf16CodePointZmokQxo = KeyEvent_androidKt.m4014getUtf16CodePointZmokQxo(keyEvent);
                                if ((48 <= iM4014getUtf16CodePointZmokQxo && iM4014getUtf16CodePointZmokQxo < 58) && TextRange.m4811getStartimpl(TimePickerKt.TimeInputImpl$lambda$5(mutableState).getSelection()) == 2 && TimePickerKt.TimeInputImpl$lambda$5(mutableState).getText().length() == 2) {
                                    timePickerState2.m1737setSelectioniHAOin8$material3_release(Selection.INSTANCE.m1489getMinuteJiIwxys());
                                }
                                return Boolean.FALSE;
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    composer3.endReplaceableGroup();
                    Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(companion4, (l) objRememberedValue3);
                    TextFieldValue textFieldValueTimeInputImpl$lambda$5 = TimePickerKt.TimeInputImpl$lambda$5(mutableStateRememberSaveable);
                    final TimePickerState timePickerState3 = timePickerState;
                    final MutableState<TextFieldValue> mutableState2 = mutableStateRememberSaveable;
                    composer3.startReplaceableGroup(511388516);
                    boolean zChanged4 = composer3.changed(timePickerState3) | composer3.changed(mutableState2);
                    Object objRememberedValue4 = composer3.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new l<TextFieldValue, j>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((TextFieldValue) obj);
                                return j.a;
                            }

                            public final void invoke(TextFieldValue textFieldValue) {
                                m.h(textFieldValue, "newValue");
                                int iM1488getHourJiIwxys = Selection.INSTANCE.m1488getHourJiIwxys();
                                TimePickerState timePickerState4 = timePickerState3;
                                TextFieldValue textFieldValueTimeInputImpl$lambda$52 = TimePickerKt.TimeInputImpl$lambda$5(mutableState2);
                                int i6 = timePickerState3.getIs24hour() ? 23 : 12;
                                final MutableState<TextFieldValue> mutableState3 = mutableState2;
                                TimePickerKt.m1709timeInputOnChangegIWD5Rc(iM1488getHourJiIwxys, timePickerState4, textFieldValue, textFieldValueTimeInputImpl$lambda$52, i6, new l<TextFieldValue, j>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((TextFieldValue) obj);
                                        return j.a;
                                    }

                                    public final void invoke(TextFieldValue textFieldValue2) {
                                        m.h(textFieldValue2, "it");
                                        mutableState3.setValue(textFieldValue2);
                                    }
                                });
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    composer3.endReplaceableGroup();
                    l lVar = (l) objRememberedValue4;
                    TimePickerState timePickerState4 = timePickerState;
                    Selection.Companion companion5 = Selection.INSTANCE;
                    int iM1488getHourJiIwxys = companion5.m1488getHourJiIwxys();
                    ImeAction.Companion companion6 = ImeAction.INSTANCE;
                    int iM4961getNexteUduSuo = companion6.m4961getNexteUduSuo();
                    KeyboardType.Companion companion7 = KeyboardType.INSTANCE;
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, companion7.m5008getNumberPjHm6EE(), iM4961getNexteUduSuo, 3, null);
                    final TimePickerState timePickerState5 = timePickerState;
                    composer3.startReplaceableGroup(1157296644);
                    boolean zChanged5 = composer3.changed(timePickerState5);
                    Object objRememberedValue5 = composer3.rememberedValue();
                    if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new l<KeyboardActionScope, j>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$3$1
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((KeyboardActionScope) obj);
                                return j.a;
                            }

                            public final void invoke(KeyboardActionScope keyboardActionScope) {
                                m.h(keyboardActionScope, "$this$$receiver");
                                timePickerState5.m1737setSelectioniHAOin8$material3_release(Selection.INSTANCE.m1489getMinuteJiIwxys());
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    composer3.endReplaceableGroup();
                    KeyboardActions keyboardActions = new KeyboardActions(null, null, (l) objRememberedValue5, null, null, null, 59, null);
                    TimePickerColors timePickerColors2 = timePickerColors;
                    int i6 = i4;
                    TimePickerKt.m1702TimePickerTextFieldlxUZ_iY(modifierOnKeyEvent, textFieldValueTimeInputImpl$lambda$5, lVar, timePickerState4, iM1488getHourJiIwxys, keyboardOptions, keyboardActions, timePickerColors2, composer3, ((i6 << 3) & 7168) | 24576 | ((i6 << 18) & 29360128), 0);
                    TimePickerKt.DisplaySeparator(SizeKt.m506sizeVpY3zN4(companion4, TimePickerKt.DisplaySeparatorWidth, TimeInputTokens.INSTANCE.m2314getPeriodSelectorContainerHeightD9Ej5fM()), composer3, 6);
                    final MutableState<TextFieldValue> mutableState3 = mutableStateRememberSaveable2;
                    final TimePickerState timePickerState6 = timePickerState;
                    composer3.startReplaceableGroup(511388516);
                    boolean zChanged6 = composer3.changed(mutableState3) | composer3.changed(timePickerState6);
                    Object objRememberedValue6 = composer3.rememberedValue();
                    if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new l<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return m1714invokeZmokQxo(((KeyEvent) obj).m4001unboximpl());
                            }

                            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m1714invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                m.h(keyEvent, "event");
                                boolean z = KeyEvent_androidKt.m4014getUtf16CodePointZmokQxo(keyEvent) == 0 && TextRange.m4811getStartimpl(TimePickerKt.TimeInputImpl$lambda$8(mutableState3).getSelection()) == 0;
                                if (z) {
                                    timePickerState6.m1737setSelectioniHAOin8$material3_release(Selection.INSTANCE.m1488getHourJiIwxys());
                                }
                                return Boolean.valueOf(z);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue6);
                    }
                    composer3.endReplaceableGroup();
                    Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(companion4, (l) objRememberedValue6);
                    TextFieldValue textFieldValueTimeInputImpl$lambda$8 = TimePickerKt.TimeInputImpl$lambda$8(mutableStateRememberSaveable2);
                    final TimePickerState timePickerState7 = timePickerState;
                    final MutableState<TextFieldValue> mutableState4 = mutableStateRememberSaveable2;
                    composer3.startReplaceableGroup(511388516);
                    boolean zChanged7 = composer3.changed(timePickerState7) | composer3.changed(mutableState4);
                    Object objRememberedValue7 = composer3.rememberedValue();
                    if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new l<TextFieldValue, j>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((TextFieldValue) obj);
                                return j.a;
                            }

                            public final void invoke(TextFieldValue textFieldValue) {
                                m.h(textFieldValue, "newValue");
                                int iM1489getMinuteJiIwxys = Selection.INSTANCE.m1489getMinuteJiIwxys();
                                TimePickerState timePickerState8 = timePickerState7;
                                TextFieldValue textFieldValueTimeInputImpl$lambda$82 = TimePickerKt.TimeInputImpl$lambda$8(mutableState4);
                                final MutableState<TextFieldValue> mutableState5 = mutableState4;
                                TimePickerKt.m1709timeInputOnChangegIWD5Rc(iM1489getMinuteJiIwxys, timePickerState8, textFieldValue, textFieldValueTimeInputImpl$lambda$82, 59, new l<TextFieldValue, j>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$5$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((TextFieldValue) obj);
                                        return j.a;
                                    }

                                    public final void invoke(TextFieldValue textFieldValue2) {
                                        m.h(textFieldValue2, "it");
                                        mutableState5.setValue(textFieldValue2);
                                    }
                                });
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue7);
                    }
                    composer3.endReplaceableGroup();
                    l lVar2 = (l) objRememberedValue7;
                    TimePickerState timePickerState8 = timePickerState;
                    int iM1489getMinuteJiIwxys = companion5.m1489getMinuteJiIwxys();
                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, false, companion7.m5008getNumberPjHm6EE(), companion6.m4959getDoneeUduSuo(), 3, null);
                    final TimePickerState timePickerState9 = timePickerState;
                    composer3.startReplaceableGroup(1157296644);
                    boolean zChanged8 = composer3.changed(timePickerState9);
                    Object objRememberedValue8 = composer3.rememberedValue();
                    if (zChanged8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new l<KeyboardActionScope, j>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$6$1
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((KeyboardActionScope) obj);
                                return j.a;
                            }

                            public final void invoke(KeyboardActionScope keyboardActionScope) {
                                m.h(keyboardActionScope, "$this$$receiver");
                                timePickerState9.m1737setSelectioniHAOin8$material3_release(Selection.INSTANCE.m1489getMinuteJiIwxys());
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue8);
                    }
                    composer3.endReplaceableGroup();
                    KeyboardActions keyboardActions2 = new KeyboardActions(null, null, (l) objRememberedValue8, null, null, null, 59, null);
                    TimePickerColors timePickerColors3 = timePickerColors;
                    int i7 = i4;
                    TimePickerKt.m1702TimePickerTextFieldlxUZ_iY(modifierOnPreviewKeyEvent, textFieldValueTimeInputImpl$lambda$8, lVar2, timePickerState8, iM1489getMinuteJiIwxys, keyboardOptions2, keyboardActions2, timePickerColors3, composer3, ((i7 << 3) & 7168) | 24576 | ((i7 << 18) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 56);
            composerStartRestartGroup.startReplaceableGroup(565119480);
            if (timePickerState.getIs24hour()) {
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifierM465paddingqDBjuR0$default2 = PaddingKt.m465paddingqDBjuR0$default(modifier, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyB = android.support.v4.media.a.b(companion2, false, composerStartRestartGroup, 0, -1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                kj.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf2 = LayoutKt.materializerOf(modifierM465paddingqDBjuR0$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2437constructorimpl2 = Updater.m2437constructorimpl(composerStartRestartGroup);
                composer2 = composerStartRestartGroup;
                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf2, androidx.appcompat.app.m.d(companion3, composerM2437constructorimpl2, measurePolicyB, composerM2437constructorimpl2, density2, composerM2437constructorimpl2, layoutDirection2, composerM2437constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                VerticalPeriodToggle(SizeKt.m506sizeVpY3zN4(Modifier.INSTANCE, timeInputTokens.m2315getPeriodSelectorContainerWidthD9Ej5fM(), timeInputTokens.m2314getPeriodSelectorContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composer2, ((i4 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | ((i4 << 3) & 896));
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt.TimeInputImpl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer3, int i5) {
                TimePickerKt.TimeInputImpl(modifier, timePickerColors, timePickerState, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$5(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$8(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /* JADX INFO: renamed from: TimePicker-mT9BvqQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1701TimePickermT9BvqQ(final androidx.compose.material3.TimePickerState r42, androidx.compose.ui.Modifier r43, androidx.compose.material3.TimePickerColors r44, int r45, androidx.compose.runtime.Composer r46, final int r47, final int r48) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m1701TimePickermT9BvqQ(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* JADX INFO: renamed from: TimePickerTextField-lxUZ_iY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1702TimePickerTextFieldlxUZ_iY(final androidx.compose.ui.Modifier r121, final androidx.compose.ui.text.input.TextFieldValue r122, final kj.l<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.j> r123, final androidx.compose.material3.TimePickerState r124, final int r125, androidx.compose.foundation.text.KeyboardOptions r126, androidx.compose.foundation.text.KeyboardActions r127, final androidx.compose.material3.TimePickerColors r128, androidx.compose.runtime.Composer r129, final int r130, final int r131) {
        /*
            Method dump skipped, instruction units count: 1463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m1702TimePickerTextFieldlxUZ_iY(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.TextFieldValue, kj.l, androidx.compose.material3.TimePickerState, int, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean TimePicker_mT9BvqQ$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: TimeSelector-uXwN82Y, reason: not valid java name */
    public static final void m1703TimeSelectoruXwN82Y(final Modifier modifier, final int i2, final TimePickerState timePickerState, final int i3, final TimePickerColors timePickerColors, Composer composer, final int i4) {
        int i5;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(21099367);
        if ((i4 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i5 |= composerStartRestartGroup.changed(timePickerState) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i4 & 7168) == 0) {
            i5 |= composerStartRestartGroup.changed(i3) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((57344 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(timePickerColors) ? 16384 : 8192;
        }
        final int i6 = i5;
        if ((46811 & i6) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(21099367, i6, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1070)");
            }
            boolean zM1484equalsimpl0 = Selection.m1484equalsimpl0(timePickerState.m1734getSelectionJiIwxys$material3_release(), i3);
            final String strM1581getStringNWtq28 = Strings_androidKt.m1581getStringNWtq28(Selection.m1484equalsimpl0(i3, Selection.INSTANCE.m1488getHourJiIwxys()) ? Strings.INSTANCE.m1570getTimePickerHourSelectionadMyvUU() : Strings.INSTANCE.m1574getTimePickerMinuteSelectionadMyvUU(), composerStartRestartGroup, 0);
            long jM1696timeSelectorContainerColorvNxB06k$material3_release = timePickerColors.m1696timeSelectorContainerColorvNxB06k$material3_release(zM1484equalsimpl0);
            final long jM1697timeSelectorContentColorvNxB06k$material3_release = timePickerColors.m1697timeSelectorContentColorvNxB06k$material3_release(zM1484equalsimpl0);
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = androidx.appcompat.view.menu.a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(strM1581getStringNWtq28);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return j.a;
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        m.h(semanticsPropertyReceiver, "$this$semantics");
                        SemanticsPropertiesKt.m4654setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m4644getRadioButtono7Vup1c());
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM1581getStringNWtq28);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            SurfaceKt.m1591Surfaced85dljk(zM1484equalsimpl0, new kj.a<j>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$2

                /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$TimeSelector$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: TimePicker.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                @ej.c(c = "androidx.compose.material3.TimePickerKt$TimeSelector$2$1", f = "TimePicker.kt", l = {1100}, m = "invokeSuspend")
                public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                    final /* synthetic */ TimePickerState $state;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TimePickerState timePickerState, dj.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$state = timePickerState;
                    }

                    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                        return new AnonymousClass1(this.$state, cVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            li.c.O(obj);
                            TimePickerState timePickerState = this.$state;
                            this.label = 1;
                            if (timePickerState.animateToCurrent$material3_release(this) == coroutineSingletons) {
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
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m1717invoke();
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m1717invoke() {
                    if (Selection.m1484equalsimpl0(i3, timePickerState.m1734getSelectionJiIwxys$material3_release())) {
                        return;
                    }
                    timePickerState.m1737setSelectioniHAOin8$material3_release(i3);
                    BuildersKt.launch$default(coroutineScope, (dj.e) null, (CoroutineStart) null, new AnonymousClass1(timePickerState, null), 3, (Object) null);
                }
            }, SemanticsModifierKt.semantics(modifier, true, (l) objRememberedValue2), false, ShapesKt.toShape(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), composerStartRestartGroup, 6), jM1696timeSelectorContainerColorvNxB06k$material3_release, 0L, 0.0f, 0.0f, (BorderStroke) null, (MutableInteractionSource) null, (p<? super Composer, ? super Integer, j>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1338709103, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return j.a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer3, int i7) {
                    if ((i7 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1338709103, i7, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1106)");
                    }
                    int i8 = i3;
                    boolean is24hour = timePickerState.getIs24hour();
                    int i9 = i2;
                    int i10 = i6;
                    final String strM1708numberContentDescriptionYKJpE6Y = TimePickerKt.m1708numberContentDescriptionYKJpE6Y(i8, is24hour, i9, composer3, ((i10 << 3) & 896) | ((i10 >> 9) & 14));
                    Alignment center = Alignment.INSTANCE.getCenter();
                    int i11 = i2;
                    long j = jM1697timeSelectorContentColorvNxB06k$material3_release;
                    composer3.startReplaceableGroup(733328855);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                    Density density = (Density) v.d(composer3, -1323940314);
                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    kj.a<ComposeUiNode> constructor = companion3.getConstructor();
                    q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(companion2);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composer3);
                    androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion3, composerM2437constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(1157296644);
                    boolean zChanged2 = composer3.changed(strM1708numberContentDescriptionYKJpE6Y);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((SemanticsPropertyReceiver) obj);
                                return j.a;
                            }

                            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                m.h(semanticsPropertyReceiver, "$this$semantics");
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM1708numberContentDescriptionYKJpE6Y);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    composer3.endReplaceableGroup();
                    TextKt.m1685Text4IGK_g(TimePickerKt.toLocalString(i11, 2), SemanticsModifierKt.semantics$default(companion2, false, (l) objRememberedValue3, 1, null), j, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, j>) null, (TextStyle) null, composer3, 0, 0, 131064);
                    if (android.support.v4.media.a.p(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, 0, 48, 1992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer3, int i7) {
                TimePickerKt.m1703TimeSelectoruXwN82Y(modifier, i2, timePickerState, i3, timePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ToggleItem(final boolean z, final Shape shape, final kj.a<j> aVar, final TimePickerColors timePickerColors, final q<? super RowScope, ? super Composer, ? super Integer, j> qVar, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1937408098);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(aVar) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(qVar) ? 16384 : 8192;
        }
        if ((46811 & i3) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937408098, i3, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1019)");
            }
            long jM1695periodSelectorContentColorvNxB06k$material3_release = timePickerColors.m1695periodSelectorContentColorvNxB06k$material3_release(z);
            long jM1694periodSelectorContainerColorvNxB06k$material3_release = timePickerColors.m1694periodSelectorContainerColorvNxB06k$material3_release(z);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(Modifier.INSTANCE, z ? 0.0f : 1.0f), 0.0f, 1, null);
            Boolean boolValueOf = Boolean.valueOf(z);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(boolValueOf);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.TimePickerKt$ToggleItem$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return j.a;
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        m.h(semanticsPropertyReceiver, "$this$semantics");
                        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ButtonKt.TextButton(aVar, SemanticsModifierKt.semantics$default(modifierFillMaxSize$default, false, (l) objRememberedValue, 1, null), false, shape, ButtonDefaults.INSTANCE.m1070textButtonColorsro_MJ88(jM1694periodSelectorContainerColorvNxB06k$material3_release, jM1695periodSelectorContentColorvNxB06k$material3_release, 0L, 0L, composerStartRestartGroup, 24576, 12), null, null, PaddingKt.m454PaddingValues0680j_4(Dp.m5267constructorimpl(0)), null, qVar, composerStartRestartGroup, ((i3 >> 6) & 14) | 12582912 | ((i3 << 6) & 7168) | ((i3 << 15) & 1879048192), 356);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt.ToggleItem.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i4) {
                TimePickerKt.ToggleItem(z, shape, aVar, timePickerColors, qVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VerticalClockDisplay(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2054675515);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(timePickerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        int i4 = i3;
        if ((i4 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054675515, i4, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:820)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion2.getTop(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composerStartRestartGroup);
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion3, composerM2437constructorimpl, measurePolicyRowMeasurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ClockDisplayNumbers(timePickerState, timePickerColors, composerStartRestartGroup, (i4 & 14) | (i4 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            composerStartRestartGroup.startReplaceableGroup(952907597);
            if (!timePickerState.getIs24hour()) {
                Modifier modifierM465paddingqDBjuR0$default = PaddingKt.m465paddingqDBjuR0$default(companion, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyB = android.support.v4.media.a.b(companion2, false, composerStartRestartGroup, 0, -1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                kj.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf2 = LayoutKt.materializerOf(modifierM465paddingqDBjuR0$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2437constructorimpl2 = Updater.m2437constructorimpl(composerStartRestartGroup);
                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf2, androidx.appcompat.app.m.d(companion3, composerM2437constructorimpl2, measurePolicyB, composerM2437constructorimpl2, density2, composerM2437constructorimpl2, layoutDirection2, composerM2437constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i5 = i4 << 3;
                VerticalPeriodToggle(SizeKt.m506sizeVpY3zN4(companion, timePickerTokens.m2329getPeriodSelectorVerticalContainerWidthD9Ej5fM(), timePickerTokens.m2328getPeriodSelectorVerticalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composerStartRestartGroup, (i5 & 896) | (i5 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt.VerticalClockDisplay.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i6) {
                TimePickerKt.VerticalClockDisplay(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VerticalPeriodToggle(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1898918107);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerState) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898918107, i3, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:921)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return e.a(this, intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return e.b(this, intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo34measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        m.h(measureScope, "$this$MeasurePolicy");
                        m.h(list, "measurables");
                        List<? extends Measurable> list2 = list;
                        for (Measurable measurable : list2) {
                            if (m.c(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(Constraints.m5226copyZbe2FdA$default(j, 0, 0, 0, f.f0(measureScope.mo348toPx0680j_4(TimePickerTokens.INSTANCE.m2327getPeriodSelectorOutlineWidthD9Ej5fM())), 3, null));
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : list2) {
                                    if (!m.c(LayoutIdKt.getLayoutId((Measurable) obj), "Spacer")) {
                                        arrayList.add(obj);
                                    }
                                }
                                final ArrayList arrayList2 = new ArrayList(jj.a.Q0(arrayList, 10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(((Measurable) it.next()).mo4235measureBRTryo0(Constraints.m5226copyZbe2FdA$default(j, 0, 0, 0, Constraints.m5234getMaxHeightimpl(j) / 2, 3, null)));
                                }
                                return MeasureScope.CC.p(measureScope, Constraints.m5235getMaxWidthimpl(j), Constraints.m5234getMaxHeightimpl(j), null, new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1$measure$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        invoke((Placeable.PlacementScope) obj2);
                                        return j.a;
                                    }

                                    public final void invoke(Placeable.PlacementScope placementScope) {
                                        m.h(placementScope, "$this$layout");
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(1), 0, arrayList2.get(0).getHeight(), 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, placeableMo4235measureBRTryo0, 0, arrayList2.get(0).getHeight() - (placeableMo4235measureBRTryo0.getHeight() / 2), 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return e.c(this, intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return e.d(this, intrinsicMeasureScope, list, i4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            Shape shape = ShapesKt.toShape(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            m.f(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shape;
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, ShapesKt.top(cornerBasedShape), ShapesKt.bottom(cornerBasedShape), composerStartRestartGroup, (i3 & 14) | 3072 | (i3 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i3 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TimePickerKt.VerticalPeriodToggle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i4) {
                TimePickerKt.VerticalPeriodToggle(modifier, timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VerticalTimePicker(final androidx.compose.material3.TimePickerState r40, androidx.compose.ui.Modifier r41, androidx.compose.material3.TimePickerColors r42, final boolean r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.VerticalTimePicker(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float atan(float f, float f2) {
        float fAtan2 = ((float) Math.atan2(f, f2)) - 1.5707964f;
        return fAtan2 < 0.0f ? fAtan2 + FullCircle : fAtan2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier clockDial(Modifier modifier, final TimePickerState timePickerState, boolean z) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.material3.TimePickerKt$clockDial$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "clockDial").set("state", timePickerState);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new C04202(timePickerState, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float dist(float f, float f2, int i2, int i3) {
        return (float) Math.hypot(i2 - f, i3 - f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier drawSelector(Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors) {
        return DrawModifierKt.drawWithContent(modifier, new l<ContentDrawScope, j>() { // from class: androidx.compose.material3.TimePickerKt.drawSelector.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return j.a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                m.h(contentDrawScope, "$this$drawWithContent");
                long jOffset = OffsetKt.Offset(contentDrawScope.mo348toPx0680j_4(DpOffset.m5328getXD9Ej5fM(timePickerState.m1735getSelectorPosRKDOV3M$material3_release())), contentDrawScope.mo348toPx0680j_4(DpOffset.m5330getYD9Ej5fM(timePickerState.m1735getSelectorPosRKDOV3M$material3_release())));
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                float f = 2;
                float fMo348toPx0680j_4 = contentDrawScope.mo348toPx0680j_4(timePickerTokens.m2322getClockDialSelectorHandleContainerSizeD9Ej5fM()) / f;
                long selectorColor = timePickerColors.getSelectorColor();
                long jM2844getBlack0d7_KjU = Color.INSTANCE.m2844getBlack0d7_KjU();
                BlendMode.Companion companion = BlendMode.INSTANCE;
                androidx.compose.ui.graphics.drawscope.b.x(contentDrawScope, jM2844getBlack0d7_KjU, fMo348toPx0680j_4, jOffset, 0.0f, null, null, companion.m2741getClear0nO6VwU(), 56, null);
                contentDrawScope.drawContent();
                androidx.compose.ui.graphics.drawscope.b.x(contentDrawScope, selectorColor, fMo348toPx0680j_4, jOffset, 0.0f, null, null, companion.m2769getXor0nO6VwU(), 56, null);
                androidx.compose.ui.graphics.drawscope.b.C(contentDrawScope, selectorColor, androidx.compose.ui.geometry.SizeKt.m2664getCenteruvyYCjk(contentDrawScope.mo3254getSizeNHjbRc()), Offset.m2589minusMKHz9U(jOffset, OffsetKt.Offset(((float) Math.cos(timePickerState.getCurrentAngle$material3_release().getValue().floatValue())) * fMo348toPx0680j_4, ((float) Math.sin(timePickerState.getCurrentAngle$material3_release().getValue().floatValue())) * fMo348toPx0680j_4)), contentDrawScope.mo348toPx0680j_4(timePickerTokens.m2323getClockDialSelectorTrackContainerWidthD9Ej5fM()), 0, null, 0.0f, null, companion.m2768getSrcOver0nO6VwU(), 240, null);
                androidx.compose.ui.graphics.drawscope.b.x(contentDrawScope, selectorColor, contentDrawScope.mo348toPx0680j_4(timePickerTokens.m2321getClockDialSelectorCenterContainerSizeD9Ej5fM()) / f, androidx.compose.ui.geometry.SizeKt.m2664getCenteruvyYCjk(contentDrawScope.mo3254getSizeNHjbRc()), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                androidx.compose.ui.graphics.drawscope.b.x(contentDrawScope, timePickerColors.m1689clockDialContentColorvNxB06k$material3_release(true), fMo348toPx0680j_4, jOffset, 0.0f, null, null, companion.m2751getDstOver0nO6VwU(), 56, null);
            }
        });
    }

    @Composable
    @ReadOnlyComposable
    /* JADX INFO: renamed from: numberContentDescription-YKJpE6Y, reason: not valid java name */
    public static final String m1708numberContentDescriptionYKJpE6Y(int i2, boolean z, int i3, Composer composer, int i4) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1826155772, i4, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1542)");
        }
        String strM1582getStringiSCLEhQ = Strings_androidKt.m1582getStringiSCLEhQ(Selection.m1484equalsimpl0(i2, Selection.INSTANCE.m1489getMinuteJiIwxys()) ? Strings.INSTANCE.m1575getTimePickerMinuteSuffixadMyvUU() : z ? Strings.INSTANCE.m1567getTimePicker24HourSuffixadMyvUU() : Strings.INSTANCE.m1571getTimePickerHourSuffixadMyvUU(), new Object[]{Integer.valueOf(i3)}, composer, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strM1582getStringiSCLEhQ;
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final TimePickerState rememberTimePickerState(final int i2, final int i3, final boolean z, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(1237715277);
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            z = TimeFormat_androidKt.is24HourFormat(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1237715277, i4, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:438)");
        }
        Object[] objArr = new Object[0];
        Saver<TimePickerState, ?> Saver = TimePickerState.INSTANCE.Saver();
        Integer numValueOf = Integer.valueOf(i2);
        Integer numValueOf2 = Integer.valueOf(i3);
        Boolean boolValueOf = Boolean.valueOf(z);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(numValueOf) | composer.changed(numValueOf2) | composer.changed(boolValueOf);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new kj.a<TimePickerState>() { // from class: androidx.compose.material3.TimePickerKt$rememberTimePickerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final TimePickerState m1723invoke() {
                    return new TimePickerState(i2, i3, z);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        TimePickerState timePickerState = (TimePickerState) RememberSaveableKt.m2460rememberSaveable(objArr, (Saver) Saver, (String) null, (kj.a) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return timePickerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: timeInputOnChange-gIWD5Rc, reason: not valid java name */
    public static final void m1709timeInputOnChangegIWD5Rc(int i2, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, int i3, l<? super TextFieldValue, j> lVar) {
        if (m.c(textFieldValue.getText(), textFieldValue2.getText())) {
            lVar.invoke(textFieldValue);
            return;
        }
        if (textFieldValue.getText().length() == 0) {
            if (Selection.m1484equalsimpl0(i2, Selection.INSTANCE.m1488getHourJiIwxys())) {
                timePickerState.setHour$material3_release(0);
            } else {
                timePickerState.setMinute$material3_release(0);
            }
            lVar.invoke(TextFieldValue.m5016copy3r_uNRQ$default(textFieldValue, "", 0L, (TextRange) null, 6, (Object) null));
            return;
        }
        try {
            int iR = (textFieldValue.getText().length() == 3 && TextRange.m4811getStartimpl(textFieldValue.getSelection()) == 1) ? li.c.r(textFieldValue.getText().charAt(0)) : Integer.parseInt(textFieldValue.getText());
            if (iR <= i3) {
                Selection.Companion companion = Selection.INSTANCE;
                if (Selection.m1484equalsimpl0(i2, companion.m1488getHourJiIwxys())) {
                    timePickerState.setHour$material3_release(iR);
                    if (iR > 1 && !timePickerState.getIs24hour()) {
                        timePickerState.m1737setSelectioniHAOin8$material3_release(companion.m1489getMinuteJiIwxys());
                    }
                } else {
                    timePickerState.setMinute$material3_release(iR);
                }
                if (textFieldValue.getText().length() > 2) {
                    textFieldValue = TextFieldValue.m5016copy3r_uNRQ$default(textFieldValue, String.valueOf(textFieldValue.getText().charAt(0)), 0L, (TextRange) null, 6, (Object) null);
                }
                lVar.invoke(textFieldValue);
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toLocalString(int i2, int i3) {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.setGroupingUsed(false);
        integerInstance.setMinimumIntegerDigits(i3);
        String str = integerInstance.format(Integer.valueOf(i2));
        m.g(str, "formatter.format(this)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Float, Float> valuesForAnimation(float f, float f2) {
        if (Math.abs(f - f2) <= 3.141592653589793d) {
            return new Pair<>(Float.valueOf(f), Float.valueOf(f2));
        }
        double d = f;
        if (d > 3.141592653589793d && f2 < 3.141592653589793d) {
            f2 += FullCircle;
        } else if (d < 3.141592653589793d && f2 > 3.141592653589793d) {
            f += FullCircle;
        }
        return new Pair<>(Float.valueOf(f), Float.valueOf(f2));
    }

    @Stable
    private static final Modifier visible(Modifier modifier, final boolean z) {
        return modifier.then(new VisibleModifier(z, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.material3.TimePickerKt$visible$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "visible").set("visible", Boolean.valueOf(z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$clockDial$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class C04202 extends Lambda implements q<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ boolean $autoSwitchToMinute;
        final /* synthetic */ TimePickerState $state;

        /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: TimePicker.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        @ej.c(c = "androidx.compose.material3.TimePickerKt$clockDial$2$2", f = "TimePicker.kt", l = {1255}, m = "invokeSuspend")
        public static final class C00982 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
            final /* synthetic */ boolean $autoSwitchToMinute;
            final /* synthetic */ float $maxDist;
            final /* synthetic */ MutableState<Float> $offsetX$delegate;
            final /* synthetic */ MutableState<Float> $offsetY$delegate;
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ TimePickerState $state;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: TimePicker.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
            @ej.c(c = "androidx.compose.material3.TimePickerKt$clockDial$2$2$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements q<PressGestureScope, Offset, dj.c<? super j>, Object> {
                final /* synthetic */ MutableState<Float> $offsetX$delegate;
                final /* synthetic */ MutableState<Float> $offsetY$delegate;
                /* synthetic */ long J$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(MutableState<Float> mutableState, MutableState<Float> mutableState2, dj.c<? super AnonymousClass1> cVar) {
                    super(3, cVar);
                    this.$offsetX$delegate = mutableState;
                    this.$offsetY$delegate = mutableState2;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return m1719invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).getPackedValue(), (dj.c) obj3);
                }

                /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
                public final Object m1719invoked4ec7I(PressGestureScope pressGestureScope, long j, dj.c<? super j> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$offsetX$delegate, this.$offsetY$delegate, cVar);
                    anonymousClass1.J$0 = j;
                    return anonymousClass1.invokeSuspend(j.a);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    li.c.O(obj);
                    long j = this.J$0;
                    C04202.invoke$lambda$2(this.$offsetX$delegate, Offset.m2585getXimpl(j));
                    C04202.invoke$lambda$5(this.$offsetY$delegate, Offset.m2586getYimpl(j));
                    return j.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00982(MutableState<Float> mutableState, MutableState<Float> mutableState2, CoroutineScope coroutineScope, TimePickerState timePickerState, float f, boolean z, dj.c<? super C00982> cVar) {
                super(2, cVar);
                this.$offsetX$delegate = mutableState;
                this.$offsetY$delegate = mutableState2;
                this.$scope = coroutineScope;
                this.$state = timePickerState;
                this.$maxDist = f;
                this.$autoSwitchToMinute = z;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                C00982 c00982 = new C00982(this.$offsetX$delegate, this.$offsetY$delegate, this.$scope, this.$state, this.$maxDist, this.$autoSwitchToMinute, cVar);
                c00982.L$0 = obj;
                return c00982;
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
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$offsetX$delegate, this.$offsetY$delegate, null);
                    final CoroutineScope coroutineScope = this.$scope;
                    final TimePickerState timePickerState = this.$state;
                    final float f = this.$maxDist;
                    final boolean z = this.$autoSwitchToMinute;
                    l<Offset, j> lVar = new l<Offset, j>() { // from class: androidx.compose.material3.TimePickerKt.clockDial.2.2.2

                        /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$2$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: TimePicker.kt */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                        @ej.c(c = "androidx.compose.material3.TimePickerKt$clockDial$2$2$2$1", f = "TimePicker.kt", l = {1261}, m = "invokeSuspend")
                        public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                            final /* synthetic */ boolean $autoSwitchToMinute;
                            final /* synthetic */ long $it;
                            final /* synthetic */ float $maxDist;
                            final /* synthetic */ TimePickerState $state;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(TimePickerState timePickerState, long j, float f, boolean z, dj.c<? super AnonymousClass1> cVar) {
                                super(2, cVar);
                                this.$state = timePickerState;
                                this.$it = j;
                                this.$maxDist = f;
                                this.$autoSwitchToMinute = z;
                            }

                            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                                return new AnonymousClass1(this.$state, this.$it, this.$maxDist, this.$autoSwitchToMinute, cVar);
                            }

                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    li.c.O(obj);
                                    TimePickerState timePickerState = this.$state;
                                    float fM2585getXimpl = Offset.m2585getXimpl(this.$it);
                                    float fM2586getYimpl = Offset.m2586getYimpl(this.$it);
                                    float f = this.$maxDist;
                                    boolean z = this.$autoSwitchToMinute;
                                    this.label = 1;
                                    if (timePickerState.onTap$material3_release(fM2585getXimpl, fM2586getYimpl, f, z, this) == coroutineSingletons) {
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
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m1720invokek4lQ0M(((Offset) obj2).getPackedValue());
                            return j.a;
                        }

                        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                        public final void m1720invokek4lQ0M(long j) {
                            BuildersKt.launch$default(coroutineScope, (dj.e) null, (CoroutineStart) null, new AnonymousClass1(timePickerState, j, f, z, null), 3, (Object) null);
                        }
                    };
                    this.label = 1;
                    if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, anonymousClass1, lVar, this, 3, null) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$3, reason: invalid class name */
        /* JADX INFO: compiled from: TimePicker.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        @ej.c(c = "androidx.compose.material3.TimePickerKt$clockDial$2$3", f = "TimePicker.kt", l = {1266}, m = "invokeSuspend")
        public static final class AnonymousClass3 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
            final /* synthetic */ boolean $autoSwitchToMinute;
            final /* synthetic */ float $maxDist;
            final /* synthetic */ MutableState<Float> $offsetX$delegate;
            final /* synthetic */ MutableState<Float> $offsetY$delegate;
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ TimePickerState $state;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(CoroutineScope coroutineScope, TimePickerState timePickerState, boolean z, float f, MutableState<Float> mutableState, MutableState<Float> mutableState2, dj.c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.$scope = coroutineScope;
                this.$state = timePickerState;
                this.$autoSwitchToMinute = z;
                this.$maxDist = f;
                this.$offsetX$delegate = mutableState;
                this.$offsetY$delegate = mutableState2;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$scope, this.$state, this.$autoSwitchToMinute, this.$maxDist, this.$offsetX$delegate, this.$offsetY$delegate, cVar);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
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
                    final CoroutineScope coroutineScope = this.$scope;
                    final TimePickerState timePickerState = this.$state;
                    final boolean z = this.$autoSwitchToMinute;
                    kj.a<j> aVar = new kj.a<j>() { // from class: androidx.compose.material3.TimePickerKt.clockDial.2.3.1

                        /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$3$1$1, reason: invalid class name and collision with other inner class name */
                        /* JADX INFO: compiled from: TimePicker.kt */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                        @ej.c(c = "androidx.compose.material3.TimePickerKt$clockDial$2$3$1$1", f = "TimePicker.kt", l = {1270, 1272}, m = "invokeSuspend")
                        public static final class C01001 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                            final /* synthetic */ boolean $autoSwitchToMinute;
                            final /* synthetic */ TimePickerState $state;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C01001(TimePickerState timePickerState, boolean z, dj.c<? super C01001> cVar) {
                                super(2, cVar);
                                this.$state = timePickerState;
                                this.$autoSwitchToMinute = z;
                            }

                            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                                return new C01001(this.$state, this.$autoSwitchToMinute, cVar);
                            }

                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    li.c.O(obj);
                                    int iM1734getSelectionJiIwxys$material3_release = this.$state.m1734getSelectionJiIwxys$material3_release();
                                    Selection.Companion companion = Selection.INSTANCE;
                                    if (Selection.m1484equalsimpl0(iM1734getSelectionJiIwxys$material3_release, companion.m1488getHourJiIwxys()) && this.$autoSwitchToMinute) {
                                        this.$state.m1737setSelectioniHAOin8$material3_release(companion.m1489getMinuteJiIwxys());
                                        TimePickerState timePickerState = this.$state;
                                        this.label = 1;
                                        if (timePickerState.animateToCurrent$material3_release(this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else if (Selection.m1484equalsimpl0(this.$state.m1734getSelectionJiIwxys$material3_release(), companion.m1489getMinuteJiIwxys())) {
                                        TimePickerState timePickerState2 = this.$state;
                                        this.label = 2;
                                        if (timePickerState2.settle(this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                } else {
                                    if (i2 != 1 && i2 != 2) {
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
                        {
                            super(0);
                        }

                        public /* bridge */ /* synthetic */ Object invoke() {
                            m1721invoke();
                            return j.a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m1721invoke() {
                            BuildersKt.launch$default(coroutineScope, (dj.e) null, (CoroutineStart) null, new C01001(timePickerState, z, null), 3, (Object) null);
                        }
                    };
                    final CoroutineScope coroutineScope2 = this.$scope;
                    final TimePickerState timePickerState2 = this.$state;
                    final float f = this.$maxDist;
                    final MutableState<Float> mutableState = this.$offsetX$delegate;
                    final MutableState<Float> mutableState2 = this.$offsetY$delegate;
                    p<PointerInputChange, Offset, j> pVar = new p<PointerInputChange, Offset, j>() { // from class: androidx.compose.material3.TimePickerKt.clockDial.2.3.2

                        /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$3$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: TimePicker.kt */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                        @ej.c(c = "androidx.compose.material3.TimePickerKt$clockDial$2$3$2$1", f = "TimePicker.kt", l = {1279}, m = "invokeSuspend")
                        public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                            final /* synthetic */ long $dragAmount;
                            final /* synthetic */ MutableState<Float> $offsetX$delegate;
                            final /* synthetic */ MutableState<Float> $offsetY$delegate;
                            final /* synthetic */ TimePickerState $state;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(long j, TimePickerState timePickerState, MutableState<Float> mutableState, MutableState<Float> mutableState2, dj.c<? super AnonymousClass1> cVar) {
                                super(2, cVar);
                                this.$dragAmount = j;
                                this.$state = timePickerState;
                                this.$offsetX$delegate = mutableState;
                                this.$offsetY$delegate = mutableState2;
                            }

                            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                                return new AnonymousClass1(this.$dragAmount, this.$state, this.$offsetX$delegate, this.$offsetY$delegate, cVar);
                            }

                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    li.c.O(obj);
                                    MutableState<Float> mutableState = this.$offsetX$delegate;
                                    C04202.invoke$lambda$2(mutableState, Offset.m2585getXimpl(this.$dragAmount) + C04202.invoke$lambda$1(mutableState));
                                    MutableState<Float> mutableState2 = this.$offsetY$delegate;
                                    C04202.invoke$lambda$5(mutableState2, Offset.m2586getYimpl(this.$dragAmount) + C04202.invoke$lambda$4(mutableState2));
                                    TimePickerState timePickerState = this.$state;
                                    float fAtan = TimePickerKt.atan(C04202.invoke$lambda$4(this.$offsetY$delegate) - IntOffset.m5386getYimpl(this.$state.m1733getCenternOccac$material3_release()), C04202.invoke$lambda$1(this.$offsetX$delegate) - IntOffset.m5385getXimpl(this.$state.m1733getCenternOccac$material3_release()));
                                    this.label = 1;
                                    if (TimePickerState.update$material3_release$default(timePickerState, fAtan, false, this, 2, null) == coroutineSingletons) {
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
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            m1722invokeUv8p0NA((PointerInputChange) obj2, ((Offset) obj3).getPackedValue());
                            return j.a;
                        }

                        /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
                        public final void m1722invokeUv8p0NA(PointerInputChange pointerInputChange, long j) {
                            m.h(pointerInputChange, "<anonymous parameter 0>");
                            BuildersKt.launch$default(coroutineScope2, (dj.e) null, (CoroutineStart) null, new AnonymousClass1(j, timePickerState2, mutableState, mutableState2, null), 3, (Object) null);
                            timePickerState2.moveSelector$material3_release(C04202.invoke$lambda$1(mutableState), C04202.invoke$lambda$4(mutableState2), f);
                        }
                    };
                    this.label = 1;
                    if (DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, aVar, null, pVar, this, 5, null) == coroutineSingletons) {
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
        public C04202(TimePickerState timePickerState, boolean z) {
            super(3);
            this.$state = timePickerState;
            this.$autoSwitchToMinute = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$lambda$1(MutableState<Float> mutableState) {
            return mutableState.getValue().floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(MutableState<Float> mutableState, float f) {
            mutableState.setValue(Float.valueOf(f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$lambda$4(MutableState<Float> mutableState) {
            return mutableState.getValue().floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$5(MutableState<Float> mutableState, float f) {
            mutableState.setValue(Float.valueOf(f));
        }

        private static final long invoke$lambda$7(MutableState<IntOffset> mutableState) {
            return mutableState.getValue().getPackedValue();
        }

        @Composable
        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            if (androidx.compose.animation.b.n(modifier, "$this$composed", composer, -1645090088)) {
                ComposerKt.traceEventStart(-1645090088, i2, -1, "androidx.compose.material3.clockDial.<anonymous> (TimePicker.kt:1244)");
            }
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m5376boximpl(IntOffset.INSTANCE.m5395getZeronOccac()), null, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue3;
            Object objD = s.d(composer, 773894976, -492369756);
            if (objD == companion.getEmpty()) {
                objD = androidx.appcompat.view.menu.a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
            }
            composer.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objD).getCoroutineScope();
            composer.endReplaceableGroup();
            float fMo348toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo348toPx0680j_4(TimePickerKt.MaxDistance);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            final TimePickerState timePickerState = this.$state;
            composer.startReplaceableGroup(1157296644);
            boolean zChanged = composer.changed(timePickerState);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new l<IntSize, j>() { // from class: androidx.compose.material3.TimePickerKt$clockDial$2$1$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m1718invokeozmzZPI(((IntSize) obj).getPackedValue());
                        return j.a;
                    }

                    /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m1718invokeozmzZPI(long j) {
                        timePickerState.m1736setCentergyyYBs$material3_release(IntSizeKt.m5433getCenterozmzZPI(j));
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(companion2, (l) objRememberedValue4), new Object[]{this.$state, IntOffset.m5376boximpl(invoke$lambda$7(mutableState3)), Float.valueOf(fMo348toPx0680j_4)}, (p<? super PointerInputScope, ? super dj.c<? super j>, ? extends Object>) new C00982(mutableState, mutableState2, coroutineScope, this.$state, fMo348toPx0680j_4, this.$autoSwitchToMinute, null)), new Object[]{this.$state, IntOffset.m5376boximpl(invoke$lambda$7(mutableState3)), Float.valueOf(fMo348toPx0680j_4)}, (p<? super PointerInputScope, ? super dj.c<? super j>, ? extends Object>) new AnonymousClass3(coroutineScope, this.$state, this.$autoSwitchToMinute, fMo348toPx0680j_4, mutableState, mutableState2, null));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierPointerInput;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
        }
    }
}
