package androidx.compose.material3;

import androidx.appcompat.widget.v;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.KeyboardArrowLeftKt;
import androidx.compose.material.icons.filled.KeyboardArrowRightKt;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.DatePickerModalTokens;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kj.l;
import kj.p;
import kj.q;
import kj.r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import qj.f;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0083\u0001\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aA\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0087\u0001\u0010%\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a9\u0010*\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00182\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\u0006H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001a;\u0010+\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b+\u0010,\u001a;\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b/\u00100\u001a]\u00107\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00104\u001a\u00020 2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106\u001aW\u0010;\u001a\u00020\u000b2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010.\u001a\u00020-2\u0006\u0010:\u001a\u0002092\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b;\u0010<\u001a#\u0010=\u001a\u00020\u000b2\u0006\u0010:\u001a\u0002092\u0006\u0010.\u001a\u00020-H\u0080@ø\u0001\u0001¢\u0006\u0004\b=\u0010>\u001a\u001f\u0010A\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bA\u0010B\u001ag\u0010H\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020C2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010F\u001a\u00020E2\u0006\u0010.\u001a\u00020-2\u0006\u0010G\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\bH\u0010I\u001a9\u0010O\u001a\u0004\u0018\u00010N2\u0006\u0010G\u001a\u00020\b2\u0006\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0003¢\u0006\u0004\bO\u0010P\u001ap\u0010W\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\b2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010S\u001a\u00020\b2\u0006\u0010T\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010U\u001a\u00020\b2\u0006\u0010V\u001a\u00020N2\u0006\u0010\u0011\u001a\u00020\u00102\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0003¢\u0006\u0004\bW\u0010X\u001a;\u0010[\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-H\u0003¢\u0006\u0004\b[\u0010\\\u001aX\u0010^\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\b2\u0006\u0010]\u001a\u00020\b2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010V\u001a\u00020N2\u0006\u0010\u0011\u001a\u00020\u00102\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0003¢\u0006\u0004\b^\u0010_\u001aa\u0010g\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010`\u001a\u00020\b2\u0006\u0010a\u001a\u00020\b2\u0006\u0010b\u001a\u00020\b2\u0006\u0010c\u001a\u00020N2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0003¢\u0006\u0004\bg\u0010h\u001aB\u0010j\u001a\u00020\u000b2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010i\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0003¢\u0006\u0004\bj\u0010k\u001a.\u0010s\u001a\b\u0012\u0004\u0012\u00020r0q2\u0006\u0010\u0001\u001a\u00020l2\u0006\u0010n\u001a\u00020m2\u0006\u0010o\u001a\u00020N2\u0006\u0010p\u001a\u00020NH\u0002\u001a\f\u0010t\u001a\u00020N*\u00020YH\u0000\"\u001d\u0010u\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u001d\u0010y\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\by\u0010v\u001a\u0004\bz\u0010x\"\u001d\u0010{\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b{\u0010v\u001a\u0004\b|\u0010x\"\u001c\u0010~\u001a\u00020}8\u0000X\u0080\u0004¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0016\u0010\u0082\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u007f\"\u0016\u0010\u0083\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u007f\"\u0019\u0010\u0084\u0001\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010v\"\u0017\u0010\u0085\u0001\u001a\u00020Y8\u0002X\u0082T¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0017\u0010\u0087\u0001\u001a\u00020Y8\u0002X\u0082T¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0086\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0088\u0001"}, d2 = {"Landroidx/compose/material3/DatePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function1;", "", "", "dateValidator", "Lkotlin/Function0;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "title", "headline", "showModeToggle", "Landroidx/compose/material3/DatePickerColors;", "colors", "DatePicker", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkj/l;Lkj/p;Lkj/p;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Lqj/f;", "yearRange", "Landroidx/compose/material3/DisplayMode;", "initialDisplayMode", "rememberDatePickerState-NVmSL94", "(Ljava/lang/Long;Ljava/lang/Long;Lqj/f;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DatePickerState;", "rememberDatePickerState", "modeToggleButton", "Landroidx/compose/ui/text/TextStyle;", "headlineTextStyle", "Landroidx/compose/ui/unit/Dp;", "headerMinHeight", "content", "DateEntryContainer-au3_HiA", "(Landroidx/compose/ui/Modifier;Lkj/p;Lkj/p;Lkj/p;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/text/TextStyle;FLkj/p;Landroidx/compose/runtime/Composer;I)V", "DateEntryContainer", "displayMode", "onDisplayModeChange", "DisplayModeToggleButton-tER2X8s", "(Landroidx/compose/ui/Modifier;ILkj/l;Landroidx/compose/runtime/Composer;I)V", "DisplayModeToggleButton", "SwitchableDateEntryContent", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/material3/DatePickerFormatter;Lkj/l;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material3/StateData;", "stateData", "DatePickerContent", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkj/l;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "titleContentColor", "headlineContentColor", "minHeight", "DatePickerHeader-pc5RIQQ", "(Landroidx/compose/ui/Modifier;Lkj/p;JJFLkj/p;Landroidx/compose/runtime/Composer;I)V", "DatePickerHeader", "onDateSelected", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "HorizontalMonthsList", "(Lkj/l;Landroidx/compose/material3/StateData;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/material3/DatePickerFormatter;Lkj/l;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "updateDisplayedMonth", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/material3/StateData;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/material3/CalendarModel;", "calendarModel", "WeekDays", "(Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/CalendarModel;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material3/CalendarMonth;", "month", "Landroidx/compose/material3/CalendarDate;", "today", "rangeSelectionEnabled", "Month", "(Landroidx/compose/material3/CalendarMonth;Lkj/l;Landroidx/compose/material3/CalendarDate;Landroidx/compose/material3/StateData;ZLkj/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "isToday", "isStartDate", "isEndDate", "isInRange", "", "dayContentDescription", "(ZZZZZLandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "selected", "onClick", "animateChecked", "enabled", "inRange", "description", "Day", "(Landroidx/compose/ui/Modifier;ZLkj/a;ZZZZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lkj/p;Landroidx/compose/runtime/Composer;I)V", "", "onYearSelected", "YearPicker", "(Landroidx/compose/ui/Modifier;Lkj/l;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/StateData;Landroidx/compose/runtime/Composer;I)V", "currentYear", "Year", "(Landroidx/compose/ui/Modifier;ZZLkj/a;Ljava/lang/String;Landroidx/compose/material3/DatePickerColors;Lkj/p;Landroidx/compose/runtime/Composer;I)V", "nextAvailable", "previousAvailable", "yearPickerVisible", "yearPickerText", "onNextClicked", "onPreviousClicked", "onYearPickerButtonClicked", "MonthsNavigation", "(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lkj/a;Lkj/a;Lkj/a;Landroidx/compose/runtime/Composer;I)V", "expanded", "YearPickerMenuButton", "(Lkj/a;ZLandroidx/compose/ui/Modifier;Lkj/p;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "scrollUpLabel", "scrollDownLabel", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "customScrollActions", "toLocalString", "RecommendedSizeForAccessibility", "F", "getRecommendedSizeForAccessibility", "()F", "MonthYearHeight", "getMonthYearHeight", "DatePickerHorizontalPadding", "getDatePickerHorizontalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerModeTogglePadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getDatePickerModeTogglePadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerTitlePadding", "DatePickerHeadlinePadding", "YearsVerticalPadding", "MaxCalendarRows", "I", "YearsInRow", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class DatePickerKt {
    private static final PaddingValues DatePickerHeadlinePadding;
    private static final float DatePickerHorizontalPadding;
    private static final PaddingValues DatePickerModeTogglePadding;
    private static final PaddingValues DatePickerTitlePadding;
    private static final int MaxCalendarRows = 6;
    private static final int YearsInRow = 3;
    private static final float YearsVerticalPadding;
    private static final float RecommendedSizeForAccessibility = Dp.m5267constructorimpl(48);
    private static final float MonthYearHeight = Dp.m5267constructorimpl(56);

    static {
        float f = 12;
        DatePickerHorizontalPadding = Dp.m5267constructorimpl(f);
        DatePickerModeTogglePadding = PaddingKt.m458PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m5267constructorimpl(f), Dp.m5267constructorimpl(f), 3, null);
        float f2 = 24;
        float f3 = 16;
        DatePickerTitlePadding = PaddingKt.m458PaddingValuesa9UjIt4$default(Dp.m5267constructorimpl(f2), Dp.m5267constructorimpl(f3), Dp.m5267constructorimpl(f), 0.0f, 8, null);
        DatePickerHeadlinePadding = PaddingKt.m458PaddingValuesa9UjIt4$default(Dp.m5267constructorimpl(f2), 0.0f, Dp.m5267constructorimpl(f), Dp.m5267constructorimpl(f), 2, null);
        YearsVerticalPadding = Dp.m5267constructorimpl(f3);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: DateEntryContainer-au3_HiA, reason: not valid java name */
    public static final void m1203DateEntryContainerau3_HiA(final Modifier modifier, final p<? super Composer, ? super Integer, j> pVar, final p<? super Composer, ? super Integer, j> pVar2, final p<? super Composer, ? super Integer, j> pVar3, final DatePickerColors datePickerColors, final TextStyle textStyle, final float f, final p<? super Composer, ? super Integer, j> pVar4, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        m.h(modifier, "modifier");
        m.h(datePickerColors, "colors");
        m.h(textStyle, "headlineTextStyle");
        m.h(pVar4, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1507356255);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar2) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar3) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((i2 & 57344) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerColors) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar4) ? 8388608 : 4194304;
        }
        final int i4 = i3;
        if ((23967451 & i4) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1507356255, i4, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1011)");
            }
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(SizeKt.m508sizeInqDBjuR0$default(modifier, DatePickerModalTokens.INSTANCE.m1943getContainerWidthD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return j.a;
                }

                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    m.h(semanticsPropertyReceiver, "$this$semantics");
                    SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                }
            }, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyC = a.b.c(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierSemantics$default);
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
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl, measurePolicyC, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            m1204DatePickerHeaderpc5RIQQ(Modifier.INSTANCE, pVar, datePickerColors.getTitleContentColor(), datePickerColors.getHeadlineContentColor(), f, ComposableLambdaKt.composableLambda(composer2, -229007058, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    final int i6;
                    if ((i5 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-229007058, i5, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1032)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    final p<Composer, Integer, j> pVar5 = pVar2;
                    p<Composer, Integer, j> pVar6 = pVar3;
                    p<Composer, Integer, j> pVar7 = pVar;
                    TextStyle textStyle2 = textStyle;
                    int i7 = i4;
                    composer3.startReplaceableGroup(-483455358);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC2 = a.b.c(companion3, top, composer3, 0, -1323940314);
                    Density density2 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    kj.a<ComposeUiNode> constructor2 = companion4.getConstructor();
                    q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf2 = LayoutKt.materializerOf(modifierFillMaxWidth$default);
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
                    androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf2, androidx.appcompat.app.m.d(companion4, composerM2437constructorimpl2, measurePolicyC2, composerM2437constructorimpl2, density2, composerM2437constructorimpl2, layoutDirection2, composerM2437constructorimpl2, viewConfiguration2, composer3, composer3), composer3, 2058660585);
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Arrangement.Horizontal start = (pVar5 == null || pVar6 == null) ? pVar5 != null ? arrangement.getStart() : arrangement.getEnd() : arrangement.getSpaceBetween();
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    Alignment.Vertical centerVertically = companion3.getCenterVertically();
                    composer3.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, 48);
                    Density density3 = (Density) v.d(composer3, -1323940314);
                    LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    kj.a<ComposeUiNode> constructor3 = companion4.getConstructor();
                    q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxWidth$default2);
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
                    androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf3, androidx.appcompat.app.m.d(companion4, composerM2437constructorimpl3, measurePolicyRowMeasurePolicy, composerM2437constructorimpl3, density3, composerM2437constructorimpl3, layoutDirection3, composerM2437constructorimpl3, viewConfiguration3, composer3, composer3), composer3, 2058660585);
                    final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-1011378861);
                    if (pVar5 != null) {
                        i6 = i7;
                        TextKt.ProvideTextStyle(textStyle2, ComposableLambdaKt.composableLambda(composer3, -962031352, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$2$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                    ComposerKt.traceEventStart(-962031352, i8, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1045)");
                                }
                                Modifier modifierA = e.a(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                                p<Composer, Integer, j> pVar8 = pVar5;
                                int i9 = i6;
                                composer4.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyB = android.support.v4.media.a.b(Alignment.INSTANCE, false, composer4, 0, -1323940314);
                                Density density4 = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection4 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                kj.a<ComposeUiNode> constructor4 = companion5.getConstructor();
                                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf4 = LayoutKt.materializerOf(modifierA);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor4);
                                } else {
                                    composer4.useNode();
                                }
                                composer4.disableReusing();
                                Composer composerM2437constructorimpl4 = Updater.m2437constructorimpl(composer4);
                                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf4, androidx.appcompat.app.m.d(companion5, composerM2437constructorimpl4, measurePolicyB, composerM2437constructorimpl4, density4, composerM2437constructorimpl4, layoutDirection4, composerM2437constructorimpl4, viewConfiguration4, composer4, composer4), composer4, 2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                if (androidx.compose.animation.b.m((i9 >> 6) & 14, pVar8, composer4)) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer3, ((i6 >> 15) & 14) | 48);
                    } else {
                        i6 = i7;
                    }
                    composer3.endReplaceableGroup();
                    composer3.startReplaceableGroup(1449812209);
                    if (pVar6 != null) {
                        pVar6.invoke(composer3, Integer.valueOf((i6 >> 9) & 14));
                    }
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.startReplaceableGroup(1680507480);
                    if (pVar7 != null || pVar5 != null || pVar6 != null) {
                        DividerKt.m1261Divider9IZ8Weo(null, 0.0f, 0L, composer3, 0, 7);
                    }
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, 196614 | (i4 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i4 >> 6) & 57344));
            if (androidx.compose.animation.b.m((i4 >> 21) & 14, pVar4, composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer3, int i5) {
                DatePickerKt.m1203DateEntryContainerau3_HiA(modifier, pVar, pVar2, pVar3, datePickerColors, textStyle, f, pVar4, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DatePicker(final androidx.compose.material3.DatePickerState r56, androidx.compose.ui.Modifier r57, androidx.compose.material3.DatePickerFormatter r58, kj.l<? super java.lang.Long, java.lang.Boolean> r59, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r60, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r61, boolean r62, androidx.compose.material3.DatePickerColors r63, androidx.compose.runtime.Composer r64, final int r65, final int r66) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.DatePicker(androidx.compose.material3.DatePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.DatePickerFormatter, kj.l, kj.p, kj.p, boolean, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DatePickerContent(final StateData stateData, final DatePickerFormatter datePickerFormatter, final l<? super Long, Boolean> lVar, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1512850300);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(stateData) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerFormatter) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(lVar) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerColors) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        final int i4 = i3;
        if ((i4 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1512850300, i4, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1124)");
            }
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(stateData.getDisplayedMonthIndex(), 0, composerStartRestartGroup, 0, 2);
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
            boolean zChanged = composerStartRestartGroup.changed(stateData);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new l<Long, j>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$onDateSelected$1$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Number) obj).longValue());
                        return j.a;
                    }

                    public final void invoke(long j) {
                        stateData.getSelectedStartDate().setValue(stateData.getCalendarModel().getCanonicalDate(j));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            l lVar2 = (l) objRememberedValue2;
            final MutableState mutableState = (MutableState) RememberSaveableKt.m2460rememberSaveable(new Object[0], (Saver) null, (String) null, (kj.a) new kj.a<MutableState<Boolean>>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$yearPickerVisible$2
                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final MutableState<Boolean> m1211invoke() {
                    return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                }
            }, composerStartRestartGroup, 3080, 6);
            Locale localeDefaultLocale = CalendarModel_androidKt.defaultLocale(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC = a.b.c(companion3, top, composerStartRestartGroup, 0, -1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion4.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(companion2);
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
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion4, composerM2437constructorimpl, measurePolicyC, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f = DatePickerHorizontalPadding;
            Modifier modifierM463paddingVpY3zN4$default = PaddingKt.m463paddingVpY3zN4$default(companion2, f, 0.0f, 2, null);
            boolean canScrollForward = lazyListStateRememberLazyListState.getCanScrollForward();
            boolean canScrollBackward = lazyListStateRememberLazyListState.getCanScrollBackward();
            boolean zDatePickerContent$lambda$5 = DatePickerContent$lambda$5(mutableState);
            String monthYear$material3_release = datePickerFormatter.formatMonthYear$material3_release(stateData.getDisplayedMonth(), stateData.getCalendarModel(), localeDefaultLocale);
            if (monthYear$material3_release == null) {
                monthYear$material3_release = "-";
            }
            String str = monthYear$material3_release;
            kj.a<j> aVar = new kj.a<j>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$1$1

                /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$1$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: DatePicker.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                @ej.c(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$1$1", f = "DatePicker.kt", l = {1155}, m = "invokeSuspend")
                public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                    final /* synthetic */ LazyListState $monthsListState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(LazyListState lazyListState, dj.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$monthsListState = lazyListState;
                    }

                    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                        return new AnonymousClass1(this.$monthsListState, cVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            li.c.O(obj);
                            LazyListState lazyListState = this.$monthsListState;
                            int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() + 1;
                            this.label = 1;
                            if (LazyListState.animateScrollToItem$default(lazyListState, firstVisibleItemIndex, 0, this, 2, null) == coroutineSingletons) {
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
                    m1208invoke();
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m1208invoke() {
                    BuildersKt.launch$default(coroutineScope, (dj.e) null, (CoroutineStart) null, new AnonymousClass1(lazyListStateRememberLazyListState, null), 3, (Object) null);
                }
            };
            kj.a<j> aVar2 = new kj.a<j>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$1$2

                /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: DatePicker.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                @ej.c(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$2$1", f = "DatePicker.kt", l = {1162}, m = "invokeSuspend")
                public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                    final /* synthetic */ LazyListState $monthsListState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(LazyListState lazyListState, dj.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$monthsListState = lazyListState;
                    }

                    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                        return new AnonymousClass1(this.$monthsListState, cVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            li.c.O(obj);
                            LazyListState lazyListState = this.$monthsListState;
                            int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() - 1;
                            this.label = 1;
                            if (LazyListState.animateScrollToItem$default(lazyListState, firstVisibleItemIndex, 0, this, 2, null) == coroutineSingletons) {
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
                    m1209invoke();
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m1209invoke() {
                    BuildersKt.launch$default(coroutineScope, (dj.e) null, (CoroutineStart) null, new AnonymousClass1(lazyListStateRememberLazyListState, null), 3, (Object) null);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new kj.a<j>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$1$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        m1210invoke();
                        return j.a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m1210invoke() {
                        DatePickerKt.DatePickerContent$lambda$6(mutableState, !DatePickerKt.DatePickerContent$lambda$5(r0));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MonthsNavigation(modifierM463paddingVpY3zN4$default, canScrollForward, canScrollBackward, zDatePickerContent$lambda$5, str, aVar, aVar2, (kj.a) objRememberedValue3, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyB = android.support.v4.media.a.b(companion3, false, composerStartRestartGroup, 0, -1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            kj.a<ComposeUiNode> constructor2 = companion4.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf2 = LayoutKt.materializerOf(companion2);
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
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf2, androidx.appcompat.app.m.d(companion4, composerM2437constructorimpl2, measurePolicyB, composerM2437constructorimpl2, density2, composerM2437constructorimpl2, layoutDirection2, composerM2437constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM463paddingVpY3zN4$default2 = PaddingKt.m463paddingVpY3zN4$default(companion2, f, 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyC2 = a.b.c(companion3, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            kj.a<ComposeUiNode> constructor3 = companion4.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf3 = LayoutKt.materializerOf(modifierM463paddingVpY3zN4$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2437constructorimpl3 = Updater.m2437constructorimpl(composerStartRestartGroup);
            qVarMaterializerOf3.invoke(androidx.appcompat.app.m.d(companion4, composerM2437constructorimpl3, measurePolicyC2, composerM2437constructorimpl3, density3, composerM2437constructorimpl3, layoutDirection3, composerM2437constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            WeekDays(datePickerColors, stateData.getCalendarModel(), composerStartRestartGroup, (i4 >> 9) & 14);
            int i5 = i4 << 6;
            HorizontalMonthsList(lVar2, stateData, lazyListStateRememberLazyListState, datePickerFormatter, lVar, datePickerColors, composerStartRestartGroup, ((i4 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i5 & 7168) | (57344 & i5) | (i5 & 458752));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            boolean zDatePickerContent$lambda$52 = DatePickerContent$lambda$5(mutableState);
            Modifier modifierClipToBounds = ClipKt.clipToBounds(companion2);
            EnterTransition enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.6f, 1, null));
            ExitTransition exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 760161496, true, new q<AnimatedVisibilityScope, Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return j.a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, int i6) {
                    m.h(animatedVisibilityScope, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(760161496, i6, -1, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1186)");
                    }
                    final String strM1581getStringNWtq28 = Strings_androidKt.m1581getStringNWtq28(Strings.INSTANCE.m1547getDatePickerYearPickerPaneTitleadMyvUU(), composer3, 6);
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    composer3.startReplaceableGroup(1157296644);
                    boolean zChanged3 = composer3.changed(strM1581getStringNWtq28);
                    Object objRememberedValue4 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2$1$1
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
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM1581getStringNWtq28);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    composer3.endReplaceableGroup();
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion5, false, (l) objRememberedValue4, 1, null);
                    DatePickerColors datePickerColors2 = datePickerColors;
                    final StateData stateData2 = stateData;
                    int i7 = i4;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    final MutableState<Boolean> mutableState2 = mutableState;
                    final LazyListState lazyListState = lazyListStateRememberLazyListState;
                    composer3.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyC3 = a.b.c(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer3, 0, -1323940314);
                    Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection4 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration4 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    kj.a<ComposeUiNode> constructor4 = companion6.getConstructor();
                    q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf4 = LayoutKt.materializerOf(modifierSemantics$default);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer composerM2437constructorimpl4 = Updater.m2437constructorimpl(composer3);
                    androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf4, androidx.appcompat.app.m.d(companion6, composerM2437constructorimpl4, measurePolicyC3, composerM2437constructorimpl4, density4, composerM2437constructorimpl4, layoutDirection4, composerM2437constructorimpl4, viewConfiguration4, composer3, composer3), composer3, 2058660585);
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    DatePickerKt.YearPicker(PaddingKt.m463paddingVpY3zN4$default(SizeKt.m493requiredHeight3ABfNKs(companion5, Dp.m5267constructorimpl(Dp.m5267constructorimpl(DatePickerKt.getRecommendedSizeForAccessibility() * 7) - DividerDefaults.INSTANCE.m1260getThicknessD9Ej5fM())), DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, null), new l<Integer, j>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2$2$1

                        /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2$2$1$1, reason: invalid class name */
                        /* JADX INFO: compiled from: DatePicker.kt */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                        @ej.c(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2$2$1$1", f = "DatePicker.kt", l = {1212}, m = "invokeSuspend")
                        public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                            final /* synthetic */ LazyListState $monthsListState;
                            final /* synthetic */ StateData $stateData;
                            final /* synthetic */ int $year;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(StateData stateData, LazyListState lazyListState, int i2, dj.c<? super AnonymousClass1> cVar) {
                                super(2, cVar);
                                this.$stateData = stateData;
                                this.$monthsListState = lazyListState;
                                this.$year = i2;
                            }

                            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                                return new AnonymousClass1(this.$stateData, this.$monthsListState, this.$year, cVar);
                            }

                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    li.c.O(obj);
                                    StateData stateData = this.$stateData;
                                    LazyListState lazyListState = this.$monthsListState;
                                    int month = (stateData.getDisplayedMonth().getMonth() + ((this.$year - ((qj.d) stateData.getYearRange()).a) * 12)) - 1;
                                    this.label = 1;
                                    if (LazyListState.scrollToItem$default(lazyListState, month, 0, this, 2, null) == coroutineSingletons) {
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

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke(((Number) obj).intValue());
                            return j.a;
                        }

                        public final void invoke(int i8) {
                            DatePickerKt.DatePickerContent$lambda$6(mutableState2, !DatePickerKt.DatePickerContent$lambda$5(r0));
                            BuildersKt.launch$default(coroutineScope2, (dj.e) null, (CoroutineStart) null, new AnonymousClass1(stateData2, lazyListState, i8, null), 3, (Object) null);
                        }
                    }, datePickerColors2, stateData2, composer3, ((i7 >> 3) & 896) | 6 | ((i7 << 9) & 7168));
                    DividerKt.m1261Divider9IZ8Weo(null, 0.0f, 0L, composer3, 0, 7);
                    if (android.support.v4.media.a.p(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            composer2 = composerStartRestartGroup;
            AnimatedVisibilityKt.AnimatedVisibility(zDatePickerContent$lambda$52, modifierClipToBounds, enterTransitionPlus, exitTransitionPlus, (String) null, composableLambda, composer2, 200112, 16);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
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
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.DatePickerContent.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer3, int i6) {
                DatePickerKt.DatePickerContent(stateData, datePickerFormatter, lVar, datePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DatePickerContent$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DatePickerContent$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: DatePickerHeader-pc5RIQQ, reason: not valid java name */
    public static final void m1204DatePickerHeaderpc5RIQQ(final Modifier modifier, final p<? super Composer, ? super Integer, j> pVar, final long j, final long j2, final float f, final p<? super Composer, ? super Integer, j> pVar2, Composer composer, final int i2) {
        final int i3;
        m.h(modifier, "modifier");
        m.h(pVar2, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-996037719);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar2) ? 131072 : 65536;
        }
        if ((374491 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-996037719, i3, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1228)");
            }
            Modifier modifierThen = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null).then(pVar != null ? SizeKt.m489defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, f, 1, null) : Modifier.INSTANCE);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierThen);
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
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl, measurePolicyColumnMeasurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1127524835);
            if (pVar != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2808boximpl(j))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1005061498, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerHeader$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                            ComposerKt.traceEventStart(1005061498, i4, -1, "androidx.compose.material3.DatePickerHeader.<anonymous>.<anonymous> (DatePicker.kt:1250)");
                        }
                        TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), DatePickerModalTokens.INSTANCE.getHeaderSupportingTextFont());
                        final p<Composer, Integer, j> pVar3 = pVar;
                        final int i5 = i3;
                        TextKt.ProvideTextStyle(textStyleFromToken, ComposableLambdaKt.composableLambda(composer2, -2006650069, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerHeader$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                    ComposerKt.traceEventStart(-2006650069, i6, -1, "androidx.compose.material3.DatePickerHeader.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1255)");
                                }
                                Alignment bottomStart = Alignment.INSTANCE.getBottomStart();
                                p<Composer, Integer, j> pVar4 = pVar3;
                                int i7 = i5;
                                composer3.startReplaceableGroup(733328855);
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomStart, false, composer3, 6);
                                Density density2 = (Density) v.d(composer3, -1323940314);
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                kj.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf2 = LayoutKt.materializerOf(companion2);
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
                                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf2, androidx.appcompat.app.m.d(companion3, composerM2437constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM2437constructorimpl2, density2, composerM2437constructorimpl2, layoutDirection2, composerM2437constructorimpl2, viewConfiguration2, composer3, composer3), composer3, 2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                if (androidx.compose.animation.b.m((i7 >> 3) & 14, pVar4, composer3)) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 56);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2808boximpl(j2))}, pVar2, composerStartRestartGroup, ((i3 >> 12) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerHeader$2
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
                DatePickerKt.m1204DatePickerHeaderpc5RIQQ(modifier, pVar, j, j2, f, pVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Day(final Modifier modifier, final boolean z, final kj.a<j> aVar, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final String str, final DatePickerColors datePickerColors, final p<? super Composer, ? super Integer, j> pVar, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1434777861);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(aVar) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((i2 & 57344) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(z5) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerColors) ? 67108864 : 33554432;
        }
        if ((1879048192 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar) ? 536870912 : 268435456;
        }
        final int i4 = i3;
        if ((1533916891 & i4) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1434777861, i4, -1, "androidx.compose.material3.Day (DatePicker.kt:1570)");
            }
            Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier);
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
            Modifier modifierM498requiredSizeVpY3zN4 = SizeKt.m498requiredSizeVpY3zN4(modifierMinimumInteractiveComponentSize, datePickerModalTokens.m1947getDateStateLayerWidthD9Ej5fM(), datePickerModalTokens.m1946getDateStateLayerHeightD9Ej5fM());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(str);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DatePickerKt$Day$1$1
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
                        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(str, null, null, 6, null));
                        SemanticsPropertiesKt.m4654setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m4640getButtono7Vup1c());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierM498requiredSizeVpY3zN4, true, (l) objRememberedValue);
            Shape shape = ShapesKt.toShape(datePickerModalTokens.getDateContainerShape(), composerStartRestartGroup, 6);
            int i5 = i4 >> 3;
            int i6 = i5 & 14;
            int i7 = i4 >> 15;
            long jM2828unboximpl = datePickerColors.dayContainerColor$material3_release(z, z3, z2, composerStartRestartGroup, i6 | ((i4 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i5 & 896) | (i7 & 7168)).getValue().m2828unboximpl();
            int i8 = (i7 & 14) | (i4 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            int i9 = i4 >> 12;
            int i10 = i5 & 7168;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m1591Surfaced85dljk(z, aVar, modifierSemantics, z3, shape, jM2828unboximpl, datePickerColors.dayContentColor$material3_release(z4, z, z5, z3, composerStartRestartGroup, i8 | (i9 & 896) | i10 | (i9 & 57344)).getValue().m2828unboximpl(), 0.0f, 0.0f, (!z4 || z) ? null : BorderStrokeKt.m201BorderStrokecXLIe8U(datePickerModalTokens.m1948getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.getTodayDateBorderColor()), (MutableInteractionSource) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2031780827, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.Day.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return j.a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer3, int i11) {
                    if ((i11 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2031780827, i11, -1, "androidx.compose.material3.Day.<anonymous> (DatePicker.kt:1619)");
                    }
                    Alignment center = Alignment.INSTANCE.getCenter();
                    p<Composer, Integer, j> pVar2 = pVar;
                    int i12 = i4;
                    composer3.startReplaceableGroup(733328855);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                    Density density = (Density) v.d(composer3, -1323940314);
                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    kj.a<ComposeUiNode> constructor = companion2.getConstructor();
                    q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(companion);
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
                    androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion2, composerM2437constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (androidx.compose.animation.b.m((i12 >> 27) & 14, pVar2, composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, i6 | (i5 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | i10, 48, 1408);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.Day.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer3, int i11) {
                DatePickerKt.Day(modifier, z, aVar, z2, z3, z4, z5, str, datePickerColors, pVar, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: DisplayModeToggleButton-tER2X8s, reason: not valid java name */
    public static final void m1205DisplayModeToggleButtontER2X8s(final Modifier modifier, final int i2, final l<? super DisplayMode, j> lVar, Composer composer, final int i3) {
        int i4;
        m.h(modifier, "modifier");
        m.h(lVar, "onDisplayModeChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1393846115);
        if ((i3 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(lVar) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i4 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1393846115, i4, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1065)");
            }
            if (DisplayMode.m1254equalsimpl0(i2, DisplayMode.INSTANCE.m1259getPickerjFl4v0())) {
                composerStartRestartGroup.startReplaceableGroup(-1814971324);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged = composerStartRestartGroup.changed(lVar);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new kj.a<j>() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        public /* bridge */ /* synthetic */ Object invoke() {
                            m1212invoke();
                            return j.a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m1212invoke() {
                            lVar.invoke(DisplayMode.m1251boximpl(DisplayMode.INSTANCE.m1258getInputjFl4v0()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                IconButtonKt.IconButton((kj.a) objRememberedValue, modifier, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m1173getLambda1$material3_release(), composerStartRestartGroup, ((i4 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 196608, 28);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1814971040);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged2 = composerStartRestartGroup.changed(lVar);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new kj.a<j>() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        public /* bridge */ /* synthetic */ Object invoke() {
                            m1213invoke();
                            return j.a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m1213invoke() {
                            lVar.invoke(DisplayMode.m1251boximpl(DisplayMode.INSTANCE.m1259getPickerjFl4v0()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                IconButtonKt.IconButton((kj.a) objRememberedValue2, modifier, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m1174getLambda2$material3_release(), composerStartRestartGroup, ((i4 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 196608, 28);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i5) {
                DatePickerKt.m1205DisplayModeToggleButtontER2X8s(modifier, i2, lVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HorizontalMonthsList(final l<? super Long, j> lVar, final StateData stateData, final LazyListState lazyListState, final DatePickerFormatter datePickerFormatter, final l<? super Long, Boolean> lVar2, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        Composer composer2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1933363608);
        int i3 = (i2 & 14) == 0 ? (composerStartRestartGroup.changedInstance(lVar) ? 4 : 2) | i2 : i2;
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(stateData) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(lazyListState) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerFormatter) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(lVar2) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerColors) ? 131072 : 65536;
        }
        final int i4 = i3;
        if ((374491 & i4) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1933363608, i4, -1, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1273)");
            }
            final CalendarDate today = stateData.getCalendarModel().getToday();
            f yearRange = stateData.getYearRange();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(yearRange);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = stateData.getCalendarModel().getMonth(((qj.d) stateData.getYearRange()).a, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final CalendarMonth calendarMonth = (CalendarMonth) objRememberedValue;
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return j.a;
                }

                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    m.h(semanticsPropertyReceiver, "$this$semantics");
                    SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new kj.a<Float>() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1.1
                        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                        public final Float m1214invoke() {
                            return Float.valueOf(0.0f);
                        }
                    }, new kj.a<Float>() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1.2
                        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                        public final Float m1215invoke() {
                            return Float.valueOf(0.0f);
                        }
                    }, false, 4, null));
                }
            }, 1, null);
            int i5 = (i4 >> 6) & 14;
            boolean zChanged2 = false;
            FlingBehavior flingBehaviorRememberSnapFlingBehavior$material3_release = DatePickerDefaults.INSTANCE.rememberSnapFlingBehavior$material3_release(lazyListState, null, composerStartRestartGroup, i5 | 384, 2);
            Object[] objArr = {stateData, calendarMonth, lVar, today, lVar2, datePickerFormatter, datePickerColors};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            for (int i6 = 0; i6 < 7; i6++) {
                zChanged2 |= composerStartRestartGroup.changed(objArr[i6]);
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                composer2 = composerStartRestartGroup;
                l<LazyListScope, j> lVar3 = new l<LazyListScope, j>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((LazyListScope) obj);
                        return j.a;
                    }

                    public final void invoke(LazyListScope lazyListScope) {
                        m.h(lazyListScope, "$this$LazyRow");
                        int totalMonthsInRange = stateData.getTotalMonthsInRange();
                        final StateData stateData2 = stateData;
                        final CalendarMonth calendarMonth2 = calendarMonth;
                        final l<Long, j> lVar4 = lVar;
                        final CalendarDate calendarDate = today;
                        final l<Long, Boolean> lVar5 = lVar2;
                        final DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                        final DatePickerColors datePickerColors2 = datePickerColors;
                        final int i7 = i4;
                        LazyListScope.CC.k(lazyListScope, totalMonthsInRange, null, null, ComposableLambdaKt.composableLambdaInstance(-65053693, true, new r<LazyItemScope, Integer, Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(4);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                return j.a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(LazyItemScope lazyItemScope, int i8, Composer composer4, int i9) {
                                int i10;
                                m.h(lazyItemScope, "$this$items");
                                if ((i9 & 14) == 0) {
                                    i10 = (composer4.changed(lazyItemScope) ? 4 : 2) | i9;
                                } else {
                                    i10 = i9;
                                }
                                if ((i9 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                                    i10 |= composer4.changed(i8) ? 32 : 16;
                                }
                                if ((i10 & 731) == 146 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-65053693, i9, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1300)");
                                }
                                CalendarMonth calendarMonthPlusMonths = stateData2.getCalendarModel().plusMonths(calendarMonth2, i8);
                                Modifier modifierD = androidx.compose.foundation.lazy.a.d(lazyItemScope, Modifier.INSTANCE, 0.0f, 1, null);
                                l<Long, j> lVar6 = lVar4;
                                CalendarDate calendarDate2 = calendarDate;
                                StateData stateData3 = stateData2;
                                l<Long, Boolean> lVar7 = lVar5;
                                DatePickerFormatter datePickerFormatter3 = datePickerFormatter2;
                                DatePickerColors datePickerColors3 = datePickerColors2;
                                int i11 = i7;
                                composer4.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyB = android.support.v4.media.a.b(Alignment.INSTANCE, false, composer4, 0, -1323940314);
                                Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                kj.a<ComposeUiNode> constructor = companion.getConstructor();
                                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierD);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                composer4.disableReusing();
                                Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composer4);
                                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl, measurePolicyB, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer4, composer4), composer4, 2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                int i12 = i11 << 3;
                                int i13 = i11 << 6;
                                DatePickerKt.Month(calendarMonthPlusMonths, lVar6, calendarDate2, stateData3, false, lVar7, datePickerFormatter3, datePickerColors3, composer4, (i12 & 458752) | (i12 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 24576 | (i13 & 7168) | ((i11 << 9) & 3670016) | (29360128 & i13));
                                if (android.support.v4.media.a.p(composer4)) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 6, null);
                    }
                };
                composer2.updateRememberedValue(lVar3);
                objRememberedValue2 = lVar3;
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            composer3 = composer2;
            LazyDslKt.LazyRow(modifierSemantics$default, lazyListState, null, false, null, null, flingBehaviorRememberSnapFlingBehavior$material3_release, false, (l) objRememberedValue2, composer3, (i4 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 188);
            composer3.startReplaceableGroup(511388516);
            boolean zChanged3 = composer3.changed(lazyListState) | composer3.changed(stateData);
            Object objRememberedValue3 = composer3.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new DatePickerKt$HorizontalMonthsList$3$1(lazyListState, stateData, null);
                composer3.updateRememberedValue(objRememberedValue3);
            }
            composer3.endReplaceableGroup();
            EffectsKt.LaunchedEffect(lazyListState, (p<? super CoroutineScope, ? super dj.c<? super j>, ? extends Object>) objRememberedValue3, composer3, i5 | 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer4, int i7) {
                DatePickerKt.HorizontalMonthsList(lVar, stateData, lazyListState, datePickerFormatter, lVar2, datePickerColors, composer4, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Month(final CalendarMonth calendarMonth, final l<? super Long, j> lVar, final CalendarDate calendarDate, final StateData stateData, final boolean z, final l<? super Long, Boolean> lVar2, final DatePickerFormatter datePickerFormatter, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Modifier modifierDrawWithContent;
        Composer composer2;
        m.h(calendarMonth, "month");
        m.h(lVar, "onDateSelected");
        m.h(calendarDate, "today");
        m.h(stateData, "stateData");
        m.h(lVar2, "dateValidator");
        m.h(datePickerFormatter, "dateFormatter");
        m.h(datePickerColors, "colors");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1561090804);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(calendarMonth) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(lVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(calendarDate) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(stateData) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(lVar2) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerFormatter) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerColors) ? 8388608 : 4194304;
        }
        final int i4 = i3;
        if ((23967451 & i4) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1561090804, i4, -1, "androidx.compose.material3.Month (DatePicker.kt:1404)");
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(boolValueOf);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new kj.a<SelectedRangeInfo>() { // from class: androidx.compose.material3.DatePickerKt$Month$rangeSelectionInfo$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final SelectedRangeInfo m1218invoke() {
                        if (z) {
                            return SelectedRangeInfo.INSTANCE.calculateRangeInfo(calendarMonth, stateData.getSelectedStartDate().getValue(), stateData.getSelectedEndDate().getValue());
                        }
                        return null;
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final State state = (State) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-2019479227);
            if (z) {
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged2 = composerStartRestartGroup.changed(state) | composerStartRestartGroup.changed(datePickerColors);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new l<ContentDrawScope, j>() { // from class: androidx.compose.material3.DatePickerKt$Month$rangeSelectionDrawModifier$1$1
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
                            SelectedRangeInfo value = state.getValue();
                            if (value != null) {
                                DateRangePickerKt.m1230drawRangeBackgroundmxwnekA(contentDrawScope, value, datePickerColors.getDayInSelectionRangeContainerColor());
                            }
                            contentDrawScope.drawContent();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierDrawWithContent = DrawModifierKt.drawWithContent(companion, (l) objRememberedValue2);
            } else {
                modifierDrawWithContent = Modifier.INSTANCE;
            }
            final Modifier modifier = modifierDrawWithContent;
            composerStartRestartGroup.endReplaceableGroup();
            final Locale localeDefaultLocale = CalendarModel_androidKt.defaultLocale(composerStartRestartGroup, 0);
            final MutableState<CalendarDate> selectedStartDate = stateData.getSelectedStartDate();
            final MutableState<CalendarDate> selectedEndDate = stateData.getSelectedEndDate();
            composer2 = composerStartRestartGroup;
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getDateLabelTextFont()), ComposableLambdaKt.composableLambda(composer2, -1776200645, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.Month.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return j.a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:81:0x033c  */
                @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.Composable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void invoke(androidx.compose.runtime.Composer r31, int r32) {
                    /*
                        Method dump skipped, instruction units count: 954
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.C03081.invoke(androidx.compose.runtime.Composer, int):void");
                }
            }), composer2, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.Month.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer3, int i5) {
                DatePickerKt.Month(calendarMonth, lVar, calendarDate, stateData, z, lVar2, datePickerFormatter, datePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void MonthsNavigation(final Modifier modifier, final boolean z, final boolean z2, final boolean z3, final String str, final kj.a<j> aVar, final kj.a<j> aVar2, final kj.a<j> aVar3, Composer composer, final int i2) {
        final int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1127095896);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(aVar) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(aVar2) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(aVar3) ? 8388608 : 4194304;
        }
        if ((23967451 & i3) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1127095896, i3, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:1765)");
            }
            Modifier modifierM493requiredHeight3ABfNKs = SizeKt.m493requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), MonthYearHeight);
            Arrangement.Horizontal start = z3 ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composerStartRestartGroup, 48);
            Density density = (Density) v.d(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierM493requiredHeight3ABfNKs);
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
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion2, composerM2437constructorimpl, measurePolicyRowMeasurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i4 = i3;
            composer2 = composerStartRestartGroup;
            YearPickerMenuButton(aVar3, z3, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1156508456, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1
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
                        ComposerKt.traceEventStart(-1156508456, i5, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:1790)");
                    }
                    final String str2 = str;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    composer3.startReplaceableGroup(1157296644);
                    boolean zChanged = composer3.changed(str2);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1$1$1
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
                                SemanticsPropertiesKt.m4653setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.m4632getPolite0phEisY());
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceableGroup();
                    TextKt.m1685Text4IGK_g(str2, SemanticsModifierKt.semantics$default(companion3, false, (l) objRememberedValue, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, j>) null, (TextStyle) null, composer3, (i3 >> 12) & 14, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, ((i3 >> 21) & 14) | 3072 | ((i3 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4);
            composer2.startReplaceableGroup(979007906);
            if (!z3) {
                composer2.startReplaceableGroup(693286680);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getTop(), composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                kj.a<ComposeUiNode> constructor2 = companion2.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf2 = LayoutKt.materializerOf(companion3);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2437constructorimpl2 = Updater.m2437constructorimpl(composer2);
                final boolean z4 = false;
                qVarMaterializerOf2.invoke(androidx.appcompat.app.m.d(companion2, composerM2437constructorimpl2, measurePolicyRowMeasurePolicy2, composerM2437constructorimpl2, density2, composerM2437constructorimpl2, layoutDirection2, composerM2437constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                if (composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z4 = true;
                }
                IconButtonKt.IconButton(aVar2, null, z2, null, null, ComposableLambdaKt.composableLambda(composer2, -1143715416, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$2$1
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
                            ComposerKt.traceEventStart(-1143715416, i5, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1803)");
                        }
                        IconKt.m1327Iconww6aTOc(z4 ? KeyboardArrowRightKt.getKeyboardArrowRight(Icons.Filled.INSTANCE) : KeyboardArrowLeftKt.getKeyboardArrowLeft(Icons.Filled.INSTANCE), Strings_androidKt.m1581getStringNWtq28(Strings.INSTANCE.m1543getDatePickerSwitchToPreviousMonthadMyvUU(), composer3, 6), (Modifier) null, 0L, composer3, 0, 12);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, ((i4 >> 18) & 14) | 196608 | (i4 & 896), 26);
                IconButtonKt.IconButton(aVar, null, z, null, null, ComposableLambdaKt.composableLambda(composer2, 1336532191, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$2$2
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
                            ComposerKt.traceEventStart(1336532191, i5, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1813)");
                        }
                        IconKt.m1327Iconww6aTOc(z4 ? KeyboardArrowLeftKt.getKeyboardArrowLeft(Icons.Filled.INSTANCE) : KeyboardArrowRightKt.getKeyboardArrowRight(Icons.Filled.INSTANCE), Strings_androidKt.m1581getStringNWtq28(Strings.INSTANCE.m1542getDatePickerSwitchToNextMonthadMyvUU(), composer3, 6), (Modifier) null, 0L, composer3, 0, 12);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, ((i4 >> 15) & 14) | 196608 | ((i4 << 3) & 896), 26);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.MonthsNavigation.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer3, int i5) {
                DatePickerKt.MonthsNavigation(modifier, z, z2, z3, str, aVar, aVar2, aVar3, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SwitchableDateEntryContent(final DatePickerState datePickerState, final DatePickerFormatter datePickerFormatter, final l<? super Long, Boolean> lVar, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1613036224);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(datePickerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerFormatter) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(lVar) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerColors) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        final int i4 = i3;
        if ((i4 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1613036224, i4, -1, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1093)");
            }
            int iM1227getDisplayModejFl4v0 = datePickerState.m1227getDisplayModejFl4v0();
            CrossfadeKt.Crossfade(DisplayMode.m1251boximpl(iM1227getDisplayModejFl4v0), SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DatePickerKt.SwitchableDateEntryContent.1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return j.a;
                }

                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    m.h(semanticsPropertyReceiver, "$this$semantics");
                    SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                }
            }, 1, null), AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1854706084, true, new q<DisplayMode, Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.SwitchableDateEntryContent.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    m1219invokeQujVXRc(((DisplayMode) obj).getValue(), (Composer) obj2, ((Number) obj3).intValue());
                    return j.a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                /* JADX INFO: renamed from: invoke-QujVXRc, reason: not valid java name */
                public final void m1219invokeQujVXRc(int i5, Composer composer2, int i6) {
                    int i7;
                    if ((i6 & 14) == 0) {
                        i7 = (composer2.changed(i5) ? 4 : 2) | i6;
                    } else {
                        i7 = i6;
                    }
                    if ((i7 & 91) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1854706084, i6, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1104)");
                    }
                    DisplayMode.Companion companion = DisplayMode.INSTANCE;
                    if (DisplayMode.m1254equalsimpl0(i5, companion.m1259getPickerjFl4v0())) {
                        composer2.startReplaceableGroup(-1168728183);
                        StateData stateData = datePickerState.getStateData();
                        DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                        l<Long, Boolean> lVar2 = lVar;
                        DatePickerColors datePickerColors2 = datePickerColors;
                        int i8 = i4;
                        DatePickerKt.DatePickerContent(stateData, datePickerFormatter2, lVar2, datePickerColors2, composer2, (i8 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i8 & 896) | (i8 & 7168));
                        composer2.endReplaceableGroup();
                    } else if (DisplayMode.m1254equalsimpl0(i5, companion.m1258getInputjFl4v0())) {
                        composer2.startReplaceableGroup(-1168727945);
                        StateData stateData2 = datePickerState.getStateData();
                        DatePickerFormatter datePickerFormatter3 = datePickerFormatter;
                        l<Long, Boolean> lVar3 = lVar;
                        int i9 = i4;
                        DateInputKt.DateInputContent(stateData2, datePickerFormatter3, lVar3, composer2, (i9 & 896) | (i9 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-1168727765);
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.SwitchableDateEntryContent.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i5) {
                DatePickerKt.SwitchableDateEntryContent(datePickerState, datePickerFormatter, lVar, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void WeekDays(final DatePickerColors datePickerColors, final CalendarModel calendarModel, Composer composer, final int i2) {
        m.h(datePickerColors, "colors");
        m.h(calendarModel, "calendarModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1849465391);
        int i3 = (i2 & 14) == 0 ? (composerStartRestartGroup.changed(datePickerColors) ? 4 : 2) | i2 : i2;
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(calendarModel) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1849465391, i2, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1354)");
            }
            int firstDayOfWeek = calendarModel.getFirstDayOfWeek();
            List<Pair<String, String>> weekdayNames = calendarModel.getWeekdayNames();
            final ArrayList arrayList = new ArrayList();
            int i4 = firstDayOfWeek - 1;
            int size = weekdayNames.size();
            for (int i5 = i4; i5 < size; i5++) {
                arrayList.add(weekdayNames.get(i5));
            }
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList.add(weekdayNames.get(i6));
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2808boximpl(datePickerColors.getWeekdayContentColor()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1445541615, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.WeekDays.1
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
                public final void invoke(Composer composer2, int i7) {
                    if ((i7 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1445541615, i7, -1, "androidx.compose.material3.WeekDays.<anonymous> (DatePicker.kt:1365)");
                    }
                    TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextFont());
                    final ArrayList<Pair<String, String>> arrayList2 = arrayList;
                    TextKt.ProvideTextStyle(textStyleFromToken, ComposableLambdaKt.composableLambda(composer2, 2133710592, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.WeekDays.1.1
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
                        public final void invoke(Composer composer3, int i8) {
                            Composer composer4 = composer3;
                            if ((i8 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2133710592, i8, -1, "androidx.compose.material3.WeekDays.<anonymous>.<anonymous> (DatePicker.kt:1368)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m489defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, DatePickerKt.getRecommendedSizeForAccessibility(), 1, null), 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            ArrayList<Pair<String, String>> arrayList3 = arrayList2;
                            composer4.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically, composer4, 54);
                            int i9 = -1323940314;
                            Density density = (Density) v.d(composer4, -1323940314);
                            LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            kj.a<ComposeUiNode> constructor = companion.getConstructor();
                            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierFillMaxWidth$default);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer4.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composer3);
                            boolean z = false;
                            int i10 = 2058660585;
                            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl, measurePolicyRowMeasurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer3, composer3), composer4, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer4.startReplaceableGroup(784203502);
                            Iterator<T> it = arrayList3.iterator();
                            while (it.hasNext()) {
                                final Pair pair = (Pair) it.next();
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                composer4.startReplaceableGroup(1157296644);
                                boolean zChanged = composer4.changed(pair);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DatePickerKt$WeekDays$1$1$1$1$1$1
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
                                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, (String) pair.getFirst());
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierM506sizeVpY3zN4 = SizeKt.m506sizeVpY3zN4(SemanticsModifierKt.clearAndSetSemantics(companion2, (l) objRememberedValue), DatePickerKt.getRecommendedSizeForAccessibility(), DatePickerKt.getRecommendedSizeForAccessibility());
                                Alignment center = Alignment.INSTANCE.getCenter();
                                composer4.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, z, composer4, 6);
                                Density density2 = (Density) v.d(composer4, i9);
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                kj.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf2 = LayoutKt.materializerOf(modifierM506sizeVpY3zN4);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM2437constructorimpl2 = Updater.m2437constructorimpl(composer3);
                                int i11 = i10;
                                boolean z2 = z;
                                androidx.appcompat.graphics.drawable.a.g(z2 ? 1 : 0, qVarMaterializerOf2, androidx.appcompat.app.m.d(companion3, composerM2437constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM2437constructorimpl2, density2, composerM2437constructorimpl2, layoutDirection2, composerM2437constructorimpl2, viewConfiguration2, composer3, composer3), composer4, i11);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                TextKt.m1685Text4IGK_g((String) pair.getSecond(), SizeKt.wrapContentSize$default(companion2, null, z2, 3, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5163boximpl(TextAlign.INSTANCE.m5170getCentere0LSkKk()), 0L, 0, false, 0, 0, (l<? super TextLayoutResult, j>) null, (TextStyle) null, composer3, 48, 0, 130556);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer4 = composer3;
                                i9 = -1323940314;
                                z = z2 ? 1 : 0;
                                i10 = i11;
                            }
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
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
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.WeekDays.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i7) {
                DatePickerKt.WeekDays(datePickerColors, calendarModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Year(final Modifier modifier, final boolean z, final boolean z2, final kj.a<j> aVar, final String str, final DatePickerColors datePickerColors, final p<? super Composer, ? super Integer, j> pVar, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1441573940);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(aVar) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerColors) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar) ? 1048576 : 524288;
        }
        final int i4 = i3;
        if ((2995931 & i4) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1441573940, i4, -1, "androidx.compose.material3.Year (DatePicker.kt:1716)");
            }
            Boolean boolValueOf = Boolean.valueOf(z2);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            int i5 = i4 >> 6;
            int i6 = (i5 & 14) | (i4 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(boolValueOf2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (!z2 || z) ? null : BorderStrokeKt.m201BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m1948getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.getTodayDateBorderColor());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BorderStroke borderStroke = (BorderStroke) objRememberedValue;
            int i7 = i4 >> 12;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(str);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DatePickerKt$Year$1$1
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
                        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(str, null, null, 6, null));
                        SemanticsPropertiesKt.m4654setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m4640getButtono7Vup1c());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i8 = (i4 >> 3) & 14;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m1591Surfaced85dljk(z, aVar, SemanticsModifierKt.semantics(modifier, true, (l) objRememberedValue2), false, ShapesKt.toShape(DatePickerModalTokens.INSTANCE.getSelectionYearStateLayerShape(), composerStartRestartGroup, 6), datePickerColors.yearContainerColor$material3_release(z, composerStartRestartGroup, i8 | (i7 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)).getValue().m2828unboximpl(), datePickerColors.yearContentColor$material3_release(z2, z, composerStartRestartGroup, ((i4 >> 9) & 896) | i6).getValue().m2828unboximpl(), 0.0f, 0.0f, borderStroke, (MutableInteractionSource) null, (p<? super Composer, ? super Integer, j>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -68753950, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.Year.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return j.a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer3, int i9) {
                    if ((i9 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-68753950, i9, -1, "androidx.compose.material3.Year.<anonymous> (DatePicker.kt:1753)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    p<Composer, Integer, j> pVar2 = pVar;
                    int i10 = i4;
                    composer3.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                    Density density = (Density) v.d(composer3, -1323940314);
                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    kj.a<ComposeUiNode> constructor = companion.getConstructor();
                    q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierFillMaxWidth$default);
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
                    androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (androidx.compose.animation.b.m((i10 >> 18) & 14, pVar2, composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, i8 | (i5 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 48, 1416);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.Year.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer3, int i9) {
                DatePickerKt.Year(modifier, z, z2, aVar, str, datePickerColors, pVar, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void YearPicker(final Modifier modifier, final l<? super Integer, j> lVar, final DatePickerColors datePickerColors, final StateData stateData, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1038904873);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(lVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerColors) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(stateData) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        final int i4 = i3;
        if ((i4 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1038904873, i4, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:1628)");
            }
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getSelectionYearLabelTextFont()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -145469688, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return j.a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-145469688, i5, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:1636)");
                    }
                    final int year = stateData.getCurrentMonth().getYear();
                    final int year2 = stateData.getDisplayedMonth().getYear();
                    final LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(Math.max(0, (year2 - ((qj.d) stateData.getYearRange()).a) - 3), 0, composer2, 0, 2);
                    composer2.startReplaceableGroup(-969349200);
                    long containerColor = datePickerColors.getContainerColor();
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    long jM1157surfaceColorAtElevation3ABfNKs = Color.m2819equalsimpl0(containerColor, materialTheme.getColorScheme(composer2, 6).m1116getSurface0d7_KjU()) ? ColorSchemeKt.m1157surfaceColorAtElevation3ABfNKs(materialTheme.getColorScheme(composer2, 6), ((Dp) composer2.consume(SurfaceKt.getLocalAbsoluteTonalElevation())).m5281unboximpl()) : datePickerColors.getContainerColor();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(773894976);
                    composer2.startReplaceableGroup(-492369756);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = androidx.appcompat.view.menu.a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                    }
                    composer2.endReplaceableGroup();
                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composer2.endReplaceableGroup();
                    Strings.Companion companion = Strings.INSTANCE;
                    final String strM1581getStringNWtq28 = Strings_androidKt.m1581getStringNWtq28(companion.m1537getDatePickerScrollToShowEarlierYearsadMyvUU(), composer2, 6);
                    final String strM1581getStringNWtq282 = Strings_androidKt.m1581getStringNWtq28(companion.m1538getDatePickerScrollToShowLaterYearsadMyvUU(), composer2, 6);
                    GridCells.Fixed fixed = new GridCells.Fixed(3);
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(BackgroundKt.m182backgroundbw27NRU$default(modifier, jM1157surfaceColorAtElevation3ABfNKs, null, 2, null), false, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return j.a;
                        }

                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            m.h(semanticsPropertyReceiver, "$this$semantics");
                            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new kj.a<Float>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.1.1
                                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                                public final Float m1220invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, new kj.a<Float>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.1.2
                                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                                public final Float m1221invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, false, 4, null));
                        }
                    }, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM408spacedBy0680j_4 = arrangement.m408spacedBy0680j_4(DatePickerKt.YearsVerticalPadding);
                    final StateData stateData2 = stateData;
                    final l<Integer, j> lVar2 = lVar;
                    final int i6 = i4;
                    final DatePickerColors datePickerColors2 = datePickerColors;
                    LazyGridDslKt.LazyVerticalGrid(fixed, modifierSemantics$default, lazyGridStateRememberLazyGridState, null, false, horizontalOrVerticalM408spacedBy0680j_4, spaceEvenly, null, false, new l<LazyGridScope, j>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((LazyGridScope) obj);
                            return j.a;
                        }

                        public final void invoke(LazyGridScope lazyGridScope) {
                            int size;
                            m.h(lazyGridScope, "$this$LazyVerticalGrid");
                            Collection yearRange = stateData2.getYearRange();
                            m.h(yearRange, "<this>");
                            if (yearRange instanceof Collection) {
                                size = yearRange.size();
                            } else {
                                Iterator it = yearRange.iterator();
                                size = 0;
                                while (it.hasNext()) {
                                    it.next();
                                    size++;
                                    if (size < 0) {
                                        a.f.l0();
                                        throw null;
                                    }
                                }
                            }
                            final StateData stateData3 = stateData2;
                            final int i7 = year2;
                            final int i8 = year;
                            final l<Integer, j> lVar3 = lVar2;
                            final int i9 = i6;
                            final DatePickerColors datePickerColors3 = datePickerColors2;
                            final LazyGridState lazyGridState = lazyGridStateRememberLazyGridState;
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            final String str = strM1581getStringNWtq28;
                            final String str2 = strM1581getStringNWtq282;
                            LazyGridScope.CC.b(lazyGridScope, size, null, null, null, ComposableLambdaKt.composableLambdaInstance(1369226173, true, new r<LazyGridItemScope, Integer, Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(4);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                    return j.a;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(LazyGridItemScope lazyGridItemScope, final int i10, Composer composer3, int i11) {
                                    int i12;
                                    m.h(lazyGridItemScope, "$this$items");
                                    if ((i11 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                                        i12 = (composer3.changed(i10) ? 32 : 16) | i11;
                                    } else {
                                        i12 = i11;
                                    }
                                    if ((i12 & 721) == 144 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1369226173, i11, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1669)");
                                    }
                                    final int i13 = i10 + ((qj.d) stateData3.getYearRange()).a;
                                    final String localString = DatePickerKt.toLocalString(i13);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
                                    Modifier modifierM498requiredSizeVpY3zN4 = SizeKt.m498requiredSizeVpY3zN4(companion2, datePickerModalTokens.m1955getSelectionYearContainerWidthD9Ej5fM(), datePickerModalTokens.m1954getSelectionYearContainerHeightD9Ej5fM());
                                    final LazyGridState lazyGridState2 = lazyGridState;
                                    final CoroutineScope coroutineScope3 = coroutineScope2;
                                    final String str3 = str;
                                    final String str4 = str2;
                                    Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifierM498requiredSizeVpY3zN4, false, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.2.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((SemanticsPropertyReceiver) obj);
                                            return j.a;
                                        }

                                        /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final void invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver r5) {
                                            /*
                                                r4 = this;
                                                java.lang.String r0 = "$this$semantics"
                                                kotlin.jvm.internal.m.h(r5, r0)
                                                androidx.compose.foundation.lazy.grid.LazyGridState r0 = r1
                                                int r0 = r0.getFirstVisibleItemIndex()
                                                int r1 = r2
                                                if (r0 == r1) goto L31
                                                androidx.compose.foundation.lazy.grid.LazyGridState r0 = r1
                                                androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo r0 = r0.getLayoutInfo()
                                                java.util.List r0 = r0.getVisibleItemsInfo()
                                                java.lang.Object r0 = kotlin.collections.y.A1(r0)
                                                androidx.compose.foundation.lazy.grid.LazyGridItemInfo r0 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r0
                                                r1 = 0
                                                if (r0 == 0) goto L2b
                                                int r0 = r0.getIndex()
                                                int r2 = r2
                                                if (r0 != r2) goto L2b
                                                r1 = 1
                                            L2b:
                                                if (r1 == 0) goto L2e
                                                goto L31
                                            L2e:
                                                kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
                                                goto L3d
                                            L31:
                                                androidx.compose.foundation.lazy.grid.LazyGridState r0 = r1
                                                kotlinx.coroutines.CoroutineScope r1 = r3
                                                java.lang.String r2 = r4
                                                java.lang.String r3 = r5
                                                java.util.List r0 = androidx.compose.material3.DatePickerKt.access$customScrollActions(r0, r1, r2, r3)
                                            L3d:
                                                androidx.compose.ui.semantics.SemanticsPropertiesKt.setCustomActions(r5, r0)
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.C03181.AnonymousClass2.C00751.C00761.invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver):void");
                                        }
                                    }, 1, null);
                                    boolean z = i13 == i7;
                                    boolean z2 = i13 == i8;
                                    l<Integer, j> lVar4 = lVar3;
                                    Integer numValueOf = Integer.valueOf(i13);
                                    final l<Integer, j> lVar5 = lVar3;
                                    composer3.startReplaceableGroup(511388516);
                                    boolean zChanged = composer3.changed(lVar4) | composer3.changed(numValueOf);
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new kj.a<j>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(0);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke() {
                                                m1222invoke();
                                                return j.a;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                            public final void m1222invoke() {
                                                lVar5.invoke(Integer.valueOf(i13));
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer3.endReplaceableGroup();
                                    DatePickerKt.Year(modifierSemantics$default2, z, z2, (kj.a) objRememberedValue2, androidx.compose.animation.a.e(new Object[]{localString}, 1, Strings_androidKt.m1581getStringNWtq28(Strings.INSTANCE.m1535getDatePickerNavigateToYearDescriptionadMyvUU(), composer3, 6), "format(this, *args)"), datePickerColors3, ComposableLambdaKt.composableLambda(composer3, 2095319565, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.2.1.3
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
                                        public final void invoke(Composer composer4, int i14) {
                                            if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(2095319565, i14, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1701)");
                                            }
                                            TextKt.m1685Text4IGK_g(localString, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.2.1.3.1
                                                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    m.h(semanticsPropertyReceiver, "$this$clearAndSetSemantics");
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                    invoke((SemanticsPropertyReceiver) obj);
                                                    return j.a;
                                                }
                                            }), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5163boximpl(TextAlign.INSTANCE.m5170getCentere0LSkKk()), 0L, 0, false, 0, 0, (l<? super TextLayoutResult, j>) null, (TextStyle) null, composer4, 0, 0, 130556);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer3, ((i9 << 9) & 458752) | 1572864);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), 14, null);
                        }
                    }, composer2, 1769472, 408);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i5) {
                DatePickerKt.YearPicker(modifier, lVar, datePickerColors, stateData, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void YearPickerMenuButton(final kj.a<kotlin.j> r20, final boolean r21, androidx.compose.ui.Modifier r22, final kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.YearPickerMenuButton(kj.a, boolean, androidx.compose.ui.Modifier, kj.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(final LazyGridState lazyGridState, final CoroutineScope coroutineScope, String str, String str2) {
        return a.f.V(new CustomAccessibilityAction(str, new kj.a<Boolean>() { // from class: androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1

            /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: DatePicker.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1$1", f = "DatePicker.kt", l = {1871}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ LazyGridState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(LazyGridState lazyGridState, dj.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$state = lazyGridState;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new AnonymousClass1(this.$state, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        li.c.O(obj);
                        LazyGridState lazyGridState = this.$state;
                        int firstVisibleItemIndex = lazyGridState.getFirstVisibleItemIndex() - 3;
                        this.label = 1;
                        if (LazyGridState.scrollToItem$default(lazyGridState, firstVisibleItemIndex, 0, this, 2, null) == coroutineSingletons) {
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
            public final Boolean m1224invoke() {
                boolean z;
                if (lazyGridState.getCanScrollBackward()) {
                    BuildersKt.launch$default(coroutineScope, (dj.e) null, (CoroutineStart) null, new AnonymousClass1(lazyGridState, null), 3, (Object) null);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }), new CustomAccessibilityAction(str2, new kj.a<Boolean>() { // from class: androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1

            /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: DatePicker.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1$1", f = "DatePicker.kt", l = {1881}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ LazyGridState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(LazyGridState lazyGridState, dj.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$state = lazyGridState;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new AnonymousClass1(this.$state, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        li.c.O(obj);
                        LazyGridState lazyGridState = this.$state;
                        int firstVisibleItemIndex = lazyGridState.getFirstVisibleItemIndex() + 3;
                        this.label = 1;
                        if (LazyGridState.scrollToItem$default(lazyGridState, firstVisibleItemIndex, 0, this, 2, null) == coroutineSingletons) {
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
            public final Boolean m1223invoke() {
                boolean z;
                if (lazyGridState.getCanScrollForward()) {
                    BuildersKt.launch$default(coroutineScope, (dj.e) null, (CoroutineStart) null, new AnonymousClass1(lazyGridState, null), 3, (Object) null);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final String dayContentDescription(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Composer composer, int i2) {
        composer.startReplaceableGroup(502032503);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(502032503, i2, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1538)");
        }
        StringBuilder sb = new StringBuilder();
        composer.startReplaceableGroup(-852204210);
        if (z) {
            if (z3) {
                composer.startReplaceableGroup(-852204120);
                sb.append(Strings_androidKt.m1581getStringNWtq28(Strings.INSTANCE.m1554getDateRangePickerStartHeadlineadMyvUU(), composer, 6));
                composer.endReplaceableGroup();
            } else if (z4) {
                composer.startReplaceableGroup(-852203980);
                sb.append(Strings_androidKt.m1581getStringNWtq28(Strings.INSTANCE.m1551getDateRangePickerEndHeadlineadMyvUU(), composer, 6));
                composer.endReplaceableGroup();
            } else if (z5) {
                composer.startReplaceableGroup(-852203842);
                sb.append(Strings_androidKt.m1581getStringNWtq28(Strings.INSTANCE.m1550getDateRangePickerDayInRangeadMyvUU(), composer, 6));
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-852203741);
                composer.endReplaceableGroup();
            }
        }
        composer.endReplaceableGroup();
        if (z2) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(Strings_androidKt.m1581getStringNWtq28(Strings.INSTANCE.m1546getDatePickerTodayDescriptionadMyvUU(), composer, 6));
        }
        String string = sb.length() == 0 ? null : sb.toString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return string;
    }

    public static final float getDatePickerHorizontalPadding() {
        return DatePickerHorizontalPadding;
    }

    public static final PaddingValues getDatePickerModeTogglePadding() {
        return DatePickerModeTogglePadding;
    }

    public static final float getMonthYearHeight() {
        return MonthYearHeight;
    }

    public static final float getRecommendedSizeForAccessibility() {
        return RecommendedSizeForAccessibility;
    }

    @Composable
    @ExperimentalMaterial3Api
    /* JADX INFO: renamed from: rememberDatePickerState-NVmSL94, reason: not valid java name */
    public static final DatePickerState m1206rememberDatePickerStateNVmSL94(final Long l, final Long l2, final f fVar, final int i2, Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(1574672255);
        if ((i4 & 1) != 0) {
            l = null;
        }
        if ((i4 & 2) != 0) {
            l2 = l;
        }
        if ((i4 & 4) != 0) {
            fVar = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i4 & 8) != 0) {
            i2 = DisplayMode.INSTANCE.m1259getPickerjFl4v0();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1574672255, i3, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:219)");
        }
        DatePickerState datePickerState = (DatePickerState) RememberSaveableKt.m2460rememberSaveable(new Object[0], (Saver) DatePickerState.INSTANCE.Saver(), (String) null, (kj.a) new kj.a<DatePickerState>() { // from class: androidx.compose.material3.DatePickerKt$rememberDatePickerState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DatePickerState m1225invoke() {
                return new DatePickerState(l, l2, fVar, i2, null);
            }
        }, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return datePickerState;
    }

    public static final String toLocalString(int i2) {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.setGroupingUsed(false);
        String str = integerInstance.format(Integer.valueOf(i2));
        m.g(str, "formatter.format(this)");
        return str;
    }

    public static final Object updateDisplayedMonth(final LazyListState lazyListState, final StateData stateData, dj.c<? super j> cVar) {
        Object objCollect = SnapshotStateKt.snapshotFlow(new kj.a<Integer>() { // from class: androidx.compose.material3.DatePickerKt.updateDisplayedMonth.2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Integer m1226invoke() {
                return Integer.valueOf(lazyListState.getFirstVisibleItemIndex());
            }
        }).collect(new FlowCollector<Integer>() { // from class: androidx.compose.material3.DatePickerKt.updateDisplayedMonth.3
            public /* bridge */ /* synthetic */ Object emit(Object obj, dj.c cVar2) {
                return emit(((Number) obj).intValue(), (dj.c<? super j>) cVar2);
            }

            public final Object emit(int i2, dj.c<? super j> cVar2) {
                int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() / 12;
                int firstVisibleItemIndex2 = (lazyListState.getFirstVisibleItemIndex() % 12) + 1;
                StateData stateData2 = stateData;
                if (stateData2.getDisplayedMonth().getMonth() != firstVisibleItemIndex2 || stateData2.getDisplayedMonth().getYear() != ((qj.d) stateData2.getYearRange()).a + firstVisibleItemIndex) {
                    stateData2.setDisplayedMonth(stateData2.getCalendarModel().getMonth(((qj.d) stateData2.getYearRange()).a + firstVisibleItemIndex, firstVisibleItemIndex2));
                }
                return j.a;
            }
        }, cVar);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : j.a;
    }
}
