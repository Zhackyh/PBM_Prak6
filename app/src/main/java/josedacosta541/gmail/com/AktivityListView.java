package josedacosta541.gmail.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
public class AktivityListView extends AppCompatActivity {

    //Todo 1 : ini adalah variabel
    Button btnKeluar;
    ListView list;

    //Todo 2 : Membuat String dengan nama maintitle yang berisi title atau nama nama yg akan ditampilkan.
    String[] maintitle ={
            "Jose da costa","Delvio Fares",
            "Leonisio Key Ximenes","Jemito Corte-Real",
            "Noe Lubada",
    };

    //Todo 3 : Membuat String dengan nama subtitle yang berisi subtitle atau email yg akan ditampilkan dibawah title.
    String[] subtitle ={
            "Josedacosta541@gmail.com","DelvioFares96@gmail.com",
            "LeonisioKey@gmail.com","JemitoCorte@gmail.com",
            "NoeLubada95@gmail.com", };

    //Todo 4 : Membuat Integer dengan nama imgid yg berfungsi untuk memangil gambar yang ada di drawable.
    Integer[] imgid={
            R.drawable.jose,R.drawable.delvio,
            R.drawable.leonisio,R.drawable.jemito,
            R.drawable.noe,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {

                // TODO 5 : Auto-generated method stub
                if(position == 0) {

                    //Todo 6 : Script untuk menampilkan Toast listView yang di klik
                    Toast.makeText(getApplicationContext(),"Josedacosta541@gmail.com",Toast.LENGTH_SHORT).show();
                }
                else if(position == 1) {
                    Toast.makeText(getApplicationContext(),"DelvioFares96gmail.com",Toast.
                            LENGTH_SHORT).show();
                }
                else if(position == 2) {
                    Toast.makeText(getApplicationContext(),"LeonisioKeygmail.com",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {
                    Toast.makeText(getApplicationContext(),"JemitoCortegmail.com",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {
                    Toast.makeText(getApplicationContext(),"NoeLubada95gmail.com",Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Todo 7 : mendeklarasikan Button Keluar sesuai id nya.
        btnKeluar = (Button) findViewById(R.id.btnKeluar);

        //Todo 8 : ketika Button Keluar di klik maka akan menampilkan/memangil intent dari class MainActivity.
        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AktivityListView.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}