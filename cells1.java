import java.util.*;
class Main{
  public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    int a[]=new int[10];
    int b[]=new int[10];
    a[0]=0;
    a[9]=0;
    for(int i=1;i<9;i++){
      a[i]=s.nextInt();
    }
    int days=s.nextInt();
    for(int j=0;j<days;j++){
      for(int i=1;i<9;i++){
      if(((a[i-1]==0)&&(a[i+1]==0))||((a[i-1]==1)&&(a[i+1]==1))){
      b[i]=0;
    }else{
      b[i]=1;
    }
    }
    //this is for n days
    for(int k=1;k<9;k++){
      a[k]=b[k];
    }
    }
    for(int i=1;i<9;i++){
      System.out.print(b[i]+" ");
    }
    
  }
}
