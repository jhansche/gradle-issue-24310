package com.android.example.module095

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"
	private 	val instance_var_1_2: String = "SomeString"

	fun method0(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: androidx.collection.ArraySet<kotlin.Any> = androidx.collection.ArraySet()
		local_var_2_3.add(kotlin.Any())

		for (iAb in 0..3) {
			val local_var_3_0: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
			local_var_3_0.approveCall("SomeString", 65)

			local_var_3_0.approveCall("SomeString", 79)

			local_var_3_0.approveCall("SomeString", 76)

		}
	}

	fun method1(
		param0: String
	) {
		val local_var_2_1: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_1.postValue(kotlin.Any())

		local_var_2_1.postValue(kotlin.Any())

		val local_var_2_2: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_2.setValue(kotlin.Any())

	}

	fun method2(
		param0: String
	) {
	}
}
