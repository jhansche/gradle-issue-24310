package com.android.example.module006;

public class ClassAAKJava {
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_0 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.internal.disposables.ListCompositeDisposable instance_var_1_2 = new io.reactivex.internal.disposables.ListCompositeDisposable();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_3 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_4 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
		if (new java.lang.Object().equals(new java.lang.Object())) {
			java.util.Collections.emptyList().forEach( lambda0 -> {
				try {
					if (new java.lang.Object().equals(new java.lang.Object())) {
						okhttp3.ConnectionPool local_var_5_0 = new okhttp3.ConnectionPool();
						local_var_5_0.connectionCount();

					}
					com.google.gson.JsonArray local_var_4_0 = new com.google.gson.JsonArray();
					local_var_4_0.add("SomeString");

				} catch(Throwable e) { } // ignore
			});
		} else {
			dagger.internal.DelegateFactory<Object> local_var_3_0 = new dagger.internal.DelegateFactory();
			local_var_3_0.get();

		}
		param0.isDisposed();

	}

	public void method1(
		io.reactivex.observers.TestObserver<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
		okhttp3.ConnectionPool local_var_2_2 = new okhttp3.ConnectionPool();
		local_var_2_2.idleConnectionCount();

		param0.isDisposed();

	}

	public void method2(
		io.reactivex.internal.disposables.ListCompositeDisposable param0) throws Throwable {
		param0.clear();

		okhttp3.internal.platform.Platform local_var_2_1 = new okhttp3.internal.platform.Platform();
		local_var_2_1.getStackTraceForCloseable("SomeString");

	}
}
