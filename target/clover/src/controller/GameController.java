/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;


@Slf4j
public class GameController {public static class __CLR4_4_100kohohul0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0042\u00e9\u006b\u0061\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0053\u0075\u006c\u0069\u0073\u005c\u005c\u0034\u005c\u005c\u0053\u007a\u006f\u0066\u0074\u0069\u005c\u005c\u006e\u006f\u0066\u0075\u0074\u0074\u0061\u0074\u005c\u005c\u0062\u0065\u0061\u0064\u0061\u0073\u005f\u0075\u006a\u0074\u0072\u0079\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1620595126492L,8589935092L,14,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @FXML
    private Button gomb_1;
    @FXML
    private Button gomb_2;
    @FXML
    private Button gomb_3;
    @FXML
    private Button gomb_4;
    @FXML
    private Button gomb_5;
    @FXML
    private Button gomb_6;
    @FXML
    private Button gomb_7;
    @FXML
    private Button gomb_8;
    @FXML
    private Button gomb_9;
    @FXML
    private Button gomb_10;
    @FXML
    private Button gomb_11;
    @FXML
    private Button gomb_12;


    int kezdok[] =  {1, 5, 6, 4, 8, 6, 4, 3, 1, 2, 2, 8};
    ArrayList<Integer> lanc;

    public void nyitAction(ActionEvent actionEvent) throws Exception {try{__CLR4_4_100kohohul0.R.inc(0);
        __CLR4_4_100kohohul0.R.inc(1);String gomb = ((Button) actionEvent.getSource()).getId();
        __CLR4_4_100kohohul0.R.inc(2);String [] tomb = gomb.split("_");
        //System.out.println(tomb[1]);
        __CLR4_4_100kohohul0.R.inc(3);int sorszam = Integer.parseInt(tomb[1]);
        //System.out.println(kezdok[sorszam-1]);
        __CLR4_4_100kohohul0.R.inc(4);int [] tomb2 = {};
        __CLR4_4_100kohohul0.R.inc(5);int db = 0;
        __CLR4_4_100kohohul0.R.inc(6);for(int i = sorszam; (((i < kezdok.length)&&(__CLR4_4_100kohohul0.R.iget(7)!=0|true))||(__CLR4_4_100kohohul0.R.iget(8)==0&false)); i++){{
            //lanc.add(kezdok[i]);
            __CLR4_4_100kohohul0.R.inc(9);System.out.println(kezdok[i]);
        }
        }__CLR4_4_100kohohul0.R.inc(10);for (int j = 0; (((j < sorszam-1)&&(__CLR4_4_100kohohul0.R.iget(11)!=0|true))||(__CLR4_4_100kohohul0.R.iget(12)==0&false)); j++){{
            //lanc.add(kezdok[j]);
            __CLR4_4_100kohohul0.R.inc(13);System.out.println(kezdok[j]);
        }

    }}finally{__CLR4_4_100kohohul0.R.flushNeeded();}}

}
