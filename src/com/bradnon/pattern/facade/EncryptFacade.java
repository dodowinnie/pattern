package com.bradnon.pattern.facade;

import java.io.FileWriter;

/**
 * 外观类
 */
public class EncryptFacade {

    private FileReader reader;
    private CipherMachine cipherMachine;
    private FileSave writer;

    public EncryptFacade() {
        this.reader = new FileReader();
        this.cipherMachine = new CipherMachine();
        this.writer = new FileSave();
    }

    public void password(String src, String desc){
        String word = reader.read(src);
        String encrypt = cipherMachine.encrypt(word);
        writer.wirte(encrypt, desc);
    }
}
