package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ForgotPasword_11330 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pasword_11330);
    }

    public void postSentRequest(View view) {
        Intent i = new Intent(ForgotPasword_11330.this, ResetPassword_11330.class);
        startActivity(i);
    }
}