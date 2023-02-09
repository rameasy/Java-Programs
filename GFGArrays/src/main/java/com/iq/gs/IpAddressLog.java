package com.iq.gs;

import java.util.HashMap;
import java.util.Map;

/*Given a log file, return IP address(es) which accesses the site most often.
e.g: "10.0.0.1 - log entry 1 11", "10.0.0.1 - log entry 2 213", "10.0.0.2 - log entry 1 11", "10.0.0.2 - log entry 2 213", "10.0.0.2 - log entry 133132"
Ans: 10.0.0.1*/
public class IpAddressLog {
	public static String findIP(String[] str) {
	    HashMap<String, Integer> map = new HashMap<>();
	        for(String s: str){
	          String[] ip = s.split(" ");
	          if(map.containsKey(ip[0])){
	              map.put(ip[0],map.get(ip[0])+1);
	          }else{
	              map.put(ip[0],1);
	          }
	        }
	        String maxIP = "";
	        int count = 0;
	        for(Map.Entry<String, Integer> entry: map.entrySet()){
	            if(entry.getValue()>count){
	              maxIP = entry.getKey();
	              count = entry.getValue();
	            }
	        }
	        return maxIP;
	    }


	  public static boolean check()
	  {
	    boolean result = true;
	    result &= findIP(new String[]{"10.0.0.1 - log entry 1 11", "10.0.0.1 - log entry 2 213", "10.0.0.1 - log entry 1 11", "10.0.0.1 - log entry 2 213", "10.0.0.2 - log entry 133132"}).equals("10.0.0.1");
	    result &= findIP(new String[]{"10.0.0.1 - log entry 1 11", "10.0.0.1 - log entry 2 213", "10.0.0.2 - log entry 1 11", "10.0.0.2 - log entry 2 213", "10.0.0.2 - log entry 133132"}).equals("10.0.0.2");
	    result &= findIP(new String[]{"10.0.0.4 - log entry 1 11"}).equals("10.0.0.4");
	    result &= findIP(new String[]{""}).equals("");
	    return result;
	  }


	  public static void main(String[] args) {
	    if (check())
	        System.out.println("All test cases passed!");
	       else
	        System.out.println("At least one test case did not pass");    
	}
}
