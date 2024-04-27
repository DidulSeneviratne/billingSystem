/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billingsystem;

/**
 *
 * @author DulsaraDidul
 */
import java.awt.*;
import java.awt.print.*;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import static billingsystem.Home.bill;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomPrintExample implements Printable {

    private JTextArea textArea;

    public CustomPrintExample(JTextArea textArea) {
        this.textArea = textArea;
    }

    public void print() {
        try {
            textArea.print();
        } catch (PrinterException ex) {
            Logger.getLogger(CustomPrintExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return Printable.NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        // Adjust border size
        //textArea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); // Example: 2-pixel border
        EmptyBorder border = new EmptyBorder(1, 1, 1, 1);
        textArea.setBorder(border);

        // Draw JTextArea content
        textArea.paint(g2d);

        return Printable.PAGE_EXISTS;
    }

    public static void main(String[] args) {
        Home frame = new Home(bill);
        JTextArea textArea = frame.getTextArea();
        // Create a CustomPrintExample with the JTextArea from AnotherFrame
        CustomPrintExample customPrintExample = new CustomPrintExample(textArea);
        customPrintExample.print();
    }
}

