class Proj2 {
  public static void main(String[] args) {

    upper();
    lower();

  }
  public static void barrier() {

    System.out.println("+------+");

  }
  public static void upper(){

    barrier();
    upperChunk();
    upperChunk();
    barrier();

  }
  public static void upperChunk() {

    for(int q = 2; q>=0; q--) {

      lineTemp("^", q);

    }

  }

  public static void lower(){

    lowerChunk();
    lowerChunk();
    barrier();

  }
  public static void lowerChunk() {

    for(int q2 = 2; q2>=0; q2--) {

      lineTemp("v", q2);

    }

  }
  public static void lineTemp(String charV, int space1) {

    int space2 = (4 - (2 * space1));
    System.out.print("|");
    for(int i = 0; i<=(space1 - 1); i++){

      System.out.print(" ");

    }
    System.out.print(charV);
    for(int ii = 0; ii<=(space2-1);ii++){

      System.out.print(" ");

    }
    System.out.print(charV);
    for(int iii = 0; iii<=(space1 - 1); iii++){

      System.out.print(" ");

    }
    System.out.println("|");

  }
}
