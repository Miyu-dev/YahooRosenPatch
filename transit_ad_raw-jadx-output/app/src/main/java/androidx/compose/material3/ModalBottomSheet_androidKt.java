package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.Optimizer;
import cg.e;
import java.util.Map;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i0;
import kotlin.j;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0099\u0001\u0010\u0016\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\t2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a/\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0011H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a3\u0010!\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u0017H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001aL\u0010*\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0018\u0010)\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010'H\u0003\u001aD\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00190\"2\u0006\u0010+\u001a\u00020\u00052\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010'2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0011H\u0003\u001a0\u0010/\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000fH\u0001¢\u0006\u0004\b/\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, d2 = {"Lkotlin/Function0;", "Lkotlin/j;", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/SheetState;", "sheetState", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "scrimColor", "Landroidx/compose/runtime/Composable;", "dragHandle", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "content", "ModalBottomSheet-xOkiWaM", "(Lkj/a;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;Landroidx/compose/ui/graphics/Shape;JJFJLkj/p;Lkj/q;Landroidx/compose/runtime/Composer;II)V", "ModalBottomSheet", "", "skipPartiallyExpanded", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "rememberModalBottomSheetState", "(ZLkj/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", TypedValues.Custom.S_COLOR, "visible", "Scrim-3J-VO9M", "(JLkj/a;ZLandroidx/compose/runtime/Composer;I)V", "Scrim", "Landroidx/compose/material3/AnchorChangeHandler;", "anchorChangeHandler", "", "screenHeight", "bottomPadding", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "onDragStopped", "modalBottomSheetSwipeable", "state", "animateTo", "snapTo", "ModalBottomSheetAnchorChangeHandler", "ModalBottomSheetPopup", "(Lkj/a;Lkj/p;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class ModalBottomSheet_androidKt {

    /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$modalBottomSheetSwipeable$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public /* synthetic */ class C03501 extends FunctionReferenceImpl implements q<CoroutineScope, Float, dj.c<? super j>, Object> {
        public C03501(Object obj) {
            super(3, obj, m.a.class, "suspendConversion0", "modalBottomSheetSwipeable$suspendConversion0(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/CoroutineScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((CoroutineScope) obj, ((Number) obj2).floatValue(), (dj.c<? super j>) obj3);
        }

        public final Object invoke(CoroutineScope coroutineScope, float f, dj.c<? super j> cVar) {
            return ModalBottomSheet_androidKt.modalBottomSheetSwipeable$suspendConversion0((p) ((CallableReference) this).receiver, coroutineScope, f, cVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0103  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ModalBottomSheet-xOkiWaM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1372ModalBottomSheetxOkiWaM(final kj.a<kotlin.j> r34, androidx.compose.ui.Modifier r35, androidx.compose.material3.SheetState r36, androidx.compose.ui.graphics.Shape r37, long r38, long r40, float r42, long r43, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r45, final kj.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r46, androidx.compose.runtime.Composer r47, final int r48, final int r49) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheet_androidKt.m1372ModalBottomSheetxOkiWaM(kj.a, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, androidx.compose.ui.graphics.Shape, long, long, float, long, kj.p, kj.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalMaterial3Api
    public static final AnchorChangeHandler<SheetValue> ModalBottomSheetAnchorChangeHandler(final SheetState sheetState, final p<? super SheetValue, ? super Float, j> pVar, final l<? super SheetValue, j> lVar) {
        return new AnchorChangeHandler<SheetValue>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt.ModalBottomSheetAnchorChangeHandler.1

            /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetAnchorChangeHandler$1$WhenMappings */
            /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SheetValue.values().length];
                    try {
                        iArr[SheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            @Override // androidx.compose.material3.AnchorChangeHandler
            public final void onAnchorsChanged(SheetValue sheetValue, Map<SheetValue, Float> map, Map<SheetValue, Float> map2) throws NoWhenBranchMatchedException {
                SheetValue sheetValue2;
                m.h(sheetValue, "previousTarget");
                m.h(map, "previousAnchors");
                m.h(map2, "newAnchors");
                Float f = map.get(sheetValue);
                int i2 = WhenMappings.$EnumSwitchMapping$0[sheetValue.ordinal()];
                if (i2 == 1) {
                    sheetValue2 = SheetValue.Hidden;
                } else {
                    if (i2 != 2 && i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sheetValue2 = SheetValue.PartiallyExpanded;
                    if (!map2.containsKey(sheetValue2)) {
                        sheetValue2 = SheetValue.Expanded;
                        if (!map2.containsKey(sheetValue2)) {
                            sheetValue2 = SheetValue.Hidden;
                        }
                    }
                }
                if (f != null && ((Number) i0.L(sheetValue2, map2)).floatValue() == f.floatValue()) {
                    return;
                }
                if (sheetState.getSwipeableState$material3_release().isAnimationRunning() || map.isEmpty()) {
                    pVar.invoke(sheetValue2, Float.valueOf(sheetState.getSwipeableState$material3_release().getLastVelocity()));
                } else {
                    lVar.invoke(sheetValue2);
                }
            }
        };
    }

    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ModalBottomSheetPopup(final kj.a<j> aVar, final p<? super Composer, ? super Integer, j> pVar, Composer composer, final int i2) {
        int i3;
        m.h(aVar, "onDismissRequest");
        m.h(pVar, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2079923476);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2079923476, i3, -1, "androidx.compose.material3.ModalBottomSheetPopup (ModalBottomSheet.android.kt:346)");
            }
            AndroidPopup_androidKt.m5516PopupK5zGePQ(null, 0L, aVar, new PopupProperties(true, false, false, null, false, false, 62, null), pVar, composerStartRestartGroup, ((i3 << 6) & 896) | 3072 | ((i3 << 9) & 57344), 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt.ModalBottomSheetPopup.1
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
                ModalBottomSheet_androidKt.ModalBottomSheetPopup(aVar, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1373Scrim3JVO9M(final long j, final kj.a<j> aVar, final boolean z, Composer composer, final int i2) {
        int i3;
        Modifier modifierClearAndSetSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(1053897700);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1053897700, i3, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.android.kt:251)");
            }
            if (j != Color.INSTANCE.m2854getUnspecified0d7_KjU()) {
                final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                composerStartRestartGroup.startReplaceableGroup(-1858724388);
                if (z) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zChanged = composerStartRestartGroup.changed(aVar);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1(aVar, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(SuspendingPointerInputFilterKt.pointerInput(companion, aVar, (p<? super PointerInputScope, ? super dj.c<? super j>, ? extends Object>) objRememberedValue), new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$dismissSheet$2
                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            m.h(semanticsPropertyReceiver, "$this$clearAndSetSemantics");
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return j.a;
                        }
                    });
                } else {
                    modifierClearAndSetSemantics = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierClearAndSetSemantics);
                Color colorM2808boximpl = Color.m2808boximpl(j);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged2 = composerStartRestartGroup.changed(colorM2808boximpl) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new l<DrawScope, j>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DrawScope) obj);
                            return j.a;
                        }

                        public final void invoke(DrawScope drawScope) {
                            m.h(drawScope, "$this$Canvas");
                            androidx.compose.ui.graphics.drawscope.b.K(drawScope, j, 0L, 0L, ModalBottomSheet_androidKt.Scrim_3J_VO9M$lambda$2(stateAnimateFloatAsState), null, null, 0, 118, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierThen, (l) objRememberedValue2, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i4) {
                ModalBottomSheet_androidKt.m1373Scrim3JVO9M(j, aVar, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalMaterial3Api
    public static final Modifier modalBottomSheetSwipeable(Modifier modifier, final SheetState sheetState, AnchorChangeHandler<SheetValue> anchorChangeHandler, final float f, final float f2, p<? super CoroutineScope, ? super Float, j> pVar) {
        return SwipeableV2Kt.swipeAnchors(DraggableKt.draggable(modifier, sheetState.getSwipeableState$material3_release().getSwipeDraggableState(), Orientation.Vertical, (32 & 4) != 0 ? true : sheetState.isVisible(), (32 & 8) != 0 ? null : null, (32 & 16) != 0 ? false : sheetState.getSwipeableState$material3_release().isAnimationRunning(), (32 & 32) != 0 ? new DraggableKt.C01801(null) : null, (32 & 64) != 0 ? new DraggableKt.AnonymousClass2(null) : new C03501(pVar), (32 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? false : false), sheetState.getSwipeableState$material3_release(), e.l(new SheetValue[]{SheetValue.Hidden, SheetValue.PartiallyExpanded, SheetValue.Expanded}), anchorChangeHandler, new p<SheetValue, IntSize, Float>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt.modalBottomSheetSwipeable.2

            /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$modalBottomSheetSwipeable$2$WhenMappings */
            /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SheetValue.values().length];
                    try {
                        iArr[SheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m1382invokeO0kMr_c((SheetValue) obj, ((IntSize) obj2).getPackedValue());
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX INFO: renamed from: invoke-O0kMr_c, reason: not valid java name */
            public final Float m1382invokeO0kMr_c(SheetValue sheetValue, long j) throws NoWhenBranchMatchedException {
                m.h(sheetValue, "value");
                int i2 = WhenMappings.$EnumSwitchMapping$0[sheetValue.ordinal()];
                if (i2 == 1) {
                    return Float.valueOf(f + f2);
                }
                if (i2 == 2) {
                    if (IntSize.m5426getHeightimpl(j) >= f / 2 && !sheetState.getSkipPartiallyExpanded()) {
                        return Float.valueOf(f / 2.0f);
                    }
                    return null;
                }
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (IntSize.m5426getHeightimpl(j) != 0) {
                    return Float.valueOf(Math.max(0.0f, f - IntSize.m5426getHeightimpl(j)));
                }
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object modalBottomSheetSwipeable$suspendConversion0(p pVar, CoroutineScope coroutineScope, float f, dj.c cVar) {
        pVar.invoke(coroutineScope, new Float(f));
        return j.a;
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final SheetState rememberModalBottomSheetState(boolean z, l<? super SheetValue, Boolean> lVar, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1261794383);
        if ((i3 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i3 & 2) != 0) {
            lVar = new l<SheetValue, Boolean>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt.rememberModalBottomSheetState.1
                public final Boolean invoke(SheetValue sheetValue) {
                    m.h(sheetValue, "it");
                    return Boolean.TRUE;
                }
            };
        }
        l<? super SheetValue, Boolean> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1261794383, i2, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.android.kt:245)");
        }
        SheetState sheetStateRememberSheetState = SheetDefaultsKt.rememberSheetState(z2, lVar2, SheetValue.Hidden, false, composer, (i2 & 14) | 384 | (i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sheetStateRememberSheetState;
    }
}
