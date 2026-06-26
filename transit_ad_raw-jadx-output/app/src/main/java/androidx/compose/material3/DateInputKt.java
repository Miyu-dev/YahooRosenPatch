package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.Locale;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;
import kotlin.text.r;

/* JADX INFO: compiled from: DateInput.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u008f\u0001\u0010\u001e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\"\u001a\u0010 \u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0017\u0010%\u001a\u00020$8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/material3/StateData;", "stateData", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function1;", "", "", "dateValidator", "Lkotlin/j;", "DateInputContent", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkj/l;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "Landroidx/compose/material3/CalendarDate;", "initialDate", "onDateChanged", "Landroidx/compose/material3/InputIdentifier;", "inputIdentifier", "Landroidx/compose/material3/DateInputValidator;", "dateInputValidator", "Landroidx/compose/material3/DateInputFormat;", "dateInputFormat", "Ljava/util/Locale;", "locale", "DateInputTextField-zm97o8M", "(Landroidx/compose/ui/Modifier;Lkj/p;Lkj/p;Landroidx/compose/material3/StateData;Landroidx/compose/material3/CalendarDate;Lkj/l;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/DateInputFormat;Ljava/util/Locale;Landroidx/compose/runtime/Composer;I)V", "DateInputTextField", "Landroidx/compose/foundation/layout/PaddingValues;", "InputTextFieldPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getInputTextFieldPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/Dp;", "InputTextNonErroneousBottomPadding", "F", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class DateInputKt {
    private static final PaddingValues InputTextFieldPadding;
    private static final float InputTextNonErroneousBottomPadding = Dp.m5267constructorimpl(16);

    static {
        float f = 24;
        InputTextFieldPadding = PaddingKt.m458PaddingValuesa9UjIt4$default(Dp.m5267constructorimpl(f), Dp.m5267constructorimpl(10), Dp.m5267constructorimpl(f), 0.0f, 8, null);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DateInputContent(final StateData stateData, final DatePickerFormatter datePickerFormatter, final l<? super Long, Boolean> lVar, Composer composer, final int i2) {
        int i3;
        int i4;
        DateInputFormat dateInputFormat;
        Composer composer2;
        m.h(stateData, "stateData");
        m.h(datePickerFormatter, "dateFormatter");
        m.h(lVar, "dateValidator");
        Composer composerStartRestartGroup = composer.startRestartGroup(814303288);
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
                ComposerKt.traceEventStart(814303288, i5, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:48)");
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
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged2 = composerStartRestartGroup.changed(dateInputFormat2) | composerStartRestartGroup.changed(datePickerFormatter);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                i4 = 6;
                dateInputFormat = dateInputFormat2;
                DateInputValidator dateInputValidator = new DateInputValidator(stateData, dateInputFormat2, datePickerFormatter, lVar, strM1581getStringNWtq28, strM1581getStringNWtq282, strM1581getStringNWtq283, "");
                composerStartRestartGroup.updateRememberedValue(dateInputValidator);
                objRememberedValue2 = dateInputValidator;
            } else {
                i4 = 6;
                dateInputFormat = dateInputFormat2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            DateInputValidator dateInputValidator2 = (DateInputValidator) objRememberedValue2;
            final String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            m.g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            final String strM1581getStringNWtq284 = Strings_androidKt.m1581getStringNWtq28(companion.m1530getDateInputLabeladMyvUU(), composerStartRestartGroup, i4);
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), InputTextFieldPadding);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -438341159, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.1
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
                        ComposerKt.traceEventStart(-438341159, i6, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:79)");
                    }
                    final String str = strM1581getStringNWtq284;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    final String str2 = upperCase;
                    composer3.startReplaceableGroup(511388516);
                    boolean zChanged3 = composer3.changed(str) | composer3.changed(str2);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$1$1$1
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
                    TextKt.m1685Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion2, false, (l) objRememberedValue3, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, j>) null, (TextStyle) null, composer3, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1914447672, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.2
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
                        ComposerKt.traceEventStart(1914447672, i6, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:84)");
                    }
                    TextKt.m1685Text4IGK_g(upperCase, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.2.1
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
                objRememberedValue3 = new l<CalendarDate, j>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$3$1
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
            composer2 = composerStartRestartGroup;
            m1189DateInputTextFieldzm97o8M(modifierPadding, composableLambda, composableLambda2, stateData, value, (l) objRememberedValue3, InputIdentifier.INSTANCE.m1343getSingleDateInputJ2x2o4M(), dateInputValidator2, dateInputFormat, localeDefaultLocale, composerStartRestartGroup, ((i5 << 9) & 7168) | 1075315126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.4
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
                DateInputKt.DateInputContent(stateData, datePickerFormatter, lVar, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_]]")
    /* JADX INFO: renamed from: DateInputTextField-zm97o8M, reason: not valid java name */
    public static final void m1189DateInputTextFieldzm97o8M(final Modifier modifier, final p<? super Composer, ? super Integer, j> pVar, final p<? super Composer, ? super Integer, j> pVar2, final StateData stateData, final CalendarDate calendarDate, final l<? super CalendarDate, j> lVar, final int i2, final DateInputValidator dateInputValidator, final DateInputFormat dateInputFormat, final Locale locale, Composer composer, final int i3) {
        m.h(modifier, "modifier");
        m.h(stateData, "stateData");
        m.h(lVar, "onDateChanged");
        m.h(dateInputValidator, "dateInputValidator");
        m.h(dateInputFormat, "dateInputFormat");
        m.h(locale, "locale");
        Composer composerStartRestartGroup = composer.startRestartGroup(626552973);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(626552973, i3, -1, "androidx.compose.material3.DateInputTextField (DateInput.kt:97)");
        }
        final MutableState mutableState = (MutableState) RememberSaveableKt.m2460rememberSaveable(new Object[0], (Saver) null, (String) null, (kj.a) new kj.a<MutableState<String>>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$errorText$1
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final MutableState<String> m1190invoke() {
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            }
        }, composerStartRestartGroup, 3080, 6);
        final MutableState mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (kj.a) new kj.a<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$text$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final MutableState<TextFieldValue> m1191invoke() {
                String withPattern;
                StateData stateData2 = stateData;
                CalendarDate calendarDate2 = calendarDate;
                DateInputFormat dateInputFormat2 = dateInputFormat;
                Locale locale2 = locale;
                if (calendarDate2 == null || (withPattern = stateData2.getCalendarModel().formatWithPattern(calendarDate2.getUtcTimeMillis(), dateInputFormat2.getPatternWithoutDelimiters(), locale2)) == null) {
                    withPattern = "";
                }
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(withPattern, TextRangeKt.TextRange(0, 0), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
            }
        }, composerStartRestartGroup, 72, 4);
        TextFieldValue textFieldValueDateInputTextField_zm97o8M$lambda$3 = DateInputTextField_zm97o8M$lambda$3(mutableStateRememberSaveable);
        l<TextFieldValue, j> lVar2 = new l<TextFieldValue, j>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldValue) obj);
                return j.a;
            }

            public final void invoke(TextFieldValue textFieldValue) {
                boolean z;
                m.h(textFieldValue, "input");
                if (textFieldValue.getText().length() <= dateInputFormat.getPatternWithoutDelimiters().length()) {
                    String text = textFieldValue.getText();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= text.length()) {
                            z = true;
                            break;
                        } else {
                            if (!Character.isDigit(text.charAt(i4))) {
                                z = false;
                                break;
                            }
                            i4++;
                        }
                    }
                    if (z) {
                        mutableStateRememberSaveable.setValue(textFieldValue);
                        String string = r.L1(textFieldValue.getText()).toString();
                        if ((string.length() == 0) || string.length() < dateInputFormat.getPatternWithoutDelimiters().length()) {
                            mutableState.setValue("");
                            lVar.invoke((Object) null);
                        } else {
                            CalendarDate calendarDate2 = stateData.getCalendarModel().parse(string, dateInputFormat.getPatternWithoutDelimiters());
                            mutableState.setValue(dateInputValidator.m1192validateXivgLIo(calendarDate2, i2, locale));
                            lVar.invoke(mutableState.getValue().length() == 0 ? calendarDate2 : null);
                        }
                    }
                }
            }
        };
        Modifier modifierM465paddingqDBjuR0$default = PaddingKt.m465paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, kotlin.text.m.X0((CharSequence) mutableState.getValue()) ^ true ? Dp.m5267constructorimpl(0) : InputTextNonErroneousBottomPadding, 7, null);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$2$1
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
                    if (!kotlin.text.m.X0(mutableState.getValue())) {
                        SemanticsPropertiesKt.error(semanticsPropertyReceiver, mutableState.getValue());
                    }
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i4 = i3 << 15;
        OutlinedTextFieldKt.OutlinedTextField(textFieldValueDateInputTextField_zm97o8M$lambda$3, (l<? super TextFieldValue, j>) lVar2, SemanticsModifierKt.semantics$default(modifierM465paddingqDBjuR0$default, false, (l) objRememberedValue, 1, null), false, false, (TextStyle) null, pVar, pVar2, (p<? super Composer, ? super Integer, j>) null, (p<? super Composer, ? super Integer, j>) null, (p<? super Composer, ? super Integer, j>) null, (p<? super Composer, ? super Integer, j>) null, (p<? super Composer, ? super Integer, j>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 785795078, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$3
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
            public final void invoke(Composer composer2, int i5) {
                if ((i5 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(785795078, i5, -1, "androidx.compose.material3.DateInputTextField.<anonymous> (DateInput.kt:171)");
                }
                if (!kotlin.text.m.X0(mutableState.getValue())) {
                    TextKt.m1685Text4IGK_g(mutableState.getValue(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, j>) null, (TextStyle) null, composer2, 0, 0, 131070);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), !kotlin.text.m.X0((CharSequence) mutableState.getValue()), (VisualTransformation) new DateVisualTransformation(dateInputFormat), new KeyboardOptions(0, false, KeyboardType.INSTANCE.m5008getNumberPjHm6EE(), ImeAction.INSTANCE.m4959getDoneeUduSuo(), 1, null), (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composerStartRestartGroup, (3670016 & i4) | (i4 & 29360128), 12779904, 0, 8195896);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$4
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
                DateInputKt.m1189DateInputTextFieldzm97o8M(modifier, pVar, pVar2, stateData, calendarDate, lVar, i2, dateInputValidator, dateInputFormat, locale, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
            }
        });
    }

    private static final TextFieldValue DateInputTextField_zm97o8M$lambda$3(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    public static final PaddingValues getInputTextFieldPadding() {
        return InputTextFieldPadding;
    }
}
