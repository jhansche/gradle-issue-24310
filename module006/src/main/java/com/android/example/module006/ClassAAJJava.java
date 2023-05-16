package com.android.example.module006;

public class ClassAAJJava {
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_0 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2,
		io.reactivex.subscribers.TestSubscriber<Object> param3) throws Throwable {
		for (int iAb = 0; iAb < 4; iAb++) {
			for (int iAc = 0; iAc < 0; iAc++) {
				okhttp3.internal.platform.Platform local_var_4_0 = new okhttp3.internal.platform.Platform();
				local_var_4_0.getStackTraceForCloseable("SomeString");

				local_var_4_0.logCloseableLeak("SomeString", new java.lang.Object());

			}
			dagger.internal.DelegateFactory<Object> local_var_3_0 = new dagger.internal.DelegateFactory();
			local_var_3_0.get();

			dagger.internal.DelegateFactory<Object> local_var_3_1 = new dagger.internal.DelegateFactory();
			local_var_3_1.get();

		}
		dagger.internal.DelegateFactory<Object> local_var_2_4 = new dagger.internal.DelegateFactory();
		local_var_2_4.get();

	}

	public void method1(
		io.reactivex.internal.disposables.ListCompositeDisposable param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2,
		io.reactivex.subscribers.TestSubscriber<Object> param3) throws Throwable {
		param0.isDisposed();

		param0.dispose();

		dagger.internal.DelegateFactory<Object> local_var_2_4 = new dagger.internal.DelegateFactory();
		local_var_2_4.get();

		com.google.gson.JsonArray local_var_2_5 = new com.google.gson.JsonArray();
		local_var_2_5.add('C');

	}

	public void method2(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2,
		io.reactivex.subscribers.TestSubscriber<Object> param3) throws Throwable {
		okio.Pipe local_var_2_4 = new okio.Pipe(1043256879l);
		local_var_2_4.sink();

		param0.isCancelled();

		param0.assertNotSubscribed();

		com.google.gson.internal.Excluder local_var_2_5 = new com.google.gson.internal.Excluder();
		local_var_2_5.disableInnerClassSerialization();

		dagger.internal.DelegateFactory<Object> local_var_2_6 = new dagger.internal.DelegateFactory();
		local_var_2_6.get();

	}

	public void method3(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
		okhttp3.internal.platform.Platform local_var_2_2 = new okhttp3.internal.platform.Platform();
		local_var_2_2.logCloseableLeak("SomeString", new java.lang.Object());

		param0.isDisposed();

		dagger.internal.DelegateFactory<Object> local_var_2_3 = new dagger.internal.DelegateFactory();
		local_var_2_3.get();

		okhttp3.internal.http.RetryAndFollowUpInterceptor local_var_2_4 = new okhttp3.internal.http.RetryAndFollowUpInterceptor(new okhttp3.OkHttpClient(), false);
		local_var_2_4.cancel();

		param0.isDisposed();

	}

	public void method4(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
		dagger.internal.DelegateFactory<Object> local_var_2_1 = new dagger.internal.DelegateFactory();
		local_var_2_1.get();

		param0.request(-113235964l);

		dagger.internal.DelegateFactory<Object> local_var_2_2 = new dagger.internal.DelegateFactory();
		local_var_2_2.get();

		param0.assertSubscribed();

	}
}
