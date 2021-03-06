// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mxmodelreflection.actions;

import mxmodelreflection.TokenReplacer;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Search the parameter text for the token fromt the parameter TokenObject, replace the value with a value from the parameter ValueObject.
 */
public class ReplaceToken extends CustomJavaAction<String>
{
	private IMendixObject __TokenObject;
	private mxmodelreflection.proxies.Token TokenObject;
	private IMendixObject ValueObject;
	private String Text;

	public ReplaceToken(IContext context, IMendixObject TokenObject, IMendixObject ValueObject, String Text)
	{
		super(context);
		this.__TokenObject = TokenObject;
		this.ValueObject = ValueObject;
		this.Text = Text;
	}

	@Override
	public String executeAction() throws Exception
	{
		this.TokenObject = __TokenObject == null ? null : mxmodelreflection.proxies.Token.initialize(getContext(), __TokenObject);

		// BEGIN USER CODE
		return TokenReplacer.replaceToken(this.getContext(), this.Text, this.__TokenObject, this.ValueObject);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "ReplaceToken";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
