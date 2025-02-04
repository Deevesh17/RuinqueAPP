plugins {
    id("org.jetbrains.kotlin.plugin.compose")
    alias(libs.plugins.runique.android.feature.ui)
}
android {
    namespace = "com.learning.auth.presentation"
}

dependencies {
    implementation(projects.core.presentation.designSystem)
    implementation(projects.core.domain)
    implementation(projects.auth.domain)

}