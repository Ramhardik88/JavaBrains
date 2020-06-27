package MassProblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidIPString {
    public static void main(String[] args) {
        String s="255.124.12.10";
        System.out.println( isSolution(s));

    }


    private static String  isSolution(String IP) {
        if(IP==null || IP.isEmpty())
            return "neither";
        if(IP.indexOf(".")>=0)
            return validateIPv4(IP);
        if(IP.indexOf(":")>=0)
            return validateIPv6(IP);
        return "neither";
    }

    private static String validateIPv6(String ip) {
        if(ip.charAt(0)==':' || ip.charAt(ip.length()-1)==':')
            return "neither";
        String[] components=ip.split(":");
        if(components.length!=8)
            return "neither";

        for(String comp : components)
        {
            if(comp.isEmpty()|| comp.length()>4)
                return "neither";
            for(char ch:comp.toLowerCase().toCharArray())
            {
                if((ch<'0'|| ch>'9') && ch!='a' && ch!='b' && ch!='c' && ch!='d' && ch!='e' && ch!='f')
                    return "neither";
            }
        }
        return "IPv6";
    }

    private static String validateIPv4(String ip) {
        if(ip.charAt(0)=='.' || ip.charAt(ip.length()-1)=='.')
            return "neither";
        String[] components=ip.split("\\.");

        if(components.length!=4 )
        {
            return "neither";
        }
        for (String comp: components) {
            if(comp.isEmpty() || comp.length() >3 ||  (comp.charAt(0)=='0' && comp.length()>1))
                return "neither";
            for(char ch: comp.toCharArray())
            {
                if(ch<'0' || ch>'9')
                    return "neighter";

            }
            int num=Integer.parseInt(comp);
            if(num<0 || num>255)
                return "neighter";

        }
        return "IPv4";
    }
}
