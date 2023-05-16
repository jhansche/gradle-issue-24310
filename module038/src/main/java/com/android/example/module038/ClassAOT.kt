package com.android.example.module038

@Suppress("UNUSED_PARAMETER")
class ClassAOT {
	private 	val instance_var_1_0: com.android.example.module053.ClassAAA = com.android.example.module053.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module192.ClassAAA = com.android.example.module192.ClassAAA()

	fun method0(
		param0: com.android.example.module120.ClassAAB,
		param1: com.android.example.module192.ClassAAB,
		param2: com.android.example.module192.ClassAAA
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module028.ClassAADJava = com.android.example.module028.ClassAADJava()
			local_var_3_0.method0("SomeString", "SomeString", "SomeString", "SomeString")

			for (iAb in 0..6) {
				val local_var_4_0: com.android.example.module028.ClassAAD = com.android.example.module028.ClassAAD()
				local_var_4_0.method2("SomeString", "SomeString", "SomeString", "SomeString")

				local_var_4_0.method3("SomeString")

				val local_var_4_1: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()
				local_var_4_1.method4("SomeString")

				val local_var_4_2: com.android.example.module064.ClassAAA = com.android.example.module064.ClassAAA()
				local_var_4_2.method1(com.android.example.module028.ClassAAAJava())

			}
		}
	}

	fun method1(
		param0: pkg.android.module183.BuildConfig,
		param1: com.android.example.module131.ClassAAA,
		param2: com.android.example.module192.ClassAAB
	) {
		val local_var_2_3: com.android.example.module163.ClassAAA = com.android.example.module163.ClassAAA()
		local_var_2_3.method2("SomeString", "SomeString", "SomeString")

		val local_var_2_4: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()
		local_var_2_4.method3("SomeString")

	}

	fun method2(
		param0: com.android.example.module126.ClassAAF,
		param1: com.android.example.module094.ClassABB,
		param2: com.android.example.module135.ClassAAE,
		param3: com.android.example.module135.ClassAAE
	) {
		val local_var_2_4: com.android.example.module163.ClassAAB = com.android.example.module163.ClassAAB()
		local_var_2_4.method2("SomeString")

		val local_var_2_5: com.android.example.module028.ClassAADJava = com.android.example.module028.ClassAADJava()
		local_var_2_5.method1("SomeString", "SomeString")

		param0.method0(com.android.example.module046.ClassAAL(), com.android.example.module046.ClassAAO(), com.android.example.module046.ClassAAW())

	}

	fun method3(
		param0: com.android.example.module120.ClassAAG,
		param1: com.android.example.module173.ClassAAA
	) {
		param0.method1(pkg.android.module163.BuildConfig(), com.android.example.module163.ClassAAA(), pkg.android.module163.BuildConfig())

		param0.method0(com.android.example.module163.ClassAAB(), com.android.example.module163.ClassAAC(), com.android.example.module163.ClassAAC())

		val local_var_2_2: com.android.example.module163.ClassAAC = com.android.example.module163.ClassAAC()
		local_var_2_2.method3("SomeString")

	}

	fun method4(
		param0: com.android.example.module053.ClassAAA,
		param1: com.android.example.module135.ClassAAD
	) {
		param0.method0("SomeString", "SomeString")

		val local_var_2_2: pkg.android.module163.BuildConfig = pkg.android.module163.BuildConfig()
		
	}
}
