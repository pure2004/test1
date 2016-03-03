package ls.demo;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AdamMediaServiceActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamMediaServiceActivity onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_media_service_activity);
		
		Button _buttonPlay=(Button) findViewById(R.id.buttonPlay);
		_buttonPlay.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent _intent=new Intent(AdamMediaServiceActivity.this,AdamMediaService.class);
				_intent.putExtra("mediacommand", 1);
				startService(_intent);
			}
		});
		
		
		Button _buttonPause=(Button) findViewById(R.id.buttonPause);
		_buttonPause.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent _intent=new Intent(AdamMediaServiceActivity.this,AdamMediaService.class);
				_intent.putExtra("mediacommand", 2);
				startService(_intent);
			}
		});
		
		Button _buttonStop=(Button) findViewById(R.id.buttonStop);
		_buttonStop.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent _intent=new Intent(AdamMediaServiceActivity.this,AdamMediaService.class);
				_intent.putExtra("mediacommand", 3);
				startService(_intent);
				stopService(_intent);
			}
		});
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamMediaServiceActivity onDestroy");
		super.onDestroy();
	}
	

}
