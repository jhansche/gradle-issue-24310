package com.android.example.module065;

public class ClassAACJava {
	private 	io.reactivex.internal.disposables.ListCompositeDisposable instance_var_1_0 = new io.reactivex.internal.disposables.ListCompositeDisposable();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.onError(new java.lang.Throwable());

		param0.onError(new java.lang.Throwable());

		if (new java.lang.Object().equals(new java.lang.Object())) {
			param0.requestMore(497922381l);

		}
		param0.isDisposed();

	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.assertNotSubscribed();

		io.reactivex.internal.queue.SpscLinkedArrayQueue<Object> local_var_2_4 = new io.reactivex.internal.queue.SpscLinkedArrayQueue(72);
		local_var_2_4.peek();

		param0.onComplete();

	}

	public void method2(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.internal.disposables.ListCompositeDisposable param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		param0.onComplete();

	}

	public void method3(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		io.reactivex.schedulers.TestScheduler local_var_2_3 = new io.reactivex.schedulers.TestScheduler();
		local_var_2_3.createWorker();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.isCancelled();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.cancel();

	}

	public void method4(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2,
		io.reactivex.subscribers.TestSubscriber<Object> param3) throws Throwable {
		io.reactivex.observers.TestObserver<Object> local_var_2_4 = new io.reactivex.observers.TestObserver();
		local_var_2_4.hasSubscription();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.onComplete();

		io.reactivex.internal.util.LinkedArrayList local_var_2_6 = new io.reactivex.internal.util.LinkedArrayList(82);
		local_var_2_6.add(new java.lang.Object());

	}
}
