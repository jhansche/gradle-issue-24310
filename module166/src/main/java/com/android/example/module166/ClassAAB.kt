package com.android.example.module166

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module192.ClassAAAJava = com.android.example.module192.ClassAAAJava()
	private 	val instance_var_1_1: com.android.example.module192.ClassAAB = com.android.example.module192.ClassAAB()

	fun method0(
		param0: pkg.android.module192.BuildConfig,
		param1: com.android.example.module192.ClassAAA,
		param2: com.android.example.module192.ClassAAA
	) {
		for (iAb in 0..4) {
			val local_var_3_0: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()
			local_var_3_0.method1("SomeString", "SomeString", "SomeString")

			for (iAc in 0..3) {
				val local_var_4_0: com.android.example.module163.ClassAAC = com.android.example.module163.ClassAAC()
				local_var_4_0.method4("SomeString", "SomeString", "SomeString", "SomeString")

				val local_var_4_1: com.android.example.module163.ClassAAC = com.android.example.module163.ClassAAC()
				local_var_4_1.method1("SomeString")

				val local_var_4_2: com.android.example.module163.ClassAAC = com.android.example.module163.ClassAAC()
				local_var_4_2.method2("SomeString")

			}
		}
	}

	fun method1(
		param0: com.android.example.module192.ClassAAA,
		param1: pkg.android.module192.BuildConfig,
		param2: com.android.example.module192.ClassAAB,
		param3: pkg.android.module192.BuildConfig
	) {
		param0.method1("SomeString")

		val local_var_2_4: com.android.example.module163.ClassAAA = com.android.example.module163.ClassAAA()
		local_var_2_4.method1("SomeString", "SomeString", "SomeString")

		val local_var_2_5: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()
		local_var_2_5.method2("SomeString")

	}
}
