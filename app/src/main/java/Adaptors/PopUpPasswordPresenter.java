package Adaptors;

import UseCase.UserUpdateInfo;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class PopUpPasswordPresenter extends AppCompatActivity {


    public PopUpPasswordPresenter(){}

    public boolean showPasswordChange(UserUpdateInfo user, EditText input, EditText input2){
        input.setText("");
        input2.setText("");
        return true;
    }
    public boolean showPasswordFail(UserUpdateInfo user, EditText input, EditText input2){
        input.setText("");
        input2.setText("");
        return false;
    }
}
