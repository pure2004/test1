package adam.demo.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


public class CustomViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        /*LinearLayout linearLayout=new LinearLayout(this);
        
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams 
        		(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        
       Button _button=new Button(this);
        _button.setText("Adam Button");
        setContentView(linearLayout);
        linearLayout.addView(_button);*/
       
        CustomView _custom=new CustomView(this);
        _custom.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(CustomViewActivity.this, "You click it", 3000).show();
			}
		});
        setContentView(_custom);
    }

}   
