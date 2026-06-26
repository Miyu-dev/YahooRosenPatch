package androidx.compose.material3;

import androidx.appcompat.app.m;
import androidx.appcompat.widget.s;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.Optimizer;
import dj.e;
import java.util.List;
import kj.l;
import kj.p;
import kj.q;
import kj.r;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import qj.f;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aM\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a;\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a;\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\"\u0010#\u001aW\u0010'\u001a\u00020\u000b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b'\u0010(\u001a\u0018\u0010*\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0007H\u0002\u001a)\u00102\u001a\u00020\u000b*\u00020+2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001a.\u0010:\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010\u0001\u001a\u00020%2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000205H\u0002\"\u001a\u0010<\u001a\u00020;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0014\u0010@\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010=\"\u0014\u0010A\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010=\"\u0017\u0010C\u001a\u00020B8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bC\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006E"}, d2 = {"Landroidx/compose/material3/DateRangePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function1;", "", "", "dateValidator", "Lkotlin/Function0;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "title", "headline", "showModeToggle", "Landroidx/compose/material3/DatePickerColors;", "colors", "DateRangePicker", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkj/l;Lkj/p;Lkj/p;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Lqj/f;", "yearRange", "Landroidx/compose/material3/DisplayMode;", "initialDisplayMode", "rememberDateRangePickerState-pMw4iz8", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lqj/f;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DateRangePickerState;", "rememberDateRangePickerState", "SwitchableDateEntryContent", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/material3/DatePickerFormatter;Lkj/l;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material3/StateData;", "stateData", "DateRangePickerContent", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkj/l;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "onDateSelected", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "VerticalMonthsList", "(Lkj/l;Landroidx/compose/material3/StateData;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/material3/DatePickerFormatter;Lkj/l;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "dateInMillis", "updateDateSelection", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/material3/SelectedRangeInfo;", "selectedRangeInfo", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "drawRangeBackground-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/material3/SelectedRangeInfo;J)V", "drawRangeBackground", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "", "scrollUpLabel", "scrollDownLabel", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "customScrollActions", "Landroidx/compose/foundation/layout/PaddingValues;", "CalendarMonthSubheadPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getCalendarMonthSubheadPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DateRangePickerTitlePadding", "DateRangePickerHeadlinePadding", "Landroidx/compose/ui/unit/Dp;", "HeaderHeightOffset", "F", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class DateRangePickerKt {
    private static final PaddingValues DateRangePickerHeadlinePadding;
    private static final PaddingValues DateRangePickerTitlePadding;
    private static final PaddingValues CalendarMonthSubheadPadding = PaddingKt.m458PaddingValuesa9UjIt4$default(Dp.m5267constructorimpl(24), Dp.m5267constructorimpl(20), 0.0f, Dp.m5267constructorimpl(8), 4, null);
    private static final float HeaderHeightOffset = Dp.m5267constructorimpl(60);

    static {
        float f = 64;
        float f2 = 12;
        DateRangePickerTitlePadding = PaddingKt.m458PaddingValuesa9UjIt4$default(Dp.m5267constructorimpl(f), 0.0f, Dp.m5267constructorimpl(f2), 0.0f, 10, null);
        DateRangePickerHeadlinePadding = PaddingKt.m458PaddingValuesa9UjIt4$default(Dp.m5267constructorimpl(f), 0.0f, Dp.m5267constructorimpl(f2), Dp.m5267constructorimpl(f2), 2, null);
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
    /* JADX WARN: Removed duplicated region for block: B:137:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x026e  */
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
    public static final void DateRangePicker(final androidx.compose.material3.DateRangePickerState r56, androidx.compose.ui.Modifier r57, androidx.compose.material3.DatePickerFormatter r58, kj.l<? super java.lang.Long, java.lang.Boolean> r59, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r60, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r61, boolean r62, androidx.compose.material3.DatePickerColors r63, androidx.compose.runtime.Composer r64, final int r65, final int r66) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt.DateRangePicker(androidx.compose.material3.DateRangePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.DatePickerFormatter, kj.l, kj.p, kj.p, boolean, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DateRangePickerContent(final StateData stateData, final DatePickerFormatter datePickerFormatter, final l<? super Long, Boolean> lVar, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1003501610);
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
        if ((i3 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1003501610, i3, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:478)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(stateData.getDisplayedMonthIndex(), 0, composerStartRestartGroup, 0, 2);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(stateData);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new l<Long, j>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$onDateSelected$1$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Number) obj).longValue());
                        return j.a;
                    }

                    public final void invoke(long j) {
                        DateRangePickerKt.updateDateSelection(stateData, j);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            l lVar2 = (l) objRememberedValue;
            Modifier modifierM463paddingVpY3zN4$default = PaddingKt.m463paddingVpY3zN4$default(Modifier.INSTANCE, DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyC = a.b.c(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierM463paddingVpY3zN4$default);
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
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, m.d(companion, composerM2437constructorimpl, measurePolicyC, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            DatePickerKt.WeekDays(datePickerColors, stateData.getCalendarModel(), composerStartRestartGroup, (i3 >> 9) & 14);
            int i4 = (i3 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            int i5 = i3 << 6;
            composer2 = composerStartRestartGroup;
            VerticalMonthsList(lVar2, stateData, lazyListStateRememberLazyListState, datePickerFormatter, lVar, datePickerColors, composerStartRestartGroup, i4 | (i5 & 7168) | (57344 & i5) | (i5 & 458752));
            if (android.support.v4.media.a.p(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePickerContent.2
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
                DateRangePickerKt.DateRangePickerContent(stateData, datePickerFormatter, lVar, datePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SwitchableDateEntryContent(final DateRangePickerState dateRangePickerState, final DatePickerFormatter datePickerFormatter, final l<? super Long, Boolean> lVar, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(984055784);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(dateRangePickerState) ? 4 : 2) | i2;
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
                ComposerKt.traceEventStart(984055784, i4, -1, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:447)");
            }
            int iM1240getDisplayModejFl4v0 = dateRangePickerState.m1240getDisplayModejFl4v0();
            CrossfadeKt.Crossfade(DisplayMode.m1251boximpl(iM1240getDisplayModejFl4v0), SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DateRangePickerKt.SwitchableDateEntryContent.1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return j.a;
                }

                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    kotlin.jvm.internal.m.h(semanticsPropertyReceiver, "$this$semantics");
                    SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                }
            }, 1, null), AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1354418636, true, new q<DisplayMode, Composer, Integer, j>() { // from class: androidx.compose.material3.DateRangePickerKt.SwitchableDateEntryContent.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    m1233invokeQujVXRc(((DisplayMode) obj).getValue(), (Composer) obj2, ((Number) obj3).intValue());
                    return j.a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                /* JADX INFO: renamed from: invoke-QujVXRc, reason: not valid java name */
                public final void m1233invokeQujVXRc(int i5, Composer composer2, int i6) {
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
                        ComposerKt.traceEventStart(1354418636, i6, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:458)");
                    }
                    DisplayMode.Companion companion = DisplayMode.INSTANCE;
                    if (DisplayMode.m1254equalsimpl0(i5, companion.m1259getPickerjFl4v0())) {
                        composer2.startReplaceableGroup(-1168754929);
                        StateData stateData = dateRangePickerState.getStateData();
                        DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                        l<Long, Boolean> lVar2 = lVar;
                        DatePickerColors datePickerColors2 = datePickerColors;
                        int i8 = i4;
                        DateRangePickerKt.DateRangePickerContent(stateData, datePickerFormatter2, lVar2, datePickerColors2, composer2, (i8 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i8 & 896) | (i8 & 7168));
                        composer2.endReplaceableGroup();
                    } else if (DisplayMode.m1254equalsimpl0(i5, companion.m1258getInputjFl4v0())) {
                        composer2.startReplaceableGroup(-1168754686);
                        StateData stateData2 = dateRangePickerState.getStateData();
                        DatePickerFormatter datePickerFormatter3 = datePickerFormatter;
                        l<Long, Boolean> lVar3 = lVar;
                        int i9 = i4;
                        DateRangeInputKt.DateRangeInputContent(stateData2, datePickerFormatter3, lVar3, composer2, (i9 & 896) | (i9 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-1168754501);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DateRangePickerKt.SwitchableDateEntryContent.3
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
                DateRangePickerKt.SwitchableDateEntryContent(dateRangePickerState, datePickerFormatter, lVar, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VerticalMonthsList(final l<? super Long, j> lVar, final StateData stateData, final LazyListState lazyListState, final DatePickerFormatter datePickerFormatter, final l<? super Long, Boolean> lVar2, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-837198453);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(lVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
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
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-837198453, i4, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:511)");
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
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadFont()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 56792252, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1
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
                        ComposerKt.traceEventStart(56792252, i5, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:530)");
                    }
                    Object objD = s.d(composer2, 773894976, -492369756);
                    if (objD == Composer.INSTANCE.getEmpty()) {
                        objD = androidx.appcompat.view.menu.a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                    }
                    composer2.endReplaceableGroup();
                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objD).getCoroutineScope();
                    composer2.endReplaceableGroup();
                    Strings.Companion companion = Strings.INSTANCE;
                    final String strM1581getStringNWtq28 = Strings_androidKt.m1581getStringNWtq28(companion.m1553getDateRangePickerScrollToShowPreviousMonthadMyvUU(), composer2, 6);
                    final String strM1581getStringNWtq282 = Strings_androidKt.m1581getStringNWtq28(companion.m1552getDateRangePickerScrollToShowNextMonthadMyvUU(), composer2, 6);
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return j.a;
                        }

                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            kotlin.jvm.internal.m.h(semanticsPropertyReceiver, "$this$semantics");
                            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new kj.a<Float>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1.1
                                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                                public final Float m1234invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, new kj.a<Float>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1.2
                                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                                public final Float m1235invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, false, 4, null));
                        }
                    }, 1, null);
                    final LazyListState lazyListState2 = lazyListState;
                    final StateData stateData2 = stateData;
                    final CalendarMonth calendarMonth2 = calendarMonth;
                    final DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                    final DatePickerColors datePickerColors2 = datePickerColors;
                    final l<Long, j> lVar3 = lVar;
                    final CalendarDate calendarDate = today;
                    final l<Long, Boolean> lVar4 = lVar2;
                    final int i6 = i4;
                    LazyDslKt.LazyColumn(modifierSemantics$default, lazyListState2, null, false, null, null, null, false, new l<LazyListScope, j>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.2
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
                            kotlin.jvm.internal.m.h(lazyListScope, "$this$LazyColumn");
                            int totalMonthsInRange = stateData2.getTotalMonthsInRange();
                            final StateData stateData3 = stateData2;
                            final CalendarMonth calendarMonth3 = calendarMonth2;
                            final DatePickerFormatter datePickerFormatter3 = datePickerFormatter2;
                            final DatePickerColors datePickerColors3 = datePickerColors2;
                            final l<Long, j> lVar5 = lVar3;
                            final CalendarDate calendarDate2 = calendarDate;
                            final l<Long, Boolean> lVar6 = lVar4;
                            final int i7 = i6;
                            final LazyListState lazyListState3 = lazyListState2;
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            final String str = strM1581getStringNWtq28;
                            final String str2 = strM1581getStringNWtq282;
                            LazyListScope.CC.k(lazyListScope, totalMonthsInRange, null, null, ComposableLambdaKt.composableLambdaInstance(1246706073, true, new r<LazyItemScope, Integer, Composer, Integer, j>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.2.1
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
                                public final void invoke(LazyItemScope lazyItemScope, int i8, Composer composer3, int i9) {
                                    int i10;
                                    kotlin.jvm.internal.m.h(lazyItemScope, "$this$items");
                                    if ((i9 & 14) == 0) {
                                        i10 = (composer3.changed(lazyItemScope) ? 4 : 2) | i9;
                                    } else {
                                        i10 = i9;
                                    }
                                    if ((i9 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                                        i10 |= composer3.changed(i8) ? 32 : 16;
                                    }
                                    if ((i10 & 731) == 146 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1246706073, i9, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:542)");
                                    }
                                    CalendarMonth calendarMonthPlusMonths = stateData3.getCalendarModel().plusMonths(calendarMonth3, i8);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Modifier modifierD = androidx.compose.foundation.lazy.a.d(lazyItemScope, companion2, 0.0f, 1, null);
                                    DatePickerFormatter datePickerFormatter4 = datePickerFormatter3;
                                    StateData stateData4 = stateData3;
                                    DatePickerColors datePickerColors4 = datePickerColors3;
                                    l<Long, j> lVar7 = lVar5;
                                    CalendarDate calendarDate3 = calendarDate2;
                                    l<Long, Boolean> lVar8 = lVar6;
                                    int i11 = i7;
                                    final LazyListState lazyListState4 = lazyListState3;
                                    final CoroutineScope coroutineScope3 = coroutineScope2;
                                    final String str3 = str;
                                    final String str4 = str2;
                                    composer3.startReplaceableGroup(-483455358);
                                    MeasurePolicy measurePolicyC = a.b.c(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer3, 0, -1323940314);
                                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    kj.a<ComposeUiNode> constructor = companion3.getConstructor();
                                    q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierD);
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
                                    androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, m.d(companion3, composerM2437constructorimpl, measurePolicyC, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    String monthYear$material3_release = datePickerFormatter4.formatMonthYear$material3_release(calendarMonthPlusMonths, stateData4.getCalendarModel(), CalendarModel_androidKt.defaultLocale(composer3, 0));
                                    if (monthYear$material3_release == null) {
                                        monthYear$material3_release = "-";
                                    }
                                    TextKt.m1685Text4IGK_g(monthYear$material3_release, SemanticsModifierKt.semantics$default(ClickableKt.m206clickableXHw0xAI$default(PaddingKt.padding(companion2, DateRangePickerKt.getCalendarMonthSubheadPadding()), false, null, null, new kj.a<j>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1
                                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                        public final void m1236invoke() {
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m1236invoke();
                                            return j.a;
                                        }
                                    }, 7, null), false, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((SemanticsPropertyReceiver) obj);
                                            return j.a;
                                        }

                                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            kotlin.jvm.internal.m.h(semanticsPropertyReceiver, "$this$semantics");
                                            SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, DateRangePickerKt.customScrollActions(lazyListState4, coroutineScope3, str3, str4));
                                        }
                                    }, 1, null), datePickerColors4.getSubheadContentColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, j>) null, (TextStyle) null, composer3, 0, 0, 131064);
                                    int i12 = i11 << 3;
                                    int i13 = i11 << 6;
                                    DatePickerKt.Month(calendarMonthPlusMonths, lVar7, calendarDate3, stateData4, true, lVar8, datePickerFormatter4, datePickerColors4, composer3, ((i11 << 9) & 3670016) | (i12 & 458752) | (i12 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 24576 | (i13 & 7168) | (29360128 & i13));
                                    if (android.support.v4.media.a.p(composer3)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), 6, null);
                        }
                    }, composer2, (i4 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 252);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 48);
            int i5 = (i4 >> 6) & 14;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged2 = composerStartRestartGroup.changed(lazyListState) | composerStartRestartGroup.changed(stateData);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new DateRangePickerKt$VerticalMonthsList$2$1(lazyListState, stateData, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(lazyListState, (p<? super CoroutineScope, ? super dj.c<? super j>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i5 | 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i6) {
                DateRangePickerKt.VerticalMonthsList(lVar, stateData, lazyListState, datePickerFormatter, lVar2, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(final LazyListState lazyListState, final CoroutineScope coroutineScope, String str, String str2) {
        return a.f.V(new CustomAccessibilityAction(str, new kj.a<Boolean>() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1

            /* JADX INFO: renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: DateRangePicker.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1", f = "DateRangePicker.kt", l = {774}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ LazyListState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(LazyListState lazyListState, dj.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$state = lazyListState;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new AnonymousClass1(this.$state, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        li.c.O(obj);
                        LazyListState lazyListState = this.$state;
                        int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() - 1;
                        this.label = 1;
                        if (LazyListState.scrollToItem$default(lazyListState, firstVisibleItemIndex, 0, this, 2, null) == coroutineSingletons) {
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
            public final Boolean m1238invoke() {
                boolean z;
                if (lazyListState.getCanScrollBackward()) {
                    BuildersKt.launch$default(coroutineScope, (e) null, (CoroutineStart) null, new AnonymousClass1(lazyListState, null), 3, (Object) null);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }), new CustomAccessibilityAction(str2, new kj.a<Boolean>() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1

            /* JADX INFO: renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: DateRangePicker.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1", f = "DateRangePicker.kt", l = {784}, m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ LazyListState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(LazyListState lazyListState, dj.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$state = lazyListState;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new AnonymousClass1(this.$state, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        li.c.O(obj);
                        LazyListState lazyListState = this.$state;
                        int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() + 1;
                        this.label = 1;
                        if (LazyListState.scrollToItem$default(lazyListState, firstVisibleItemIndex, 0, this, 2, null) == coroutineSingletons) {
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
            public final Boolean m1237invoke() {
                boolean z;
                if (lazyListState.getCanScrollForward()) {
                    BuildersKt.launch$default(coroutineScope, (e) null, (CoroutineStart) null, new AnonymousClass1(lazyListState, null), 3, (Object) null);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }));
    }

    /* JADX INFO: renamed from: drawRangeBackground-mxwnekA, reason: not valid java name */
    public static final void m1230drawRangeBackgroundmxwnekA(ContentDrawScope contentDrawScope, SelectedRangeInfo selectedRangeInfo, long j) {
        kotlin.jvm.internal.m.h(contentDrawScope, "$this$drawRangeBackground");
        kotlin.jvm.internal.m.h(selectedRangeInfo, "selectedRangeInfo");
        float fMo348toPx0680j_4 = contentDrawScope.mo348toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float fMo348toPx0680j_42 = contentDrawScope.mo348toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float fMo348toPx0680j_43 = contentDrawScope.mo348toPx0680j_4(DatePickerModalTokens.INSTANCE.m1946getDateStateLayerHeightD9Ej5fM());
        float f = 2;
        float f2 = (fMo348toPx0680j_42 - fMo348toPx0680j_43) / f;
        float f3 = 7;
        float fM2654getWidthimpl = (Size.m2654getWidthimpl(contentDrawScope.mo3254getSizeNHjbRc()) - (f3 * fMo348toPx0680j_4)) / f3;
        long packedValue = ((IntOffset) selectedRangeInfo.getGridCoordinates().getFirst()).getPackedValue();
        int iM5377component1impl = IntOffset.m5377component1impl(packedValue);
        int iM5378component2impl = IntOffset.m5378component2impl(packedValue);
        long packedValue2 = ((IntOffset) selectedRangeInfo.getGridCoordinates().getSecond()).getPackedValue();
        int iM5377component1impl2 = IntOffset.m5377component1impl(packedValue2);
        int iM5378component2impl2 = IntOffset.m5378component2impl(packedValue2);
        float f4 = fMo348toPx0680j_4 + fM2654getWidthimpl;
        float f5 = fM2654getWidthimpl / f;
        float fM2654getWidthimpl2 = (iM5377component1impl * f4) + (selectedRangeInfo.getFirstIsSelectionStart() ? fMo348toPx0680j_4 / f : 0.0f) + f5;
        float f6 = (iM5378component2impl * fMo348toPx0680j_42) + f2;
        float f7 = iM5377component1impl2 * f4;
        if (selectedRangeInfo.getLastIsSelectionEnd()) {
            fMo348toPx0680j_4 /= f;
        }
        float fM2654getWidthimpl3 = f7 + fMo348toPx0680j_4 + f5;
        float f8 = (iM5378component2impl2 * fMo348toPx0680j_42) + f2;
        boolean z = contentDrawScope.getLayoutDirection() == LayoutDirection.Rtl;
        if (z) {
            fM2654getWidthimpl2 = Size.m2654getWidthimpl(contentDrawScope.mo3254getSizeNHjbRc()) - fM2654getWidthimpl2;
            fM2654getWidthimpl3 = Size.m2654getWidthimpl(contentDrawScope.mo3254getSizeNHjbRc()) - fM2654getWidthimpl3;
        }
        float fM2654getWidthimpl4 = fM2654getWidthimpl3;
        androidx.compose.ui.graphics.drawscope.b.K(contentDrawScope, j, OffsetKt.Offset(fM2654getWidthimpl2, f6), SizeKt.Size(iM5378component2impl == iM5378component2impl2 ? fM2654getWidthimpl4 - fM2654getWidthimpl2 : z ? -fM2654getWidthimpl2 : Size.m2654getWidthimpl(contentDrawScope.mo3254getSizeNHjbRc()) - fM2654getWidthimpl2, fMo348toPx0680j_43), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        if (iM5378component2impl != iM5378component2impl2) {
            for (int i2 = (iM5378component2impl2 - iM5378component2impl) - 1; i2 > 0; i2--) {
                androidx.compose.ui.graphics.drawscope.b.K(contentDrawScope, j, OffsetKt.Offset(0.0f, (i2 * fMo348toPx0680j_42) + f6), SizeKt.Size(Size.m2654getWidthimpl(contentDrawScope.mo3254getSizeNHjbRc()), fMo348toPx0680j_43), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
            }
            long jOffset = OffsetKt.Offset(contentDrawScope.getLayoutDirection() == LayoutDirection.Ltr ? 0.0f : Size.m2654getWidthimpl(contentDrawScope.mo3254getSizeNHjbRc()), f8);
            if (z) {
                fM2654getWidthimpl4 -= Size.m2654getWidthimpl(contentDrawScope.mo3254getSizeNHjbRc());
            }
            androidx.compose.ui.graphics.drawscope.b.K(contentDrawScope, j, jOffset, SizeKt.Size(fM2654getWidthimpl4, fMo348toPx0680j_43), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        }
    }

    public static final PaddingValues getCalendarMonthSubheadPadding() {
        return CalendarMonthSubheadPadding;
    }

    @Composable
    @ExperimentalMaterial3Api
    /* JADX INFO: renamed from: rememberDateRangePickerState-pMw4iz8, reason: not valid java name */
    public static final DateRangePickerState m1231rememberDateRangePickerStatepMw4iz8(Long l, Long l2, Long l3, f fVar, int i2, Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(501019096);
        final Long l4 = (i4 & 1) != 0 ? null : l;
        final Long l5 = (i4 & 2) != 0 ? null : l2;
        final Long l6 = (i4 & 4) != 0 ? l4 : l3;
        final f yearRange = (i4 & 8) != 0 ? DatePickerDefaults.INSTANCE.getYearRange() : fVar;
        final int iM1259getPickerjFl4v0 = (i4 & 16) != 0 ? DisplayMode.INSTANCE.m1259getPickerjFl4v0() : i2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(501019096, i3, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:157)");
        }
        DateRangePickerState dateRangePickerState = (DateRangePickerState) RememberSaveableKt.m2460rememberSaveable(new Object[0], (Saver) DateRangePickerState.INSTANCE.Saver(), (String) null, (kj.a) new kj.a<DateRangePickerState>() { // from class: androidx.compose.material3.DateRangePickerKt$rememberDateRangePickerState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DateRangePickerState m1239invoke() {
                return new DateRangePickerState(l4, l5, l6, yearRange, iM1259getPickerjFl4v0, null);
            }
        }, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dateRangePickerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDateSelection(StateData stateData, long j) {
        CalendarDate canonicalDate = stateData.getCalendarModel().getCanonicalDate(j);
        CalendarDate value = stateData.getSelectedStartDate().getValue();
        CalendarDate value2 = stateData.getSelectedEndDate().getValue();
        if ((value == null && value2 == null) || ((value != null && value2 != null) || (value != null && canonicalDate.compareTo(value) < 0))) {
            stateData.getSelectedStartDate().setValue(canonicalDate);
            stateData.getSelectedEndDate().setValue(null);
        } else {
            if (value == null || canonicalDate.compareTo(value) < 0) {
                return;
            }
            stateData.getSelectedEndDate().setValue(canonicalDate);
        }
    }
}
