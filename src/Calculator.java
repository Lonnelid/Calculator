import javax.swing.*;

public class Calculator {
    private JPanel Calculator;
    private JTextField displayText;
    private JButton zero;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton dot;
    private JButton addition;
    private JButton subtraction;
    private JButton multiplication;
    private JButton division;
    private JButton equals;
    private JButton AC;


    double a, b, calculation;
    String operator;


    public Calculator() {
        displayText.setBorder(BorderFactory.createEmptyBorder());

        one.addActionListener(buttonToDisplay -> {
            displayText.setText(displayText.getText() + one.getText());
        });
        two.addActionListener(buttonToDisplay -> {
            displayText.setText(displayText.getText() + two.getText());
        });
        three.addActionListener(buttonToDisplay -> {
            displayText.setText(displayText.getText() + three.getText());
        });
        four.addActionListener(buttonToDisplay -> {
            displayText.setText(displayText.getText() + four.getText());
        });
        five.addActionListener(buttonToDisplay -> {
            displayText.setText(displayText.getText() + five.getText());
        });
        six.addActionListener(buttonToDisplay -> {
            displayText.setText(displayText.getText() + six.getText());
        });
        seven.addActionListener(buttonToDisplay -> {
            displayText.setText(displayText.getText() + seven.getText());
        });
        eight.addActionListener(buttonToDisplay -> {
            displayText.setText(displayText.getText() + eight.getText());
        });
        nine.addActionListener(buttonToDisplay -> {
            displayText.setText(displayText.getText() + nine.getText());
        });
        zero.addActionListener(buttonToDisplay -> {
            displayText.setText(displayText.getText() + zero.getText());
        });
        dot.addActionListener(buttonToDisplay -> {
            if (!displayText.getText().contains(".")) {
                displayText.setText(displayText.getText() + dot.getText());
            }

        });
        addition.addActionListener(additionAction -> {
            addition.setOpaque(true);
            a = Double.parseDouble(displayText.getText());
            operator = "+";
            displayText.setText("");

        });
        subtraction.addActionListener(subtractionAction -> {
            a = Double.parseDouble(displayText.getText());
            operator = "-";
            displayText.setText("");
        });
        multiplication.addActionListener(multiplicationAction -> {
            a = Double.parseDouble(displayText.getText());
            operator = "*";
            displayText.setText("");
        });
        division.addActionListener(divisionAction -> {
            a = Double.parseDouble(displayText.getText());
            operator = "/";
            displayText.setText("");
        });
        equals.addActionListener(equalsAction -> {
           b = Double.parseDouble(displayText.getText());

            switch (operator) {
                case "+" -> {
                    calculation = a + b;
                    displayText.setText(String.valueOf(calculation));
                }
                case "-" -> {
                    calculation = a - b;
                    displayText.setText(String.valueOf(calculation));
                }
                case "*" -> {
                    calculation = a * b;
                    displayText.setText(String.valueOf(calculation));
                }
                case "/" -> {
                    calculation = a / b;
                    displayText.setText(String.valueOf(calculation));
                }
            }
        });
        AC.addActionListener(acAction -> {
            displayText.setText("");
            operator = "";
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}