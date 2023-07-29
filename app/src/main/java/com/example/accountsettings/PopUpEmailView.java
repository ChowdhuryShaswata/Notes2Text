package com.example.accountsettings;

import Adaptors.PopUpEmailController;
import Adaptors.PopUpEmailPresenter;
import Adaptors.PopUpUsernameController;
import Adaptors.PopUpUsernamePresenter;
import UseCase.UserUpdateInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PopUpEmailView extends AppCompatActivity {

    UserUpdateInfo user = new UserUpdateInfo("ok", "ok", "ok");
    PopUpEmailController controller = new PopUpEmailController();
    PopUpEmailPresenter presenter = new PopUpEmailPresenter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_email_view);

        TextView text = (TextView) findViewById(R.id.CurrentEmail);
        EditText input = (EditText) findViewById(R.id.editTextEmail);

        presenter.showEmail(user, text);

        Button submit = (Button) findViewById(R.id.Submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast;
                if(!(input.getText().toString().equals(""))){
                    if(controller.buttonPressed(user, input, text)){
                        toast = Toast.makeText(PopUpEmailView.this, "Email Address Change Successful", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    else{
                        toast = Toast.makeText(PopUpEmailView.this, "Email Address Already Being Used", Toast.LENGTH_SHORT);
                        toast.show();
                    }

                }
            }
        });
    }
}