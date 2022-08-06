import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class deskapp
{
 
   public static void main(String[] args)
   {
       MyApp myapp = new MyApp();       
       myapp.Run();
      
   }

}

class MyApp implements ActionListener{

 JButton btnAdd; 
 JButton btnSubtract; 
 JButton btnDivide; 
 JButton btnMultiply; 

 JLabel lblValue1;
 JLabel lblValue2;
 JLabel lblAnswer;

 JTextField txtValue1;
 JTextField txtValue2;
 JTextField txtAnswer;

 JPanel inputPanel1;
 JPanel inputPanel2;
 JPanel oprationPanel;
 JPanel answerPanel;
 JPanel mainPannel;



 
 void Run()
 {
 
       JFrame myframe = new JFrame("This sample app");
       inputPanel1 = new JPanel();
       inputPanel2 = new JPanel();
       oprationPanel = new JPanel();
       answerPanel = new JPanel();
       mainPannel = new JPanel();

       myframe.setSize(400, 400);
       myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       lblValue1 = new JLabel("Value 1");
       lblValue2 = new JLabel("Value 2");
       lblAnswer = new JLabel("Answer");

       txtValue1 = new JTextField(10);
       txtValue1.setBounds(50,100, 200,30);

       txtValue2 = new JTextField(10);
       txtValue2.setBounds(50,100, 2000,30);

       txtAnswer = new JTextField(10);
       txtAnswer.setBounds(50,100, 200,30);

       
       btnAdd = new JButton();
       btnAdd.setText("+");       
       btnAdd.addActionListener(this);

       btnSubtract = new JButton();
       btnSubtract.setText("-");       
       btnSubtract.addActionListener(this);
       
       btnMultiply = new JButton();
       btnMultiply.setText("*");       
       btnMultiply.addActionListener(this);

       btnDivide = new JButton();
       btnDivide.setText("/");       
       btnDivide.addActionListener(this);

       
       inputPanel1.add(lblValue1);
       inputPanel1.add(txtValue1);

       inputPanel2.add(lblValue2);
       inputPanel2.add(txtValue2);

       oprationPanel.add(btnAdd);
       oprationPanel.add(btnSubtract);
       oprationPanel.add(btnMultiply);
       oprationPanel.add (btnDivide);

       answerPanel.add(lblAnswer);
       answerPanel.add(txtAnswer);


       
           
       mainPannel.add(inputPanel1);
       mainPannel.add(inputPanel2);
       mainPannel.add(oprationPanel);
       mainPannel.add(answerPanel, BorderLayout.SOUTH);
     
       myframe.add(mainPannel);


       myframe.setVisible(true);
 
 }
 
  @Override 
  public void actionPerformed(ActionEvent ae)
  {
    int value1 = Integer.parseInt(txtValue1.getText());
    int value2 = Integer.parseInt(txtValue2.getText());
    int answer = 0;
      Object obj = ae.getSource();
      if(obj == btnAdd){
        answer = value1 + value2;
      }else if(obj == btnSubtract){
        answer = value1 - value2;
      }else if(obj ==btnMultiply){
        answer = value1 * value2;
      }else{
        answer = value1 / value2;
      }
      txtAnswer.setText(String.valueOf(answer));
      
    }
}






