package com.itheima.crm.utils;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.UUID;

import javax.management.RuntimeErrorException;

import edu.emory.mathcs.backport.java.util.Arrays;

public class MyStringUtils {
	/**
	 * ���md5���ܺ������
	 * @author:nottellyou
	 * @param:@param value
	 * @param:@return
	 * @return:String
	 */
	public static String getMD5Value(String value){
		
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			byte[] md5ValueByteArray = messageDigest.digest(value.getBytes());
			BigInteger bigInteger = new BigInteger(1,md5ValueByteArray);
//			System.out.println(Arrays.toString(md5ValueByteArray));
			return bigInteger.toString(16);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
			//return value;
		}
	}

	//���һ��32���ȵ�UUIDֵ
	public static String getUUID(){
		return UUID.randomUUID().toString().replace("-", "");
	}
	
}