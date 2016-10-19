package com.raju10naidugmail.eggadmin;


import android.app.DatePickerDialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    private EditText Date;
    private Button Save;
    private Button andrapradesh;
    private Button karnataka;
    private Button telangana;
    private Button tamilnadu;
    private Button maharastra;
    private Button northindia;
    private int pYear;
    private int pMonth;
    private int pDay;

    static final int DATE_DIALOG_ID = 0;

    final Context context = this;



    private DatePickerDialog.OnDateSetListener pDateSetListener =
            new DatePickerDialog.OnDateSetListener() {

                public void onDateSet(DatePicker view, int year,
                                      int monthOfYear, int dayOfMonth) {
                    pYear = year;
                    pMonth = monthOfYear;
                    pDay = dayOfMonth;
                    updateDisplay();
                    displayToast();
                }
            };

    /** Updates the date in the TextView */
    private void updateDisplay() {
        Date.setText(
                new StringBuilder()
                        // Month is 0 based so add 1
                        .append(pMonth + 1).append("/")
                        .append(pDay).append("/")
                        .append(pYear).append(" "));
    }

    /** Displays a notification when the date is updated */
    private void displayToast() {
        Toast.makeText(this, new StringBuilder().append("Date choosen is ").append(Date.getText()),  Toast.LENGTH_SHORT).show();

    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Date = (EditText) findViewById(R.id.editText);
        Save = (Button) findViewById(R.id.button7);
        andrapradesh = (Button) findViewById(R.id.button);
        karnataka = (Button) findViewById(R.id.button2);
        telangana = (Button) findViewById(R.id.button3);
        tamilnadu = (Button) findViewById(R.id.button4);
        maharastra = (Button) findViewById(R.id.button5);
        northindia = (Button) findViewById(R.id.button6);




        //Create onclick listener class
        andrapradesh.setOnClickListener(new View.OnClickListener() {
            //When you click the button, Alert dialog will be showed
            public void onClick(View v) {
       /* Alert Dialog Code Start*/
                AlertDialog.Builder alert = new AlertDialog.Builder(context);
                alert.setTitle("Enter The Rates"); //Set Alert dialog title here

                // Set an EditText view to get user input
                final EditText d1 = new EditText(context);
                d1.setHint("Chittoor");
                final EditText d2 = new EditText(context);
                d2.setHint("East Godawari");
                final EditText d3 = new EditText(context);
                d3.setHint("Vijayawada");
                final EditText d4 = new EditText(context);
                d4.setHint("Vizag");
                final EditText d5 = new EditText(context);
                d5.setHint("West Godawari");
                LinearLayout layout = new LinearLayout(getApplicationContext());
                layout.setOrientation(LinearLayout.VERTICAL);
                layout.addView(d1);
                layout.addView(d2);
                layout.addView(d3);
                layout.addView(d4);
                layout.addView(d5);
                alert.setView(layout);

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //You will get as string input data in this variable.
                        // here we convert the input to a string and show in a toast.
                        String srt1 = d1.getEditableText().toString();
                        String srt2 = d2.getEditableText().toString();
                        String srt3 = d3.getEditableText().toString();
                        String srt4 = d4.getEditableText().toString();
                        String srt5 = d5.getEditableText().toString();
                        Toast.makeText(context,
                                "Chittoor:" + srt1
                                        + "East Godawari:" + srt2
                                        + "Vijayawada:" + srt3
                                        + "Vizag:" + srt4
                                        + "West Godawari:" + srt5,
                                Toast.LENGTH_LONG).show();
                    } // End of onClick(DialogInterface dialog, int whichButton)
                }); //End of alert.setPositiveButton
                alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // Canceled.
                        dialog.cancel();
                    }
                }); //End of alert.setNegativeButton
                AlertDialog alertDialog = alert.create();
                alertDialog.show();
       /* Alert Dialog Code End*/
            }// End of onClick(View v)
        }); //button.setOnClickListener


        //Create onclick listener class
        karnataka.setOnClickListener(new View.OnClickListener() {
            //When you click the button, Alert dialog will be showed
            public void onClick(View v) {
       /* Alert Dialog Code Start*/
                AlertDialog.Builder alert = new AlertDialog.Builder(context);
                alert.setTitle("Enter The Rates"); //Set Alert dialog title here

                // Set an EditText view to get user input
                final EditText d1 = new EditText(context);
                d1.setHint("Bengaluru");
                final EditText d2 = new EditText(context);
                d2.setHint("Mysore");
                final EditText d3 = new EditText(context);
                d3.setHint("Hospet");
                LinearLayout layout = new LinearLayout(getApplicationContext());
                layout.setOrientation(LinearLayout.VERTICAL);
                layout.addView(d1);
                layout.addView(d2);
                layout.addView(d3);
                alert.setView(layout);

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //You will get as string input data in this variable.
                        // here we convert the input to a string and show in a toast.
                        String srt1 = d1.getEditableText().toString();
                        String srt2 = d2.getEditableText().toString();
                        String srt3 = d3.getEditableText().toString();
                        Toast.makeText(context,
                                "Bengaluru:" + srt1
                                        + "Mysore:" + srt2
                                        + "Hospet:" + srt3,
                                Toast.LENGTH_LONG).show();
                    } // End of onClick(DialogInterface dialog, int whichButton)
                }); //End of alert.setPositiveButton
                alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // Canceled.
                        dialog.cancel();
                    }
                }); //End of alert.setNegativeButton
                AlertDialog alertDialog = alert.create();
                alertDialog.show();
       /* Alert Dialog Code End*/
            }// End of onClick(View v)
        }); //button.setOnClickListener


        //Create onclick listener class
        telangana.setOnClickListener(new View.OnClickListener() {
            //When you click the button, Alert dialog will be showed
            public void onClick(View v) {
       /* Alert Dialog Code Start*/
                AlertDialog.Builder alert = new AlertDialog.Builder(context);
                alert.setTitle("Enter The Rates"); //Set Alert dialog title here

                // Set an EditText view to get user input
                final EditText d1 = new EditText(context);
                d1.setHint("Hyderabad");
                final EditText d2 = new EditText(context);
                d2.setHint("Warangal");
                LinearLayout layout = new LinearLayout(getApplicationContext());
                layout.setOrientation(LinearLayout.VERTICAL);
                layout.addView(d1);
                layout.addView(d2);
                ;
                alert.setView(layout);

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //You will get as string input data in this variable.
                        // here we convert the input to a string and show in a toast.
                        String srt1 = d1.getEditableText().toString();
                        String srt2 = d2.getEditableText().toString();
                        Toast.makeText(context,
                                "Hyderabad:" + srt1
                                        + "Warangal:" + srt2,
                                Toast.LENGTH_LONG).show();
                    } // End of onClick(DialogInterface dialog, int whichButton)
                }); //End of alert.setPositiveButton
                alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // Canceled.
                        dialog.cancel();
                    }
                }); //End of alert.setNegativeButton
                AlertDialog alertDialog = alert.create();
                alertDialog.show();
       /* Alert Dialog Code End*/
            }// End of onClick(View v)
        }); //button.setOnClickListener

        //Create onclick listener class
        tamilnadu.setOnClickListener(new View.OnClickListener() {
            //When you click the button, Alert dialog will be showed
            public void onClick(View v) {
       /* Alert Dialog Code Start*/
                AlertDialog.Builder alert = new AlertDialog.Builder(context);
                alert.setTitle("Enter The Rates"); //Set Alert dialog title here

                // Set an EditText view to get user input
                final EditText d1 = new EditText(context);
                d1.setHint("Chennai");
                final EditText d2 = new EditText(context);
                d2.setHint("Namakkal");
                LinearLayout layout = new LinearLayout(getApplicationContext());
                layout.setOrientation(LinearLayout.VERTICAL);
                layout.addView(d1);
                layout.addView(d2);
                alert.setView(layout);

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //You will get as string input data in this variable.
                        // here we convert the input to a string and show in a toast.
                        String srt1 = d1.getEditableText().toString();
                        String srt2 = d2.getEditableText().toString();
                        Toast.makeText(context,
                                "Chennai:" + srt1
                                        + "Namakkal:" + srt2,
                                Toast.LENGTH_LONG).show();
                    } // End of onClick(DialogInterface dialog, int whichButton)
                }); //End of alert.setPositiveButton
                alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // Canceled.
                        dialog.cancel();
                    }
                }); //End of alert.setNegativeButton
                AlertDialog alertDialog = alert.create();
                alertDialog.show();
       /* Alert Dialog Code End*/
            }// End of onClick(View v)
        }); //button.setOnClickListener


        //Create onclick listener class
        maharastra.setOnClickListener(new View.OnClickListener() {
            //When you click the button, Alert dialog will be showed
            public void onClick(View v) {
       /* Alert Dialog Code Start*/
                AlertDialog.Builder alert = new AlertDialog.Builder(context);
                alert.setTitle("Enter The Rates"); //Set Alert dialog title here

                // Set an EditText view to get user input
                final EditText d1 = new EditText(context);
                d1.setHint("Mumbai");
                final EditText d2 = new EditText(context);
                d2.setHint("Nagpur");
                final EditText d3 = new EditText(context);
                d3.setHint("Pune");
                LinearLayout layout = new LinearLayout(getApplicationContext());
                layout.setOrientation(LinearLayout.VERTICAL);
                layout.addView(d1);
                layout.addView(d2);
                layout.addView(d3);
                alert.setView(layout);

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //You will get as string input data in this variable.
                        // here we convert the input to a string and show in a toast.
                        String srt1 = d1.getEditableText().toString();
                        String srt2 = d2.getEditableText().toString();
                        String srt3 = d3.getEditableText().toString();
                        Toast.makeText(context,
                                "Mumbai:" + srt1
                                        + "Nagpur:" + srt2
                                        + "Pune:" + srt3,
                                Toast.LENGTH_LONG).show();
                    } // End of onClick(DialogInterface dialog, int whichButton)
                }); //End of alert.setPositiveButton
                alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // Canceled.
                        dialog.cancel();
                    }
                }); //End of alert.setNegativeButton
                AlertDialog alertDialog = alert.create();
                alertDialog.show();
       /* Alert Dialog Code End*/
            }// End of onClick(View v)
        }); //button.setOnClickListener

        //Create onclick listener class
        northindia.setOnClickListener(new View.OnClickListener() {
            //When you click the button, Alert dialog will be showed
            public void onClick(View v) {
       /* Alert Dialog Code Start*/
                AlertDialog.Builder alert = new AlertDialog.Builder(context);
                alert.setTitle("Enter The Rates"); //Set Alert dialog title here

                // Set an EditText view to get user input
                final EditText d1 = new EditText(context);
                d1.setHint("Ahmedabad");
                final EditText d2 = new EditText(context);
                d2.setHint("Ajmer");
                final EditText d3 = new EditText(context);
                d3.setHint("Delhi");
                final EditText d4 = new EditText(context);
                d4.setHint("Allahabad");
                final EditText d5 = new EditText(context);
                d5.setHint("Barwala");
                final EditText d6 = new EditText(context);
                d6.setHint("Bhopal");
                final EditText d7 = new EditText(context);
                d7.setHint("Indore");
                final EditText d8 = new EditText(context);
                d8.setHint("Jabalpur");
                final EditText d9 = new EditText(context);
                d9.setHint("Kanpur");
                final EditText d10 = new EditText(context);
                d10.setHint("Kolkata");
                final EditText d11 = new EditText(context);
                d11.setHint("Lucknow");
                final EditText d12 = new EditText(context);
                d12.setHint("Raipur");
                final EditText d13 = new EditText(context);
                d13.setHint("Varanasi");
                LinearLayout layout = new LinearLayout(getApplicationContext());
                layout.setOrientation(LinearLayout.VERTICAL);
                layout.addView(d1);
                layout.addView(d2);
                layout.addView(d3);
                layout.addView(d4);
                layout.addView(d5);
                layout.addView(d6);
                layout.addView(d7);
                layout.addView(d8);
                layout.addView(d9);
                layout.addView(d10);
                layout.addView(d11);
                layout.addView(d12);
                layout.addView(d13);
                alert.setView(layout);



                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //You will get as string input data in this variable.
                        // here we convert the input to a string and show in a toast.
                        String srt1 = d1.getEditableText().toString();
                        String srt2 = d2.getEditableText().toString();
                        String srt3 = d3.getEditableText().toString();
                        String srt4 = d4.getEditableText().toString();
                        String srt5 = d5.getEditableText().toString();
                        String srt6 = d6.getEditableText().toString();
                        String srt7 = d7.getEditableText().toString();
                        String srt8 = d8.getEditableText().toString();
                        String srt9 = d9.getEditableText().toString();
                        String srt10 = d10.getEditableText().toString();
                        String srt11 = d11.getEditableText().toString();
                        String srt12 = d12.getEditableText().toString();
                        String srt13 = d13.getEditableText().toString();
                        Toast.makeText(context,
                                "Ahmedabad:" + srt1
                                        + "Ajmer:" + srt2
                                        + "Delhi:" + srt3
                                        + "Allahabad:" + srt4
                                        + "Barwala:" + srt5
                                        + "Bhopal:" + srt6
                                        + "Indore:" + srt7
                                        + "Jabalpur:" + srt8
                                        + "Kanpur:" + srt9
                                        + "Kolkata:" + srt10
                                        + "Lucknow:" + srt11
                                        + "Raipur:" + srt12
                                        + "Varanasi:" + srt13,
                                Toast.LENGTH_LONG).show();
                    } // End of onClick(DialogInterface dialog, int whichButton)
                }); //End of alert.setPositiveButton
                alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // Canceled.
                        dialog.cancel();
                    }
                }); //End of alert.setNegativeButton
                AlertDialog alertDialog = alert.create();
                alertDialog.show();
       /* Alert Dialog Code End*/
            }// End of onClick(View v)
        }); //button.setOnClickListener


        Date.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showDialog(DATE_DIALOG_ID);
            }
        });

        /** Get the current date */
        final Calendar cal = Calendar.getInstance();
        pYear = cal.get(Calendar.YEAR);
        pMonth = cal.get(Calendar.MONTH);
        pDay = cal.get(Calendar.DAY_OF_MONTH);

        /** Display the current date in the TextView */
        updateDisplay();
    }

    /** Create a new dialog for date picker */
    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_DIALOG_ID:
                return new DatePickerDialog(this,
                        pDateSetListener,
                        pYear, pMonth, pDay);
        }
        return null;

    }



}//class AlertDialogExample extends Activity


















