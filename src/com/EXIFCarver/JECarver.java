package com.EXIFCarver;



import javax.swing.JFileChooser;
import java.io.File;
import java.util.Scanner;

public class JECarver 
{   
    private static File imageFile = null;
    
    // Display GUI interface to select file with 
    private static File getFileWithGUI() 
    {
        // Method objects
        File selectedFile = null;
        JFileChooser fileChooser = new JFileChooser();
        
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                     
        int result = 0;
        
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) 
        {
            selectedFile = fileChooser.getSelectedFile();            
        }
        
        return selectedFile;
    }
    
    // Get the input from the keyboard
    private static void getConsoleFileNamne()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter a file name: ");
        
        String fileName = scan.nextLine();
        
        System.out.println(fileName);
    }
    
    public static void main(String[] args) 
    {
        if (args.length > 0)
        {
            if (args[0].equals("gui"))
            {
                imageFile = getFileWithGUI();
                if (imageFile != null)
                {
                    try
                    {
                        System.out.println("Selected file: " + imageFile.getAbsolutePath());
                    }
                    catch(NullPointerException ex)
                    {
                    }
                    catch(Exception ex)
                    {
                    }
                }
            }
        }
        else
        {
            getConsoleFileNamne();
        }       
    }
}
