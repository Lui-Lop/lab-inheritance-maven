package edu.grinnell.csc207.util;

public class BasicCounter implements Counter {
  // Fields
  int count;

  int start;

  // Constructors

  public BasicCounter(int value) {
    count = value;
    start = value;
  }

  /**
   * Adds l to count
   * 
   */
  public void increment() {
    count += 1;
  } // incrment

  /**
   * Resets count to start.
   * 
   */
  public void reset() {
    count = start;
  } // reset

  /**
   * Returns a string of the form "[" + this.count + "]"
   * 
   * @return String
   */
  public String toString() {
    return "[" + this.count + "]";
  } // tostring

  /**
   * which returns the value of count
   * 
   * @param count
   * @return
   */
  public int get() {
    return count;
  } // get

} // Counter
