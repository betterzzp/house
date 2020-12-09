package cn.zhouzhongping.house.service;

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
				GetMethod getMethod = new GetMethod(spcryUrl);
				httpClient.executeMethod(getMethod);
				// 查看命中情况
				String htmlContent = getMethod.getResponseBodyAsString();
				System.out.println(htmlContent);
				// 释放链接
				getMethod.releaseConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
