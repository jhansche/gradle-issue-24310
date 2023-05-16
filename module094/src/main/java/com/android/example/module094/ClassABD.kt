package com.android.example.module094

@Suppress("UNUSED_PARAMETER")
class ClassABD {
	private 	val instance_var_1_0: okhttp3.internal.platform.Platform = okhttp3.internal.platform.Platform()
	private 	val instance_var_1_1: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive(false)
	private 	val instance_var_1_2: com.google.android.material.shape.EdgeTreatment = com.google.android.material.shape.EdgeTreatment()

	fun method0(
		param0: io.reactivex.observers.TestObserver<kotlin.Any>,
		param1: com.google.android.material.shape.EdgeTreatment,
		param2: com.google.gson.JsonArray
	) {
		param0.assertNotSubscribed()

		param0.hasSubscription()

		for (iAb in 0..2) {
			param0.dispose()

			param0.isCancelled()

			val local_var_3_0: com.android.example.module079.ClassAAB = com.android.example.module079.ClassAAB()
			local_var_3_0.method1("SomeString", "SomeString", "SomeString")

			val local_var_3_1: com.android.example.module079.ClassAAB = com.android.example.module079.ClassAAB()
			local_var_3_1.method0("SomeString")

		}
		param0.assertNotSubscribed()

		val local_var_2_3: com.android.example.module079.ClassAAA = com.android.example.module079.ClassAAA()
		local_var_2_3.method3("SomeString", "SomeString")

	}

	fun method1(
		param0: io.reactivex.internal.schedulers.ComputationScheduler,
		param1: com.google.gson.internal.Excluder
	) {
		param0.createWorker()

		val local_var_2_2: com.android.example.module079.ClassAAI = com.android.example.module079.ClassAAI()
		local_var_2_2.method1("SomeString", "SomeString")

		val local_var_2_3: com.android.example.module079.ClassAAI = com.android.example.module079.ClassAAI()
		local_var_2_3.method3("SomeString", "SomeString")

		val local_var_2_4: com.android.example.module079.ClassAABJava = com.android.example.module079.ClassAABJava()
		local_var_2_4.method1("SomeString", "SomeString", "SomeString")

		param0.shutdown()

	}
}
