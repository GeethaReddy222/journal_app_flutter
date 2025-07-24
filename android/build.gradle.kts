buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Add the google-services classpath
        classpath 'com.android.tools.build:gradle:7.4.2'
        classpath 'com.google.gms:google-services:4.3.15' // Firebase
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
