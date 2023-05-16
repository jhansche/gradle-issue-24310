package com.android.example.module067

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: pkg.android.module065.BuildConfig = pkg.android.module065.BuildConfig()
	private 	val instance_var_1_1: pkg.android.module065.BuildConfig = pkg.android.module065.BuildConfig()
	private 	val instance_var_1_2: com.android.example.module065.ClassAACJava = com.android.example.module065.ClassAACJava()

	fun method0(
		param0: com.android.example.module065.ClassAACJava
	) {
		for (iAb in 0..2) {
			param0.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isDisposed()

			local_var_3_0.cancel()

		}
		param0.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onNext(kotlin.Any())

		val local_var_2_2: io.reactivex.internal.util.AppendOnlyLinkedArrayList<kotlin.Any> = io.reactivex.internal.util.AppendOnlyLinkedArrayList(53)
		local_var_2_2.setFirst(kotlin.Any())

	}

	fun method1(
		param0: pkg.android.module065.BuildConfig
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.hasSubscription()

		local_var_2_1.requestMore(-8228634197247056023)

	}

	fun method2(
		param0: com.android.example.module065.ClassAAA
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.requestMore(8918370430270025898)

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}
