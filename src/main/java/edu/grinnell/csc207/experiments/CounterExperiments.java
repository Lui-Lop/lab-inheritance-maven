package edu.grinnell.csc207.experiments;

// import edu.grinnell.csc207.util.Counter;
// import edu.grinnell.csc207.util.BasicCounter;

import java.io.PrintWriter;
import edu.grinnell.csc207.util.BasicCounter;
import edu.grinnell.csc207.util.Counter;
import edu.grinnell.csc207.util.DecrementableCounter;

/**
 * Some experiments as we explore our various Counter classes.
 */
public class CounterExperiments {
  /**
   * Run our experiments.
   *
   * @param args The command-line arguments. Ignored.
   */
  public static void main(String[] args) throws Exception {
    // Set up output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Set up some counters
    Counter alpha = new BasicCounter(0);
    Counter beta = new BasicCounter(123);
    Counter gamma = new BasicCounter(-5);
    DecrementableCounter delta = new DecrementableCounter(0);

    // Print original values
    pen.println("Original alpha = " + alpha);
    pen.println("Original beta = " + beta);
    pen.println("Original gamma = " + gamma);
    pen.println("Original delta = " + delta);

    // Print incremented values
    alpha.increment();
    beta.increment();
    gamma.increment();
    delta.increment();
    delta.increment();

    pen.println("Updated alpha = " + alpha);
    pen.println("Updated beta = " + beta);
    pen.println("Updated gamma = " + gamma);
    pen.println("Updated delta = " + delta);

    delta.decrement();
    pen.println("Updated delta = " + delta);

    delta.reset();
    pen.println("Updated delta = " + delta);

    // And we're done
    pen.close();
  } // main(String[])
} // class CounterExperiments
