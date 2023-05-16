package com.android.example.module006;

public class ClassAAGJava {
	private 	io.reactivex.observers.TestObserver<Object> instance_var_1_0 = new io.reactivex.observers.TestObserver();
	private 	io.reactivex.internal.disposables.ListCompositeDisposable instance_var_1_1 = new io.reactivex.internal.disposables.ListCompositeDisposable();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		param0.assertSubscribed();

		if (new java.lang.Object().equals(new java.lang.Object())) {
			dagger.internal.DelegateFactory<Object> local_var_3_0 = new dagger.internal.DelegateFactory();
			local_var_3_0.get();

		} else {
			param0.onNext(new java.lang.Object());

		}
		dagger.internal.DelegateFactory<Object> local_var_2_3 = new dagger.internal.DelegateFactory();
		local_var_2_3.get();

		param0.cancel();

		dagger.internal.DelegateFactory<Object> local_var_2_4 = new dagger.internal.DelegateFactory();
		local_var_2_4.get();

	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.internal.disposables.ListCompositeDisposable param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		param0.isCancelled();

		dagger.internal.DelegateFactory<Object> local_var_2_3 = new dagger.internal.DelegateFactory();
		local_var_2_3.get();

	}
}
