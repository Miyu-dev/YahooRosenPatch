package androidx.compose.material3;

import a.f;
import androidx.appcompat.widget.v;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.Optimizer;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aØ\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'\u001aØ\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010)\u001aª\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010*\u001aª\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010+\u001aî\u0001\u00105\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\r2\u0013\u0010-\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u00100\u001a\u00020/2\u0011\u00101\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b5\u00106\u001aU\u0010B\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020>H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010A\u001au\u0010O\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020\u00072\u0006\u0010?\u001a\u00020>2\u0006\u0010L\u001a\u00020/2\u0006\u00104\u001a\u000203H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010N\u001a\u009a\u0001\u0010_\u001a\u00020\u0003*\u00020P2\u0006\u0010Q\u001a\u00020\u001d2\u0006\u0010R\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020S2\b\u0010U\u001a\u0004\u0018\u00010S2\b\u0010V\u001a\u0004\u0018\u00010S2\b\u0010W\u001a\u0004\u0018\u00010S2\b\u0010X\u001a\u0004\u0018\u00010S2\b\u0010Y\u001a\u0004\u0018\u00010S2\b\u0010Z\u001a\u0004\u0018\u00010S2\u0006\u0010[\u001a\u00020S2\b\u0010\\\u001a\u0004\u0018\u00010S2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\u001d2\u0006\u0010^\u001a\u00020\u001d2\u0006\u00100\u001a\u00020/2\u0006\u0010L\u001a\u00020/H\u0002\u001a\u0080\u0001\u0010a\u001a\u00020\u0003*\u00020P2\u0006\u0010Q\u001a\u00020\u001d2\u0006\u0010R\u001a\u00020\u001d2\u0006\u0010`\u001a\u00020S2\b\u0010V\u001a\u0004\u0018\u00010S2\b\u0010W\u001a\u0004\u0018\u00010S2\b\u0010X\u001a\u0004\u0018\u00010S2\b\u0010Y\u001a\u0004\u0018\u00010S2\b\u0010Z\u001a\u0004\u0018\u00010S2\u0006\u0010[\u001a\u00020S2\b\u0010\\\u001a\u0004\u0018\u00010S2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010L\u001a\u00020/2\u0006\u00104\u001a\u000203H\u0002\u001a\u0014\u0010d\u001a\u00020\u0005*\u00020\u00052\u0006\u0010c\u001a\u00020bH\u0000\"\u001d\u0010f\u001a\u00020e8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006j"}, d2 = {"", "value", "Lkotlin/Function1;", "Lkotlin/j;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/TextFieldColors;", "colors", TextFieldImplKt.TextFieldId, "(Ljava/lang/String;Lkj/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkj/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Ljava/lang/String;Lkj/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkj/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "textField", "leading", "trailing", "", "animationProgress", "container", "supporting", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "TextFieldLayout", "(Landroidx/compose/ui/Modifier;Lkj/p;Lkj/p;Lkj/q;Lkj/p;Lkj/p;Lkj/p;Lkj/p;ZFLkj/p;Lkj/p;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "Landroidx/compose/ui/unit/Constraints;", "constraints", "calculateWidth-yeHjK3Y", "(IIIIIIIJ)I", "calculateWidth", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "isLabelFocused", "density", "calculateHeight-mKXJcVc", "(IIIIIIIIZJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateHeight", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "totalHeight", "Landroidx/compose/ui/layout/Placeable;", "textfieldPlaceable", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelEndPosition", "textPosition", "placeWithLabel", "textPlaceable", "placeWithoutLabel", "Landroidx/compose/foundation/BorderStroke;", "indicatorBorder", "drawIndicatorLine", "Landroidx/compose/ui/unit/Dp;", "TextFieldWithLabelVerticalPadding", "F", "getTextFieldWithLabelVerticalPadding", "()F", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class TextFieldKt {
    private static final float TextFieldWithLabelVerticalPadding = Dp.m5267constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:107:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:363:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextField(final java.lang.String r123, final kj.l<? super java.lang.String, kotlin.j> r124, androidx.compose.ui.Modifier r125, boolean r126, boolean r127, androidx.compose.ui.text.TextStyle r128, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r129, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r130, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r131, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r132, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r133, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r134, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r135, boolean r136, androidx.compose.ui.text.input.VisualTransformation r137, androidx.compose.foundation.text.KeyboardOptions r138, androidx.compose.foundation.text.KeyboardActions r139, boolean r140, int r141, int r142, androidx.compose.foundation.interaction.MutableInteractionSource r143, androidx.compose.ui.graphics.Shape r144, androidx.compose.material3.TextFieldColors r145, androidx.compose.runtime.Composer r146, final int r147, final int r148, final int r149, final int r150) {
        /*
            Method dump skipped, instruction units count: 1725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(java.lang.String, kj.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kj.p, kj.p, kj.p, kj.p, kj.p, kj.p, kj.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextFieldLayout(final Modifier modifier, final p<? super Composer, ? super Integer, j> pVar, final p<? super Composer, ? super Integer, j> pVar2, final q<? super Modifier, ? super Composer, ? super Integer, j> qVar, final p<? super Composer, ? super Integer, j> pVar3, final p<? super Composer, ? super Integer, j> pVar4, final p<? super Composer, ? super Integer, j> pVar5, final p<? super Composer, ? super Integer, j> pVar6, final boolean z, final float f, final p<? super Composer, ? super Integer, j> pVar7, final p<? super Composer, ? super Integer, j> pVar8, final PaddingValues paddingValues, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        PaddingValues paddingValues2;
        m.h(modifier, "modifier");
        m.h(pVar, "textField");
        m.h(pVar7, "container");
        m.h(paddingValues, "paddingValues");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1830307184);
        if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        int i6 = i2 & 896;
        int i7 = Optimizer.OPTIMIZATION_CACHE_MEASURES;
        if (i6 == 0) {
            i4 |= composerStartRestartGroup.changedInstance(pVar2) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(qVar) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((57344 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(pVar3) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(pVar4) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(pVar5) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(pVar6) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
        }
        if ((1879048192 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 536870912 : 268435456;
        }
        if ((i3 & 14) == 0) {
            i5 = i3 | (composerStartRestartGroup.changedInstance(pVar7) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(pVar8) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            paddingValues2 = paddingValues;
            if (!composerStartRestartGroup.changed(paddingValues2)) {
                i7 = 128;
            }
            i5 |= i7;
        } else {
            paddingValues2 = paddingValues;
        }
        if ((i4 & 1533916891) == 306783378 && (i5 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1830307184, i4, i5, "androidx.compose.material3.TextFieldLayout (TextField.kt:497)");
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            Float fValueOf = Float.valueOf(f);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(fValueOf) | composerStartRestartGroup.changed(paddingValues2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new TextFieldMeasurePolicy(z, f, paddingValues2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) objRememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            int i8 = (i4 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            Density density = (Density) v.d(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifier);
            int i9 = ((i8 << 9) & 7168) | 6;
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
            Updater.m2444setimpl(composerM2437constructorimpl, textFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2444setimpl(composerM2437constructorimpl, density, companion.getSetDensity());
            Updater.m2444setimpl(composerM2437constructorimpl, layoutDirection2, companion.getSetLayoutDirection());
            Updater.m2444setimpl(composerM2437constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            androidx.appcompat.graphics.drawable.a.g((i9 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, qVarMaterializerOf, SkippableUpdater.m2425boximpl(SkippableUpdater.m2426constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            pVar7.invoke(composerStartRestartGroup, Integer.valueOf(i5 & 14));
            composerStartRestartGroup.startReplaceableGroup(-95272008);
            if (pVar3 != null) {
                Modifier modifierThen = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LeadingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                Density density2 = (Density) v.d(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                kj.a<ComposeUiNode> constructor2 = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf2 = LayoutKt.materializerOf(modifierThen);
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
                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf2, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM2437constructorimpl2, density2, composerM2437constructorimpl2, layoutDirection3, composerM2437constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                androidx.appcompat.view.menu.a.l((i4 >> 12) & 14, pVar3, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-95271673);
            if (pVar4 != null) {
                Modifier modifierThen2 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                Density density3 = (Density) v.d(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                kj.a<ComposeUiNode> constructor3 = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf3 = LayoutKt.materializerOf(modifierThen2);
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
                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf3, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, composerM2437constructorimpl3, density3, composerM2437constructorimpl3, layoutDirection4, composerM2437constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                androidx.appcompat.view.menu.a.l((i4 >> 15) & 14, pVar4, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues2, layoutDirection);
            float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues2, layoutDirection);
            if (pVar3 != null) {
                float fM5267constructorimpl = Dp.m5267constructorimpl(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding());
                float fM5267constructorimpl2 = Dp.m5267constructorimpl(0);
                if (fM5267constructorimpl < fM5267constructorimpl2) {
                    fM5267constructorimpl = fM5267constructorimpl2;
                }
                fCalculateStartPadding = Dp.m5267constructorimpl(fM5267constructorimpl);
            }
            if (pVar4 != null) {
                float fM5267constructorimpl3 = Dp.m5267constructorimpl(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding());
                float fM5267constructorimpl4 = Dp.m5267constructorimpl(0);
                if (fM5267constructorimpl3 < fM5267constructorimpl4) {
                    fM5267constructorimpl3 = fM5267constructorimpl4;
                }
                fCalculateEndPadding = Dp.m5267constructorimpl(fM5267constructorimpl3);
            }
            composerStartRestartGroup.startReplaceableGroup(-95270733);
            if (pVar5 != null) {
                Modifier modifierM465paddingqDBjuR0$default = PaddingKt.m465paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m492heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), fCalculateStartPadding, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyB = android.support.v4.media.a.b(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                kj.a<ComposeUiNode> constructor4 = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf4 = LayoutKt.materializerOf(modifierM465paddingqDBjuR0$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2437constructorimpl4 = Updater.m2437constructorimpl(composerStartRestartGroup);
                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf4, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl4, measurePolicyB, composerM2437constructorimpl4, density4, composerM2437constructorimpl4, layoutDirection5, composerM2437constructorimpl4, viewConfiguration4, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                androidx.appcompat.view.menu.a.l((i4 >> 18) & 14, pVar5, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-95270334);
            if (pVar6 != null) {
                Modifier modifierM465paddingqDBjuR0$default2 = PaddingKt.m465paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m492heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, fCalculateEndPadding, 0.0f, 10, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyB2 = android.support.v4.media.a.b(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                kj.a<ComposeUiNode> constructor5 = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf5 = LayoutKt.materializerOf(modifierM465paddingqDBjuR0$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2437constructorimpl5 = Updater.m2437constructorimpl(composerStartRestartGroup);
                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf5, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl5, measurePolicyB2, composerM2437constructorimpl5, density5, composerM2437constructorimpl5, layoutDirection6, composerM2437constructorimpl5, viewConfiguration5, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                androidx.appcompat.view.menu.a.l((i4 >> 21) & 14, pVar6, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-95269936);
            if (pVar2 != null) {
                Modifier modifierM465paddingqDBjuR0$default3 = PaddingKt.m465paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m492heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LabelId), DpKt.m5310lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f), 0.0f, 2, null), null, false, 3, null), fCalculateStartPadding, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyB3 = android.support.v4.media.a.b(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                kj.a<ComposeUiNode> constructor6 = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf6 = LayoutKt.materializerOf(modifierM465paddingqDBjuR0$default3);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor6);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2437constructorimpl6 = Updater.m2437constructorimpl(composerStartRestartGroup);
                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf6, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl6, measurePolicyB3, composerM2437constructorimpl6, density6, composerM2437constructorimpl6, layoutDirection7, composerM2437constructorimpl6, viewConfiguration6, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                androidx.appcompat.view.menu.a.l((i4 >> 6) & 14, pVar2, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m492heightInVpY3zN4$default(companion2, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
            if (pVar5 != null) {
                fCalculateStartPadding = Dp.m5267constructorimpl(0);
            }
            float f2 = fCalculateStartPadding;
            if (pVar6 != null) {
                fCalculateEndPadding = Dp.m5267constructorimpl(0);
            }
            Modifier modifierM465paddingqDBjuR0$default4 = PaddingKt.m465paddingqDBjuR0$default(modifierWrapContentHeight$default, f2, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
            composerStartRestartGroup.startReplaceableGroup(-95269212);
            if (qVar != null) {
                qVar.invoke(LayoutIdKt.layoutId(companion2, TextFieldImplKt.PlaceholderId).then(modifierM465paddingqDBjuR0$default4), composerStartRestartGroup, Integer.valueOf((i4 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen3 = LayoutIdKt.layoutId(companion2, TextFieldImplKt.TextFieldId).then(modifierM465paddingqDBjuR0$default4);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyB4 = android.support.v4.media.a.b(companion3, true, composerStartRestartGroup, 48, -1323940314);
            Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            kj.a<ComposeUiNode> constructor7 = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf7 = LayoutKt.materializerOf(modifierThen3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor7);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2437constructorimpl7 = Updater.m2437constructorimpl(composerStartRestartGroup);
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf7, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl7, measurePolicyB4, composerM2437constructorimpl7, density7, composerM2437constructorimpl7, layoutDirection8, composerM2437constructorimpl7, viewConfiguration7, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            pVar.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(243142693);
            if (pVar8 != null) {
                Modifier modifierPadding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m492heightInVpY3zN4$default(LayoutIdKt.layoutId(companion2, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m1651supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyB5 = android.support.v4.media.a.b(companion3, false, composerStartRestartGroup, 0, -1323940314);
                Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                kj.a<ComposeUiNode> constructor8 = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf8 = LayoutKt.materializerOf(modifierPadding);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor8);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2437constructorimpl8 = Updater.m2437constructorimpl(composerStartRestartGroup);
                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf8, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl8, measurePolicyB5, composerM2437constructorimpl8, density8, composerM2437constructorimpl8, layoutDirection9, composerM2437constructorimpl8, viewConfiguration8, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                androidx.appcompat.view.menu.a.l((i5 >> 3) & 14, pVar8, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
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
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TextFieldKt.TextFieldLayout.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i10) {
                TextFieldKt.TextFieldLayout(modifier, pVar, pVar2, qVar, pVar3, pVar4, pVar5, pVar6, z, f, pVar7, pVar8, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    public static final int m1681calculateHeightmKXJcVc(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, long j, float f, PaddingValues paddingValues) {
        int iMax;
        boolean z2 = i3 > 0;
        float fM5267constructorimpl = ((!z2 || z) ? Dp.m5267constructorimpl(paddingValues.getBottom() + paddingValues.getTop()) : Dp.m5267constructorimpl(TextFieldImplKt.getTextFieldPadding() * 2)) * f;
        if (z2 && z) {
            fM5267constructorimpl += i3;
            iMax = Math.max(i2, i8);
        } else {
            iMax = Math.max(i3, Math.max(i2, i8));
        }
        float f2 = fM5267constructorimpl + iMax;
        int iM5236getMinHeightimpl = Constraints.m5236getMinHeightimpl(j);
        int[] iArr = {i5, i6, i7, f.f0(f2)};
        int iMax2 = i4;
        for (int i10 = 0; i10 < 4; i10++) {
            iMax2 = Math.max(iMax2, iArr[i10]);
        }
        return Math.max(iM5236getMinHeightimpl, iMax2 + i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    public static final int m1682calculateWidthyeHjK3Y(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        int i9 = i4 + i5;
        return Math.max(Math.max(i6 + i9, Math.max(i8 + i9, i7)) + i2 + i3, Constraints.m5237getMinWidthimpl(j));
    }

    public static final Modifier drawIndicatorLine(Modifier modifier, final BorderStroke borderStroke) {
        m.h(modifier, "<this>");
        m.h(borderStroke, "indicatorBorder");
        final float width = borderStroke.getWidth();
        return DrawModifierKt.drawWithContent(modifier, new l<ContentDrawScope, j>() { // from class: androidx.compose.material3.TextFieldKt.drawIndicatorLine.1
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
                contentDrawScope.drawContent();
                if (Dp.m5272equalsimpl0(width, Dp.INSTANCE.m5285getHairlineD9Ej5fM())) {
                    return;
                }
                float density = contentDrawScope.getDensity() * width;
                float fM2651getHeightimpl = Size.m2651getHeightimpl(contentDrawScope.mo3254getSizeNHjbRc()) - (density / 2);
                androidx.compose.ui.graphics.drawscope.b.B(contentDrawScope, borderStroke.getBrush(), OffsetKt.Offset(0.0f, fM2651getHeightimpl), OffsetKt.Offset(Size.m2654getWidthimpl(contentDrawScope.mo3254getSizeNHjbRc()), fM2651getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }

    public static final float getTextFieldWithLabelVerticalPadding() {
        return TextFieldWithLabelVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, boolean z, int i4, int i5, float f, float f2) {
        Placeable.PlacementScope.m4272place70tqf50$default(placementScope, placeable8, IntOffset.INSTANCE.m5395getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i3 - TextFieldImplKt.heightOrZero(placeable9);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i2 - placeable5.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), (z ? Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), iHeightOrZero) : f.f0(TextFieldImplKt.getTextFieldPadding() * f2)) - f.f0((r1 - i4) * f), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, TextFieldImplKt.widthOrZero(placeable4), i5, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, (i2 - TextFieldImplKt.widthOrZero(placeable5)) - placeable7.getWidth(), i5, 0.0f, 4, null);
        }
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable4) + TextFieldImplKt.widthOrZero(placeable6);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iWidthOrZero, i5, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, iWidthOrZero, i5, 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, iHeightOrZero, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, boolean z, float f, PaddingValues paddingValues) {
        Placeable.PlacementScope.m4272place70tqf50$default(placementScope, placeable7, IntOffset.INSTANCE.m5395getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i3 - TextFieldImplKt.heightOrZero(placeable8);
        int iF0 = f.f0(paddingValues.getTop() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i2 - placeable4.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable3), placeWithoutLabel$calculateVerticalPosition(z, iHeightOrZero, iF0, placeable5), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, (i2 - TextFieldImplKt.widthOrZero(placeable4)) - placeable6.getWidth(), placeWithoutLabel$calculateVerticalPosition(z, iHeightOrZero, iF0, placeable6), 0.0f, 4, null);
        }
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable3) + TextFieldImplKt.widthOrZero(placeable5);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iWidthOrZero, placeWithoutLabel$calculateVerticalPosition(z, iHeightOrZero, iF0, placeable), 0.0f, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, iWidthOrZero, placeWithoutLabel$calculateVerticalPosition(z, iHeightOrZero, iF0, placeable2), 0.0f, 4, null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, 0, iHeightOrZero, 0.0f, 4, null);
        }
    }

    private static final int placeWithoutLabel$calculateVerticalPosition(boolean z, int i2, int i3, Placeable placeable) {
        return z ? Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i2) : i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:363:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextField(final androidx.compose.ui.text.input.TextFieldValue r123, final kj.l<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.j> r124, androidx.compose.ui.Modifier r125, boolean r126, boolean r127, androidx.compose.ui.text.TextStyle r128, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r129, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r130, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r131, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r132, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r133, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r134, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r135, boolean r136, androidx.compose.ui.text.input.VisualTransformation r137, androidx.compose.foundation.text.KeyboardOptions r138, androidx.compose.foundation.text.KeyboardActions r139, boolean r140, int r141, int r142, androidx.compose.foundation.interaction.MutableInteractionSource r143, androidx.compose.ui.graphics.Shape r144, androidx.compose.material3.TextFieldColors r145, androidx.compose.runtime.Composer r146, final int r147, final int r148, final int r149, final int r150) {
        /*
            Method dump skipped, instruction units count: 1725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, kj.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kj.p, kj.p, kj.p, kj.p, kj.p, kj.p, kj.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:328:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void TextField(final java.lang.String r125, final kj.l r126, androidx.compose.ui.Modifier r127, boolean r128, boolean r129, androidx.compose.ui.text.TextStyle r130, kj.p r131, kj.p r132, kj.p r133, kj.p r134, kj.p r135, boolean r136, androidx.compose.ui.text.input.VisualTransformation r137, androidx.compose.foundation.text.KeyboardOptions r138, androidx.compose.foundation.text.KeyboardActions r139, boolean r140, int r141, int r142, androidx.compose.foundation.interaction.MutableInteractionSource r143, androidx.compose.ui.graphics.Shape r144, androidx.compose.material3.TextFieldColors r145, androidx.compose.runtime.Composer r146, final int r147, final int r148, final int r149, final int r150) {
        /*
            Method dump skipped, instruction units count: 1451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(java.lang.String, kj.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kj.p, kj.p, kj.p, kj.p, kj.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:328:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void TextField(final androidx.compose.ui.text.input.TextFieldValue r125, final kj.l r126, androidx.compose.ui.Modifier r127, boolean r128, boolean r129, androidx.compose.ui.text.TextStyle r130, kj.p r131, kj.p r132, kj.p r133, kj.p r134, kj.p r135, boolean r136, androidx.compose.ui.text.input.VisualTransformation r137, androidx.compose.foundation.text.KeyboardOptions r138, androidx.compose.foundation.text.KeyboardActions r139, boolean r140, int r141, int r142, androidx.compose.foundation.interaction.MutableInteractionSource r143, androidx.compose.ui.graphics.Shape r144, androidx.compose.material3.TextFieldColors r145, androidx.compose.runtime.Composer r146, final int r147, final int r148, final int r149, final int r150) {
        /*
            Method dump skipped, instruction units count: 1451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, kj.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kj.p, kj.p, kj.p, kj.p, kj.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }
}
