package flapp.com.flapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginRegister extends AppCompatActivity {

    private Button mLogin, mRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);

        mLogin = (Button) findViewById(R.id.login);
        mRegister = (Button) findViewById(R.id.register);

        //Goes to the Login Activity
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginRegister.this, Login.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        //Goes to Register Activity
        //TODO: Add Verification if need be
        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginRegister.this, Registration.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
