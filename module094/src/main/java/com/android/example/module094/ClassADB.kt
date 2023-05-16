package com.android.example.module094

@Suppress("UNUSED_PARAMETER")
class ClassADB {
	private 	val instance_var_1_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_1: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive(false)
	private 	val instance_var_1_2: com.google.android.material.shape.EdgeTreatment = com.google.android.material.shape.EdgeTreatment()
	private 	val instance_var_1_3: com.google.android.material.shape.EdgeTreatment = com.google.android.material.shape.EdgeTreatment()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.schedulers.TestScheduler
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: com.android.example.module079.ClassAAE = com.android.example.module079.ClassAAE()
			local_var_3_0.method1("SomeString", "SomeString", "SomeString", "SomeString")

		} else {
			listOf("1", "2", "3").forEach {
				param0.assertSubscribed()

				val local_var_4_0: com.android.example.module079.ClassAAK = com.android.example.module079.ClassAAK()
				local_var_4_0.method2("SomeString")

			}
		}
		val local_var_2_2: com.android.example.module079.ClassAAG = com.android.example.module079.ClassAAG()
		local_var_2_2.method1("SomeString", "SomeString", "SomeString")

		val local_var_2_3: com.android.example.module079.ClassAABJava = com.android.example.module079.ClassAABJava()
		local_var_2_3.method2("SomeString", "SomeString", "SomeString")

		param0.hasSubscription()

	}

	fun method1(
		param0: okhttp3.internal.platform.Platform
	) {
		val local_var_2_1: com.android.example.module079.ClassAAA = com.android.example.module079.ClassAAA()
		local_var_2_1.method2("SomeString", "SomeString", "SomeString", "SomeString")

	}

	fun method2(
		param0: com.google.gson.internal.Excluder,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.schedulers.TestScheduler
	) {
		val local_var_2_4: com.android.example.module079.ClassAABJava = com.android.example.module079.ClassAABJava()
		local_var_2_4.method2("SomeString", "SomeString", "SomeString")

		val local_var_2_5: com.android.example.module079.ClassAAJ = com.android.example.module079.ClassAAJ()
		local_var_2_5.method0("SomeString", "SomeString", "SomeString")

		param0.excludeFieldsWithoutExposeAnnotation()

	}
}
