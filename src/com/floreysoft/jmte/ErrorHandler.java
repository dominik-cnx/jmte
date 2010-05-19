package com.floreysoft.jmte;

/**
 * Interface used to handle errors while expanding a template. This interface is
 * called by the {@link Engine} and by the {@link Lexer}.
 * 
 * @see Engine
 * @see Lexer
 */
public interface ErrorHandler {
	/**
	 * Handles an error while interpreting a template in an appropriate way.
	 * This might contain logging the error or even throwing an exception.
	 * 
	 * @param message
	 *            the detailed error message
	 * @param template
	 *            the complete string template
	 * @param start
	 *            the position in the complete template where the script section
	 *            to be parsed <em>starts</em>
	 * @param end
	 *            the position in the complete template where the script section
	 *            to be parsed <em>ends</em>
	 */
	public void error(String message, char[] template, int start, int end);
}
