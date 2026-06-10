// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
}

tasks.register("test") {
    dependsOn(":app:testDebugUnitTest")
}

tasks.register("assembleDebug") {
    dependsOn(":app:assembleDebug")
}
