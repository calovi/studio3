/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license-epl.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.editor.common.contentassist;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

public interface ICommonContentAssistProcessor
{
	/**
	 * computeCompletionProposals
	 * 
	 * @param viewer
	 * @param offset
	 * @param activationChar
	 * @param autoActivated
	 * @return
	 */
	ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset, char activationChar, boolean autoActivated);
	
	/**
	 * Is the current position a valid identifier?
	 * @param c
	 * @param keyCode
	 * @param document
	 * @param offset
	 * @return
	 */
	boolean isValidAssistLocation(char c, int keyCode, IDocument document, int offset);
}
