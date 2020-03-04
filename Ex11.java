import Java.util.*;
class ex11 {
  public static void main(String[] args) {
   
  }
  public static ArrayList<String> stutter(ArrayList<String> Arr, int k){
    ArrayList<String> stutter = new ArrayList<String>();
    for(String s : Arr){
      for(int i = 0; i < k; i++){
        stutter.add(s);
      }
    }
    return stutter;
  }
}
