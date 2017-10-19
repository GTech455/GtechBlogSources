package controle.estoque.app.databases;
import android.content.*;
import android.database.*;
import android.database.sqlite.*;
import java.util.*;

public class SQLiteOpenDatabaseHelper extends SQLiteOpenHelper
{
	public final static String DATA_NAME = "database.krip8";
	public final static String DATA_PRODUCT = "product";
	public final static String DATA_ITEM_P1 = "item_p1";
	public final static String DATA_ITEM_P2 = "item_p2";
	public final static String DATA_ITEM_P3 = "item_p3";
	public final static String DATA_ITEM_P4 = "item_p4";
	public final static String DATA_ITEM_P5 = "item_p5";
	public final static String DATA_QTDE_P1 = "qtde_p1";
	public final static String DATA_QTDE_P2 = "qtde_p2";
	public final static String DATA_QTDE_P3 = "qtde_p3";
	public final static String DATA_QTDE_P4 = "qtde_p4";
	public final static String DATA_QTDE_P5 = "qtde_p5";
	public final static String DATA_FB_P1 = "fb_p1";
	public final static String DATA_FB_P2 = "fb_p2";
	public final static String DATA_FB_P3 = "fb_p3";
	public final static String DATA_FB_P4 = "fb_p4";
	public final static String DATA_FB_P5 = "fb_p5";
	public final static String DATA_VP1 = "vp1";
	public final static String DATA_VP2 = "vp2";
	public final static String DATA_VP3 = "vp3";
	public final static String DATA_VP4 = "vp4";
	public final static String DATA_VP5 = "vp5";
	public SQLiteOpenDatabaseHelper(Context c){
		super(c, DATA_NAME, null, 5);
	}
	@Override
	public void onCreate(SQLiteDatabase p1)
	{
		// TODO: Implement this method
		p1.execSQL("create table estoque ( id integer primary key autoincrement, product text, item_p1 text, item_p2 text, item_p3 text, item_p4 text, item_p5 text, qtde_p1 text, qtde_p2 text, qtde_p3 text, qtde_p4 text, qtde_p5 text, fb_p1 text, fb_p2 text, fb_p3 text, fb_p4 text, fb_p5 text, vp1 text, vp2 text, vp3 text, vp4 text, vp5 text)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase p1, int p2, int p3)
	{
		// TODO: Implement this method
	}
	public boolean insert(String product, String p1, String p2, String p3, String p4, String p5, String qp1, String qp2, String qp3, String qp4, String qp5, String fp1, String fp2, String fp3, String fp4, String fp5, String vp1, String vp2, String vp3, String vp4, String vp5){
		SQLiteDatabase db = getWritableDatabase();
		ContentValues ct = new ContentValues();
		ct.put("product", product);
		ct.put("item_p1", p1);
		ct.put("item_p2", p2);
		ct.put("item_p3", p3);
		ct.put("item_p4", p4);
		ct.put("item_p5", p5);
		ct.put("qtde_p1", qp1);
		ct.put("qtde_p2", qp2);
		ct.put("qtde_p3", qp3);
		ct.put("qtde_p4", qp4);
		ct.put("qtde_p5", qp5);
		ct.put("fb_p1", fp1);
		ct.put("fb_p2", fp2);
		ct.put("fb_p3", fp3);
		ct.put("fb_p4", fp4);
		ct.put("fb_p5", fp5);
		ct.put("vp1", vp1);
		ct.put("vp2", vp2);
		ct.put("vp3", vp3);
		ct.put("vp4", vp4);
		ct.put("vp5", vp5);
		db.insert("estoque", null, ct);
		return true;
	}
	public boolean Update(Integer id, String product, String p1, String p2, String p3, String p4, String p5, String qp1, String qp2, String qp3, String qp4, String qp5, String fp1, String fp2, String fp3, String fp4, String fp5, String vp1, String vp2, String vp3, String vp4, String vp5){
		SQLiteDatabase db = getWritableDatabase();
		ContentValues ct = new ContentValues();
		ct.put("product", product);
		ct.put("item_p1", p1);
		ct.put("item_p2", p2);
		ct.put("item_p3", p3);
		ct.put("item_p4", p4);
		ct.put("item_p5", p5);
		ct.put("qtde_p1", qp1);
		ct.put("qtde_p2", qp2);
		ct.put("qtde_p3", qp3);
		ct.put("qtde_p4", qp4);
		ct.put("qtde_p5", qp5);
		ct.put("fb_p1", fp1);
		ct.put("fb_p2", fp2);
		ct.put("fb_p3", fp3);
		ct.put("fb_p4", fp4);
		ct.put("fb_p5", fp5);
		ct.put("vp1", vp1);
		ct.put("vp2", vp2);
		ct.put("vp3", vp3);
		ct.put("vp4", vp4);
		ct.put("vp5", vp5);
		db.update("estoque", ct, "id = ?", new String[]{Integer.toString(id)});
		return true;
	}
	public Cursor getTable(int id){
		SQLiteDatabase db = getReadableDatabase();
		Cursor c = db.rawQuery("select * from estoque where id = "+id+"", null);
		return c;
	}
	public ArrayList<String> getDatabase(){
		ArrayList<String> arr = new ArrayList<String>();
		SQLiteDatabase db = getReadableDatabase();
		Cursor c = db.rawQuery("select * from estoque", null);
		c.moveToFirst();
		while(c.isAfterLast() == false){
			arr.add(c.getString(c.getColumnIndex(SQLiteOpenDatabaseHelper.DATA_PRODUCT)));
			c.moveToNext();
		}
		return arr;
	}
}
