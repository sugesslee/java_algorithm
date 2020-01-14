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
public class Third {

	public static void main(String[] args) throws IOException {
		List<String> resultList = new ArrayList<>();
		String path = "/root/workspace/program/out.txt";
		Third third = new Third();
		Complex result = third.mul(new Complex(new BigInteger(String.valueOf(2)), new BigInteger(String.valueOf(3))),
				new Complex(new BigInteger(String.valueOf(2)), new BigInteger(String.valueOf(3))));

		for (int i = 3; i <= 123454; i++) {
			result = third
					.mul(result, new Complex(new BigInteger(String.valueOf(2)), new BigInteger(String.valueOf(3))));
//			System.out.println("the " + i + ", result " + result.toString());
			resultList.add("the " + i + ", result " + result.toString());
		}
//		System.out.println("result " + result.toString());
		resultList.add("result " + result.toString());

		writeFile(path, resultList);
	}

	private static void writeFile(String pathName, List<String> resultList) throws IOException {
		/* 写入Txt文件 */
		File path = new File(pathName); // 相对路径，如果没有则要建立一个新的output。txt文件
		path.createNewFile(); // 创建新文件
		BufferedWriter out = new BufferedWriter(new FileWriter(pathName));
		out.write(resultList.toString()); // \r\n即为换行
		out.flush(); // 把缓存区内容压入文件
		out.close(); // 最后记得关闭文件
	}

	public Complex mul(Complex complex1, Complex complex2) {
		BigInteger real1 = complex1.getReal();
		BigInteger image1 = complex1.getImage();
		BigInteger real2 = complex2.getReal();
		BigInteger image2 = complex2.getImage();
		BigInteger newReal = real1.multiply(real2).subtract(image1.multiply(image2));
		BigInteger newImage = real1.multiply(image2).add(real2.multiply(image1));

		return new Complex(newReal, newImage);
	}

	public static class Complex {

		BigInteger real;
		BigInteger image;

		public Complex(BigInteger real, BigInteger image) {
			this.real = real;
			this.image = image;
		}


		public BigInteger getReal() {
			return real;
		}

		public void setReal(BigInteger real) {
			this.real = real;
		}

		public BigInteger getImage() {
			return image;
		}

		public void setImage(BigInteger image) {
			this.image = image;
		}

		@Override
		public String toString() {
			return "Complex{" +
					"real=" + real +
					", image=" + image +
					'}';
		}
	}
}