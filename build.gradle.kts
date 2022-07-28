plugins {
    id(GradlePluginId.ANDROID_APPLICATION) version(Version.ANDROID_APPLICATION_VERSION) apply false
    id(GradlePluginId.ANDROID_LIBRARY) version(Version.ANDROID_APPLICATION_VERSION) apply false
    id(GradlePluginId.KOTLIN_ANDROID) version(Version.KOTLIN_VERSION) apply false
    id(GradlePluginId.DAGGER_HILT) version(Version.ANDROID_HILT_VERSION) apply false
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}


