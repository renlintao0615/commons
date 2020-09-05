package com.yyskt.commons.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class Encryptor {
	 
    public static void main(String[] args) {
        // 加密
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("yysktrlt");
        String newPassword = textEncryptor.encrypt("abc1176478896");
        System.out.println(newPassword);
        // 解密
        BasicTextEncryptor textEncryptor2 = new BasicTextEncryptor();
        textEncryptor2.setPassword("yysktrlt");
        String oldPassword = textEncryptor2.decrypt(newPassword);
        System.out.println(oldPassword);
        System.out.println("--------------------------");
     
    }
    
    /**
          * 加密
     * @param encryptStr
     * @param privatekey
     * @return
     */
    public static String encrypt(String encryptStr,String privatekey)
    {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(privatekey);
        return textEncryptor.encrypt(encryptStr);
    }
    
    /**
           * 解密
     * @param decryptStr
     * @param privatekey
     * @return
     */
    public static String decrypt(String decryptStr,String privatekey)
    {
    	BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
    	textEncryptor.setPassword(privatekey);
    	return textEncryptor.decrypt(decryptStr);
    }
}
