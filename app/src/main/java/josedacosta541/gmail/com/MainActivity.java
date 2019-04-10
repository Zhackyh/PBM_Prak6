package josedacosta541.gmail.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Todo 1 : ini adalah variabel
    Button btn1;
    EditText user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Todo 2 : mendeklarasikan EditText dan Button dengan id nya masin masin.
        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        btn1 = (Button) findViewById(R.id.btnLogin);
        btn1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        //Todo 3 : jika kolom username kosong maka akan menampilkan Toast "Masukkan Uernama".
        if (user.getText().length()==0){
            Toast.makeText(MainActivity.this, "Masukkan username", Toast.LENGTH_SHORT).show();

        //Todo 4 : jika kolom Password kosong maka akan menampilkan Toast "Masukkan Password".
        }else if (pass.getText().length()==0){
            Toast.makeText(MainActivity.this, "Masukkan password", Toast.LENGTH_SHORT).show();
        }else{
            login();
        }
    }

    public void login(){

        //Todo 5 : jika username dan password benar maka akan menampilkan intent Variabel i yang akan memangil class AktivityListView.
        if(user.getText().toString().equals("jose")&&pass.getText().toString().equals("165410036")){
            Intent i = new Intent(this, AktivityListView.class);
            startActivity(i);

        //Todo 6 : jika username dan password Salah maka akan menampilkan Toast "Username atau Password Salah!".
        }else {
            Toast.makeText(MainActivity.this, "Username atau Password Salah!", Toast.LENGTH_SHORT).show();
        }
                }

        //Todo 7 : jika Button Resister di klik maka akan menampilkan intent variabel intent yang akan memangil class Register.
        public void Register (View view){
            Intent intent = new Intent(MainActivity.this, Register.class);
            startActivity(intent);
        }
    }