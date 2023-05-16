package com.android.example.module056

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"

	fun method0(
		param0: String,
		param1: String
	) {
		val local_var_2_2: com.android.example.module163.ClassAAA = com.android.example.module163.ClassAAA()
		local_var_2_2.method2("SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: String
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module120.ClassAAB = com.android.example.module120.ClassAAB()
			local_var_3_0.method0(pkg.android.module163.BuildConfig(), pkg.android.module163.BuildConfig())

		}
		val local_var_2_1: com.android.example.module120.ClassAAI = com.android.example.module120.ClassAAI()
		local_var_2_1.method1(com.android.example.module163.ClassAAA())

		val local_var_2_2: com.android.example.module120.ClassAAC = com.android.example.module120.ClassAAC()
		local_var_2_2.method2(com.android.example.module163.ClassAAA())

		val local_var_2_3: com.android.example.module120.ClassAAD = com.android.example.module120.ClassAAD()
		local_var_2_3.method1(pkg.android.module163.BuildConfig())

	}

	fun method2(
		param0: String
	) {
		val local_var_2_1: com.android.example.module120.ClassAAB = com.android.example.module120.ClassAAB()
		local_var_2_1.method2(pkg.android.module163.BuildConfig(), com.android.example.module163.ClassAAA(), com.android.example.module163.ClassAAB(), pkg.android.module163.BuildConfig())

		val local_var_2_2: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()
		local_var_2_2.method3("SomeString")

		val local_var_2_3: com.android.example.module163.ClassAAC = com.android.example.module163.ClassAAC()
		local_var_2_3.method1("SomeString")

		local_var_2_1.method2(pkg.android.module163.BuildConfig(), com.android.example.module163.ClassAAA(), com.android.example.module163.ClassAAB(), pkg.android.module163.BuildConfig())

	}
}
