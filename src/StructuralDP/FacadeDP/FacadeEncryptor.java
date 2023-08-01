package StructuralDP.FacadeDP;

public class FacadeEncryptor {

    private AESEncryptor aes = new AESEncryptor();
    private MD5Encryptor md5 = new MD5Encryptor();
    private SHAEncryptor sha = new SHAEncryptor();

    public void encryptor(String text, EncryptType encryptType){
        switch (encryptType){
            case MD5:
                md5.encrypt(text, "secretKey1");
                break;
            case AES:
                aes.encrypt(text);
                break;
            case SHA:
                sha.encrypt(text, "secretKey2");
                break;
            default:
                throw new IllegalArgumentException(encryptType.toString());

        }
    }

    public enum EncryptType{
        MD5,
        AES,
        SHA
    }




















}