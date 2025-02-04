plugins {
    id("org.jetbrains.kotlin.plugin.compose")
    alias(libs.plugins.runique.android.library.compose)
}

android {
    namespace = "com.example.core.presentation.designsystem"
}

dependencies {

    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat.v170)
    implementation(libs.material.v1120)
    implementation("androidx.compose.material3:material3-android:1.3.1")
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}