package gtechblog455.blogspot.com.app;
import android.app.*;
import android.os.*;
import android.media.*;
import android.widget.*;
import android.content.*;
import android.net.*;
import java.util.*;
import gtechblog455.blogspot.com.app.gtech_blog_adapter_list.ad;
import android.view.*;
import android.text.method.*;
import android.support.v4.app.*;
public class gma2 extends ListActivity{
	MediaPlayer md;
	Uri a;
	Intent dl;
   public void onCreate(Bundle m) {
      super.onCreate(m);
	  setContentView(R.layout.gm2);
	   getWindow().setBackgroundDrawableResource(R.raw.bg);
	  getActionBar().setDisplayHomeAsUpEnabled(true);
	  int[] rs = {
		   R.drawable.masha_temple,
		   R.drawable.masha,
		   R.drawable.tooth,
		   R.drawable.unicorn,
		  R.drawable.captalist,
		  R.drawable.town,
		  R.drawable.rail,
		  R.drawable.thor,
		  R.drawable.valente,
		  R.drawable.evil_cogs,
		  R.drawable.badland,
		  R.drawable.lion,
		  R.drawable.ski_safari,
		  R.drawable.garfield,
		  R.drawable.garfield_adventure,
		  R.drawable.kizi,
		  R.drawable.slither,
		  R.drawable.subway,
		  R.drawable.esquadrilha,
		  R.drawable.battle_city,
		  R.drawable.ddtank,
		  R.drawable.sland,
		  R.drawable.block_crafty,
		  R.drawable.rayman,
		  R.drawable.swordigo,
		  R.drawable.angry,
		  R.drawable.palace,
		  R.drawable.rider,
		  R.drawable.pok,
		  R.drawable.friv,
		  R.drawable.temple,
		  R.drawable.pacman,
		  R.drawable.lep,
		  R.drawable.glow,
		  R.drawable.sonic_dash,
		  R.drawable.sonic,
		  R.drawable.roll,
		  R.drawable.quebra,
		  R.drawable.labirinto,
		  R.drawable.malvado,
	  };
	  String[] lt = {
		   "Masha Temple Adventure 2",
		   "Super Masha 2 Selva Mundial ★",
		   "Tooth Fairy Horse Caring",
		   "Unicorn Dash Attack",
		   "AdVenture Capitalist",
		   "Adventure Town",
		   "Rail Rush",
		   "Thor: OMS - Jogo oficial",
		   "valente aventura",
		   "Evil Cogs",
		   "BADLAND 2",
		   "Lion Kingdom",
		   "Ski Safari 2",
		   "Garfield's Defense 2",
		   "A Aventura do Garfield",
		   "Aventuras de Kizi",
		   "slither.io",
		   "Subway Surfers",
		   "Esquadrilha 1945",
		   "Battle City - Tank 1990",
		   "DDTank",
		   "Adventure Island",
		   "Block Craft 3D: Simulador Free",
		   "Rayman Adventures",
		   "Swordigo",
		   "Angry Lion Attack 3D",
		   "Aventuras no Palácio",
		   "Traffic Rider",
		   "Pokémon GO",
		   "FRIV YooB Juegos",
		   "Temple Run Aventura 2016",
		   "PAC-MAN",
		   "Lep's World 2 🍀🍀",
		   "Glow Hockey",
		   "Sonic Dash 2: Sonic Boom",
		   "Alto's Adventure",
		   "Roll The Ball: slide puzzle",
		   "Desbloquear o Quebra Cabeça",
		   "Labirinto 3D II",
		   "Meu Malvado favorito 2"
	  };
	   setListAdapter(new ad(this, lt, rs));
   }
   public void onListItemClick(ListView l, View v, int p, long id){
	   Object o = this.getListAdapter().getItem(p);
	   String lp = o.toString();
	   md = md.create(gma2.this, R.raw.click_);
	   md.start();
	   if(lp.toString() == "Masha Temple Adventure 2"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.bailaxy.masha.temple.adventure2");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Super Masha 2 Selva Mundial ★"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=suuper.macha.jungle.world");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Tooth Fairy Horse Caring"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=air.bullstudios.fairyhorsecare");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Unicorn Dash Attack"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.benmes.pony.unicorn.adventure");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "AdVenture Capitalist"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.kongregate.mobile.adventurecapitalist.google");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Adventure Town"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.supersolid.adventuretown");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Rail Rush"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.miniclip.railrush");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Thor: OMS - Jogo oficial"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.gameloft.android.ANMP.GloftTRHM");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "valente aventura"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.redgood.bravehd");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Evil Cogs"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.evil.cogs.game");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "BADLAND 2"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.frogmind.badland2.cmcm");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Lion Kingdom"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.mobi2fun.lionkingdom");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Ski Safari 2"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.sleepyzstudios.skisafari2");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Garfield's Defense 2"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.webprancer.google.garfieldDefense2");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "A Aventura do Garfield"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.webprancer.google.garfieldsAdventures");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Aventuras de Kizi"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.funtomic.kiziadventures");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "slither.io"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=air.com.hypah.io.slither");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Subway Surfers"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.kiloo.subwaysurf");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Esquadrilha 1945"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.magmamobile.game.Squadron1945");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Battle City - Tank 1990"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.tankstudio.tank1990");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "DDTank"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.proficientcity.ddtank");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Adventure Island"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.idv.bitey.iphoned");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Block Craft 3D: Simulador Free"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.fungames.blockcraft");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Rayman Adventures"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.ubisoft.raymanadventures");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Swordigo"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.touchfoo.swordigo");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Angry Lion Attack 3D"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.tapinator.lion.angry.attack3d");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Aventuras no Palácio"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=air.es.famosa.superprincesapalacio");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Traffic Rider"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.skgames.trafficrider");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Pokémon GO"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.nianticlabs.pokemongo");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "FRIV YooB Juegos"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.yoob.games");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Temple Run Aventura 2016"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.platformer.temple.adventurer.runner");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "PAC-MAN"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.namcobandaigames.pacmantournaments");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Lep's World 2 🍀🍀"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=at.ner.lepsWorld2");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Glow Hockey"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.natenai.glowhockey");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Sonic Dash 2: Sonic Boom"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.sega.sonicboomandroid");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Alto's Adventure"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.noodlecake.altosadventure");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Meu Malvado favorito 2"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.gameloft.android.ANMP.GloftDMHM");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Labirinto 3D II"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=com.mobadu.Maze2");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Desbloquear o Quebra Cabeça"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   if(h[vi].toString() == "DOWNLOAD"){
						   md = md.create(gma2.this, R.raw.click_);
						   md.start();
						   a = a.parse("https://play.google.com/store/apps/details?id=biz.mtoy.blockpuzzle.revolution");
						   dl = new Intent(dl.ACTION_VIEW, a);
						   startActivity(dl);
					   }
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Roll The Ball: slide puzzle"){
		   Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
		   final String[] h ={
			   "DOWNLOAD"
		   };
		   ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
		   AlertDialog.Builder bd = new AlertDialog.Builder(this);
		   bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
			   public void onClick(DialogInterface d, int vi){
				   if(h[vi].toString() == "DOWNLOAD"){
					   md = md.create(gma2.this, R.raw.click_);
					   md.start();
					   a = a.parse("https://play.google.com/store/apps/details?id=com.bitmango.rolltheballunrollme");
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
		MediaPlayer md = MediaPlayer.create(gma2.this, R.raw.click_);
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
