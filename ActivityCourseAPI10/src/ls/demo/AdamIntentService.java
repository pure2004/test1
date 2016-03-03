package ls.demo;

import android.app.IntentService;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class AdamIntentService extends IntentService {
	
	
	
	
	
	public AdamIntentService(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public AdamIntentService(){
		super("Adam");
	}
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Log.i("ls log", "AdamIntentService onCreate");
	}
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("ls log", "AdamIntentService onDestroy");
	}
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamIntentService onStartCommand");
		return super.onStartCommand(intent, flags, startId);
	}
	@Override
	protected void onHandleIntent(Intent arg0) {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamIntentService onHandleIntent");
		
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
					Log.i("ls log", i+"");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		
	}

}
