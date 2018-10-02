/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_35_DIFFICULT_UNDO_REDO;

public interface Changeable {
	/**
	 * Undoes an action
	 */
	public void undo();
	/**
	 * Redoes an action
	 */
	public void redo();

}
