package com.android.example.module072

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module053.ClassAAA = com.android.example.module053.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module120.ClassAAF = com.android.example.module120.ClassAAF()
	private 	val instance_var_1_2: com.android.example.module120.ClassAAH = com.android.example.module120.ClassAAH()

	fun method0(
		param0: com.android.example.module053.ClassAAB,
		param1: com.android.example.module053.ClassAAB,
		param2: com.android.example.module053.ClassAAB,
		param3: com.android.example.module120.ClassAAI
	) {
		val local_var_2_4: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()
		local_var_2_4.method2("SomeString")

		val local_var_2_5: com.android.example.module163.ClassAAC = com.android.example.module163.ClassAAC()
		local_var_2_5.method2("SomeString")

		for (iAb in 0..1) {
			val local_var_3_0: com.android.example.module163.ClassAAC = com.android.example.module163.ClassAAC()
			local_var_3_0.method2("SomeString")

		}
	}

	fun method1(
		param0: com.android.example.module120.ClassAAI,
		param1: com.android.example.module120.ClassAAE
	) {
		val local_var_2_2: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()
		local_var_2_2.method2("SomeString")

		param0.method0(com.android.example.module163.ClassAAA(), com.android.example.module163.ClassAAC())

	}

	fun method2(
		param0: com.android.example.module053.ClassAAB,
		param1: com.android.example.module053.ClassAAB,
		param2: pkg.android.module053.BuildConfig
	) {
		param0.method0("SomeString", "SomeString")

		param0.method0("SomeString", "SomeString")

	}
}
