import javafx.util.converter.IntegerStringConverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static  String number1="";
    static String number2="";
    static double result=1;
    static String operation="";
    static int p=0;

    public static void main(String[] args) {
        JFrame frame=new JFrame("calculator");
        Dimension d=new Dimension(400,600);
        frame.setSize(d);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(200,200,200));

        JButton clr=new JButton("Clr");
        clr.setBounds(160,470,70,60);
        frame.add(clr);

        JButton del=new JButton("DEL");
        del.setBounds(45,470,70,60);
        frame.add(del);

        JButton garine=new JButton("منفی ساز");
        garine.setBounds(260,470,80,60);
        frame.add(garine);


        JPanel panel1=new JPanel();
        panel1.setBounds(40,150,300,300);
        panel1.setBackground(Color.gray);
        frame.add(panel1);

        JButton b1=new JButton("1");
        panel1.add(b1);
        JButton b2=new JButton("2");
        panel1.add(b2);
        JButton b3=new JButton("3");
        panel1.add(b3);
        JButton mosbat=new JButton("+");
        panel1.add(mosbat);
        JButton b4=new JButton("4");
        panel1.add(b4);
        JButton b5=new JButton("5");
        panel1.add(b5);
        JButton b6=new JButton("6");
        panel1.add(b6);
        JButton menha=new JButton("_");
        panel1.add(menha);
        JButton b7=new JButton("7");
        panel1.add(b7);
        JButton b8=new JButton("8");
        panel1.add(b8);
        JButton b9=new JButton("9");
        panel1.add(b9);
        JButton zarb=new JButton("*");
        panel1.add(zarb);
        JButton dot=new JButton(".");
        panel1.add(dot);
        JButton b0=new JButton("0");
        panel1.add(b0);
        JButton mosavi=new JButton("=");
        panel1.add(mosavi);
        JButton tagsim=new JButton("/");
        panel1.add(tagsim);
        panel1.setLayout(new GridLayout(4,4,5,5) );

        JTextField display=new JTextField();
        display.setBounds(40,40,300,60);
        frame.add(display);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="1";
                    display.setText(number1);}
                else{
                    number2+="1";
                    display.setText(number2);}
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="2";
                    display.setText(number1);}
                else{
                    number2+="2";
                    display.setText(number2);}
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="3";
                    display.setText(number1);}
                else{
                    number2+="3";
                    display.setText(number2);}
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="4";
                    display.setText(number1);}
                else{
                    number2+="4";
                    display.setText(number2);}
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="5";
                    display.setText(number1);}
                else{
                    number2+="5";
                    display.setText(number2);}
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="6";
                    display.setText(number1);}
                else{
                    number2+="6";
                    display.setText(number2);}
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="7";
                    display.setText(number1);}
                else{
                    number2+="7";
                    display.setText(number2);}
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="8";
                    display.setText(number1);}
                else{
                    number2+="8";
                    display.setText(number2);}
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="9";
                    display.setText(number1);}
                else{
                    number2+="9";
                    display.setText(number2);}
            }
        });
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="0";
                    display.setText(number1);}
                else{
                    number2+="0";
                    display.setText(number2);}
            }
        });

        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(p%2==0) {
                    number1 += ".";
                    display.setText(number1);
                }
                else{
                    number2+=".";
                    display.setText(number2);
                }

            }
        });

        garine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("_");
                number1=String.valueOf(Double.parseDouble(number1)*(-1));
                number2=String.valueOf(Double.parseDouble(number2)*(-1));
            }
        });
        zarb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("*");
                operation += "*";
                if (p%2==0)
                    result*=Double.parseDouble(number1);
                else
                    result*=Double.parseDouble(number2);
                number1="";
                number2 = "";
                p++;
            }
        });
        tagsim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("/");
                operation+="/";
                p=0;
                result*=Double.parseDouble(number1);
                number1="";
                number2="";
                p++;

            }
        });
        mosbat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("+");
                operation+="+";
                if(result==1)
                    result-=1;
                if(p%2==0)
                    result+=Double.parseDouble(number1);
                if(p%2==1)
                    result+=Double.parseDouble(number2);
                number1="";
                number2="";
                p++;
            }
        });
        menha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("-");
                operation+="-";
                if(result==1)
                    result-=1;
                if(p%2==0)
                    result-=Double.parseDouble(number1);
                if(p%2==1)
                    result-=Double.parseDouble(number2);
                number1="";
                number2="";
                p++;
            }
        });
        mosavi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                if (operation.charAt(operation.length() - 1) == '*') {
                    if (p % 2 == 1)
                        result *= Double.parseDouble(number2);
                    else
                        result *= Double.parseDouble(number1);

                }
                if (operation.charAt(operation.length() - 1) == '/') {
                    if (p % 2 == 1)
                        result /= Double.parseDouble(number2);
                    else
                        result /= Double.parseDouble(number1);
                }
                if (operation.charAt(operation.length() - 1) == '+') {
                    if (p % 2 == 1)
                        result += Double.parseDouble(number2);
                    else
                        result += Double.parseDouble(number1);
                }

                if (operation.charAt(operation.length() - 1) == '-') {
                    if (p % 2 == 1)
                        result -= Double.parseDouble(number2);
                    else
                        result -= Double.parseDouble(number1);
                }

                number2 = "";
                number1 = "";
                display.setText(String.valueOf(result));
            }
        });
        clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                number1="";
                number2="";
                p=0;
                result=1;
                operation="";


            }
        });

        //این کلید، اون چیزی که نوشتیم رو پاک میکنه، مثلا میخاستیم بیست و پنج رو در 33 ضرب کنیم، ولی اشتباهی بیست و پنج رو در 44 ضرب کردیم
        //در نتیجه دکمه ی del رو میزنیم و 44 از صفحه نمایش ماشین حساب پاک میشه و ما 33 رو مینویسیم و مساوی میزنیم
        //جواب نهایی که 25*33 هست رو چاپ میکنه
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                number1="";
                number2="";
            }
        });

        frame.setVisible(true);
    }
}
