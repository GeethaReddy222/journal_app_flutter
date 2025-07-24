plugins {
    id 'com.android.application'
    id 'kotlin-android'
    id 'com.google.gms.google-services' // Firebase plugin
}

android {
    namespace "com.yourcompany.journal"
    compileSdk 33

    defaultConfig {
        applicationId "com.yourcompany.journal"
        minSdk 19
        targetSdk 33
        versionCode 1
        versionName "1.0"

        // Enable MultiDex to fix "Dex limit" error
        multiDexEnabled true
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = '1.8'
    }
}

dependencies {
    implementation 'androidx.multidex:multidex:2.0.1' // Required for MultiDex
    implementation platform('com.google.firebase:firebase-bom:32.7.0')
    implementation 'com.google.firebase:firebase-analytics'
    implementation 'com.google.firebase:firebase-firestore'
}
