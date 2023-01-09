package dependencies

object Dependencies {
    const val desugar = "com.android.tools:desugar_jdk_libs:1.1.5"
    const val androidx_activity_ktx = "androidx.activity:activity-ktx:1.3.1"
    const val androidx_legacy_support = "androidx.legacy:legacy-support-v13:1.0.0"
    const val androidx_lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:2.2.0"
    const val androidx_lifecycle_runtime_ktx = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"
    const val androidx_viewpager2= "androidx.viewpager2:viewpager2:1.0.0"
    const val androidx_lifecycle_livedata_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:2.3.1"
    const val androidx_lifecycle_viewmodel = "androidx.lifecycle:lifecycle-viewmodel:2.3.1"
    const val androidx_core_ktx = "androidx.core:core-ktx:1.6.0"
    const val androidx_browser = "androidx.browser:browser:1.3.0"
    const val androidx_recyclerview = "androidx.recyclerview:recyclerview:1.2.1"
    const val androidx_fragment = "androidx.fragment:fragment:${Versions.androidx_fragment}"
    const val androidx_appcompat = "androidx.appcompat:appcompat:1.2.0"
    const val androidx_work_runtime = "androidx.work:work-runtime:2.5.0"
    const val androidx_cardview = "androidx.cardview:cardview:1.0.0"
    const val androidx_exinterface = "androidx.exifinterface:exifinterface:1.3.3"
    const val androidx_multidex = "androidx.multidex:multidex:2.0.1"
    const val androidx_preference_ktx = "androidx.preference:preference-ktx:1.1.1"
    const val androidx_fragment_ktx = "androidx.fragment:fragment-ktx:${Versions.androidx_fragment}"
    const val android_material = "com.google.android.material:material:1.4.0"
    const val android_flexbox = "com.google.android:flexbox:2.0.1"
    const val google_api_client_android = "com.google.api-client:google-api-client-android:1.32.1"
    const val google_api_services_drive = "com.google.apis:google-api-services-drive:v3-rev20210725-1.32.1"
    const val google_api_services_sheets = "com.google.apis:google-api-services-sheets:v4-rev20210629-1.32.1"
    const val play_services_auth = "com.google.android.gms:play-services-auth:19.2.0"
    const val play_services_maps = "com.google.android.gms:play-services-maps:17.0.1"
    const val play_services_location = "com.google.android.gms:play-services-location:18.0.0"
    const val mapbox_android_sdk = "com.mapbox.mapboxsdk:mapbox-android-sdk:9.2.1"
    const val mapbox_android_plugin_annotation = "com.mapbox.mapboxsdk:mapbox-android-plugin-annotation-v9:0.8.0" // Upgrading will require more changes in our codebase https://github.com/getodk/collect/issues/4305
    const val osmdroid = "org.osmdroid:osmdroid-android:6.1.11"
    const val guava = "com.google.guava:guava:30.1.1-android"
    const val squareup_okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp3}"
    const val squareup_okhttp_tls = "com.squareup.okhttp3:okhttp-tls:${Versions.okhttp3}"
    const val burgstaller_okhttp_digest = "com.burgstaller:okhttp-digest:2.5"
    const val persian_joda_time = "com.github.mohamadian:PersianJodaTime:1.2"
    const val myanmar_calendar = "com.github.chanmratekoko:myanmar-calendar:1.0.6.RC3"
    const val bikram_sambat = "bikramsambat:bikram-sambat:1.1.0"
    const val danlew_android_joda = "net.danlew:android.joda:2.10.9.1"
    const val rarepebble_colorpicker = "com.rarepebble:colorpicker:3.0.1"
    const val commons_io = "commons-io:commons-io:2.5" // Commons 2.6+ introduce java.nio usage that we can't access until our minSdkVersion >= 26 (https://developer.android.com/reference/java/io/File#toPath())
    const val opencsv = "net.sf.opencsv:opencsv:2.4"
    const val javarosa = "org.getodk:javarosa:3.2.0"
    const val karumi_dexter = "com.karumi:dexter:6.2.3"
    const val zxing_android_embedded = "com.journeyapps:zxing-android-embedded:3.6.0" // Upgrading will require minSdkVersion >=24, it uses zxing:core 3.3.2 by default
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val dagger_compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val dagger_android = "com.google.dagger:dagger-android:${Versions.dagger}"
    const val dagger_android_support = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val dagger_android_processor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    const val kotlinx_coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.1"
    const val rxandroid = "io.reactivex.rxjava2:rxandroid:2.1.1"
    const val rxjava = "io.reactivex.rxjava2:rxjava:2.2.21"
    const val rxrelay = "com.jakewharton.rxrelay2:rxrelay:2.1.1"
    const val armen101_audio_recorder_view = "com.github.Armen101:AudioRecordView:1.0.5"
    const val glide = "com.github.bumptech.glide:glide:4.12.0"
    const val mp4parser_muxer = "org.mp4parser:muxer:1.9.41"
    const val butterknife = "com.jakewharton:butterknife:10.2.3"
    const val butterknife_compiler = "com.jakewharton:butterknife-compiler:10.2.3"
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val kotlin_stdlib_jdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val json = "org.json:json:20210307"
    const val gson = "com.google.code.gson:gson:2.8.7"
    const val firebase_analytics = "com.google.firebase:firebase-analytics:19.0.0"
    const val firebase_crashlytics = "com.google.firebase:firebase-crashlytics:18.2.1"
    const val findbugs_annotations = "com.google.code.findbugs:annotations:3.0.1"
    const val findbugs_jsr305 = "com.google.code.findbugs:jsr305:3.0.2"
    const val fastlane_screengrab = "tools.fastlane:screengrab:2.1.0"
    const val leakcanary = "com.squareup.leakcanary:leakcanary-android:2.7"
    const val timber = "com.jakewharton.timber:timber:5.0.1"
    const val slf4j_api = "org.slf4j:slf4j-api:2.0.0-alpha0"
    const val slf4j_timber = "com.arcao:slf4j-timber:3.1@aar"
    const val emoji_java = "com.vdurmont:emoji-java:5.1.1"

    // Test dependencies
    const val junit = "junit:junit:4.13.2"
    const val mockito_android = "org.mockito:mockito-android:${Versions.mockito}"
    const val mockito_core = "org.mockito:mockito-core:${Versions.mockito}"
    const val mockito_inline = "org.mockito:mockito-inline:${Versions.mockito}"
    const val mockito_kotlin = "org.mockito.kotlin:mockito-kotlin:3.2.0"
    const val androidx_fragment_testing = "androidx.fragment:fragment-testing:${Versions.androidx_fragment}"
    const val androidx_arch_core_testing = "androidx.arch.core:core-testing:2.1.0"
    const val androidx_work_testing = "androidx.work:work-testing:2.5.0"
    const val androidx_test_core_ktx = "androidx.test:core-ktx:1.4.0"
    const val androidx_test_rules = "androidx.test:rules:1.4.0"
    const val androidx_test_espresso_contrib = "androidx.test.espresso:espresso-contrib:3.4.0"
    const val androidx_test_espresso_core = "androidx.test.espresso:espresso-core:3.4.0"
    const val androidx_test_espresso_intents = "androidx.test.espresso:espresso-intents:3.4.0"
    const val androidx_test_ext_junit = "androidx.test.ext:junit:1.1.3"
    const val okhttp3_mockwebserver = "com.squareup.okhttp3:mockwebserver:${Versions.okhttp3}"
    const val kotlinx_coroutines_test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.1"
    const val hamcrest = "org.hamcrest:hamcrest:2.2"
    const val powermock_module_junit4 = "org.powermock:powermock-module-junit4:2.0.9"
    const val powermock_api_mockito2 = "org.powermock:powermock-api-mockito2:2.0.9"
    const val robolectric = "org.robolectric:robolectric:4.5.1"
    const val robolectric_shadows_multidex = "org.robolectric:shadows-multidex:4.5.1"
    const val uiautomator = "androidx.test.uiautomator:uiautomator:2.2.0"
}
