package com.android.example.module002;

public class ClassAAAJava {
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_0 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_3 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.disposables.SerialDisposable param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2,
		io.reactivex.subscribers.TestSubscriber<Object> param3) throws Throwable {
		okhttp3.logging.HttpLoggingInterceptor local_var_2_4 = new okhttp3.logging.HttpLoggingInterceptor();
		local_var_2_4.redactHeader("SomeString");

		if (new java.lang.Object().equals(new java.lang.Object())) {
			com.google.gdata.util.common.base.PercentEscaper local_var_3_0 = new com.google.gdata.util.common.base.PercentEscaper("SomeString", true);
			local_var_3_0.escape("SomeString");

		} else {
			org.apache.commons.codec.language.DoubleMetaphone local_var_3_0 = new org.apache.commons.codec.language.DoubleMetaphone();
			local_var_3_0.isDoubleMetaphoneEqual("SomeString", "SomeString");

		}
		dagger.internal.DelegateFactory<Object> local_var_2_5 = new dagger.internal.DelegateFactory();
		local_var_2_5.get();

	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		okhttp3.logging.HttpLoggingInterceptor local_var_2_3 = new okhttp3.logging.HttpLoggingInterceptor();
		local_var_2_3.redactHeader("SomeString");

		dagger.internal.DelegateFactory<Object> local_var_2_4 = new dagger.internal.DelegateFactory();
		local_var_2_4.get();

		dagger.internal.DelegateFactory<Object> local_var_2_5 = new dagger.internal.DelegateFactory();
		local_var_2_5.get();

		org.apache.commons.codec.language.DoubleMetaphone local_var_2_6 = new org.apache.commons.codec.language.DoubleMetaphone();
		local_var_2_6.isDoubleMetaphoneEqual("SomeString", "SomeString", false);

	}

	public void method2(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
		org.apache.commons.codec.StringEncoderComparator local_var_2_2 = new org.apache.commons.codec.StringEncoderComparator();
		local_var_2_2.compare(new java.lang.Object(), new java.lang.Object());

		dagger.internal.DelegateFactory<Object> local_var_2_3 = new dagger.internal.DelegateFactory();
		local_var_2_3.get();

		okhttp3.logging.HttpLoggingInterceptor local_var_2_4 = new okhttp3.logging.HttpLoggingInterceptor();
		local_var_2_4.getLevel();

	}

	public void method3(
		io.reactivex.internal.disposables.ListCompositeDisposable param0,
		io.reactivex.internal.util.LinkedArrayList param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2,
		io.reactivex.schedulers.TestScheduler param3) throws Throwable {
		param0.dispose();

		param0.isDisposed();

		param0.clear();

		okhttp3.logging.HttpLoggingInterceptor local_var_2_4 = new okhttp3.logging.HttpLoggingInterceptor();
		local_var_2_4.redactHeader("SomeString");

		param0.isDisposed();

	}
}
