package com.rizz.mandiri.assignment.core.http;

import com.rizz.mandiri.assignment.BuildConfig;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J#\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/rizz/mandiri/assignment/core/http/OkHttpClientFactory;", "", "()V", "DEFAULT_MAX_REQUEST", "", "create", "Lokhttp3/OkHttpClient;", "interceptors", "", "Lokhttp3/Interceptor;", "showDebugLog", "", "([Lokhttp3/Interceptor;Z)Lokhttp3/OkHttpClient;", "app_debug"})
public final class OkHttpClientFactory {
    private static final int DEFAULT_MAX_REQUEST = 30;
    @org.jetbrains.annotations.NotNull
    public static final com.rizz.mandiri.assignment.core.http.OkHttpClientFactory INSTANCE = null;
    
    private OkHttpClientFactory() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient create(@org.jetbrains.annotations.NotNull
    okhttp3.Interceptor[] interceptors, boolean showDebugLog) {
        return null;
    }
}