import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class Calculator implements ActionListener
{
    int count = 0;

    // Definition of global values and items that are part of the GUI.
    String firstNumAmount = "";
    String secondNumAmount = "";
    String answerNumAmount = "";
    String operation = "";

    JPanel titlePanel, inputPanel, buttonPanel;
    JLabel firstNumLabel, secondNumLabel, operationLabel, answerLabel, firstNum, secondNum, operationStr, answerNum;
    JButton oneButton, twoButton, threeButton, fourButton, fiveButton,sixButton, sevenButton, eightButton, nineButton, zeroButton, plusButton,minusButton, multiplyButton, divideButton, equalsButton, pointButton;

    public JPanel createContentPane()
    {
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);
        totalGUI.setSize(1000, 1000);
        totalGUI.setVisible(true);

        // Creation of a Panel to have the title labels
        titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(10, 0);
        titlePanel.setSize(1000, 1000);
        totalGUI.add(titlePanel);

        firstNumLabel = new JLabel("First #");
        firstNumLabel.setLocation(0, 0);
        firstNumLabel.setSize(50, 30);
        firstNumLabel.setHorizontalAlignment(0);
        firstNumLabel.setForeground(Color.orange);
        titlePanel.add(firstNumLabel);

        operationLabel = new JLabel("Operation");
        operationLabel.setLocation(50, 0);
        operationLabel.setSize(50, 30);
        operationLabel.setHorizontalAlignment(0);
        operationLabel.setForeground(Color.red);
        titlePanel.add(operationLabel);

        secondNumLabel = new JLabel("Second #");
        secondNumLabel.setLocation(110, 0);
        secondNumLabel.setSize(50, 30);
        secondNumLabel.setHorizontalAlignment(0);
        secondNumLabel.setForeground(Color.orange);
        titlePanel.add(secondNumLabel);

        answerLabel = new JLabel("Answer");
        answerLabel.setLocation(170, 0);
        answerLabel.setSize(50, 30);
        answerLabel.setHorizontalAlignment(0);
        answerLabel.setForeground(Color.green);
        titlePanel.add(answerLabel);

        // Creation of a Panel to contain the inputs and answer labels

        inputPanel = new JPanel();
        inputPanel.setLayout(null);
        inputPanel.setLocation(10, 40);
        inputPanel.setSize(260, 30);
        totalGUI.add(inputPanel);

        firstNum = new JLabel(""+ firstNumAmount);
        firstNum.setLocation(0, 0);
        firstNum.setSize(120, 30);
        firstNum.setHorizontalAlignment(0);
        inputPanel.add(firstNum);

        operationStr = new JLabel(""+ operation);
        operationStr.setLocation(0, 0);
        operationStr.setSize(120, 30);
        operationStr.setHorizontalAlignment(0);
        inputPanel.add(operationStr);

        secondNum = new JLabel(""+ secondNumAmount);
        secondNum.setLocation(0, 0);
        secondNum.setSize(120, 30);
        secondNum.setHorizontalAlignment(0);
        inputPanel.add(secondNum);

        answerNum = new JLabel(""+ answerNumAmount);
        answerNum.setLocation(0, 0);
        answerNum.setSize(120, 30);
        answerNum.setHorizontalAlignment(0);
        inputPanel.add(answerNum);

        // Creation of a Panel to contain all the JButtons.
        // CHANGE THE SIZE OF THESE PANELS TO MAKE EVERYTHING FIT
        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(0, 0);
        buttonPanel.setSize(1000, 1000);
        totalGUI.add(buttonPanel);

        // Creating buttons 

        oneButton = new JButton("1");
        oneButton.setLocation(0, 100);
        oneButton.setSize(50, 50);
        oneButton.addActionListener(this);
        oneButton.setVisible(true);
        buttonPanel.add(oneButton);
        
        twoButton = new JButton("2");
        twoButton.setLocation(50, 100);
        twoButton.setSize(50, 50);
        twoButton.addActionListener(this);
        twoButton.setVisible(true);
        buttonPanel.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setLocation(100, 100);
        threeButton.setSize(50, 50);
        threeButton.addActionListener(this);
        threeButton.setVisible(true);
        buttonPanel.add(threeButton);

        plusButton = new JButton("+");
        plusButton.setLocation(150, 100);
        plusButton.setSize(50, 50);
        plusButton.addActionListener(this);
        plusButton.setVisible(true);
        buttonPanel.add(plusButton);

        
        fourButton = new JButton("4");
        fourButton.setLocation(0, 150);
        fourButton.setSize(50, 50);
        fourButton.addActionListener(this);
        buttonPanel.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setLocation(50, 150);
        fiveButton.setSize(50, 50);
        fiveButton.addActionListener(this);
        buttonPanel.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setLocation(100, 150);
        sixButton.setSize(50, 50);
        sixButton.addActionListener(this);
        buttonPanel.add(sixButton);

        minusButton = new JButton("-");
        minusButton.setLocation(150, 150);
        minusButton.setSize(50, 50);
        minusButton.addActionListener(this);
        buttonPanel.add(minusButton);

        sevenButton = new JButton("7");
        sevenButton.setLocation(0, 200);
        sevenButton.setSize(50, 50);
        sevenButton.addActionListener(this);
        buttonPanel.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setLocation(50, 200);
        eightButton.setSize(50, 50);
        eightButton.addActionListener(this);
        buttonPanel.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setLocation(100, 200);
        nineButton.setSize(50, 50);
        nineButton.addActionListener(this);
        buttonPanel.add(nineButton);

        multiplyButton = new JButton("*");
        multiplyButton.setLocation(150, 200);
        multiplyButton.setSize(50, 50);
        multiplyButton.addActionListener(this);
        buttonPanel.add(multiplyButton);
        
        zeroButton = new JButton("0");
        zeroButton.setLocation(50, 250);
        zeroButton.setSize(50, 50);
        zeroButton.addActionListener(this);
        buttonPanel.add(zeroButton);

        pointButton = new JButton(".");
        pointButton.setLocation(100, 250);
        pointButton.setSize(50, 50);
        pointButton.addActionListener(this);
        buttonPanel.add(pointButton);

        equalsButton = new JButton("=");
        equalsButton.setLocation(0, 250);
        equalsButton.setSize(50, 50);
        equalsButton.addActionListener(this);
        buttonPanel.add(equalsButton);

        divideButton = new JButton("/");
        divideButton.setLocation(150, 250);
        divideButton.setSize(50, 50);
        divideButton.addActionListener(this);
        buttonPanel.add(divideButton);
        
        return totalGUI;
    }

    private static void createAndShowGUI() 
    {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("{+-/x} Calculator {x/-+}");

        //Create and set up the content pane.
        Calculator demo = new Calculator();
        frame.setContentPane(demo.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        // CalcActions action = new CalcActions()
        if (e.getSource() == oneButton)
        {   
            if (operation.equals(""))
            {
                firstNumAmount += "1";
                firstNumLabel.setText("" + firstNumAmount);
            } // end if
            else 
            {
                secondNumAmount += "1";
                secondNumLabel.setText("" + secondNumAmount);
            } // end else
        } // end if

        if (e.getSource() == twoButton)
        {   
            if (operation.equals(""))
            {
                firstNumAmount += "2";
                firstNumLabel.setText("" + firstNumAmount);
            } // end if 
            else 
            {
                secondNumAmount += "2";
                secondNumLabel.setText("" + secondNumAmount);
            }  // end else
        } //end if
        
        if (e.getSource() == threeButton)
        {   
            if (operation.equals(""))
            {
                firstNumAmount += "3";
                firstNumLabel.setText("" + firstNumAmount);
            } // end if
            else 
            {
                secondNumAmount += "3";
                secondNumLabel.setText("" + secondNumAmount);
            } // end else
        } // end if

        if (e.getSource() == fourButton)
        {   
            if (operation.equals(""))
            {
                firstNumAmount += "4";
                firstNumLabel.setText("" + firstNumAmount);
            } // end if 
            else 
            {
                secondNumAmount += "4";
                secondNumLabel.setText("" + secondNumAmount);
            } // end else
        } // end

        if (e.getSource() == fiveButton)
        {   
            if (operation.equals(""))
            {
                firstNumAmount += "5";
                firstNumLabel.setText("" + firstNumAmount);
            } // end if
            else 
            {
                secondNumAmount += "5";
                secondNumLabel.setText("" + secondNumAmount);
            } // end else
        } // end if

        if (e.getSource() == sixButton)
        {   
            if (operation.equals(""))
            {
                firstNumAmount += "6";
                firstNumLabel.setText("" + firstNumAmount);
            } // end if
            else 
            {
                secondNumAmount += "6";
                secondNumLabel.setText("" + secondNumAmount);
            } // end else
        } // end if

        if (e.getSource() == sevenButton)
        {   
            if (operation.equals(""))
            {
                firstNumAmount += "7";
                firstNumLabel.setText("" + firstNumAmount);
            } // end if
            else 
            {
                secondNumAmount += "7";
                secondNumLabel.setText("" + secondNumAmount);
            } // end else
        } // end if

        if (e.getSource() == eightButton)
        {   
            if (operation.equals(""))
            {
                firstNumAmount += "8";
                firstNumLabel.setText("" + firstNumAmount);
            } // end if
            else 
            {
                secondNumAmount += "8";
                secondNumLabel.setText("" + secondNumAmount);
            } // end else
        } // end if

        if (e.getSource() == nineButton)
        {   
            if (operation.equals(""))
            {
                firstNumAmount += "9";
                firstNumLabel.setText("" + firstNumAmount);
            } // end if
            else 
            {
                secondNumAmount += "9";
                secondNumLabel.setText("" + secondNumAmount);
            } // end else
        } // end if

        if (e.getSource() == zeroButton)
        {   
            if (operation.equals(""))
            {
                firstNumAmount += "0";
                firstNumLabel.setText("" + firstNumAmount);
            } // end if
            else 
            {
                secondNumAmount += "0";
                secondNumLabel.setText("" + secondNumAmount);
            } // end else 
        } // end if

        if (e.getSource() == plusButton)
        {   if (!(firstNumAmount.equals("")) &&operation.equals(""))
            {
                operation += "+";
                operationLabel.setText("" + operation);
            } // end if
        } // end if

        if (e.getSource() == minusButton)
        {   if (!(firstNumAmount.equals("")) &&operation.equals(""))
            {
                operation += "-";
                operationLabel.setText("" + operation);
            } // end if
        } // end if

        if (e.getSource() == multiplyButton)
        {   if (!(firstNumAmount.equals("")) && operation.equals(""))
            {
                operation += "x";
                operationLabel.setText("" + operation);
            } // end if
        } // end if

        if (e.getSource() == divideButton)
        {   if (!(firstNumAmount.equals("")) && operation.equals(""))
            {
                operation += "/";
                operationLabel.setText("" + operation);
            } // end if
        } // end if

        if(e.getSource() == pointButton)
        {
                if (operation.equals(""))
                {
                    if (firstNumAmount.indexOf(".") == -1)
                    {
                        firstNumAmount += ".";
                        firstNumLabel.setText("" + firstNumAmount);
                    } // end if
                } // end if
                else 
                {   
                    if (firstNumAmount.indexOf(".") == -1)
                    {
                        secondNumAmount += ".";
                        secondNumLabel.setText("" + secondNumAmount);
                    } // end if
                }  // end else
        } // end if

        if(e.getSource() == equalsButton)
        {
            this.equalsButtonMethod();
            answerLabel.setText("" + answerNumAmount);

        }
    } // end actionPerformed

    public void equalsButtonMethod()
    {
        if (!(this.firstNumAmount.equals("")) && !(this.secondNumAmount.equals("")))
            {
                if (this.operation.equals("+"))
                {
                    answerNumAmount = this.firstNumAmount.parseFloat(this.firstNumAmount) + parseFloat(this.secondNumAmount);
                }

                if (this.operation.equals("-"))
                {
                    
                }

                if (this.operation.equals("*"))
                {
                    
                }

                if (this.operation.equals("/"))
                {
                    
                }
            }
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}