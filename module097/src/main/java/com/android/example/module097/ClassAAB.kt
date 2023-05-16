package com.android.example.module097

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"
	private 	val instance_var_1_2: String = "SomeString"

	fun method0(
		param0: String
	) {
		for (iAb in 0..3) {
			for (iAc in 0..6) {
				val local_var_4_0: androidx.collection.LruCache<kotlin.Any,kotlin.Any> = androidx.collection.LruCache(68)
				local_var_4_0.snapshot()

			}
		}
	}

	fun method1(
		param0: String,
		param1: String
	) {
		val local_var_2_2: androidx.activity.OnBackPressedDispatcher = androidx.activity.OnBackPressedDispatcher()
		local_var_2_2.onBackPressed()

	}

	fun method2(
		param0: String,
		param1: String
	) {
		val local_var_2_2: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_2.approveCall("SomeString", 1)

	}

	fun method3(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_3.getCancellationSignalObject()

		local_var_2_3.cancel()

	}
}
