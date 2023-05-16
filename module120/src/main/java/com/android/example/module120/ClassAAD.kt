package com.android.example.module120

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module163.ClassAAA = com.android.example.module163.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module163.ClassAAA = com.android.example.module163.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()
	private 	val instance_var_1_3: com.android.example.module163.ClassAAA = com.android.example.module163.ClassAAA()

	fun method0(
		param0: com.android.example.module163.ClassAAB
	) {
		val local_var_2_1: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_1.approveCall("SomeString", 17)

	}

	fun method1(
		param0: pkg.android.module163.BuildConfig
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
				local_var_4_0.approveCall("SomeString", 24)

				val local_var_4_1: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
				local_var_4_1.approveCall("SomeString", 42)

			}
		} else {
			val local_var_3_0: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
			local_var_3_0.approveCall("SomeString", 18)

		}
		instance_var_1_0.method0("SomeString", "SomeString", "SomeString", "SomeString")

		instance_var_1_0.method1("SomeString", "SomeString", "SomeString")

		instance_var_1_0.method1("SomeString", "SomeString", "SomeString")

	}
}
