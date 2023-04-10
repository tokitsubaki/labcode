import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class CryptoJava {

    public static void main(String[] args) {

        String text = "暗号化するメッセージ";

        // ハッシュ
        try {
            cryptoHash(text);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        // 共通鍵暗号方式
        try {
            cryptoSharedKey(text);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 公開鍵暗号方式
        try {
            cryptoPublicKey(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ハッシュ化（一方向性関数）
    public static void cryptoHash(String text) throws NoSuchAlgorithmException {

        // ハッシュ化
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] b = digest.digest(text.getBytes());
        System.out.println(b);

        // ハッシュ値の確認
        MessageDigest testDigest = MessageDigest.getInstance("SHA-256");

        String testText1 = "暗号化するメッセージ";
        System.out.println(Arrays.equals(b, testDigest.digest(testText1.getBytes())));

        String testText2 = "間違ったメッセージ";
        System.out.println(Arrays.equals(b, testDigest.digest(testText2.getBytes())));

    }

    // 共通鍵暗号方式
    public static void cryptoSharedKey(String text) throws Exception {

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        SecretKey secretKey = keyGen.generateKey();

        SecureRandom secureRandom = new SecureRandom();
        byte[] iv = new byte[16];
        secureRandom.nextBytes(iv);
        IvParameterSpec ivParameter = new IvParameterSpec(iv);

        Cipher cryptoCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cryptoCipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameter);

        byte[] encryptoText = cryptoCipher.doFinal(text.getBytes());
        System.out.println(encryptoText);

        Cipher decryptoCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        decryptoCipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameter);

        byte[] decryptoText = decryptoCipher.doFinal(encryptoText);
        System.out.println(new String(decryptoText));
    }

    public static void cryptoPublicKey(String text) throws Exception {

        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048);

        KeyPair keyPair = keyGen.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        Cipher encryptoCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        encryptoCipher.init(Cipher.ENCRYPT_MODE, publicKey);
        
        byte[] encryptoText = encryptoCipher.doFinal(text.getBytes());
        System.out.println(encryptoText);

        Cipher decryptoCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        decryptoCipher.init(Cipher.DECRYPT_MODE, privateKey);

        byte[] decryptoText = decryptoCipher.doFinal(encryptoText);
        System.out.println(new String(decryptoText));
        
    }
}