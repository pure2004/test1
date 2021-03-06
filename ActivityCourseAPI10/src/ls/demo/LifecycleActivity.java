package ls.demo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LifecycleActivity extends Activity {
	
	private EditText mEditText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_lifecyccle_activity);
		
		mEditText=(EditText) findViewById(R.id.editTextState);
		
		if(savedInstanceState !=null){
			mEditText.setText(savedInstanceState.getString("lsInstanceState"));
		}
		
		Log.i("ls log", "onCreate LifecycleActivity");
		Log.i("ls log", "LifecycleActivity TaskId="+getTaskId());
		
		Button _button=(Button) findViewById(R.id.buttonStartRoseActivity);
		_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent _intent=new Intent(LifecycleActivity.this,RoseActivity.class);
				startActivity(_intent);
			}
		});
		
		Button _button2=(Button) findViewById(R.id.buttonStartPartActivity);
		_button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent _intent=new Intent(LifecycleActivity.this,FloatActivity.class);
				startActivity(_intent);
				
				
			}
			
			
		});
		
		Button _button3=(Button) findViewById(R.id.buttonDialog);
		_button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				final CharSequence[] items={"Red","Green","Blue"};
				
				AlertDialog.Builder builder=new AlertDialog.Builder(LifecycleActivity.this);
				builder.setTitle("Pick a color");
				builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						Toast.makeText(getApplicationContext(), items[which], Toast.LENGTH_SHORT).show();
					}
				});
				
				AlertDialog alert=builder.create();
				alert.show();
			}
		});
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("ls log", "onDestroy LifecycleActivity");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("ls log", "onPause LifecycleActivity");
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("ls log", "onStart LifecycleActivity");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("ls log", "onStop LifecycleActivity");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("ls log", "onResume LifecycleActivity");
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onRestoreInstanceState(savedInstanceState);
		
//		if(savedInstanceState !=null){
//			mEditText.setText(savedInstanceState.getString("lsInstanceState"));
//		}
		Log.i("ls log", "onRestoreInstanceState LifecycleActivity");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
//		super.onSaveInstanceState(outState);
		
		outState.putString("lsInstanceState", "ls"+mEditText.getText().toString());
		
		Log.i("ls log", "onSaveInstanceState LifecycleActivity");
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		super.onConfigurationChanged(newConfig);
		Log.i("ls log", "onConfigurationChanged LifecycleActivity");
		if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
			Log.i("ls log", "onConfiguration Changed to Landscape");
		}else{
			Log.i("ls log", "onConfiguration Changed to Portrate");
		}
			
	}
	
}
