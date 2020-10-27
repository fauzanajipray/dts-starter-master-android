package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResetPassword_11330 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password_11330);
    }

    public void postChangePassword(View view) {
        Intent i = new Intent(ResetPassword_11330.this, WelcomeBack_11330.class);
        startActivity(i);
    }
}