import java.util.Scanner;
class HelloWorld {
    public static void checkDuplicate(String str){
        int count=0;
        char[] ch = str.toCharArray();
        for(int i=0;i<str.length();i++){
            count=1;
            for(int j=i+1;j<str.length();j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j] = 0;
                }
                
            }
            if(count>1 && ch[i]!='0')
                System.out.print(ch[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        checkDuplicate(str);
    }
}