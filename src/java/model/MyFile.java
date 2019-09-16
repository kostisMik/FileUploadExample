/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Blob;

/**
 *
 * @author Kostis.Mikroulis
 */
public class MyFile {
    private int id;
    private String filename;
    private byte[] theFile;
    private Blob thefileasBlob;

    public MyFile() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public byte[] getTheFile() {
        return theFile;
    }

    public void setTheFile(byte[] theFile) {
        this.theFile = theFile;
    }

    public Blob getThefileasBlob() {
        return thefileasBlob;
    }

    public void setThefileasBlob(Blob thefileasBlob) {
        this.thefileasBlob = thefileasBlob;
    }
    
}
