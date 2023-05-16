package com.android.example.module038

@Suppress("UNUSED_PARAMETER")
class ClassAOP {
	private 	val instance_var_1_0: com.android.example.module046.ClassABE = com.android.example.module046.ClassABE()
	private 	val instance_var_1_1: com.android.example.module135.ClassAAA = com.android.example.module135.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module046.ClassABE = com.android.example.module046.ClassABE()
	private 	val instance_var_1_3: pkg.android.module183.BuildConfig = pkg.android.module183.BuildConfig()
	private 	val instance_var_1_4: com.android.example.module192.ClassAAAJava = com.android.example.module192.ClassAAAJava()

	fun method0(
		param0: com.android.example.module120.ClassAAI,
		param1: com.android.example.module192.ClassAAA
	) {
		val local_var_2_2: com.android.example.module163.ClassAAC = com.android.example.module163.ClassAAC()
		local_var_2_2.method3("SomeString")

		val local_var_2_3: pkg.android.module028.BuildConfig = pkg.android.module028.BuildConfig()
		
		param0.method2(com.android.example.module163.ClassAAB(), com.android.example.module163.ClassAAA(), com.android.example.module163.ClassAAC())

		param0.method1(com.android.example.module163.ClassAAA())

	}

	fun method1(
		param0: pkg.android.module192.BuildConfig
	) {
		val local_var_2_1: com.android.example.module064.ClassAAA = com.android.example.module064.ClassAAA()
		local_var_2_1.method0(com.android.example.module028.ClassAABJava(), pkg.android.module028.BuildConfig(), com.android.example.module028.ClassAAAJava(), com.android.example.module028.ClassAAA())

	}

	fun method2(
		param0: com.android.example.module168.ClassAAC,
		param1: com.android.example.module135.ClassAAB
	) {
		val local_var_2_2: com.android.example.module028.ClassAAD = com.android.example.module028.ClassAAD()
		local_var_2_2.method3("SomeString")

	}

	fun method3(
		param0: pkg.android.module043.BuildConfig
	) {
		val local_var_2_1: com.android.example.module064.ClassAAA = com.android.example.module064.ClassAAA()
		local_var_2_1.method1(com.android.example.module028.ClassAAAJava())

		val local_var_2_2: com.android.example.module064.ClassAAA = com.android.example.module064.ClassAAA()
		local_var_2_2.method2(com.android.example.module028.ClassAACJava(), com.android.example.module028.ClassAAD(), pkg.android.module028.BuildConfig(), pkg.android.module028.BuildConfig())

		local_var_2_1.method3(com.android.example.module028.ClassAABJava(), pkg.android.module028.BuildConfig(), com.android.example.module028.ClassAACJava(), com.android.example.module028.ClassAADJava())

	}
}
