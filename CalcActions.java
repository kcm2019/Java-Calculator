import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcActions extends AbstractAction
{
    public CalcActions(String buttonName)
    {
        super(buttonName);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == oneButton)
        {
            firstNumAmount = 1.0;
            firstNumLabel.setText("" + firstNumAmount);
        }
    }
}