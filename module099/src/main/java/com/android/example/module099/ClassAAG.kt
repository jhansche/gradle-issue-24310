package com.android.example.module099

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"
	private 	val instance_var_1_2: String = "SomeString"
	private 	val instance_var_1_3: String = "SomeString"

	fun method0(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		for (iAb in 0..4) {
			for (iAc in 0..0) {
				listOf("1", "2", "3").forEach {
					val local_var_5_0: com.android.example.module163.ClassAAA = com.android.example.module163.ClassAAA()
					local_var_5_0.method1("SomeString", "SomeString", "SomeString")

					val local_var_5_1: com.android.example.module163.ClassAAA = com.android.example.module163.ClassAAA()
					local_var_5_1.method1("SomeString", "SomeString", "SomeString")

				}
				val local_var_4_0: com.android.example.module163.ClassAAC = com.android.example.module163.ClassAAC()
				local_var_4_0.method2("SomeString")

				val local_var_4_1: com.android.example.module163.ClassAAC = com.android.example.module163.ClassAAC()
				local_var_4_1.method2("SomeString")

				val local_var_4_2: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()
				local_var_4_2.method3("SomeString")

			}
		}
		val local_var_2_4: pkg.android.module163.BuildConfig = pkg.android.module163.BuildConfig()
		
	}

	fun method1(
		param0: String
	) {
		val local_var_2_1: pkg.android.module163.BuildConfig = pkg.android.module163.BuildConfig()
		
		val local_var_2_2: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()
		local_var_2_2.method4("SomeString")

		local_var_2_2.method2("SomeString")

	}

	fun method2(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		val local_var_2_4: pkg.android.module163.BuildConfig = pkg.android.module163.BuildConfig()
		
		val local_var_2_5: com.android.example.module163.ClassAAC = com.android.example.module163.ClassAAC()
		local_var_2_5.method0("SomeString")

		val local_var_2_6: pkg.android.module163.BuildConfig = pkg.android.module163.BuildConfig()
		
	}

	fun method3(
		param0: String,
		param1: String
	) {
		val local_var_2_2: com.android.example.module163.ClassAAC = com.android.example.module163.ClassAAC()
		local_var_2_2.method4("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_3: com.android.example.module163.ClassAAC = com.android.example.module163.ClassAAC()
		local_var_2_3.method3("SomeString")

		val local_var_2_4: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()
		local_var_2_4.method2("SomeString")

		local_var_2_2.method1("SomeString")

	}
}
