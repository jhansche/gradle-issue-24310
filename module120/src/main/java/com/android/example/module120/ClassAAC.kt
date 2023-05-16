package com.android.example.module120

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()

	fun method0(
		param0: com.android.example.module163.ClassAAB,
		param1: com.android.example.module163.ClassAAA,
		param2: pkg.android.module163.BuildConfig,
		param3: com.android.example.module163.ClassAAC
	) {
		val local_var_2_4: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_4.approveCall("SomeString", 19)

		for (iAb in 0..2) {
			param0.method4("SomeString")

			val local_var_3_0: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
			local_var_3_0.approveCall("SomeString", 43)

			val local_var_3_1: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
			local_var_3_1.approveCall("SomeString", 95)

			val local_var_3_2: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
			local_var_3_2.approveCall("SomeString", 36)

		}
		val local_var_2_5: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_5.approveCall("SomeString", 69)

		param0.method2("SomeString")

	}

	fun method1(
		param0: com.android.example.module163.ClassAAB,
		param1: pkg.android.module163.BuildConfig,
		param2: com.android.example.module163.ClassAAB
	) {
		val local_var_2_3: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_3.approveCall("SomeString", 23)

		val local_var_2_4: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_4.approveCall("SomeString", 11)

	}

	fun method2(
		param0: com.android.example.module163.ClassAAA
	) {
		val local_var_2_1: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_1.approveCall("SomeString", 81)

		val local_var_2_2: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_2.approveCall("SomeString", 46)

	}

	fun method3(
		param0: pkg.android.module163.BuildConfig,
		param1: com.android.example.module163.ClassAAB,
		param2: pkg.android.module163.BuildConfig
	) {
		param1.method4("SomeString")

		val local_var_2_3: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_3.approveCall("SomeString", 63)

		val local_var_2_4: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_4.approveCall("SomeString", 97)

		val local_var_2_5: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_5.approveCall("SomeString", 84)

		val local_var_2_6: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_6.approveCall("SomeString", 5)

	}
}
