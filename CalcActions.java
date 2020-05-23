import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcActions extends AbstractAction
{
    private JButton oneButton, twoButton, threeButton, fourButton, fiveButton,sixButton, sevenButton, eightButton, nineButton, zeroButton, plusButton,minusButton, multiplyButton, divideButton, equalsButton, pointButton;
    
    private JLabel firstNumLabel, secondNumLabel, operationLabel, answerLabel, firstNum, secondNum, operationStr, answerNum;

    private String firstNumAmount = "";
    private String secondNumAmount = "";
    private String answerNumAmount = "";
    private String operation = "";

    public CalcActions(String buttonName)
    {
        super(buttonName);
    }

    public void actionPerformed(ActionEvent e, String firstNumAmount, String secondNumAmount, String answerNumAmount, String operation)
    {
                
        // CalcActions action = new CalcActions()
        if (e.getSource() == oneButton)
        {   
            if (operation.equals(""))
            {
                this.firstNumAmount += "1";
                this.firstNumLabel.setText("" + this.firstNumAmount);
            } // end if
            else 
            {
                this.secondNumAmount += "1";
                this.secondNumLabel.setText("" + this.secondNumAmount);
            } // end else
        } // end if

        if (e.getSource() == twoButton)
        {   
            if (operation.equals(""))
            {
                this.firstNumAmount += "2";
                this.firstNumLabel.setText("" + this.firstNumAmount);
            } // end if 
            else 
            {
                this.secondNumAmount += "2";
                this.secondNumLabel.setText("" + this.secondNumAmount);
            }  // end else
        } //end if
        
        if (e.getSource() == threeButton)
        {   
            if (operation.equals(""))
            {
                this.firstNumAmount += "3";
                this.firstNumLabel.setText("" + this.firstNumAmount);
            } // end if
            else 
            {
                this.secondNumAmount += "3";
                this.secondNumLabel.setText("" + this.secondNumAmount);
            } // end else
        } // end if

        if (e.getSource() == fourButton)
        {   
            if (operation.equals(""))
            {
                this.firstNumAmount += "4";
                this.firstNumLabel.setText("" + this.firstNumAmount);
            } // end if 
            else 
            {
                this.secondNumAmount += "4";
                this.secondNumLabel.setText("" + this.secondNumAmount);
            } // end else
        } // end

        if (e.getSource() == fiveButton)
        {   
            if (operation.equals(""))
            {
                this.firstNumAmount += "5";
                this.firstNumLabel.setText("" + this.firstNumAmount);
            } // end if
            else 
            {
                this.secondNumAmount += "5";
                this.secondNumLabel.setText("" + this.secondNumAmount);
            } // end else
        } // end if

        if (e.getSource() == sixButton)
        {   
            if (operation.equals(""))
            {
                this.firstNumAmount += "6";
                this.firstNumLabel.setText("" + this.firstNumAmount);
            } // end if
            else 
            {
                this.secondNumAmount += "6";
                this.secondNumLabel.setText("" + this.secondNumAmount);
            } // end else
        } // end if

        if (e.getSource() == sevenButton)
        {   
            if (operation.equals(""))
            {
                this.firstNumAmount += "7";
                this.firstNumLabel.setText("" + this.firstNumAmount);
            } // end if
            else 
            {
                this.secondNumAmount += "7";
                this.secondNumLabel.setText("" + this.secondNumAmount);
            } // end else
        } // end if

        if (e.getSource() == eightButton)
        {   
            if (operation.equals(""))
            {
                this.firstNumAmount += "8";
                this.firstNumLabel.setText("" + this.firstNumAmount);
            } // end if
            else 
            {
                this.secondNumAmount += "8";
                this.secondNumLabel.setText("" + this.secondNumAmount);
            } // end else
        } // end if

        if (e.getSource() == nineButton)
        {   
            if (operation.equals(""))
            {
                this.firstNumAmount += "9";
                this.firstNumLabel.setText("" + this.firstNumAmount);
            } // end if
            else 
            {
                this.secondNumAmount += "9";
                this.secondNumLabel.setText("" + this.secondNumAmount);
            } // end else
        } // end if

        if (e.getSource() == zeroButton)
        {   
            if (operation.equals(""))
            {
                this.firstNumAmount += "0";
                this.firstNumLabel.setText("" + this.firstNumAmount);
            } // end if
            else 
            {
                this.secondNumAmount += "0";
                this.secondNumLabel.setText("" + this.secondNumAmount);
            } // end else 
        } // end if

        if (e.getSource() == plusButton)
        {   if (!(this.firstNumAmount.equals("")) &&operation.equals(""))
            {
                operation += "+";
                operationLabel.setText("" + operation);
            } // end if
        } // end if

        if (e.getSource() == minusButton)
        {   if (!(this.firstNumAmount.equals("")) &&operation.equals(""))
            {
                operation += "-";
                operationLabel.setText("" + operation);
            } // end if
        } // end if

        if (e.getSource() == multiplyButton)
        {   if (!(this.firstNumAmount.equals("")) && operation.equals(""))
            {
                operation += "x";
                operationLabel.setText("" + operation);
            } // end if
        } // end if

        if (e.getSource() == divideButton)
        {   if (!(this.firstNumAmount.equals("")) && operation.equals(""))
            {
                operation += "/";
                operationLabel.setText("" + operation);
            } // end if
        } // end if

        if(e.getSource() == pointButton)
        {
                if (operation.equals(""))
                {
                    if (this.firstNumAmount.indexOf(".") == -1)
                    {
                        this.firstNumAmount += ".";
                        this.firstNumLabel.setText("" + this.firstNumAmount);
                    } // end if
                } // end if
                else 
                {   
                    if (this.firstNumAmount.indexOf(".") == -1)
                    {
                        this.secondNumAmount += ".";
                        this.secondNumLabel.setText("" + this.secondNumAmount);
                    } // end if
                }  // end else
        } // end if

        if(e.getSource() == equalsButton)
        {
            if (!(this.firstNumAmount.equals("")) && !(this.secondNumAmount.equals("")))
            {
                if (operat)
            }
        }
    }

    public String getFirstNumAmount()
    {
        return this.firstNumAmount;
    } // end getFirstNumAmount

    public String getSecondNumAmount()
    {
        return this.secondNumAmount;
    } // end getSecondNumAmount

    public String getAnswerNumAmount()
    {
        return this.answerNumAmount;
    } // end getAnswerNumAmount

    public void setFirstNumAmount(String e)
    {
        this.firstNumAmount = e;
    } // end setFirstNumAmount

    public void setSecondNumAmount(String e)
    {
        this.secondNumAmount = e;
    } // end setSecondNumAmount

    public void setAnswerNumAmount(String e)
    {
        this.answerNumAmount = e;
    } // end setAnswerNumAmount
}