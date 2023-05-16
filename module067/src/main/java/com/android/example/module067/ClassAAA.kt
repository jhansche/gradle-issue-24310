package com.android.example.module067

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module065.ClassAAAJava = com.android.example.module065.ClassAAAJava()
	private 	val instance_var_1_1: com.android.example.module065.ClassAABJava = com.android.example.module065.ClassAABJava()
	private 	val instance_var_1_2: com.android.example.module065.ClassAACJava = com.android.example.module065.ClassAACJava()
	private 	val instance_var_1_3: com.android.example.module065.ClassAACJava = com.android.example.module065.ClassAACJava()
	private 	val instance_var_1_4: com.android.example.module065.ClassAACJava = com.android.example.module065.ClassAACJava()

	fun method0(
		param0: com.android.example.module065.ClassAACJava,
		param1: pkg.android.module065.BuildConfig,
		param2: com.android.example.module065.ClassAAAJava,
		param3: com.android.example.module065.ClassAAA
	) {
		val local_var_2_4: io.reactivex.internal.util.OpenHashSet<kotlin.Any> = io.reactivex.internal.util.OpenHashSet()
		local_var_2_4.keys()

		for (iAb in 0..6) {
			param0.method4(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertNotSubscribed()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.isCancelled()

		}
		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.dispose()

		param0.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.requestMore(-2192575066919375629)

	}

	fun method1(
		param0: com.android.example.module065.ClassAAA,
		param1: com.android.example.module065.ClassAABJava,
		param2: com.android.example.module065.ClassAAAJava,
		param3: com.android.example.module065.ClassAAAJava
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

		param0.method4(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_5: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
		local_var_2_5.get()

	}

	fun method2(
		param0: pkg.android.module065.BuildConfig,
		param1: com.android.example.module065.ClassAAAJava,
		param2: com.android.example.module065.ClassAACJava,
		param3: com.android.example.module065.ClassAABJava
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

		param1.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: pkg.android.module065.BuildConfig,
		param1: com.android.example.module065.ClassAAAJava,
		param2: pkg.android.module065.BuildConfig,
		param3: com.android.example.module065.ClassAAAJava
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onNext(kotlin.Any())

	}

	fun method4(
		param0: pkg.android.module065.BuildConfig,
		param1: pkg.android.module065.BuildConfig
	) {
		val local_var_2_2: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_2.hasSubscription()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

	}
}
