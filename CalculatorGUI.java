import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.math.*;

public class CalculatorGUI implements ActionListener
{
    int count = 0;

    // Definition of global values and items that are part of the GUI.
    String firstNumAmount = "";
    String secondNumAmount = "";
    String answerNumAmount = "";
    String operation = "";

    JPanel titlePanel, inputPanel, buttonPanel;
    JLabel firstNumLabel, secondNumLabel, operationLabel, answerLabel, firstNum, secondNum, operationStr, answerNum;
    JButton oneButton, twoButton, threeButton, fourButton, fiveButton,sixButton, sevenButton, eightButton, nineButton, zeroButton, plusButton,minusButton, multiplyButton, divideButton, equalsButton, pointButton, deleteOneButton, deleteAllButton, deleteSectionButton, squareRootButton, squareButton, negateButton, percentButton;

    public CalculatorGUI()
    {

    }

    public JPanel createContentPane()
    {
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);
        totalGUI.setSize(500, 500);
        totalGUI.setVisible(true);

        // Creation of a Panel to have the title labels
        titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(10, 0);
        titlePanel.setSize(300, 300);
        totalGUI.add(titlePanel);

        firstNumLabel = new JLabel("1st");
        firstNumLabel.setLocation(0, 0);
        firstNumLabel.setSize(65, 30);
        firstNumLabel.setHorizontalAlignment(0);
        firstNumLabel.setForeground(Color.orange);
        titlePanel.add(firstNumLabel);

        operationLabel = new JLabel("Op");
        operationLabel.setLocation(65, 0);
        operationLabel.setSize(20, 30);
        operationLabel.setHorizontalAlignment(0);
        operationLabel.setForeground(Color.red);
        titlePanel.add(operationLabel);

        secondNumLabel = new JLabel("2nd");
        secondNumLabel.setLocation(85, 0);
        secondNumLabel.setSize(65, 30);
        secondNumLabel.setHorizontalAlignment(0);
        secondNumLabel.setForeground(Color.orange);
        titlePanel.add(secondNumLabel);

        answerLabel = new JLabel("Answer");
        answerLabel.setLocation(85, 40);
        answerLabel.setSize(65, 30);
        answerLabel.setHorizontalAlignment(0);
        answerLabel.setForeground(Color.darkGray);
        titlePanel.add(answerLabel);

        // Creation of a Panel to contain the inputs and answer labels
        // These are not currently being used

        inputPanel = new JPanel();
        inputPanel.setLayout(null);
        inputPanel.setLocation(10, 70);
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
        buttonPanel.setLocation(0, 40);
        buttonPanel.setSize(400, 400);
        totalGUI.add(buttonPanel);

        // Creating buttons 

        oneButton = new JButton("1");
        oneButton.setLocation(0, 150);
        oneButton.setSize(50, 50);
        oneButton.addActionListener(this);
        oneButton.setVisible(true);
        buttonPanel.add(oneButton);
        
        twoButton = new JButton("2");
        twoButton.setLocation(50, 150);
        twoButton.setSize(50, 50);
        twoButton.addActionListener(this);
        twoButton.setVisible(true);
        buttonPanel.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setLocation(100, 150);
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
        fourButton.setLocation(0, 200);
        fourButton.setSize(50, 50);
        fourButton.addActionListener(this);
        buttonPanel.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setLocation(50, 200);
        fiveButton.setSize(50, 50);
        fiveButton.addActionListener(this);
        buttonPanel.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setLocation(100, 200);
        sixButton.setSize(50, 50);
        sixButton.addActionListener(this);
        buttonPanel.add(sixButton);

        minusButton = new JButton("-");
        minusButton.setLocation(150, 150);
        minusButton.setSize(50, 50);
        minusButton.addActionListener(this);
        buttonPanel.add(minusButton);

        sevenButton = new JButton("7");
        sevenButton.setLocation(0, 250);
        sevenButton.setSize(50, 50);
        sevenButton.addActionListener(this);
        buttonPanel.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setLocation(50, 250);
        eightButton.setSize(50, 50);
        eightButton.addActionListener(this);
        buttonPanel.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setLocation(100, 250);
        nineButton.setSize(50, 50);
        nineButton.addActionListener(this);
        buttonPanel.add(nineButton);

        multiplyButton = new JButton("*");
        multiplyButton.setLocation(150, 200);
        multiplyButton.setSize(50, 50);
        multiplyButton.addActionListener(this);
        buttonPanel.add(multiplyButton);
        
        zeroButton = new JButton("0");
        zeroButton.setLocation(50, 300);
        zeroButton.setSize(50, 50);
        zeroButton.addActionListener(this);
        buttonPanel.add(zeroButton);

        pointButton = new JButton(".");
        pointButton.setLocation(100, 300);
        pointButton.setSize(50, 50);
        pointButton.addActionListener(this);
        buttonPanel.add(pointButton);

        equalsButton = new JButton("=");
        equalsButton.setLocation(150, 300);
        equalsButton.setSize(50, 50);
        equalsButton.addActionListener(this);
        buttonPanel.add(equalsButton);

        divideButton = new JButton("/");
        divideButton.setLocation(150, 250);
        divideButton.setSize(50, 50);
        divideButton.addActionListener(this);
        buttonPanel.add(divideButton);

        deleteOneButton = new JButton("<X");
        deleteOneButton.setLocation(150, 50);
        deleteOneButton.setSize(50, 50);
        deleteOneButton.addActionListener(this);
        buttonPanel.add(deleteOneButton);

        deleteAllButton = new JButton("C");
        deleteAllButton.setLocation(100, 50);
        deleteAllButton.setSize(50, 50);
        deleteAllButton.addActionListener(this);
        buttonPanel.add(deleteAllButton);

        deleteSectionButton = new JButton("CE");
        deleteSectionButton.setLocation(49, 50);
        deleteSectionButton.setSize(51,50);
        deleteSectionButton.addActionListener(this);
        buttonPanel.add(deleteSectionButton);

        squareButton = new JButton("^2");
        squareButton.setLocation(0, 100);
        squareButton.setSize(75,50);
        squareButton.addActionListener(this);
        buttonPanel.add(squareButton);

        squareRootButton = new JButton("sqrt");
        squareRootButton.setLocation(75, 100);
        squareRootButton.setSize(75, 50);
        squareRootButton.addActionListener(this);
        buttonPanel.add(squareRootButton);

        negateButton = new JButton("+/-");
        negateButton.setLocation(0,300);
        negateButton.setSize(50, 50);
        negateButton.addActionListener(this);
        buttonPanel.add(negateButton);

        percentButton = new JButton("%");
        percentButton.setLocation(0, 50);
        percentButton.setSize(50, 50);
        percentButton.addActionListener(this);
        buttonPanel.add(percentButton);
        
        return totalGUI;
    } // end createcontentpane

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
                operation += "*";
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
            
            this.answerLabel.setText("" + this.answerNumAmount);
            //this.answerNumAmount = "";
        } // end if

        if (e.getSource() == deleteOneButton)
        {
            this.deleteOneButtonMethod();
        } // end if

        if (e.getSource() == deleteAllButton)
        {
            this.deleteAllButtonMethod();
        } // end if

        if(e.getSource() == deleteSectionButton)
        {
            this.deleteSectionButtonMethod();
        } // end if

        if (e.getSource() ==  squareButton)
        {
            secondNumLabel.setText("");
            operation = "^2";
            equalsButtonMethod();
        } // end if 

        if (e.getSource() == negateButton)
        {
            if (operation.equals(""))
            {
                if (firstNumAmount.substring(0, 1).equals("-"))
                {
                    firstNumAmount = firstNumAmount.substring(1, firstNumAmount.length());
                } // end if 
                else
                {
                    this.firstNumAmount = "-" + this.firstNumAmount;
                } // end else
                firstNumLabel.setText(firstNumAmount);
            } // end if 
            else
            {
                if (secondNumAmount.substring(0, 1).equals("-"))
                {
                    secondNumAmount = secondNumAmount.substring(1, secondNumAmount.length());
                } // end if 
                else
                {
                    this.secondNumAmount = "-" + this.secondNumAmount;
                } // end else
                secondNumLabel.setText(secondNumAmount);
            } // end else
        } // end if

        if (e.getSource() == percentButton)
        {
            float comp;
            if (operation.equals(""))
            {
                comp = Float.parseFloat(firstNumAmount) / 100;
                firstNumAmount = Float.toString(comp);
                firstNumLabel.setText(firstNumAmount);
            } // end if
            else 
            {
                comp = Float.parseFloat(secondNumAmount) / 100;
                secondNumAmount = Float.toString(comp);
                secondNumLabel.setText(secondNumAmount);
            } // end else
        } // end if 

        
        if (e.getSource() == squareRootButton)
        {
            secondNumLabel.setText("");
            operation = "sqrt";
            equalsButtonMethod();   
        }
    } // end actionPerformed

    // Performs the function of the equalsButton
    public void equalsButtonMethod()
    {
        float computation;
        if (!(this.firstNumAmount.equals("")) && !(this.secondNumAmount.equals("")))
        {
            if (this.operation.equals("+"))
            {
                computation = Float.parseFloat(this.firstNumAmount) + Float.parseFloat(this.secondNumAmount);
                this.answerNumAmount = Float.toString(computation);
            }

            if (this.operation.equals("-"))
            {
                computation = Float.parseFloat(this.firstNumAmount) - Float.parseFloat(this.secondNumAmount);
                this.answerNumAmount = Float.toString(computation);
            }

            if (this.operation.equals("*"))
            {
                computation = Float.parseFloat(this.firstNumAmount) * Float.parseFloat(this.secondNumAmount);
                this.answerNumAmount = Float.toString(computation);;
            }
            // ****NEED TO FIX FOR MULTIPLE 0 INPUT***
            if (this.operation.equals("/"))
            {
                boolean result = true;
                for (int i = 1; i < this.secondNumAmount.length(); i++) 
                    if (secondNumAmount.charAt(i) != secondNumAmount.charAt(0)) 
                        result = false; 

                if (result == true)
                {
                    computation = Float.parseFloat(this.firstNumAmount) / Float.parseFloat(this.secondNumAmount);
                    this.answerNumAmount = Float.toString(computation);
                } // end if
                else if(result == false)
                {
                    answerNumAmount = "Can't /0";
                    answerLabel.setText("" + answerNumAmount);
                } // end else
            } // end if 

        } // end if
        else
        {
            if (this.operation.equals("^2"))
            {
                computation = Float.parseFloat(this.firstNumAmount) * Float.parseFloat(this.firstNumAmount);
                answerNumAmount = Float.toString(computation);
                answerLabel.setText("" + answerNumAmount);
            } // end if

            if (this.operation.equals("sqrt"))
            {
                double comp =  Math.sqrt(Double.parseDouble(this.firstNumAmount));
                answerNumAmount = Double.toString(comp);
                answerLabel.setText("" + answerNumAmount);
            }
        } // end else
      
        this.firstNumLabel.setText("1st");
        this.firstNumAmount = "";

        this.secondNumLabel.setText("2nd");
        this.secondNumAmount = "";

        this.operationLabel.setText("Op");
        this.operation = "";
    } // end equalsButtonMethod

    // Performs the function of the deleteOneButton
    public void deleteOneButtonMethod()
    {
        if (this.operation.equals(""))
        {
            this.firstNumAmount = this.firstNumAmount.substring(0, this.firstNumAmount.length() - 1);
            this.firstNumLabel.setText("" + this.firstNumAmount);
        } // end if
        else if (!(this.firstNumAmount.equals("")) && this.secondNumAmount.equals(""))
        {
            this.operation = this.operation.substring(0, this.operation.length() - 1);
            this.operationLabel.setText("" + this.operation);
        } // end else if
        //if (!(this.firstNumAmount.equals("")) && !(this.operation.length() > 0))
        else
        {
            this.secondNumAmount = this.secondNumAmount.substring(0, this.secondNumAmount.length() - 1);
            this.secondNumLabel.setText("" + secondNumAmount);
        } // end else
    } // end deleteOneButtonMethod

    // Performs the action of the deleteSectionButton
    public void deleteSectionButtonMethod()
    {
        if (this.operation.equals(""))
        {
            this.firstNumAmount = "";
            this.firstNumLabel.setText("1st");
        } // end if   
        else
        {
            this.secondNumAmount = "";
            this.secondNumLabel.setText("2nd");
        }
    } // end deleteSectionButtonMethod

    public void deleteAllButtonMethod()
    {
        this.firstNumLabel.setText("1st");
        this.firstNumAmount = "";

        this.secondNumLabel.setText("2nd");
        this.secondNumAmount = "";

        this.operationLabel.setText("Op");
        this.operation = "";
    }
    // Checks if an input number is too long
    public boolean tooLong()
    {
        boolean result = false;

        if (this.firstNumAmount.length() > 9)
        {
            result = true;
        } // end if

        return result;
    } // end tooLong
}

