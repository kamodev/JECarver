package com.baguladevelopment.EXIFCarver.FileTypes;

public class FileType 
{
    protected String _filename;
    
    public FileType()
    {
        
    }
    
    public void setFilename(String filename)
    {
        this._filename = filename;
    }
       
    public String getFilename()
    {
        return this._filename;
    }    
}
