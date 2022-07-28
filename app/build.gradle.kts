plugins {
    id(GradlePluginId.ANDROID_APPLICATION)
    id(GradlePluginId.KOTLIN_ANDROID)
    id(GradlePluginId.KOTLIN_KAPT) // or kotlin("kapt")
    id(GradlePluginId.ANDROID_HILT)
}

android {

    defaultConfig {
        applicationId = AndroidConfig.ID
        compileSdk = AndroidConfig.COMPILE_SDK_VERSION
        minSdk = AndroidConfig.MIN_SDK_VERSION
        targetSdk = AndroidConfig.TARGET_SDK_VERSION
        buildToolsVersion = AndroidConfig.BUILD_TOOLS_VERSION

        versionCode = AndroidConfig.VERSION_CODE
        versionName = AndroidConfig.VERSION_NAME
        testInstrumentationRunner = AndroidConfig.TEST_INSTRUMENTATION_RUNNER

    }

    buildTypes {
        getByName(BuildType.RELEASE) {
            isMinifyEnabled = BuildTypeRelease.isMinifyEnabled
            proguardFiles("proguard-android.txt", "proguard-rules.pro")
        }
    }

    buildFeatures.viewBinding = true

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(Dependency.KOTLIN_SBLIB)
    implementation(Dependency.APP_COMPAT)
    implementation(Dependency.MATERIAL)
    implementation(Dependency.CONSTRAINT_LAYOUT)
    implementation(Dependency.JUNIT)
    implementation(Dependency.EXT_JUNIT)
    implementation(Dependency.EXPRESSO)

    //Dagger - Hilt
    implementation(Dependency.DAGGER_HILT)
    kapt(Dependency.HILT_COMPILER)
    kapt(Dependency.HILT_ANDROID)

    // Retrofit
    implementation(Dependency.RETROFIT)
    implementation(Dependency.MOSHI_CONVERTER)
    implementation(Dependency.OKHTTP3)
    implementation(Dependency.OKHTTP_INTERCEPTOR)

    // Room
    implementation(Dependency.ROOM)
    kapt(Dependency.ROOM_COMPILER)

    // Kotlin Extensions and Coroutines support for Room
    implementation(Dependency.ROOM_COROUTINE)

    //Coroutine
    implementation(Dependency.COROUTINE)

    //ViewModel
    implementation(Dependency.VIEWMODEL)
    implementation(Dependency.VIEWMODEL_SAVED_STATE)
    implementation(Dependency.FRAGMENT)
}
