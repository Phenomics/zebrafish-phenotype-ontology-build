package de.charite.zpgen;

import java.io.BufferedWriter;

/**
 * The visitor interface.
 * 
 * @author Sebastian Köhler
 *
 */
public interface ZFINVisitor {
	/**
	 * This method is called for any entry. Not that the entry is recycled.
	 * 
	 * @param entry
	 * @return
	 */
	boolean visit(ZFINEntry entry, BufferedWriter outPositiveAnnotations, BufferedWriter outNegativeAnnotations);
}
