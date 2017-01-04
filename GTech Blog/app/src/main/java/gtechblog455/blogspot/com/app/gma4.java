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
public class gma4 extends ListActivity
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
		int[] r = {
			R.drawable.clash_of_crime_two,
			R.drawable.clash_of_crime,
			R.drawable.aen,
			R.drawable.bicicleta,
			R.drawable.crs_classics,
			R.drawable.crs_racing,
			R.drawable.racing_car,
			R.drawable.extreme_car,
			R.drawable.alphabit,
			R.drawable.crs_racing,
			R.drawable.drift_car,
			R.drawable.lego_speed,
			R.drawable.lego_pull,
			R.drawable.real_racing,
			R.drawable.fast_racing,
			R.drawable.raging,
			R.drawable.raging_two,
		};
		String[] lt = {
			"Clash of Crime Mad City War Go",
			"Clash of Crime Mad San Andreas",
			"AEN Hill Climb Bike Race 2017",
			"Corrida em Bicicleta Livre",
			"CSR Classics",
			"CSR Racing 2",
			"Racing in Car",
			"Extreme Car Driving Simulator",
			"Asphalt 8: Airborne",
			"CSR Racing",
			"Drift car city traffic racer",
			"LEGO® Speedorz™",
			"LEGO® Pull-Back Racers 2.0",
			"Real Racing 3",
			"Fast Racing 2",
			"Raging Thunder - FREE",
			"Raging Thunder 2 - FREE",
			
		};
		setContentView(R.layout.gm);
		setListAdapter(new ad(this, lt, r));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int p, long id)
	{
		// TODO: Implement this method
		super.onListItemClick(l, v, p, id);
		Object o = this.getListAdapter().getItem(p);
		String lp = o.toString();
		md = md.create(gma4.this, R.raw.click_);
		md.start();
		if(lp.toString() == "AEN Hill Climb Bike Race 2017"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma4.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.tg.aenhillclimbbikeracer2017");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Corrida em Bicicleta Livre"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma4.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.racinggames.stunts.racing_bike.stuntss");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Clash of Crime Mad City War Go"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma4.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.CactusGames.ClashOfCrime2");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Clash of Crime Mad San Andreas"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma4.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.CactusGames.ClashOfCrime");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "CSR Classics"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma4.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.naturalmotion.csrclassics");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "CSR Racing 2"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma4.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.naturalmotion.customstreetracer2");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Racing in Car"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma4.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.ffgames.racingincar");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Extreme Car Driving Simulator"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma4.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.aim.racing");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Asphalt 8: Airborne"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma4.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.gameloft.android.ANMP.GloftA8HM");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "CSR Racing"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma4.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.naturalmotion.csrracing");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Drift car city traffic racer"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma4.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.city.drift.traffic");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "LEGO® Speedorz™"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma4.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.wb.speedorz");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "LEGO® Pull-Back Racers 2.0"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma4.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.lego.technic.race");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Real Racing 3"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma4.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.ea.games.r3_row");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Fast Racing 2"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma4.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.voltare.fast2");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Raging Thunder - FREE"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma4.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.polarbit.rthunderlite");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Raging Thunder 2 - FREE"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(gma4.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.polarbit.rthunder2lite&hl=pt_BR");
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
