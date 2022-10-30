package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenDialog(View view) {
        // instanciando caida de dialogo
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        // cancelando caixa de dialogo caso o app tenha que ter uma resposta
        // dialog.setCancelable(false);
        // por padrao esssa opcao esta true e o usuario pode nao clicar em uma opcao
        // mas deixando como false, obrigamos o usuario a escolher algo

        //configurando icone
        dialog.setIcon(android.R.drawable.btn_star_big_on);

        // configurando dialog
        dialog.setTitle("Primeiro Dialog");
        dialog.setMessage("Mensagem da Dialog");

        //configurando acoes do dialog
        dialog.setPositiveButton("Aceito", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(
                        getApplicationContext(),
                        "Executar acao ao clicar no botao Aceito",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
        dialog.setNegativeButton("Discordo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(
                        getApplicationContext(),
                        "Executar acao ao clicar no botao discordo",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        // criar e exibir dialog
        dialog.create();
        dialog.show();
    }
}