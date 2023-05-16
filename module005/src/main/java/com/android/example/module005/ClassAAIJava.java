package com.android.example.module005;

public class ClassAAIJava {
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_0 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.disposables.SerialDisposable instance_var_1_3 = new io.reactivex.disposables.SerialDisposable();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				java.util.Collections.emptyList().forEach( lambda1 -> {
					try {
						for (int iAb = 0; iAb < 6; iAb++) {
							dagger.internal.DelegateFactory<Object> local_var_5_0 = new dagger.internal.DelegateFactory();
							local_var_5_0.get();

							dagger.internal.DelegateFactory<Object> local_var_5_1 = new dagger.internal.DelegateFactory();
							local_var_5_1.get();

						}
					} catch(Throwable e) { } // ignore
				});
			} catch(Throwable e) { } // ignore
		});
	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		param0.isDisposed();

	}
}
