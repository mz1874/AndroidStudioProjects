plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    /*命名空间*/
    namespace = "com.mz.a01_layout"
    /*编译的SDK*/
    compileSdk = 34

    defaultConfig {
        /*程序ID*/
        applicationId = "com.mz.a01_layout"
        /*最小SDK支持版本*/
        minSdk = 21
        /*目标SDK版本*/
        targetSdk = 34
        /*版本号*/
        versionCode = 1
        /*版本名称*/
        versionName = "1.0"
        /*单元测试运行*/
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            /*是否开启代码混淆*/
            isMinifyEnabled = false
            /*指定代码混淆的规则文件*/
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        /*基于Java1.8*/
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        /*Kotlin的 version based on Java*/
        jvmTarget = "1.8"
    }
}
    /*插件信息*/
dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}