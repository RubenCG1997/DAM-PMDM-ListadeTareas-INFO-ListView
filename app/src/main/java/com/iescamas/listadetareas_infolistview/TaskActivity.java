package com.iescamas.listadetareas_infolistview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        showTask();
        findViewById(R.id.btn).setOnClickListener(v->finish());
    }
    private void showTask(){

        //Obtengo el el objeto mediante una clave especificado como 'task'.
        TaskModel task = (TaskModel) getIntent().getSerializableExtra("task");

        ((TextView)findViewById(R.id.lbl_task)).setText(task.getNameTask());
        ((TextView)findViewById(R.id.lbl_date)).setText(task.getDate());
        ((TextView)findViewById(R.id.lbl_time)).setText(task.getTime());
        ((TextView)findViewById(R.id.lbl_description)).setText(task.getDescription());
        ((ImageView)findViewById(R.id.imgTask)).setImageResource(task.getImage());
        ((TextView)findViewById(R.id.lbl_cat)).setText(task.getNameTask());
    }
}