plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("com.google.dagger.hilt.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.manodev.mvvmmoviesapproomdb"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.manodev.mvvmmoviesapproomdb"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    //Navigation
    implementation(libs.androidx.navigation.compose)

    // Room
    implementation(libs.androidx.room.ktx)
    kapt(libs.androidx.room.compiler)
    implementation(libs.androidx.room.paging)

    // Dagger - Hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    kapt(libs.androidx.hilt.compiler)
    implementation(libs.androidx.hilt.navigation.compose)

    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.okhttp)
    implementation(libs.logging.interceptor)

    // Coil
    implementation(libs.coil.compose)

    // Extended Icons
    implementation(libs.androidx.material.icons.extended)

    // system UI Controller
    implementation(libs.accompanist.systemuicontroller)

    //truth

    implementation(libs.truth)

    androidTestImplementation(libs.hilt.android.testing)

    kaptAndroidTest(libs.hilt.android.compiler)

    androidTestImplementation(libs.androidx.core.testing)

    androidTestImplementation(libs.kotlinx.coroutines.test)

    androidTestImplementation(libs.truth)

    //  Mockito

    testImplementation(libs.mockito.core)

    // Mockito para testes no Android

    androidTestImplementation(libs.mockito.android)

    //Mockito para  mockar classes e métodos constantes

    testImplementation(libs.mockito.inline)

    androidTestImplementation(libs.androidx.junit.v115)

    androidTestImplementation(libs.androidx.espresso.core.v351)

    androidTestImplementation(libs.ui.test.junit4)

    debugImplementation(libs.ui.tooling)

    debugImplementation(libs.ui.test.manifest)
}