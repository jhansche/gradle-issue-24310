package com.android.example.module198

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.schedulers.SingleScheduler,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.requestMore(4161336814821241789)

		for (iAb in 0..2) {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: pkg.android.module053.BuildConfig = pkg.android.module053.BuildConfig()
				
			}
			param0.onComplete()

			param0.onComplete()

		}
	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: com.android.example.module079.ClassAAE = com.android.example.module079.ClassAAE()
		local_var_2_3.method1("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_4: com.android.example.module053.ClassAAA = com.android.example.module053.ClassAAA()
		local_var_2_4.method1("SomeString", "SomeString", "SomeString")

		val local_var_2_5: com.android.example.module053.ClassAAA = com.android.example.module053.ClassAAA()
		local_var_2_5.method0("SomeString", "SomeString")

		val local_var_2_6: com.android.example.module053.ClassAAB = com.android.example.module053.ClassAAB()
		local_var_2_6.method0("SomeString", "SomeString")

		val local_var_2_7: com.android.example.module094.ClassACV = com.android.example.module094.ClassACV()
		local_var_2_7.method0(com.google.gson.internal.Excluder())

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.isCancelled()

		param0.hasSubscription()

		val local_var_2_1: com.android.example.module079.ClassAABJava = com.android.example.module079.ClassAABJava()
		local_var_2_1.method4("SomeString", "SomeString")

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.schedulers.TestScheduler,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.observers.TestObserver<kotlin.Any>
	) {
		param0.assertSubscribed()

		val local_var_2_4: com.android.example.module079.ClassAAF = com.android.example.module079.ClassAAF()
		local_var_2_4.method4("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_5: com.android.example.module094.ClassAAN = com.android.example.module094.ClassAAN()
		local_var_2_5.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.schedulers.TestScheduler())

	}
}
