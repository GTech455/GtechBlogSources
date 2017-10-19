package controle.estoque.app;
import android.app.*;
import android.database.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import controle.estoque.app.databases.*;
import android.content.*;

public class EstoqueManager extends Activity
{
SQLiteOpenDatabaseHelper db;
TextView tvP;
TextView tvQ;
TextView tvF;
TextView tvV;
EditText p;
EditText p1;
EditText p2;
EditText p3;
EditText p4;
EditText p5;
EditText pq1;
EditText pq2;
EditText pq3;
EditText pq4;
EditText pq5;
EditText f1;
EditText f2;
EditText f3;
EditText f4;
EditText f5;
EditText v1;
EditText v2;
EditText v3;
EditText v4;
EditText v5;
int update = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.controle_estoque);
		db = new SQLiteOpenDatabaseHelper(this);
		tvP = (TextView) findViewById(R.id.tvprod);
		tvQ = (TextView) findViewById(R.id.tvquant);
		tvF = (TextView) findViewById(R.id.tvfb);
		tvV = (TextView) findViewById(R.id.tvvp);
		p = (EditText) findViewById(R.id.product);
		p1 = (EditText) findViewById(R.id.op1);
		p2 = (EditText) findViewById(R.id.op2);
		p3 = (EditText) findViewById(R.id.op3);
		p4 = (EditText) findViewById(R.id.op4);
		p5 = (EditText) findViewById(R.id.op5);
		pq1 = (EditText) findViewById(R.id.qtde1);
		pq2 = (EditText) findViewById(R.id.qtde2);
		pq3 = (EditText) findViewById(R.id.qtde3);
		pq4 = (EditText) findViewById(R.id.qtde4);
		pq5 = (EditText) findViewById(R.id.qtde5);
		f1 = (EditText) findViewById(R.id.f1);
		f2 = (EditText) findViewById(R.id.f2);
		f3 = (EditText) findViewById(R.id.f3);
		f4 = (EditText) findViewById(R.id.f4);
		f5 = (EditText) findViewById(R.id.f5);
		v1 = (EditText) findViewById(R.id.v1);
		v2 = (EditText) findViewById(R.id.v2);
		v3 = (EditText) findViewById(R.id.v3);
		v4 = (EditText) findViewById(R.id.v4);
		v5 = (EditText) findViewById(R.id.v5);
		Bundle b = getIntent().getExtras();
		if(b !=null){
			int value = b.getInt("id");
			if(value>0){
				Cursor c = db.getTable(value);
				update = value;
				c.moveToFirst();
				String prod = c.getString(c.getColumnIndex(db.DATA_PRODUCT));
				String op1 = c.getString(c.getColumnIndex(db.DATA_ITEM_P1));
				String op2 = c.getString(c.getColumnIndex(db.DATA_ITEM_P2));
				String op3 = c.getString(c.getColumnIndex(db.DATA_ITEM_P3));
				String op4 = c.getString(c.getColumnIndex(db.DATA_ITEM_P4));
				String op5 = c.getString(c.getColumnIndex(db.DATA_ITEM_P5));
				String qop1 = c.getString(c.getColumnIndex(db.DATA_QTDE_P1));
				String qop2 = c.getString(c.getColumnIndex(db.DATA_QTDE_P2));
				String qop3 = c.getString(c.getColumnIndex(db.DATA_QTDE_P3));
				String qop4 = c.getString(c.getColumnIndex(db.DATA_QTDE_P4));
				String qop5 = c.getString(c.getColumnIndex(db.DATA_QTDE_P5));
				String fop1 = c.getString(c.getColumnIndex(db.DATA_FB_P1));
				String fop2 = c.getString(c.getColumnIndex(db.DATA_FB_P2));
				String fop3 = c.getString(c.getColumnIndex(db.DATA_FB_P3));
				String fop4 = c.getString(c.getColumnIndex(db.DATA_FB_P4));
				String fop5 = c.getString(c.getColumnIndex(db.DATA_FB_P5));
				String vop1 = c.getString(c.getColumnIndex(db.DATA_VP1));
				String vop2 = c.getString(c.getColumnIndex(db.DATA_VP2));
				String vop3 = c.getString(c.getColumnIndex(db.DATA_VP3));
				String vop4 = c.getString(c.getColumnIndex(db.DATA_VP4));
				String vop5 = c.getString(c.getColumnIndex(db.DATA_VP5));
				if(!c.isClosed()){
					c.close();
				}
				setTitle("Abrir Cadastro");
				p.setText(prod);
				p1.setText(op1);
				p2.setText(op2);
				p3.setText(op3);
				p4.setText(op4);
				p5.setText(op5);
				pq1.setText(qop1);
				pq2.setText(qop2);
				pq3.setText(qop3);
				pq4.setText(qop4);
				pq5.setText(qop5);
				f1.setText(fop1);
				f2.setText(fop2);
				f3.setText(fop3);
				f4.setText(fop4);
				f5.setText(fop5);
				v1.setText(vop1);
				v2.setText(vop2);
				v3.setText(vop3);
				v4.setText(vop4);
				v5.setText(vop5);
				if(!p1.getText().toString().equals("")){
					p1.setVisibility(View.VISIBLE);
				} else {
					p1.setVisibility(View.INVISIBLE);
				}
				if(!p2.getText().toString().equals("")){
					p2.setVisibility(View.VISIBLE);
				} else {
					p2.setVisibility(View.INVISIBLE);
				}
				if(!p3.getText().toString().equals("")){
					p3.setVisibility(View.VISIBLE);
				} else {
					p3.setVisibility(View.INVISIBLE);
				}
				if(!p4.getText().toString().equals("")){
					p4.setVisibility(View.VISIBLE);
				} else {
					p4.setVisibility(View.INVISIBLE);
				}
				if(!p5.getText().toString().equals("")){
					p5.setVisibility(View.VISIBLE);
				} else {
					p5.setVisibility(View.INVISIBLE);
				}
				if(!pq1.getText().toString().equals("")){
					pq1.setVisibility(View.VISIBLE);
				} else {
					pq1.setVisibility(View.INVISIBLE);
				}
				if(!pq2.getText().toString().equals("")){
					pq2.setVisibility(View.VISIBLE);
				} else {
					pq2.setVisibility(View.INVISIBLE);
				}
				if(!pq3.getText().toString().equals("")){
					pq3.setVisibility(View.VISIBLE);
				} else {
					pq3.setVisibility(View.INVISIBLE);
				}
				if(!pq4.getText().toString().equals("")){
					pq4.setVisibility(View.VISIBLE);
				} else {
					pq4.setVisibility(View.INVISIBLE);
				}
				if(!pq5.getText().toString().equals("")){
					pq5.setVisibility(View.VISIBLE);
				} else {
					pq5.setVisibility(View.INVISIBLE);
				}
				if(!f1.getText().toString().equals("")){
					f1.setVisibility(View.VISIBLE);
				} else {
					f1.setVisibility(View.INVISIBLE);
				}
				if(!f2.getText().toString().equals("")){
					f2.setVisibility(View.VISIBLE);
				} else {
					f2.setVisibility(View.INVISIBLE);
				}
				if(!f3.getText().toString().equals("")){
					f3.setVisibility(View.VISIBLE);
				} else {
					f3.setVisibility(View.INVISIBLE);
				}
				if(!f4.getText().toString().equals("")){
					f4.setVisibility(View.VISIBLE);
				} else {
					f4.setVisibility(View.INVISIBLE);
				}
				if(!f5.getText().toString().equals("")){
					f5.setVisibility(View.VISIBLE);
				} else {
					f5.setVisibility(View.INVISIBLE);
				}
				if(!v1.getText().toString().equals("")){
					v1.setVisibility(View.VISIBLE);
				} else {
					v1.setVisibility(View.INVISIBLE);
				}
				if(!v2.getText().toString().equals("")){
					v2.setVisibility(View.VISIBLE);
				} else {
					v2.setVisibility(View.INVISIBLE);
				}
				if(!v3.getText().toString().equals("")){
					v3.setVisibility(View.VISIBLE);
				} else {
					v3.setVisibility(View.INVISIBLE);
				}
				if(!v4.getText().toString().equals("")){
					v4.setVisibility(View.VISIBLE);
				} else {
					v4.setVisibility(View.INVISIBLE);
				}
				if(!v5.getText().toString().equals("")){
					v5.setVisibility(View.VISIBLE);
				} else {
					v5.setVisibility(View.INVISIBLE);
				}
				if(p1.getText().toString().startsWith("Ca")){
					
					pq1.setText(pq1.getText().toString() + " CX");
				} else {
					pq1.setText(pq1.getText().toString() + " UN");
				}
				tvP.setText("Produto");
				tvQ.setText("Qtde");
				tvF.setText("Fabri.");
				tvV.setText("Validade");
				}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// TODO: Implement this method
		getMenuInflater().inflate(R.menu.util_manager, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// TODO: Implement this method
		switch(item.getItemId()){
			case R.id.save:
				Bundle b = getIntent().getExtras();
				if(b != null){
					int value = b.getInt("id");
					if(value >0){
						if(db.Update(update, p.getText().toString(), p1.getText().toString(), p2.getText().toString(), p3.getText().toString(), p4.getText().toString(), p5.getText().toString(), pq1.getText().toString(), pq2.getText().toString(), pq3.getText().toString(), pq4.getText().toString(),pq5.getText().toString(), f1.getText().toString(), f2.getText().toString(), f3.getText().toString(), f4.getText().toString(), f5.getText().toString(), v1.getText().toString(), v2.getText().toString(), v3.getText().toString(), v4.getText().toString(), v5.getText().toString())){
							
						}
					} else{
						if(db.insert(p.getText().toString(), p1.getText().toString(), p2.getText().toString(), p3.getText().toString(), p4.getText().toString(), p5.getText().toString(), pq1.getText().toString(), pq2.getText().toString(), pq3.getText().toString(), pq4.getText().toString(),pq5.getText().toString(), f1.getText().toString(), f2.getText().toString(), f3.getText().toString(), f4.getText().toString(), f5.getText().toString(), v1.getText().toString(), v2.getText().toString(), v3.getText().toString(), v4.getText().toString(), v5.getText().toString())){

						}
					}
					Intent it = new Intent(getApplicationContext(), MainActivity.class);
					startActivity(it);
				}
				return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
}
