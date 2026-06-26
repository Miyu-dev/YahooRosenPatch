package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import kj.l;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Immutable
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bG\bÇ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u0090\u0001J9\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJM\u0010\u0014\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ;\u0010\u001e\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001bJ=\u0010 \u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001bJÃ\u0003\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020!2\b\b\u0002\u0010&\u001a\u00020!2\b\b\u0002\u0010'\u001a\u00020!2\b\b\u0002\u0010(\u001a\u00020!2\b\b\u0002\u0010)\u001a\u00020!2\b\b\u0002\u0010*\u001a\u00020!2\b\b\u0002\u0010+\u001a\u00020!2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020!2\b\b\u0002\u0010/\u001a\u00020!2\b\b\u0002\u00100\u001a\u00020!2\b\b\u0002\u00101\u001a\u00020!2\b\b\u0002\u00102\u001a\u00020!2\b\b\u0002\u00103\u001a\u00020!2\b\b\u0002\u00104\u001a\u00020!2\b\b\u0002\u00105\u001a\u00020!2\b\b\u0002\u00106\u001a\u00020!2\b\b\u0002\u00107\u001a\u00020!2\b\b\u0002\u00108\u001a\u00020!2\b\b\u0002\u00109\u001a\u00020!2\b\b\u0002\u0010:\u001a\u00020!2\b\b\u0002\u0010;\u001a\u00020!2\b\b\u0002\u0010<\u001a\u00020!2\b\b\u0002\u0010=\u001a\u00020!2\b\b\u0002\u0010>\u001a\u00020!2\b\b\u0002\u0010?\u001a\u00020!2\b\b\u0002\u0010@\u001a\u00020!2\b\b\u0002\u0010A\u001a\u00020!2\b\b\u0002\u0010B\u001a\u00020!2\b\b\u0002\u0010C\u001a\u00020!2\b\b\u0002\u0010D\u001a\u00020!2\b\b\u0002\u0010E\u001a\u00020!2\b\b\u0002\u0010F\u001a\u00020!2\b\b\u0002\u0010G\u001a\u00020!2\b\b\u0002\u0010H\u001a\u00020!2\b\b\u0002\u0010I\u001a\u00020!2\b\b\u0002\u0010J\u001a\u00020!2\b\b\u0002\u0010K\u001a\u00020!2\b\b\u0002\u0010L\u001a\u00020!2\b\b\u0002\u0010M\u001a\u00020!H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010OJ¨\u0002\u0010a\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020P2\u0011\u0010T\u001a\r\u0012\u0004\u0012\u00020\u000b0R¢\u0006\u0002\bS2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010U\u001a\u00020\u00022\u0006\u0010W\u001a\u00020V2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0015\b\u0002\u0010X\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010Y\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010Z\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010[\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010\\\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010]\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010^\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010_\u001a\u00020\u00192\u0013\b\u0002\u0010`\u001a\r\u0012\u0004\u0012\u00020\u000b0R¢\u0006\u0002\bSH\u0007¢\u0006\u0004\ba\u0010bJ9\u0010c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\bc\u0010\rJS\u0010h\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010d\u001a\u00020\u000f2\b\b\u0002\u0010e\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bf\u0010gJ=\u0010j\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bi\u0010\u001bJ=\u0010l\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bk\u0010\u001bJ=\u0010n\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u0010\u001bJ¯\u0003\u0010r\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020!2\b\b\u0002\u0010o\u001a\u00020!2\b\b\u0002\u0010)\u001a\u00020!2\b\b\u0002\u0010*\u001a\u00020!2\b\b\u0002\u0010+\u001a\u00020!2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020!2\b\b\u0002\u0010/\u001a\u00020!2\b\b\u0002\u00100\u001a\u00020!2\b\b\u0002\u00101\u001a\u00020!2\b\b\u0002\u00102\u001a\u00020!2\b\b\u0002\u00103\u001a\u00020!2\b\b\u0002\u00104\u001a\u00020!2\b\b\u0002\u00105\u001a\u00020!2\b\b\u0002\u00106\u001a\u00020!2\b\b\u0002\u00107\u001a\u00020!2\b\b\u0002\u00108\u001a\u00020!2\b\b\u0002\u00109\u001a\u00020!2\b\b\u0002\u0010:\u001a\u00020!2\b\b\u0002\u0010;\u001a\u00020!2\b\b\u0002\u0010<\u001a\u00020!2\b\b\u0002\u0010=\u001a\u00020!2\b\b\u0002\u0010>\u001a\u00020!2\b\b\u0002\u0010?\u001a\u00020!2\b\b\u0002\u0010@\u001a\u00020!2\b\b\u0002\u0010A\u001a\u00020!2\b\b\u0002\u0010B\u001a\u00020!2\b\b\u0002\u0010C\u001a\u00020!2\b\b\u0002\u0010D\u001a\u00020!2\b\b\u0002\u0010E\u001a\u00020!2\b\b\u0002\u0010F\u001a\u00020!2\b\b\u0002\u0010G\u001a\u00020!2\b\b\u0002\u0010H\u001a\u00020!2\b\b\u0002\u0010I\u001a\u00020!2\b\b\u0002\u0010J\u001a\u00020!2\b\b\u0002\u0010K\u001a\u00020!2\b\b\u0002\u0010L\u001a\u00020!2\b\b\u0002\u0010M\u001a\u00020!H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bp\u0010qJ¯\u0003\u0010x\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020!2\b\b\u0002\u0010o\u001a\u00020!2\b\b\u0002\u0010)\u001a\u00020!2\b\b\u0002\u0010*\u001a\u00020!2\b\b\u0002\u0010+\u001a\u00020!2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010s\u001a\u00020!2\b\b\u0002\u0010t\u001a\u00020!2\b\b\u0002\u0010u\u001a\u00020!2\b\b\u0002\u0010v\u001a\u00020!2\b\b\u0002\u00102\u001a\u00020!2\b\b\u0002\u00103\u001a\u00020!2\b\b\u0002\u00104\u001a\u00020!2\b\b\u0002\u00105\u001a\u00020!2\b\b\u0002\u00106\u001a\u00020!2\b\b\u0002\u00107\u001a\u00020!2\b\b\u0002\u00108\u001a\u00020!2\b\b\u0002\u00109\u001a\u00020!2\b\b\u0002\u0010:\u001a\u00020!2\b\b\u0002\u0010;\u001a\u00020!2\b\b\u0002\u0010<\u001a\u00020!2\b\b\u0002\u0010=\u001a\u00020!2\b\b\u0002\u0010>\u001a\u00020!2\b\b\u0002\u0010?\u001a\u00020!2\b\b\u0002\u0010@\u001a\u00020!2\b\b\u0002\u0010A\u001a\u00020!2\b\b\u0002\u0010B\u001a\u00020!2\b\b\u0002\u0010C\u001a\u00020!2\b\b\u0002\u0010D\u001a\u00020!2\b\b\u0002\u0010E\u001a\u00020!2\b\b\u0002\u0010F\u001a\u00020!2\b\b\u0002\u0010G\u001a\u00020!2\b\b\u0002\u0010H\u001a\u00020!2\b\b\u0002\u0010I\u001a\u00020!2\b\b\u0002\u0010J\u001a\u00020!2\b\b\u0002\u0010K\u001a\u00020!2\b\b\u0002\u0010L\u001a\u00020!2\b\b\u0002\u0010M\u001a\u00020!H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bw\u0010qJ¨\u0002\u0010y\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020P2\u0011\u0010T\u001a\r\u0012\u0004\u0012\u00020\u000b0R¢\u0006\u0002\bS2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010U\u001a\u00020\u00022\u0006\u0010W\u001a\u00020V2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0015\b\u0002\u0010X\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010Y\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010Z\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010[\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010\\\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010]\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010^\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010_\u001a\u00020\u00192\u0013\b\u0002\u0010`\u001a\r\u0012\u0004\u0012\u00020\u000b0R¢\u0006\u0002\bSH\u0007¢\u0006\u0004\by\u0010bJ\u009e\u0002\u0010z\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020P2\u0011\u0010T\u001a\r\u0012\u0004\u0012\u00020\u000b0R¢\u0006\u0002\bS2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010U\u001a\u00020\u00022\u0006\u0010W\u001a\u00020V2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0015\b\u0002\u0010X\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010Y\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010Z\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010[\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010\\\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010]\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010^\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010_\u001a\u00020\u00192\u0013\b\u0002\u0010`\u001a\r\u0012\u0004\u0012\u00020\u000b0R¢\u0006\u0002\bSH\u0007¢\u0006\u0004\bz\u0010{Jý\u0002\u0010r\u001a\u00020\u00072\b\b\u0002\u0010|\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!2\b\b\u0002\u0010o\u001a\u00020!2\b\b\u0002\u0010*\u001a\u00020!2\b\b\u0002\u0010+\u001a\u00020!2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020!2\b\b\u0002\u0010/\u001a\u00020!2\b\b\u0002\u00100\u001a\u00020!2\b\b\u0002\u00101\u001a\u00020!2\b\b\u0002\u00102\u001a\u00020!2\b\b\u0002\u00103\u001a\u00020!2\b\b\u0002\u00104\u001a\u00020!2\b\b\u0002\u00105\u001a\u00020!2\b\b\u0002\u00106\u001a\u00020!2\b\b\u0002\u00107\u001a\u00020!2\b\b\u0002\u00108\u001a\u00020!2\b\b\u0002\u00109\u001a\u00020!2\b\b\u0002\u0010:\u001a\u00020!2\b\b\u0002\u0010;\u001a\u00020!2\b\b\u0002\u0010<\u001a\u00020!2\b\b\u0002\u0010=\u001a\u00020!2\b\b\u0002\u0010}\u001a\u00020!2\b\b\u0002\u0010@\u001a\u00020!2\b\b\u0002\u0010B\u001a\u00020!2\b\b\u0002\u0010C\u001a\u00020!2\b\b\u0002\u0010D\u001a\u00020!2\b\b\u0002\u0010E\u001a\u00020!2\b\b\u0002\u0010F\u001a\u00020!2\b\b\u0002\u0010G\u001a\u00020!2\b\b\u0002\u0010H\u001a\u00020!2\b\b\u0002\u0010I\u001a\u00020!2\b\b\u0002\u0010J\u001a\u00020!2\b\b\u0002\u0010K\u001a\u00020!2\b\b\u0002\u0010L\u001a\u00020!2\b\b\u0002\u0010M\u001a\u00020!H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b~\u0010\u007fJþ\u0002\u0010x\u001a\u00020\u00072\b\b\u0002\u0010|\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!2\b\b\u0002\u0010o\u001a\u00020!2\b\b\u0002\u0010*\u001a\u00020!2\b\b\u0002\u0010+\u001a\u00020!2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010s\u001a\u00020!2\b\b\u0002\u0010t\u001a\u00020!2\b\b\u0002\u0010u\u001a\u00020!2\b\b\u0002\u0010v\u001a\u00020!2\b\b\u0002\u00102\u001a\u00020!2\b\b\u0002\u00103\u001a\u00020!2\b\b\u0002\u00104\u001a\u00020!2\b\b\u0002\u00105\u001a\u00020!2\b\b\u0002\u00106\u001a\u00020!2\b\b\u0002\u00107\u001a\u00020!2\b\b\u0002\u00108\u001a\u00020!2\b\b\u0002\u00109\u001a\u00020!2\b\b\u0002\u0010:\u001a\u00020!2\b\b\u0002\u0010;\u001a\u00020!2\b\b\u0002\u0010<\u001a\u00020!2\b\b\u0002\u0010=\u001a\u00020!2\b\b\u0002\u0010}\u001a\u00020!2\b\b\u0002\u0010@\u001a\u00020!2\b\b\u0002\u0010B\u001a\u00020!2\b\b\u0002\u0010C\u001a\u00020!2\b\b\u0002\u0010D\u001a\u00020!2\b\b\u0002\u0010E\u001a\u00020!2\b\b\u0002\u0010F\u001a\u00020!2\b\b\u0002\u0010G\u001a\u00020!2\b\b\u0002\u0010H\u001a\u00020!2\b\b\u0002\u0010I\u001a\u00020!2\b\b\u0002\u0010J\u001a\u00020!2\b\b\u0002\u0010K\u001a\u00020!2\b\b\u0002\u0010L\u001a\u00020!2\b\b\u0002\u0010M\u001a\u00020!H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0080\u0001\u0010\u007fJû\u0001\u0010y\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020P2\u0011\u0010T\u001a\r\u0012\u0004\u0012\u00020\u000b0R¢\u0006\u0002\bS2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010U\u001a\u00020\u00022\u0006\u0010W\u001a\u00020V2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0015\b\u0002\u0010X\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010Y\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010Z\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010[\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010^\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010_\u001a\u00020\u00192\u0013\b\u0002\u0010`\u001a\r\u0012\u0004\u0012\u00020\u000b0R¢\u0006\u0002\bSH\u0007¢\u0006\u0005\by\u0010\u0081\u0001Jñ\u0001\u0010z\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020P2\u0011\u0010T\u001a\r\u0012\u0004\u0012\u00020\u000b0R¢\u0006\u0002\bS2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010U\u001a\u00020\u00022\u0006\u0010W\u001a\u00020V2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0015\b\u0002\u0010X\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010Y\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010Z\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010[\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\u0015\b\u0002\u0010^\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010R¢\u0006\u0002\bS2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010_\u001a\u00020\u00192\u0013\b\u0002\u0010`\u001a\r\u0012\u0004\u0012\u00020\u000b0R¢\u0006\u0002\bSH\u0007¢\u0006\u0005\bz\u0010\u0082\u0001R%\u0010\u0083\u0001\u001a\u00020\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R%\u0010\u0087\u0001\u001a\u00020\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0084\u0001\u001a\u0006\b\u0088\u0001\u0010\u0086\u0001R%\u0010\u0089\u0001\u001a\u00020\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u0084\u0001\u001a\u0006\b\u008a\u0001\u0010\u0086\u0001R%\u0010\u008b\u0001\u001a\u00020\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u0084\u0001\u001a\u0006\b\u008c\u0001\u0010\u0086\u0001R0\u0010\u008d\u0001\u001a\u00020\u000f8\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u0084\u0001\u0012\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u008e\u0001\u0010\u0086\u0001R0\u0010\u0091\u0001\u001a\u00020\u000f8\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0084\u0001\u0012\u0006\b\u0093\u0001\u0010\u0090\u0001\u001a\u0006\b\u0092\u0001\u0010\u0086\u0001R\u0013\u0010\n\u001a\u00020\t8G¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001f\u0010\u0098\u0001\u001a\u00020\t8GX\u0087\u0004¢\u0006\u0010\u0012\u0006\b\u0097\u0001\u0010\u0090\u0001\u001a\u0006\b\u0096\u0001\u0010\u0095\u0001R\u001f\u0010\u009b\u0001\u001a\u00020\t8GX\u0087\u0004¢\u0006\u0010\u0012\u0006\b\u009a\u0001\u0010\u0090\u0001\u001a\u0006\b\u0099\u0001\u0010\u0095\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u009d\u0001"}, d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/material3/TextFieldColors;", "colors", "Landroidx/compose/ui/graphics/Shape;", "shape", "Lkotlin/j;", "ContainerBox", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "indicatorLine", "start", "end", "top", "bottom", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingWithLabel-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingWithLabel", "contentPaddingWithoutLabel-a9UjIt4", "contentPaddingWithoutLabel", "supportingTextPadding-a9UjIt4$material3_release", "supportingTextPadding", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "contentPadding", "container", "DecorationBox", "(Ljava/lang/String;Lkj/p;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkj/p;Landroidx/compose/runtime/Composer;III)V", "FilledContainerBox", "focusedBorderThickness", "unfocusedBorderThickness", "OutlinedBorderContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "OutlinedBorderContainerBox", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "outlinedTextFieldPadding-a9UjIt4", "outlinedTextFieldPadding", "containerColor", "textFieldColors-M37tBTI", "(JJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "textFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-M37tBTI", "outlinedTextFieldColors", "TextFieldDecorationBox", "OutlinedTextFieldDecorationBox", "(Ljava/lang/String;Lkj/p;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkj/p;Landroidx/compose/runtime/Composer;III)V", "textColor", "placeholderColor", "textFieldColors-eS1Emto", "(JJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "outlinedTextFieldColors-eS1Emto", "(Ljava/lang/String;Lkj/p;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkj/p;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkj/p;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkj/p;Lkj/p;Lkj/p;Lkj/p;Lkj/p;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkj/p;Landroidx/compose/runtime/Composer;III)V", "MinHeight", "F", "getMinHeight-D9Ej5fM", "()F", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedIndicatorThickness", "getUnfocusedIndicatorThickness-D9Ej5fM", "FocusedIndicatorThickness", "getFocusedIndicatorThickness-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "()V", "FocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "getFocusedBorderThickness-D9Ej5fM$annotations", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "getOutlinedShape", "getOutlinedShape$annotations", "outlinedShape", "getFilledShape", "getFilledShape$annotations", "filledShape", "<init>", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class TextFieldDefaults {
    public static final int $stable = 0;
    private static final float FocusedBorderThickness;
    private static final float FocusedIndicatorThickness;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m5267constructorimpl(56);
    private static final float MinWidth = Dp.m5267constructorimpl(280);
    private static final float UnfocusedBorderThickness;
    private static final float UnfocusedIndicatorThickness;

    static {
        float fM5267constructorimpl = Dp.m5267constructorimpl(1);
        UnfocusedIndicatorThickness = fM5267constructorimpl;
        float fM5267constructorimpl2 = Dp.m5267constructorimpl(2);
        FocusedIndicatorThickness = fM5267constructorimpl2;
        UnfocusedBorderThickness = fM5267constructorimpl;
        FocusedBorderThickness = fM5267constructorimpl2;
    }

    private TextFieldDefaults() {
    }

    /* JADX INFO: renamed from: contentPaddingWithLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1645contentPaddingWithLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i2 & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m1656contentPaddingWithLabela9UjIt4(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: contentPaddingWithoutLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1646contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1657contentPaddingWithoutLabela9UjIt4(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1649indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2, int i2, Object obj) {
        return textFieldDefaults.m1664indicatorLinegv0btCI(modifier, z, z2, interactionSource, textFieldColors, (i2 & 16) != 0 ? FocusedIndicatorThickness : f, (i2 & 32) != 0 ? UnfocusedIndicatorThickness : f2);
    }

    /* JADX INFO: renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1650outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1667outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: supportingTextPadding-a9UjIt4$material3_release$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1651supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 2) != 0) {
            f2 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i2 & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 8) != 0) {
            f4 = Dp.m5267constructorimpl(0);
        }
        return textFieldDefaults.m1668supportingTextPaddinga9UjIt4$material3_release(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1652textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i2 & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m1671textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1653textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1672textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0150  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ContainerBox(final boolean r20, final boolean r21, final androidx.compose.foundation.interaction.InteractionSource r22, final androidx.compose.material3.TextFieldColors r23, androidx.compose.ui.graphics.Shape r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.ContainerBox(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0140  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DecorationBox(final java.lang.String r120, final kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r121, final boolean r122, final boolean r123, final androidx.compose.ui.text.input.VisualTransformation r124, final androidx.compose.foundation.interaction.InteractionSource r125, boolean r126, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r127, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r128, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r129, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r130, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r131, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r132, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r133, androidx.compose.ui.graphics.Shape r134, androidx.compose.material3.TextFieldColors r135, androidx.compose.foundation.layout.PaddingValues r136, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r137, androidx.compose.runtime.Composer r138, final int r139, final int r140, final int r141) {
        /*
            Method dump skipped, instruction units count: 1295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.DecorationBox(java.lang.String, kj.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kj.p, kj.p, kj.p, kj.p, kj.p, kj.p, kj.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kj.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FilledContainerBox(final boolean r18, final boolean r19, final androidx.compose.foundation.interaction.InteractionSource r20, final androidx.compose.material3.TextFieldColors r21, androidx.compose.ui.graphics.Shape r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.FilledContainerBox(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /* JADX INFO: renamed from: OutlinedBorderContainerBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1654OutlinedBorderContainerBoxnbWgWpA(final boolean r21, final boolean r22, final androidx.compose.foundation.interaction.InteractionSource r23, final androidx.compose.material3.TextFieldColors r24, androidx.compose.ui.graphics.Shape r25, float r26, float r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.m1654OutlinedBorderContainerBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0144  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OutlinedTextFieldDecorationBox(final java.lang.String r118, final kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r119, final boolean r120, final boolean r121, final androidx.compose.ui.text.input.VisualTransformation r122, final androidx.compose.foundation.interaction.InteractionSource r123, boolean r124, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r125, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r126, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r127, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r128, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r129, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r130, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r131, androidx.compose.material3.TextFieldColors r132, androidx.compose.foundation.layout.PaddingValues r133, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r134, androidx.compose.runtime.Composer r135, final int r136, final int r137, final int r138) {
        /*
            Method dump skipped, instruction units count: 1135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, kj.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kj.p, kj.p, kj.p, kj.p, kj.p, kj.p, kj.p, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kj.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0140  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void TextFieldDecorationBox(final java.lang.String r120, final kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r121, final boolean r122, final boolean r123, final androidx.compose.ui.text.input.VisualTransformation r124, final androidx.compose.foundation.interaction.InteractionSource r125, boolean r126, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r127, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r128, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r129, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r130, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r131, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r132, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r133, androidx.compose.ui.graphics.Shape r134, androidx.compose.material3.TextFieldColors r135, androidx.compose.foundation.layout.PaddingValues r136, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r137, androidx.compose.runtime.Composer r138, final int r139, final int r140, final int r141) {
        /*
            Method dump skipped, instruction units count: 1275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, kj.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kj.p, kj.p, kj.p, kj.p, kj.p, kj.p, kj.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kj.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    /* JADX INFO: renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m1655colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        composer.startReplaceableGroup(1513344955);
        long color = (i7 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusInputColor(), composer, 6) : j;
        long color2 = (i7 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j2;
        long jM2817copywmQWz5c$default = (i7 & 4) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long color3 = (i7 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorInputColor(), composer, 6) : j4;
        long color4 = (i7 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j5;
        long color5 = (i7 & 32) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j6;
        long color6 = (i7 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j7;
        long color7 = (i7 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j8;
        long color8 = (i7 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j9;
        long color9 = (i7 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j10;
        TextSelectionColors textSelectionColors2 = (i7 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color10 = (i7 & 2048) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer, 6) : j11;
        long color11 = (i7 & 4096) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j12;
        long jM2817copywmQWz5c$default2 = (i7 & 8192) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long color12 = (i7 & 16384) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer, 6) : j14;
        long color13 = (32768 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j15;
        long color14 = (65536 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j16;
        long jM2817copywmQWz5c$default3 = (131072 & i7) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long color15 = (262144 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j18;
        long color16 = (524288 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j19;
        long color17 = (1048576 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j20;
        long jM2817copywmQWz5c$default4 = (2097152 & i7) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long color18 = (4194304 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j22;
        long color19 = (8388608 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j23;
        long color20 = (16777216 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j24;
        long jM2817copywmQWz5c$default5 = (33554432 & i7) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long color21 = (67108864 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j26;
        long color22 = (134217728 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j27;
        long color23 = (268435456 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j28;
        long jM2817copywmQWz5c$default6 = (536870912 & i7) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long color24 = (i7 & BasicMeasure.EXACTLY) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j30;
        long color25 = (i8 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j31;
        long color26 = (i8 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j32;
        long jM2817copywmQWz5c$default7 = (i8 & 4) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j33;
        long color27 = (i8 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j34;
        long color28 = (i8 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j35;
        long color29 = (i8 & 32) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j36;
        long jM2817copywmQWz5c$default8 = (i8 & 64) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j37;
        long color30 = (i8 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j38;
        long color31 = (i8 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j39;
        long color32 = (i8 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j40;
        long jM2817copywmQWz5c$default9 = (i8 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j41;
        long color33 = (i8 & 2048) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j42;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1513344955, i2, i3, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:246)");
        }
        TextFieldColors textFieldColors = new TextFieldColors(color, color2, jM2817copywmQWz5c$default, color3, color4, color5, color6, color7, color8, color9, textSelectionColors2, color10, color11, jM2817copywmQWz5c$default2, color12, color13, color14, jM2817copywmQWz5c$default3, color15, color16, color17, jM2817copywmQWz5c$default4, color18, color19, color20, jM2817copywmQWz5c$default5, color21, color22, color23, jM2817copywmQWz5c$default6, color24, color25, color26, jM2817copywmQWz5c$default7, color27, color28, color29, jM2817copywmQWz5c$default8, color30, color31, color32, jM2817copywmQWz5c$default9, color33, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColors;
    }

    /* JADX INFO: renamed from: contentPaddingWithLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1656contentPaddingWithLabela9UjIt4(float start, float end, float top, float bottom) {
        return PaddingKt.m457PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* JADX INFO: renamed from: contentPaddingWithoutLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1657contentPaddingWithoutLabela9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m457PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    @Composable
    public final Shape getFilledShape(Composer composer, int i2) {
        composer.startReplaceableGroup(611926497);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i2, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:472)");
        }
        Shape shape = getShape(composer, i2 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* JADX INFO: renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1658getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX INFO: renamed from: getFocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m1659getFocusedIndicatorThicknessD9Ej5fM() {
        return FocusedIndicatorThickness;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1660getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1661getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    public final Shape getOutlinedShape(Composer composer, int i2) {
        composer.startReplaceableGroup(-584749279);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i2, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:465)");
        }
        Shape shape = OutlinedTextFieldDefaults.INSTANCE.getShape(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final Shape getShape(Composer composer, int i2) {
        composer.startReplaceableGroup(-1941327459);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1941327459, i2, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:57)");
        }
        Shape shape = ShapesKt.toShape(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* JADX INFO: renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1662getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* JADX INFO: renamed from: getUnfocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m1663getUnfocusedIndicatorThicknessD9Ej5fM() {
        return UnfocusedIndicatorThickness;
    }

    @ExperimentalMaterial3Api
    /* JADX INFO: renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m1664indicatorLinegv0btCI(Modifier modifier, final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors textFieldColors, final float f, final float f2) {
        m.h(modifier, "$this$indicatorLine");
        m.h(interactionSource, "interactionSource");
        m.h(textFieldColors, "colors");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.compose.animation.b.c(z2, androidx.compose.animation.b.c(z, a.b.d(inspectorInfo, "$this$null", "indicatorLine"), "enabled", inspectorInfo), "isError", inspectorInfo).set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("colors", textFieldColors);
                androidx.appcompat.view.menu.a.b(f, inspectorInfo.getProperties(), "focusedIndicatorLineThickness", inspectorInfo).set("unfocusedIndicatorLineThickness", Dp.m5265boximpl(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, -891038934)) {
                    ComposerKt.traceEventStart(-891038934, i2, -1, "androidx.compose.material3.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:139)");
                }
                Modifier modifierDrawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m1674animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, textFieldColors, f, f2, composer, 0).getValue());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierDrawIndicatorLine;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    @Composable
    @ExperimentalMaterial3Api
    /* JADX INFO: renamed from: outlinedTextFieldColors-M37tBTI, reason: not valid java name */
    public final TextFieldColors m1665outlinedTextFieldColorsM37tBTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, TextSelectionColors textSelectionColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        composer.startReplaceableGroup(618732090);
        long color = (i7 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusInputColor(), composer, 6) : j;
        long color2 = (i7 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j2;
        long jM2817copywmQWz5c$default = (i7 & 4) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long color3 = (i7 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorInputColor(), composer, 6) : j4;
        long jM2853getTransparent0d7_KjU = (i7 & 16) != 0 ? Color.INSTANCE.m2853getTransparent0d7_KjU() : j5;
        long jM2853getTransparent0d7_KjU2 = (i7 & 32) != 0 ? Color.INSTANCE.m2853getTransparent0d7_KjU() : j6;
        long color4 = (i7 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j7;
        long color5 = (i7 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j8;
        TextSelectionColors textSelectionColors2 = (i7 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color6 = (i7 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer, 6) : j9;
        long color7 = (i7 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer, 6) : j10;
        long jM2817copywmQWz5c$default2 = (i7 & 2048) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long color8 = (i7 & 4096) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer, 6) : j12;
        long color9 = (i7 & 8192) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j13;
        long color10 = (i7 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j14;
        long jM2817copywmQWz5c$default3 = (32768 & i7) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long color11 = (65536 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j16;
        long color12 = (131072 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j17;
        long color13 = (262144 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j18;
        long jM2817copywmQWz5c$default4 = (524288 & i7) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long color14 = (1048576 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j20;
        long color15 = (2097152 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j21;
        long color16 = (4194304 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j22;
        long jM2817copywmQWz5c$default5 = (8388608 & i7) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color17 = (16777216 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j24;
        long color18 = (33554432 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j25;
        long color19 = (67108864 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j26;
        long jM2817copywmQWz5c$default6 = (134217728 & i7) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long color20 = (268435456 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j28;
        long color21 = (536870912 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j29;
        long color22 = (i7 & BasicMeasure.EXACTLY) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j30;
        long jM2817copywmQWz5c$default7 = (i8 & 1) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j31;
        long color23 = (i8 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j32;
        long color24 = (i8 & 4) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j33;
        long color25 = (i8 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j34;
        long jM2817copywmQWz5c$default8 = (i8 & 16) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j35;
        long color26 = (i8 & 32) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j36;
        long color27 = (i8 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j37;
        long color28 = (i8 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j38;
        long jM2817copywmQWz5c$default9 = (i8 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j39;
        long color29 = (i8 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j40;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(618732090, i2, i3, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:820)");
        }
        OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
        int i9 = i2 << 6;
        int i10 = (i2 & 14) | (i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2 & 896) | (i2 & 7168) | (i2 & 57344) | ((i2 << 3) & 458752) | (i9 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192);
        int i11 = i2 >> 24;
        int i12 = i3 << 6;
        int i13 = (i11 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i11 & 14) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192);
        int i14 = i3 >> 24;
        int i15 = i4 << 6;
        int i16 = (i14 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 14) | (i15 & 896) | (i15 & 7168) | (i15 & 57344) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192);
        int i17 = i4 >> 24;
        int i18 = i5 << 6;
        int i19 = (i17 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i17 & 14) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i5 >> 24;
        TextFieldColors textFieldColorsM1419colors0hiis_0 = outlinedTextFieldDefaults.m1419colors0hiis_0(color, color2, jM2817copywmQWz5c$default, color3, jM2853getTransparent0d7_KjU, jM2853getTransparent0d7_KjU, jM2853getTransparent0d7_KjU, jM2853getTransparent0d7_KjU2, color4, color5, textSelectionColors2, color6, color7, jM2817copywmQWz5c$default2, color8, color9, color10, jM2817copywmQWz5c$default3, color11, color12, color13, jM2817copywmQWz5c$default4, color14, color15, color16, jM2817copywmQWz5c$default5, color17, color18, color19, jM2817copywmQWz5c$default6, color20, color21, color22, jM2817copywmQWz5c$default7, color23, color24, color25, jM2817copywmQWz5c$default8, color26, color27, color28, jM2817copywmQWz5c$default9, color29, composer, i10, i13, i16, i19, (i20 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 14) | 3072 | ((i6 << 6) & 896), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM1419colors0hiis_0;
    }

    @Composable
    @ExperimentalMaterial3Api
    /* JADX INFO: renamed from: outlinedTextFieldColors-eS1Emto, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1666outlinedTextFieldColorseS1Emto(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7) {
        composer.startReplaceableGroup(1767818445);
        long color = (i6 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j;
        long jM2817copywmQWz5c$default = (i6 & 2) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM2853getTransparent0d7_KjU = (i6 & 4) != 0 ? Color.INSTANCE.m2853getTransparent0d7_KjU() : j3;
        long color2 = (i6 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        long color3 = (i6 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j5;
        TextSelectionColors textSelectionColors2 = (i6 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color4 = (i6 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer, 6) : j6;
        long color5 = (i6 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer, 6) : j7;
        long jM2817copywmQWz5c$default2 = (i6 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long color6 = (i6 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer, 6) : j9;
        long color7 = (i6 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j10;
        long color8 = (i6 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j11;
        long jM2817copywmQWz5c$default3 = (i6 & 4096) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long color9 = (i6 & 8192) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j13;
        long color10 = (i6 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j14;
        long color11 = (32768 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j15;
        long jM2817copywmQWz5c$default4 = (65536 & i6) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long color12 = (131072 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j17;
        long color13 = (262144 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j18;
        long color14 = (524288 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j19;
        long jM2817copywmQWz5c$default5 = (1048576 & i6) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long color15 = (2097152 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j21;
        long color16 = (4194304 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j22;
        long jM2817copywmQWz5c$default6 = (8388608 & i6) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color17 = (16777216 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j24;
        long color18 = (33554432 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j25;
        long jM2817copywmQWz5c$default7 = (67108864 & i6) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long color19 = (134217728 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j27;
        long color20 = (268435456 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j28;
        long color21 = (536870912 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j29;
        long jM2817copywmQWz5c$default8 = (i6 & BasicMeasure.EXACTLY) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long color22 = (i7 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j31;
        long color23 = (i7 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j32;
        long color24 = (i7 & 4) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j33;
        long jM2817copywmQWz5c$default9 = (i7 & 8) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j34;
        long color25 = (i7 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j35;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1767818445, i2, i3, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:1154)");
        }
        OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
        int i8 = i2 << 3;
        int i9 = (i2 & 14) | (i8 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i8 & 896);
        int i10 = i2 << 9;
        int i11 = i9 | (i10 & 7168) | ((i2 << 6) & 57344) | (i10 & 458752) | ((i2 << 12) & 3670016);
        int i12 = i2 << 15;
        int i13 = i11 | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192);
        int i14 = i2 >> 15;
        int i15 = i3 << 15;
        int i16 = (i14 & 57344) | (i14 & 14) | (i14 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192);
        int i17 = i3 >> 15;
        int i18 = i4 << 15;
        int i19 = (i17 & 57344) | (i17 & 14) | (i17 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i17 & 896) | (i17 & 7168) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128);
        int i20 = i4 << 18;
        int i21 = i19 | (i20 & 234881024) | (i20 & 1879048192);
        int i22 = i4 >> 9;
        int i23 = ((i4 >> 6) & 14) | (i22 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i22 & 896) | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i22 & 3670016);
        int i24 = i5 << 21;
        int i25 = i23 | (i24 & 29360128) | (i24 & 234881024) | (i24 & 1879048192);
        int i26 = i5 >> 9;
        TextFieldColors textFieldColorsM1419colors0hiis_0 = outlinedTextFieldDefaults.m1419colors0hiis_0(color, color, jM2817copywmQWz5c$default, color, jM2853getTransparent0d7_KjU, jM2853getTransparent0d7_KjU, jM2853getTransparent0d7_KjU, jM2853getTransparent0d7_KjU, color2, color3, textSelectionColors2, color4, color5, jM2817copywmQWz5c$default2, color6, color7, color8, jM2817copywmQWz5c$default3, color9, color10, color11, jM2817copywmQWz5c$default4, color12, color13, color14, jM2817copywmQWz5c$default5, color15, color16, color16, jM2817copywmQWz5c$default6, color16, color17, color18, jM2817copywmQWz5c$default7, color19, color20, color21, jM2817copywmQWz5c$default8, color22, color23, color24, jM2817copywmQWz5c$default9, color25, composer, i13, i16, i21, i25, (i26 & 14) | 3072 | (i26 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i26 & 896), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM1419colors0hiis_0;
    }

    /* JADX INFO: renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1667outlinedTextFieldPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return OutlinedTextFieldDefaults.INSTANCE.m1420contentPaddinga9UjIt4(start, top, end, bottom);
    }

    @ExperimentalMaterial3Api
    /* JADX INFO: renamed from: supportingTextPadding-a9UjIt4$material3_release, reason: not valid java name */
    public final PaddingValues m1668supportingTextPaddinga9UjIt4$material3_release(float start, float top, float end, float bottom) {
        return PaddingKt.m457PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    @Composable
    @ExperimentalMaterial3Api
    /* JADX INFO: renamed from: textFieldColors-M37tBTI, reason: not valid java name */
    public final TextFieldColors m1669textFieldColorsM37tBTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, TextSelectionColors textSelectionColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        composer.startReplaceableGroup(568209592);
        long color = (i7 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusInputColor(), composer, 6) : j;
        long color2 = (i7 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j2;
        long jM2817copywmQWz5c$default = (i7 & 4) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long color3 = (i7 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorInputColor(), composer, 6) : j4;
        long color4 = (i7 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j5;
        long color5 = (i7 & 32) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j6;
        long color6 = (i7 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j7;
        long color7 = (i7 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j8;
        TextSelectionColors textSelectionColors2 = (i7 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color8 = (i7 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer, 6) : j9;
        long color9 = (i7 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j10;
        long jM2817copywmQWz5c$default2 = (i7 & 2048) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long color10 = (i7 & 4096) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer, 6) : j12;
        long color11 = (i7 & 8192) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j13;
        long color12 = (i7 & 16384) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j14;
        long jM2817copywmQWz5c$default3 = (32768 & i7) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long color13 = (65536 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j16;
        long color14 = (131072 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j17;
        long color15 = (262144 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j18;
        long jM2817copywmQWz5c$default4 = (524288 & i7) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long color16 = (1048576 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j20;
        long color17 = (2097152 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j21;
        long color18 = (4194304 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j22;
        long jM2817copywmQWz5c$default5 = (8388608 & i7) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color19 = (16777216 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j24;
        long color20 = (33554432 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j25;
        long color21 = (67108864 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j26;
        long jM2817copywmQWz5c$default6 = (134217728 & i7) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long color22 = (268435456 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j28;
        long color23 = (536870912 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j29;
        long color24 = (i7 & BasicMeasure.EXACTLY) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j30;
        long jM2817copywmQWz5c$default7 = (i8 & 1) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j31;
        long color25 = (i8 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j32;
        long color26 = (i8 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j33;
        long color27 = (i8 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j34;
        long jM2817copywmQWz5c$default8 = (i8 & 16) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j35;
        long color28 = (i8 & 32) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j36;
        long color29 = (i8 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j37;
        long color30 = (i8 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j38;
        long jM2817copywmQWz5c$default9 = (i8 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j39;
        long color31 = (i8 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j40;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(568209592, i2, i3, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:670)");
        }
        int i9 = i2 << 6;
        int i10 = (i2 & 14) | (i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2 & 896) | (i2 & 7168) | (i2 & 57344) | ((i2 << 3) & 458752) | (i9 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192);
        int i11 = i2 >> 24;
        int i12 = i3 << 6;
        int i13 = (i11 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i11 & 14) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192);
        int i14 = i3 >> 24;
        int i15 = i4 << 6;
        int i16 = (i14 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 14) | (i15 & 896) | (i15 & 7168) | (i15 & 57344) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192);
        int i17 = i4 >> 24;
        int i18 = i5 << 6;
        int i19 = (i17 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i17 & 14) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i5 >> 24;
        int i21 = i6 << 6;
        TextFieldColors textFieldColorsM1655colors0hiis_0 = m1655colors0hiis_0(color, color2, jM2817copywmQWz5c$default, color3, color4, color4, color4, color5, color6, color7, textSelectionColors2, color8, color9, jM2817copywmQWz5c$default2, color10, color11, color12, jM2817copywmQWz5c$default3, color13, color14, color15, jM2817copywmQWz5c$default4, color16, color17, color18, jM2817copywmQWz5c$default5, color19, color20, color21, jM2817copywmQWz5c$default6, color22, color23, color24, jM2817copywmQWz5c$default7, color25, color26, color27, jM2817copywmQWz5c$default8, color28, color29, color30, jM2817copywmQWz5c$default9, color31, composer, i10, i13, i16, i19, (i20 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 14) | (i21 & 896) | (i21 & 7168), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM1655colors0hiis_0;
    }

    @Composable
    @ExperimentalMaterial3Api
    /* JADX INFO: renamed from: textFieldColors-eS1Emto, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1670textFieldColorseS1Emto(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7) {
        composer.startReplaceableGroup(-595874869);
        long color = (i6 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j;
        long jM2817copywmQWz5c$default = (i6 & 2) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long color2 = (i6 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j3;
        long color3 = (i6 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        long color4 = (i6 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j5;
        TextSelectionColors textSelectionColors2 = (i6 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color5 = (i6 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer, 6) : j6;
        long color6 = (i6 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j7;
        long jM2817copywmQWz5c$default2 = (i6 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long color7 = (i6 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer, 6) : j9;
        long color8 = (i6 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j10;
        long color9 = (i6 & 2048) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j11;
        long jM2817copywmQWz5c$default3 = (i6 & 4096) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long color10 = (i6 & 8192) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j13;
        long color11 = (i6 & 16384) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j14;
        long color12 = (32768 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j15;
        long jM2817copywmQWz5c$default4 = (65536 & i6) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long color13 = (131072 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j17;
        long color14 = (262144 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j18;
        long color15 = (524288 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j19;
        long jM2817copywmQWz5c$default5 = (1048576 & i6) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long color16 = (2097152 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j21;
        long color17 = (4194304 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j22;
        long jM2817copywmQWz5c$default6 = (8388608 & i6) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color18 = (16777216 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j24;
        long color19 = (33554432 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j25;
        long jM2817copywmQWz5c$default7 = (67108864 & i6) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long color20 = (134217728 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j27;
        long color21 = (268435456 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j28;
        long color22 = (536870912 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j29;
        long jM2817copywmQWz5c$default8 = (i6 & BasicMeasure.EXACTLY) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long color23 = (i7 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j31;
        long color24 = (i7 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j32;
        long color25 = (i7 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j33;
        long jM2817copywmQWz5c$default9 = (i7 & 8) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j34;
        long color26 = (i7 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j35;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-595874869, i2, i3, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:1059)");
        }
        int i8 = i2 << 3;
        int i9 = (i2 & 14) | (i8 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i8 & 896);
        int i10 = i2 << 9;
        int i11 = i9 | (i10 & 7168) | ((i2 << 6) & 57344) | (i10 & 458752) | ((i2 << 12) & 3670016);
        int i12 = i2 << 15;
        int i13 = i11 | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192);
        int i14 = i2 >> 15;
        int i15 = i3 << 15;
        int i16 = (i14 & 57344) | (i14 & 14) | (i14 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192);
        int i17 = i3 >> 15;
        int i18 = i4 << 15;
        int i19 = (i17 & 57344) | (i17 & 14) | (i17 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i17 & 896) | (i17 & 7168) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128);
        int i20 = i4 << 18;
        int i21 = i19 | (i20 & 234881024) | (i20 & 1879048192);
        int i22 = i4 >> 9;
        int i23 = ((i4 >> 6) & 14) | (i22 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i22 & 896) | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i22 & 3670016);
        int i24 = i5 << 21;
        int i25 = i23 | (i24 & 29360128) | (i24 & 234881024) | (i24 & 1879048192);
        int i26 = i5 >> 9;
        TextFieldColors textFieldColorsM1655colors0hiis_0 = m1655colors0hiis_0(color, color, jM2817copywmQWz5c$default, color, color2, color2, color2, color2, color3, color4, textSelectionColors2, color5, color6, jM2817copywmQWz5c$default2, color7, color8, color9, jM2817copywmQWz5c$default3, color10, color11, color12, jM2817copywmQWz5c$default4, color13, color14, color15, jM2817copywmQWz5c$default5, color16, color17, color17, jM2817copywmQWz5c$default6, color17, color18, color19, jM2817copywmQWz5c$default7, color20, color21, color22, jM2817copywmQWz5c$default8, color23, color24, color25, jM2817copywmQWz5c$default9, color26, composer, i13, i16, i21, i25, (i26 & 14) | (i26 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i26 & 896) | (i26 & 7168), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM1655colors0hiis_0;
    }

    /* JADX INFO: renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1671textFieldWithLabelPaddinga9UjIt4(float start, float end, float top, float bottom) {
        return m1656contentPaddingWithLabela9UjIt4(start, end, top, bottom);
    }

    /* JADX INFO: renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1672textFieldWithoutLabelPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return m1657contentPaddingWithoutLabela9UjIt4(start, top, end, bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0142  */
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
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void OutlinedTextFieldDecorationBox(final java.lang.String r116, final kj.p r117, final boolean r118, final boolean r119, final androidx.compose.ui.text.input.VisualTransformation r120, final androidx.compose.foundation.interaction.InteractionSource r121, boolean r122, kj.p r123, kj.p r124, kj.p r125, kj.p r126, kj.p r127, androidx.compose.material3.TextFieldColors r128, androidx.compose.foundation.layout.PaddingValues r129, kj.p r130, androidx.compose.runtime.Composer r131, final int r132, final int r133, final int r134) {
        /*
            Method dump skipped, instruction units count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, kj.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kj.p, kj.p, kj.p, kj.p, kj.p, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kj.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0142  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void TextFieldDecorationBox(final java.lang.String r119, final kj.p r120, final boolean r121, final boolean r122, final androidx.compose.ui.text.input.VisualTransformation r123, final androidx.compose.foundation.interaction.InteractionSource r124, boolean r125, kj.p r126, kj.p r127, kj.p r128, kj.p r129, kj.p r130, androidx.compose.ui.graphics.Shape r131, androidx.compose.material3.TextFieldColors r132, androidx.compose.foundation.layout.PaddingValues r133, kj.p r134, androidx.compose.runtime.Composer r135, final int r136, final int r137, final int r138) {
        /*
            Method dump skipped, instruction units count: 1185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, kj.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kj.p, kj.p, kj.p, kj.p, kj.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kj.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static /* synthetic */ void getFilledShape$annotations() {
    }

    /* JADX INFO: renamed from: getFocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1647getFocusedBorderThicknessD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getOutlinedShape$annotations() {
    }

    /* JADX INFO: renamed from: getUnfocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1648getUnfocusedBorderThicknessD9Ej5fM$annotations() {
    }
}
