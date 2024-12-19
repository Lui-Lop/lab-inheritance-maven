package edu.grinnell.csc207.util;


/**
 * Create a basic counter class to count things
 * 
 * @author Luis Lopez
 * @author Mitch Paiva
 */
public class BasicCounter implements Counter {
  // Fields
  int count;

  int start;

  // Constructors

  public BasicCounter(int value) {
    this.count = value;
    this.start = value;
  }

  /**
   * Adds l to count
   * 
   */
  public void increment() {
    this.count += 1;
  } // incrment

  /**
   * Resets count to start.
   * 
   */
  public void reset() {
    this.count = start;
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
   * @return
   */
  public int get() {
    return this.count;
  } // get

} // Counter
