
package java2019_gui_l_1.pkg0;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class Frame_Panel extends JPanel{

    
  private static int number =1;
 private static JTextField text;
 
    public Frame_Panel() {
        
       GridLayout d=new GridLayout(4,4);
       
      JPanel  panel=new JPanel(d);
      JButton[]  buttons=new JButton[16];
       String test[]={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        for (int i = 0; i < test.length; i++) {
            buttons[i]=new JButton(test[i]);
             }
      
       
        EventHandler eventHandler = new EventHandler();
        for(JButton button:buttons){
        button.addActionListener(eventHandler);
           button.setFont(new Font("Serif", Font.BOLD, 14));
           
           panel.add(button);
        }
          for (int i = 0; i < buttons.length; i++) {
                    
            buttons[i].setEnabled(false); 
         }
                 
         //new and add JRadioButton
      JPanel  panel1=new JPanel(new GridLayout(5,1));
      ButtonGroup group = new ButtonGroup(); 
      JRadioButton bin = new JRadioButton("Bin", false); 
      JRadioButton doc= new JRadioButton("Doc", false); 
      JRadioButton hex = new JRadioButton("Hex", false); 
       JRadioButton oct = new JRadioButton("Oct", false); 
      group.add(bin);
      group.add(doc);
      group.add(hex);
      group.add(oct);
       
      JButton button=new JButton("C");
       panel1.add(bin);
       panel1.add(doc);
       panel1.add(hex);
       panel1.add(oct);
       panel1.add(button);
       // Action  JRadioButton
          
         //Action bin
         bin.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                 buttons[0].setEnabled(true);
                 buttons[1].setEnabled(true);
                 for (int i = 2; i < buttons.length; i++) {
                     buttons[i].setEnabled(false);
                     
                 }
                number=2;
             }
         });
          //Action hex
        hex.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                 for (int i = 0; i < buttons.length; i++) {
                     buttons[i].setEnabled(true);
                 }
                 number=16;
             }
         });
         //Action oct
        oct.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                 for (int i = 0; i < buttons.length; i++) {
                    if(i<8){
                     buttons[i].setEnabled(true);
                     }else{
                         buttons[i].setEnabled(false); 
                    }  
                 }
                  number=8;
             }
         });
          //Action doc
        doc.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                 for (int i = 0; i < buttons.length; i++) {
                     if(i<10){
                     buttons[i].setEnabled(true);
                     }else{
                         buttons[i].setEnabled(false); 
                     }
                 }
                 number=10;
             }
         });
         //Action button "C"
         button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
              max();
           }
       });
       
        //private panel
         text=new JTextField("");
         text.setFont(new Font("Arial",Font.BOLD,20));
         text.setForeground(Color.RED);
         this.setLayout(new BorderLayout());
         add(text,BorderLayout.NORTH);
         add(panel,BorderLayout.CENTER);
          add(panel1,BorderLayout.EAST);
    }
     private class EventHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            text.setText(
                 text.getText()+ ((AbstractButton) e.getSource()).getText());

         }

       
     }
    private static void max(){
        int test;
        String action="";
     
       if(number==10 || number==2 || number==16 || number==8) {
           try{
                 test =Integer.parseInt(text.getText(), number);
                action=String.valueOf(test);
            }
           catch(NumberFormatException e){
                 action="Error Number Input !";
            }
       }
       else {
           
            action="not selcted opration !";
       }
       text.setText(action);
    }
 
 
 
 }




