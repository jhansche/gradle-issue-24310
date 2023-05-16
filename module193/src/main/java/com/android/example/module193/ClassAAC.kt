package com.android.example.module193

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: androidx.lifecycle.ViewModelStore = androidx.lifecycle.ViewModelStore()
	private 	val instance_var_1_1: androidx.lifecycle.ViewModelStore = androidx.lifecycle.ViewModelStore()
	private 	val instance_var_1_2: androidx.lifecycle.ViewModelStore = androidx.lifecycle.ViewModelStore()
	private 	val instance_var_1_3: androidx.lifecycle.ViewModelStore = androidx.lifecycle.ViewModelStore()

	fun method0(
		param0: androidx.lifecycle.ViewModelStore,
		param1: androidx.lifecycle.ViewModelStore
	) {
		val local_var_2_2: androidx.activity.OnBackPressedDispatcher = androidx.activity.OnBackPressedDispatcher()
		local_var_2_2.hasEnabledCallbacks()

		val local_var_2_3: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_3.cancel()

		val local_var_2_4: androidx.activity.OnBackPressedDispatcher = androidx.activity.OnBackPressedDispatcher()
		local_var_2_4.hasEnabledCallbacks()

	}

	fun method1(
		param0: androidx.lifecycle.ViewModelStore,
		param1: androidx.lifecycle.ViewModelStore,
		param2: androidx.lifecycle.ViewModelStore,
		param3: androidx.lifecycle.ViewModelStore
	) {
		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.throwIfCanceled()

		val local_var_2_5: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_5.isCanceled()

		val local_var_2_6: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_6.postValue(kotlin.Any())

		val local_var_2_7: androidx.activity.OnBackPressedDispatcher = androidx.activity.OnBackPressedDispatcher()
		local_var_2_7.onBackPressed()

		param0.clear()

	}
}
