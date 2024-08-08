import javax.swing.*; 
import java.awt.event.*;
import java.awt.Color;
class currency implements ActionListener
{
JFrame f; 
JTextField t;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,byuan,brand,brial,bshill,bdlr,byen,bpound,beuro,bdec,bdel,bclr;
static double a=0;

currency()
{
f=new JFrame("Currency converter");
t=new JTextField();

b1=new JButton("1"); 
b2=new JButton("2"); 
b3=new JButton("3"); 
b4=new JButton("4"); 
b5=new JButton("5"); 
b6=new JButton("6"); 
b7=new JButton("7"); 
b8=new JButton("8"); 
b9=new JButton("9"); 
b0=new JButton("0"); 
bshill=new JButton("shilling");
bdlr=new JButton("dollar"); 
byen=new JButton("yen"); 
bpound=new JButton("pound");
beuro=new JButton("euro");
byuan=new JButton("yuan");
brial=new JButton("riyal");
brand=new JButton("rand");
bdec=new JButton(".");
bdel=new JButton("Delete"); 
bclr=new JButton("Clear"); 
t.setBounds(30,40,310,30); 
b7.setBounds(40,100,50,40); 
b8.setBounds(110,100,50,40); 
b9.setBounds(180,100,50,40);
bdlr.setBounds(250,100,100,40); 
b4.setBounds(40,170,50,40); 
b5.setBounds(110,170,50,40); 
b6.setBounds(180,170,50,40); 
bshill.setBounds(250,170,100,40); 
b1.setBounds(40,240,50,40); 
b2.setBounds(110,240,50,40); 
b3.setBounds(180,240,50,40); 
byen.setBounds(250,240,100,40); 
bdec.setBounds(20,310,50,40); 
b0.setBounds(90,310,50,40);
bpound.setBounds(150,310,100,40);
beuro.setBounds(270,310,100,40);
byuan.setBounds(20,380,100,40);
brial.setBounds(140,380,100,40);
brand.setBounds(260,380,100,40);
bdel.setBounds(60,450,100,40); 
bclr.setBounds(180,450,100,40); 
f.add(t);
f.add(b7);
f.add(b8);
f.add(b9);
f.add(bshill);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(bdlr);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(byen);
f.add(bdec);
f.add(b0);
f.add(bpound);
f.add(beuro);
f.add(brial);
f.add(byuan);
f.add(brand);
f.add(bdel);
f.add(bclr); 
f.setLayout(null); 
f.setVisible(true); 
f.setSize(400,600);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
f.setResizable(false);
f.getContentPane().setBackground(Color.BLACK);
b1.addActionListener(this); 


b2.addActionListener(this); 
b3.addActionListener(this); 

b4.addActionListener(this); 
b5.addActionListener(this); 
b6.addActionListener(this); 
b7.addActionListener(this); 

b8.addActionListener(this); 
b9.addActionListener(this); 
b0.addActionListener(this); 
bshill.addActionListener(this); 
bdlr.addActionListener(this); 
byen.addActionListener(this); 
bpound.addActionListener(this); 
beuro.addActionListener(this); 
byuan.addActionListener(this); 
brial.addActionListener(this); 
brand.addActionListener(this);
bdec.addActionListener(this); 
bdel.addActionListener(this);
bclr.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1) 
t.setText(t.getText().concat("1")); 
if(e.getSource()==b2) 
t.setText(t.getText().concat("2")); 
if(e.getSource()==b3) 
t.setText(t.getText().concat("3")); 
if(e.getSource()==b4) 
t.setText(t.getText().concat("4")); 
if(e.getSource()==b5) 
t.setText(t.getText().concat("5")); 
if(e.getSource()==b6) 
t.setText(t.getText().concat("6")); 
if(e.getSource()==b7) 
t.setText(t.getText().concat("7")); 
if(e.getSource()==b8) 
t.setText(t.getText().concat("8")); 
if(e.getSource()==b9) 
t.setText(t.getText().concat("9")); 
if(e.getSource()==b0) 
t.setText(t.getText().concat("0")); 
if(e.getSource()==bdec) 
t.setText(t.getText().concat(".")); 
if(e.getSource()==bshill)
{
a=Double.parseDouble(t.getText());
double shill=a*1.51;
t.setText(""+shill);
}
if(e.getSource()==bdlr)
{
a=Double.parseDouble(t.getText());
double dol=a/83.96;
t.setText(""+dol);
}
if(e.getSource()==byen)
{
a=Double.parseDouble(t.getText()); 
double yen=a*1.6;
t.setText(""+yen);
}
if(e.getSource()==bpound)
{
a=Double.parseDouble(t.getText()); 
double pound=a/99.47;
t.setText(""+pound);
}
if(e.getSource()==beuro)
{
a=Double.parseDouble(t.getText());
double euro=a/89.02;
t.setText(""+euro);
}
if(e.getSource()==brial)
{
a=Double.parseDouble(t.getText());
double rial=a*0.044;
t.setText(""+rial);
}
if(e.getSource()==byuan)
{
a=Double.parseDouble(t.getText());
double yuan=a*0.082;
t.setText(""+yuan);
}
if(e.getSource()==brand)
{
a=Double.parseDouble(t.getText());
double rand=a*0.21;
t.setText(""+rand);
}
if(e.getSource()==bclr) 
t.setText(""); 
if(e.getSource()==bdel)
{
String s=t.getText(); 
t.setText("");
for(int i=0;i<s.length()-1;i++) 
t.setText(t.getText()+s.charAt(i));
}
}


public static void main(String args[])
{
new currency();
}
}