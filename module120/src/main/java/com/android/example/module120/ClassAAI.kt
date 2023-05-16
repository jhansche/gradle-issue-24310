package com.android.example.module120

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()
	private 	val instance_var_1_1: pkg.android.module163.BuildConfig = pkg.android.module163.BuildConfig()
	private 	val instance_var_1_2: pkg.android.module163.BuildConfig = pkg.android.module163.BuildConfig()

	fun method0(
		param0: com.android.example.module163.ClassAAA,
		param1: com.android.example.module163.ClassAAC
	) {
		for (iAb in 0..6) {
			param0.method2("SomeString", "SomeString", "SomeString")

			val local_var_3_0: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
			local_var_3_0.approveCall("SomeString", 77)

		}
	}

	fun method1(
		param0: com.android.example.module163.ClassAAA
	) {
		val local_var_2_1: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_1.approveCall("SomeString", 72)

		param0.method1("SomeString", "SomeString", "SomeString")

		param0.method2("SomeString", "SomeString", "SomeString")

		val local_var_2_2: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_2.approveCall("SomeString", 45)

	}

	fun method2(
		param0: com.android.example.module163.ClassAAB,
		param1: com.android.example.module163.ClassAAA,
		param2: com.android.example.module163.ClassAAC
	) {
		val local_var_2_3: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_3.approveCall("SomeString", 81)

		val local_var_2_4: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_4.approveCall("SomeString", 35)

		val local_var_2_5: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_5.approveCall("SomeString", 95)

		param0.method4("SomeString")

	}
}
