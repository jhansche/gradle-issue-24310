package com.android.example.module011;

public class ClassACDJava {
	private 	pkg.android.module010.BuildConfig instance_var_1_0 = new pkg.android.module010.BuildConfig();
	private 	pkg.android.module010.BuildConfig instance_var_1_1 = new pkg.android.module010.BuildConfig();
	private 	pkg.android.module010.BuildConfig instance_var_1_2 = new pkg.android.module010.BuildConfig();
	private 	com.android.example.module079.ClassAAJ instance_var_1_3 = new com.android.example.module079.ClassAAJ();

	public void method0(
		com.android.example.module079.ClassAAB param0,
		com.android.example.module079.ClassAAE param1,
		com.android.example.module079.ClassAAA param2,
		com.android.example.module079.ClassAAE param3) throws Throwable {
		dagger.internal.DelegateFactory<Object> local_var_2_4 = new dagger.internal.DelegateFactory();
		local_var_2_4.get();

		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				dagger.internal.DelegateFactory<Object> local_var_3_0 = new dagger.internal.DelegateFactory();
				local_var_3_0.get();

				local_var_3_0.get();

			} catch(Throwable e) { } // ignore
		});
	}

	public void method1(
		pkg.android.module079.BuildConfig param0,
		com.android.example.module010.ClassAAA param1,
		com.android.example.module079.ClassAABJava param2,
		com.android.example.module010.ClassAAB param3) throws Throwable {
		param1.method1("SomeString", "SomeString");

		dagger.internal.DelegateFactory<Object> local_var_2_4 = new dagger.internal.DelegateFactory();
		local_var_2_4.get();

	}

	public void method2(
		com.android.example.module079.ClassAAC param0,
		com.android.example.module010.ClassAAA param1) throws Throwable {
		param0.method1("SomeString", "SomeString", "SomeString", "SomeString");

		androidx.lifecycle.MethodCallsLogger local_var_2_2 = new androidx.lifecycle.MethodCallsLogger();
		local_var_2_2.approveCall("SomeString", 6);

		androidx.lifecycle.MethodCallsLogger local_var_2_3 = new androidx.lifecycle.MethodCallsLogger();
		local_var_2_3.approveCall("SomeString", 75);

		dagger.internal.DelegateFactory<Object> local_var_2_4 = new dagger.internal.DelegateFactory();
		local_var_2_4.get();

	}
}
