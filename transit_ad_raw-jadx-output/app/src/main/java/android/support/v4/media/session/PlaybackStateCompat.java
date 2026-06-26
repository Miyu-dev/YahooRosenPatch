package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f90c;
    public final float d;
    public final long e;
    public final int f;
    public final CharSequence g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f91i;
    public final long j;
    public final Bundle k;

    public class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i2) {
            return new PlaybackStateCompat[i2];
        }
    }

    @RequiresApi(21)
    public static class b {
        @DoNotInline
        public static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        @DoNotInline
        public static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        public static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        public static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        @DoNotInline
        public static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i2) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i2);
        }

        @DoNotInline
        public static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        @DoNotInline
        public static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        @DoNotInline
        public static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        @DoNotInline
        public static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        @DoNotInline
        public static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        @DoNotInline
        public static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        @DoNotInline
        public static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        @DoNotInline
        public static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        @DoNotInline
        public static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        @DoNotInline
        public static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        @DoNotInline
        public static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        @DoNotInline
        public static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        @DoNotInline
        public static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        @DoNotInline
        public static void s(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        @DoNotInline
        public static void t(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        @DoNotInline
        public static void u(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        @DoNotInline
        public static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        @DoNotInline
        public static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        @DoNotInline
        public static void x(PlaybackState.Builder builder, int i2, long j, float f, long j2) {
            builder.setState(i2, j, f, j2);
        }
    }

    @RequiresApi(R.styleable.AppCompatTheme_actionModeCutDrawable)
    public static class c {
        @DoNotInline
        public static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        @DoNotInline
        public static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    public PlaybackStateCompat(int i2, long j, long j2, float f, long j3, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        this.f89a = i2;
        this.b = j;
        this.f90c = j2;
        this.d = f;
        this.e = j3;
        this.f = 0;
        this.g = charSequence;
        this.h = j4;
        this.f91i = new ArrayList(arrayList);
        this.j = j5;
        this.k = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f89a + ", position=" + this.b + ", buffered position=" + this.f90c + ", speed=" + this.d + ", updated=" + this.h + ", actions=" + this.e + ", error code=" + this.f + ", error message=" + this.g + ", custom actions=" + this.f91i + ", active item id=" + this.j + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f89a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.h);
        parcel.writeLong(this.f90c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.g, parcel, i2);
        parcel.writeTypedList(this.f91i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92a;
        public final CharSequence b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f93c;
        public final Bundle d;

        public class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i2) {
                return new CustomAction[i2];
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i2, Bundle bundle) {
            this.f92a = str;
            this.b = charSequence;
            this.f93c = i2;
            this.d = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.b) + ", mIcon=" + this.f93c + ", mExtras=" + this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f92a);
            TextUtils.writeToParcel(this.b, parcel, i2);
            parcel.writeInt(this.f93c);
            parcel.writeBundle(this.d);
        }

        public CustomAction(Parcel parcel) {
            this.f92a = parcel.readString();
            this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f93c = parcel.readInt();
            this.d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f89a = parcel.readInt();
        this.b = parcel.readLong();
        this.d = parcel.readFloat();
        this.h = parcel.readLong();
        this.f90c = parcel.readLong();
        this.e = parcel.readLong();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f91i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.j = parcel.readLong();
        this.k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f = parcel.readInt();
    }
}
