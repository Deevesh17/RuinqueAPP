plugins {
    id("org.jetbrains.kotlin.plugin.compose")
    alias(libs.plugins.runique.android.feature.ui)
}
android {
    namespace = "com.example.run.presentation"
}

dependencies {

    implementation(projects.core.presentation.designSystem)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat.v170)
    implementation(libs.material.v1120)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}