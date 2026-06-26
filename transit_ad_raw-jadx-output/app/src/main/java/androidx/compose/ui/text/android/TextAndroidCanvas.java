package androidx.compose.ui.text.android;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextAndroidCanvas.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0017J\b\u0010\r\u001a\u00020\u0003H\u0017J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J$\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J\u001c\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J:\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J2\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\"\u0010#\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J\u001a\u0010#\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u000fH\u0016J8\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J0\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\b\u0010%\u001a\u00020\u000fH\u0016J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u000fH\u0016J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001dH\u0016J\u0018\u0010-\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dH\u0016J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u001dH\u0016J\u0018\u00100\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dH\u0016J\u0012\u00103\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000101H\u0016J\u0012\u00104\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000101H\u0016J\u0010\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u000201H\u0017J\u0018\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00182\u0006\u00109\u001a\u000208H\u0017J\u0018\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00052\u0006\u00109\u001a\u000208H\u0017J\u0010\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0016J\u0010\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0005H\u0016J0\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u00109\u001a\u000208H\u0017J(\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0016J(\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000fH\u0016J\u0010\u0010;\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0017J\u0010\u0010;\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0005H\u0017J(\u0010;\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0017J(\u0010;\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000fH\u0017J\u0018\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\u0006\u00109\u001a\u000208H\u0017J\u0010\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0016J\u0010\u0010?\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0017J\n\u0010A\u001a\u0004\u0018\u00010@H\u0016J\u0012\u0010C\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010@H\u0016J\u0018\u0010F\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00182\u0006\u0010E\u001a\u00020DH\u0017J\u0010\u0010F\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0017J\u0018\u0010F\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\u0006\u0010E\u001a\u00020DH\u0017J\u0010\u0010F\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0017J0\u0010F\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020DH\u0017J(\u0010F\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0017J\u0010\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020GH\u0016J\u0018\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020\u0018H\u0016J\u0018\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020\u0005H\u0016J0\u0010O\u001a\u00020\u00032\u0006\u0010K\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JH\u0010O\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J(\u0010T\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020\u000fH\u0016J*\u0010U\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J,\u0010U\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010V\u001a\u0004\u0018\u00010\u00052\u0006\u0010J\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J,\u0010U\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010V\u001a\u0004\u0018\u00010\u00052\u0006\u0010J\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016JR\u0010U\u001a\u00020\u00032\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010]\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017JR\u0010U\u001a\u00020\u00032\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u000f2\u0006\u0010\\\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\"\u0010U\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u00102\u001a\u0002012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016JL\u0010f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010`\u001a\u00020\u000f2\u0006\u0010a\u001a\u00020\u000f2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020\u000f2\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010e\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J(\u0010j\u001a\u00020\u00032\u0006\u0010g\u001a\u00020\u001d2\u0006\u0010h\u001a\u00020\u001d2\u0006\u0010i\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u000fH\u0016J\u0010\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020mH\u0017J\u0018\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u000f2\u0006\u0010o\u001a\u00020nH\u0016J\u0018\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u000f2\u0006\u0010o\u001a\u00020pH\u0017J\u0018\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020m2\u0006\u0010o\u001a\u00020pH\u0017J0\u0010u\u001a\u00020\u00032\u0006\u0010q\u001a\u00020\u001d2\u0006\u0010r\u001a\u00020\u001d2\u0006\u0010s\u001a\u00020\u001d2\u0006\u0010t\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J(\u0010x\u001a\u00020\u00032\u0006\u0010v\u001a\u00020b2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010x\u001a\u00020\u00032\u0006\u0010v\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010y\u001a\u00020\u00032\u0006\u0010K\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J0\u0010y\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010z\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\"\u0010}\u001a\u00020\u00032\u0006\u0010|\u001a\u00020{2\u0006\u0010J\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\"\u0010}\u001a\u00020\u00032\u0006\u0010|\u001a\u00020{2\u0006\u0010J\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\u0018\u0010~\u001a\u00020\u00032\u0006\u0010=\u001a\u00020<2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J \u0010\u007f\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J+\u0010\u0080\u0001\u001a\u00020\u00032\b\u0010v\u001a\u0004\u0018\u00010b2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0019\u0010\u0080\u0001\u001a\u00020\u00032\u0006\u0010v\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J5\u0010\u0085\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0007\u0010\u0084\u0001\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J$\u0010\u0085\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0084\u0001\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\u0019\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0019\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J1\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J!\u0010\u0088\u0001\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020\u000fH\u0016J+\u0010\u008b\u0001\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00182\u0007\u0010\u0089\u0001\u001a\u00020\u001d2\u0007\u0010\u008a\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JC\u0010\u008b\u0001\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0007\u0010\u0089\u0001\u001a\u00020\u001d2\u0007\u0010\u008a\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JG\u0010\u0092\u0001\u001a\u00020\u00032\u0007\u0010\u008c\u0001\u001a\u00020\u00182\u0007\u0010\u008d\u0001\u001a\u00020\u001d2\u0007\u0010\u008e\u0001\u001a\u00020\u001d2\u0007\u0010\u008f\u0001\u001a\u00020\u00182\u0007\u0010\u0090\u0001\u001a\u00020\u001d2\u0007\u0010\u0091\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J5\u0010\u0092\u0001\u001a\u00020\u00032\u0007\u0010\u008c\u0001\u001a\u00020\u00182\u0007\u0010\u0093\u0001\u001a\u00020b2\u0007\u0010\u008f\u0001\u001a\u00020\u00182\u0007\u0010\u0094\u0001\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JH\u0010\u009c\u0001\u001a\u00020\u00032\u0007\u0010\u0095\u0001\u001a\u00020W2\u0007\u0010\u0096\u0001\u001a\u00020\u000f2\u0007\u0010\u0097\u0001\u001a\u00020b2\u0007\u0010\u0098\u0001\u001a\u00020\u000f2\u0007\u0010\u0099\u0001\u001a\u00020\u000f2\b\u0010\u009b\u0001\u001a\u00030\u009a\u00012\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J<\u0010\u009d\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J+\u0010\u009d\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J=\u0010\u009d\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J=\u0010\u009d\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030 \u00012\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JF\u0010£\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020<2\u0007\u0010¡\u0001\u001a\u00020\u001d2\u0007\u0010¢\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J5\u0010£\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0006\u0010=\u001a\u00020<2\u0007\u0010¡\u0001\u001a\u00020\u001d2\u0007\u0010¢\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JW\u0010§\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0007\u0010¤\u0001\u001a\u00020\u000f2\u0007\u0010¥\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0007\u0010¦\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JX\u0010§\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030 \u00012\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f2\u0007\u0010¨\u0001\u001a\u00020\u000f2\u0007\u0010©\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0007\u0010¦\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JX\u0010§\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030ª\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f2\u0007\u0010¨\u0001\u001a\u00020\u000f2\u0007\u0010©\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0007\u0010¦\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017Jw\u0010³\u0001\u001a\u00020\u00032\u0007\u0010o\u001a\u00030«\u00012\u0007\u0010¬\u0001\u001a\u00020\u000f2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020\u000f2\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010b2\u0007\u0010®\u0001\u001a\u00020\u000f2\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010e\u001a\u00020\u000f2\n\u0010°\u0001\u001a\u0005\u0018\u00010¯\u00012\u0007\u0010±\u0001\u001a\u00020\u000f2\u0007\u0010²\u0001\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0013\u0010¶\u0001\u001a\u00020\u00032\b\u0010µ\u0001\u001a\u00030´\u0001H\u0017R\u0019\u0010·\u0001\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001¨\u0006»\u0001"}, d2 = {"Landroidx/compose/ui/text/android/TextAndroidCanvas;", "Landroid/graphics/Canvas;", "canvas", "Lkotlin/j;", "setCanvas", "Landroid/graphics/Rect;", "bounds", "", "getClipBounds", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "enableZ", "disableZ", "isOpaque", "", "getWidth", "getHeight", "getDensity", "density", "setDensity", "getMaximumBitmapWidth", "getMaximumBitmapHeight", "save", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "paint", "saveFlags", "saveLayer", "", "left", "top", "right", "bottom", "alpha", "saveLayerAlpha", "restore", "getSaveCount", "saveCount", "restoreToCount", "dx", "dy", "translate", "sx", "sy", "scale", "degrees", "rotate", "skew", "Landroid/graphics/Matrix;", "matrix", "concat", "setMatrix", "ctm", "getMatrix", "rect", "Landroid/graphics/Region$Op;", "op", "clipRect", "clipOutRect", "Landroid/graphics/Path;", "path", "clipPath", "clipOutPath", "Landroid/graphics/DrawFilter;", "getDrawFilter", "filter", "setDrawFilter", "Landroid/graphics/Canvas$EdgeType;", "type", "quickReject", "Landroid/graphics/Picture;", "picture", "drawPicture", "dst", "oval", "startAngle", "sweepAngle", "useCenter", "drawArc", "a", "r", "g", "b", "drawARGB", "drawBitmap", "src", "", "colors", TypedValues.CycleType.S_WAVE_OFFSET, "stride", "x", "y", "width", "height", "hasAlpha", "meshWidth", "meshHeight", "", "verts", "vertOffset", "colorOffset", "drawBitmapMesh", "cx", "cy", "radius", "drawCircle", TypedValues.Custom.S_COLOR, "drawColor", "", "Landroid/graphics/PorterDuff$Mode;", "mode", "Landroid/graphics/BlendMode;", "startX", "startY", "stopX", "stopY", "drawLine", "pts", "count", "drawLines", "drawOval", "drawPaint", "Landroid/graphics/NinePatch;", "patch", "drawPatch", TypedValues.PositionType.S_DRAWPATH, "drawPoint", "drawPoints", "", "text", "index", "pos", "drawPosText", "", "drawRect", "drawRGB", "rx", "ry", "drawRoundRect", "outer", "outerRx", "outerRy", "inner", "innerRx", "innerRy", "drawDoubleRoundRect", "outerRadii", "innerRadii", "glyphIds", "glyphIdOffset", "positions", "positionOffset", "glyphCount", "Landroid/graphics/fonts/Font;", "font", "drawGlyphs", "drawText", "start", "end", "", "hOffset", "vOffset", "drawTextOnPath", "contextIndex", "contextCount", "isRtl", "drawTextRun", "contextStart", "contextEnd", "Landroid/graphics/text/MeasuredText;", "Landroid/graphics/Canvas$VertexMode;", "vertexCount", "texs", "texOffset", "", "indices", "indexOffset", "indexCount", "drawVertices", "Landroid/graphics/RenderNode;", "renderNode", "drawRenderNode", "nativeCanvas", "Landroid/graphics/Canvas;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ClassVerificationFailure"})
public final class TextAndroidCanvas extends Canvas {
    private Canvas nativeCanvas;

    @Override // android.graphics.Canvas
    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public boolean clipOutPath(Path path) {
        m.h(path, "path");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipOutPath(path);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public boolean clipOutRect(RectF rect) {
        m.h(rect, "rect");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipOutRect(rect);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path, Region.Op op) {
        m.h(path, "path");
        m.h(op, "op");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rect, Region.Op op) {
        m.h(rect, "rect");
        m.h(op, "op");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public void concat(Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(R.styleable.AppCompatTheme_actionModeStyle)
    public void disableZ() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.disableZ();
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int i2, int i3, int i4, int i5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawARGB(i2, i3, i4, i5);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        m.h(rectF, "oval");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawArc(rectF, f, f2, z, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        m.h(bitmap, "bitmap");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f, f2, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(Bitmap bitmap, int i2, int i3, float[] fArr, int i4, int[] iArr, int i5, Paint paint) {
        m.h(bitmap, "bitmap");
        m.h(fArr, "verts");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i2, i3, fArr, i4, iArr, i5, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f, float f2, float f3, Paint paint) {
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawCircle(f, f2, f3, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawColor(i2);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(R.styleable.AppCompatTheme_actionModeStyle)
    public void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        m.h(rectF, "outer");
        m.h(rectF2, "inner");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawGlyphs(int[] iArr, int i2, float[] fArr, int i3, int i4, Font font, Paint paint) {
        m.h(iArr, "glyphIds");
        m.h(fArr, "positions");
        m.h(font, "font");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawGlyphs(iArr, i2, fArr, i3, i4, font, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawLine(f, f2, f3, f4, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, int i2, int i3, Paint paint) {
        m.h(fArr, "pts");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawLines(fArr, i2, i3, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawOval(RectF rectF, Paint paint) {
        m.h(rectF, "oval");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPaint(Paint paint) {
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        m.h(ninePatch, "patch");
        m.h(rect, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rect, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        m.h(path, "path");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture) {
        m.h(picture, "picture");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f, float f2, Paint paint) {
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPoint(f, f2, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, int i2, int i3, Paint paint) {
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPoints(fArr, i2, i3, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPosText(char[] cArr, int i2, int i3, float[] fArr, Paint paint) {
        m.h(cArr, "text");
        m.h(fArr, "pos");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPosText(cArr, i2, i3, fArr, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int i2, int i3, int i4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawRGB(i2, i3, i4);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawRect(RectF rectF, Paint paint) {
        m.h(rectF, "rect");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(R.styleable.AppCompatTheme_actionModeStyle)
    public void drawRenderNode(RenderNode renderNode) {
        m.h(renderNode, "renderNode");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawRenderNode(renderNode);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        m.h(rectF, "rect");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f, f2, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawText(char[] cArr, int i2, int i3, float f, float f2, Paint paint) {
        m.h(cArr, "text");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawText(cArr, i2, i3, f, f2, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(char[] cArr, int i2, int i3, Path path, float f, float f2, Paint paint) {
        m.h(cArr, "text");
        m.h(path, "path");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i2, i3, path, f, f2, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(char[] cArr, int i2, int i3, int i4, int i5, float f, float f2, boolean z, Paint paint) {
        m.h(cArr, "text");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawTextRun(cArr, i2, i3, i4, i5, f, f2, z, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawVertices(Canvas.VertexMode vertexMode, int i2, float[] fArr, int i3, float[] fArr2, int i4, int[] iArr, int i5, short[] sArr, int i6, int i7, Paint paint) {
        m.h(vertexMode, "mode");
        m.h(fArr, "verts");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i2, fArr, i3, fArr2, i4, iArr, i5, sArr, i6, i7, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(R.styleable.AppCompatTheme_actionModeStyle)
    public void enableZ() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.enableZ();
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(Rect bounds) {
        m.h(bounds, "bounds");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            m.o("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(bounds);
        if (clipBounds) {
            bounds.set(0, 0, bounds.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.getDensity();
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public DrawFilter getDrawFilter() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.getHeight();
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public void getMatrix(Matrix matrix) {
        m.h(matrix, "ctm");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.getWidth();
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rect, Canvas.EdgeType type) {
        m.h(rect, "rect");
        m.h(type, "type");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.quickReject(rect, type);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public void restore() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.restore();
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int i2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.restoreToCount(i2);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void rotate(float f) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.rotate(f);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public int save() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.save();
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF bounds, Paint paint, int saveFlags) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.saveLayer(bounds, paint, saveFlags);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF bounds, int alpha, int saveFlags) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.saveLayerAlpha(bounds, alpha, saveFlags);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public void scale(float f, float f2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.scale(f, f2);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    public final void setCanvas(Canvas canvas) {
        m.h(canvas, "canvas");
        this.nativeCanvas = canvas;
    }

    @Override // android.graphics.Canvas
    public void setDensity(int i2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.setDensity(i2);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void setMatrix(Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void skew(float f, float f2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.skew(f, f2);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void translate(float f, float f2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.translate(f, f2);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public boolean clipOutRect(Rect rect) {
        m.h(rect, "rect");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipOutRect(rect);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path) {
        m.h(path, "path");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect, Region.Op op) {
        m.h(rect, "rect");
        m.h(op, "op");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawArc(f, f2, f3, f4, f5, f6, z, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        m.h(bitmap, "bitmap");
        m.h(rectF, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(R.styleable.AppCompatTheme_actionModeStyle)
    public void drawColor(long j) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawColor(j);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(R.styleable.AppCompatTheme_actionModeStyle)
    public void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        m.h(rectF, "outer");
        m.h(fArr, "outerRadii");
        m.h(rectF2, "inner");
        m.h(fArr2, "innerRadii");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, Paint paint) {
        m.h(fArr, "pts");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawOval(f, f2, f3, f4, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        m.h(ninePatch, "patch");
        m.h(rectF, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rectF, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, RectF rectF) {
        m.h(picture, "picture");
        m.h(rectF, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, Paint paint) {
        m.h(fArr, "pts");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPosText(String str, float[] fArr, Paint paint) {
        m.h(str, "text");
        m.h(fArr, "pos");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawRect(Rect rect, Paint paint) {
        m.h(rect, "r");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, float f, float f2, Paint paint) {
        m.h(str, "text");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawText(str, f, f2, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        m.h(str, "text");
        m.h(path, "path");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f, f2, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(CharSequence charSequence, int i2, int i3, int i4, int i5, float f, float f2, boolean z, Paint paint) {
        m.h(charSequence, "text");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawTextRun(charSequence, i2, i3, i4, i5, f, f2, z, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(RectF rect) {
        m.h(rect, "rect");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.quickReject(rect);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF bounds, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.saveLayer(bounds, paint);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF bounds, int alpha) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.saveLayerAlpha(bounds, alpha);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public boolean clipOutRect(float left, float top, float right, float bottom) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipOutRect(left, top, right, bottom);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rect) {
        m.h(rect, "rect");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        m.h(bitmap, "bitmap");
        m.h(rect2, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i2, PorterDuff.Mode mode) {
        m.h(mode, "mode");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawColor(i2, mode);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, Rect rect) {
        m.h(picture, "picture");
        m.h(rect, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawRect(f, f2, f3, f4, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, int i2, int i3, float f, float f2, Paint paint) {
        m.h(str, "text");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawText(str, i2, i3, f, f2, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(R.styleable.AppCompatTheme_actionModeStyle)
    public void drawTextRun(MeasuredText measuredText, int i2, int i3, int i4, int i5, float f, float f2, boolean z, Paint paint) {
        m.h(measuredText, "text");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawTextRun(measuredText, i2, i3, i4, i5, f, f2, z, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path, Canvas.EdgeType type) {
        m.h(path, "path");
        m.h(type, "type");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.quickReject(path, type);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float left, float top, float right, float bottom, Paint paint, int saveFlags) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.saveLayer(left, top, right, bottom, paint, saveFlags);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha, int saveFlags) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.saveLayerAlpha(left, top, right, bottom, alpha, saveFlags);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public boolean clipOutRect(int left, int top, int right, int bottom) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipOutRect(left, top, right, bottom);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect) {
        m.h(rect, "rect");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] iArr, int i2, int i3, float f, float f2, int i4, int i5, boolean z, Paint paint) {
        m.h(iArr, "colors");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i2, i3, f, f2, i4, i5, z, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(R.styleable.AppCompatTheme_actionModeStyle)
    public void drawColor(int i2, BlendMode blendMode) {
        m.h(blendMode, "mode");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawColor(i2, blendMode);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawText(CharSequence charSequence, int i2, int i3, float f, float f2, Paint paint) {
        m.h(charSequence, "text");
        m.h(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawText(charSequence, i2, i3, f, f2, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(Path path) {
        m.h(path, "path");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.quickReject(path);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float left, float top, float right, float bottom, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.saveLayer(left, top, right, bottom, paint);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.saveLayerAlpha(left, top, right, bottom, alpha);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float left, float top, float right, float bottom, Region.Op op) {
        m.h(op, "op");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipRect(left, top, right, bottom, op);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, Paint paint) {
        m.h(iArr, "colors");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i2, i3, i4, i5, i6, i7, z, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(R.styleable.AppCompatTheme_actionModeStyle)
    public void drawColor(long j, BlendMode blendMode) {
        m.h(blendMode, "mode");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawColor(j, blendMode);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float left, float top, float right, float bottom, Canvas.EdgeType type) {
        m.h(type, "type");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.quickReject(left, top, right, bottom, type);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float left, float top, float right, float bottom) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipRect(left, top, right, bottom);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        m.h(bitmap, "bitmap");
        m.h(matrix, "matrix");
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            m.o("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(float left, float top, float right, float bottom) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.quickReject(left, top, right, bottom);
        }
        m.o("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int left, int top, int right, int bottom) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipRect(left, top, right, bottom);
        }
        m.o("nativeCanvas");
        throw null;
    }
}
