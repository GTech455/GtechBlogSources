package gtechblog455.blogspot.com.app;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.widget.*;
import android.support.v7.app.AlertDialog;
import gtechblog455.blogspot.com.app.gtech_blog_adapter_list.ad;
import java.io.*;
import android.view.*;
import android.support.v4.app.*;
public class gpc2 extends ListActivity
{
	Uri a;
	MediaPlayer md;
	Intent dl;
	AssetManager as;
	InputStream r;
	byte[] bf;
	int s;
	public void onCreate(Bundle m) {
		super.onCreate(m);
		setContentView(R.layout.gpc);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getWindow().setBackgroundDrawableResource(R.raw.bg);
		int[] rs = {
			R.drawable.mafia
		};
		String[] lt = {
			"Mafia 3",
			
		};
		setListAdapter(new ad(this, lt, rs));
	}
	String gpc1(){
		r = getResources().openRawResource(R.raw.gpc_ad_1);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	@Override
	protected void onListItemClick(ListView l, View v, int p, long id)
	{
		// TODO: Implement this method
		super.onListItemClick(l, v, p, id);
		Object o = this.getListAdapter().getItem(p);
		final String lp = o.toString();
		md = MediaPlayer.create(gpc2.this, R.raw.click_);
		md.start();
		if(lp.toString() == "Mafia 3"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.gpc);
			bd.setMessage(gpc1());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(gpc2.this, R.raw.click_);
						md.start();
						a = a.parse("http://justgetitfaster.com/mobi?k=067e4cabcfa6d95eb19a5c95431e68e1&q=Download%20Mafia%203%20PC%20Torrent");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(gpc2.this, R.raw.click_);
						md.start();
						Toast.makeText(gpc2.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
	}
	public void ref(View v){
		md = MediaPlayer.create(gpc2.this, R.raw.click_);
		md.start();
		a = a.parse("http://www.4shared.com/mobile/7WcYrbROba/gtech_blog.html");
		dl = new Intent(dl.ACTION_VIEW, a);
		startActivity(dl);
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
