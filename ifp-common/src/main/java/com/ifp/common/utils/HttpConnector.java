package com.ifp.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.ifp.common.constant.Constant;


public class HttpConnector {
	private static PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();

	private static CloseableHttpClient httpClient = null;

	static {
		connectionManager.setMaxTotal(1000);
		connectionManager.setDefaultMaxPerRoute(200);
		if (httpClient == null) {
			RequestConfig requestConfig = RequestConfig.custom()
					.setConnectTimeout(600000)
					.setConnectionRequestTimeout(10000)
					.setSocketTimeout(600000)
					.build();
			httpClient = HttpClients.custom()
					.setDefaultRequestConfig(requestConfig)
					.setConnectionManager(connectionManager)
					.setRetryHandler(new DefaultHttpRequestRetryHandler(0, false))
					.build();
		}
	}

	/**
	 * 
	 * @param url
	 * @param encoding
	 * @return
	 */
	public static String sendGetRequest(String url, String encoding) {
		HttpGet httpGet = new HttpGet(url);
		CloseableHttpResponse response = null;
		try {
			response = httpClient.execute(httpGet);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		int status = response.getStatusLine().getStatusCode();
		String result = null;
		try {
			if (200 == status) {
				result = EntityUtils.toString(response.getEntity(), encoding);
				EntityUtils.consume(response.getEntity());
			}
			response.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			httpGet.releaseConnection();
		}
		return result;
	}

	/**
	 * 
	 * @param url
	 * @param encoding
	 * @return
	 */
	public static Map<String, String> sendGetWithHeader(String url, String encoding, Map<String, String> requestHeader) {
		HttpGet httpGet = new HttpGet(url);
		CloseableHttpResponse response = null;
		if (requestHeader != null && requestHeader.size()>0) {
			for(Entry<String, String> entry : requestHeader.entrySet()) {
				httpGet.addHeader(entry.getKey(), entry.getValue());
			}
		}
		try {
			response = httpClient.execute(httpGet);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		int status = response.getStatusLine().getStatusCode();
		Map<String, String> result = new HashMap<String, String>();
		try {
			Header[] headers = response.getAllHeaders();
			if (headers != null) {
				for (Header header : headers) {
					result.put(header.getName(), header.getValue());
				}
			}
			if (200 == status) {
				String result_data = EntityUtils.toString(response.getEntity(), encoding);
				EntityUtils.consume(response.getEntity());
				result.put(Constant.RESULT_DATA, result_data);
			}
			response.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			httpGet.releaseConnection();
		}
		return result;
	}

	/**
	 * .发送post请求
	 * 
	 * @param url
	 * @param encoding
	 * @param msg
	 * @return
	 */
	public static String sendPostRequest(String url, String encoding, Map<String, String> param) {
		HttpPost httpPost = new HttpPost(url);
		CloseableHttpResponse response = null;
		String msg = "";
		if (param != null) {
			List<NameValuePair> paramList = new ArrayList<NameValuePair>();
			for (Map.Entry<String, String> entry : param.entrySet()) {
				paramList.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
			}
			// AbstractHttpEntity is not thread-safe
			msg = URLEncodedUtils.format(paramList, encoding != null ? encoding : Consts.UTF_8.name());
		}
		try {
			StringEntity stringEntity = new StringEntity(msg, ContentType.create(URLEncodedUtils.CONTENT_TYPE, Charset.forName(encoding)));
			httpPost.setEntity(stringEntity);
			response = httpClient.execute(httpPost);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		int status = response.getStatusLine().getStatusCode();
		String result = null;
		try {
			if (200 == status) {
				result = EntityUtils.toString(response.getEntity(), encoding);
				EntityUtils.consume(response.getEntity());
			}
			response.close();
		} catch (Exception  e) {
			e.printStackTrace();
		} finally {
			httpPost.releaseConnection();
		}
		return result;
	}

	/**
	 * .发送post请求
	 * 
	 * @param url
	 * @param encoding
	 * @param msg
	 * @return
	 */
	public static String sendPostRequest(String url, String encoding, String msg) {
		HttpPost httpPost = new HttpPost(url);
		httpPost.addHeader("Content-Type", "application/json");
		CloseableHttpResponse response = null;
		StringEntity stringEntity = new StringEntity(msg, encoding);
		stringEntity.setContentType("text/json");
		stringEntity.setContentEncoding(new BasicHeader("Content-Type", "application/json"));
		try {
			httpPost.setEntity(stringEntity);
			response = httpClient.execute(httpPost);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		int status = response.getStatusLine().getStatusCode();
		String result = null;
		try {
			if (200 == status) {
				result = EntityUtils.toString(response.getEntity(), encoding);
				EntityUtils.consume(response.getEntity());
			}
			response.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			httpPost.releaseConnection();
		}
		return result;
	}
	

	/**
	 * .以post请求方式发送json数据
	 * 
	 * @param url
	 * @param encoding
	 * @param msg
	 * @return
	 */
	public static String sendPostJsonRequest(String url, String encoding, String json) {
		HttpPost httpPost = new HttpPost(url);
		httpPost.addHeader("Content-Type", "application/json");
		CloseableHttpResponse response = null;
		StringEntity stringEntity = new StringEntity(json, encoding);
		stringEntity.setContentType("text/json");
		stringEntity.setContentEncoding(new BasicHeader("Content-Type", "application/json"));
		try {
			httpPost.setEntity(stringEntity);
			response = httpClient.execute(httpPost);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		int status = response.getStatusLine().getStatusCode();
		String result = null;
		try {
			if (200 == status) {
				result = EntityUtils.toString(response.getEntity(), encoding);
				EntityUtils.consume(response.getEntity());
			}
			response.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			httpPost.releaseConnection();
		}
		return result;
	}
	
	
	
	/**
	 * <p>Title: sendPostRequestToNetease</p>
	 * <p>发送请求至网易云信</p>
	 * @param url
	 * @param encoding
	 * @param json
	 * @return
	 * @author wxy  2018年12月13日 上午10:29:19
	 */
	public static String sendPostRequestToNetease(String url, String encoding,String json, Map<String, String> param, Map<String, String> paramBody) {
        HttpPost httpPost = new HttpPost(url);
        for (Map.Entry<String, String> entry : param.entrySet()) {
        	httpPost.addHeader(entry.getKey(), entry.getValue());
		}
        
        if (paramBody != null) {
			List<NameValuePair> paramList = new ArrayList<NameValuePair>();
			for (Map.Entry<String, String> entry : paramBody.entrySet()) {
				paramList.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
			}
			json = URLEncodedUtils.format(paramList, encoding != null ? encoding : Consts.UTF_8.name());
		}
		CloseableHttpResponse response = null;
		try {
			StringEntity stringEntity = new StringEntity(json, ContentType.create(URLEncodedUtils.CONTENT_TYPE, Charset.forName(encoding)));
			httpPost.setEntity(stringEntity);
			response = httpClient.execute(httpPost);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		int status = response.getStatusLine().getStatusCode();
		String result = null;
		try {
			if (200 == status) {
				result = EntityUtils.toString(response.getEntity(), encoding);
				EntityUtils.consume(response.getEntity());
			}
			response.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			httpPost.releaseConnection();
		}
		return result;
		
	}

	/**
	 * .以post请求方式发送json数据
	 * 
	 * @param url
	 * @param encoding
	 * @param msg
	 * @return
	 */
	public static Map<String, String> sendPostWithHeader(String url, String encoding, String content, Map<String, String> requestHeader,
			boolean isJson) {
		HttpPost httpPost = new HttpPost(url);
		CloseableHttpResponse response = null;
		StringEntity stringEntity = new StringEntity(content, encoding);
		if (isJson) {
			httpPost.addHeader("Content-Type", "application/json");
			stringEntity.setContentType("text/json");
			stringEntity.setContentEncoding(new BasicHeader("Content-Type", "application/json"));
		}
		if (requestHeader != null && requestHeader.size() > 0) {
			for (Entry<String, String> enrty : requestHeader.entrySet()) {
				httpPost.addHeader(enrty.getKey(), enrty.getValue());
			}
		}
		try {
			httpPost.setEntity(stringEntity);
			response = httpClient.execute(httpPost);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		int status = response.getStatusLine().getStatusCode();
		Map<String, String> result = new HashMap<String, String>();
		try {
			Header[] headers = response.getAllHeaders();
			if (headers != null) {
				for (Header header : headers) {
					result.put(header.getName(), header.getValue());
				}
			}
			if (200 == status) {
				String result_data = EntityUtils.toString(response.getEntity(), encoding);
				EntityUtils.consume(response.getEntity());
				result.put(Constant.RESULT_DATA, result_data);
			}
			response.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			httpPost.releaseConnection();
		}
		return result;
	}

    public static byte[] download(String urlStr) {
        HttpURLConnection conn = null;
        try {
            //new一个URL对象
            URL url = new URL(urlStr);
            //打开链接
            conn = (HttpURLConnection) url.openConnection();
            //设置请求方式为"GET"
            conn.setRequestMethod("GET");
            //超时响应时间为10秒
            conn.setConnectTimeout(10 * 1000);
            conn.setDoInput(true);
            //通过输入流获取数据
            InputStream inStream = conn.getInputStream();
            //得到二进制数据，以二进制封装得到数据，具有通用性
            byte[] data = readInputStream(inStream);
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
        return null;
    }

    private static byte[] readInputStream(InputStream inStream) {
        if (inStream == null) {
            return null;
        }
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        try {
            //创建一个Buffer字符串
            byte[] buffer = new byte[1024];
            //每次读取的字符串长度，如果为-1，代表全部读取完毕
            int len = 0;
            //使用一个输入流从buffer里把数据读取出来
            while ((len = inStream.read(buffer)) != -1) {
                //用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度
                outStream.write(buffer, 0, len);
            }
            //关闭输入流
            inStream.close();
            //把outStream里的数据写入内存
            return outStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                outStream.flush();
                outStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    
    public static String post(String url, String json) {
		String result = "";
		CloseableHttpClient client = HttpClientBuilder.create().build(); // 1.创建httpclient对象
		HttpPost post = new HttpPost(url); // 2.通过url创建post方法
		try {
			StringEntity entity = new StringEntity(json,"UTF-8"); // 3.将传入的json封装成实体，并压入post方法
			entity.setContentEncoding("UTF-8");
			entity.setContentType("application/json");// 发送json数据需要设置contentType
			post.setEntity(entity);
			CloseableHttpResponse response = client.execute(post); // 4.执行post方法，返回HttpResponse的对象
			result = EntityUtils.toString(response.getEntity(), "UTF-8");
//			if (response.getStatusLine().getStatusCode() == 200) {
//				result = EntityUtils.toString(response.getEntity(), "UTF-8"); // 5.如果返回结果状态码为200，则读取响应实体response对象的实体内容，并封装成String对象返回
//			}
			try {
				HttpEntity e = response.getEntity(); // 6.关闭资源
				if (e != null) {
					InputStream instream = e.getContent();
					instream.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				response.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
    
    /**
     * application/json
     * @param url
     * @return
     */
    public static String get(String url) {
    	 //创建一个httpclient对象
        CloseableHttpClient client = HttpClientBuilder.create().build();
        String resStr = "";
		try {
			 //创建URIBuilder
	        URIBuilder uri = new URIBuilder(url);
	        //创建httpGet对象
	        HttpGet hg = new HttpGet(uri.build());
	        //设置请求的报文头部的编码
	        hg.setHeader(new BasicHeader("Content-Type", "application/json"));
	        //请求服务
	        CloseableHttpResponse response = client.execute(hg);
	        //获取返回实例entity
            HttpEntity entity = response.getEntity();
            //通过EntityUtils的一个工具方法获取返回内容
            resStr = EntityUtils.toString(entity, "utf-8");
            //关闭response和client
            response.close();
            //输出
            System.out.println("请求成功,请求返回内容为: " + resStr);
            client.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return resStr;
	}

}
