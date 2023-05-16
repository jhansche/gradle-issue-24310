package com.android.example.module075

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module028.ClassAAA = com.android.example.module028.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module028.ClassAAB = com.android.example.module028.ClassAAB()

	fun method0(
		param0: com.android.example.module028.ClassAAB,
		param1: com.android.example.module028.ClassAAB,
		param2: com.android.example.module028.ClassAABJava
	) {
		listOf("1", "2", "3").forEach {
			listOf("1", "2", "3").forEach {
				listOf("1", "2", "3").forEach {
					val local_var_5_0: com.android.example.module028.ClassAAC = com.android.example.module028.ClassAAC()
					local_var_5_0.method1("SomeString")

				}
			}
		}
	}

	fun method1(
		param0: com.android.example.module028.ClassAAC,
		param1: pkg.android.module028.BuildConfig
	) {
		val local_var_2_2: pkg.android.module028.BuildConfig = pkg.android.module028.BuildConfig()
		
		param0.method3("SomeString")

		val local_var_2_3: com.android.example.module028.ClassAAB = com.android.example.module028.ClassAAB()
		local_var_2_3.method2("SomeString", "SomeString")

		val local_var_2_4: com.android.example.module028.ClassAAA = com.android.example.module028.ClassAAA()
		local_var_2_4.method1("SomeString", "SomeString", "SomeString", "SomeString")

	}
}
