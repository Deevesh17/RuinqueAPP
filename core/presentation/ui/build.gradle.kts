plugins {
    id("org.jetbrains.kotlin.plugin.compose")
    alias(libs.plugins.runique.android.library.compose)
}

android {
    namespace = "com.example.core.presentation.ui"
}

dependencies {
    implementation(project(":core:domain"))
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat.v170)
    implementation(libs.material.v1120)
    implementation(libs.androidx.ui.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}