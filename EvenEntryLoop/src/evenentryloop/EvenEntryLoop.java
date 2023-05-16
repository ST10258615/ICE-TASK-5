
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Write an application that asks a user to type an even number or the sentinel value 999
to stop. When the user types an even number, display the message “Good job!” and
then ask for another input. When the user types an odd number, display an error
message and then ask for another input. When the user types the sentinel value 999,
end the program. Save the file as EvenEntryLoop.java
package evenentryloop;

/**
 *
 * @author lab_services_student
 */
public class EvenEntryLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Please enter an even number"));
        while(num != 999)
        {
            if(num%2 == 0)
            {
                JOptionPane.showMessageDialog(null, "Good Job");
                num = Integer.parseInt(JOptionPane.showInputDialog("Please enter an even number"));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "I said even number >:(");
                num = Integer.parseInt(JOptionPane.showInputDialog("Please enter an even number"));
            }
        }
        
         
    }
    
}
