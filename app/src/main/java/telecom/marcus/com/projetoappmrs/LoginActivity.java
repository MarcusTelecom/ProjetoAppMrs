package telecom.marcus.com.projetoappmrs;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    //Recuperando os componentes do activity_main
    private AppCompatEditText editTextEmail;
    private AppCompatEditText editTextSenha;

    private TextInputLayout textInputLayoutEmail;
    private TextInputLayout textInputLayoutSenha;

    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail = (AppCompatEditText) findViewById(R.id.id_et_email);
        textInputLayoutEmail = (TextInputLayout) findViewById(R.id.id_txtlayout_email);

        editTextSenha = (AppCompatEditText) findViewById(R.id.id_et_senha);
        textInputLayoutSenha = (TextInputLayout) findViewById(R.id.id_txtlayout_senha);

        btnLogin = (Button) findViewById(R.id.id_btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateForm();
            }
        });
    }

    private void validateForm(){
        if(editTextEmail.getText().toString().isEmpty()){
            textInputLayoutEmail.setErrorEnabled(true);
            textInputLayoutEmail.setError("Preencha com seu email");
        }else {
            textInputLayoutEmail.setErrorEnabled(false);
        }

        if (editTextSenha.getText().toString().isEmpty()){
            textInputLayoutSenha.setErrorEnabled(true);
            textInputLayoutSenha.setError("Digite sua senha");
        }else {
            textInputLayoutSenha.setErrorEnabled(false);
        }
    }
}
