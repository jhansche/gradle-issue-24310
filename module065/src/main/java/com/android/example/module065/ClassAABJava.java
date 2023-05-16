package com.android.example.module065;

public class ClassAABJava {
	private 	io.reactivex.internal.util.LinkedArrayList instance_var_1_0 = new io.reactivex.internal.util.LinkedArrayList(73);
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_3 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.internal.disposables.ListCompositeDisposable param0) throws Throwable {
		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				for (int iAb = 0; iAb < 5; iAb++) {
					for (int iAc = 0; iAc < 2; iAc++) {
						param0.isDisposed();

						param0.isDisposed();

						io.reactivex.subscribers.TestSubscriber<Object> local_var_5_0 = new io.reactivex.subscribers.TestSubscriber();
						local_var_5_0.assertNotSubscribed();

						io.reactivex.internal.disposables.ListCompositeDisposable local_var_5_1 = new io.reactivex.internal.disposables.ListCompositeDisposable();
						local_var_5_1.isDisposed();

					}
					io.reactivex.subscribers.TestSubscriber<Object> local_var_4_0 = new io.reactivex.subscribers.TestSubscriber();
					local_var_4_0.request(-1581827050l);

					io.reactivex.subscribers.TestSubscriber<Object> local_var_4_1 = new io.reactivex.subscribers.TestSubscriber();
					local_var_4_1.request(55054814l);

					io.reactivex.subscribers.TestSubscriber<Object> local_var_4_2 = new io.reactivex.subscribers.TestSubscriber();
					local_var_4_2.onError(new java.lang.Throwable());

				}
				io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
				local_var_3_0.hasSubscription();

			} catch(Throwable e) { } // ignore
		});
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.onComplete();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.onNext(new java.lang.Object());

	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.internal.disposables.ListCompositeDisposable param1) throws Throwable {
		param0.assertSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.cancel();

	}

	public void method2(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2,
		io.reactivex.subscribers.TestSubscriber<Object> param3) throws Throwable {
		io.reactivex.internal.schedulers.SingleScheduler local_var_2_4 = new io.reactivex.internal.schedulers.SingleScheduler();
		local_var_2_4.start();

	}
}
