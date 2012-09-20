package com.digitizormedia.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends Activity {

	Float val_1		= (float) 0;
    String op		= null;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        
        final TextView view 	= (TextView) findViewById(R.id.textView1);
        Button b_0		= (Button) findViewById(R.id.button1);
        Button b_1		= (Button) findViewById(R.id.button5);
        Button b_2		= (Button) findViewById(R.id.button6);
        Button b_3		= (Button) findViewById(R.id.button7);
        Button b_4		= (Button) findViewById(R.id.button9);
        Button b_5		= (Button) findViewById(R.id.button10);
        Button b_6		= (Button) findViewById(R.id.button11);
        Button b_7		= (Button) findViewById(R.id.button13);
        Button b_8		= (Button) findViewById(R.id.button14);
        Button b_9		= (Button) findViewById(R.id.button15);
        Button b_d		= (Button) findViewById(R.id.button16);
        Button b_m		= (Button) findViewById(R.id.button12);
        Button b_a		= (Button) findViewById(R.id.button8);
        Button b_s		= (Button) findViewById(R.id.button4);
        Button b_e		= (Button) findViewById(R.id.button3);
        Button b_ac		= (Button) findViewById(R.id.button17);
        
        b_0.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String buttn	= "0";
				String pre_val 	= view.getText().toString();
				String new_val;
				
				if (pre_val.equals("0") || (op != null)) {
					new_val 	= buttn;
				} else {
					new_val 	= pre_val.concat(buttn);
				}
				
				view.setText(new_val);
			}
		});
        
        b_1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String buttn	= "1";
				String pre_val 	= view.getText().toString();
				String new_val;
				
				if (pre_val.equals("0")) {
					new_val 	= buttn;
				} else {
					new_val 	= pre_val.concat(buttn);
				}
				
				view.setText(new_val);
			}
		});

        b_2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String buttn	= "2";
				String pre_val 	= view.getText().toString();
				String new_val;
				
				if (pre_val.equals("0")) {
					new_val 	= buttn;
				} else {
					new_val 	= pre_val.concat(buttn);
				}
				
				view.setText(new_val);
			}
		});

		b_3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String buttn	= "3";
				String pre_val 	= view.getText().toString();
				String new_val;
				
				if (pre_val.equals("0")) {
					new_val 	= buttn;
				} else {
					new_val 	= pre_val.concat(buttn);
				}
				
				view.setText(new_val);
			}
		});

		b_4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String buttn	= "4";
				String pre_val 	= view.getText().toString();
				String new_val;
				
				if (pre_val.equals("0")) {
					new_val 	= buttn;
				} else {
					new_val 	= pre_val.concat(buttn);
				}
				
				view.setText(new_val);
			}
		});

		b_5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String buttn	= "5";
				String pre_val 	= view.getText().toString();
				String new_val;
				
				if (pre_val.equals("0")) {
					new_val 	= buttn;
				} else {
					new_val 	= pre_val.concat(buttn);
				}
				
				view.setText(new_val);
			}
		});

		b_6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String buttn	= "6";
				String pre_val 	= view.getText().toString();
				String new_val;
				
				if (pre_val.equals("0")) {
					new_val 	= buttn;
				} else {
					new_val 	= pre_val.concat(buttn);
				}
				
				view.setText(new_val);
			}
		});

		b_7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String buttn	= "7";
				String pre_val 	= view.getText().toString();
				String new_val;
				
				if (pre_val.equals("0")) {
					new_val 	= buttn;
				} else {
					new_val 	= pre_val.concat(buttn);
				}
				
				view.setText(new_val);
			}
		});

		b_8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String buttn	= "8";
				String pre_val 	= view.getText().toString();
				String new_val;
				
				if (pre_val.equals("0")) {
					new_val 	= buttn;
				} else {
					new_val 	= pre_val.concat(buttn);
				}
				
				view.setText(new_val);
			}
		});
		
		b_9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String buttn	= "9";
				String pre_val 	= view.getText().toString();
				String new_val;
				
				if (pre_val.equals("0")) {
					new_val 	= buttn;
				} else {
					new_val 	= pre_val.concat(buttn);
				}
				
				view.setText(new_val);
			}
		});
		
		b_d.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String value 	= view.getText().toString();
				val_1			= Float.valueOf(value);
				op				= "division";
				view.setText("0");
			}
		});
		
		b_m.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String value 	= view.getText().toString();
				val_1			= Float.valueOf(value);
				op				= "multiply";
				view.setText("0");
			}
		});

		b_a.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String value 	= view.getText().toString();
				val_1			= Float.valueOf(value);
				op				= "add";
				view.setText("0");
			}
		});

		b_s.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String value 	= view.getText().toString();
				val_1			= Float.valueOf(value);
				op				= "subtract";
				view.setText("0");
			}
		});
		
		b_e.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Float value_1 	= Float.valueOf(view.getText().toString());
				Float value_2	= val_1;
				String operation= op;
				Float new_value = (float) 0;
				
				if (operation != null) {
					if (operation.equals("division")) {
						new_value = value_2 / value_1;
						view.setText(new_value + "");
					} else if (operation.equals("multiply")){
						new_value = value_2 * value_1;
						view.setText(new_value + "");
					} else if (operation.equals("add")) {
						new_value = value_2 + value_1;
						view.setText(new_value + "");
					} else if (operation.equals("subtract")) {
						new_value = value_2 - value_1;
						view.setText(new_value + "");
					}
				}
				
				val_1 	= new_value;
				op		= null;
			}
		});
		
		b_ac.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				view.setText("0");
				val_1 	= (float) 0;
				op 		= null;
			}
		});

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_calculator, menu);
        return true;
    }
}
