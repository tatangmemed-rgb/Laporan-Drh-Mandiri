plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.mediarta.laporanhmandiri"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.mediarta.laporanhmandiri"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
