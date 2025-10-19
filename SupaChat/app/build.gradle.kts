plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.supachat"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.supachat"
        minSdk = 28
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    // --- Core Android & Compose ---
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    // --- Stream Chat SDK ---
    implementation("io.getstream:stream-chat-android-compose:6.2.1")
    implementation("io.getstream:stream-chat-android-offline:6.2.1")
    implementation("io.getstream:stream-chat-android-state:6.2.1")

    // --- Firebase SDKs ---
    implementation(platform("com.google.firebase:firebase-bom:34.4.0"))
    implementation("com.google.firebase:firebase-analytics")       //analytics
    implementation("com.google.firebase:firebase-auth")            // Authentication
    implementation("com.google.firebase:firebase-database")        // Realtime Database (if used)
    implementation("com.google.firebase:firebase-firestore")       // Firestore (if preferred)
    implementation("com.google.firebase:firebase-storage")         // For profile images/files
    implementation("com.google.firebase:firebase-messaging")       // Push notifications (FCM)

    // --- Image Loading ---
    implementation("io.coil-kt:coil-compose:2.7.0")

    // --- Navigation ---
    implementation("androidx.navigation:navigation-compose:2.8.3")

    // --- Lifecycle & ViewModel ---
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.6")

    // --- Coroutines ---
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")

    // --- Optional UI Enhancements ---
    implementation("androidx.compose.material:material-icons-extended:1.7.5")

    // --- Testing ---
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}