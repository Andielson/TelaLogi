package com.example.andielson.telalogin;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final EditText login = (EditText) findViewById(R.id.login);
       final EditText senha = (EditText) findViewById(R.id.senha);

        Button entrar = (Button) findViewById(R.id.entrar);
        Button limpar = (Button) findViewById(R.id.limpar);

        entrar.setOnClickListener(new View.OnClickListener() {
            //   entrar.setOnClickListener(new Vie

            @Override
        public void onClick(View v){
              //  Toast.makeText(MainActivity.this,login.getText().toString(),Toast.LENGTH_SHORT).show();

                String userCerto = "usuario";
                String senhaCerta = "1234";
                String loginDigitado = login.getText().toString();
                String senhaDigitada = senha.getText().toString();

                if(loginDigitado.equals(userCerto) && senhaDigitada.equals(senhaCerta)) {

                    Toast.makeText(MainActivity.this,"Conectado com Sucesso",Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity.this,"Usuário ou Senha incorretos",Toast.LENGTH_SHORT).show();
                }


            }

        });


        limpar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                login.setText("");
                senha.setText("");
            }

             });

  }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
