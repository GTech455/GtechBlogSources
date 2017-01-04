package gtechblog455.blogspot.com.app;
import android.app.*;
import android.content.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.support.v4.app.*;
import android.view.*;
import android.widget.*;
import gtechblog455.blogspot.com.app.gtech_blog_adapter_list.ad;

public class JogosEstrategia extends ListActivity
{
	MediaPlayer md;
	Uri a;
	Intent dl;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		getWindow().setBackgroundDrawableResource(R.raw.bg);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		setContentView(R.layout.gm);
		int[] rs = {
			R.drawable.clash,
			R.drawable.strike,
		};
		String[] lt = {
			"Clash of Clans",
			"Mobile Strike",
		};
		setListAdapter(new ad(this, lt, rs));
	}
	public void ref(View v){
		MediaPlayer md = MediaPlayer.create(JogosEstrategia.this, R.raw.click_);
		md.start();
		a = a.parse("http://www.4shared.com/mobile/7WcYrbROba/gtech_blog.html");
		Intent dl = new Intent(Intent.ACTION_VIEW, a);
		startActivity(dl);
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id)
	{
		// TODO: Implement this method
		super.onListItemClick(l, v, position, id);
		Object o = this.getListAdapter().getItem(position);
		String lp = o.toString();
		md = md.create(JogosEstrategia.this, R.raw.click_);
		md.start();
		if(lp.toString() == "Mobile Strike"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosEstrategia.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.epicwaronline.ms");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Clash of Clans"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosEstrategia.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.supercell.clashofclans");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
	}
	public boolean onCreateOptionsMenu(Menu m){
		getMenuInflater().inflate(R.menu.util, m);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem i){
		switch(i.getItemId()){
			case android.R.id.home:
				NavUtils.navigateUpFromSameTask(this);
				return true;
			case R.id.fe:
				Intent fe = new Intent(Intent.ACTION_SEND);
				fe.setType("text/plain");
				fe.putExtra(Intent.EXTRA_EMAIL, new String[]
							{"dthhack@gmail.com"});
				fe.putExtra(Intent.EXTRA_SUBJECT, "Reportar Erros");
				fe.putExtra(Intent.EXTRA_TEXT, "Explique o erro...");
				startActivity(Intent.createChooser(fe, "Por favor, selecione \n seu provedor de Email e me\n envie sua sujestão..."));
				return true;
		}
		return true;
	}
}
