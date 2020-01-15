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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		String path = "./out.txt";
		BigInteger a = new BigInteger(String.valueOf(2));
		BigInteger b = new BigInteger(String.valueOf(3));
		BigInteger c = new BigInteger(String.valueOf(2));
		BigInteger d = new BigInteger(String.valueOf(3));

//		a = a.multiply(c).add(b.multiply(d).negate());
//		b = new BigInteger(String.valueOf(2)).multiply(d).add(b.multiply(c));

		Map<String, BigInteger> tempResult = mul(a, b, c, d);
		a = tempResult.get("real");
		b = tempResult.get("image");
		for (int i = 3; i <= 123456; i++) {
			Map<String, BigInteger> tempResult1 = mul(a, b, c, d);
			a = tempResult1.get("real");
			b = tempResult1.get("image");
		}
		resultList.add("\n a " + a.toString());
		resultList.add("\n b " + b.toString() + "\n");
		writeFile(path, resultList);
		System.out.println("end");
	}

	private static void writeFile(String pathName, List<String> resultList) throws IOException {
		/* 写入txt文件 */
		File path = new File(pathName); // 相对路径，如果没有则要建立一个新的output.txt文件
		path.createNewFile(); // 创建新文件
		BufferedWriter out = new BufferedWriter(new FileWriter(pathName));
		out.write(resultList.toString()); // \r\n即为换行
		out.flush(); // 把缓存区内容压入文件
		out.close(); // 最后记得关闭文件
	}

	private static Map<String, BigInteger> mul(BigInteger a, BigInteger b, BigInteger c, BigInteger d) {
		Map<String, BigInteger> result = new HashMap<>();

		BigInteger real = a.multiply(c).add(b.multiply(d).negate());
		BigInteger image = a.multiply(d).add(b.multiply(c));

		result.put("real", real);
		result.put("image", image);

		return result;
	}
}