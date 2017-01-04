package gtechblog455.blogspot.com.app;
import android.app.*;
import android.content.*;
import android.media.*;
import android.net.*;
import android.os.*;
import gtechblog455.blogspot.com.app.gtech_blog_adapter_list.ad;
import android.view.*;
import android.widget.*;
import android.support.v4.app.*;
public class gma6 extends ListActivity
{
	MediaPlayer md;
	Uri a;
	Intent dl;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		getWindow().setBackgroundDrawableResource(R.raw.bg);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		int[] rs = {
			R.drawable.score,
			R.drawable.mini_golf,
			R.drawable.drean_soccer,
			R.drawable.real,
			R.drawable.madden,
			R.drawable.nba,
			R.drawable.fifa,
		};
		final String[] lt = {
			"Score! Hero",
			"Mini Golf 3D City Stars Arcade",
			"Dream League Soccer",
			"Real Football",
			"Madden NFL Mobile",
			"NBA LIVE Mobile Basquete",
			"FIFA Mobile Futebol",
			
		};
		setContentView(R.layout.gm);
		setListAdapter(new ad(this, lt, rs));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id)
	{
		// TODO: Implement this method
		super.onListItemClick(l, v, position, id);
		Object o = this.getListAdapter().getItem(position);
		String lp = o.toString();
		md = md.create(gma6.this, R.raw.click_);
		md.start();
		if(lp.toString() == "Score! Hero"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma6.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.firsttouchgames.story");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Mini Golf 3D City Stars Arcade"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma6.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.MobileSportsTime.MiniGolfEldoradoGolfCourse");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Dream League Soccer"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma6.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.firsttouchgames.dls3");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Real Football"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma6.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.gameloft.android.ANMP.GloftR7HM");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Madden NFL Mobile"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma6.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.ea.game.maddenmobile15_row");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "NBA LIVE Mobile Basquete"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma6.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.ea.gp.nbamobile");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "FIFA Mobile Futebol"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma6.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.ea.gp.fifamobile");
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
