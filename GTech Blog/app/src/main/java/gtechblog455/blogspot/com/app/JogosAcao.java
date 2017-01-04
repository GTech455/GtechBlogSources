package gtechblog455.blogspot.com.app;
import android.*;
import android.app.*;
import android.content.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.support.v4.app.*;
import android.view.*;
import android.widget.*;
import gtechblog455.blogspot.com.app.gtech_blog_adapter_list.*;
public class JogosAcao extends ListActivity
{
	MediaPlayer md;
	Uri a;
	Intent dl;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gm);
		getWindow().setBackgroundDrawableResource(R.raw.bg);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		int[] rs = {
			R.drawable.robo,
			R.drawable.boxing,
			R.drawable.run,
			R.drawable.pika,
			R.drawable.gods,
			R.drawable.gun,
			R.drawable.furia,
			R.drawable.assassino,
			R.drawable.nova,
			R.drawable.war_robots,
			R.drawable.shotter,
			R.drawable.assassino,
			R.drawable.gunner,
			R.drawable.modern,
			R.drawable.homem_aranha,
		};
		String[] lt  = {
			"Grande robô carro batalha",
			"Boxing Champion 5-Street Fight",
			"Temple Run 2",
			"🎰 Super Pika Pharaoh💲",
			"Gods of Rome",
			"Six-Guns: Confronto de Gangues",
			"Fúria Sniper: Jogo de Tiro",
			"Assassino de Elite 3D",
			"N.O.V.A. 3: Edição Grátis",
			"War Robots",
			"SHOOTER: TRAIN COMMANDO 2017",
			"assassino atirador ultimate 17",
			"GUNNER 2017",
			"Modern Combat 5: Blackout",
			"Homem-Aranha Sem Limites",
		};
		setListAdapter(new ad(this, lt, rs));
	}
	public void ref(View v){
		MediaPlayer md = MediaPlayer.create(JogosAcao.this, R.raw.click_);
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
		md = md.create(JogosAcao.this, R.raw.click_);
		md.start();
		if(lp.toString() == "Grande robô carro batalha"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosAcao.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.dm.grand.robot.car.battle");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Boxing Champion 5-Street Fight"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosAcao.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.hsgame.boxingchampion5.gp");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Temple Run 2"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosAcao.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.imangi.templerun2");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "🎰 Super Pika Pharaoh💲"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosAcao.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.pikachu.superpharaoh");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Gods of Rome"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosAcao.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.gameloft.android.ANMP.GloftGOHM");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Six-Guns: Confronto de Gangues"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosAcao.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.gameloft.android.ANMP.GloftSXHM");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Fúria Sniper: Jogo de Tiro"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosAcao.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.gameloft.android.ANMP.GloftFWHM");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Assassino de Elite 3D"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosAcao.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.yx.sniper");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "N.O.V.A. 3: Edição Grátis"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosAcao.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.gameloft.android.ANMP.GloftNAHM");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "War Robots"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosAcao.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.pixonic.wwr");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "SHOOTER: TRAIN COMMANDO 2017"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosAcao.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.topactiongames.gunner.train.commando");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "assassino atirador ultimate 17"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosAcao.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.funcraftstudios.sniper.assasin.ultimate");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "GUNNER 2017"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosAcao.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.topactiongames.gunnerz2017");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Modern Combat 5: Blackout"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosAcao.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.gameloft.android.ANMP.GloftM5HM");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Homem-Aranha Sem Limites"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosAcao.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.gameloft.android.ANMP.GloftSIHM");
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
