package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student Barbara = new Student (111288,"Mantovani","Barbara","barbimantovani@gmail.com","https://github.com/barbaramant/tdp-proyecto-1","file:///C:/Users/Usuario/Desktop/UNS/TdP/Proyecto%201/proyecto-1/src/images/IMG_20191201_124204.jpg");
            	SimplePresentationScreen nueva = new SimplePresentationScreen(Barbara);
            	nueva.setVisible(true);
            }
        });
    }
}