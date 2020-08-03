package com.touchdreams.webservice.dianxin;

/**
 * 
 * <b>��Ŀ���ƣ�</b>beta2_ecp_appcore<br>
 * <b>�����ƣ�</b>com.doone.ssp.app.unite.mall.common.util.EThreeDES.java<br>
 * <b>��������</b>�Ż�ȯ���ܽ���<br>
 * <b>�����ˣ�</b>������<br>
 * <b>����ʱ�䣺</b>2013-2013-4-23-����9:35:55<br>
 * <b>@Copyright:</b>2013-�¶����Ƽ�
 *
 */

public class EThreeDES {

	private static final String key_VALUE = "A314BA5A3C85E86KK887WSWS";

	/**����*/
	public static String getEncoder(String scanProNum) {
		return ThreeDES.byte2hex(ThreeDES.encryptMode(key_VALUE.getBytes(), scanProNum.getBytes()));
	}

	/**����*/
	public static String getDecoder(String coder) {
		byte[] decryptBytes = ThreeDES.decryptMode(key_VALUE.getBytes(), ThreeDES.hex2byte(coder));
		String str = new String(decryptBytes);
		return str;
	}
}


