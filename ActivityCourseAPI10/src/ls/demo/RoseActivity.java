package ls.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class RoseActivity extends Activity {

	Intent mIntent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		Log.i("ls log", "onCreate RoseActivity");
		
		setContentView(R.layout.layout_rose);
		
		/*String lsValue;
		mIntent=this.getIntent();
		if(mIntent != null){
			lsValue=mIntent.getExtras().getString("ls.demo.LSKEY");
			
			
			Toast.makeText(this, mIntent.getDataString(), Toast.LENGTH_SHORT).show();
		}
		
		
		Button _button=(Button) findViewById(R.id.buttonRose);
		_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				mIntent.putExtra("ls.demo.LSKEY", "Jacky ÄãºÃ");
				setResult(4321, mIntent);
				finish();
			}
		});*/
		
		Button _button=(Button) findViewById(R.id.buttonRose);
		_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mIntent=new Intent();
				mIntent.setClass(RoseActivity.this, LifecycleActivity.class);
				startActivity(mIntent);
				finish();
				Log.i("ls log", "finish RoseActivity");
			}
		});
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("ls log", "onDestroy RoseActivity");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("ls log", "onPause RoseActivity");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i("ls log", "onRestart RoseActivity");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("ls log", "onResume RoseActivity");
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("ls log", "onStart RoseActivity");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("ls log", "onStop RoseActivity");
	}

	
	
	
	
	
}
