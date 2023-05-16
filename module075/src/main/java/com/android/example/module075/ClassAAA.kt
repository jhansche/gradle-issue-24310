package com.android.example.module075

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module028.ClassAAD = com.android.example.module028.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module028.ClassAAD = com.android.example.module028.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module028.ClassAADJava = com.android.example.module028.ClassAADJava()
	private 	val instance_var_1_3: pkg.android.module028.BuildConfig = pkg.android.module028.BuildConfig()
	private 	val instance_var_1_4: com.android.example.module028.ClassAAD = com.android.example.module028.ClassAAD()

	fun method0(
		param0: com.android.example.module028.ClassAAB,
		param1: pkg.android.module028.BuildConfig,
		param2: com.android.example.module028.ClassAAD,
		param3: pkg.android.module028.BuildConfig
	) {
		for (iAb in 0..2) {
			for (iAc in 0..2) {
				for (iAd in 0..4) {
					val local_var_5_0: com.android.example.module028.ClassAAA = com.android.example.module028.ClassAAA()
					local_var_5_0.method1("SomeString", "SomeString", "SomeString", "SomeString")

					val local_var_5_1: com.android.example.module028.ClassAACJava = com.android.example.module028.ClassAACJava()
					local_var_5_1.method1("SomeString", "SomeString")

					val local_var_5_2: com.android.example.module028.ClassAABJava = com.android.example.module028.ClassAABJava()
					local_var_5_2.method1("SomeString", "SomeString")

					local_var_5_0.method1("SomeString", "SomeString", "SomeString", "SomeString")

				}
				val local_var_4_0: com.android.example.module028.ClassAAA = com.android.example.module028.ClassAAA()
				local_var_4_0.method2("SomeString")

			}
			param0.method1("SomeString")

			val local_var_3_0: com.android.example.module028.ClassAAA = com.android.example.module028.ClassAAA()
			local_var_3_0.method1("SomeString", "SomeString", "SomeString", "SomeString")

			local_var_3_0.method2("SomeString")

		}
	}

	fun method1(
		param0: pkg.android.module028.BuildConfig
	) {
		val local_var_2_1: com.android.example.module028.ClassAADJava = com.android.example.module028.ClassAADJava()
		local_var_2_1.method0("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_2: com.android.example.module028.ClassAAD = com.android.example.module028.ClassAAD()
		local_var_2_2.method3("SomeString")

		local_var_2_1.method0("SomeString", "SomeString", "SomeString", "SomeString")

	}

	fun method2(
		param0: com.android.example.module028.ClassAACJava,
		param1: com.android.example.module028.ClassAAA
	) {
		val local_var_2_2: com.android.example.module028.ClassAABJava = com.android.example.module028.ClassAABJava()
		local_var_2_2.method1("SomeString", "SomeString")

		val local_var_2_3: com.android.example.module028.ClassAACJava = com.android.example.module028.ClassAACJava()
		local_var_2_3.method2("SomeString")

	}
}
