/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class LaunchController {public static class __CLR4_4_1eekohohum0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0042\u00e9\u006b\u0061\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0053\u0075\u006c\u0069\u0073\u005c\u005c\u0034\u005c\u005c\u0053\u007a\u006f\u0066\u0074\u0069\u005c\u005c\u006e\u006f\u0066\u0075\u0074\u0074\u0061\u0074\u005c\u005c\u0062\u0065\u0061\u0064\u0061\u0073\u005f\u0075\u006a\u0074\u0072\u0079\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1620595126492L,8589935092L,33,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @FXML
    TextField player1Textfield;
    @FXML
    TextField player2Textfield;

    @FXML
    private Label errorLabelP1;
    @FXML
    private Label errorLabelP2;
    

    public void startAction(ActionEvent actionEvent) throws Exception {try{__CLR4_4_1eekohohum0.R.inc(14);

        __CLR4_4_1eekohohum0.R.inc(15);if ((((player1Textfield.getText().isEmpty())&&(__CLR4_4_1eekohohum0.R.iget(16)!=0|true))||(__CLR4_4_1eekohohum0.R.iget(17)==0&false))) {{
            __CLR4_4_1eekohohum0.R.inc(18);errorLabelP1.setText("Player1 is empty!");
        }
        }else {{
            __CLR4_4_1eekohohum0.R.inc(19);errorLabelP1.setText("");
        }
        }__CLR4_4_1eekohohum0.R.inc(20);if ((((player2Textfield.getText().isEmpty())&&(__CLR4_4_1eekohohum0.R.iget(21)!=0|true))||(__CLR4_4_1eekohohum0.R.iget(22)==0&false))) {{
            __CLR4_4_1eekohohum0.R.inc(23);errorLabelP2.setText("Player2 is empty!");
        }
        }else {{
            __CLR4_4_1eekohohum0.R.inc(24);errorLabelP2.setText("");
        }

        }__CLR4_4_1eekohohum0.R.inc(25);if ((((!player1Textfield.getText().isEmpty() && !player2Textfield.getText().isEmpty())&&(__CLR4_4_1eekohohum0.R.iget(26)!=0|true))||(__CLR4_4_1eekohohum0.R.iget(27)==0&false))){{
            __CLR4_4_1eekohohum0.R.inc(28);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/game.fxml"));
            __CLR4_4_1eekohohum0.R.inc(29);Parent root = fxmlLoader.load();
            __CLR4_4_1eekohohum0.R.inc(30);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            __CLR4_4_1eekohohum0.R.inc(31);stage.setScene(new Scene(root));
            __CLR4_4_1eekohohum0.R.inc(32);stage.show();

        }

    }}finally{__CLR4_4_1eekohohum0.R.flushNeeded();}}



}
