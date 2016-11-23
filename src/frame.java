import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame extends JFrame {

    static int flagP = 0;
    static int flagM = 0;
    static int flagY = 0;
    static int flagD = 0;
    static String s1 = "";
    static double a, b;
    static int i = 0;
    static int remember;
    static double result;


    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(356, 510);
        frame.setUndecorated(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setResizable(false);
        frame.setLocation(500, 125);

        JPanel panel = new JPanel();
        panel.setVisible(true);
        panel.setBackground(Color.blue);
        frame.add(panel);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(10, 10, 330, 192);
        textArea.setVisible(true);
        textArea.setBackground(Color.CYAN);

        panel.setLayout(null);

        JButton one = new JButton("1");
        one.setVisible(true);
        one.setBounds(10, 352,50, 50);
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText()+"1");
            }
        });

        JButton two = new JButton("2");
        two.setVisible(true);
        two.setBounds(80, 352, 50, 50);
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText()+"2");
            }
        });

        JButton three = new JButton("3");
        three.setVisible(true);
        three.setBounds(150, 352, 50, 50);
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText()+"3");
            }
        });

        JButton four = new JButton("4");
        four.setVisible(true);
        four.setBounds(10, 282, 50, 50);
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText()+"4");
            }
        });

        JButton five = new JButton("5");
        five.setVisible(true);
        five.setBounds(80, 282, 50, 50);
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText()+"5");
            }
        });

        JButton six = new JButton("6");
        six.setVisible(true);
        six.setBounds(150, 282, 50, 50);
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText()+"6");
            }
        });

        JButton seven = new JButton("7");
        seven.setVisible(true);
        seven.setBounds(10, 212, 50, 50);
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText()+"7");
            }
        });

        JButton eight = new JButton("8");
        eight.setVisible(true);
        eight.setBounds(80, 212, 50, 50);
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText()+"8");
            }
        });

        JButton nine = new JButton("9");
        nine.setVisible(true);
        nine.setBounds(150, 212, 50, 50);
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText()+"9");
            }
        });

        JButton zero = new JButton("0");
        zero.setVisible(true);
        zero.setBounds(10, 422,50, 50);
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText()+"0");
            }
        });

        JButton point = new JButton(".");
        point.setVisible(true);
        point.setBounds(80, 422,50, 50);
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText()+".");
            }
        });

        JButton treapleZero = new JButton("000");
        treapleZero.setVisible(true);
        treapleZero.setBounds(150, 422, 50, 50);
        treapleZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText()+"000");
            }
        });

        JButton plus = new JButton("+");
        plus.setVisible(true);
        plus.setBounds(220, 352, 50, 120);
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText()+"+");
                flagP++;
            }
        });

        JButton ymnogenie = new JButton("*");
        ymnogenie.setVisible(true);
        ymnogenie.setBounds(220, 282, 50, 50);
        ymnogenie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText()+"*");
                flagY++;
            }
        });

        JButton delenie = new JButton("/");
        delenie.setVisible(true);
        delenie.setBounds(220, 212, 50, 50);
        delenie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText()+"/");
                flagD++;
            }
        });

        JButton minuse = new JButton("-");
        minuse.setVisible(true);
        minuse.setBounds(290, 282, 50, 50);
        minuse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText()+"-");
                flagM++;
            }

        });

        JButton clear = new JButton("C");
        clear.setVisible(true);
        clear.setBounds(290, 212, 50, 50);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                flagP = 0;
                flagM = 0;
                flagY = 0;
                flagD = 0;
            }
        });

        JButton ravno = new JButton("=");
        ravno.setVisible(true);
        ravno.setBounds(290, 352, 50, 120);
        ravno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1="";
                String s = textArea.getText();
                char[] masss = s.toCharArray();
                if ((flagP==1)&&(flagD==0)&&(flagM==0)&&(flagY==0)){
                    i = 0;
                    while (masss[i] != '+'){
                        s1 = s1 + masss[i];
                        remember = i+1;
                        i++;
                    }
                    a = Double.valueOf(s1);
                    s1="";
                    i = remember+1;
                    while (i < s.length()){
                        s1 = s1 + masss[i];
                        i++;
                    }
                    b = Double.valueOf(s1);
                    result = a+b;
                    s = String.valueOf(result);
                    textArea.setText(s);
                }
                else if ((flagP==0)&&(flagD==0)&&(flagM==0)&&(flagY==1)){
                    i = 0;
                    while (masss[i] != '*'){
                        s1 = s1 + masss[i];
                        remember = i+1;
                        i++;
                    }
                    a = Double.valueOf(s1);
                    s1="";
                    i = remember+1;
                    while (i < s.length()){
                        s1 = s1 + masss[i];
                        i++;
                    }
                    b = Double.valueOf(s1);
                    result = a*b;
                    s = String.valueOf(result);
                    textArea.setText(s);
                }
                else if ((flagP==0)&&(flagD==0)&&(flagM==1)&&(flagY==0)){
                    i = 0;
                    while (masss[i] != '-'){
                        s1 = s1 + masss[i];
                        remember = i+1;
                        i++;
                    }
                    a = Double.valueOf(s1);
                    s1="";
                    i = remember+1;
                    while (i < s.length()){
                        s1 = s1 + masss[i];
                        i++;
                    }
                    b = Double.valueOf(s1);
                    result = a-b;
                    s = String.valueOf(result);
                    textArea.setText(s);
                }
                else if((flagP==0)&&(flagD==1)&&(flagM==0)&&(flagY==0)){
                    i = 0;
                    while (masss[i] != '/'){
                        s1 = s1 + masss[i];
                        remember = i+1;
                        i++;
                    }
                    a = Double.valueOf(s1);
                    s1="";
                    i = remember+1;
                    while (i < s.length()){
                        s1 = s1 + masss[i];
                        i++;
                    }
                    b = Double.valueOf(s1);
                    result = a/b;
                    s = String.valueOf(result);
                    textArea.setText(s);
                }
                flagP = 0;
                flagM = 0;
                flagY = 0;
                flagD = 0;
            }
        });

        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(four);
        panel.add(five);
        panel.add(six);
        panel.add(seven);
        panel.add(eight);
        panel.add(nine);
        panel.add(zero);
        panel.add(point);
        panel.add(treapleZero);
        panel.add(plus);
        panel.add(ymnogenie);
        panel.add(delenie);
        panel.add(minuse);
        panel.add(clear);
        panel.add(ravno);
        panel.add(textArea);

    }

}

