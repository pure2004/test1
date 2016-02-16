package ls.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ATaskActivity extends Activity {
	
	private static int mIndex=1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_task);
		
		Log.i("ls log", "ATaskActivity:"+mIndex+"  TaskId="+getTaskId());
		++mIndex;
		Button _buttonStartA=(Button) findViewById(R.id.buttonStartA);
		_buttonStartA.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent _intent=new Intent(ATaskActivity.this, ATaskActivity.class);
				startActivity(_intent);
			}
		});
		
		Button _buttonStartB=(Button) findViewById(R.id.buttonStartB);
		_buttonStartB.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent _intent=new Intent(ATaskActivity.this, BTaskActivity.class);
				startActivity(_intent);
			}
		});
	}
	
}
