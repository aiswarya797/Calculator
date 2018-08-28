package com.example.aiswarya.crunchifycalculator;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.text.DecimalFormat;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual, history;
    EditText crunchifyEditText;

    float mValueOne, mValueTwo;
    private String show = "";
    //private String store = "";
    private DecimalFormat decimalFormat;

    List<String> listHis;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        decimalFormat = new DecimalFormat("#.##");

        listHis = new LinkedList<String>() {
            private final int capacity = 20;

            @Override
            public boolean add(String s) {
                if (size() >= capacity) {
                    removeFirst();
                }
                return super.add(s);
            }
        };
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        crunchifyEditText = (EditText) findViewById(R.id.edt1);
        history = (Button) findViewById(R.id.buthis);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String store = crunchifyEditText.getText().toString();
                show += "1";
                crunchifyEditText.setText(store + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String store = crunchifyEditText.getText().toString();
                show += "2";
                crunchifyEditText.setText(store + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String store = crunchifyEditText.getText().toString();
                show += "3";
                crunchifyEditText.setText(store + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String store = crunchifyEditText.getText().toString();
                show += "4";
                crunchifyEditText.setText(store + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String store = crunchifyEditText.getText().toString();
                show += "5";
                crunchifyEditText.setText(store + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String store = crunchifyEditText.getText().toString();
                show += "6";
                crunchifyEditText.setText(store + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String store = crunchifyEditText.getText().toString();
                show += "7";
                crunchifyEditText.setText(store + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String store = crunchifyEditText.getText().toString();
                show += "8";
                crunchifyEditText.setText(store + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String store = crunchifyEditText.getText().toString();
                show += "9";
                crunchifyEditText.setText(store + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String store = crunchifyEditText.getText().toString();
                show += "0";
                crunchifyEditText.setText(store + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    String store = crunchifyEditText.getText().toString();
                    show += "+";
                    mValueOne = Float.parseFloat(store + "");
                    crunchifyAddition = true;
                    crunchifyEditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String store = crunchifyEditText.getText().toString();
                show += "-";
                mValueOne = Float.parseFloat(store + "");
                mSubtract = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String store = crunchifyEditText.getText().toString();
                show += "*";
                mValueOne = Float.parseFloat(store + "");
                crunchifyMultiplication = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String store = crunchifyEditText.getText().toString();
                show += "/";
                mValueOne = Float.parseFloat(store + "");
                crunchifyDivision = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(crunchifyEditText.getText() + "");

                if (crunchifyAddition == true) {
                    crunchifyEditText.setText(decimalFormat.format(mValueOne + mValueTwo) + "");
                    crunchifyAddition = false;
                    show += "=" + decimalFormat.format(mValueOne + mValueTwo);
                    listHis.add(show);
                    show = "";
                    show += decimalFormat.format(mValueOne + mValueTwo) + "";
                }

                if (mSubtract == true) {
                    crunchifyEditText.setText(decimalFormat.format(mValueOne - mValueTwo) + "");
                    mSubtract = false;
                    show += "=" + decimalFormat.format(mValueOne - mValueTwo);
                    listHis.add(show);
                    show = "";
                    show += decimalFormat.format(mValueOne - mValueTwo)+"";
                }

                if (crunchifyMultiplication == true) {
                    crunchifyEditText.setText(decimalFormat.format(mValueOne * mValueTwo) + "");
                    crunchifyMultiplication = false;
                    show += "=" + decimalFormat.format(mValueOne * mValueTwo);
                    listHis.add(show);
                    show = "";
                    show += decimalFormat.format(mValueOne * mValueTwo)+"";
                }

                if (crunchifyDivision == true) {
                    crunchifyEditText.setText(decimalFormat.format(mValueOne / mValueTwo) + "");
                    crunchifyDivision = false;
                    show += "=" + decimalFormat.format(mValueOne / mValueTwo);
                    listHis.add(show);
                    show = "";
                    show += decimalFormat.format(mValueOne / mValueTwo);
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText("");
                int i;
                for ( i = show.length() - 1; i >= 0; i--)
                {
                    if(show.charAt(i) == '+' || show.charAt(i) == '-' || show.charAt(i) == '*' || show.charAt(i) == '/')
                    {

                        break;
                    }
                }
                StringBuffer text = new StringBuffer(show);
                text.replace( i+1 ,show.length() ,"");
                show = text.toString();
            }
        });

        buttonC.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                show = "";
                crunchifyEditText.setText(null);
                mValueOne = mValueTwo = 0;
                crunchifyAddition = false;
                crunchifyDivision = false;
                crunchifyMultiplication = false;
                mSubtract = false;
                return true;
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = crunchifyEditText.getText() + ".";

                if(validString(s)){

                    crunchifyEditText.setText(s);
                    show+= '.';
                }

            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showHistory();
            }
        });

    }

    void showHistory() {
        final CharSequence[] his = listHis.toArray(new String[listHis.size()]);
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        dialogBuilder.setTitle("History");

        dialogBuilder.setItems(his, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int item) {
                String selectedText = his[item].toString();
            }

        });
        AlertDialog alertDialogObject = dialogBuilder.create();
        //Show the dialog
        alertDialogObject.show();


    }

    boolean validString(String s)
    {
        boolean b = true;
        int i =0;
        while(i < s.length())
        {
            if(s.charAt(i) == '.')
            {
                if(!b)
                {
                    return false;
                }
                b = false;
            }
            i++;
        }
        return true;
    }
}


