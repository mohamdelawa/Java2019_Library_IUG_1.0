
package java2019_gui_l_1.pkg0;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;



public class Java2019_GUI_L_10 extends JFrame {

    public Java2019_GUI_L_10() throws HeadlessException {
        
      Frame_Panel  panel=new Frame_Panel();
         add(panel,BorderLayout.CENTER);
         setTitle(" Conversion Calculator");
         setSize(340,280);
         setResizable(false);
         setLocationRelativeTo(null);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
    }

    
    public static void main(String[] args) {
       new  Java2019_GUI_L_10();
    }
    
}
