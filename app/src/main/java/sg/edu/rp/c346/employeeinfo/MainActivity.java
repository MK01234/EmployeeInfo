package sg.edu.rp.c346.employeeinfo;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvemployee ;
    ArrayList<EmployeeList> alemplyee;
    CustomAdapter caemployee;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        lvemployee = findViewById(R.id.listViewem);

        alemplyee = new ArrayList<>();

        EmployeeList employee1 = new EmployeeList("John", "Software", 2000.90f);
        EmployeeList employee2 = new EmployeeList("May", "programmer",  2200.0f);
        alemplyee.add(employee1);
        alemplyee.add(employee2);

        caemployee = new CustomAdapter(this, R.layout.employee, alemplyee);

        lvemployee.setAdapter((ListAdapter) caemployee);


    }
}

