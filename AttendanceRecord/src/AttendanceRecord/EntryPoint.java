package AttendanceRecord;

import javax.swing.*;

import org.jdesktop.swingx.JXDatePicker;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/*
 * This EntryPoint class acts as connection to the main functionality of the entire Application.
 */
public class EntryPoint {
	
    public static void main(String[] args) {
    	System.out.println("Welcome to the Attendance Record System");
        Application app = new Application();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(app.getPreferredSize());
        JLabel generalMessage = new JLabel();
        generalMessage.setText("Welcome");
        app.add(generalMessage);
       
        app.setVisible(true);
    }
}
