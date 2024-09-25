import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {
    static String second_num = "";
    static String first_num = "";
    static String math = "";
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField Text = new JTextField();
        Text.setFont(new Font("Cambria Math", Font.BOLD, 40));//set the text
        ImageIcon icone_zero = new ImageIcon("src/res/zero.PNG");
        JButton zero = new JButton(icone_zero);
        ImageIcon icone_one = new ImageIcon("src/res/one.PNG");
        JButton one = new JButton(icone_one);
        ImageIcon icone_two = new ImageIcon("src/res/two.PNG");
        JButton two = new JButton(icone_two);
        ImageIcon icone_three = new ImageIcon("src/res/three.PNG");
        JButton three = new JButton(icone_three);
        ImageIcon icone_four = new ImageIcon("src/res/four.PNG");
        JButton four = new JButton(icone_four);
        ImageIcon icone_five = new ImageIcon("src/res/five.PNG");
        JButton five = new JButton(icone_five);
        ImageIcon icone_six = new ImageIcon("src/res/six.PNG");
        JButton six = new JButton(icone_six);
        ImageIcon icone_seven = new ImageIcon("src/res/seven.PNG");
        JButton seven = new JButton(icone_seven);
        ImageIcon icone_eight = new ImageIcon("src/res/eight.PNG");
        JButton eight = new JButton(icone_eight);
        ImageIcon icone_nine = new ImageIcon("src/res/nine.PNG");
        JButton nine = new JButton(icone_nine);
        ImageIcon logo = new ImageIcon("src/res/calculator icons.PNG");
        ImageIcon icone_add = new ImageIcon("src/res/add.PNG");
        JButton add = new JButton(icone_add);
        ImageIcon icone_minus = new ImageIcon("src/res/minus.PNG");
        JButton min = new JButton(icone_minus);
        ImageIcon icone_mult = new ImageIcon("src/res/mult.PNG");
        JButton mult = new JButton(icone_mult);
        ImageIcon icone_div = new ImageIcon("src/res/divide.PNG");
        JButton div = new JButton(icone_div);
        ImageIcon icone_result = new ImageIcon("src/res/result.PNG");
        JButton result = new JButton(icone_result);
        ImageIcon icone_delete = new ImageIcon("src/res/delete.PNG");
        JButton delete = new JButton(icone_delete);
        ImageIcon icone_clean = new ImageIcon("src/res/cancel.PNG");
        JButton clean = new JButton(icone_clean);

        //for adding a button on the frame
        Text.setBounds(4, 2, 278, 80);
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
        zero.setBounds(4, 317, 140, 50);
        result.setBounds(144, 317, 140, 50);

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "0";
                Text.setText(first_num);
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "1";
                Text.setText(first_num);
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "2";
                Text.setText(first_num);
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "3";
                Text.setText(first_num);
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "4";
                Text.setText(first_num);
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "5";
                Text.setText(first_num);
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "6";
                Text.setText(first_num);
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "7";
                Text.setText(first_num);
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "8";
                Text.setText(first_num);
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num += "9";
                Text.setText(first_num);
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second_num = first_num;
                first_num = "";
                math = "add";
                Text.setText("+");
            }
        });
        min.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second_num = first_num;
                first_num = "";
                math = "min";
                Text.setText("-");
            }
        });
        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second_num = first_num;
                first_num = "";
                math = "mult";
                Text.setText("*");
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second_num = first_num;
                first_num = "";
                math = "div";
                Text.setText("/");
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
            }
        });
        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = 0;
                switch (math) {
                    case "add":
                        result = Double.parseDouble(second_num) + Double.parseDouble(first_num);
                        break;
                    case "min":
                        result = Double.parseDouble(second_num) - Double.parseDouble(first_num);
                        break;
                    case "mult":
                        result = Double.parseDouble(second_num) * Double.parseDouble(first_num);
                        break;
                    case "div":
                        result = Double.parseDouble(second_num) / Double.parseDouble(first_num);
                        break;
                }
                Text.setText(String.valueOf(result));
                second_num = String.valueOf(result);
                first_num = "";
                math = "";
            }
        });

        f.add(Text);
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
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setTitle("Calculator");
        f.setSize(301, 410);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
