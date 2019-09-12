class Main {
  public static void main(String[] args) {
    
    song();

  }
  public static void song() {

    fly();
    spider();
    bird();
    cat();
    dog();
    horse();

  }

  public static void fly() {

    lineOne("fly");
    lastTwoLines();

  }

  public static void spider() {

    lineOne("spider");
    System.out.println("That wriggled and iggled and jiggled inside her.");
    repeatingReasons("spider","fly");
    lastTwoLines();

  }

  public static void bird() {

    lineOne("bird");
    System.out.println("How absurd to swallow a bird.");
    repeatingReasons("bird","spider");
    repeatingReasons("spider","fly");
    lastTwoLines();
  
  }

  public static void cat() {

    lineOne("bird");
    System.out.println("Imagine that to swallow a cat.");
    repeatingReasons("cat","bird"); 
    repeatingReasons("bird","spider");
    repeatingReasons("spider","fly");
    lastTwoLines();

  }

  public static void dog() {

    lineOne("dog");
    System.out.println("What a hog to swallow a dog."); 
    repeatingReasons("dog","cat"); 
    repeatingReasons("cat","bird"); 
    repeatingReasons("bird","spider");
    repeatingReasons("spider","fly");
    lastTwoLines();


  }

  public static void horse() {

    lineOne("horse");
    System.out.println("She died of course.");

  }

  public static void repeatingReasons(String animal1, String animal2){
  
    System.out.println("She swallowed the " + animal1 + " to catch the " + animal2 + ",");

  }

  public static void lineOne(String animal){

    System.out.println("There was an old lady who swallowed a " + animal + ",");

  }

  public static void lastTwoLines() {

    System.out.println("I don't know why she swallowed that fly, \nPerhaps she'll die.\n");

  }
}
