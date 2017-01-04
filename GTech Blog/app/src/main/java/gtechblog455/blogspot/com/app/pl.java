package gtechblog455.blogspot.com.app;
import android.app.*;
import android.os.*;
import android.content.*;
import java.util.*;
import android.widget.*;
public class pl extends Activity
{
	private ProgressBar mProgress;
	public void onCreate(Bundle m){
		super.onCreate(m);
		setContentView(R.layout.pl);
		final ProgressBar p = (ProgressBar) findViewById(R.id.pr);
		p.setMax(100);
		p.setProgress(0);
		new Thread() {
			public void run() {
				try {
					int i = 0;
					while (i <= 100) {
						sleep(200);
						i++;
						if (i % 1 == 0) {
							p.setProgress(p.getProgress() + 1);
							
						}
						
					}
					Intent ot = new Intent(pl.this, MainActivity.class);
					startActivity(ot);
					finish();
				} catch (Exception e) {
					// TODO: handle exception
					
				}

			};
		}.start();
		
	}
}
