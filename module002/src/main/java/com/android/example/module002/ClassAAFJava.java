package com.android.example.module002;

public class ClassAAFJava {
	private 	io.reactivex.internal.schedulers.SingleScheduler instance_var_1_0 = new io.reactivex.internal.schedulers.SingleScheduler();
	private 	io.reactivex.internal.disposables.ListCompositeDisposable instance_var_1_1 = new io.reactivex.internal.disposables.ListCompositeDisposable();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_3 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
		okhttp3.logging.HttpLoggingInterceptor local_var_2_1 = new okhttp3.logging.HttpLoggingInterceptor();
		local_var_2_1.redactHeader("SomeString");

		for (int iAb = 0; iAb < 0; iAb++) {
			okhttp3.logging.HttpLoggingInterceptor local_var_3_0 = new okhttp3.logging.HttpLoggingInterceptor();
			local_var_3_0.redactHeader("SomeString");

		}
	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.internal.schedulers.SingleScheduler param1) throws Throwable {
		param0.onNext(new java.lang.Object());

		param0.assertSubscribed();

	}
}
