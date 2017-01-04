package gtechblog455.blogspot.com.app;
import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;
import android.content.res.*;
import android.media.*;
import android.text.method.*;
import java.io.*;
import gtechblog455.blogspot.com.app.gtech_blog_adapter_list.ad;
import android.text.ClipboardManager;
import android.net.*;
import android.widget.*;
import android.text.*;
import android.support.v4.app.*;
public class ct extends ListActivity {
	AssetManager as;
	InputStream r;
	byte[] bf;
	Intent dl;
	Uri a;
public void onCreate(Bundle m){
	super.onCreate(m);
	setContentView(R.layout.c);
	getWindow().setBackgroundDrawableResource(R.raw.bg);
	getActionBar().setDisplayHomeAsUpEnabled(true);
	int[] rs= {
		R.drawable.cur_yellow_miscle,
		R.drawable.cur_windows_white,
		R.drawable.cur_red_light,
		R.drawable.cur_lime_light,
		R.drawable.cur_dark_blue_with_shadow,
		R.drawable.cur_dark_blue,
		R.drawable.cur_blue,
		R.drawable.cur_indic,
		R.drawable.cur_blue_ocean,
		R.drawable.cur_pele,
		R.drawable.cur_dark_rose,
		R.drawable.cur_yellow_smoke,
		R.drawable.cur_red,
		R.drawable.cur_gray,
	};
	String[] lt = {
		"Seta amarelo misto",
		"Seta do Windows branca",
		"Seta Vermelha claro",
		"Seta Verde limo claro",
		"Seta Azul escuro com sombra",
		"Seta Azul escuro simples",
		"Seta Azul",
		"Seta Azul Índio",
		"Seta Azul Oceano",
		"Seta cor Pele",
		"Seta Rosa Escuro",
		"Seta Amarelo Queimado",
		"Seta Vermelha",
		"Seta Cinza Claro"
	};
	setListAdapter(new ad(this, lt, rs));
	}
	public void ref(View v){
		MediaPlayer md = MediaPlayer.create(ct.this, R.raw.click_);
		md.start();
		a = a.parse("http://www.4shared.com/mobile/7WcYrbROba/gtech_blog.html");
		dl = new Intent(dl.ACTION_VIEW, a);
		startActivity(dl);
	}
	public void onListItemClick(ListView l, View v, int p, long id){
		Object o = this.getListAdapter().getItem(p);
		String lp = o.toString();
		MediaPlayer nd = MediaPlayer.create(ct.this, R.raw.click_);
		nd.start();
		if(lp.toString() == "Seta amarelo misto"){
			as = getAssets();
			try{
				r = as.open("cur14");
				int size = r.available();
				bf = new byte[size];
				r.read(bf);
				r.close();
				String txt = new String(bf);
				ClipboardManager clp = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				clp.setText(txt);
				Toast.makeText(ct.this, "Pronto para colar	...", Toast.LENGTH_LONG).show();
			} catch (IOException e){
			}

		}
		if(lp.toString() == "Seta do Windows branca"){
			as = getAssets();
			try{
				r = as.open("cur13");
				int size = r.available();
				bf = new byte[size];
				r.read(bf);
				r.close();
				String txt = new String(bf);
				ClipboardManager clp = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				clp.setText(txt);
				Toast.makeText(ct.this, "Pronto para colar	...", Toast.LENGTH_LONG).show();
			} catch (IOException e){
			}

		}
		if(lp.toString() == "Seta Vermelha claro"){
			as = getAssets();
			try{
				r = as.open("cur12");
				int size = r.available();
				bf = new byte[size];
				r.read(bf);
				r.close();
				String txt = new String(bf);
				ClipboardManager clp = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				clp.setText(txt);
				Toast.makeText(ct.this, "Pronto para colar	...", Toast.LENGTH_LONG).show();
			} catch (IOException e){
			}

		}
		if(lp.toString() == "Seta Verde limo claro"){
			as = getAssets();
			try{
				r = as.open("cur11");
				int size = r.available();
				bf = new byte[size];
				r.read(bf);
				r.close();
				String txt = new String(bf);
				ClipboardManager clp = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				clp.setText(txt);
				Toast.makeText(ct.this, "Pronto para colar	...", Toast.LENGTH_LONG).show();
			} catch (IOException e){
			}

		}
		if(lp.toString() == "Seta Azul escuro com sombra"){
			as = getAssets();
			try{
				r = as.open("cur10");
				int size = r.available();
				bf = new byte[size];
				r.read(bf);
				r.close();
				String txt = new String(bf);
				ClipboardManager clp = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				clp.setText(txt);
				Toast.makeText(ct.this, "Pronto para colar	...", Toast.LENGTH_LONG).show();
			} catch (IOException e){
			}

		}
		if(lp.toString() == "Seta Azul escuro simples"){
			as = getAssets();
			try{
				r = as.open("cur9");
				int size = r.available();
				bf = new byte[size];
				r.read(bf);
				r.close();
				String txt = new String(bf);
				ClipboardManager clp = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				clp.setText(txt);
				Toast.makeText(ct.this, "Pronto para colar	...", Toast.LENGTH_LONG).show();
			} catch (IOException e){
			}

		}
		if(lp.toString() == "Seta Cinza Claro"){
			as = getAssets();
			try{
				r = as.open("cur8");
				int size = r.available();
				bf = new byte[size];
				r.read(bf);
				r.close();
				String txt = new String(bf);
				ClipboardManager clp = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				clp.setText(txt);
				Toast.makeText(ct.this, "Pronto para colar	...", Toast.LENGTH_LONG).show();
			} catch (IOException e){
			}
			
		}
		if(lp.toString() == "Seta Vermelha"){
			LayoutInflater li = getLayoutInflater();
			View view = li.inflate(R.layout.cur7, null);
			as = getAssets();
			try{
				r = as.open("cur7");
				int size = r.available();
				bf = new byte[size];
				r.read(bf);
				r.close();
				String txt = new String(bf);
				ClipboardManager clp = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				clp.setText(txt);
				Toast.makeText(ct.this, "Pronto para colar	...", Toast.LENGTH_LONG).show();
			} catch (IOException e){
			}
			
		}
		if(lp.toString() == "Seta Amarelo Queimado"){
			LayoutInflater li = getLayoutInflater();
			View view = li.inflate(R.layout.cur6, null);
			as = getAssets();
			try{
				r = as.open("cur6");
				int size = r.available();
				bf = new byte[size];
				r.read(bf);
				r.close();
				String txt = new String(bf);
				ClipboardManager clp = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				clp.setText(txt);
				Toast.makeText(ct.this, "Pronto para colar	...", Toast.LENGTH_LONG).show();
			} catch (IOException e){
			}
			
		}
		if(lp.toString() == "Seta Rosa Escuro"){
			LayoutInflater li = getLayoutInflater();
			View view = li.inflate(R.layout.cur5, null);
			as = getAssets();
			try{
				r = as.open("cur5");
				int size = r.available();
				bf = new byte[size];
				r.read(bf);
				r.close();
				String txt = new String(bf);
				ClipboardManager clp = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				clp.setText(txt);
				Toast.makeText(ct.this, "Pronto para colar	...", Toast.LENGTH_LONG).show();
			} catch (IOException e){
			}
			
		}
		if(lp.toString() == "Seta cor Pele"){
			LayoutInflater li = getLayoutInflater();
			View view = li.inflate(R.layout.cur4, null);
			as = getAssets();
			try{
				r = as.open("cur4");
				int size = r.available();
				bf = new byte[size];
				r.read(bf);
				r.close();
				String txt = new String(bf);
				ClipboardManager clp = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				clp.setText(txt);
				Toast.makeText(ct.this, "Pronto para colar	...", Toast.LENGTH_LONG).show();
			} catch (IOException e){
			}
			
		}
		if(lp.toString() == "Seta Azul Oceano"){
			LayoutInflater li = getLayoutInflater();
			View view = li.inflate(R.layout.cur3, null);
			as = getAssets();
			try{
				r = as.open("cur3");
				int size = r.available();
				bf = new byte[size];
				r.read(bf);
				r.close();
				String txt = new String(bf);
				ClipboardManager clp = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				clp.setText(txt);
				Toast.makeText(ct.this, "Pronto para colar	...", Toast.LENGTH_LONG).show();
			} catch (IOException e){
			}
			
		}
		if(lp.toString() == "Seta Azul Índio"){
			as = getAssets();
			try{
				r = as.open("cur2");
				int size = r.available();
				bf = new byte[size];
				r.read(bf);
				r.close();
				String txt = new String(bf);
				ClipboardManager clp = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				clp.setText(txt);
				Toast.makeText(ct.this, "Pronto para colar	...", Toast.LENGTH_LONG).show();
			} catch (IOException e){
			}
			
		}
		if(lp.toString() == "Seta Azul"){
			as = getAssets();
			try{
				r = as.open("cur1");
				int size = r.available();
				bf = new byte[size];
				r.read(bf);
				r.close();
				String txt = new String(bf);
				ClipboardManager clp = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				clp.setText(txt);
				Toast.makeText(ct.this, "Pronto para colar	...", Toast.LENGTH_LONG).show();
			} catch (IOException e){
			}
			
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
