package com.archico.suitmedia;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/archico/suitmedia/ThirdActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "usersAdapter", "Lcom/archico/suitmedia/UsersAdapter;", "usersList", "", "Lcom/archico/suitmedia/model/User;", "usersRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "fetchUsers", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class ThirdActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView usersRecyclerView;
    private com.archico.suitmedia.UsersAdapter usersAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.archico.suitmedia.model.User> usersList;
    
    public ThirdActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void fetchUsers() {
    }
}