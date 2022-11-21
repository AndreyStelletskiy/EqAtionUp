package com.example.homescreen;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class quadraticequation extends AppCompatActivity {

    private EditText edA, edB, edC;
    private TextView tv, tv1, tv2, tv4;
    private String a_value, b_value, c_value, d, xx1, xx2;
    public int z = 0;
    private double dis;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadraticequation);
        tv = findViewById(R.id.textView);
        tv1 = findViewById(R.id.textView2);
        tv4 = findViewById(R.id.textView4);
    }

    public void dd(View v) {
        //получаем данные
        edA = findViewById(R.id.editTextA);
        a_value = edA.getText().toString();
        if (a_value.isEmpty()) {
            a_value = "0.0";
        }
        edB = findViewById(R.id.editTextB);
        b_value = edB.getText().toString();
        if (b_value.isEmpty()) {
            b_value = "0.0";
        }
        edC = findViewById(R.id.editTextC);
        c_value = edC.getText().toString();
        if (c_value.isEmpty()) {
            c_value = "0.0";
        }
        //переводим в double

        double a = Double.parseDouble(a_value);
        double b = Double.parseDouble(b_value);
        double c = Double.parseDouble(c_value);
        //считаем корни
        dis = b * b - 4 * a * c;
        d = Double.toString(dis);
        if (a == 0) {
            tv1.setText("Это линейное уравнениe");
            tv.setText("Корень линейного уравнения = " + -1 * c / b);
        } else {
            if (c == 0) {
                tv1.setText("x (" + a + "x + " + b + ")");
                tv.setText("Корень квадратного уравнения\n x = 0; " + (b / a));
            } else {
                if (dis >= 0) {
                    double x1 = (-1 * b - Math.sqrt(dis)) / (2 * a);
                    double x2 = (-1 * b + Math.sqrt(dis)) / (2 * a);
                    //Выводим корни
                    xx1 = String.format("%.3f", x1);
                    xx2 = String.format("%.3f", x2);

                    if (dis == 0.0) {
                        d = String.format("%.3f", dis);
                        if (xx1 != "NaN") {
                            tv1.setText("Дискриминант = " + d);
                            tv.setText("Корень квадратного уравнения\n" + xx1);
                        }
                    } else {
                        d = String.format("%.3f", dis);
                        tv1.setText("Дискриминант = " + d + "; D > 0.");
                        tv.setText("Корни квадратного уравнения\n" + xx1 + "; " + xx2);
                    }
                } else {
                    d = String.format("%.3f", dis);
                    tv1.setText("Дискриминант = " + d + "; D < 0");
                    tv.setText("Нет корней.");
                }
            }
        }
        double di = Math.sqrt(dis);
        String ddi = String.format("%.5f", di);
        if (di>=0) {
            if (a != 0) {
                if (c != 0) {
                    tv4.setText("   Подробное решение:\n" +
                            "Дискриминант = " + b + " * " + b + "- 4*" + a + " * " + c + "\n" +
                            "Дискриминант = " + d + "\n" +
                            "x1 = " + "(-" + b + "-" + ddi + ")" + "/ (2* " + a + ")\n" +
                            "x2 = " + "(-" + b + "+" + ddi + ")" + "/ (2* " + a + ")\n" +
                            "x1 = " + xx1 + "; x2 = " + xx2);
                } else {
                    tv4.setText("   Подробное решение:\n" +
                            "x(" + a + "x" + "+" + b + ") = 0\n" +
                            "x = 0; " + (b + "/" + a) + "\n" +
                            "x = 0; " + (b / a));
                }
            } else {
                tv4.setText("   Подробное решение:\n" +
                        "x = " + "-1*" + c + " / " + b + "\n" +
                        "x =" + -c / b);
            }
        }
        else{
            tv4.setText("   Подробное решение:\n" +
                    "Дискриминант = " + b + " * " + b + "- 4*" + a + " * " + c + "\n" +
                    "Дискриминант = " + d + " < 0,\nКорней нет");
        }


    }
}