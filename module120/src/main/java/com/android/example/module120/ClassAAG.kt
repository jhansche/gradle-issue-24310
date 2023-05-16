package com.android.example.module120

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()
	private 	val instance_var_1_1: pkg.android.module163.BuildConfig = pkg.android.module163.BuildConfig()
	private 	val instance_var_1_2: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()
	private 	val instance_var_1_3: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()
	private 	val instance_var_1_4: com.android.example.module163.ClassAAA = com.android.example.module163.ClassAAA()

	fun method0(
		param0: com.android.example.module163.ClassAAB,
		param1: com.android.example.module163.ClassAAC,
		param2: com.android.example.module163.ClassAAC
	) {
		val local_var_2_3: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_3.approveCall("SomeString", 0)

		val local_var_2_4: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_4.approveCall("SomeString", 15)

		listOf("1", "2", "3").forEach {
			val local_var_3_0: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
			local_var_3_0.approveCall("SomeString", 69)

			val local_var_3_1: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
			local_var_3_1.approveCall("SomeString", 94)

		}
		val local_var_2_5: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_5.approveCall("SomeString", 39)

		param0.method3("SomeString")

	}

	fun method1(
		param0: pkg.android.module163.BuildConfig,
		param1: com.android.example.module163.ClassAAA,
		param2: pkg.android.module163.BuildConfig
	) {
		val local_var_2_3: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_3.approveCall("SomeString", 16)

		param1.method2("SomeString", "SomeString", "SomeString")

		val local_var_2_4: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_4.approveCall("SomeString", 24)

		param1.method1("SomeString", "SomeString", "SomeString")

	}
}
