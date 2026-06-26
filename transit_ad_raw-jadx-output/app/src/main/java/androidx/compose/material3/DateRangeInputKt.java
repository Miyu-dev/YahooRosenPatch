package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.e;
import androidx.compose.material3.InputIdentifier;
import androidx.compose.material3.Strings;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
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

/* JADX INFO: compiled from: DateRangeInput.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\t\u0010\n\"\u0017\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/StateData;", "stateData", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function1;", "", "", "dateValidator", "Lkotlin/j;", "DateRangeInputContent", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkj/l;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "TextFieldSpacing", "F", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class DateRangeInputKt {
    private static final float TextFieldSpacing = Dp.m5267constructorimpl(8);

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DateRangeInputContent(final StateData stateData, final DatePickerFormatter datePickerFormatter, final l<? super Long, Boolean> lVar, Composer composer, final int i2) {
        int i3;
        Locale locale;
        int i4;
        DateInputFormat dateInputFormat;
        Composer composer2;
        m.h(stateData, "stateData");
        m.h(datePickerFormatter, "dateFormatter");
        m.h(lVar, "dateValidator");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1163802470);
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
        int i5 = i3;
        if ((i5 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1163802470, i5, -1, "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:31)");
            }
            Locale localeDefaultLocale = CalendarModel_androidKt.defaultLocale(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = stateData.getCalendarModel().getDateInputFormat(localeDefaultLocale);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            DateInputFormat dateInputFormat2 = (DateInputFormat) objRememberedValue;
            Strings.Companion companion = Strings.INSTANCE;
            String strM1581getStringNWtq28 = Strings_androidKt.m1581getStringNWtq28(companion.m1527getDateInputInvalidForPatternadMyvUU(), composerStartRestartGroup, 6);
            String strM1581getStringNWtq282 = Strings_androidKt.m1581getStringNWtq28(companion.m1529getDateInputInvalidYearRangeadMyvUU(), composerStartRestartGroup, 6);
            String strM1581getStringNWtq283 = Strings_androidKt.m1581getStringNWtq28(companion.m1528getDateInputInvalidNotAllowedadMyvUU(), composerStartRestartGroup, 6);
            String strM1581getStringNWtq284 = Strings_androidKt.m1581getStringNWtq28(companion.m1548getDateRangeInputInvalidRangeInputadMyvUU(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged2 = composerStartRestartGroup.changed(dateInputFormat2) | composerStartRestartGroup.changed(datePickerFormatter);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                locale = localeDefaultLocale;
                i4 = 6;
                dateInputFormat = dateInputFormat2;
                DateInputValidator dateInputValidator = new DateInputValidator(stateData, dateInputFormat2, datePickerFormatter, lVar, strM1581getStringNWtq28, strM1581getStringNWtq282, strM1581getStringNWtq283, strM1581getStringNWtq284);
                composerStartRestartGroup.updateRememberedValue(dateInputValidator);
                objRememberedValue2 = dateInputValidator;
            } else {
                i4 = 6;
                dateInputFormat = dateInputFormat2;
                locale = localeDefaultLocale;
            }
            composerStartRestartGroup.endReplaceableGroup();
            DateInputValidator dateInputValidator2 = (DateInputValidator) objRememberedValue2;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(companion2, DateInputKt.getInputTextFieldPadding());
            Arrangement.HorizontalOrVertical horizontalOrVerticalM408spacedBy0680j_4 = Arrangement.INSTANCE.m408spacedBy0680j_4(TextFieldSpacing);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM408spacedBy0680j_4, Alignment.INSTANCE.getTop(), composerStartRestartGroup, i4);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierPadding);
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
            Locale locale2 = locale;
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion3, composerM2437constructorimpl, measurePolicyRowMeasurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            final String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            m.g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            final String strM1581getStringNWtq285 = Strings_androidKt.m1581getStringNWtq28(companion.m1554getDateRangePickerStartHeadlineadMyvUU(), composerStartRestartGroup, 6);
            Modifier modifierA = e.a(rowScopeInstance, companion2, 0.5f, false, 2, null);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 576559191, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$1
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
                        ComposerKt.traceEventStart(576559191, i6, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:65)");
                    }
                    final String str = strM1581getStringNWtq285;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    final String str2 = upperCase;
                    composer3.startReplaceableGroup(511388516);
                    boolean zChanged3 = composer3.changed(str) | composer3.changed(str2);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$1$1$1
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
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str + ", " + str2);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    composer3.endReplaceableGroup();
                    TextKt.m1685Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion4, false, (l) objRememberedValue3, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, j>) null, (TextStyle) null, composer3, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1726391478, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$2
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
                        ComposerKt.traceEventStart(1726391478, i6, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:71)");
                    }
                    TextKt.m1685Text4IGK_g(upperCase, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$2.1
                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            m.h(semanticsPropertyReceiver, "$this$clearAndSetSemantics");
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return j.a;
                        }
                    }), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, j>) null, (TextStyle) null, composer3, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            CalendarDate value = stateData.getSelectedStartDate().getValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(stateData);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new l<CalendarDate, j>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$3$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((CalendarDate) obj);
                        return j.a;
                    }

                    public final void invoke(CalendarDate calendarDate) {
                        stateData.getSelectedStartDate().setValue(calendarDate);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            InputIdentifier.Companion companion4 = InputIdentifier.INSTANCE;
            int i6 = ((i5 << 9) & 7168) | 1075315120;
            composer2 = composerStartRestartGroup;
            DateInputKt.m1189DateInputTextFieldzm97o8M(modifierA, composableLambda, composableLambda2, stateData, value, (l) objRememberedValue3, companion4.m1344getStartDateInputJ2x2o4M(), dateInputValidator2, dateInputFormat, locale2, composerStartRestartGroup, i6);
            final String strM1581getStringNWtq286 = Strings_androidKt.m1581getStringNWtq28(companion.m1551getDateRangePickerEndHeadlineadMyvUU(), composer2, 6);
            Modifier modifierA2 = e.a(rowScopeInstance, companion2, 0.5f, false, 2, null);
            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer2, -663502784, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$4
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
                        ComposerKt.traceEventStart(-663502784, i7, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:83)");
                    }
                    final String str = strM1581getStringNWtq286;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    final String str2 = upperCase;
                    composer3.startReplaceableGroup(511388516);
                    boolean zChanged4 = composer3.changed(str) | composer3.changed(str2);
                    Object objRememberedValue4 = composer3.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$4$1$1
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
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str + ", " + str2);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    composer3.endReplaceableGroup();
                    TextKt.m1685Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion5, false, (l) objRememberedValue4, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, j>) null, (TextStyle) null, composer3, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composer2, 518729951, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$5
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
                        ComposerKt.traceEventStart(518729951, i7, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:89)");
                    }
                    TextKt.m1685Text4IGK_g(upperCase, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$5.1
                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            m.h(semanticsPropertyReceiver, "$this$clearAndSetSemantics");
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return j.a;
                        }
                    }), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, j>) null, (TextStyle) null, composer3, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            CalendarDate value2 = stateData.getSelectedEndDate().getValue();
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged4 = composer2.changed(stateData);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new l<CalendarDate, j>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$6$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((CalendarDate) obj);
                        return j.a;
                    }

                    public final void invoke(CalendarDate calendarDate) {
                        stateData.getSelectedEndDate().setValue(calendarDate);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            DateInputKt.m1189DateInputTextFieldzm97o8M(modifierA2, composableLambda3, composableLambda4, stateData, value2, (l) objRememberedValue4, companion4.m1342getEndDateInputJ2x2o4M(), dateInputValidator2, dateInputFormat, locale2, composer2, i6);
            if (android.support.v4.media.a.p(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DateRangeInputKt.DateRangeInputContent.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer3, int i7) {
                DateRangeInputKt.DateRangeInputContent(stateData, datePickerFormatter, lVar, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }
}
