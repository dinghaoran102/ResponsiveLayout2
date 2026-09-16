package com.example.responsivelayout2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
android:layout_width="match_parent"
android:layout_height="match_parent">

    <!-- 顶部标题 -->
    <TextView
android:id="@+id/tvLab1"
android:layout_width="0dp"
android:layout_height="0dp"
android:background="#000000"
android:text="Lab 1"
android:textColor="#FFFFFF"
android:textSize="20sp"
android:gravity="center"
app:layout_constraintTop_toTopOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHeight_weight="1"
app:layout_constraintVertical_weight="1" />

    <!-- 白色区域 -->
    <TextView
android:id="@+id/tvResponsive"
android:layout_width="0dp"
android:layout_height="0dp"
android:background="#FFFFFF"
android:text="Responsive Layout 1"
android:textColor="#000000"
android:textSize="18sp"
android:gravity="center"
app:layout_constraintTop_toBottomOf="@id/tvLab1"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHeight_weight="2"
app:layout_constraintVertical_weight="2" />

    <!-- 彩色方块行 -->
    <LinearLayout
android:id="@+id/colorRow"
android:layout_width="0dp"
android:layout_height="0dp"
android:orientation="horizontal"
app:layout_constraintTop_toBottomOf="@id/tvResponsive"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHeight_weight="1.5"
app:layout_constraintVertical_weight="1.5">

        <!-- 四个 TextView 同上，使用 0dp + weight=1 -->
    </LinearLayout>

    <!-- 黑色区域 -->
    <TextView
android:id="@+id/tvAndroidApp"
android:layout_width="0dp"
android:layout_height="0dp"
android:background="#000000"
android:text="Android Application"
android:textColor="#FFFFFF"
android:textSize="18sp"
android:gravity="center"
app:layout_constraintTop_toBottomOf="@id/colorRow"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHeight_weight="2"
app:layout_constraintVertical_weight="2" />

    <!-- 底部按钮行 -->
    <LinearLayout
android:id="@+id/buttonRow"
android:layout_width="0dp"
android:layout_height="0dp"
android:orientation="horizontal"
android:gravity="center"
android:background="#FFFFFF"
app:layout_constraintTop_toBottomOf="@id/tvAndroidApp"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintHeight_weight="1"
app:layout_constraintVertical_weight="1">

        <!-- 两个 Button 同上 -->
    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>