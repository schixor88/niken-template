object Dependency {
    val KOTLIN_SBLIB = "androidx.core:core-ktx:${Version.KOTLIN_SBLIB_VERSION}"
    val APP_COMPAT = "androidx.appcompat:appcompat:${Version.APP_COMPAT_VERSION}"
    val MATERIAL = "com.google.android.material:material:${Version.MATERIAL_VERSION}"
    val CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${Version.CONSTRAINT_LAYOUT_VERSION}"
    val JUNIT = "junit:junit:${Version.JUNIT_VERSION}"
    val EXT_JUNIT = "androidx.test.ext:junit:${Version.EXT_JUNIT_VERSION}"
    val EXPRESSO = "androidx.test.espresso:espresso-core:${Version.EXPRESSO_VERSION}"

    val DAGGER_HILT = "com.google.dagger:hilt-android:${Version.DAGGER_HILT_VERSION}"
    val HILT_ANDROID =
        "com.google.dagger:hilt-android-compiler:${Version.HILT_ANDROID_VERSION}" //kapt
    val HILT_VIEWMODEL = "androidx.hilt:hilt-lifecycle-viewmodel:${Version.HILT_VIEWMODEL_VERSION}"
    val HILT_COMPILER = "androidx.hilt:hilt-compiler:${Version.HILT_COMPILER_VERSION}" //kapt

    val RETROFIT = "com.squareup.retrofit2:retrofit:${Version.RETROFIT_VERSION}"
    val MOSHI_CONVERTER =
        "com.squareup.retrofit2:converter-moshi:${Version.MOSHI_CONVERTER_VERSION}"
    val OKHTTP3 = "com.squareup.okhttp3:okhttp:${Version.OKHTTP3_VERSION}"
    val OKHTTP_INTERCEPTOR =
        "com.squareup.okhttp3:logging-interceptor:${Version.OKHTTP_INTERCEPTOR_VERSION}"

    val ROOM = "androidx.room:room-runtime:${Version.ROOM_VERSION}"
    val ROOM_COMPILER = "androidx.room:room-compiler:${Version.ROOM_COMPILER_VERSION}" //kapt

    val ROOM_COROUTINE = "androidx.room:room-ktx:${Version.ROOM_COROUTINE_VERSION}"

    val COROUTINE = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2"

    val VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.VIEWMODEL_VERSION}"

    val FRAGMENT = "androidx.fragment:fragment-ktx:1.3.2"

    // Saved state module for ViewModel
    val VIEWMODEL_SAVED_STATE = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Version.VIEWMODEL_VERSION}"

}
