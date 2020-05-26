import javax.swing.*;

public class CalcMain
{
    private static void createAndShowGUI() 
    {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("{+-/x} Calculator {x/-+}");

        //Create and set up the content pane.
        CalculatorGUI demo = new CalculatorGUI();
        frame.setContentPane(demo.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 450);
        frame.setVisible(true);
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