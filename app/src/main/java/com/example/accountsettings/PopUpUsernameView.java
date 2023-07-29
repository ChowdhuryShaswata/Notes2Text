package com.example.accountsettings;

import Adaptors.PopUpUsernameController;
import Adaptors.PopUpUsernamePresenter;
import UseCase.UserUpdateInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

public class PopUpUsernameView extends SettingsActivity {

    UserUpdateInfo user = new UserUpdateInfo("ok", "ok", "ok");
    PopUpUsernameController controller = new PopUpUsernameController();
    PopUpUsernamePresenter presenter = new PopUpUsernamePresenter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_username_view);

        TextView text = (TextView) findViewById(R.id.CurrentUsername);
        EditText input = (EditText) findViewById(R.id.editTextTextPersonName);

        presenter.showUsername(user, text);

        Button submit = (Button) findViewById(R.id.Submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast;
                if(!(input.getText().toString().equals(""))){

                    if (controller.buttonPressed(user, input, text)){
                        toast = Toast.makeText(PopUpUsernameView.this, "Username Change Successful", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    else{
                        toast = Toast.makeText(PopUpUsernameView.this, "Username Already Being Used", Toast.LENGTH_SHORT);
                        toast.show();
                    }

                }
            }
        });

    }
}