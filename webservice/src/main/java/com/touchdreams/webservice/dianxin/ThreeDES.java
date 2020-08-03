package com.touchdreams.webservice.dianxin;

/*
�ַ��� DESede(3DES) ����
*/
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class ThreeDES{

    private static final String Algorithm = "DESede"; //���� �����㷨,���� DES,DESede,Blowfish
    
    //keybyteΪ������Կ������Ϊ24�ֽ�
    //srcΪ�����ܵ����ݻ�������Դ��
    public static byte[] encryptMode(byte[] keybyte, byte[] src) {
       try {
            //������Կ
            SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);

            //����
            Cipher c1 = Cipher.getInstance(Algorithm);
            c1.init(Cipher.ENCRYPT_MODE, deskey);
            return c1.doFinal(src);
        } catch (java.security.NoSuchAlgorithmException e1) {
            e1.printStackTrace();
        } catch (javax.crypto.NoSuchPaddingException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return null;
    }

    //keybyteΪ������Կ������Ϊ24�ֽ�
    //srcΪ���ܺ�Ļ�����
    public static byte[] decryptMode(byte[] keybyte, byte[] src) {      
	try {
            //������Կ
            SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);

            //����
            Cipher c1 = Cipher.getInstance(Algorithm);
            c1.init(Cipher.DECRYPT_MODE, deskey);
            return c1.doFinal(src);
        } catch (java.security.NoSuchAlgorithmException e1) {
            e1.printStackTrace();
        } catch (javax.crypto.NoSuchPaddingException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return null;
    }

    //ת����ʮ�������ַ���
    public static String byte2hex(byte[] b) {
        String hs="";
        String stmp="";

        for (int n=0;n<b.length;n++) {
            stmp=(Integer.toHexString(b[n] & 0XFF));
            if (stmp.length()==1) hs=hs+"0"+stmp;
            else hs=hs+stmp;
        }
        return hs.toUpperCase();
    }
    
//  ��16�����ַ���ת�����ֽ���
    public static byte[] hex2byte(String hex) {
      byte[] bts = new byte[hex.length() / 2];
      for (int i = 0; i < bts.length; i++) {
         bts[i] = (byte) Integer.parseInt(hex.substring(2*i, 2*i+2), 16);
      }
      return bts; 
    }  
    
}

