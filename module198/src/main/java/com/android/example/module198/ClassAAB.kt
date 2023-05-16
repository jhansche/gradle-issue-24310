package com.android.example.module198

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.internal.util.LinkedArrayList = io.reactivex.internal.util.LinkedArrayList(96)
	private 	val instance_var_1_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.assertNotSubscribed()

		for (iAb in 0..4) {
			val local_var_3_0: pkg.android.module053.BuildConfig = pkg.android.module053.BuildConfig()
			
			val local_var_3_1: com.android.example.module094.ClassADC = com.android.example.module094.ClassADC()
			local_var_3_1.method1(com.google.gson.JsonArray(), com.google.android.material.shape.EdgeTreatment(), com.google.gson.JsonStreamParser("SomeString"), io.reactivex.subscribers.TestSubscriber())

		}
	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module094.ClassAACJava = com.android.example.module094.ClassAACJava()
		local_var_2_2.method2(com.google.gson.GsonBuilder())

		val local_var_2_3: com.android.example.module079.ClassAAB = com.android.example.module079.ClassAAB()
		local_var_2_3.method0("SomeString")

	}
}
