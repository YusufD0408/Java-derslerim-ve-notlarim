package day27_stringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 =new StringBuilder();
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        sb1.append("Mustafa");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

        sb1.append(" Yilmazturk");
        System.out.println(sb1);
        System.out.println(sb1.capacity()); // 2* eski kapasite +2 = 34
        System.out.println(sb1.length());// 18

        sb1.append(" javayi cok sever, sabah aksam java calisir.");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

        System.out.println("****************");

        // 2. yontem
        StringBuilder sb2 = new StringBuilder("Java candir");
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        System.out.println("****************");

        // 3 yontem
        StringBuilder sb3 =new StringBuilder(11);
        sb3.append("20744271579");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());

        sb3.append(" : Tc No");
        System.out.println(sb3);
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());

        String str ="Java Candir";
        sb3.append(str,4,str.length());
        System.out.println(sb3);

        // trim
        sb3.trimToSize();
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());



    }
}
