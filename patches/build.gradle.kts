group = "yukulabo"

patches {
    about {
        name = "YahooRosenPatch"
        description = "Morphe patches for Yahoo! Transit (jp.co.yahoo.android.apps.transit) - removes ads"
        source = "local"
        author = "yukulabo"
        contact = "na"
        website = "na"
        license = "GNU General Public License v3.0"
    }
}

dependencies {
    implementation(libs.gson)
    implementation(libs.morphe.patches.library)
}

kotlin {
    compilerOptions {
        freeCompilerArgs.add("-Xcontext-parameters")
    }
}
