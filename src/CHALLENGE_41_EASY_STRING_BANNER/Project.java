package CHALLENGE_41_EASY_STRING_BANNER;
import javax.swing.JOptionPane; 

import javax.swing.*;

public class Project extends JFrame {
private String line = ""; 			// top and bottom lines
private String mid = "";			// user input with the side walls
private String newLine = "\n";                  // new line break
private String theText;				// user input

public void Project() {	}			
public static void main(final String[] args) {
        Project text = new Project();	// create object
        text.showDialog();				// show dialog for initial text input

    }

private void showDialog() {
	this.theText = JOptionPane.showInputDialog("Enter some text:");
        this.format();						// start formating text	

}
private void format() {
	for (int i = 0; i <= theText.length()+8; i++) {	// count user input and add twelve to account for the walls
		line += "-";									// start building the line
		if(i==theText.length()+8) {					// after the line is built, construct the middle with user input
		mid += "|   "+theText+"    |";	
		}
	}
	System.out.println(line+newLine+mid+newLine+line);	// print oout the result
}
}