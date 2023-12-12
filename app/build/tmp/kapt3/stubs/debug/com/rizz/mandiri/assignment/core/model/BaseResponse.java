package com.rizz.mandiri.assignment.core.model;

import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lcom/rizz/mandiri/assignment/core/model/BaseResponse;", "", "()V", "isSuccessful", "", "()Z", "setSuccessful", "(Z)V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "statusCode", "getStatusCode", "setStatusCode", "app_debug"})
public class BaseResponse {
    @com.google.gson.annotations.SerializedName(value = "success")
    private boolean isSuccessful = false;
    @com.google.gson.annotations.SerializedName(value = "status_message")
    @org.jetbrains.annotations.NotNull
    private java.lang.String message;
    @com.google.gson.annotations.SerializedName(value = "status_code")
    @org.jetbrains.annotations.NotNull
    private java.lang.String statusCode;
    
    public BaseResponse() {
        super();
    }
    
    public final boolean isSuccessful() {
        return false;
    }
    
    public final void setSuccessful(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStatusCode() {
        return null;
    }
    
    public final void setStatusCode(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}