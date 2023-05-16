package com.android.example.module072

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module120.ClassAAH = com.android.example.module120.ClassAAH()
	private 	val instance_var_1_1: pkg.android.module120.BuildConfig = pkg.android.module120.BuildConfig()

	fun method0(
		param0: com.android.example.module053.ClassAAB,
		param1: pkg.android.module053.BuildConfig
	) {
		for (iAb in 0..5) {
			listOf("1", "2", "3").forEach {
				for (iAc in 0..3) {
					val local_var_5_0: com.android.example.module163.ClassAAA = com.android.example.module163.ClassAAA()
					local_var_5_0.method0("SomeString", "SomeString", "SomeString", "SomeString")

				}
				param0.method1("SomeString", "SomeString", "SomeString")

			}
		}
		val local_var_2_2: com.android.example.module163.ClassAAC = com.android.example.module163.ClassAAC()
		local_var_2_2.method0("SomeString")

		param0.method0("SomeString", "SomeString")

		param0.method0("SomeString", "SomeString")

	}

	fun method1(
		param0: pkg.android.module120.BuildConfig,
		param1: pkg.android.module053.BuildConfig
	) {
		instance_var_1_0.method1(pkg.android.module163.BuildConfig(), com.android.example.module163.ClassAAC(), pkg.android.module163.BuildConfig())

		val local_var_2_2: com.android.example.module163.ClassAAC = com.android.example.module163.ClassAAC()
		local_var_2_2.method1("SomeString")

	}
}
