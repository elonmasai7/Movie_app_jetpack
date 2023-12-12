package com.rizz.mandiri.assignment.core.viewModel;

import androidx.lifecycle.ViewModel;
import com.rizz.mandiri.assignment.core.presentation.UiEvent;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J1\u0010\u0012\u001a\u00020\u00132\u001e\b\u0004\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015H\u0084\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J1\u0010\u001a\u001a\u00020\u00132\u001e\b\u0004\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015H\u0084\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J<\u0010\u001b\u001a\u00020\u00132)\b\u0004\u0010\u0014\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001c\u00a2\u0006\u0002\b\u001dH\u0084\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJD\u0010\u001f\u001a\u0002H \"\u0006\b\u0002\u0010 \u0018\u00012)\b\u0004\u0010\u0014\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001c\u00a2\u0006\u0002\b\u001dH\u0084\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J7\u0010\"\u001a\u0002H \"\u0004\b\u0002\u0010 2\u001e\b\u0004\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015H\u0084H\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\u00172\u0006\u0010\n\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010%J\u001f\u0010$\u001a\u00020\u00172\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0015\u00a2\u0006\u0002\b\u001dJ\r\u0010&\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\'J\u0015\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010%J\u0006\u0010*\u001a\u00020\u0017J7\u0010+\u001a\u00020\u00132\'\u0010,\u001a#\b\u0001\u0012\u0004\u0012\u00020-\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001c\u00a2\u0006\u0002\b\u001d\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010.\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\tH\u0004JD\u0010/\u001a\u0002H \"\u0006\b\u0002\u0010 \u0018\u00012)\b\u0004\u0010\u0014\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001c\u00a2\u0006\u0002\b\u001dH\u0084H\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00061"}, d2 = {"Lcom/rizz/mandiri/assignment/core/viewModel/BaseViewModel;", "State", "ScreenEvent", "Landroidx/lifecycle/ViewModel;", "()V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_uiEventChannel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/rizz/mandiri/assignment/core/presentation/UiEvent;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiEvent", "Lkotlinx/coroutines/flow/Flow;", "getUiEvent", "()Lkotlinx/coroutines/flow/Flow;", "async", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "asyncFlow", "asyncWithState", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "asyncWithStateThenReturn", "T", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "await", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commit", "(Ljava/lang/Object;)V", "defaultState", "()Ljava/lang/Object;", "onEvent", "event", "resetState", "runOnMainThread", "cb", "Lkotlinx/coroutines/CoroutineScope;", "sendEvent", "suspendReturn", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract class BaseViewModel<State extends java.lang.Object, ScreenEvent extends java.lang.Object> extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<State> _state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<State> state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.Channel<com.rizz.mandiri.assignment.core.presentation.UiEvent> _uiEventChannel = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.rizz.mandiri.assignment.core.presentation.UiEvent> uiEvent = null;
    
    public BaseViewModel() {
        super();
    }
    
    protected abstract State defaultState();
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<State> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.rizz.mandiri.assignment.core.presentation.UiEvent> getUiEvent() {
        return null;
    }
    
    public abstract void onEvent(ScreenEvent event);
    
    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.Job sendEvent(@org.jetbrains.annotations.NotNull
    com.rizz.mandiri.assignment.core.presentation.UiEvent event) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.Job async(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.Job asyncWithState(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super State, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    protected final <T extends java.lang.Object>java.lang.Object await(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super T> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.Job asyncFlow(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job runOnMainThread(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> cb) {
        return null;
    }
    
    private final void commit(State state) {
    }
    
    public final void commit(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super State, ? extends State> state) {
    }
    
    public final void resetState() {
    }
    
    private final <T extends java.lang.Object>java.lang.Object await$$forInline(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block, kotlin.coroutines.Continuation<? super T> $completion) {
        return null;
    }
}