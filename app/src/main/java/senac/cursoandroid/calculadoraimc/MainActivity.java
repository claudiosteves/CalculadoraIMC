package senac.cursoandroid.calculadoraimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final float[] imc = new float[1];
        Button btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                TextView editPeso = (TextView) findViewById(R.id.editPeso);
                TextView editAltura = (TextView) findViewById(R.id.editAltura);
                TextView telaResultado = (TextView) findViewById(R.id.telaResultado);
                TextView telaDescricao = (TextView) findViewById(R.id.telaDescricao);
                int peso = Integer.parseInt(editPeso.getText().toString());
                float altura = Float.parseFloat(editAltura.getText().toString());
                imc[0] = peso / (altura * altura);
                if(imc[0]<18.5){
                    telaResultado.setText(imc[0]+"");
                    telaDescricao.setText("Abaixo do Peso");
                }else{
                    if(imc[0]<25){
                        telaResultado.setText(imc[0]+"");
                        telaDescricao.setText("Peso ideal");
                    }else{
                        if(imc[0]<30){
                            telaResultado.setText(imc[0]+"");
                            telaDescricao.setText("Sobrepeso");
                        }else{
                            telaResultado.setText(imc[0]+"");
                            telaDescricao.setText("Obesidade");
                        }

                }
            }
        }
    });
}
}
