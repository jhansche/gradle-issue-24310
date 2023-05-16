package com.android.example.module005;

public class ClassAABJava {
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_0 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.internal.disposables.ListCompositeDisposable instance_var_1_1 = new io.reactivex.internal.disposables.ListCompositeDisposable();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_3 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.internal.schedulers.SingleScheduler param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2,
		io.reactivex.subscribers.TestSubscriber<Object> param3) throws Throwable {
		param0.assertNotSubscribed();

		dagger.internal.DelegateFactory<Object> local_var_2_4 = new dagger.internal.DelegateFactory();
		local_var_2_4.get();

		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				okhttp3.internal.platform.Platform local_var_3_0 = new okhttp3.internal.platform.Platform();
				local_var_3_0.getPrefix();

				okhttp3.internal.http.RetryAndFollowUpInterceptor local_var_3_1 = new okhttp3.internal.http.RetryAndFollowUpInterceptor(new okhttp3.OkHttpClient(), false);
				local_var_3_1.isCanceled();

			} catch(Throwable e) { } // ignore
		});
	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
		dagger.internal.DelegateFactory<Object> local_var_2_2 = new dagger.internal.DelegateFactory();
		local_var_2_2.get();

		param0.request(-1778265271l);

	}

	public void method2(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
		dagger.internal.DelegateFactory<Object> local_var_2_2 = new dagger.internal.DelegateFactory();
		local_var_2_2.get();

		okhttp3.OkHttpClient local_var_2_3 = new okhttp3.OkHttpClient();
		local_var_2_3.writeTimeoutMillis();

		okhttp3.internal.publicsuffix.PublicSuffixDatabase local_var_2_4 = new okhttp3.internal.publicsuffix.PublicSuffixDatabase();
		local_var_2_4.getEffectiveTldPlusOne("SomeString");

		dagger.internal.DelegateFactory<Object> local_var_2_5 = new dagger.internal.DelegateFactory();
		local_var_2_5.get();

		okhttp3.internal.publicsuffix.PublicSuffixDatabase local_var_2_6 = new okhttp3.internal.publicsuffix.PublicSuffixDatabase();
		local_var_2_6.getEffectiveTldPlusOne("SomeString");

	}

	public void method3(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
		param0.requestMore(1956460233l);

		dagger.internal.DelegateFactory<Object> local_var_2_1 = new dagger.internal.DelegateFactory();
		local_var_2_1.get();

		okhttp3.internal.platform.Platform local_var_2_2 = new okhttp3.internal.platform.Platform();
		local_var_2_2.isCleartextTrafficPermitted("SomeString");

		param0.assertNotSubscribed();

		dagger.internal.DelegateFactory<Object> local_var_2_3 = new dagger.internal.DelegateFactory();
		local_var_2_3.get();

	}
}
