package com.archico.suitmedia.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/archico/suitmedia/api/ApiService;", "", "getUsers", "Lretrofit2/Call;", "Lcom/archico/suitmedia/model/UserResponse;", "page", "", "perPage", "app_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.GET(value = "users")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.archico.suitmedia.model.UserResponse> getUsers(@retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "per_page")
    int perPage);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}