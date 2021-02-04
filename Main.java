class Main {
  public static void main(String[] args) {
    // boolean determines whether is it sunny or not
    boolean isSunny = true;
    if (isSunny) {
      System.out.println("Lets go to the beach");
    } else {
      System.out.println("Lets stay home");
    }
    System.out.println(getStudent(24, 4));
  }

  // getStudent calculates the new number of students
  static int getStudent(int currentStudent, int newStudent) {
    int age = currentStudent + newStudent;
    return age;
  }

}