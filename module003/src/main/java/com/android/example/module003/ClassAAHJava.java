package com.android.example.module003;

public class ClassAAHJava {
	private 	java.lang.String instance_var_1_0 = "SomeString";
	private 	java.lang.String instance_var_1_1 = "SomeString";
	private 	java.lang.String instance_var_1_2 = "SomeString";

	public void method0(
		java.lang.String param0,
		java.lang.String param1,
		java.lang.String param2,
		java.lang.String param3) throws Throwable {
		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				okio.Timeout local_var_3_0 = new okio.Timeout();
				local_var_3_0.hasDeadline();

				for (int iAb = 0; iAb < 2; iAb++) {
					local_var_3_0.clearDeadline();

				}
			} catch(Throwable e) { } // ignore
		});
		com.google.gson.internal.Excluder local_var_2_4 = new com.google.gson.internal.Excluder();
		local_var_2_4.disableInnerClassSerialization();

		com.google.gson.JsonStreamParser local_var_2_5 = new com.google.gson.JsonStreamParser("SomeString");
		local_var_2_5.remove();

	}

	public void method1(
		java.lang.String param0) throws Throwable {
		okhttp3.internal.http.RetryAndFollowUpInterceptor local_var_2_1 = new okhttp3.internal.http.RetryAndFollowUpInterceptor(new okhttp3.OkHttpClient(), false);
		local_var_2_1.setCallStackTrace(new java.lang.Object());

		local_var_2_1.cancel();

		okhttp3.logging.HttpLoggingInterceptor local_var_2_2 = new okhttp3.logging.HttpLoggingInterceptor();
		local_var_2_2.getLevel();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.dispose();

	}

	public void method2(
		java.lang.String param0,
		java.lang.String param1,
		java.lang.String param2) throws Throwable {
		com.google.gson.internal.Excluder local_var_2_3 = new com.google.gson.internal.Excluder();
		local_var_2_3.excludeFieldsWithoutExposeAnnotation();

		local_var_2_3.disableInnerClassSerialization();

		com.google.gson.JsonObject local_var_2_4 = new com.google.gson.JsonObject();
		local_var_2_4.getAsJsonPrimitive("SomeString");

		io.reactivex.observers.TestObserver<Object> local_var_2_5 = new io.reactivex.observers.TestObserver();
		local_var_2_5.assertSubscribed();

	}

	public void method3(
		java.lang.String param0,
		java.lang.String param1,
		java.lang.String param2) throws Throwable {
	}

	public void method4(
		java.lang.String param0) throws Throwable {
		com.google.gson.JsonArray local_var_2_1 = new com.google.gson.JsonArray();
		local_var_2_1.deepCopy();

		okhttp3.logging.HttpLoggingInterceptor local_var_2_2 = new okhttp3.logging.HttpLoggingInterceptor();
		local_var_2_2.getLevel();

		local_var_2_1.size();

	}
}
