package gtechblog455.blogspot.com.app;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.media.*;
import gtechblog455.blogspot.com.app.gtech_blog_adapter_list.ad;
import android.content.*;
import android.text.method.*;
import android.net.*;
import android.view.View.*;
import android.support.v4.app.*;
public class gma extends ListActivity{
	Uri a;
	MediaPlayer md;
	Intent dl;
	int s;
   public void onCreate(Bundle m) {
	   super.onCreate(m);
	   setContentView(R.layout.gm);
	   getWindow().setBackgroundDrawableResource(R.raw.bg);
	   getActionBar().setDisplayHomeAsUpEnabled(true);
	   int[] rs = {
		   R.drawable.jewel_journey,
		   R.drawable.frenesi,
		   R.drawable.blossom,
		   R.drawable.bubble_witch,
		   R.drawable.troll,
		   R.drawable.jewels_star,
		   R.drawable.jewel_star,
		   R.drawable.cascade,
		   R.drawable.febre,
		   R.drawable.conecte,
		   R.drawable.jogos,
		   R.drawable.moy,
		   R.drawable.moy_crazy,
		   R.drawable.moy_four,
		   R.drawable.moy_three,
		   R.drawable.moy_two,
		   R.drawable.moy_one,
		   R.drawable.egypt,
		   R.drawable.bubble_shooter,
		   R.drawable.farm,
		   R.drawable.coin,
		   R.drawable.crafty,
		   R.drawable.cr,
		   R.drawable.arma,
		   R.drawable.chef,
		   R.drawable.pair,
		   R.drawable.jelly,
		   R.drawable.nibblers,
		   R.drawable.frutas,
		   R.drawable.jam,
		   R.drawable.pop,
		   R.drawable.toy,
		   R.drawable.deluxe,
		   R.drawable.digger,
		   R.drawable.candy_crush,
		   R.drawable.boom,
		   R.drawable.heroes,
		   R.drawable.bubble,
		   R.drawable.blast,
	   };
	   String[] lt = {
		   "Jewel Journey",
		   "Frenesi de doces - Candy Mania",
		   "Blossom Blast Saga",
		   "Bubble Witch 2 Saga",
		   "Troll Face Quest Video Games",
		   "Jewels Star 3",
		   "Jewel Star 2017",
		   "Cascade",
		   "Febre doces",
		   "Conecte Matching Game 2014",
		   "jogos de correspondência",
		   "Moy 🍔 Restaurante Chef",
		   "Moy Crazy Doctor",
		   "Moy 4 🐙 Jogo Bichinho Virtual",
		   "Moy 3 🐙 Jogo Bichinho Virtual",
		   "Moy 2 🐙 Jogo Bichinho Virtual",
		   "Moy 🐙 Jogo Bichinho Virtual",
		   "Egypt Pop Bubble Shooter",
		   "Bubble Shooter",
		   "Farm Heroes Saga",
		   "Candy Coin Carnival",
		   "Crafty Candy",
		   "Jogo de Correspondência:frutas",
		   "Arma de bolhas",
		   "chef cozinha cozinhar: jogo 3",
		   "Find My Pair 3",
		   "Candy Crush Jelly Saga",
		   "Fruit Nibblers",
		   "Correspondência de frutas",
		   "Cookie Jam",
		   "Panda Pop",
		   "Toy Blast",
		   "Candy Deluxe 2015",
		   "Diamond Digger Saga",
		   "Candy Crush Saga",
		   "Candy Boom",
		   "Candy Heroes Mania",
		   "Bubble Crush Challenge",
		   "Jelly Blast"
	   };
	   setListAdapter(new ad(this, lt, rs));
    }
	public void onListItemClick(ListView l, View v, int p, long id){
		Object o = this.getListAdapter().getItem(p);
		String lp = o.toString();
		md = md.create(gma.this, R.raw.click_);
		md.start();
		if(lp.toString() == "Jewel Journey"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.jeweljourney.blastjewel");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Frenesi de doces - Candy Mania"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.appgame7.candyfrenzy");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Blossom Blast Saga"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.king.blossomblast");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Bubble Witch 2 Saga"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.midasplayer.apps.bubblewitchsaga2");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Troll Face Quest Video Games"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=air.com.spilgames.TrollFaceQuestVideoGames");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Jewels Star 3"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.game.JewelsStar3");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Jewel Star 2017"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.kakarotkung.Jewels.Star2017");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Cascade"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.bigfishgames.cascadef2p.google");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Febre doces"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.mobileguru.candyfever.free");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Conecte Matching Game 2014"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=king.connectgamegiaitri");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "jogos de correspondência"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=amazing.matching.game");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Moy 🍔 Restaurante Chef"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.frojo.cooking.android");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Moy Crazy Doctor"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.frojo.doctor");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Moy 4 🐙 Jogo Bichinho Virtual"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.frojo.moy4.android");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Moy 3 🐙 Jogo Bichinho Virtual"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.frojo.moy3.android");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Moy 2 🐙 Jogo Bichinho Virtual"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.frojo.moy2");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Moy 🐙 Jogo Bichinho Virtual"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.frojo.virtualpet");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Egypt Pop Bubble Shooter"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=egypt.bubble");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Bubble Shooter"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=bubbleshooter.orig");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Farm Heroes Saga"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.mss.coin.party.candy.mania.saga.google");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Candy Coin Carnival"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.mss.coin.party.candy.mania.saga.google");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Crafty Candy"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.outplayentertainment.candywitch");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Jogo de Correspondência:frutas"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=jogode.correspondencia.fruta");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Arma de bolhas"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=bubble.shooter.shooting.shoot.game");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "chef cozinha cozinhar: jogo 3"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.vg.chefkitchencookingmatch3");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Find My Pair 3"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.kidseduplay.findmypair3");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Candy Crush Jelly Saga"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.king.candycrushjellysaga");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Fruit Nibblers"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.rovio.Nibblers");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Correspondência de frutas"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=game.funny.matching.fruit");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Cookie Jam"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=air.com.sgn.cookiejam.gp");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Panda Pop"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.sgn.pandapop.gp");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Toy Blast"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=net.peakgames.amy");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Jelly Blast"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.jellyblast.cmcm&hl=pt-br&referrer=utm_source%3Dgoogle%26utm_medium%3Dorganic%26utm_term%3Djelly+blast&pcampaignid=APPU_1_wfJMVv7RO4WbwQTws7DIBw");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Bubble Crush Challenge"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=personcorp.bubble&referrer=utm_source%3Dgoogle%26utm_medium%3Dorganic%26utm_term%3Dbubble+crush+challenge&pcampaignid=APPU_1_ufhMVqyXLIP7wgSkibfwCg");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Candy Heroes Mania"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.candy.amzheroesmania&hl=pt_BR&referrer=utm_source%3Dgoogle%26utm_medium%3Dorganic%26utm_term%3Dcandy+heroes+mania&pcampaignid=APPU_1_GvlMVofkI4LBwASBv6CoDA");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Candy Boom"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.evast.candyboom&hl=pt_BR&referrer=utm_source%3Dgoogle%26utm_medium%3Dorganic%26utm_term%3Dcandy+boom&pcampaignid=APPU_1_HvxMVqiPHIeZwgTKrKiwAw");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Candy Crush Saga"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.king.candycrushsaga&hl=pt_BR&referrer=utm_source%3Dgoogle%26utm_medium%3Dorganic%26utm_term%3Dcandy+crush+saga&pcampaignid=APPU_1_WqtNVoCgDYHTwASB67SQDg");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Diamond Digger Saga"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(lt[vi].toString() == "DOWNLOAD"){
							md = md.create(gma.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.midasplayer.apps.diamonddiggersaga");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Candy Deluxe 2015"){
			Toast.makeText(gma.this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] lt = {
				"DOWNLOAD"
			};
			ArrayAdapter as = new ArrayAdapter(gma.this, R.layout.dl, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(as, 0, new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface d, int vi){
					if(lt[vi].toString() == "DOWNLOAD"){
						md = md.create(gma.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.ltnhsoft.CandyDeluxe");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				}
			});
			bd.create();
			bd.show();
		}
	}
	public void ref(View v){
		MediaPlayer md = MediaPlayer.create(gma.this, R.raw.click_);
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
