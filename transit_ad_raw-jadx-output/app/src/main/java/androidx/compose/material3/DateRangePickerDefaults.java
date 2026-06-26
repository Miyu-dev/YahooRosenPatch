package androidx.compose.material3;

import androidx.appcompat.widget.v;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.DisplayMode;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.LiveRegionMode;
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
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.Locale;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017Jp\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/DateRangePickerDefaults;", "", "Landroidx/compose/material3/DateRangePickerState;", "state", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Landroidx/compose/ui/Modifier;", "modifier", "", "startDateText", "endDateText", "Lkotlin/Function0;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "startDatePlaceholder", "endDatePlaceholder", "datesDelimiter", "DateRangePickerHeadline", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkj/p;Lkj/p;Lkj/p;Landroidx/compose/runtime/Composer;I)V", "DateRangePickerTitle", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class DateRangePickerDefaults {
    public static final int $stable = 0;
    public static final DateRangePickerDefaults INSTANCE = new DateRangePickerDefaults();

    private DateRangePickerDefaults() {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DateRangePickerHeadline(final androidx.compose.material3.DateRangePickerState r18, final androidx.compose.material3.DatePickerFormatter r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline(androidx.compose.material3.DateRangePickerState, androidx.compose.material3.DatePickerFormatter, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DateRangePickerTitle(final androidx.compose.material3.DateRangePickerState r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle(androidx.compose.material3.DateRangePickerState, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void DateRangePickerHeadline(final DateRangePickerState dateRangePickerState, final DatePickerFormatter datePickerFormatter, final Modifier modifier, final String str, final String str2, final p<? super Composer, ? super Integer, j> pVar, final p<? super Composer, ? super Integer, j> pVar2, final p<? super Composer, ? super Integer, j> pVar3, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-861159957);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(dateRangePickerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerFormatter) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar2) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar3) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if ((23967451 & i4) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-861159957, i4, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:368)");
            }
            StateData stateData = dateRangePickerState.getStateData();
            Locale localeDefaultLocale = CalendarModel_androidKt.defaultLocale(composerStartRestartGroup, 0);
            String date$material3_release$default = DatePickerFormatter.formatDate$material3_release$default(datePickerFormatter, stateData.getSelectedStartDate().getValue(), stateData.getCalendarModel(), localeDefaultLocale, false, 8, null);
            String date$material3_release$default2 = DatePickerFormatter.formatDate$material3_release$default(datePickerFormatter, stateData.getSelectedEndDate().getValue(), stateData.getCalendarModel(), localeDefaultLocale, false, 8, null);
            String date$material3_release = datePickerFormatter.formatDate$material3_release(stateData.getSelectedStartDate().getValue(), stateData.getCalendarModel(), localeDefaultLocale, true);
            composerStartRestartGroup.startReplaceableGroup(-1212634278);
            String strM1581getStringNWtq28 = "";
            if (date$material3_release == null) {
                int value = stateData.getDisplayMode().getValue().getValue();
                DisplayMode.Companion companion = DisplayMode.INSTANCE;
                if (DisplayMode.m1254equalsimpl0(value, companion.m1259getPickerjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(1922096411);
                    date$material3_release = Strings_androidKt.m1581getStringNWtq28(Strings.INSTANCE.m1536getDatePickerNoSelectionDescriptionadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1254equalsimpl0(value, companion.m1258getInputjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(1922096500);
                    date$material3_release = Strings_androidKt.m1581getStringNWtq28(Strings.INSTANCE.m1531getDateInputNoInputDescriptionadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-544548443);
                    composerStartRestartGroup.endReplaceableGroup();
                    date$material3_release = "";
                }
            }
            composerStartRestartGroup.endReplaceableGroup();
            String date$material3_release2 = datePickerFormatter.formatDate$material3_release(stateData.getSelectedEndDate().getValue(), stateData.getCalendarModel(), localeDefaultLocale, true);
            composerStartRestartGroup.startReplaceableGroup(-1212633768);
            if (date$material3_release2 == null) {
                int value2 = stateData.getDisplayMode().getValue().getValue();
                DisplayMode.Companion companion2 = DisplayMode.INSTANCE;
                if (DisplayMode.m1254equalsimpl0(value2, companion2.m1259getPickerjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(1922096919);
                    strM1581getStringNWtq28 = Strings_androidKt.m1581getStringNWtq28(Strings.INSTANCE.m1536getDatePickerNoSelectionDescriptionadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1254equalsimpl0(value2, companion2.m1258getInputjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(1922097008);
                    strM1581getStringNWtq28 = Strings_androidKt.m1581getStringNWtq28(Strings.INSTANCE.m1531getDateInputNoInputDescriptionadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-544532695);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            } else {
                strM1581getStringNWtq28 = date$material3_release2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            final String str3 = str + ": " + date$material3_release;
            final String str4 = str2 + ": " + strM1581getStringNWtq28;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(str3) | composerStartRestartGroup.changed(str4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$4$1$1
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
                        SemanticsPropertiesKt.m4653setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.m4632getPolite0phEisY());
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str3 + ", " + str4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (l) objRememberedValue);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM408spacedBy0680j_4 = Arrangement.INSTANCE.m408spacedBy0680j_4(Dp.m5267constructorimpl(4));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM408spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
            Density density = (Density) v.d(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion3.getConstructor();
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
            composer2 = composerStartRestartGroup;
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion3, composerM2437constructorimpl, measurePolicyRowMeasurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (date$material3_release$default != null) {
                composer2.startReplaceableGroup(990390609);
                TextKt.m1685Text4IGK_g(date$material3_release$default, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, j>) null, (TextStyle) null, composer2, 0, 0, 131070);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(990390686);
                pVar.invoke(composer2, Integer.valueOf((i4 >> 15) & 14));
                composer2.endReplaceableGroup();
            }
            pVar3.invoke(composer2, Integer.valueOf((i4 >> 21) & 14));
            if (date$material3_release$default2 != null) {
                composer2.startReplaceableGroup(990390828);
                TextKt.m1685Text4IGK_g(date$material3_release$default2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, j>) null, (TextStyle) null, composer2, 0, 0, 131070);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(990390903);
                pVar2.invoke(composer2, Integer.valueOf((i4 >> 18) & 14));
                composer2.endReplaceableGroup();
            }
            if (android.support.v4.media.a.p(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.5
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
                DateRangePickerDefaults.this.DateRangePickerHeadline(dateRangePickerState, datePickerFormatter, modifier, str, str2, pVar, pVar2, pVar3, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }
}
