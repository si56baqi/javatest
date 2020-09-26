package secondday;
/*
* String
* */
public class StringDemo {
    public static void main(String args[]) {
        String s = "www.runoob.com";
        String str1 = "Strings";
        String str2 = "Strings";
        StringBuffer str3 = new StringBuffer("Strings123");
        String str4="123";
        String str5="";
        String str6=" ";
        System.out.println(str4.isEmpty());
        System.out.println(str5.isEmpty());
        System.out.println(str6.isEmpty());
        System.out.println(str3.delete(4,5));
        int re=str1.compareTo(str2);
        //System.out.println(re);
        /*System.out.println(str1.compareTo(str3));
        System.out.println(str3.compareTo(str1));*/

        /*char result = s.charAt(6);
        System.out.println(str1.concat(str3));*/
        //System.out.println(str1.contentEquals(str3));
        System.out.println(str3.append("qqqqqqqqqqqqqq"));
        System.out.println(str3.reverse());
    }
}
