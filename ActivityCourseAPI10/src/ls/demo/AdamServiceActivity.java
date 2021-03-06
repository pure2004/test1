package ls.demo;


import ls.demo.AdamService.MyBinder;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class AdamServiceActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamServiceActivity onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_service_activity);
		
		Button _buttonStartCommandService=(Button) findViewById(R.id.buttonStartCommandService);
		_buttonStartCommandService.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent _Intent=new Intent(AdamServiceActivity.this,AdamService.class);
				startService(_Intent);
			}
		});
		Button _buttonStopCommandService=(Button) findViewById(R.id.buttonStopCommandService);
		_buttonStopCommandService.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent _Intent=new Intent(AdamServiceActivity.this,AdamService.class);
				stopService(_Intent);
			}
		});
		
		Button _buttonBinderService=(Button) findViewById(R.id.buttonBinderService);
		_buttonBinderService.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent _Intent=new Intent(AdamServiceActivity.this,AdamService.class);
				bindService(_Intent, conn, BIND_AUTO_CREATE);
			}
		});
		
		Button _buttonUnBinderService=(Button) findViewById(R.id.buttonUnBinderService);
		_buttonUnBinderService.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				unbindService(conn);
			}
		});
		
		Button _buttonBinderService_1=(Button) findViewById(R.id.buttonBinderService_1);
		_buttonBinderService_1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent _Intent=new Intent(AdamServiceActivity.this,AdamService.class);
				bindService(_Intent, conn_1, BIND_AUTO_CREATE);
			}
		});
		
		Button _buttonStartIntentService=(Button) findViewById(R.id.buttonStartIntentService);
		_buttonStartIntentService.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent _Intent=new Intent(AdamServiceActivity.this,AdamIntentService.class);
				startService(_Intent);
			}
		});
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamServiceActivity onDestroy");
		super.onDestroy();
	}
	
	private ServiceConnection conn=new ServiceConnection() {
		
		@Override
		public void onServiceDisconnected(ComponentName name) {
			// TODO Auto-generated method stub
			Log.i("ls log", "AdamServiceActivity onServiceDisconnected");
		}
		
		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			// TODO Auto-generated method stub
			
			String myNameString=((MyBinder)service).helloWorld("LS");
			Toast.makeText(AdamServiceActivity.this, myNameString, 3000).show();
			Log.i("ls log", "ServiceActivity onServiceConnected");
		}
	};
	private ServiceConnection conn_1=new ServiceConnection() {
		
		@Override
		public void onServiceDisconnected(ComponentName name) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			// TODO Auto-generated method stub
			
			((MyBinder)service).getService().helloService();
		}
	};
}
