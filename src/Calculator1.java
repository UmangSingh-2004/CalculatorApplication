import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator1 {

    static String second_num = "";
    static String first_num = "";
    static String first_num1 = "";
    static String math = "";
    static String showcontant = "";

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField Text = new JTextField();
        Text.setFont(new Font("Cambria Math", Font.BOLD, 40));//set the text
        JTextField text2 = new JTextField();
        text2.setFont(new Font("Cambria Math", Font.BOLD, 25));
        ImageIcon icone_dot = new ImageIcon("src/assets/dot.PNG");
        JButton dot = new JButton(icone_dot);
        ImageIcon icone_zero = new ImageIcon("src/assets/zero.PNG");
        JButton zero = new JButton(icone_zero);
        ImageIcon icone_one = new ImageIcon("src/assets/one.PNG");
        JButton one = new JButton(icone_one);
        ImageIcon icone_two = new ImageIcon("src/assets/two.PNG");
        JButton two = new JButton(icone_two);
        ImageIcon icone_three = new ImageIcon("src/assets/three.PNG");
        JButton three = new JButton(icone_three);
        ImageIcon icone_four = new ImageIcon("src/assets/four.PNG");
        JButton four = new JButton(icone_four);
        ImageIcon icone_five = new ImageIcon("src/assets/five.PNG");
        JButton five = new JButton(icone_five);
        ImageIcon icone_six = new ImageIcon("src/assets/six.PNG");
        JButton six = new JButton(icone_six);
        ImageIcon icone_seven = new ImageIcon("src/assets/seven.PNG");
        JButton seven = new JButton(icone_seven);
        ImageIcon icone_eight = new ImageIcon("src/assets/eight.PNG");
        JButton eight = new JButton(icone_eight);
        ImageIcon icone_nine = new ImageIcon("src/assets/nine.PNG");
        JButton nine = new JButton(icone_nine);
        ImageIcon logo = new ImageIcon("src/assets/calculator icons.PNG");
        ImageIcon icone_add = new ImageIcon("src/assets/add.PNG");
        JButton add = new JButton(icone_add);
        ImageIcon icone_minus = new ImageIcon("src/assets/minus.PNG");
        JButton min = new JButton(icone_minus);
        ImageIcon icone_mult = new ImageIcon("src/assets/mult.PNG");
        JButton mult = new JButton(icone_mult);
        ImageIcon icone_div = new ImageIcon("src/assets/divide.PNG");
        JButton div = new JButton(icone_div);
        ImageIcon icone_result = new ImageIcon("src/assets/result.PNG");
        JButton result = new JButton(icone_result);
        ImageIcon icone_delete = new ImageIcon("src/assets/delete.PNG");
        JButton delete = new JButton(icone_delete);
        ImageIcon icone_clean = new ImageIcon("src/assets/cancel.PNG");
        JButton clean = new JButton(icone_clean);

        //for adding a button on the frame
        Text.setBounds(4, 20, 278, 50);
        text2.setBounds(139, 70, 143, 40);
        clean.setBounds(4, 110, 92, 50);
        delete.setBounds(98, 110, 91, 50);
        div.setBounds(191, 110, 92, 50);
        seven.setBounds(4, 161, 69, 50);
        eight.setBounds(74, 161, 69, 50);
        nine.setBounds(144, 161, 69, 50);
        mult.setBounds(214, 161, 69, 50);
        four.setBounds(4, 213, 69, 50);
        five.setBounds(74, 213, 69, 50);
        six.setBounds(144, 213, 69, 50);
        min.setBounds(214, 213, 69, 50);
        one.setBounds(4, 265, 69, 50);
        two.setBounds(74, 265, 69, 50);
        three.setBounds(144, 265, 69, 50);
        add.setBounds(214, 265, 69, 50);
        zero.setBounds(4, 317, 92,50);
        dot.setBounds(98,317, 91, 50);
        result.setBounds(191, 317, 92, 50);


        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += ".";
                first_num1 = ".";
                Text.setText(first_num);
                showcontant = showcontant + first_num1.toString();
                text2.setText(showcontant);
            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "0";
                first_num1 = "0";
                Text.setText(first_num);
                showcontant = showcontant + first_num1.toString();
                text2.setText(showcontant);
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "1";
                first_num1 = "1";
                Text.setText(first_num);
                showcontant = showcontant + first_num1.toString();
                text2.setText(showcontant);
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "2";
                first_num1 = "2";
                Text.setText(first_num);
                showcontant = showcontant + first_num1.toString();
                text2.setText(showcontant);
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "3";
                first_num1 = "3";
                Text.setText(first_num);
                showcontant = showcontant + first_num1.toString();
                text2.setText(showcontant);
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "4";
                first_num1 = "4";
                Text.setText(first_num);
                showcontant = showcontant + first_num1.toString();
                text2.setText(showcontant);
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "5";
                first_num1 = "5";
                Text.setText(first_num);
                showcontant = showcontant + first_num1.toString();
                text2.setText(showcontant);
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "6";
                first_num1 = "6";
                showcontant = showcontant + first_num1.toString();
                text2.setText(showcontant);
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "7";
                first_num1 = "7";
                Text.setText(first_num);
                showcontant = showcontant + first_num1.toString();
                text2.setText(showcontant);
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "8";
                first_num1 = "8";
                showcontant = showcontant + first_num1.toString();
                text2.setText(showcontant);
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "9";
                first_num1 = "9";
                Text.setText(first_num);
                showcontant = showcontant + first_num1.toString();
                text2.setText(showcontant);
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second_num = first_num;
                first_num = "";
                math = "+";
                Text.setText("+");
                showcontant = showcontant + first_num.toString()+math;
                text2.setText(showcontant);
            }
        });
        min.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                second_num = first_num;
                first_num = "";
                math = "-";
                Text.setText("-");
                showcontant = showcontant + first_num.toString()+math;
                text2.setText(showcontant);
            }
        });
        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second_num = first_num;
                first_num = "";
                math = "*";
                Text.setText("*");
                showcontant = showcontant + first_num.toString()+math;
                text2.setText(showcontant);
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second_num = first_num;
                first_num = "";
                math = "/";
                Text.setText("/");
                showcontant = showcontant + first_num.toString()+math;
                text2.setText(showcontant);
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (first_num.length() > 0) {
                    first_num = first_num.substring(0, first_num.length() - 1);
                    Text.setText(first_num);
                }
            }
        });
        clean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num = "";
                second_num = "";
                math = "";
                Text.setText("");
                text2.setText("");
            }
        });
        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float result = 0.0f;
                switch (math) {
                    case "+":
                        result = Float.parseFloat(second_num) + Float.parseFloat(first_num);
                        break;
                    case "-":
                        result = Float.parseFloat(second_num) - Float.parseFloat(first_num);
                        break;
                    case "*":
                        result = Float.parseFloat(second_num) * Float.parseFloat(first_num);
                        break;
                    case "/":
                        result = Float.parseFloat(second_num) / Float.parseFloat(first_num);
                        break;
                }

                Text.setText(String.valueOf("="+result));
                second_num = String.valueOf(result);
                first_num = "";
                math = "";
            }
        });
        f.add(text2);
        f.add(Text);
        f.add(dot);
        f.add(zero);
        f.add(one);
        f.add(two);
        f.add(three);
        f.add(four);
        f.add(five);
        f.add(six);
        f.add(seven);
        f.add(eight);
        f.add(nine);
        f.add(add);
        f.add(min);
        f.add(mult);
        f.add(div);
        f.add(result);
        f.add(delete);
        f.add(clean);
        f.getContentPane();//setBackground(Color.darkGray);
        f.setIconImage(logo.getImage());
        f.setLayout(null);
        f.setTitle("Calculator");
        f.setSize(301, 410);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
