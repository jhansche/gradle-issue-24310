package com.android.example.module094

@Suppress("UNUSED_PARAMETER")
class ClassABR {
	private 	val instance_var_1_0: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()
	private 	val instance_var_1_1: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive(true)
	private 	val instance_var_1_2: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive(false)
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: com.google.gson.GsonBuilder = com.google.gson.GsonBuilder()

	fun method0(
		param0: com.google.gson.internal.Excluder,
		param1: com.google.gson.JsonArray,
		param2: com.google.gson.JsonPrimitive
	) {
		val local_var_2_3: com.android.example.module079.ClassAAF = com.android.example.module079.ClassAAF()
		local_var_2_3.method3("SomeString", "SomeString", "SomeString")

		val local_var_2_4: com.android.example.module079.ClassAAC = com.android.example.module079.ClassAAC()
		local_var_2_4.method1("SomeString", "SomeString", "SomeString", "SomeString")

		param0.excludeFieldsWithoutExposeAnnotation()

		val local_var_2_5: com.android.example.module079.ClassAAD = com.android.example.module079.ClassAAD()
		local_var_2_5.method2("SomeString", "SomeString")

		val local_var_2_6: com.android.example.module079.ClassAAA = com.android.example.module079.ClassAAA()
		local_var_2_6.method1("SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: com.google.android.material.shape.EdgeTreatment
	) {
		param0.getEdgePath(0.03357649f, 0.6534292f, 0.84890974f, com.google.android.material.shape.ShapePath())

		val local_var_2_1: com.android.example.module079.ClassAAE = com.android.example.module079.ClassAAE()
		local_var_2_1.method4("SomeString")

		param0.getEdgePath(0.47085726f, 0.5084831f, 0.5406445f, com.google.android.material.shape.ShapePath())

	}
}
