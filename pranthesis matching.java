import java.util.*;
class Main{
  public static void main(String []args){
    //try the input (()()()))
    Scanner s=new Scanner(System.in);
    String a=s.next();
    int len=a.length();
    int count=0;
    char arr[]=a.toCharArray();
    for(int i=0;i<len;i++){
      if(arr[i]!='*'){
        if(arr[i]==')'){
          for(int j=i;j>=0;j--){
            if(arr[j]=='('){
              arr[i]='*';
              arr[j]='*';
              count++;
              break;
            }
          }
        }
      }
    }
    System.out.println(count);
    //if they asked to count the non matching parnthesis
    int count1=0;
    for(int i=0;i<len;i++){
    if((arr[i]==')')||(arr[i]=='(')){
      count1++;
    }
    }
    System.out.print(count1);
  }
}