package com.android.example.module005;

public class ClassAACJava {
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_0 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		okhttp3.ConnectionPool local_var_2_3 = new okhttp3.ConnectionPool();
		local_var_2_3.evictAll();

		param0.assertSubscribed();

		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				dagger.internal.DelegateFactory<Object> local_var_3_0 = new dagger.internal.DelegateFactory();
				local_var_3_0.get();

			} catch(Throwable e) { } // ignore
		});
		param0.cancel();

		dagger.internal.DelegateFactory<Object> local_var_2_4 = new dagger.internal.DelegateFactory();
		local_var_2_4.get();

	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		okio.Timeout local_var_2_3 = new okio.Timeout();
		local_var_2_3.waitUntilNotified(new java.lang.Object());

		okhttp3.ConnectionPool local_var_2_4 = new okhttp3.ConnectionPool();
		local_var_2_4.connectionCount();

	}
}
