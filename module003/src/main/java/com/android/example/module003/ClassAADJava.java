package com.android.example.module003;

public class ClassAADJava {
	private 	java.lang.String instance_var_1_0 = "SomeString";
	private 	java.lang.String instance_var_1_1 = "SomeString";
	private 	java.lang.String instance_var_1_2 = "SomeString";
	private 	java.lang.String instance_var_1_3 = "SomeString";

	public void method0(
		java.lang.String param0,
		java.lang.String param1,
		java.lang.String param2,
		java.lang.String param3) throws Throwable {
		okhttp3.OkHttpClient local_var_2_4 = new okhttp3.OkHttpClient();
		local_var_2_4.followRedirects();

		local_var_2_4.retryOnConnectionFailure();

		if (new java.lang.Object().equals(new java.lang.Object())) {
			dagger.internal.DelegateFactory<Object> local_var_3_0 = new dagger.internal.DelegateFactory();
			local_var_3_0.get();

		} else {
			io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
			local_var_3_0.onNext(new java.lang.Object());

		}
		local_var_2_4.connectTimeoutMillis();

	}

	public void method1(
		java.lang.String param0) throws Throwable {
		com.google.gson.internal.Excluder local_var_2_1 = new com.google.gson.internal.Excluder();
		local_var_2_1.excludeFieldsWithoutExposeAnnotation();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.assertNotSubscribed();

	}

	public void method2(
		java.lang.String param0,
		java.lang.String param1,
		java.lang.String param2) throws Throwable {
		dagger.internal.DelegateFactory<Object> local_var_2_3 = new dagger.internal.DelegateFactory();
		local_var_2_3.get();

	}
}
