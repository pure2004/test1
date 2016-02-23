package ls.demo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class AdamService extends Service {
	
	private void helloService(){
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(1000);
				Log.i("ls log", i+"");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}
	
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamService onDestory");
		super.onDestroy();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		new Thread (new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				helloService();
			}
		}).start();

		return super.onStartCommand(intent, flags, startId);
	}

	@Override
	public boolean onUnbind(Intent intent) {
		// TODO Auto-generated method stub
		return super.onUnbind(intent);
	}

}
