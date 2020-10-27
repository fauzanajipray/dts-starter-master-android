package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeBack_11330 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_back_11330);
    }

    public void postLogin(View view) {
        Intent i = new Intent(WelcomeBack_11330.this, SuccesActivity_11330.class);
        startActivity(i);
    }

    public void clickForgot(View view) {
        Intent i = new Intent(WelcomeBack_11330.this, ForgotPasword_11330.class);
        startActivity(i);
    }
}