plugins {
    `java-platform`
}

javaPlatform {
  allowDependencies()
}

dependencies {
  api(platform("org.jetbrains.kotlin:kotlin-bom:1.8.10"))
  api(platform("org.jetbrains.kotlinx:kotlinx-coroutines-bom:1.5.2"))

  constraints {
        api("androidx.activity:activity-ktx:1.2.4")
        api("androidx.annotation:annotation:1.2.0")
        api("androidx.annotation:annotation-experimental:1.1.0")
        api("androidx.appcompat:appcompat:1.3.0")
        api("androidx.arch.core:core-common:2.1.0")
        api("androidx.arch.core:core-testing:2.1.0")
        api("androidx.browser:browser:1.3.0")
        api("androidx.cardview:cardview:1.0.0")
        api("androidx.collection:collection:1.1.0")
        api("androidx.constraintlayout:constraintlayout:2.0.4")
        api("androidx.core:core-ktx:1.6.0")
        api("androidx.core:core:1.6.0")
        api("androidx.dynamicanimation:dynamicanimation:1.0.0")
        api("androidx.fragment:fragment-ktx:1.3.5")
        api("androidx.fragment:fragment-testing:1.3.5")
        api("androidx.fragment:fragment:1.3.5")
        api("androidx.legacy:legacy-support-v13:1.0.0")
        api("androidx.legacy:legacy-support-v4:1.0.0")
        api("androidx.lifecycle:lifecycle-common-java8:2.3.1")
        api("androidx.lifecycle:lifecycle-process:2.3.1")
        api("androidx.lifecycle:lifecycle-reactivestreams:2.3.1")
        api("androidx.lifecycle:lifecycle-runtime:2.3.1")
        api("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
        api("androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.0")
        api("androidx.lifecycle:lifecycle-viewmodel:2.3.1")
        api("androidx.multidex:multidex-instrumentation:2.0.0")
        api("androidx.multidex:multidex:2.0.1")
        api("androidx.navigation:navigation-fragment-ktx:2.3.5")
        api("androidx.paging:paging-runtime:2.1.2")
        api("androidx.paging:paging-rxjava2-ktx:2.1.2")
        api("androidx.percentlayout:percentlayout:1.0.0")
        api("androidx.preference:preference:1.1.1")
        api("androidx.recyclerview:recyclerview:1.2.1")
        api("androidx.room:room-compiler:2.3.0")
        api("androidx.room:room-runtime:2.3.0")
        api("androidx.room:room-rxjava2:2.3.0")
        api("androidx.room:room-testing:2.3.0")
        api("androidx.savedstate:savedstate:1.0.0")
        api("androidx.startup:startup-runtime:1.0.0")
        api("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
        api("androidx.viewpager2:viewpager2:1.0.0")
        api("androidx.work:work-runtime:2.5.0")
        api("androidx.work:work-runtime-ktx:2.5.0")
        api("androidx.work:work-rxjava2:2.5.0")
        api("androidx.test.espresso:espresso-core:3.3.0")
        api("androidx.test.espresso:espresso-intents:3.2.0")
        api("androidx.test.espresso:espresso-contrib:3.3.0")
        api("androidx.test.ext:junit:1.1.2")
        api("androidx.test.uiautomator:uiautomator:2.2.0")
        api("androidx.test:core:1.4.0")
        api("androidx.test:rules:1.2.0")
        api("androidx.test:runner:1.2.0")
        api("com.google.android.material:material:1.4.0")
        api("com.google.android.flexbox:flexbox:3.0.0")
        api("com.google.android.gms:play-services-location:20.0.0")
        api("com.google.android.gms:play-services-nearby:17.0.0")
        api("com.google.dagger:dagger:2.43.2")
        api("com.google.dagger:dagger-compiler:2.43.2")
        api("com.google.dagger:dagger-lint:2.43.2")
        api("io.reactivex.rxjava2:rxjava:2.2.21")
        api("io.reactivex.rxjava2:rxkotlin:2.4.0")
        api("io.reactivex.rxjava2:rxandroid:2.1.1")
        api("com.github.yongjhih.rxbolts:rxbolts2:2.0.2")
        // jitpack no longer supports group names with capital letters
        api("com.github.yongjhih.RxBolts:rxbolts2:2.0.2")
        api("com.jakewharton.rx2:replaying-share-kotlin:2.2.0")
        api("com.jakewharton.rxbinding3:rxbinding:3.1.0")
        api("com.jakewharton.rxbinding3:rxbinding-core:3.1.0")
        api("com.jakewharton.rxbinding3:rxbinding-appcompat:3.1.0")
        api("com.google.code.gson:gson:2.9.1")
        api("com.squareup.okhttp3:okhttp:3.12.13")
        api("com.squareup.okhttp3:logging-interceptor:3.12.13")
        api("com.squareup.okhttp3:mockwebserver:3.12.13")
        api("com.squareup.okio:okio:1.17.4")
        api("com.squareup.retrofit2:retrofit:2.5.0")
        api("com.squareup.retrofit2:converter-gson:2.5.0")
        api("com.squareup.retrofit2:converter-scalars:2.5.0")
        api("com.squareup.retrofit2:adapter-rxjava2:2.5.0")
        api("com.parse.bolts:bolts-tasks:1.4.0")
        api("com.github.parse-community.Parse-SDK-Android:parse:1.19.0")
        api("com.github.parse-community:ParseLiveQuery-Android:1.1.0")

        api("javax.inject:javax.inject:1")
        api("com.google.code.findbugs:jsr305:3.0.2")

        api("com.airbnb.android:lottie:4.2.0")
        api("com.dropbox.mobile.store:store4:4.0.5")
        api("com.dropbox.mobile.store:store-rx2:4.0.5")
        api("com.facebook.shimmer:shimmer:0.5.0")
        api("com.squareup.phrase:phrase:1.2.0")
        api("com.github.sephiroth74:android-target-tooltip:2.0.4")
        api("com.makeramen:roundedimageview:2.3.0")
        api("org.funktionale:funktionale-option:1.2")
        api("ru.tinkoff.scrollingpagerindicator:scrollingpagerindicator:1.2.1")
        api("androidx.emoji:emoji:1.1.0")
        api("jp.wasabeef:recyclerview-animators:3.0.0")
  }
}
