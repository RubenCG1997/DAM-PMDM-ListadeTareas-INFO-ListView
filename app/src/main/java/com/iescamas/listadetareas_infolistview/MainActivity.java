package com.iescamas.listadetareas_infolistview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<TaskModel>list=LoadTask();
        ((ListView) findViewById(R.id.lvTask)).setAdapter(new Adapter(this,list));
        ((ListView)findViewById(R.id.lvTask)).setOnItemClickListener((adapterView, view, i, l) -> {
            Intent intent = new Intent(getApplicationContext(),TaskActivity.class);
            //Con este método me llevo mi objeto tarea al intent especificado por su posicion en el array
            //Especifico la clave 'task' para poder obtenerlo en el otro intent
            intent.putExtra("task",list.get(i));
            startActivity(intent);
        });

    }

    private ArrayList<TaskModel> LoadTask(){
        ArrayList<TaskModel>list = new ArrayList<>();
        TaskModel task1 = new TaskModel();
        TaskModel task2 = new TaskModel();
        TaskModel task3 = new TaskModel();
        TaskModel task4 = new TaskModel();
        TaskModel task5 = new TaskModel();
        TaskModel task6 = new TaskModel();
        TaskModel task7 = new TaskModel();

        task1.setImage(R.drawable.futbol);
        task1.setNameTask("Fútbol");
        task1.setDescription("Un futbito con los chavales");
        task1.setDate("11/12/24");
        task1.setTime("22:00");
        list.add(task1);

        task2.setImage(R.drawable.baloncesto);
        task2.setNameTask("Baloncesto");
        task2.setDescription("Partido benéfico");
        task2.setDate("16/10/24");
        task2.setTime("16:30");
        list.add(task2);

        task3.setImage(R.drawable.rugby);
        task3.setNameTask("Rugby");
        task3.setDescription("Inglaterra vs Escocia");
        task3.setDate("25/09/26");
        task3.setTime("13:10");
        list.add(task3);

        task4.setImage(R.drawable.taekwondo);
        task4.setNameTask("Taekwondo");
        task4.setDescription("Campeonato nacional");
        task4.setDate("20/10/24");
        task4.setTime("18:50");
        list.add(task4);

        task5.setImage(R.drawable.tenis);
        task5.setNameTask("Tenis");
        task5.setDescription("Rafael Nadal vs Roger Federer");
        task5.setDate("01/12/08");
        task5.setTime("16:30");
        list.add(task5);

        task6.setImage(R.drawable.tiroconarco);
        task6.setNameTask("Tiro con arco");
        task6.setDescription("Cuidado con el ojo");
        task6.setDate("22/10/25");
        task6.setTime("19:16");
        list.add(task6);

        task7.setImage(R.drawable.waterpolo);
        task7.setNameTask("Waterpolo");
        task7.setDescription("El agua está fresquita");
        task7.setDate("25/06/28");
        task7.setTime("12:50");
        list.add(task7);


        return list;
    }
}