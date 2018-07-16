/*package com.mum.wap.dao;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.security.GeneralSecurityException;

import javax.net.ssl.*;

public class Test {
	private SSLSocketFactory systemDefaultSslSocketFactory(X509TrustManager trustManager) {
		  try {
		    SSLContext sslContext = SSLContext.getInstance("TLS");
		    sslContext.init(null, new TrustManager[] { trustManager }, null);
		    return sslContext.getSocketFactory();
		  } catch (GeneralSecurityException e) {
		    //  assertionError("No System TLS", e); // The system has no TLS. Just give up.
		  }
		  return null;
		}

	public static void test() throws Exception {
		
		try {
		    SSLContext sslContext = SSLContext.getInstance("TLS");
		    sslContext.init(null, new TrustManager[] { trustManager }, null);
		   // return sslContext.getSocketFactory();
		  } catch (GeneralSecurityException e) {
		    //  assertionError("No System TLS", e); // The system has no TLS. Just give up.
		  }
			
		URL myurl = new URL(httpsURL);
		HttpURLConnection con = (HttpURLConnection)myurl.openConnection();
		con.setRequestMethod("GET");
		//con.setRequestProperty("brand", "samsung");
		//con.setRequestProperty("token", "64abed472ad1fb124ef8795557952077f51c538873c2a440");

	//	con.setRequestProperty("Content-length", String.valueOf(query.length())); 
		con.setRequestProperty("Content-Type","application/x-www-form-urlencoded"); 
		con.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0;Windows98;DigExt)"); 
		con.setDoOutput(true); 
		con.setDoInput(true); 
		System.out.println("Resp Code:"+con .getResponseCode()); 

		DataOutputStream output = new DataOutputStream(con.getOutputStream());  


		output.writeBytes(query);

		output.close();

		DataInputStream input = new DataInputStream( con.getInputStream() ); 



		for( int c = input.read(); c != -1; c = input.read() ) 
		System.out.print( (char)c ); 
		input.close(); 

		System.out.println("Resp Code:"+con .getResponseCode()); 
		System.out.println("Resp Message:"+ con .getResponseMessage()); 
		
		
		
		
		
		
		
		
		
		
		
		Https
		URL url = new URL("https://fonoapi.freshpixl.com/v1/getlatest");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setAllowUserInteraction(true);
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("brand", "samsung");
		conn.setRequestProperty("token", "64abed472ad1fb124ef8795557952077f51c538873c2a440");
		conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

		//String input = "{\"brand\":samsung}";

		//OutputStream os = conn.getOutputStream();
		//getClass().os.write(input.getBytes());
		//os.flush();

		if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
			throw new RuntimeException("Failed : HTTP error code : "
				+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();
	}
	public static void main(String[] args) {
		X509TrustManager trustManager;
		  SSLSocketFactory sslSocketFactory;
		  try {
		    trustManager = trustManagerForCertificates(trustedCertificatesInputStream());
		    SSLContext sslContext = SSLContext.getInstance("TLS");
		    sslContext.init(null, new TrustManager[] { trustManager }, null);
		    sslSocketFactory = sslContext.getSocketFactory();
		  } catch (GeneralSecurityException e) {
		    throw new RuntimeException(e);
		  }

		  client = new OkHttpClient.Builder()
		      .sslSocketFactory(sslSocketFactory, trustManager)
		      .build();
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
*/