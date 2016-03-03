package ls.demo;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class AdamMediaService extends Service {
	private MediaPlayer mMediaPlayer;
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamMediaService onCreate");
		super.onCreate();
		mMediaPlayer=MediaPlayer.create(this, R.raw.angel);
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamMediaService onDestroy");
		super.onDestroy();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamMediaService onStartCommand");
		
		int _command;
		_command=intent.getExtras().getInt("mediacommand");
		switch (_command) {
		case 1:
			mMediaPlayer.start();
			Toast.makeText(this, "Player Start", 3000).show();
			break;
		case 2:
			mMediaPlayer.pause();
			Toast.makeText(this, "Player Pause", 3000).show();
			break;
		case 3:
			mMediaPlayer.stop();
			mMediaPlayer.release();
			Toast.makeText(this, "Player Stop", 3000).show();
			mMediaPlayer=null;
			break;
			
		default:
			break;
		}
		
		return super.onStartCommand(intent, flags, startId);
	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamMediaService onBind");
		return null;
	}

	

}
