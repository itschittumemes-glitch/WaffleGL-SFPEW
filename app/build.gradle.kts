plugins {
    id("com.android.application")
}

android {
    namespace = "com.mine.mglegacy"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mine.mglegacy"
        minSdk = 24
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"
    }

    packaging {
        jniLibs {
            // keep .so files extracted on disk so the launcher can load them
            useLegacyPackaging = true
            keepDebugSymbols += "**/*.so"
        }
    }
}
