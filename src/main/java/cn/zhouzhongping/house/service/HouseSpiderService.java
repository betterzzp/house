package cn.zhouzhongping.house.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.springframework.stereotype.Service;

@Service
public class HouseSpiderService {
	public static String url = "https://km.anjuke.com/sale/p1/#filtersort";

	public void spiderAnjuke() {
		int i = 1;
		while (true) {
			i++;
			try {
				HttpClient httpClient = new HttpClient();
				String spcryUrl = url + "/p" + i + "/#filtersort";
				// 创建一个get（）方法 类似于在浏览器输入地址
				URL url = new URL(spcryUrl);
				HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
				
				conn.setRequestMethod("GET");
				conn.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
				
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
				
				String msg = null;
				
				StringBuffer sb = new StringBuffer();
				
				while(null != (msg = br.readLine())) {
					sb.append(msg);
				}
				System.out.println(sb);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
