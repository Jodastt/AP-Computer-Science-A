import Java.util.*;
class ex7 {
  public static void main(String[] args) {
   
  }
  public static ArrayList<String> removeDuplicates(ArrayList<String> Arr){
    ArrayList<String> unique = new ArrayList<String>();
    for(String s : Arr){
      if(!unique.contains(s)) unique.add(s);
    }
    return unique;
  }
}
