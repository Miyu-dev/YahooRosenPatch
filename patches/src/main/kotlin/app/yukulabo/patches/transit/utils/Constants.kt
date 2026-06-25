package app.yukulabo.patches.transit.utils

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.Compatibility

object Constants {
    val COMPATIBILITY_TRANSIT =
        Compatibility(
            name = "Yahoo! Transit",
            packageName = "jp.co.yahoo.android.apps.transit",
            apkFileType = ApkFileType.APK,
            appIconColor = 0xFF0033,
        )
}
