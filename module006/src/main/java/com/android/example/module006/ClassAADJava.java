package com.android.example.module006;

public class ClassAADJava {
	private 	io.reactivex.schedulers.TestScheduler instance_var_1_0 = new io.reactivex.schedulers.TestScheduler();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.internal.disposables.ListCompositeDisposable instance_var_1_2 = new io.reactivex.internal.disposables.ListCompositeDisposable();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_3 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_4 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.observers.TestObserver<Object> param0) throws Throwable {
		for (int iAb = 0; iAb < 5; iAb++) {
			dagger.internal.DelegateFactory<Object> local_var_3_0 = new dagger.internal.DelegateFactory();
			local_var_3_0.get();

			dagger.internal.DelegateFactory<Object> local_var_3_1 = new dagger.internal.DelegateFactory();
			local_var_3_1.get();

			local_var_3_0.get();

			local_var_3_0.get();

		}
		param0.assertSubscribed();

		dagger.internal.DelegateFactory<Object> local_var_2_1 = new dagger.internal.DelegateFactory();
		local_var_2_1.get();

	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.internal.disposables.ListCompositeDisposable param1) throws Throwable {
		param0.dispose();

	}

	public void method2(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.internal.disposables.ListCompositeDisposable param2,
		io.reactivex.internal.disposables.ListCompositeDisposable param3) throws Throwable {
		param0.isDisposed();

		param0.onError(new java.lang.Throwable());

		dagger.internal.DelegateFactory<Object> local_var_2_4 = new dagger.internal.DelegateFactory();
		local_var_2_4.get();

		param0.requestMore(2020854382l);

		dagger.internal.DelegateFactory<Object> local_var_2_5 = new dagger.internal.DelegateFactory();
		local_var_2_5.get();

	}
}
