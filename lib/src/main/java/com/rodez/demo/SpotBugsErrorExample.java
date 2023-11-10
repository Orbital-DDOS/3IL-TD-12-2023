package com.rodez.demo;

/**
 * The SpotBugsErrorExample class is a demonstration of a code snippet that may
 * raise a SpotBugs warning. This example illustrates a potential issue that
 * SpotBugs can identify during static analysis.
 */
public class SpotBugsErrorExample {

  /** The name attribute of the SpotBugsErrorExample object. */
  private String name;

  /**
   * Constructs a SpotBugsErrorExample object with the specified name.
   *
   * @param name The name of the SpotBugsErrorExample object.
   */
  public SpotBugsErrorExample(String name) {
    this.name = name;
  }

  /**
   * The main method demonstrates the potential SpotBugs warning.
   *
   * @param args The command-line arguments (not used in this example).
   */
  public static void main(String[] args) {
    SpotBugsErrorExample obj1 = new SpotBugsErrorExample("Hello");
    SpotBugsErrorExample obj2 = null;

    // This may raise a potential null dereference warning in SpotBugs
    if (obj1.equals(obj2)) {
      System.out.println("Objects are equal");
    } else {
      System.out.println("Objects are not equal");
    }
  }

  /**
   * Compares the name attribute of this object with another object.
   *
   * @param obj The object to compare with.
   * @return True if the names are equal, false otherwise.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    SpotBugsErrorExample that = (SpotBugsErrorExample) obj;
    return name.equals(that.name);
  }

  /**
   * Calculates the hash code for this object.
   *
   * @return The hash code.
   */
  @Override
  public int hashCode() {
    return name.hashCode();
  }
}
