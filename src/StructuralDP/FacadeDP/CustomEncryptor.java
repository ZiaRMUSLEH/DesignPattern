package StructuralDP.FacadeDP;

public class CustomEncryptor {
    public static void main(String[] args) {

        String text = "content";

        // Bad Way
        /*
        AESEncryptor aes = new AESEncryptor();
        aes.encrypt(text);

        MD5Encryptor md5 = new MD5Encryptor();
        md5.encrypt(text, "secretKey1");

        SHAEncryptor sha = new SHAEncryptor();
        sha.encrypt(text, "secretKey2");
        */

        // Better Way
        FacadeEncryptor facadeEncryptor = new FacadeEncryptor();
        facadeEncryptor.encryptor(text, FacadeEncryptor.EncryptType.MD5);
        facadeEncryptor.encryptor(text, FacadeEncryptor.EncryptType.AES);
        facadeEncryptor.encryptor(text, FacadeEncryptor.EncryptType.SHA);



    }
}