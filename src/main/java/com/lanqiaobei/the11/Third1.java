package com.lanqiaobei.the11;

//import com.util.Arith;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.extern.slf4j.Slf4j;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/01/14     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/1/14 2:13 PM
 * @since 1.0.0
 */
public class Third1 {
	public static void main(String[] args) {
		BigInteger a = new BigInteger(String.valueOf(2));
		BigInteger b = new BigInteger(String.valueOf(3));

		BigInteger c = new BigInteger(String.valueOf(2));
		BigInteger d = new BigInteger(String.valueOf(3));
		
		for(int i = 1;i<5;i++) {
			BigInteger sign = a;
			a = a.multiply(c).add(b.multiply(d).negate());
			b = b.multiply(c).add(sign.multiply(d));
		}
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("./out1.txt"), true));
			bw.write("\n" + a);
			bw.write("\n" + b);
			bw.flush();
			bw.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println("end");
	}
}