package com.EXIFCarver;

// Java imports
import java.io.File;
import java.io.IOException;
import java.util.List;

import com.EXIFCarver.FileTypes.*;

public class EXIF
{
    // Priavte variables for the class
    private File _file;
    private Object _obj;
    
    public EXIF(String filename)
    {
        this.setFile(filename);
        
        // Create the needed object
        String extension = getFileExtension(filename);
                
        //Class objcls = Class.forName(extension.toUpperCase()).newInstance();
        
        
    }
    
    private String getFileExtension(String filename)
    {        
        return filename.substring(filename.lastIndexOf("."));
    }
    
    public void setFile(String filename)
    {
       this._file = new File(filename);
    }
    
    private void setEXIFData() throws IOException
    {
        
    }
}
