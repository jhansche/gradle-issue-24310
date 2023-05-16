package com.android.example.module120

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module163.ClassAAC = com.android.example.module163.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()

	fun method0(
		param0: pkg.android.module163.BuildConfig,
		param1: pkg.android.module163.BuildConfig
	) {
		instance_var_1_0.method3("SomeString")

		for (iAb in 0..1) {
			val local_var_3_0: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
			local_var_3_0.approveCall("SomeString", 34)

		}
		val local_var_2_2: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_2.approveCall("SomeString", 90)

	}

	fun method1(
		param0: com.android.example.module163.ClassAAC
	) {
		param0.method1("SomeString")

		val local_var_2_1: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_1.approveCall("SomeString", 52)

		val local_var_2_2: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_2.approveCall("SomeString", 64)

		val local_var_2_3: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_3.approveCall("SomeString", 21)

	}

	fun method2(
		param0: pkg.android.module163.BuildConfig,
		param1: com.android.example.module163.ClassAAB,
		param2: pkg.android.module163.BuildConfig
	) {
		val local_var_2_3: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_3.approveCall("SomeString", 66)

	}

	fun method3(
		param0: com.android.example.module163.ClassAAA
	) {
		val local_var_2_1: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_1.approveCall("SomeString", 0)

	}

	fun method4(
		param0: com.android.example.module163.ClassAAA
	) {
		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

	}
}
