package Adaptors;

import UseCase.UserUpdateInfo;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class PopUpPasswordController extends AppCompatActivity {
    PopUpPasswordPresenter presenter = new PopUpPasswordPresenter();
    public PopUpPasswordController(){}

    public boolean buttonPressed(UserUpdateInfo user, EditText input, EditText input2){
        if (user.getPassword().equals(input.getText().toString())){
            user.changePassowrd(input2.getText().toString());
            return presenter.showPasswordChange(user, input, input2);
        }
        return presenter.showPasswordFail(user, input, input2);
    }
}
