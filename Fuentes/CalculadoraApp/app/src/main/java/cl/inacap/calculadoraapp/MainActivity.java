package cl.inacap.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1Txt;
    private EditText n2Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.n1Txt = findViewById(R.id.n1Txt);
        this.n2Txt = findViewById(R.id.n2Txt);

    }

    public void sumar(View view) {
        try {
            double n1 = Double.parseDouble(this.n1Txt.getText().toString());
            double n2 = Double.parseDouble(this.n2Txt.getText().toString());
            Toast.makeText(this, "la suma es " + (n1 + n2), Toast.LENGTH_SHORT).show();
        } catch (Exception ex) {
            Toast.makeText(this, "Debe ingresar numeros", Toast.LENGTH_SHORT).show();
        }


    }

    public void restar(View view) {
        try {
            double n1 = Double.parseDouble(this.n1Txt.getText().toString());
            double n2 = Double.parseDouble(this.n2Txt.getText().toString());
            Toast.makeText(this, "la resta es " + (n1 - n2), Toast.LENGTH_SHORT).show();
        } catch (Exception ex) {
            Toast.makeText(this, "Debe ingresar numeros", Toast.LENGTH_SHORT).show();
        }


    }

    public void multiplicar(View view) {
        try {
            double n1 = Double.parseDouble(this.n1Txt.getText().toString());
            double n2 = Double.parseDouble(this.n2Txt.getText().toString());
            Toast.makeText(this, "la multiplicacion es " + (n1 * n2), Toast.LENGTH_SHORT).show();


        } catch (Exception ex) {
            Toast.makeText(this, "Debe ingresar numeros", Toast.LENGTH_SHORT).show();
        }

    }

    public void dividir(View view) {
        try {
            double n1 = Double.parseDouble(this.n1Txt.getText().toString());
            double n2 = Double.parseDouble(this.n2Txt.getText().toString());
            Toast.makeText(this, "la division es " + n1 / n2, Toast.LENGTH_SHORT).show();
        } catch (Exception ex) {
            Toast.makeText(this, "Debe ingresar numeros", Toast.LENGTH_SHORT).show();
        }

    }
}