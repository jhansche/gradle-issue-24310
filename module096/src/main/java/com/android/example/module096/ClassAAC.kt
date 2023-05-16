package com.android.example.module096

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: okhttp3.OkHttpClient = okhttp3.OkHttpClient()

	fun method0(
		param0: okhttp3.internal.http.RetryAndFollowUpInterceptor,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.streamAllocation()

		val local_var_2_2: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive(false)
		local_var_2_2.getAsByte()

		val local_var_2_3: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive(true)
		local_var_2_3.getAsCharacter()

		val local_var_2_4: com.google.gson.JsonArray = com.google.gson.JsonArray()
		local_var_2_4.get(4)

		val local_var_2_5: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive(true)
		local_var_2_5.hashCode()

	}

	fun method1(
		param0: okhttp3.ConnectionPool,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.connectionCount()

	}
}
