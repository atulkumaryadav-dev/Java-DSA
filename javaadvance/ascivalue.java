public class ascivalue {
    public static void main(String[] args) {
        
        char c = 'a';
        int x = c;  //implicit typecasting.........
        System.out.println(x);

        char ch = 'A';
      // int y = (int)ch; explicit typecasting.......
        System.out.println((int)ch);
        System.out.println(ch+0);
        System.out.println(ch*1);

        int a = 90;
        System.out.println((char)a);
       
    }
    
}
