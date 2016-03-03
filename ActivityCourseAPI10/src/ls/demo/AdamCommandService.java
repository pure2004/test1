package ls.demo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class AdamCommandService extends Service {
	
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
	private void helloService_1(){
		Log.i("ls log", "ok");
	}
	
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamCommandService onCreate");
		super.onCreate();
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamCommandService onDestory");
		super.onDestroy();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamCommandService onStartCommand");
		new Thread (new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				helloService_1();
			}
		}).start();

		return super.onStartCommand(intent, flags, startId);
	}

	
}
