package Adaptors;

import UseCase.UserUpdateInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PopUpUsernamePresenter extends AppCompatActivity {

    public PopUpUsernamePresenter(){}

    public void showUsername(UserUpdateInfo user, TextView text){
        text.setText(user.getUsername());
    }
    public boolean showNewUsername(UserUpdateInfo user, TextView text, EditText input){
        text.setText(user.getUsername());
        input.setText("");
        return true;
    }
    public boolean showUsernameError(UserUpdateInfo user, TextView text, EditText input){
        input.setText("");
        return false;
    }
}
