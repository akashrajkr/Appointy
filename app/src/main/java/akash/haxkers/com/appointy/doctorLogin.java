package akash.haxkers.com.appointy;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class doctorLogin extends AppCompatActivity implements View.OnClickListener{

    EditText userMail,password;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_login);

        findViewById(R.id.docsubmit).setOnClickListener(this);
        userMail = findViewById(R.id.etUsermail);
        password = findViewById(R.id.etPassword);

        mAuth = FirebaseAuth.getInstance();

    }

    private  void registerLogin(){
        String email = userMail.getText().toString().trim();
        String pass = password.getText().toString().trim();

        if(email.isEmpty()){
            userMail.setError("Email is required");
            userMail.requestFocus();
            return;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            userMail.setError("Please enter valid email");
            userMail.requestFocus();
            return;
        }

        if(pass.isEmpty()){
            password.setError("Password is required");
            password.requestFocus();
            return;
        }
        if(pass.length() < 6){
            password.setError("Password should be minimum of 6 characters");
            password.requestFocus();
            return;
        }

        mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Intent intent = new Intent(doctorLogin.this, doctorActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.docsubmit:
                registerLogin();
                break;
        }
    }
}
