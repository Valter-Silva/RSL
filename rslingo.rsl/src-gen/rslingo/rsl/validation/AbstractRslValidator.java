/*
 * generated by Xtext
 */
package rslingo.rsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractRslValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(rslingo.rsl.rsl.RslPackage.eINSTANCE);
		return result;
	}
}